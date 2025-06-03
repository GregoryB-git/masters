// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFb1uSDK
{
    private final boolean AFInAppEventType;
    final long AFKeystoreWrapper;
    final String valueOf;
    
    public AFb1uSDK() {
    }
    
    public AFb1uSDK(final String valueOf, final long afKeystoreWrapper, final boolean afInAppEventType) {
        this.valueOf = valueOf;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static boolean AFInAppEventType(final String s) {
        return s == null || s.trim().length() == 0;
    }
    
    public static boolean values(final String s) {
        return s == null || s.length() == 0;
    }
    
    public final boolean AFKeystoreWrapper() {
        return this.AFInAppEventType;
    }
}
