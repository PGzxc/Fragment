package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Admin
 * 创建日期：2017/11/1518:57
 * 编程使我快乐
 */

public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("Fragment", "onCreateView");
        // 将myfragment Layout文件转化为View
        //返回转化来的View
        return inflater.inflate(R.layout.myfragment, container, false);
    }
}
