/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal.persistence;

public interface PersistenceStrategy<T> {
    public void clear();

    public T restore();

    public void save(T var1);
}

