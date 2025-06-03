/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.ISubItem;
import java.util.List;

public interface IExpandable<T, Item extends IItem & ISubItem> {
    public List<Item> getSubItems();

    public boolean isAutoExpanding();

    public boolean isExpanded();

    public T withIsExpanded(boolean var1);

    public T withSubItems(List<Item> var1);
}

