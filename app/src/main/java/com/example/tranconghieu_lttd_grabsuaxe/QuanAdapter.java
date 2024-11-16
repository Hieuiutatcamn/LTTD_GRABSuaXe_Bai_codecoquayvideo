package com.example.tranconghieu_lttd_grabsuaxe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class QuanAdapter extends BaseAdapter {

    private Context context;

    public QuanAdapter(Context context, int layout, List<Quan> quanList) {
        this.context = context;
        this.layout = layout;
        this.quanList = quanList;
    }


    private int layout;
    private List<Quan> quanList;


    @Override
    public int getCount() {
        return quanList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtTen=(TextView) view.findViewById(R.id.ten_quan);
        TextView txtMota=(TextView) view.findViewById(R.id.mota_quan);
        ImageView imgHinh=(ImageView) view.findViewById(R.id.imageview_quan);

        Quan quan=quanList.get(i);

        txtTen.setText(quan.getTen());
        txtMota.setText(quan.getMoTa());
        imgHinh.setImageResource(quan.getHinh());

        return view;
    }
}
