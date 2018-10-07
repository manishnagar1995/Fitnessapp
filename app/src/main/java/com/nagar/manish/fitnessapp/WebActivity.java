package com.nagar.manish.fitnessapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebActivity extends AppCompatActivity {
    ProgressBar p;
    String S;
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_web);

//default toolbarbutton
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        p = (ProgressBar) findViewById(R.id.progressbar);
        w = (WebView) findViewById(R.id.webview);

       SecondFragment sec=new SecondFragment();
        FourthFragment fs=new FourthFragment();
       ThirdFragment td= new ThirdFragment();
       FiifthFragment fv=new FiifthFragment();

        switch (sec.k)
        {
            case 10:
                sec.k=15;
                S="https://www.helpguide.org/articles/diets/the-diabetes-diet.htm";
                break;
        }

        switch (fs.b)
        {
            case 9:
                fs.b=15;
                S="http://www.stylecraze.com/articles/home-remedies-to-cure-mouth-ulcers/#gref";
                break;
            case 10:
                fs.b=15;
                S="https://www.medicinenet.com/sore_throat_pharyngitis/article.htm";
                break;
        }

       switch(td.h)
        {
            case 0:
                td.h=15;
                S="https://www.organicfacts.net/health-benefits/vegetable/health-benefits-of-asparagus.html";
                break;
            case 1:
                td.h=15;
                S="https://draxe.com/benefits-of-cherries/";
                break;
            case 2:
                td.h=15;
                S="http://www.weightloss.com.au/healthy-recipes/dinner-recipes/broccoli-and-bacon-pilaf/";
                break;
            case 3:
                td.h=15;
                S="https://www.tablespoon.com/recipes/berry-peachy-smoothie/49cb2d43-f037-42a1-b665-618341c146f3";
                break;

            case 4:
                td.h=15;
                S="https://www.tarladalal.com/Dal-Kabila-37759r";
                break;
            case 5:
                td.h=15;
                S="http://healthyeating.sfgate.com/benefits-spinach-eggs-breakfast-2171.html";
                break;
            case 6:
                td.h=15;
                S="https://garlicshaker.com/blog/-chinese-garlic-chicken-has-your-back-everday-/";
                break;
            case 7:
                td.h=15;
                S="https://www.pinterest.co.uk/pin/169166529729179320/";
                break;
            case 8:
                td.h=15;
                S="https://www.daringgourmet.com/masoor-dal-indian-red-lentil-soup/";
                break;
            case 9:
                td.h=15;
                S="https://www.livestrong.com/article/523098-what-are-benefits-of-eating-striped-bass/";
                break;
        }
      switch(fv.m)
        {
            case 0:
                fv.m=15;
                S="https://draxe.com/vitamin-a/";
                break;
            case 1:
                fv.m=15;
                S="https://draxe.com/vitamin-b/";
                break;
            case 2:
                fv.m=15;
                S="https://draxe.com/vitamin-c/";
                break;
            case 3:
                fv.m=15;
                S="https://draxe.com/vitamin-d/";
                break;
            case 4:
                fv.m=15;
                S="https://draxe.com/vitamin-e/";
                break;
            case 5:
                fv.m=15;
                S="https://draxe.com/vitamin-b-12/";
            break;
            case 6:
               // fv.m=15;
                S="https://www.everydayhealth.com/drugs/calcium-vitamin-d";
                break;
            case 7:
            //    fv.m=15;
                S="https://www.organicfacts.net/health-benefits/minerals/health-benefits-of-iron.html";
                break;
            case 8:
             //   fv.m=15;
                S="https://www.medicalnewstoday.com/articles/286839.php";
                break;
            case 9:
                fv.m=15;
                S="http://www.eatingwell.com/article/287742/10-amazing-health-benefits-of-eating-more-fiber/";
                break;
        }

        MainActivity ms=new MainActivity();
        if(ms.id== R.id.han)
        {
            S="https://www.youtube.com/watch?v=ccn6IHivD5M";
        }

        getWindow().setFeatureInt(Window.FEATURE_PROGRESS, Window.PROGRESS_VISIBILITY_ON);
        w.getSettings().setJavaScriptEnabled(true);

        final Activity activity = this;

        w.loadUrl(S);

        w.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView w, int progress) {
                activity.setProgress(progress * 100);
                p.setVisibility(View.VISIBLE);
            }
        });

        w.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView w, String Url) {
                return false;
            }

            @Override
            public void onPageFinished(WebView we, String url) {
                super.onPageFinished(we, url);
                p.setVisibility(View.GONE);
                activity.setProgress(Window.PROGRESS_END);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
