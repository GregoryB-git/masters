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

public interface Badgeable<T> {
    public StringHolder getBadge();

    public T withBadge(int var1);

    public T withBadge(StringHolder var1);

    public T withBadge(String var1);
}

