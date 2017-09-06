package com.example.android.quizz_update;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.quizz_update.R.id.A1;
import static com.example.android.quizz_update.R.id.A2;

public class quizActivity extends AppCompatActivity
{
    boolean q1 = false, q2 = false, q3 = false, q4 = false;
    int answer;
    int i1,i2,i3,i4,i5,i6;
    String pic1, pic2, pic3, pic4, pic5, pic6, picresults, score;

    String quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Intent intent = getIntent();

        quiz = intent.getStringExtra("quiz");

        switch (quiz)
        {


            //questions for cars
            case "cars":
                q1 = true;
                getSupportActionBar().setTitle("Cars quiz");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                TextView a1 = (TextView) findViewById(R.id.Q1);
                a1.setText("1. The headquarters of Fiat are in which Italian city?");
                RadioButton rad1 = (RadioButton) findViewById(A1);
                rad1.setText("Milan");
                RadioButton rad2 = (RadioButton) findViewById(A2);
                rad2.setText("Turin");//yes
                RadioButton rad3 = (RadioButton) findViewById(R.id.A3);
                rad3.setText("Rome");

                TextView a2 = (TextView) findViewById(R.id.Q2);
                a2.setText("2. Which car brand includes the Defender and Discovery?");
                RadioButton rad4 = (RadioButton) findViewById(R.id.B1);
                rad4.setText("Mazda");
                RadioButton rad5 = (RadioButton) findViewById(R.id.B2);
                rad5.setText("Land Rover");//yes
                RadioButton rad6 = (RadioButton) findViewById(R.id.B3);
                rad6.setText("Ford");

                TextView a3 = (TextView) findViewById(R.id.Q3);
                a3.setText("3. How many rings are in the Audi logo?");
                RadioButton rad7 = (RadioButton) findViewById(R.id.C1);
                rad7.setText("One");
                RadioButton rad8 = (RadioButton) findViewById(R.id.C2);
                rad8.setText("Four");//yes
                RadioButton rad9 = (RadioButton) findViewById(R.id.C3);
                rad9.setText("Two");

                TextView a4 = (TextView) findViewById(R.id.Q4);
                a4.setText("4. If you are using 'M&S' tyres, what do the letters stand for?");
                RadioButton rad10 = (RadioButton) findViewById(R.id.D1);
                rad10.setText("Mud and snow");//yes
                RadioButton rad11 = (RadioButton) findViewById(R.id.D2);
                rad11.setText("Mud and sun");
                RadioButton rad12 = (RadioButton) findViewById(R.id.D3);
                rad12.setText("Mud and snow");

                TextView a5 = (TextView) findViewById(R.id.Q5);
                a5.setText("5. The 'Leaf' is a best selling highway-capable all-electric car produced by which company?");
                RadioButton rad13 = (RadioButton) findViewById(R.id.E1);
                rad13.setText("Audi");
                RadioButton rad14 = (RadioButton) findViewById(R.id.E2);
                rad14.setText("Ford");
                RadioButton rad15 = (RadioButton) findViewById(R.id.E3);
                rad15.setText("Nissan");//yes

                TextView a6 = (TextView) findViewById(R.id.Q6);
                a6.setText("6. Which automobile manufacturer was the first to produce more than 10 million vehicles per year?");
                RadioButton rad16 = (RadioButton) findViewById(R.id.F1);
                rad16.setText("Toyota (in 2012)");//yes
                RadioButton rad17 = (RadioButton) findViewById(R.id.F2);
                rad17.setText("BMW(2011)");
                RadioButton rad18 = (RadioButton) findViewById(R.id.F3);
                rad18.setText("VW(2001)");
                break;

            //question for social network
            case "computer":
                q2 = true;
                getSupportActionBar().setTitle("Computer quiz");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);


                TextView b1 = (TextView) findViewById(R.id.Q1);
                b1.setText("1. A Hashtag is a feature of which social media network?");
                RadioButton rad19 = (RadioButton) findViewById(A1);
                rad19.setText("Google plus");
                RadioButton rad20 = (RadioButton) findViewById(A2);
                rad20.setText("Facebook");
                RadioButton rad21 = (RadioButton) findViewById(R.id.A3);
                rad21.setText("Twitter");//yes

                TextView b2 = (TextView) findViewById(R.id.Q2);
                b2.setText("2. Who is Mark Zuckenburg?");
                RadioButton rad22 = (RadioButton) findViewById(R.id.B1);
                rad22.setText("Founder of Apple");
                RadioButton rad23 = (RadioButton) findViewById(R.id.B2);
                rad23.setText("Founder of Twitter ");
                RadioButton rad24 = (RadioButton) findViewById(R.id.B3);
                rad24.setText("Founder of Facebook");//yes

                TextView b3 = (TextView) findViewById(R.id.Q3);
                b3.setText("3. You are writing a message on twitter-what is the maximum number of characters you can use?");
                RadioButton rad25 = (RadioButton) findViewById(R.id.C1);
                rad25.setText("140");//yes
                RadioButton rad26 = (RadioButton) findViewById(R.id.C2);
                rad26.setText("120");
                RadioButton rad27 = (RadioButton) findViewById(R.id.C3);
                rad27.setText("160");

                TextView b4 = (TextView) findViewById(R.id.Q4);
                b4.setText("4. Which social media platform has a search feature called graph?");
                RadioButton rad28 = (RadioButton) findViewById(R.id.D1);
                rad28.setText("Google+");
                RadioButton rad29 = (RadioButton) findViewById(R.id.D2);
                rad29.setText("LinkedInb");
                RadioButton rad30 = (RadioButton) findViewById(R.id.D3);
                rad30.setText("Facebook");//yes

                TextView b5 = (TextView) findViewById(R.id.Q5);
                b5.setText("5.Social Network sites use which media for communication?");
                RadioButton rad31 = (RadioButton) findViewById(R.id.E1);
                rad31.setText(" Video");
                RadioButton rad32 = (RadioButton) findViewById(R.id.E2);
                rad32.setText(" Audio");
                RadioButton rad33 = (RadioButton) findViewById(R.id.E3);
                rad33.setText("All of the above");//yes


                TextView b6 = (TextView) findViewById(R.id.Q6);
                b6.setText("6. Who founded Twitter?");
                RadioButton rad34 = (RadioButton) findViewById(R.id.F1);
                rad34.setText("Tom Anderson");
                RadioButton rad35 = (RadioButton) findViewById(R.id.F2);
                rad35.setText("Four");//yes
                RadioButton rad36 = (RadioButton) findViewById(R.id.F3);
                rad36.setText("Rupert Murdoch");
                break;

            //question mathematics
            case "mathematics":
                q3 = true;
                getSupportActionBar().setTitle("Maths quiz");

                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                TextView c1 = (TextView) findViewById(R.id.Q1);
                c1.setText("1. Question 1. 19 + ……. = 42");
                RadioButton rad37 = (RadioButton) findViewById(A1);
                rad37.setText("23.");//yes
                RadioButton rad38 = (RadioButton) findViewById(A2);
                rad38.setText("61");
                RadioButton rad39 = (RadioButton) findViewById(R.id.A3);
                rad39.setText("42");

                TextView c2 = (TextView) findViewById(R.id.Q2);
                c2.setText("2.  Question 2. What is the symbol of pi?");
                RadioButton rad40 = (RadioButton) findViewById(R.id.B1);
                rad40.setText("€");
                RadioButton rad41 = (RadioButton) findViewById(R.id.B2);
                rad41.setText("p");//yes
                RadioButton rad42 = (RadioButton) findViewById(R.id.B3);
                rad42.setText(" O");

                TextView c3 = (TextView) findViewById(R.id.Q3);
                c3.setText("3. Question 3. Arrange the numbers in ascending order: 36, 12, 29, 21, 7.");
                RadioButton rad43 = (RadioButton) findViewById(R.id.C1);
                rad43.setText("36, 29, 21, 12, 7");
                RadioButton rad44 = (RadioButton) findViewById(R.id.C2);
                rad44.setText("36, 29, 7, 21, 12");
                RadioButton rad45 = (RadioButton) findViewById(R.id.C3);
                rad45.setText("7, 12, 21, 29, 36");//yes

                TextView c4 = (TextView) findViewById(R.id.Q4);
                c4.setText("4. Question 5. How much is 90 – 19?");
                RadioButton rad46 = (RadioButton) findViewById(R.id.D1);
                rad46.setText("71");//yes
                RadioButton rad47 = (RadioButton) findViewById(R.id.D2);
                rad47.setText("109");
                RadioButton rad48 = (RadioButton) findViewById(R.id.D3);
                rad48.setText("89");

                TextView c5 = (TextView) findViewById(R.id.Q5);
                c5.setText("5. Question 8. What is the smallest three digit number?");
                RadioButton rad49 = (RadioButton) findViewById(R.id.E1);
                rad49.setText("111");
                RadioButton rad50 = (RadioButton) findViewById(R.id.E2);
                rad50.setText("100");//yes
                RadioButton rad51 = (RadioButton) findViewById(R.id.E3);
                rad51.setText("999");

                TextView c6 = (TextView) findViewById(R.id.Q6);
                c6.setText("6. Question 9. How much is 190 – 87 + 16?");
                RadioButton rad52 = (RadioButton) findViewById(R.id.F1);
                rad52.setText("119.");//yes
                RadioButton rad53 = (RadioButton) findViewById(R.id.F2);
                rad53.setText("87");
                RadioButton rad54 = (RadioButton) findViewById(R.id.F3);
                rad54.setText("103");

                break;
            //questions for politics

            case "politics":
                q4 = true;
                getSupportActionBar().setTitle("Politics quiz");

                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                TextView d1 = (TextView) findViewById(R.id.Q1);
                d1.setText("1. Which among these leaders was not a South African president ?");
                RadioButton rad55 = (RadioButton) findViewById(A1);
                rad55.setText("Jacob Zuma");
                RadioButton rad56 = (RadioButton) findViewById(A2);
                rad56.setText("Chaka Zulu");//yes
                RadioButton rad57 = (RadioButton) findViewById(R.id.A3);
                rad57.setText("FW de Klerk");

                TextView d2 = (TextView) findViewById(R.id.Q2);
                d2.setText("2.  Which of these is not a South African political party ?");
                RadioButton rad58 = (RadioButton) findViewById(R.id.B1);
                rad58.setText("DA");
                RadioButton rad59 = (RadioButton) findViewById(R.id.B2);
                rad59.setText("ODM");//yes
                RadioButton rad60 = (RadioButton) findViewById(R.id.B3);
                rad60.setText("PAC");

                TextView d3 = (TextView) findViewById(R.id.Q3);
                d3.setText("3.Who was elected President in 1994?");
                RadioButton rad61 = (RadioButton) findViewById(R.id.C1);
                rad61.setText("Jacob Zuma");
                RadioButton rad62 = (RadioButton) findViewById(R.id.C2);
                rad62.setText("Robert Mugabe");
                RadioButton rad63 = (RadioButton) findViewById(R.id.C3);
                rad63.setText("Nelson Mandela");//YES

                TextView d4 = (TextView) findViewById(R.id.Q4);
                d4.setText("4. Which is the current ruling party of South African government as of (July 2013)");
                RadioButton rad64 = (RadioButton) findViewById(R.id.D1);
                rad64.setText("ANC");//YES
                RadioButton rad65 = (RadioButton) findViewById(R.id.D2);
                rad65.setText("ACDP");
                RadioButton rad66 = (RadioButton) findViewById(R.id.D3);
                rad66.setText("EFF");

                TextView d5 = (TextView) findViewById(R.id.Q5);
                d5.setText("5. Which are capital cities of South Africa?");
                RadioButton rad67 = (RadioButton) findViewById(R.id.E1);
                rad67.setText("Polokwane");
                RadioButton rad68 = (RadioButton) findViewById(R.id.E2);
                rad68.setText("pretoria");//YES
                RadioButton rad69 = (RadioButton) findViewById(R.id.E3);
                rad69.setText("Bloemfontein");

                TextView d6 = (TextView) findViewById(R.id.Q6);
                d6.setText("6. What is the smallest (in land mass) province in SA?");
                RadioButton rad70 = (RadioButton) findViewById(R.id.F1);
                rad70.setText("Gauteng");//YES
                RadioButton rad71 = (RadioButton) findViewById(R.id.F2);
                rad71.setText("Limpopo");
                RadioButton rad72 = (RadioButton) findViewById(R.id.F3);
                rad72.setText("KZN");
                break;

        }
    }

    //TOP BACK BUTTON
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // int id = item.getItemId();
        if (item.getItemId() == android.R.id.home)
        {

            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    //========================================

    String qsn_names1, qsn_names2, qsn_names3, qsn_names4, qsn_names5, qsn_names6;
    String qsn_text1, qsn_text2, qsn_text3, qsn_text4, qsn_text5, qsn_text6;

    public void question1(View v)
    {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundclick);

        if (q1 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {

                case A2:

                    if (checked)
                    {
                        i1= 1;
                        pic1 = "yes";

                        mp.start();

                        qsn_names1 = ((RadioButton) v).getText().toString();

                        TextView myEditText =  (TextView) findViewById(R.id.Q1);
                        qsn_text1= myEditText.getText().toString();

                    }
                    break;
                default:
                    i1=0;
                    pic1 = "no";
                    mp.start();
                    qsn_names1 = ((RadioButton) v).getText().toString();
                    TextView myEditText =  (TextView) findViewById(R.id.Q1);
                    qsn_text1= myEditText.getText().toString();
                    break;

            }
        } else if (q2 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.A3:

                    if (checked)
                    {
                        i1= 1;
                        pic1 = "yes";
                        mp.start();
                        TextView myEditText =  (TextView) findViewById(R.id.Q1);
                        qsn_text1= myEditText.getText().toString();
                        qsn_text1= myEditText.getText().toString();
                    }
                    break;

                default:
                    i1= 0;
                    pic1 = "no";
                    mp.start();
                    TextView myEditText =  (TextView) findViewById(R.id.Q1);
                    qsn_text1= myEditText.getText().toString();
                    qsn_names1 = ((RadioButton) v).getText().toString();
                    break;
            }
        } else if (q3 == true) {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case A1:

                    if (checked)
                    {
                        i1= 1;
                        pic1 = "yes";
                        mp.start();
                        TextView myEditText =  (TextView) findViewById(R.id.Q1);
                        qsn_text1= myEditText.getText().toString();
                        qsn_names1 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i1= 0;
                    pic1 = "no";
                    mp.start();
                    TextView myEditText =  (TextView) findViewById(R.id.Q1);
                    qsn_text1= myEditText.getText().toString();

                    qsn_names1 = ((RadioButton) v).getText().toString();
                    break;

            }
        }else if (q4 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case A2:

                    if (checked)
                    {
                        i1= 1;
                        pic1 = "yes";
                        mp.start();
                        TextView myEditText = (TextView) findViewById(R.id.Q1);
                        qsn_text1 = myEditText.getText().toString();
                        qsn_names1 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i1= 0;
                    pic1 = "no";
                    mp.start();
                    TextView myEditText = (TextView) findViewById(R.id.Q1);
                    qsn_text1 = myEditText.getText().toString();

                    qsn_names1 = ((RadioButton) v).getText().toString();
                    break;

            }
        }
    }


    public void question2(View v)
    {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundclick);
        if (q1 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.B2:

                    if (checked)
                    {
                        i2= 1;
                        pic2 = "yes";
                        mp.start();
                        qsn_names2 = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i2= 0;
                    pic2 = "no";
                    mp.start();
                    qsn_names2 = ((RadioButton) v).getText().toString();
                    break;

            }
        } else if (q2 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.B2:

                    if (checked)
                    {
                        i2= 1;
                        pic2 = "yes";
                        mp.start();
                        qsn_names2 = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i2= 0;
                    pic2 = "no";
                    mp.start();
                    qsn_names2 = ((RadioButton) v).getText().toString();
                    break;
            }
        } else if (q3 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.B3:

                    if (checked)
                    {
                        i2= 1;
                        pic2 = "yes";
                        mp.start();
                        qsn_names2 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i2= 0;
                    pic2 = "no";
                    mp.start();
                    qsn_names2 = ((RadioButton) v).getText().toString();
                    break;


            }
        } else if (q4 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.B2:

                    if (checked)
                    {
                        i2= 1;
                        pic2 = "yes";
                        mp.start();
                        qsn_names2 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i2= 0;
                    pic2 = "no";
                    mp.start();
                    qsn_names2 = ((RadioButton) v).getText().toString();
                    break;


            }
        }
    }


    public void question3(View v)
    {

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundclick);

        if (q1 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.C2:

                    if (checked)
                    {
                        i3= 1;
                        pic3 = "yes";
                        mp.start();
                        qsn_names3 = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i3= 0;
                    pic3 = "no";
                    mp.start();
                    qsn_names3 = ((RadioButton) v).getText().toString();
                    break;

            }
        } else if (q2 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.C1:

                    if (checked)
                    {
                        i3= 1;
                        pic3 = "yes";
                        mp.start();
                        qsn_names3 = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i3= 0;
                    pic3 = "no";
                    mp.start();
                    qsn_names3 = ((RadioButton) v).getText().toString();
                    break;
            }
        } else if (q3 == true)
            {
                boolean checked = ((RadioButton) v).isChecked();
                switch (v.getId())
                {
                    case R.id.C3:

                        if (checked)
                        {
                            i3= 1;
                            pic3 = "yes";
                            mp.start();
                            qsn_names3 = ((RadioButton) v).getText().toString();
                        }
                        break;


                    default:
                        i3= 0;
                        pic3 = "no";
                        mp.start();
                        qsn_names3 = ((RadioButton) v).getText().toString();
                        break;


            }

        }else if (q4 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.A3:

                    if (checked)
                    {
                        i3= 1;
                        pic3 = "yes";
                        mp.start();
                        qsn_names3 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i3= 0;
                    pic3 = "no";
                    mp.start();
                    qsn_names3 = ((RadioButton) v).getText().toString();
                    break;


            }
        }
    }


    public void question4(View v)
    {

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundclick);

        if (q1 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.D1:

                    if (checked)
                    {
                        i4= 1;
                        pic4 = "yes";
                        mp.start();
                        qsn_names4 = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i4= 0;
                    pic4 = "no";
                    mp.start();
                    qsn_names4 = ((RadioButton) v).getText().toString();
                    break;

            }
        } else if (q2 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.D3:

                    if (checked)
                    {
                        i4= 1;
                        pic4 = "yes";
                        mp.start();
                        qsn_names4 = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i4= 0;
                    pic4 = "no";
                    mp.start();
                    qsn_names4 = ((RadioButton) v).getText().toString();
                    break;
            }
        } else if (q3 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.D1:

                    if (checked)
                    {
                        i4= 1;
                        pic4 = "yes";
                        mp.start();
                        qsn_names4 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i4= 0;
                    pic4 = "no";
                    mp.start();
                    qsn_names4 = ((RadioButton) v).getText().toString();
                    break;


            }
        }else if (q4 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.D1:

                    if (checked)
                    {
                        i4= 1;
                        pic4 = "yes";
                        mp.start();
                        qsn_names4 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i4= 0;
                    pic4 = "no";
                    mp.start();
                    qsn_names4 = ((RadioButton) v).getText().toString();
                    break;


            }
        }

    }


    public void question5(View v)
    {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundclick);
        if (q1 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.E3:

                    if (checked)
                    {
                        i5= 1;
                        pic5 = "yes";
                        mp.start();
                        qsn_names5 = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i5= 0;
                    pic5 = "no";
                    mp.start();
                    qsn_names5 = ((RadioButton) v).getText().toString();
                    break;

            }
        } else if (q2 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.E3:

                    if (checked)
                    {
                        i5= 1;
                        pic5 = "yes";
                        mp.start();
                        qsn_names5 = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i5= 0;
                    pic5 = "no";
                    mp.start();
                    qsn_names5 = ((RadioButton) v).getText().toString();
                    break;
            }
        } else if (q3 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.E2:

                    if (checked)
                    {
                        i5= 1;
                        pic5 = "yes";
                        mp.start();
                        qsn_names5 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i5=0;
                    pic5 = "no";
                    mp.start();
                    qsn_names5 = ((RadioButton) v).getText().toString();
                    break;

            }

        } else if (q4 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.E2:

                    if (checked)
                    {
                        i5= 1;
                        pic5 = "yes";
                        mp.start();
                        qsn_names5 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i5=0;
                    pic5 = "no";
                    mp.start();
                    qsn_names5 = ((RadioButton) v).getText().toString();
                    break;

            }
        }
    }


    public void question6(View v)
    {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundclick);

        if (q1 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.F1:

                    if (checked)
                    {
                        i6= 1;
                        pic6 = "yes";
                        mp.start();
                        qsn_names6 = ((RadioButton) v).getText().toString();
                    }
                    break;
                default:
                    i6= 0;
                    pic6 = "no";
                    mp.start();
                    qsn_names6 = ((RadioButton) v).getText().toString();
                    break;

            }
        } else if (q2 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.F2:

                    if (checked)
                    {
                        i6= 1;
                        pic6 = "yes";
                        mp.start();
                        qsn_names6 = ((RadioButton) v).getText().toString();
                    }
                    break;

                default:
                    i6= 0;
                    pic6 = "no";
                    mp.start();
                    qsn_names6 = ((RadioButton) v).getText().toString();
                    break;
            }
        } else if (q3 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.F1:

                    if (checked)
                    {
                        i6=1;
                        pic6 = "yes";
                        mp.start();
                        qsn_names6 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i6= 0;
                    pic6 = "no";
                    mp.start();
                    qsn_names6 = ((RadioButton) v).getText().toString();
                    break;


            }

        } else if (q4 == true)
        {
            boolean checked = ((RadioButton) v).isChecked();
            switch (v.getId())
            {
                case R.id.F1:

                    if (checked)
                    {
                        i6= 1;;
                        pic6 = "yes";
                        mp.start();
                        qsn_names6 = ((RadioButton) v).getText().toString();
                    }
                    break;


                default:
                    i6= 0;
                    pic6 = "no";
                    mp.start();
                    qsn_names6 = ((RadioButton) v).getText().toString();
                    break;


            }
        }


        answer = i1+i2+i3+i4+i5+i6;
            //score condition
        if (answer >= 3)
        {
            score = "passed";
            picresults = "win";
        }
        else
        {


            score = "failed";
        picresults = "lose";
        }

/*

//sound app

        Button one = (Button)this.findViewById(A1);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.soundclick);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
        */
    }





        //picture results


    public void submit(View v)
    {


        //input radio button validation
        //======================================
        RadioGroup vd_group1 = (RadioGroup) findViewById(R.id.grp1);
        RadioGroup  vd_group2 = (RadioGroup) findViewById(R.id.grp2);
        RadioGroup  vd_group3  = (RadioGroup) findViewById(R.id.grp3);
        RadioGroup  vd_group4  = (RadioGroup) findViewById(R.id.grp4);
        RadioGroup  vd_group5  = (RadioGroup) findViewById(R.id.grp5);
        RadioGroup  vd_group6 = (RadioGroup) findViewById(R.id.grp6);




        int vd_name1 = vd_group1.getCheckedRadioButtonId();
        int vd_name2 = vd_group2.getCheckedRadioButtonId();
        int vd_name3 = vd_group3.getCheckedRadioButtonId();
        //
        int vd_name4 = vd_group4.getCheckedRadioButtonId();
        int vd_name5 = vd_group5.getCheckedRadioButtonId();
        int vd_name6 = vd_group6.getCheckedRadioButtonId();

        if (vd_name1 != -1 && vd_name2 != -1 && vd_name3 != -1 && vd_name4!=-1&&vd_name5!=-1&&vd_name6!=-1)
        {

            Intent intent = new Intent(this, Results.class);
            //display score
            intent.putExtra("answer", answer );
            intent.putExtra("score",score);

            intent.putExtra("name_1",qsn_names1);
            intent.putExtra("name_2", qsn_names2);
            intent.putExtra("name_3", qsn_names3);
            //=================
            intent.putExtra("name_4", qsn_names4);
            intent.putExtra("name_5", qsn_names5);
            intent.putExtra("name_6", qsn_names6);

            //questions names
            intent.putExtra("Q1", qsn_text1);

            //==============================
            intent.putExtra("pic1",pic1);
            intent.putExtra("pic2",pic2);
            intent.putExtra("pic3",pic3);
            intent.putExtra("pic4",pic4);
            intent.putExtra("pic5",pic5);
            intent.putExtra("pic6",pic6);
            intent.putExtra("quiz",quiz);
            intent.putExtra("pic_results",picresults);

            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Answer All Questions", Toast.LENGTH_LONG).show();
        }

    }


}
