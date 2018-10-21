package com.nagar.manish.fitnessapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class BMICalculator extends AppCompatActivity {

    Button buttonCalculate, buttonExit;
    EditText inputKg, inputM;
    TextView showResult, showBMI, showImpBMI;
    private double kg;
    private  double m;
    private DecimalFormat TWO_DECIMAL_PLACES = new DecimalFormat(".##");
    MetricFormula metricFormula;
    ImperialFormula imperialFormula;
    BMICategory bmiCategory = new BMICategory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonExit = findViewById(R.id.buttonExit);
        inputKg = findViewById(R.id.inputKg);
        inputM = findViewById(R.id.inputM);
        showResult = findViewById(R.id.showResult);
        showBMI = findViewById(R.id.showBMI);
        showImpBMI = findViewById(R.id.showImpBMI);




        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inputKg.length()!=0 &&inputM.length()!=0)
                {
               try {
                   kg = Double.parseDouble(inputKg.getText().toString());
                   m = Double.parseDouble(inputM.getText().toString());
                   if(10 <= kg && kg <=200 && 0.5<=m && m<= 2.5)
                   {

                       metricFormula = new MetricFormula(kg, m);
                       imperialFormula = new ImperialFormula(kg, m);
                       showImpBMI.setText("In imperial formula: " + String.valueOf(TWO_DECIMAL_PLACES.format(imperialFormula.computeBMI(imperialFormula.getInputKg(), imperialFormula.getInputM()))));
                       showBMI.setText("BMI = " + String.valueOf(TWO_DECIMAL_PLACES.format(metricFormula.computeBMI(metricFormula.getInputKg(), metricFormula.getInputM()))));

                   }
                   else
                   {
                       AlertDialog alertDialog = new AlertDialog.Builder(BMICalculator.this,R.style.MyDialogTheme).create();
                       alertDialog.setTitle(getString(R.string.alert));
                       alertDialog.setMessage("MASS SHOULD BE BETWEEN:\n" + "minMass = 10 kg\n" + "maxMass = 200 kg\n"+"HEIGHT SHOULD BE BETWEEN:\n"+
                       "minHeight = 0.5 m\n"+"maxHeight = 2.5 m" +
                               "");
                       alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, getString(R.string.ok),
                               new DialogInterface.OnClickListener() {
                                   public void onClick(DialogInterface dialog, int which) {
                                       dialog.dismiss();}
                               });
                       alertDialog.show();
                   }
                   showResult.setText(bmiCategory.getCategory(metricFormula.computeBMI(metricFormula.getInputKg(), metricFormula.getInputM())));
               }
               catch (Exception e)
               {
                   e.printStackTrace();
                    }}
               else
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(BMICalculator.this,R.style.MyDialogTheme).create();
                    alertDialog.setTitle(getString(R.string.alert));
                    alertDialog.setMessage("ENTER MASS AND HEIGHT");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, getString(R.string.ok),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();}
                            });
                    alertDialog.show();


                }
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               try{ inputKg.setText("");
                inputM.setText("");
                showBMI.setText("BMI = " + String.valueOf(TWO_DECIMAL_PLACES.format(metricFormula.computeBMI(metricFormula.getInputKg(), metricFormula.getInputM()))));
                showImpBMI.setText("");
                showResult.setText("");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            }
        });

    }


}
