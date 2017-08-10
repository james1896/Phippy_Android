package com.tiffany.phippy.me.myAddress;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tiffany.phippy.PHIUserManager;
import com.tiffany.phippy.R;
import com.tiffany.phippy.base.BaseListAdapter1;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by moses on 27/06/2017.
 */

public class MyAddressListAdapter extends BaseListAdapter1 {


//    protected ArrayList<Map> dataList;

    public MyAddressListAdapter(Context context, ArrayList<Map> list) {
        super(context,list);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;

        Map<String,Object> map = this.dataList.get(position);

        if(convertView == null){
            convertView = mInflater.inflate(R.layout.myaddress_item, null);

            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.myaddress_item_name);
            holder.phoneNumber = (TextView) convertView.findViewById(R.id.myaddress_item_phone);
            holder.address = (TextView) convertView.findViewById(R.id.myaddress_item_address);
            holder.cancel = (TextView) convertView.findViewById(R.id.myaddress_item_cancel);
            holder.edit = (TextView) convertView.findViewById(R.id.myaddress_item_edit);
            holder.hline = (LinearLayout) convertView.findViewById(R.id.myaddress_item_hline);
            holder.vline = (LinearLayout) convertView.findViewById(R.id.myaddress_item_vline);

            holder.check = (ImageView) convertView.findViewById(R.id.myaddress_item_check);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        boolean selected = (boolean) map.get("selected");
        if(selected){
            holder.check.setVisibility(View.VISIBLE);
            setSelectedColor(holder);
        }else {
            holder.check.setVisibility(View.INVISIBLE);
            setUnselectedColor(holder);

        }
        holder.name.setText((String) map.get("name"));
        holder.phoneNumber.setText((String) map.get("phone"));
        holder.address.setText((String) map.get("address"));
        return convertView;
    }

    private void setSelectedColor(ViewHolder holder){

        holder.name.setTextColor(Color.parseColor("#696969"));
        holder.phoneNumber.setTextColor(Color.parseColor("#696969"));
        holder.address.setTextColor(Color.parseColor("#696969"));
        holder.cancel.setTextColor(Color.parseColor("#696969"));
        holder.edit.setTextColor(Color.parseColor("#696969"));
        holder.hline.setBackgroundColor(Color.parseColor("#696969"));
        holder.vline.setBackgroundColor(Color.parseColor("#696969"));
    }

    private void setUnselectedColor(ViewHolder holder){
        holder.name.setTextColor(Color.parseColor("#D3D3D3"));
        holder.phoneNumber.setTextColor(Color.parseColor("#D3D3D3"));
        holder.address.setTextColor(Color.parseColor("#D3D3D3"));
        holder.cancel.setTextColor(Color.parseColor("#D3D3D3"));
        holder.edit.setTextColor(Color.parseColor("#D3D3D3"));

        holder.hline.setBackgroundColor(Color.parseColor("#D3D3D3"));
        holder.vline.setBackgroundColor(Color.parseColor("#D3D3D3"));
    }

    public class ViewHolder{
        ImageView check;
        TextView name;
        TextView phoneNumber;
        TextView address;

        TextView cancel;
        TextView edit;

        LinearLayout hline;
        LinearLayout vline;
    }

}
