package edu.psu.ist.fitnesst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   // ListView lvWorkout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        //lvWorkout= (ListView)findViewById(R.id.dashboard);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener((View.OnClickListener) this);
      //  ArrayList<String> arrayList = new ArrayList<>();

       // arrayList.add("push");
      //  arrayList.add("pull");

       // ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
       // lvWorkout.setAdapter(arrayAdapter);


    }
    @Override
    public void onClick(View view) {
        setContentView(R.layout.view_workout);
    }

}