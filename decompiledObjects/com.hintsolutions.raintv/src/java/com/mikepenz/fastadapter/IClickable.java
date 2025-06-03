/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IItem;

public interface IClickable<Item extends IItem> {
    public FastAdapter.OnClickListener<Item> getOnItemClickListener();

    public FastAdapter.OnClickListener<Item> getOnPreItemClickListener();

    public Item withOnItemClickListener(FastAdapter.OnClickListener<Item> var1);

    public Item withOnItemPreClickListener(FastAdapter.OnClickListener<Item> var1);
}

