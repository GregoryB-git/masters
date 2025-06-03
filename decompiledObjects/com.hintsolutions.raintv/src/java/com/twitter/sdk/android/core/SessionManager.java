/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.Map
 */
package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.Session;
import java.util.Map;

public interface SessionManager<T extends Session> {
    public void clearActiveSession();

    public void clearSession(long var1);

    public T getActiveSession();

    public T getSession(long var1);

    public Map<Long, T> getSessionMap();

    public void setActiveSession(T var1);

    public void setSession(long var1, T var3);
}

