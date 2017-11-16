package com.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * 作者：Admin 创建日期：2017/11/1518:35
 * 编程使我快乐
 * @author :orange
 */

public class FragmentActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);
        //做一个简单的UI操作，证明静态加载时我们可以直接获取到
        //Fragment中的UI控件
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("我是静态加载的！");

    }
}
