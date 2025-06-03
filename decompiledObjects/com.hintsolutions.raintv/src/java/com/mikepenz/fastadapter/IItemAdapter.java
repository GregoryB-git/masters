/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.IExpandable;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.ISubItem;
import java.util.List;

public interface IItemAdapter<Item extends IItem>
extends IAdapter<Item> {
    public IItemAdapter<Item> add(int var1, List<Item> var2);

    public IItemAdapter<Item> add(int var1, Item ... var2);

    public IItemAdapter<Item> add(List<Item> var1);

    public IItemAdapter<Item> add(Item ... var1);

    public IItemAdapter<Item> clear();

    public IItemAdapter<Item> remove(int var1);

    public IItemAdapter<Item> removeRange(int var1, int var2);

    public IItemAdapter<Item> set(int var1, Item var2);

    public IItemAdapter<Item> set(List<Item> var1);

    public IItemAdapter<Item> setNewList(List<Item> var1);

    public <T extends IItem & IExpandable<T, S>, S extends IItem & ISubItem<Item, T>> T setSubItems(T var1, List<S> var2);
}

