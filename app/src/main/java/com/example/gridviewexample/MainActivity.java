package com.example.gridviewexample;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    GridView grid1;

    int icons[]=
            {
                    R.drawable.a,
                    R.drawable.b,
                    R.drawable.c,
                    R.drawable.d,
                    R.drawable.e,
                    R.drawable.f,
                    R.drawable.g,
                    R.drawable.h,
                    R.drawable.i
            };
    String name[]={"HTML","JAVA","JSP","PHP","PYTHON","SQL","ANDROID","ANGULAR","C++"};


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("GridView Demo");

        grid1=(GridView)findViewById(R.id.g1);

grid obj=new grid(this,name,icons);
        grid1.setAdapter(obj);
    }
}