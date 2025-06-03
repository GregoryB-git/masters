/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.yandex.metrica.coreutils.services;

public interface TimeProvider {
    public long currentTimeMillis();

    public long currentTimeSeconds();

    public long elapsedRealtime();

    public long systemNanoTime();
}

