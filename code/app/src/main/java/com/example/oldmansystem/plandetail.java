package com.example.oldmansystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class plandetail extends AppCompatActivity {

    private Button btn1;
    private ImageView img1;
    private Button btn2;
    private ImageView img2;
    private Button btn3;
    private ImageView img3;
    private Button btn4;
    private ImageView img4;

    public int TAG[]={1,1,1,1};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plandetail);

        btn1=findViewById(R.id.btn1);
        img1=findViewById(R.id.img1);
        btn2=findViewById(R.id.btn2);
        img2=findViewById(R.id.img2);
        btn3=findViewById(R.id.btn3);
        img3=findViewById(R.id.img3);
        btn4=findViewById(R.id.btn4);
        img4=findViewById(R.id.img4);

        btn1.setOnClickListener(v -> {
            TAG[0]++;
            if (TAG[0]%2==0){
                img1.setVisibility(View.VISIBLE);
            }else {
                img1.setVisibility(View.INVISIBLE);
            }
        });
        btn2.setOnClickListener(v -> {
            TAG[1]++;
            if (TAG[1]%2==0){
                img2.setVisibility(View.VISIBLE);
            }else {
                img2.setVisibility(View.INVISIBLE);
            }
        });
        btn3.setOnClickListener(v -> {
            TAG[2]++;
            if (TAG[2]%2==0){
                img3.setVisibility(View.VISIBLE);
            }else {
                img3.setVisibility(View.INVISIBLE);
            }
        });
        btn4.setOnClickListener(v -> {
            TAG[3]++;
            if (TAG[3]%2==0){
                img4.setVisibility(View.VISIBLE);
            }else {
                img4.setVisibility(View.INVISIBLE);
            }
        });
    }

}