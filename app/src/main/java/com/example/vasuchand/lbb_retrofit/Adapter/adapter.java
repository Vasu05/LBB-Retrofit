package com.example.vasuchand.lbb_retrofit.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vasuchand.lbb_retrofit.R;
import com.example.vasuchand.lbb_retrofit.data;
import com.example.vasuchand.lbb_retrofit.model_address;
import com.example.vasuchand.lbb_retrofit.model_ids;

import java.io.IOException;
import java.util.List;

/**
 * Created by Vasu Chand on 5/8/2017.
 */

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    private List<model_address> model_addresses;
    private List<model_ids> model_idses;
    private List<data> model_data;
    private Context mContext;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView t1, t2,t3,t4,p1,p2,p3;
        ImageView imageView;
        protected RecyclerView recycler_view_list;


        public MyViewHolder(View view) {
            super(view);
            t1 = (TextView)view.findViewById(R.id.nameofperson);
            t2 = (TextView)view.findViewById(R.id.gender);
            t3 = (TextView)view.findViewById(R.id.emailofperson);
            t4 = (TextView)view.findViewById(R.id.addressofperson);
            p1 = (TextView)view.findViewById(R.id.homenumberofperson);
            p2 = (TextView)view.findViewById(R.id.officenumberofperson);
            p3 = (TextView)view.findViewById(R.id.mobilenumberofperson);



        }

    }



    public adapter(Context context, List<data> moviesList,List<model_ids>ids , List<model_address>addresses)
    {

        this.mContext = context;
        this.model_data = moviesList;
        this.model_idses = ids;
        this.model_addresses = addresses;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items, parent, false);


        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        data data = model_data.get(position);
        holder.t1.setText(data.getName());
        holder.t2.setText(data.getGender());
        holder.t3.setText(data.getEmail());


        int index=-1;

        for (int i = 0; i < model_idses.size(); i++) {

             if(model_idses.get(i).getResults().equals(data.getId()))
                 index = i;
        }

        System.out.println(index + " " +data.getId());

        if(index!=-1 && index<8)
        {
            model_address address = model_addresses.get(index);
            holder.t4.setText(address.getAddress());
            holder.p1.setText(address.getMobile().getHome());
            holder.p2.setText(address.getMobile().getOffice());
            //System.out.println(data.getName()+ " " +position);
            //System.out.println(address.getMobile().getMobile().getMobile());
            holder.p3.setText(address.getMobile().getMobile().getMobile());
        }


    }


    @Override
    public int getItemCount() {
        return model_data.size();
    }


}
