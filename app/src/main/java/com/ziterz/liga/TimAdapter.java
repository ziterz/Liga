package com.ziterz.liga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by ziter on 5/27/2017.
 */

public class TimAdapter extends BaseAdapter {

    Context context;
    ArrayList<Tim> timArrayList;

    public TimAdapter(Context context, ArrayList<Tim> timArrayList) {
        this.context = context;
        this.timArrayList = timArrayList;
    }

    @Override
    public int getCount() {
        return timArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return timArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = new ViewHolder();

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.tim_item, null);

            holder.logo = (ImageView) view.findViewById(R.id.logo);
            holder.nama_lengkap = (TextView) view.findViewById(R.id.nama_lengkap);
            holder.nama_singkat = (TextView) view.findViewById(R.id.nama_singkat);

            Tim tim = timArrayList.get(position);

            holder.nama_lengkap.setText(tim.getNamaLengkap());
            holder.nama_singkat.setText(tim.getNamaSingkat());
            Picasso.with(context).load(tim.getUrlLogo()).into(holder.logo);
        }

        return view;
    }

    static class ViewHolder {
        ImageView logo;
        TextView nama_singkat, nama_lengkap;
    }
}
