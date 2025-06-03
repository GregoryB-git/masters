/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 */
package com.mikepenz.fastadapter.items;

import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.IGenericItem;
import com.mikepenz.fastadapter.items.AbstractItem;

public abstract class GenericAbstractItem<Model, Item extends GenericAbstractItem<?, ?, ?>, VH extends RecyclerView.ViewHolder>
extends AbstractItem<Item, VH>
implements IGenericItem<Model, Item, VH> {
    private Model mModel;

    public GenericAbstractItem(Model Model) {
        this.mModel = Model;
    }

    @Override
    public Model getModel() {
        return this.mModel;
    }

    @Deprecated
    public GenericAbstractItem<?, ?, ?> setModel(Model Model) {
        return this.withModel((Object)Model);
    }

    @Override
    public GenericAbstractItem<?, ?, ?> withModel(Model Model) {
        this.mModel = Model;
        return this;
    }
}

