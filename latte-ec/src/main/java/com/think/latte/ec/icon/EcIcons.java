package com.think.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by yanqi on 2018/6/25 0025.
 */
public enum EcIcons implements Icon{
    icon_scan('\ue6ac'),
    icon_ali_pay('\ue6ac');

    private char character;
    EcIcons(char character){
        this.character = character;
    }
    @Override
    public String key() {
        return name().replace('_','-');
    }

    @Override
    public char character() {
        return character;
    }
}
