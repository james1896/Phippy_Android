package com.tiffany.phippy.me;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.tiffany.phippy.base.BaseFragment;
import com.tiffany.phippy.R;

/**
 * Created by moses on 09/06/2017.
 */

public class MeFragment extends BaseFragment {

    @Override
    public int getContentView() {
        return R.layout.fragment_me;
    }


    @Override
    public void init() {
        ListView listview = (ListView) contentView.findViewById(R.id.me_listview);

        LinearLayout mLoadingLayout = (LinearLayout) View.inflate(getContext(), R.layout.me_header, null);

//        TextView headerText = (TextView) mLoadingLayout.findViewById(R.id.header_text);
//        headerText.setText("猜你喜欢");
        listview.addHeaderView(mLoadingLayout);
        listview.setAdapter(new MeListAdapter(getContext(),null));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 7:{
                        Intent intent = new Intent(getActivity(),DBDebugActivity.class);
                        startActivity(intent);
                        break;
                    }
                    default:
                        Log.e("点击",""+i);
                }
            }
        });
    }
}
