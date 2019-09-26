package com.example.myhomework;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter <RecyclerviewAdapter.MY_Holder>{

    ArrayList<get_set_adabter> std ;
    public RecyclerviewAdapter(ArrayList<get_set_adabter> std) {
        this.std = std;
    }

    @NonNull
    @Override
    public MY_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.di_rv,null);
        MY_Holder holder = new MY_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MY_Holder my_holder, int i) {
        get_set_adabter a = std.get(i);

        my_holder.tv_1.setText(a.getText());
        my_holder.imag_1.setImageResource(a.getImag());


    }

    @Override
    public int getItemCount() {
        return std.size();
    }

    class MY_Holder extends RecyclerView.ViewHolder{

        TextView tv_1 ;
        ImageView imag_1 ;
        public MY_Holder(@NonNull View itemView) {
            super(itemView);
            tv_1 = itemView.findViewById(R.id.text_1);
            imag_1 = itemView.findViewById(R.id.imag1);

        }
    }
}