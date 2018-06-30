package com.think.latte.util.dimen;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.think.latte.app.Latte;

/**
 * Created by yanqi on 2018/6/29 0029.
 */
public class DimenUtil {
    public static final int getScreenWidth() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static final int getScreenHeight() {
        final Resources resources = Latte.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
