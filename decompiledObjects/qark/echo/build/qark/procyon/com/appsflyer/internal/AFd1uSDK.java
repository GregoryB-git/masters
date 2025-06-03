// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.TimerTask;

public final class AFd1uSDK extends TimerTask
{
    private final Thread AFInAppEventType;
    
    public AFd1uSDK(final Thread afInAppEventType) {
        this.AFInAppEventType = afInAppEventType;
    }
    
    @Override
    public final void run() {
        this.AFInAppEventType.interrupt();
    }
}
