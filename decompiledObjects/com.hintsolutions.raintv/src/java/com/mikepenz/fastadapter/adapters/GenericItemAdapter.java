/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.SafeVarargs
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package com.mikepenz.fastadapter.adapters;

import androidx.annotation.Nullable;
import com.mikepenz.fastadapter.IGenericItem;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.adapters.ItemAdapter;
import com.mikepenz.fastadapter.utils.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericItemAdapter<Model, Item extends IGenericItem<? extends Model, ?, ?>>
extends ItemAdapter<Item> {
    private final Function<Model, Item> mItemFactory;

    public GenericItemAdapter(Function<Model, Item> function) {
        this.mItemFactory = function;
    }

    public GenericItemAdapter<Model, Item> addModel(int n4, List<Model> list) {
        super.add(n4, (List)this.toItems(list));
        return this;
    }

    @SafeVarargs
    public final GenericItemAdapter<Model, Item> addModel(int n4, Model ... ModelArray) {
        this.addModel(n4, Arrays.asList((Object[])ModelArray));
        return this;
    }

    public GenericItemAdapter<Model, Item> addModel(List<Model> list) {
        super.add((List)this.toItems(list));
        return this;
    }

    @SafeVarargs
    public final GenericItemAdapter<Model, Item> addModel(Model ... ModelArray) {
        this.addModel(Arrays.asList((Object[])ModelArray));
        return this;
    }

    public GenericItemAdapter<Model, Item> clearModel() {
        super.clear();
        return this;
    }

    public List<Model> getModels() {
        int n4 = this.getAdapterItems().size();
        ArrayList arrayList = new ArrayList(n4);
        for (int j = 0; j < n4; ++j) {
            arrayList.add(((IGenericItem)this.getAdapterItems().get(j)).getModel());
        }
        return arrayList;
    }

    public GenericItemAdapter<Model, Item> moveModel(int n4, int n5) {
        super.move(n4, n5);
        return this;
    }

    public GenericItemAdapter<Model, Item> removeModel(int n4) {
        super.remove(n4);
        return this;
    }

    public GenericItemAdapter<Model, Item> removeModelRange(int n4, int n5) {
        super.removeRange(n4, n5);
        return this;
    }

    public GenericItemAdapter<Model, Item> setModel(int n4, Model object) {
        if ((object = this.toItem(object)) != null) {
            super.set(n4, (IItem)object);
        }
        return this;
    }

    public GenericItemAdapter<Model, Item> setModel(List<Model> list) {
        super.set((List)this.toItems(list));
        return this;
    }

    public GenericItemAdapter<Model, Item> setNewModel(List<Model> list) {
        super.setNewList((List)this.toItems(list));
        return this;
    }

    @Nullable
    public Item toItem(Model Model) {
        return (Item)((IGenericItem)this.mItemFactory.apply(Model));
    }

    public List<Item> toItems(List<Model> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        int n4 = list.size();
        ArrayList arrayList = new ArrayList(n4);
        for (int j = 0; j < n4; ++j) {
            Item Item = this.toItem(list.get(j));
            if (Item == null) continue;
            arrayList.add(Item);
        }
        return arrayList;
    }
}

