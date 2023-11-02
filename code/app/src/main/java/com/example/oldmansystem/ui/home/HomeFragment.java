package com.example.oldmansystem.ui.home;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.oldmansystem.GameActivity;
import com.example.oldmansystem.IQtest;
import com.example.oldmansystem.R;
import com.example.oldmansystem.databinding.FragmentHomeBinding;
import com.example.oldmansystem.planself;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private Button btntest,btnaction,btnplan;
    private TextView textView1,textView2;
    private ImageView imgView1,imgView2;
    Uri url1 = Uri.parse("https://zhuanlan.zhihu.com/p/664461433");
    Uri url2 = Uri.parse("https://zhuanlan.zhihu.com/p/432066632");
    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.me_fragment,container,false  );
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //Bundle bundle =this.getArguments();
        btntest = view.findViewById(R.id.btntest);
        btnplan = view.findViewById(R.id.btnplan);
        btnaction = view.findViewById(R.id.btnaction);
        textView1 = view.findViewById(R.id.textView2);
        textView2 = view.findViewById(R.id.textView3);
        imgView1 = view.findViewById(R.id.imgView1);
        imgView2 = view.findViewById(R.id.imgView2);
        return view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        btntest = getActivity().findViewById(R.id.btntest);
        btnplan = getActivity().findViewById(R.id.btnplan);
        btnaction = getActivity().findViewById(R.id.btnaction);
        textView1 = getActivity().findViewById(R.id.textView2);
        textView2 = getActivity().findViewById(R.id.textView3);
        imgView1 = getActivity().findViewById(R.id.imgView1);
        imgView2 = getActivity().findViewById(R.id.imgView2);
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String data1 = getActivity().getIntent().getStringExtra("data1");
                Intent intent1 = new Intent(getActivity(),IQtest.class);
                //intent.putExtra("data1",data1);
                startActivity(intent1);
            }
        });

        btnplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent22 = new Intent(getActivity(), planself.class);
                startActivity(intent22);
            }
        });

        btnaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getActivity(),GameActivity.class);
                startActivity(intent2);
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW,url1);
                startActivity(intent3);
            }
        });

        imgView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Intent.ACTION_VIEW,url1);
                startActivity(intent4);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Intent.ACTION_VIEW,url2);
                startActivity(intent5);
            }
        });

        imgView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(Intent.ACTION_VIEW,url2);
                startActivity(intent6);
            }
        });


    }
}