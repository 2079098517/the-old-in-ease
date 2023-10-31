package com.example.test;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class zhanshi extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiangqing);

        Bundle bundle=getIntent().getExtras();
        int id=bundle.getInt("photo");
        String title=bundle.getString("title");
        ImageView imageView=(ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(id);
        TextView t2=(TextView) findViewById(R.id.textView);
        t2.setText(title);


    }

}