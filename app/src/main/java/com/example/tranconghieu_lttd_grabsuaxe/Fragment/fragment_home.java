package com.example.tranconghieu_lttd_grabsuaxe.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.tranconghieu_lttd_grabsuaxe.Quan;
import com.example.tranconghieu_lttd_grabsuaxe.QuanAdapter;
import com.example.tranconghieu_lttd_grabsuaxe.R;

import java.util.ArrayList;

public class fragment_home extends Fragment {

    private View mview;
    ListView lvQuan;
    ArrayList<Quan> arrayQuans;
    QuanAdapter adapter;
    ImageView thongbao;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mview = inflater.inflate(R.layout.fragment_home_user, container, false);
        Anhxa();
        adapter= new QuanAdapter(getContext(),R.layout.dong_quan,arrayQuans);
        lvQuan.setAdapter(adapter);



        return mview;

    }

    private void Anhxa()
    {
        lvQuan=(ListView) mview.findViewById(R.id.list_quan);
        thongbao=(ImageView) mview.findViewById(R.id.ic_thongbao);
        arrayQuans= new ArrayList<>();
        arrayQuans.add(new Quan(R.drawable.quan_haichau,"Quận Hải châu","Khu vực với nhiều cửa hàng và chi nhánh sửa chữa"));
        arrayQuans.add(new Quan(R.drawable.quan_camle,"Quận Cẩm Lệ","Khu vực với nhiều cửa hàng và chi nhánh sửa chữa"));
        arrayQuans.add(new Quan(R.drawable.quan_lienchieu,"Quận liên chiều","Khu vực với nhiều cửa hàng và chi nhánh sửa chữa"));
        arrayQuans.add(new Quan(R.drawable.quan_thanhkhe,"Quận Thanh Khê","Khu vực với nhiều cửa hàng và chi nhánh sửa chữa"));
        arrayQuans.add(new Quan(R.drawable.quan_haichau,"Quận Hải châu","Khu vực với nhiều cửa hàng và chi nhánh sửa chữa"));
    }



//    private void AnhXa(){
//        lvQuan=(ListView) mview.findViewById(R.id.list_quan);
//        thongBao=(ImageView) mview.findViewById(R.id.ic_thongbao);
//        arrayQuan=new ArrayList<>();
//        arrayQuan.add(new Quan("Quận Hải Châu","Khu vực trung tâm với nhiều cửa hàng sửa chữa",R.drawable.quan_haichau));
//        arrayQuan.add(new Quan("Quận Liên Chiểu","Khu vực trung tâm với nhiều cửa hàng sửa chữa",R.drawable.quan_lienchieu));
//        arrayQuan.add(new Quan("Quận Cẩm Lệ","Khu vực trung tâm với nhiều cửa hàng sửa chữa",R.drawable.quan_camle));
//        arrayQuan.add(new Quan("Quận Thanh Khê","Khu vực trung tâm với nhiều cửa hàng sửa chữa",R.drawable.quan_thanhkhe));
//        arrayQuan.add(new Quan("Quận Thanh Khê","Khu vực trung tâm với nhiều cửa hàng sửa chữa",R.drawable.quan_thanhkhe));
//    }

}
