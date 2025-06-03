/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collections
 *  java.util.List
 */
package com.mikepenz.fastadapter.items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IClickable;
import com.mikepenz.fastadapter.IItem;
import java.util.Collections;
import java.util.List;

public abstract class AbstractItem<Item extends IItem & IClickable, VH extends RecyclerView.ViewHolder>
implements IItem<Item, VH>,
IClickable<Item> {
    public boolean mEnabled = true;
    public long mIdentifier = -1L;
    public FastAdapter.OnClickListener<Item> mOnItemClickListener;
    public FastAdapter.OnClickListener<Item> mOnItemPreClickListener;
    public boolean mSelectable = true;
    public boolean mSelected = false;
    public Object mTag;

    @Override
    public void attachToWindow(VH VH) {
    }

    @Override
    @CallSuper
    public void bindView(VH VH, List<Object> list) {
        ((RecyclerView.ViewHolder)VH).itemView.setSelected(this.isSelected());
    }

    public View createView(Context context, @Nullable ViewGroup viewGroup) {
        return LayoutInflater.from((Context)context).inflate(this.getLayoutRes(), viewGroup, false);
    }

    @Override
    public void detachFromWindow(VH VH) {
    }

    @Override
    public boolean equals(int n4) {
        boolean bl = (long)n4 == this.mIdentifier;
        return bl;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (AbstractItem)object;
            if (this.mIdentifier != ((AbstractItem)object).mIdentifier) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Override
    public boolean failedToRecycle(VH VH) {
        return false;
    }

    @Override
    public View generateView(Context object) {
        object = this.getViewHolder(this.createView((Context)object, null));
        this.bindView(object, (List<Object>)Collections.EMPTY_LIST);
        return object.itemView;
    }

    @Override
    public View generateView(Context object, ViewGroup viewGroup) {
        object = this.getViewHolder(this.createView((Context)object, viewGroup));
        this.bindView(object, (List<Object>)Collections.EMPTY_LIST);
        return object.itemView;
    }

    @Override
    public long getIdentifier() {
        return this.mIdentifier;
    }

    @Override
    public FastAdapter.OnClickListener<Item> getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Override
    public FastAdapter.OnClickListener<Item> getOnPreItemClickListener() {
        return this.mOnItemPreClickListener;
    }

    @Override
    public Object getTag() {
        return this.mTag;
    }

    public abstract VH getViewHolder(View var1);

    @Override
    public VH getViewHolder(ViewGroup viewGroup) {
        return this.getViewHolder(this.createView(viewGroup.getContext(), viewGroup));
    }

    public int hashCode() {
        return Long.valueOf((long)this.mIdentifier).hashCode();
    }

    @Override
    public boolean isEnabled() {
        return this.mEnabled;
    }

    @Override
    public boolean isSelectable() {
        return this.mSelectable;
    }

    @Override
    public boolean isSelected() {
        return this.mSelected;
    }

    @Override
    public void unbindView(VH VH) {
    }

    @Override
    public Item withEnabled(boolean bl) {
        this.mEnabled = bl;
        return (Item)this;
    }

    @Override
    public Item withIdentifier(long l4) {
        this.mIdentifier = l4;
        return (Item)this;
    }

    @Override
    public Item withOnItemClickListener(FastAdapter.OnClickListener<Item> onClickListener) {
        this.mOnItemClickListener = onClickListener;
        return (Item)this;
    }

    @Override
    public Item withOnItemPreClickListener(FastAdapter.OnClickListener<Item> onClickListener) {
        this.mOnItemPreClickListener = onClickListener;
        return (Item)this;
    }

    @Override
    public Item withSelectable(boolean bl) {
        this.mSelectable = bl;
        return (Item)this;
    }

    @Override
    public Item withSetSelected(boolean bl) {
        this.mSelected = bl;
        return (Item)this;
    }

    @Override
    public Item withTag(Object object) {
        this.mTag = object;
        return (Item)this;
    }
}

