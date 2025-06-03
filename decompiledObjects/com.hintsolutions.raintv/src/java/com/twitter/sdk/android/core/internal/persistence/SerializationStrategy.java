/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.twitter.sdk.android.core.internal.persistence;

public interface SerializationStrategy<T> {
    public T deserialize(String var1);

    public String serialize(T var1);
}

