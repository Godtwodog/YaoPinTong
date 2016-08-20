package com.jack.yaopintong.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.RadioGroup;
import com.jack.yaopintong.Fragment.FragmentFactory;
import com.jack.yaopintong.Help.BaseActivity;
import com.jack.yaopintong.R;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {
    private Context mContext=this;
    @Bind(R.id.radioGroup_main)
    RadioGroup radioGroupMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
    radioGroupMain.setOnCheckedChangeListener(this);
        radioGroupMain.check(R.id.radioButton_home);//设置默认选中第一个碎片
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Fragment fragment= FragmentFactory.createFragment(checkedId);
        //使用制定选中的fragment贴换掉真布局
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_main,fragment).commit();

    }
}
