/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.ViewGroup
 *  java.lang.Object
 */
package com.mikepenz.materialize.view;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.mikepenz.materialize.view.OnInsetsCallback;

public interface IScrimInsetsLayout {
    public Drawable getInsetForeground();

    public OnInsetsCallback getOnInsetsCallback();

    public ViewGroup getView();

    public boolean isSystemUIVisible();

    public boolean isTintNavigationBar();

    public boolean isTintStatusBar();

    public void setFitsSystemWindows(boolean var1);

    public void setInsetForeground(int var1);

    public void setInsetForeground(Drawable var1);

    public void setOnInsetsCallback(OnInsetsCallback var1);

    public void setSystemUIVisible(boolean var1);

    public void setTintNavigationBar(boolean var1);

    public void setTintStatusBar(boolean var1);
}

