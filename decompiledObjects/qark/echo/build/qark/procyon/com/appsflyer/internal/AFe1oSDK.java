// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFe1oSDK extends AFa1qSDK
{
    public AFe1oSDK() {
        super("adrevenue_generic", null, Boolean.TRUE);
    }
    
    @Override
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.onInstallConversionDataLoadedNative;
    }
}
