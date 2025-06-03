/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.yandex.metrica.core.api;

public interface StateSerializer {
    public Object defaultValue();

    public byte[] toByteArray(Object var1);

    public Object toState(byte[] var1);
}

