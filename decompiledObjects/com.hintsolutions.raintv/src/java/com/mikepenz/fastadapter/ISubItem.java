/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.IExpandable;
import com.mikepenz.fastadapter.IItem;

public interface ISubItem<T, S extends IItem & IExpandable> {
    public S getParent();

    public T withParent(S var1);
}

