/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

public final class AFb1uSDK {
    private final boolean AFInAppEventType;
    final long AFKeystoreWrapper;
    final String valueOf;

    public AFb1uSDK() {
    }

    public AFb1uSDK(String string2, long l8, boolean bl) {
        this.valueOf = string2;
        this.AFKeystoreWrapper = l8;
        this.AFInAppEventType = bl;
    }

    public static boolean AFInAppEventType(String string2) {
        if (string2 != null && string2.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean values(String string2) {
        if (string2 != null && string2.length() != 0) {
            return false;
        }
        return true;
    }

    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }
}

