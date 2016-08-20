package com.jack.yaopintong.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jack.yaopintong.Help.MyImageButton;
import com.jack.yaopintong.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by  JackCheung  on 2016/8/19.
 */
public class HomeFragment extends Fragment {

    @Bind(R.id.imageButton_find)
    MyImageButton imageButtonFind;
    @Bind(R.id.imageButton_doctor)
    MyImageButton imageButtonDoctor;
    @Bind(R.id.imageButton_remind)
    MyImageButton imageButtonRemind;
    @Bind(R.id.imageButton_ill)
    MyImageButton imageButtonIll;
//    @Bind(R.id.toolbar_homeFragment)
//    Toolbar toolbarHomeFragment;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
    }

    private void initView() {
        //调用自定义imagebutton中的文字内容,字体大小，字体颜色等属性
        imageButtonFind.setText("扫码找药");
        imageButtonFind.setColor(Color.BLACK);
        imageButtonFind.setSize(22);
        imageButtonDoctor.setText("咨询医生");
        imageButtonDoctor.setColor(Color.BLACK);
        imageButtonDoctor.setSize(22);
        imageButtonRemind.setText("服药提醒");
        imageButtonRemind.setColor(Color.BLACK);
        imageButtonRemind.setSize(22);
        imageButtonIll.setText("对症下药");
        imageButtonIll.setColor(Color.BLACK);
        imageButtonIll.setSize(22);
        //因为fragment中不支持toolbar需要从activity中调用toolbar的一系列属性
//        AppCompatActivity activity= (AppCompatActivity) getActivity();
//        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        toolbarHomeFragment.setNavigationIcon(R.drawable.yaoxiang);
//        toolbarHomeFragment.setOverflowIcon(getResources().getDrawable(R.drawable.saoyisao));

    }
}
