/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.fastadapter.listeners;

import androidx.annotation.Nullable;
import com.mikepenz.fastadapter.IItem;
import java.util.List;

public interface ItemFilterListener<Item extends IItem> {
    public void itemsFiltered(@Nullable CharSequence var1, @Nullable List<Item> var2);

    public void onReset();
}

