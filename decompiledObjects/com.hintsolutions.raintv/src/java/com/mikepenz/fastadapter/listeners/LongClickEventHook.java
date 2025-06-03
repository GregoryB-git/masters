/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.mikepenz.fastadapter.listeners;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.listeners.EventHook;
import java.util.List;

public abstract class LongClickEventHook<Item extends IItem>
implements EventHook<Item> {
    @Override
    @Nullable
    public View onBind(@NonNull RecyclerView.ViewHolder viewHolder) {
        return null;
    }

    @Override
    @Nullable
    public List<View> onBindMany(@NonNull RecyclerView.ViewHolder viewHolder) {
        return null;
    }

    public abstract boolean onLongClick(View var1, int var2, FastAdapter<Item> var3, Item var4);
}

