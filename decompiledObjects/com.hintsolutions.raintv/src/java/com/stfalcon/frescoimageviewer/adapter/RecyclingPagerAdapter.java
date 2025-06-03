/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.viewpager.widget.PagerAdapter
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.stfalcon.frescoimageviewer.adapter;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.stfalcon.frescoimageviewer.adapter.ViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class RecyclingPagerAdapter<VH extends ViewHolder>
extends PagerAdapter {
    public static boolean DEBUG = false;
    private static final String STATE = "RecyclingPagerAdapter";
    private static final String TAG = "RecyclingPagerAdapter";
    private SparseArray<RecycleCache> mRecycleTypeCaches = new SparseArray();
    private SparseArray<Parcelable> mSavedStates = new SparseArray();

    private List<ViewHolder> getAttachedViewHolders() {
        ArrayList arrayList = new ArrayList();
        int n = this.mRecycleTypeCaches.size();
        for (int i = 0; i < n; ++i) {
            Iterator iterator = this.mRecycleTypeCaches;
            for (ViewHolder viewHolder : (iterator.get(iterator.keyAt(i))).mCaches) {
                if (!viewHolder.mIsAttached) continue;
                arrayList.add((Object)viewHolder);
            }
        }
        return arrayList;
    }

    public void destroyItem(ViewGroup viewGroup, int n, Object object) {
        if (object instanceof ViewHolder) {
            ((ViewHolder)object).detach(viewGroup);
        }
    }

    public int getCount() {
        return this.getItemCount();
    }

    public abstract int getItemCount();

    public int getItemId(int n) {
        return n;
    }

    public int getItemPosition(Object object) {
        return -2;
    }

    public int getItemViewType(int n) {
        return 0;
    }

    public Object instantiateItem(ViewGroup viewGroup, int n) {
        int n2 = this.getItemViewType(n);
        if (this.mRecycleTypeCaches.get(n2) == null) {
            this.mRecycleTypeCaches.put(n2, new Object(this){
                private final RecyclingPagerAdapter mAdapter;
                private final List<ViewHolder> mCaches;
                {
                    this.mAdapter = recyclingPagerAdapter;
                    this.mCaches = new ArrayList();
                }

                public ViewHolder getFreeViewHolder(ViewGroup object, int n) {
                    int n2 = this.mCaches.size();
                    for (int i = 0; i < n2; ++i) {
                        ViewHolder viewHolder = (ViewHolder)this.mCaches.get(i);
                        if (viewHolder.mIsAttached) continue;
                        return viewHolder;
                    }
                    object = this.mAdapter.onCreateViewHolder((ViewGroup)object, n);
                    this.mCaches.add(object);
                    return object;
                }
            });
        }
        ViewHolder viewHolder = (this.mRecycleTypeCaches.get(n2)).getFreeViewHolder(viewGroup, n2);
        viewHolder.attach(viewGroup, n);
        this.onBindViewHolder(viewHolder, n);
        viewHolder.onRestoreInstanceState((Parcelable)this.mSavedStates.get(this.getItemId(n)));
        return viewHolder;
    }

    public boolean isViewFromObject(View view, Object object) {
        boolean bl = object instanceof ViewHolder && ((ViewHolder)object).itemView == view;
        return bl;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Iterator iterator = this.getAttachedViewHolders().iterator();
        while (iterator.hasNext()) {
            this.onNotifyItemChanged((ViewHolder)iterator.next());
        }
    }

    public abstract void onBindViewHolder(VH var1, int var2);

    public abstract VH onCreateViewHolder(ViewGroup var1, int var2);

    public void onNotifyItemChanged(ViewHolder viewHolder) {
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable instanceof Bundle) {
            Object object = (Bundle)parcelable;
            object.setClassLoader(classLoader);
            String string2 = STATE;
            object = object.containsKey(string2) ? object.getSparseParcelableArray(string2) : null;
            if (object == null) {
                object = new SparseArray();
            }
            this.mSavedStates = object;
        }
        super.restoreState(parcelable, classLoader);
    }

    public Parcelable saveState() {
        Bundle bundle = new Bundle();
        for (ViewHolder viewHolder : this.getAttachedViewHolders()) {
            this.mSavedStates.put(this.getItemId(viewHolder.mPosition), (Object)viewHolder.onSaveInstanceState());
        }
        bundle.putSparseParcelableArray(STATE, this.mSavedStates);
        return bundle;
    }
}

