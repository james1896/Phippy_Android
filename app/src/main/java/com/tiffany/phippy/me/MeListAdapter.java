package com.tiffany.phippy.me;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tiffany.phippy.R;
import com.tiffany.phippy.adapter.BaseListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by moses on 27/06/2017.
 */

public class MeListAdapter extends BaseListAdapter {


//    protected ArrayList<Map> dataList;

    public MeListAdapter(Context context, ArrayList<Map> list) {
        super(context,list);
//        //根据context上下文加载布局，这里的是 本身，即this
//        this.mInflater = LayoutInflater.from(context);
        this.dataList = getDataList();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Map<String,Object> map = this.dataList.get(position);

        View item = mInflater.inflate(R.layout.me_listview_item, null);
        TextView titleTV = (TextView)item.findViewById(R.id.me_item_title);
//        TextView addressTV = (TextView)item.findViewById(R.id.food_list_item_address);
//        TextView current_priceTV = (TextView)item.findViewById(R.id.food_list_item_price);
//        TextView original_priceTV = (TextView)item.findViewById(R.id.food_list_item_price1);
//
//        TextView hotTV = (TextView)item.findViewById(R.id.food_list_item_hot);

//        ImageView img = (ImageView)item.findViewById(R.id.imageView);

        String titleStr = (String) map.get("title");
//        String addressStr = (String) map.get("add");
//        String current_priceStr = (String) map.get("current_price");
//        String original_priceStr = (String) map.get("original_price");
//        String hotStr = (String) map.get("hot");


        titleTV.setText(titleStr);
//        addressTV.setText(addressStr);
//        current_priceTV.setText(current_priceStr);
//        original_priceTV.setText(original_priceStr);
//        hotTV.setText(hotStr);

//        int resid = (int) map.get("resId");
//        img.setImageResource(resid);
        return item;
    }

    private ArrayList<Map> getDataList(){
        ArrayList<Map> list = new ArrayList<>();

        Map<String,Object> map1 = new HashMap<String,Object>();
        map1.put("title","我的收藏");
//        map1.put("resId",R.drawable.me_list_zengsong);

        list.add(map1);

        Map<String,Object> map2 = new HashMap<String,Object>();
        map2.put("title","我的订单");

        list.add(map2);

        Map<String,Object> map3 = new HashMap<String,Object>();
        map3.put("title","我的优惠券");
        list.add(map3);

        Map<String,Object> map4 = new HashMap<String,Object>();
        map4.put("title","我的钱包");

        list.add(map4);

        Map<String,Object> map5 = new HashMap<String,Object>();
        map5.put("title","我的游记");

        list.add(map5);

        return list;

    }
}
