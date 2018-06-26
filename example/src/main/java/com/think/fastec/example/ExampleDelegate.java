package com.think.fastec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.think.fastec.R;
import com.think.latte.delegates.LatteDelegate;

/**
 * Created by yanqi on 2018/6/26 0026.
 */
public class ExampleDelegate extends LatteDelegate{
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle saveInstanceState, View rootView) {

    }
}
