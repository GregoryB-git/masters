/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.CallSuper
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.mikepenz.materialdrawer.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.IIdentifyable;
import com.mikepenz.fastadapter.utils.IdDistributor;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.OnPostBindViewListener;
import com.mikepenz.materialdrawer.model.interfaces.Selectable;
import com.mikepenz.materialdrawer.model.interfaces.Tagable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractDrawerItem<T, VH extends RecyclerView.ViewHolder>
implements IDrawerItem<T, VH>,
Selectable<T>,
Tagable<T> {
    public boolean mEnabled = true;
    private boolean mExpanded = false;
    public long mIdentifier = -1L;
    public Drawer.OnDrawerItemClickListener mOnDrawerItemClickListener = null;
    public OnPostBindViewListener mOnPostBindViewListener = null;
    private IDrawerItem mParent;
    public boolean mSelectable = true;
    public boolean mSelected = false;
    public boolean mSelectedBackgroundAnimated = true;
    public List<IDrawerItem> mSubItems;
    public Object mTag;

    @Override
    public void attachToWindow(VH VH) {
    }

    @Override
    @CallSuper
    public void bindView(VH VH, List<Object> list) {
        ((RecyclerView.ViewHolder)VH).itemView.setTag((Object)this);
    }

    @Override
    public void detachFromWindow(VH VH) {
    }

    @Override
    public boolean equals(int n4) {
        boolean bl = (long)n4 == this.mIdentifier;
        return bl;
    }

    @Override
    public boolean equals(long l4) {
        boolean bl = l4 == this.mIdentifier;
        return bl;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (AbstractDrawerItem)object;
            if (this.mIdentifier != ((AbstractDrawerItem)object).mIdentifier) {
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
        object = this.getViewHolder(LayoutInflater.from((Context)object).inflate(this.getLayoutRes(), null, false));
        this.bindView(object, (List<Object>)Collections.emptyList());
        return object.itemView;
    }

    @Override
    public View generateView(Context object, ViewGroup viewGroup) {
        object = this.getViewHolder(LayoutInflater.from((Context)object).inflate(this.getLayoutRes(), viewGroup, false));
        this.bindView(object, (List<Object>)Collections.emptyList());
        return object.itemView;
    }

    @Override
    public long getIdentifier() {
        return this.mIdentifier;
    }

    public Drawer.OnDrawerItemClickListener getOnDrawerItemClickListener() {
        return this.mOnDrawerItemClickListener;
    }

    public OnPostBindViewListener getOnPostBindViewListener() {
        return this.mOnPostBindViewListener;
    }

    @Override
    public IDrawerItem getParent() {
        return this.mParent;
    }

    @Override
    public List<IDrawerItem> getSubItems() {
        return this.mSubItems;
    }

    @Override
    public Object getTag() {
        return this.mTag;
    }

    public abstract VH getViewHolder(View var1);

    @Override
    public VH getViewHolder(ViewGroup viewGroup) {
        return this.getViewHolder(LayoutInflater.from((Context)viewGroup.getContext()).inflate(this.getLayoutRes(), viewGroup, false));
    }

    public int hashCode() {
        return Long.valueOf((long)this.mIdentifier).hashCode();
    }

    @Override
    public boolean isAutoExpanding() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.mEnabled;
    }

    @Override
    public boolean isExpanded() {
        return this.mExpanded;
    }

    @Override
    public boolean isSelectable() {
        return this.mSelectable;
    }

    @Override
    public boolean isSelected() {
        return this.mSelected;
    }

    public boolean isSelectedBackgroundAnimated() {
        return this.mSelectedBackgroundAnimated;
    }

    public void onPostBindView(IDrawerItem iDrawerItem, View view) {
        OnPostBindViewListener onPostBindViewListener = this.mOnPostBindViewListener;
        if (onPostBindViewListener != null) {
            onPostBindViewListener.onBindView(iDrawerItem, view);
        }
    }

    @Override
    public void unbindView(VH VH) {
    }

    @Override
    public T withEnabled(boolean bl) {
        this.mEnabled = bl;
        return (T)this;
    }

    @Override
    public T withIdentifier(long l4) {
        this.mIdentifier = l4;
        return (T)this;
    }

    @Override
    public T withIsExpanded(boolean bl) {
        this.mExpanded = bl;
        return (T)this;
    }

    public T withOnDrawerItemClickListener(Drawer.OnDrawerItemClickListener onDrawerItemClickListener) {
        this.mOnDrawerItemClickListener = onDrawerItemClickListener;
        return (T)this;
    }

    @Override
    public IDrawerItem withParent(IDrawerItem iDrawerItem) {
        this.mParent = iDrawerItem;
        return this;
    }

    public T withPostOnBindViewListener(OnPostBindViewListener onPostBindViewListener) {
        this.mOnPostBindViewListener = onPostBindViewListener;
        return (T)this;
    }

    @Override
    public T withSelectable(boolean bl) {
        this.mSelectable = bl;
        return (T)this;
    }

    public T withSelectedBackgroundAnimated(boolean bl) {
        this.mSelectedBackgroundAnimated = bl;
        return (T)this;
    }

    @Override
    public T withSetSelected(boolean bl) {
        this.mSelected = bl;
        return (T)this;
    }

    @Override
    public T withSubItems(List<IDrawerItem> list) {
        this.mSubItems = IdDistributor.checkIds(list);
        return (T)this;
    }

    public T withSubItems(IDrawerItem ... iDrawerItemArray) {
        if (this.mSubItems == null) {
            this.mSubItems = new ArrayList();
        }
        Collections.addAll(this.mSubItems, (Object[])IdDistributor.checkIds((IIdentifyable[])iDrawerItemArray));
        return (T)this;
    }

    @Override
    public T withTag(Object object) {
        this.mTag = object;
        return (T)this;
    }
}

