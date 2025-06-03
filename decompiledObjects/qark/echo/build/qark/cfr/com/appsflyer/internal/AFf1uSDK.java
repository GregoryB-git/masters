/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFf1pSDK;

public abstract class AFf1uSDK
extends AFf1pSDK {
    public AFf1uSDK(String string2, String string3, Runnable runnable) {
        super(string2, string3, runnable);
    }

    public static boolean valueOf() {
        AFb1dSDK aFb1dSDK = AFa1eSDK.valueOf().AFInAppEventType().values();
        if (AFa1eSDK.valueOf().valueOf(aFb1dSDK, false) > 0) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 1, ");
            return false;
        }
        return true;
    }
}

