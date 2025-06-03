// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public class AFc1kSDK
{
    public final long AFKeystoreWrapper;
    
    public AFc1kSDK(final long afKeystoreWrapper) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() != o.getClass()) {
                return false;
            }
            if (this.AFKeystoreWrapper == ((AFc1kSDK)o).AFKeystoreWrapper) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long afKeystoreWrapper = this.AFKeystoreWrapper;
        return (int)(afKeystoreWrapper ^ afKeystoreWrapper >>> 32);
    }
}
