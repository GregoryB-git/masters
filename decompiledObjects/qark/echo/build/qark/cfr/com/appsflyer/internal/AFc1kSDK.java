/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package com.appsflyer.internal;

public class AFc1kSDK {
    public final long AFKeystoreWrapper;

    public AFc1kSDK(long l8) {
        this.AFKeystoreWrapper = l8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            object = (AFc1kSDK)object;
            if (this.AFKeystoreWrapper == object.AFKeystoreWrapper) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.AFKeystoreWrapper;
        return (int)(l8 ^ l8 >>> 32);
    }
}

