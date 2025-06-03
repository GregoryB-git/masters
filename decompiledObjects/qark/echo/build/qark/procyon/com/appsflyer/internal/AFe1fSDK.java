// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFe1fSDK extends AFa1qSDK
{
    public final AFd1vSDK AFLogger$LogLevel;
    
    @Deprecated
    public AFe1fSDK() {
        this.AFLogger$LogLevel = null;
    }
    
    public AFe1fSDK(final String s, final byte[] array, final String afInAppEventType, final AFd1vSDK afLogger$LogLevel) {
        super(null, s, Boolean.FALSE);
        super.AFInAppEventType = afInAppEventType;
        this.valueOf(array);
        this.AFLogger$LogLevel = afLogger$LogLevel;
    }
    
    @Override
    public final AFd1vSDK AFInAppEventType() {
        final AFd1vSDK afLogger$LogLevel = this.AFLogger$LogLevel;
        if (afLogger$LogLevel != null) {
            return afLogger$LogLevel;
        }
        return AFd1vSDK.AFKeystoreWrapper;
    }
}
