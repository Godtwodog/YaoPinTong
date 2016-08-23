package com.jack.yaopintong.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jack.yaopintong.Activity.MapActivity;
import com.jack.yaopintong.R;



/**
 * Created by JackCheung on 2016/8/19.
 * 秘钥：NeGBy4tzbQn4TLFCmncX9vRaNHGqWTA5
 */
public class NearFragment extends Fragment {
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 0:
                    Intent intent=new Intent();
                    intent.setClass(getActivity(),MapActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        handler.sendEmptyMessageDelayed(0,1000);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_near, container, false);
        return view;
    }

}
