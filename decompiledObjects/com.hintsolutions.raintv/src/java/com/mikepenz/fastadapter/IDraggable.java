/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.IItem;

public interface IDraggable<T, Item extends IItem> {
    public boolean isDraggable();

    public T withIsDraggable(boolean var1);
}

