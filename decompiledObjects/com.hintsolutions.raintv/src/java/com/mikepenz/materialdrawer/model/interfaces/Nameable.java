/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.materialdrawer.holder.StringHolder
 *  java.lang.Object
 *  java.lang.String
 */
package com.mikepenz.materialdrawer.model.interfaces;

import com.mikepenz.materialdrawer.holder.StringHolder;

public interface Nameable<T> {
    public StringHolder getName();

    public T withName(int var1);

    public T withName(StringHolder var1);

    public T withName(String var1);
}

