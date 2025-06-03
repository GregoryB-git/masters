/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.yandex.metrica.core.api;

public interface ProtobufStateStorage {
    public void delete();

    public Object read();

    public void save(Object var1);
}

