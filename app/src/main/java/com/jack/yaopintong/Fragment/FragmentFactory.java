package com.jack.yaopintong.Fragment;

import android.support.v4.app.Fragment;

import com.jack.yaopintong.R;

/**
 * Created by JackCheung on 2016/8/20.
 * 此类是用于供mainActivity调用，用于碎片的切换
 */
public class FragmentFactory {
    private  static Fragment fragment;
    public  static Fragment createFragment(int checkedId){
        switch (checkedId){
            case R.id.radioButton_home:
                fragment=new HomeFragment();
                break;
            case R.id.radioButton_type:
                fragment=new TypeFragment();
                break;
            case R.id.radioButton_near:
                fragment=new NearFragment();
                break;
            case R.id.radioButton_mine:
                fragment=new NearFragment();
                break;
        }


        return fragment;
    }
}
