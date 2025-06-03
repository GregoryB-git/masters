/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1jSDK;

public abstract class AFe1dSDK
extends AFe1jSDK {
    public AFe1dSDK() {
        this(null, null);
    }

    public AFe1dSDK(String string2, Boolean bl) {
        super(string2, null, Boolean.FALSE, null, bl);
    }

    @Override
    public final boolean afDebugLog() {
        return false;
    }

    @Override
    public final boolean afErrorLog() {
        return false;
    }

    @Override
    public final boolean afInfoLog() {
        return false;
    }
}

