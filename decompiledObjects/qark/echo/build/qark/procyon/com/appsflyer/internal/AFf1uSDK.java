// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import com.appsflyer.AFLogger;

public abstract class AFf1uSDK extends AFf1pSDK
{
    public AFf1uSDK(final String s, final String s2, final Runnable runnable) {
        super(s, s2, runnable);
    }
    
    public static boolean valueOf() {
        if (AFa1eSDK.valueOf().valueOf(AFa1eSDK.valueOf().AFInAppEventType().values(), false) > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        return true;
    }
}
