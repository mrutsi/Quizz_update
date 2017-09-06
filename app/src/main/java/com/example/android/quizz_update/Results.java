package com.example.android.quizz_update;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Results extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        //Declaration Of ImageView
        ImageView view1 = (ImageView)findViewById(R.id.pic1);
        ImageView view2 = (ImageView)findViewById(R.id.pic2);
        ImageView view3 = (ImageView)findViewById(R.id.pic3);
        ImageView view4= (ImageView)findViewById(R.id.pic4);
        ImageView view5 = (ImageView)findViewById(R.id.pic5);
        ImageView view6 = (ImageView)findViewById(R.id.pic6);
        ImageView viewpicresults=(ImageView) findViewById(R.id.resultspic);

        //Declaration of answers

        TextView answ1 = (TextView)findViewById(R.id.ans1);
        TextView answ2 = (TextView)findViewById(R.id.ans2);
        TextView answ3 = (TextView)findViewById(R.id.ans3);
        TextView answ4 = (TextView)findViewById(R.id.ans4);
        TextView answ5 = (TextView)findViewById(R.id.ans5);
        TextView answ6 = (TextView)findViewById(R.id.ans6);



        //DISPLAY RESULTS
        //===========================

        Intent mIntent = getIntent();
        int v_answer= mIntent.getIntExtra("answer",0);
        String v_name1 = mIntent.getStringExtra("name_1");
        String v_name2 = mIntent.getStringExtra("name_2");
        String v_name3 = mIntent.getStringExtra("name_3");
        String v_name4 = mIntent.getStringExtra("name_4");
        String v_name5 = mIntent.getStringExtra("name_5");
        String v_name6 = mIntent.getStringExtra("name_6");
        String v_name7 = mIntent.getStringExtra("score");
        String Quiz = mIntent.getStringExtra("quiz");
        String Q1 = mIntent.getStringExtra("Q1");

        switch(Quiz) {
            case "cars":
                getSupportActionBar().setTitle("Cars quiz Results");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
            case "mathematics":
                getSupportActionBar().setTitle("Maths quiz Results");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
            case "computer":
                getSupportActionBar().setTitle("Computer quiz Results");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
            case "politics":
                getSupportActionBar().setTitle("Politics quiz Results");
                getSupportActionBar().setDisplayShowHomeEnabled(true);
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                break;
        }

        //====================================
        String pic_v1 = mIntent.getStringExtra("pic1");
        String pic_v2 = mIntent.getStringExtra("pic2");
        String pic_v3 = mIntent.getStringExtra("pic3");
        String pic_v4 = mIntent.getStringExtra("pic4");
        String pic_v5 = mIntent.getStringExtra("pic5");
        String pic_v6 = mIntent.getStringExtra("pic6");
        String pic_v7 = mIntent.getStringExtra("pic_results");




        String answr  = String.format("%d",v_answer);



        TextView quizresults = (TextView) findViewById(R.id.score_text);
        quizresults.setText("your results are " + answr + "/6 you " + v_name7 );




        answ1.setText("Qestion 1:\n "+ v_name1 +"\n\n");
        answ2.setText("Qestion 2:\n " + v_name2 +"\n\n");
        answ3.setText("Qestion 3: \n" + v_name3 +"\n\n");
        answ4.setText("Qestion 4: \n" + v_name4 +"\n\n");
        answ5.setText("Qestion 5: \n" + v_name5 +"\n\n");
        answ6.setText("Qestion 6: \n" + v_name6 +"\n\n");




        switch(pic_v1){
            case "yes":
                view1.setImageResource(R.drawable.yes);
                break;
            default:
                view1.setImageResource(R.drawable.no);
                break;
        }
        switch(pic_v2){
            case "yes":
                view2.setImageResource(R.drawable.yes);
                break;
            default:
                view2.setImageResource(R.drawable.no);
                break;
        }
        switch(pic_v3){
            case "yes":
                view3.setImageResource(R.drawable.yes);
                break;
            default:
                view3.setImageResource(R.drawable.no);
                break;
        }
        switch(pic_v4){
            case "yes":
                view4.setImageResource(R.drawable.yes);
                break;
            default:
                view4.setImageResource(R.drawable.no);
                break;
        }
        switch(pic_v5){
            case "yes":
                view5.setImageResource(R.drawable.yes);
                break;
            default:
                view5.setImageResource(R.drawable.no);
                break;
        }
        switch(pic_v6){
            case "yes":
                view6.setImageResource(R.drawable.yes);
                break;
            default:
                view6.setImageResource(R.drawable.no);
                break;
        }
switch (pic_v7)
{
    case "win":
        viewpicresults.setImageResource(R.drawable.win);
        break;

    case "well":
            viewpicresults.setImageResource(R.drawable.well);
            break;

    default:
        viewpicresults.setImageResource(R.drawable.lose);
        break;
}



    }

    //back to main menu
    public void menu(View view){
        Intent intent = new Intent(Results.this,MainActivity.class);
   startActivity(intent);
    }

    /*exit button
    public void exit(View view){
        Toast.makeText(this, "Thank You for using kasi quiz", Toast.LENGTH_SHORT).show();
    }
*/


//exit button

    public void Dialog(View view){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Results.this);

        alertDialog.setTitle("EXIT");
        alertDialog.setMessage("Are Sure You Want Close");
        alertDialog.setPositiveButton("YES ", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {

            }
        });
        alertDialog.setNegativeButton("NO ", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
            }
        });alertDialog.show();

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



}
