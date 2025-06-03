/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Object
 */
package com.mikepenz.fastadapter;

import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.IItem;

public interface IGenericItem<Model, Item extends IGenericItem<?, ?, ?>, VH extends RecyclerView.ViewHolder>
extends IItem<Item, VH> {
    public Model getModel();

    public IGenericItem<?, ?, ?> withModel(Model var1);
}

