/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.IItem;

public interface ISelectionListener<Item extends IItem> {
    public void onSelectionChanged(Item var1, boolean var2);
}

