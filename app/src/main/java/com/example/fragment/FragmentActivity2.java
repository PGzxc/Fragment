package com.example.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import java.util.Stack;

/**
 * 作者：Admin 创建日期：2017/11/1518:36
 * 编程使我快乐
 * @author: orange
 */

public class FragmentActivity2 extends AppCompatActivity  implements View.OnClickListener{
    private Button add;
    private Button remove;

    /**
     *  Fragment管理器
     */
    private FragmentManager manager;

    /**
     * 使用一个栈记录所有添加的Fragment
     */
    private Stack<Fragment> fragmentStack = new Stack<>();

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment2);
        add =  findViewById(R.id.add);
        remove =  findViewById(R.id.remove);
        //给两个按钮注册监听器
        add.setOnClickListener(this);
        remove.setOnClickListener(this);
        //获取Fragment管理器
        manager = this.getFragmentManager();

    }

    @SuppressLint("NewApi") @Override
    public void onClick(View v) {
        MyFragment fragment;
        FragmentTransaction transaction;
        switch(v.getId()){
            // 添加Fragment
            case R.id.add:
                // 新建一个Fragment
                fragment = new MyFragment();
                // 将ID添加到栈中
                this.fragmentStack.push(fragment);
                // 开启一个新事务
                transaction = manager.beginTransaction();
                // 使用add方法添加Fragment，第一个参数是要把Fragment添加到的布局Id
                // 第二个就是要添加的Fragment
                transaction.add(R.id.fragments, fragment);
                // 提交事务，否则添加就没成功
                transaction.commit();
                break;
            // 移除Fragment
            case R.id.remove:
                // 新建一个Fragment
                // 开启一个新事务
                transaction = manager.beginTransaction();
                // 使用add方法添加Fragment，第一个参数是要把Fragment添加到的布局Id
                // 第二个就是要添加的Fragment
                if(!this.fragmentStack.empty()){
                    transaction.remove((this.fragmentStack.pop()));
                    // 提交事务，否则添加就没成功
                    transaction.commit();
                }
                break;
            default:
            break;
        }

    }
}
