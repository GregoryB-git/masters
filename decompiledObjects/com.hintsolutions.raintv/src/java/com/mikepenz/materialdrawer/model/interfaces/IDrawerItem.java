/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model.interfaces;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.IExpandable;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.ISubItem;
import java.util.List;

public interface IDrawerItem<T, VH extends RecyclerView.ViewHolder>
extends IItem<T, VH>,
IExpandable<T, IDrawerItem>,
ISubItem<IDrawerItem, IDrawerItem> {
    @Override
    public void bindView(VH var1, List<Object> var2);

    public boolean equals(long var1);

    @Override
    public View generateView(Context var1);

    @Override
    public View generateView(Context var1, ViewGroup var2);

    @Override
    public int getLayoutRes();

    @Override
    public Object getTag();

    @Override
    public int getType();

    @Override
    public VH getViewHolder(ViewGroup var1);

    @Override
    public boolean isEnabled();

    @Override
    public boolean isSelectable();

    @Override
    public boolean isSelected();

    @Override
    public void unbindView(VH var1);

    @Override
    public T withSelectable(boolean var1);

    @Override
    public T withSetSelected(boolean var1);
}

