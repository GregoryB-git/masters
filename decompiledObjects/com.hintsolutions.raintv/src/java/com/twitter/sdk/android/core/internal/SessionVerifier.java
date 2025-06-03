/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.Session;

public interface SessionVerifier<T extends Session> {
    public void verifySession(T var1);
}

