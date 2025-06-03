/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.yandex.metrica.networktasks.api;

public interface HostRetryInfoProvider {
    public long getLastAttemptTimeSeconds();

    public int getNextSendAttemptNumber();

    public void saveLastAttemptTimeSeconds(long var1);

    public void saveNextSendAttemptNumber(int var1);
}

