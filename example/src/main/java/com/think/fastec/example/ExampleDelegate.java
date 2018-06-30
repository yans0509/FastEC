package com.think.fastec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.think.fastec.R;
import com.think.latte.delegates.LatteDelegate;
import com.think.latte.net.RestClient;
import com.think.latte.net.callback.IError;
import com.think.latte.net.callback.IFailure;
import com.think.latte.net.callback.ISuccess;

/**
 * Created by yanqi on 2018/6/26 0026.
 */
public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle saveInstanceState, View rootView) {
        testRestClient();

    }

    private void testRestClient() {
        RestClient.builder()
                .url("http://127.0.0.1/index")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Log.d("yans", response);
                        Toast.makeText(getContext(), response, Toast.LENGTH_LONG).show();

                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                })
                .dir("")
                .extension("")
                .name("")
                .build()
                .download();
    }
}
