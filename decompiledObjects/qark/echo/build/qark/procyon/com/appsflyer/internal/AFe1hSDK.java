// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFe1hSDK extends AFa1qSDK
{
    @Override
    public final AFd1vSDK AFInAppEventType() {
        if (super.AFLogger == 1) {
            return AFd1vSDK.AFInAppEventParameterName;
        }
        return AFd1vSDK.afWarnLog;
    }
    
    @Override
    public final boolean afRDLog() {
        return true;
    }
}
