package com.example.android.quizz_update;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    String categories;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void Cars(View v){
        categories = "cars";
        Intent i = new Intent(getApplicationContext(),quizActivity.class);
        i.putExtra("quiz",categories);
        startActivity(i);
        Toast.makeText(this, "Motors.....", Toast.LENGTH_SHORT).show();
    }


    public void Mathematics(View v){

        categories = "mathematics";
        Intent m  = new Intent(getApplicationContext(),quizActivity.class);
        m.putExtra("quiz", categories);
        startActivity(m);
        Toast.makeText(this, "mathematics.....", Toast.LENGTH_SHORT).show();
    }

    public void Computer(View v){

        categories = "computer";
        Intent l  = new Intent(getApplicationContext(),quizActivity.class);
        l.putExtra("quiz", categories);
        startActivity(l);
        Toast.makeText(this, "Social Media...", Toast.LENGTH_SHORT).show();
    }

public void politics(View v){
    categories="politics";
    Intent d=new Intent(getApplicationContext(),quizActivity.class);
    d.putExtra("quiz",categories);
    startActivity(d);
    Toast.makeText(this,"politics...",Toast.LENGTH_SHORT).show();
}
}
