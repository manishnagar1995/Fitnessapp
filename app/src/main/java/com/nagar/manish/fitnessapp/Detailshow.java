package com.nagar.manish.fitnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Detailshow extends AppCompatActivity {

    ListView l1;
    int n;
    //***************************************************HEALTH TIPS *******************************************
    String[][]First={
            //genral health tips
            {"1.\tMaintain daily routine such as Get up early in morning, Exercise:=Breakfast,Lunch,Dinner and sleep.Routine is important factor in healthy life.",
                    "2. \tEat baked or steamed food instead of fried food.Do not take more oily foods.",
                    "3.\tMeditation and Yoga is helpful for healthy life.Do meditation and Yoga.",
                    "4.\tUse clean Water and soft cloth for cleaning the Skin.",
                    "5.\tDrink 8-10 Glasses of Water a day.",
                    "6.\tTake time to Relax .Allow yourself to destress at least once a day.",
                    "7.\tSleep 6-10 hours a night.",
                    "8.\tWash your hands often.Minimally wash hands  before eating and after using he restroom.",
                    "9.\tEat a large variety of fresh products or suppliments your diet wih vitamin and minerals.",
                    "10.\tBelieve is something  study have found that people  have faith live longer.",
                    "11.\tFind a way to bring joy into your life ..Treat yourself to loong baths or help a neighbor.",
            },//child
            {"1.\tBe a good role model - You don�t have to be perfect all the time, but if kids see you trying to eat right and getting physically active, they�ll take notice of your efforts. You�ll send a message that good health is impor�tant to your family." ,
                    "2.\tKeep things positive - Kid�s don�t like to hear what they can�t do, tell them what they can do instead. Keep it fun and positive. Everyone likes to be praised for a job well done. Celebrate successes and help children and teens develop a good self-image.",
                    "3.\tGet the whole family moving - Plan times for everyone to get moving together. Take walks, ride bikes, go swimming, garden or just play hide-and-seek outside. Everyone will benefit from the exercise and the time together.",
                    "4.\tBe realistic - Setting realistic goals and limits are key to adopting any new behavior. Small steps and gradual changes can make a big difference in your health over time, so start small and build up.",
                    "5.\tLimit TV, video game and computer time - These habits lead to a sedentary lifestyle and excessive snacking, which increase risks for obesity and cardiovascular disease. Limit screen time to 2 hours per day.",
                    "6.\tEncourage physical activities that they�ll really enjoy - Every child is unique. Let your child experiment with different activities until they find something that they really love doing. They�ll stick with it longer if they love it. check out these activities for kids.",
                    "7.\tPick truly rewarding rewards - Don�t reward children with tv, video games, candy or snacks for a job well done. Find other ways to celebrate good behavior.",
                    "8.\tMake dinnertime a family time - When everyone sits down together to eat, there�s less chance of children eating the wrong foods or snacking too much. Get your kids involved in cooking and planning meals. Everyone develops good eating habits together and the quality time with the family will be an added bonus.",
                    "9.\tMake a game of reading food labels - The whole family will learn what�s good for their health and be more conscious of what they eat. It�s a habit that helps change behavior for a lifetime. Learn more about reading nutrition labels.",
                    "10.\tStay involved - Be an advocate for healthier children. Insist on good food choices at school. Make sure your children�s healthcare providers are monitoring cardiovascular indicators like BMI, blood pressure and cholesterol. Contact public officials on matters of the heart. Make your voice heard."},
//women
            {
                    "1.Women in the United States live 81 years on average, almost five years longer than men. Our bodies and minds are made to carry us for many productive decades�to school, to work, and to give birth to babies and raise families. But women are also prone to dangerous diseases including heart disease, cancer, and stroke. There are so many different ways to keep your mind and body strong and healthy. Here are some streamlined tips for protecting a woman�s physical and mental health at any age.\n" ,
                    ". Avoid Tobacco Half of all long-term smokers will die from using tobacco. Smoking has been linked to several diseases and negative health effects, including heart disease (the number one killer of women), stroke, women�s infertility, and lung cancer. Lung cancer kills more women than breast cancer. Fortunately, when you stop smoking (or never begin the habit at all), you greatly decrease your risk of developing these diseases. Learn how to quit smoking.\n" ,
                    "2. Maintain Close Relationships\n" ,
                    "Research studies show that social connections increase your likelihood of surviving physical health problems, increase your level of happiness, and may even help you live longer. In fact, one study has shown that connections to other people have as big of a positive effect on your physical health as quitting smoking. Strengthen the relationships you have, and make it a goal to make new friends. \n" ,
                    "3. Eat Healthy Food\n" ,
                    "It can be difficult to eat enough fruits and vegetables and prepare nutritious meals for yourself and your family every day. But when you develop a habit of eating too many of the wrong foods and too few of the right foods, you are more likely to develop serious diseases and conditions, including cardiovascular disease, diabetes, cancer, and depression. Scientists are starting to find that unhealthy foods, such a fast foods and commercial baked goods, seem to increase your depression risk, and healthier foods, such as omega-3 fatty acids and cruciferous vegetables (like broccoli) lower your risk of depression and cancer. Learn how to eat a healthy diet.\n" ,
                    "4. Get Physical\n" ,
                    "The right amount of physical activity makes you less likely to have heart disease, stroke, diabetes, breast cancer, depression, and many more conditions. Exercise improves your bone health, sleep, and quality of life. To gain these health benefits, try to get at least two and a half hours of �moderate-intensity� physical activity every week. Moderate-intensity activities include brisk walking, riding a stationary bike, and playing with your kids. Learn more reasons and ways to be physically active.\n" ,
                    "5. Get Your Health Checkups and Screenings\n" ,
                    "Even if you feel well, yearly health checkups and screening tests can help women:\n" ,
                    "�\tSpot signs of serious diseases and conditions early, such as diabetes, cancer, and heart disease, so that you have a better chance of successfully curing or effectively treating them\n" ,
                    "�\tFind problems before they cause painful or bothersome symptoms\n" ,
                    "�\tLive a longer and more active life free of disability\n" ,
                    "Schedule a checkup from a primary care doctor or Ob/Gyn once per year, and learn more about the health screenings women need.\n" ,
                    "6. Help Others\n" ,
                    "Studies have found that helping other people can decrease your blood pressure, decrease depression, decrease your stress levels, decrease effects of chronic pain, and may even help you live longer. This is often because volunteering can give you a sense of purpose and perspective, especially when things in your own life aren�t perfect. Volunteering can also help you meet new friends. Helping can mean as little as picking up a friend�s children at school, gathering donations for a charity, or visiting your elderly neighbor for coffee. Learn some hints on helping and ways to volunteer. \n" ,
                    "\n"},
            //man
            {       "1) Don't smoke. Smoking is estimated to kill 400,000 Americans every single year. That's the equivalent death toll of three jumbo jet crashes every single day! Choosing not to smoke is, without a doubt, the single most important health decision you can make.\n" ,
                    "2) Control your weight. This is not as easy a No. 2 choice for me as was No. 1. That's because the connection between obesity and actual illnesses or deaths is often more indirect than is the case with smoking. But I have come to accept the estimates of the Surgeon General's Office that obesity is responsible for approximately 350,000 deaths every year, and that if American men continue to stop smoking in large numbers, it may even replace smoking as the No. 1 cause of death for men.\n" ,
                    "3) Drink alcohol in moderation. This message can be taken in both positive and negative terms. Truly moderate drinking (one to two standard size drinks per day) does reduce the risk of coronary artery disease, the No. 1 cause of death in our country. However, excessive drinking is a major cause of both physical disease and social tragedy. Approximately 10 percent of people who start drinking socially will become alcoholics. The decision to drink even socially should not be taken lightly.\n" ,
                    "4) Exercise regularly. This health practice has enormous physical and emotional benefits. Besides reducing the risk for high blood pressure, high blood cholesterol, diabetes, obesity and osteoporosis, regular exercise can be helpful in raising our general mood and reducing the risk for depression.\n" ,
                    "5) Have regular cholesterol and blood pressure tests. Both high cholesterol and high blood pressure can be described as \"silent killers,\" since they can cause extensive damage to our heart and arteries without producing any telltale symptoms until it is often too late. Therefore, the only way to find out if you have a potential problem is to get tested.\n" ,
                    "6) Have regular colonoscopy and prostate serum antigen testing. I strongly believe in the value of both of these tests in detecting two common and potentially lethal diseases � colon and prostate cancer � when they are still curable. There are not many cancers that we can either prevent of detect early enough to make a difference, but these are two.\n" ,
                    "7) Take a baby aspirin every day (for most men). Unless you are truly allergic to aspirin (very rare) or at high risk for gastrointestinal bleeding (not very common), this daily dose of aspirin is one of the most beneficial and simple things you can do. It acts to reduce the risk of clot formation in the arteries leading to your heart and brain, thereby reducing the risk of both heart attacks and strokes. And it probably acts in many other beneficial ways we don't yet fully understand.\n" ,
                    "8) Practice safe sex. In this age of AIDS, you could make a good case for putting this higher on the list. But even less lethal sexually transmitted diseases can cause a wide range of disability, such as infertility problems and pelvic pain in women. And unless you are in a truly monogamous relationship, there is no good way to tell a partner is safe, so prevention using condoms is key.\n" ,
                    "9) Have regular glaucoma screenings. I put this on the list because glaucoma is a major cause of blindness and it usually doesn't produce visual symptoms until it has caused significant damage to the optic nerve. That's why eye doctors call it a \"thief in the night.\" The other benefit of glaucoma screening is that your ophthalmologist will have the opportunity to check for other eye problems such as macular degeneration.\n" ,
                    "10) Use a sunscreen of at least 15 SPF. Skin cancers are the most common of all cancers by far. Fortunately, most of them (basal cell and squamous cell carcinomas) are rarely lethal, though they can certainly cause local disfigurement if not diagnosed early. Melanoma is both disfiguring and lethal, so it must be diagnosed as early as possible. But since it is so inconvenient to do a truly thorough check of the skin, at least by yourself, prevention is a very helpful tool. And that means the use of sunscreen and protective clothing and the avoidance of direct sun exposure between the \"high hours\" of 10 a.m. and 2 p.m., when the sun is strongest.\n" ,
                    "11) Increase good fats and good carbs in your diet. Some of the standard nutritional advice of the past is undergoing change. And this is particularly true in the growing emphasis on making a distinction between good fats and carbs � such as omega-3 fatty acids and whole grains, which should actually be increased in our diet � and bad fats and carbs, such as saturated fats and highly refined grains, which of course should be decreased. In other words, just \"cutting down\" on fats and carbs is not precise enough anymore.\n"},
            //simple tips
            {"1.\twalk for 30 minutes daily.",
                    "2.\teat a piece of fruit daily.\n" ,
                    "3.\teat whole foods instead of processed foods whenever possible.\n" ,
                    "4.\tstart each lunch/dinner with saled.\n" ,
                    "5get a handful of walnuts before bed.\n" ,
                    "6.drink plenty of water. Eat slowly.\n" ,
                    "7icrese youre fiber intake.Eat foods with bright rich color.\n" ,
                    "8.surrund yourself with loving and supportive people.\n" ,
                    "9.quit smoking by smoking one cigarette every week.\n" ,
                    "10Take care of your teeth . Floss and brush your teeth twice a day at least\n"},
            //exercise
            {       "1. Interval Training\n" +
                    "This refers to doing almost any type of exercise at a variable pace. " +
                    "For example, if you are walking or doing push-ups, vary the pace of the exercise. " +
                    "You can walk normally for a minute or so, and then speed up a bit," +
                    " and then return to normal speed several times. " ,
                    "2.Walking ",
                    "3.Swimming  ",
                    "4.The basic push-up is the classic exercise to strengthen the upper body (chest, shoulders, and triceps) and core (abdominal muscles). Beginners can first do push-ups by spreading their fully extended arms slightly more than shoulder width apart with their hands against an unmovable object like the edge of a kitchen countertop.",
                    "5.Lunges work the same large muscle groups as the squats, but can work additional leg muscles and improve balance. Lunges are done by taking a big enough step forward that the knee forms about a 90-degree angle. ",
                    "6.sic plank" ,
                    "7.Side plank" ,
                    "8.Prone sky-dive"
            },
            //yoga
            {       "1.Create a comfortable spot for your yoga practice\n",
                    "2.Accessories or even a yoga mat are by no means a prerequisite to practise...Just be creative!",
                    "3.Stay safe, prevent injury",
                    "4 Choose your yoga style / routine:If you pick an online class, don�t get stuck in reading too many class descriptions. The nature of the mind is to look for the perfect class to solve everything. " + "That class doesn�t exist; you have to make it yourself.",
                    "5 Always relax with Savasana",
                    "6 Practise yoga regularly",
                    "7 Enjoy your practice!",
                    "8.Don�t overdo it; if you don�t enjoy your yoga practice you will never keep it up. It should be something you look forward to doing. Maybe try another style of yoga or teacher if you feel like yoga is becoming a chore."
            },
            //heart
            {   "1.\tGive up smoking\n" ,
                    "2.\tIf you're a smoker, quit. It's the single best thing you can do for your heart health.\n" ,
                    "3.\tSmoking is one of the main causes of coronary heart disease. A year after giving up, your risk of a heart attack falls to about half that of a smoker.\n" ,
                    "4.\tGetting � and staying � active can reduce your risk of developing heart disease. It can also be a great mood booster and stress buster.\n" ,
                    "5.\tDo 150 minutes of moderate-intensity aerobic activity every week. One way to achieve this target is by doing 30 minutes of activity on five days a week. Fit it in where you can, such as by cycling to work.\n" ,
                    "6.\tBeing overweight can increase your risk of heart disease. Stick to a healthy, balanced diet low in fat and sugar, with plenty of fruit and vegetables, combined with regular physical activity.\n"
            },
            //heart
            {
                    "1.\tGive up smoking\n",
                    "2.\tIf you're a smoker, quit. It's the single best thing you can do for your heart health.\n" ,
                    "3.\tSmoking is one of the main causes of coronary heart disease. A year after giving up, your risk of a heart attack falls to about half that of a smoker.\n" ,
                    "4.\tGetting � and staying � active can reduce your risk of developing heart disease. It can also be a great mood booster and stress buster.\n" ,
                    "5.\tDo 150 minutes of moderate-intensity aerobic activity every week. One way to achieve this target is by doing 30 minutes of activity on five days a week. Fit it in where you can, such as by cycling to work.\n" ,
                    "Being overweight can increase your risk of heart disease. Stick to a healthy, balanced diet low in fat and sugar, with plenty of fruit and vegetables, combined with regular physical activity.\n"
            },
            //health stress
            {     "1.Heart disease",
                    "2.Asthma",
                    "3.\"Stress causes higher levels of the hormone cortisol,\" says Winner, \"and that seems to increase the amount of fat that's deposited in the abdomen.",
                    "4.Diabetes" ,
                    "5.Headaches",
                    "6.Depression",
                    "7.Gastrointestinal problems",
                    "8.Accelerated aging",
                    "9.Accelerated aging"
            }

    };



    //**************************************NUTRITION TIPS*******************************************
    String[][]nutrition={

            //0General nutrition tips:

            {       "1. Load Your Diet with Antioxidants.\n",
                    "2. Pack Your Meals with Vitamins and Minerals.\n",
                    "3. Practice Portion Control.\n",
                    "4. Replace Bad Fats with Good Fats.\n",
                    "5. Exercise for Life.\n",
                    "6. Eat lots of fresh vegetables and fruits.\n",
                    "7. Inculdes lots of Fibre and protein in the diet.\n",
                    "8. Atleast keeps 4 hour break in between sleep and dinner.\n",
                    "9. Cut off the Sugar and Salt contains.\n",
                    "10. Don't eat Junk\n"
            },//1Nut Tips for children:-
            {"\n" +
                    "1. Encourage the whole family to eat breakfast.\n" ,
                    "2. Put sweets in their place\n" ,
                    "3. Drink calories count\n" ,
                    "4. Limit TV and computer time.\n" ,
                    "5. Must include the essential nutrient it includer proteins,fat,fibre and mineral\n" ,
                    "6. Make sure your keep healthy snack in diet.\n" ,
                    "7. Prepare and store food safely.\n" ,
                    "8. Make sure your kid sit while eating and don't move much.\n" ,
                    "9. Set a good example as kid.\n" ,
                    "10.Get a child involve in the preparation of breakfast and tiffins.\n" ,
                    "11.Kid must drink atleast 8 glass of water.\n"
            },

            // 2Nutrition tips of man:
            {
                    "1. Eat Breakfast Every Day :\n"+

                            "The first meal you eat in the morning truly breaks the fast and gets your metabolism moving for the day. Don't skip it!",
                    "2. Snack:\n"+
                            "A midmorning and midafternoon snack will help you avoid overeating at meals and alleviate energy lows throughout the day.",
                    "3. Eat Vegetables and Fruits:\n"+
                            "Aim for at least two cups of fruit and 2� cups of vegetables every day. Grab an apple, peach or pear for the road. Take sliced fruit for a snack. Put lettuce and tomato on a sandwich or order a salad.",
                    "4. Make Protein Count\n"+
                            "Young men need protein to fuel developing muscles. Eat less red meat and more chicken, turkey and pork. Eat fish at least two times a week. Regularly eat plant-based proteins such as tofu, beans and lentils.",
                    "5. Add in Healthy Fats\n"+
                            "Be selective with the fat you eat. Limit fries, onion rings and nachos. Eat heart-healthy fat sources such as olive oil, canola oil, walnuts, almonds and avocado.",
                    "6. Calcium\n"+
                            "Young men need 1,000 milligrams of calcium each day for bone and tooth health. What young men do prior to age 30 is crucial to having healthy bones for life. Food is your best source of calcium. Aim for three servings of low-fat dairy products, such as milk, yogurt or cheese every day.",
                    "7. Vitamin D\n"+
                            "You also need vitamin D good for bone health. Especially if there is little to no fortified milk or fish in your diet, consider a supplement containing at least 600 IU.",
                    "8.  Iron-Rich Foods\n"+
                            "Iron is important for energy. You likely can get enough iron by eating iron-fortified cereal, leafy greens or a handful of raisins each day. Young men need just eight milligrams of iron per day. Women need more iron than men.",
                    "9. Get Active\n"+
                            "Most young men do not need an excuse to get active. For healthy bones, weight management and overall good health, get at least 30 minutes of weight-bearing activity most days of the week. To build muscle, strength train with weights or resistance bands at least two to three times a week."

            },
            //3Nutrition tips of Women:-
            {
                    "1. Nutrient-rich foods provide energy for women's busy lives and help to prevent disease. A healthy daily diet includes:\n" ,
                    "2. At least three 1-ounce servings of whole grains such as whole-grain bread, cereal, pasta, brown rice or oats.\n" ,
                    "3. Three servings of low-fat or fat-free dairy products including low-fat or fat-free milk, yogurt or cheese.\n" ,
                    "4. Five to 6 ounces of protein such as lean meat, chicken, turkey, fish, eggs, beans or peas and nuts.\n" ,
                    "5. Two cups of fruits � fresh, frozen or canned without added sugar.\n" ,
                    "6. Two-and-a-half cups of colorful vegetables � fresh, frozen or canned without added salt."
            },
            // 4"Nutrition Tips For Hair"
            {
                    "1) Change Your Diet:\n" ,
                    "2) Drink a SuperFood Shake: \n" ,
                    "3) Soak Out the Phytates:\n" ,
                    "4) Eat Your Yolk:  \n" ,
                    "5) Consume More Zinc:  \n" ,
                    "6) Get More Silica:  \n" ,
                    "7)  Consume Foods Rich in Collagen:\n" ,
                    "8) Get Lots of Good Fats: \n" ,
                    "9) Try Cold Water Showers:\n" ,
                    "10) Take a Collagen Supporting Product: \n"
            },
            //5Tips for Healthy Skin Nutrition
            {
                    "1.Super Hydrate\n" ,
                    "2.Eat a Big Salad:  Eat a big salad with raw spinach and hard/soft boiled eggs\n" ,
                    "3.Snack on Radishes:  Snack on radishes or add them to your salad.\n" ,
                    "4.Cucumber Salad:  Slice up some cucumbers and add apple cider vinegar and herbs\n" ,
                    "5.Add in More Turmeric:  Add turmeric to hummus, brown rice, meat dishes, & shakes. \n" ,
                    "6.Vegetable Juice:  Juice up cucumber, celery, lemon and turmeric root and drink daily.\n" ,
                    "7.Coconut Turmeric Paste:  Make a paste with coconut oil and turmeric and apply to regions of the body that display psoriasis, acne and/or eczema. \n" ,
                    "8.Healthy Animal Products:  Eat wild-caught sockeye salmon 2-3x each week to get more high quality omega 3 fatty acids and astaxanthin.  \n" ,
                    "9.Avoid Sugar:  Stay off of sugar and grains, these increase glycation and create more inflammatory damage that effects the skin tissue.\n" ,
                    "10.Avoid Bad Fats & Consume Lots of Good Fats:  Avoid vegetable oils such corn oil, safflower oil, cottonseed oil, canola oil and peanut oil.\n"
            },
            //6Anaemic patient
            {
                    "1. Spinach.\n"+
                            "You�ve probably heard that spinach is rich in iron and therefore great for anemia." +
                            " It is rich in iron, but it�s never helped me with anemia at all. " +
                            "Turns out it has something called oxalic acid which binds with the iron and keeps your body from using it." +
                            " Try broccoli, kale and other dark leafy greens instead.\n" ,
                    "2. Red wine.\n" +
                            " The reservatrol that helps fight heart disease and cancer seems to inhibit iron absorption." +
                            " But white wine seems to help with iron absorption, so that�s an option.\n" ,
                    "3. Coffee. \n" +
                            "Coffee can also keep you from absorbing iron into your system." +
                            " Avoid it within an hour either way of an iron supplement or iron rich meal.\n" ,
                    "4. Black and green teas\n" +
                            " chelate with iron from plant sources, making it indigestible." +
                            " Iron supplements are typically from plant sources. Tea doesn�t have this effect with meat iron {PDF link} sources," +
                            " however. And in populations that drink a lot of tea, there�s no more anemia than in other populations," +
                            " so there�s definitely still some research to be done in this area.\n" ,
                    "5. Soy proteins." +
                            " While one might argue that soy is rich in iron, non-fermented soy is also rich in phytic acid, which interferes with absorption of iron and other nutrients. " +
                            "Interestingly, fermented soy products (like soy sauce) can increase your ability to absorb iron. " +
                            "(Some sources actually recommend tofu for combating anemia because the phylic acid doesn�t completely block iron absorption, so you still get some iron from the soy." +
                            " If you think tofu is your best available source for iron, be sure to eat it with plenty of vitamin C for best effect.)"
            },
            //7weight gain
            {
                    "\n" +
                            "1.Don't drink water before meals. This can fill your stomach and make it harder to get in enough calories.\n" ,
                    "2.Eat more often. Squeeze in an additional meal or snack whenever you can, such as before bed.\n" ,
                    "3.Drink milk. ...\n" ,
                    "4.Try weight gainer shakes. ...\n" ,
                    "5Use bigger plates. ...\n" ,
                    "6Add cream to your coffee. ...\n" ,
                    "7Take creatine.The muscle building supplement creatine monohydrate can help you gain a few pounds in muscle weight.\n" ,
                    "8Get quality sleep. Sleeping properly is very important for muscle growth.\n" ,
                    "9Eat your protein first and vegetables las\n" ,
                    "10.Don't smoke. Smokers tend to weigh less than non-smokers, and quitting smoking often leads to weight gain\n"
            },
            //8blood pressure
            {           "1. Wash Excess Sodium Down The Drain\n" +
                    "Most of the sodium in our diets�approximately 77%�comes from prepared or processed foods," +
                    " but sometimes using convenience items, like canned beans and tuna, " +
                    "can make it easier to eat more healthfully. " +
                    "The good news: rinsing those canned foods will remove much of their sodium.",
                    "2. Spice It Up\n" +
                            "To prevent hypertension and boost flavor, cut back on sodium by using more herbs, " +
                            "spices and salt-free seasoning blends when cooking. Not sure where to start? Add lemon juice or vinegar to homemade tomato sauce; the acidity will impart a sensation similar to salt. " +
                            "Or, experiment with herbes de Provence or fines herbes�two sodium-free French spice blends�when cooking" +
                            " meat, poultry or your tomato sauce.\n" ,
                    "3. Sum Up The Sodium Of Your Servings\n" +
                            "Nutrition facts labels list nutrient amounts for one serving�but, often, we eat more than one. If you eat two servings, be sure to double all the nutrient numbers, not just the calories. A whole can of soup, for example, may look fine from a caloric " +
                            "perspective but eating it could send you soaring past the recommended daily limit for sodium.\n" ,
                    "4. Scan Sodium Counts On Condiments\n" +
                            "When you think of salty foods, it�s likely that canned chicken soup and frozen pizza�not ketchup and " +
                            "salsa�come to mind. But many condiments, including meat tenderizer, steak sauce, soy sauce, " +
                            "salsa and ketchup, pack high doses of sodium. If you�re watching your blood pressure, read labels and look " +
                            "for �low sodium� products.\n" ,
                    "5. Box Out Salt\n" +
                            "Avoid boxes of flavored rices, pastas and soups: they often contain lots of added salt." +
                            " Also, when you prepare these grains or starches from scratch, skip the step of adding salt to the water." +
                            " Add flavor later with herbs and spices.\n" ,
                    "6. Just Try It\n" +
                            "Don�t cook foods with salt; add it at the table instead, after you�ve tasted a bite. " +
                            "Maybe it doesn�t need any additional salt. ADVERTISEMENT Give Yourself A Hand\n" ,
                    "7. Give Yourself A Hand\n" +
                            "If you must add salt to your meal, shake it into your hand before sprinkling it on your food." +
                            " Seeing exactly how much you�re adding can help you control it.Green Up Your Diet\n" ,
                    "8. Green Up Your Diet\n" +
                            "Low levels of magnesium in the body are associated with vasoconstriction�tightening of the arteries�making a" +
                            " smaller passageway for blood to flow and, subsequently, increasing blood pressure. Leafy greens," +
                            " whole grains, a wide assortment of beans and halibut are great sources of magnesium. Search on EatingWell" +
                            " for some delicious halibut recipes and some leafy green, whole-grain or bean ideas."

            }

    };
    //**************************************************Home Remedies*********************************************************
    String [][]Remedies={
            //Acidity
            {"1.\tTreat the causes- take measures to relieve tensions and stress from life.\n" ,
                    "2.\tRelax for about 20 minutes before and after eating. \n" ,
                    "3.\tEat bland food; less hot food add little or no oil to your food- bland boiled vegetables. \n" ,
                    "4.\tEat fresh fruits and salads, ash gourd juice. \n" ,
                    "5.\tYou can have takmaria, commonly known as falooda seeds (Impatiens balsamina), they have cooling effect and helps in digestion in hot weathers. \n" ,
                    "6.\tAvoid citrus fruits, coffee, tea, raw vegetables, meat extracts, condiments spices and apple. \n" ,
                    "7.\tAvoid canned and processed food- they contain chemical irritants. \n" ,
                    "8.\tAvoid fried food and fats - you can include sesame oil, mustard oil, oily fish,linseed oil, skimmed milk and low fat milk products in your diet in small quantities. \n" ,
                    "9.\tAvoid tobacco and alcohol. \n" ,
                    "10.\tEat meals at regular intervals, at regular time. \n"
            },
            //cough nd cold
            {
                    "1: Blow Your Nose Often -- and the Right Way\n" ,
                    "2: Stay Rested\n" ,
                    "3: Gargle\n" ,
                    " 4: Drink Hot Liquids\n" ,
                    "5: Take a Steamy Shower\n" ,
                    " 6: Apply Hot or Cold Packs Around Your Congested Sinuses\n" ,
                    " 7: Sleep With an Extra Pillow Under Your Head\n" ,
                    " 8: Don't Fly Unless Necessary\n"
            },
            //Back pain
            {
                    "1. Maintain a healthy weight.\n" +
                            " Staying fit is one of the most important recommendations for avoiding back pain, says Santiago" +
                            " Figuereo, MD, neurological surgeon and founder and medical director of the Miami Neurological " +
                            "Institute. Extra pounds stress your back and can cause pain. Eating a healthy diet filled with " +
                            "fruits and vegetables and low on processed foods can keep your weight in a healthy range and your " +
                            "back healthy.\n" ,
                    "2.Keep your back muscles strong.\n " +
                            "The most common back problems happen because people who aren't in shape start doing heavy lifting" +
                            " or hard work and stress their back, Dr. Figuereo says. Back pain usually happens when " +
                            "there's degeneration of the spine because the spine is working too hard. But when you build " +
                            "up enough muscle strength in your back with exercise, the muscles give your spine the " +
                            "support it needs to keep it healthy. That's why physical therapy is standard back pain " +
                            "treatment, but being in shape can help you avoid back pain to begin with.\n" ,
                    "3. Stretch your muscles.\n" +
                            " In addition to exercise, stretching is important for staying flexible and avoiding back problems." +
                            " It's also a key part of recovering from a back injury. Stretch before doing heavy lifting " +
                            "or exercise and make a habit of doing it before bed. Stretches can be as simple as bending " +
                            "forward, bending back, and bending side to side, says Neil Kirschen, MD, chief of pain " +
                            "management in the department of anesthesiology at South Nassau Communities Hospital in " +
                            "Oceanside, N.Y. The ultimate stretching exercise: yoga.\n" ,
                    "4. Focus on good posture.\n" +
                            "5. Poor posture is another major contributor of back pain.\n" +
                            " Standing up straight with your ears over your shoulders, your shoulders over your hip joints," +
                            " and your hip joints over your ankles will help keep your healthy pain-free. When you're " +
                            "sitting, getting a chair that's designed to keep your back straight will help.\n" ,
                    "6. Lift properly.\n" +
                            " When you do pick up a heavy object, bend at the knees and keep the item close to your body. " +
                            "Also, take care not to twist your body when you lift, and wear a brace if you have a job " +
                            "that requires heavy lifting.\n" ,
                    "7.Leave your purse at home. \n" +
                            "If you can, stash a few dollars and your identification in your pocket when you leave the house " +
                            "rather than carrying around a heavy purse. Carrying a bag changes your balance and can " +
                            "change the curve of your spine, Dr. Kirschen says. Even a wallet packed full of cards and " +
                            "receipts in your back pocket can affect your back because it puts pressure on your sciatic " +
                            "nerve, he says.\n" ,
                    "8. Practice stress relief for back pain relief.\n" +
                            " Stress tends to make back pain worse. That may be another good reason to practice yoga. Other ways " +
                            "to reduce stress include treating yourself well, avoiding over-scheduling your days, and " +
                            "taking time to enjoy life.\n" ,
                    "Sleep well. Soft mattresses push your back out of alignment, so it's best to choose a mattress " +
                            "that's in the range of medium to firm for back pain relief, Figuereo says."
            },
            //pimple
            {
                    "1.  Basil or Tulsi paste:\n" ,
                    "2. Honey and Lemon Juice:\n" ,
                    "3. Dry Roast Cinnamon and Honey:\n" ,
                    "4. Margosa or Neem Leaves:-\n" +
                            "Neem leaves are perfect for treating pimples. Make a paste of neem leaves and apply on the targeted pimples\n" ,
                    "5. Sesame Seeds:\n" ,
                    "6. Potato:\n" +
                            "  It gives a natural mild bleaching glow to the skin.\n" ,
                    "7. Nutmeg: Nutmeg or jaiphal is a great spice that can be used to solve pimple problems. Make it into a fine powder,\n" ,
                    " 8. Raw Papaya:\n" +
                            " A great sticky ayurvedic treatment for acne and pimples is the white milk that comes out of the skin of a raw papaya and use it on the whole of face. \n" ,
                    " 9. Cloves:\n" +
                            " You can ground some Cloves in the same way, but the clove oil content in it may give an immense burning sensation when used on aggravated pimples. \n"
            },
            //tooth ache
            {
                    "1.When given a choice between tooth extraction and root canal treatment, always opt for a root canal." +
                            " No denture, bridge or implant will look, feel and function as well as a natural tooth.\n" ,
                    "2.Act immediately when you experience symptoms of swelling or pain. " +
                            "Most endodontists can accommodate emergency cases, even on weekends," +
                            " ensuring you�ll be seen quickly.\n" ,
                    "3.If your dentist recommends tooth extraction, ask whether root canal is an option.\n" ,
                    "4.If you�re told root canal is not an option, ask why and request a referral to an endodontist or" +
                            " use our Find an Endodontist search tool to find a practice near you.\n"
            },
            //weight loss
            {
                    "1.\tEat a high-protein breakfast. \n" ,
                    "2.\tAvoid sugary drinks and fruit juice. \n" ,
                    "3.\tDrink water a half hour before meals. \n" ,
                    "4.\tChoose weight loss-friendly foods (see list). \n" ,
                    "5.\tEat soluble fiber. \n" ,
                    "6.\tDrink coffee or tea. \n" ,
                    "7.\tEat mostly whole, unprocessed foods.\n" ,
                    "8.\tEat your food slowly.\n"
            },
            //Tips For Hair"
            {
                    "1) Change Your Diet:\n" ,
                    "2) Drink a SuperFood Shake: \n" ,
                    "3) Soak Out the Phytates:\n" ,
                    "4) Eat Your Yolk:  \n" ,
                    "5) Consume More Zinc:  \n" ,
                    "6) Get More Silica:  \n" ,
                    "7)  Consume Foods Rich in Collagen:\n" ,
                    "8) Get Lots of Good Fats: \n" ,
                    "9) Try Cold Water Showers:\n" ,
                    "10) Take a Collagen Supporting Product: \n"
            },

            //Tips for Healthy Skin Nutrition
            {
                    "1.Super Hydrate\n" ,
                    "2.Eat a Big Salad:  Eat a big salad with raw spinach and hard/soft boiled eggs\n" ,
                    "3.Snack on Radishes:  Snack on radishes or add them to your salad.\n" ,
                    "4.Cucumber Salad:  Slice up some cucumbers and add apple cider vinegar and herbs\n" ,
                    "5.Add in More Turmeric:  Add turmeric to hummus, brown rice, meat dishes, & shakes. \n" ,
                    "6.Vegetable Juice:  Juice up cucumber, celery, lemon and turmeric root and drink daily.\n" ,
                    "7.Coconut Turmeric Paste:  Make a paste with coconut oil and turmeric and apply to regions of the body that display psoriasis, acne and/or eczema. \n" ,
                    "8.Healthy Animal Products:  Eat wild-caught sockeye salmon 2-3x each week to get more high quality omega 3 fatty acids and astaxanthin.  \n" ,
                    "9.Avoid Sugar:  Stay off of sugar and grains, these increase glycation and create more inflammatory damage that effects the skin tissue.\n" ,
                    "10.Avoid Bad Fats & Consume Lots of Good Fats:  Avoid vegetable oils such corn oil, safflower oil, cottonseed oil, canola oil and peanut oil.\n"
            },
            //Asthma
            {
                    "1.\tTry to take your preventer each day as per your asthma action plan \n" ,
                    "2.\tAsk your doctor to review your asthma and your medication. " +
                            "If your asthma is going well, you may even be able to step back to a lower dose. \n" ,
                    "3.\tSome medications are more expensive than others. Talk to your doctor or pharmacist about medicine costs." +
                            " There may be an alternative such as a generic medicine.  \n" ,
                    "4.\tYou may be wasting medication. Nine out of ten people aren�t getting the full dose from their" +
                            " inhalers, even those who have been using asthma puffers for years.  Getting your technique right" +
                            " could mean each reliever puffer lasts longer and you need to buy less. \n" ,
                    "5.\tWhen you use a spacer with your puffer you get up to 30 per cent more out of each dose than using a" +
                            " puffer alone.?A puffer with a spacer works just as well as a nebuliser but is simpler and cheaper. \n" ,
                    "6.\tCheck the fine print of your health insurance. Shop around for the best cover for your needs. Also," +
                            " check travel insurance policies carefully to make sure they cover your situation. \n"
            }

    } ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detailshow);
//default backbutton
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        l1 = (ListView) findViewById(R.id.listx);

        Health_tips health_tips = new Health_tips();

        switch (health_tips.c) {
            case 0:
                health_tips.c=15;
                ArrayAdapter<String> as1 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[0]);
                l1.setAdapter(as1);
                break;
            case 1:
                health_tips.c=15;
                ArrayAdapter<String> as2 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[1]);
                l1.setAdapter(as2);
                break;
            case 2:
                ArrayAdapter<String> as3 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[2]);
                l1.setAdapter(as3);
                health_tips.c=15;
                break;
            case 3:
                health_tips.c=15;
                ArrayAdapter<String> as4 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[3]);
                l1.setAdapter(as4);
                break;
            case 4:
                health_tips.c=15;
                ArrayAdapter<String> as5 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[4]);
                l1.setAdapter(as5);
                break;
            case 5:
                health_tips.c=15;
                ArrayAdapter<String> as6 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[5]);
                l1.setAdapter(as6);
                break;
            case 6:
                health_tips.c=15;
                ArrayAdapter<String> as7 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[6]);
                l1.setAdapter(as7);
                break;
            case 7:
                health_tips.c=15;
                ArrayAdapter<String> as8 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[7]);

                break;
            case 8:
                health_tips.c=15;
                ArrayAdapter<String> as9 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[8]);
                l1.setAdapter(as9);

                break;
            case 9:
                health_tips.c=15;
                ArrayAdapter<String> as10 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, First[9]);
                l1.setAdapter(as10);

                break;
        }
        Nutrition_Tips nutrition_tips = new Nutrition_Tips();

        switch (nutrition_tips.k) {
            case 0:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap1 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[0]);
                l1.setAdapter(ap1);
                break;
            case 1:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap2 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[1]);
                l1.setAdapter(ap2);
                break;
            case 2:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap3 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[2]);
                l1.setAdapter(ap3);
                break;
            case 3:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap4 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[3]);
                l1.setAdapter(ap4);
                break;
            case 4:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap5= new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[4]);
                l1.setAdapter(ap5);
                break;
            case 5:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap6 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[5]);
                l1.setAdapter(ap6);
                break;
            case 6:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap7 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[6]);
                l1.setAdapter(ap7);
                break;
            case 7:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap8 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[7]);
                l1.setAdapter(ap8);
                break;
            case 8:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap9 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[8]);
                l1.setAdapter(ap9);
                break;
            case 9:
                nutrition_tips.k=15;
                ArrayAdapter<String> ap10 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[9]);
                l1.setAdapter(ap10);
                break;
        };



        Home_Remedies home_remedies = new Home_Remedies();

        switch (home_remedies.b) {

            case 1:
                home_remedies.b=15;
                ArrayAdapter<String> ap2 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1,Remedies[0]);
                l1.setAdapter(ap2);
                break;
            case 2:
                home_remedies.b=15;
                ArrayAdapter<String> ap3 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, Remedies[1]);
                l1.setAdapter(ap3);
                break;
            case 3:
                home_remedies.b=15;
                ArrayAdapter<String> ap4 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, Remedies[2]);
                l1.setAdapter(ap4);
                break;
            case 4:
                home_remedies.b=15;
                ArrayAdapter<String> ap5= new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, Remedies[3]);
                l1.setAdapter(ap5);
                break;
            case 5:
                home_remedies.b=15;
                ArrayAdapter<String> ap6 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, Remedies[4]);
                l1.setAdapter(ap6);
                break;
            case 6:
                home_remedies.b=15;
                ArrayAdapter<String> ap7 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, nutrition[5]);
                l1.setAdapter(ap7);
                break;
            case 7:
                home_remedies.b=15;
                ArrayAdapter<String> ap8 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1,Remedies[6]);
                l1.setAdapter(ap8);
                break;
            case 8:
                home_remedies.b=15;
                ArrayAdapter<String> ap9 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, Remedies[7]);
                l1.setAdapter(ap9);
                break;
            case 9:
                home_remedies.b=15;
                ArrayAdapter<String> ap10 = new ArrayAdapter<String>(Detailshow.this,
                        android.R.layout.simple_list_item_1, Remedies[8]);
                l1.setAdapter(ap10);
                break;

        };
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