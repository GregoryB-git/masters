/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.fastadapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.IItem;
import java.util.List;

public abstract class AbstractAdapter<Item extends IItem>
extends RecyclerView.Adapter
implements IAdapter<Item> {
    private FastAdapter<Item> mFastAdapter;

    public void clearMappedTypes() {
        this.mFastAdapter.clearTypeInstance();
    }

    @Override
    public FastAdapter<Item> getFastAdapter() {
        return this.mFastAdapter;
    }

    @Override
    public Item getItem(int n) {
        return this.mFastAdapter.getItem(n);
    }

    @Override
    public int getItemCount() {
        return this.mFastAdapter.getItemCount();
    }

    public long getItemId(int n) {
        return this.mFastAdapter.getItemId(n);
    }

    public int getItemViewType(int n) {
        return this.mFastAdapter.getItemViewType(n);
    }

    public void mapPossibleType(Item Item) {
        this.mFastAdapter.registerTypeInstance(Item);
    }

    public void mapPossibleTypes(Iterable<Item> iterator) {
        if (iterator != null) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                this.mapPossibleType((IItem)iterator.next());
            }
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.mFastAdapter.onAttachedToRecyclerView(recyclerView);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n) {
        this.mFastAdapter.onBindViewHolder(viewHolder, n);
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int n, List list) {
        this.mFastAdapter.onBindViewHolder(viewHolder, n, (List<Object>)list);
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int n) {
        return this.mFastAdapter.onCreateViewHolder(viewGroup, n);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFastAdapter.onDetachedFromRecyclerView(recyclerView);
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return this.mFastAdapter.onFailedToRecycleView(viewHolder);
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.mFastAdapter.onViewAttachedToWindow(viewHolder);
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.mFastAdapter.onViewDetachedFromWindow(viewHolder);
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.mFastAdapter.onViewRecycled(viewHolder);
    }

    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
        FastAdapter<Item> fastAdapter = this.mFastAdapter;
        if (fastAdapter != null) {
            fastAdapter.registerAdapterDataObserver(adapterDataObserver);
        }
    }

    public void setHasStableIds(boolean bl) {
        this.mFastAdapter.setHasStableIds(bl);
    }

    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
        FastAdapter<Item> fastAdapter = this.mFastAdapter;
        if (fastAdapter != null) {
            fastAdapter.unregisterAdapterDataObserver(adapterDataObserver);
        }
    }

    public AbstractAdapter wrap(FastAdapter fastAdapter) {
        this.mFastAdapter = fastAdapter;
        fastAdapter.registerAdapter(this);
        return this;
    }

    public AbstractAdapter wrap(IAdapter object) {
        object = object.getFastAdapter();
        this.mFastAdapter = object;
        ((FastAdapter)((Object)object)).registerAdapter(this);
        return this;
    }
}

