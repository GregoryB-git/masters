/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  androidx.annotation.ColorInt
 *  androidx.annotation.DrawableRes
 *  java.lang.Object
 */
package com.afollestad.materialdialogs.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.afollestad.materialdialogs.GravityEnum;

public class ThemeSingleton {
    private static ThemeSingleton singleton;
    @ColorInt
    public int backgroundColor = 0;
    @DrawableRes
    public int btnSelectorNegative = 0;
    @DrawableRes
    public int btnSelectorNeutral = 0;
    @DrawableRes
    public int btnSelectorPositive = 0;
    @DrawableRes
    public int btnSelectorStacked = 0;
    public GravityEnum btnStackedGravity;
    public GravityEnum buttonsGravity;
    @ColorInt
    public int contentColor = 0;
    public GravityEnum contentGravity;
    public boolean darkTheme = false;
    @ColorInt
    public int dividerColor = 0;
    public Drawable icon = null;
    @ColorInt
    public int itemColor = 0;
    public GravityEnum itemsGravity;
    public ColorStateList linkColor = null;
    @DrawableRes
    public int listSelector = 0;
    public ColorStateList negativeColor = null;
    public ColorStateList neutralColor = null;
    public ColorStateList positiveColor = null;
    @ColorInt
    public int titleColor = 0;
    public GravityEnum titleGravity;
    @ColorInt
    public int widgetColor = 0;

    public ThemeSingleton() {
        GravityEnum gravityEnum;
        this.titleGravity = gravityEnum = GravityEnum.START;
        this.contentGravity = gravityEnum;
        this.btnStackedGravity = GravityEnum.END;
        this.itemsGravity = gravityEnum;
        this.buttonsGravity = gravityEnum;
    }

    public static ThemeSingleton get() {
        return ThemeSingleton.get(true);
    }

    public static ThemeSingleton get(boolean bl) {
        if (singleton == null && bl) {
            singleton = new ThemeSingleton();
        }
        return singleton;
    }
}

