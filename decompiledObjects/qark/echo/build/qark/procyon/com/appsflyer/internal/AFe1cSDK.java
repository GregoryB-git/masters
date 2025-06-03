// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public final class AFe1cSDK extends AFe1dSDK
{
    public AFe1cSDK() {
        super("af_purchase", Boolean.TRUE);
    }
    
    @Override
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.getLevel;
    }
    
    @Override
    public final AFa1qSDK AFKeystoreWrapper(final String s) {
        return super.AFKeystoreWrapper(AFa1qSDK.AFInAppEventParameterName(s));
    }
}
