/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.fastadapter.FastAdapter
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IItem;
import java.util.List;

public interface IAdapter<Item extends IItem> {
    public Item getAdapterItem(int var1);

    public int getAdapterItemCount();

    public List<Item> getAdapterItems();

    public int getAdapterPosition(long var1);

    public int getAdapterPosition(Item var1);

    public FastAdapter<Item> getFastAdapter();

    public int getGlobalPosition(int var1);

    public Item getItem(int var1);

    public int getItemCount();

    public int getOrder();
}

