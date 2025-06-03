/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal.scribe;

public interface EventsManager<T> {
    public void deleteAllEvents();

    public void recordEvent(T var1);

    public void sendEvents();
}

