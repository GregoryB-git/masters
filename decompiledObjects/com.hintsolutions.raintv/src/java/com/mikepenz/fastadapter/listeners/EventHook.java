/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.fastadapter.listeners;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.IItem;
import java.util.List;

public interface EventHook<Item extends IItem> {
    @Nullable
    public View onBind(@NonNull RecyclerView.ViewHolder var1);

    @Nullable
    public List<? extends View> onBindMany(@NonNull RecyclerView.ViewHolder var1);
}

