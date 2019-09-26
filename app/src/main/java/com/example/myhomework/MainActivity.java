package com.example.myhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv_us);

        ArrayList<get_set_adabter> ss = new ArrayList<>();
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));
        ss.add(new get_set_adabter(R.drawable.ic_launcher_background,"Emirates "));

        RecyclerviewAdapter adapter = new RecyclerviewAdapter(ss);
        rv.setAdapter(adapter);
        RecyclerView.LayoutManager lm = new GridLayoutManager(this,2);
        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);





    }
}
