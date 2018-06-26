package com.think.fastec.example;

import com.think.latte.activities.ProxyActivity;
import com.think.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
