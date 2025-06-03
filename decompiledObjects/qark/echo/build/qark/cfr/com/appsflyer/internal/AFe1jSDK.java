/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1qSDK;

public abstract class AFe1jSDK
extends AFa1qSDK {
    private final boolean AFLogger$LogLevel;
    public boolean afErrorLogForExcManagerOnly;
    private final boolean getLevel;

    public AFe1jSDK() {
        this(null, null, null, null, null);
    }

    public AFe1jSDK(String string2, String string3, Boolean bl, Boolean bl2, Boolean bl3) {
        boolean bl4 = bl3 != null ? bl3 : false;
        super(string2, string3, bl4);
        boolean bl5 = true;
        bl4 = bl != null ? bl : true;
        this.AFLogger$LogLevel = bl4;
        bl4 = bl5;
        if (bl2 != null) {
            bl4 = bl2;
        }
        this.getLevel = bl4;
    }

    public final boolean AFVersionDeclaration() {
        return this.getLevel;
    }

    public final boolean afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }

    public final boolean getLevel() {
        return this.afErrorLogForExcManagerOnly;
    }
}

