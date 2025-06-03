/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.IdRes
 *  androidx.annotation.LayoutRes
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.fastadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.IIdentifyable;
import java.util.List;

public interface IItem<T, VH extends RecyclerView.ViewHolder>
extends IIdentifyable<T> {
    public void attachToWindow(VH var1);

    public void bindView(VH var1, List<Object> var2);

    public void detachFromWindow(VH var1);

    public boolean equals(int var1);

    public boolean failedToRecycle(VH var1);

    public View generateView(Context var1);

    public View generateView(Context var1, ViewGroup var2);

    @LayoutRes
    public int getLayoutRes();

    public Object getTag();

    @IdRes
    public int getType();

    public VH getViewHolder(ViewGroup var1);

    public boolean isEnabled();

    public boolean isSelectable();

    public boolean isSelected();

    public void unbindView(VH var1);

    public T withEnabled(boolean var1);

    public T withSelectable(boolean var1);

    public T withSetSelected(boolean var1);

    public T withTag(Object var1);
}

