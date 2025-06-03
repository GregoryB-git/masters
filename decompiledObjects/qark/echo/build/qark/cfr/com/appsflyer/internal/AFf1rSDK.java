/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.Map
 *  java.util.Observer
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.FutureTask
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1dSDK;
import com.appsflyer.internal.AFb1hSDK;
import com.appsflyer.internal.AFc1xSDK;
import com.appsflyer.internal.AFf1pSDK;
import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

public abstract class AFf1rSDK
extends AFf1pSDK {
    public AFf1rSDK(String string2, String string3, Runnable runnable) {
        super(string2, string3, runnable);
    }

    public final void AFInAppEventType(AFb1dSDK aFb1dSDK, AFb1hSDK<Map<String, Object>> aFb1hSDK) {
        if (AFa1eSDK.valueOf().valueOf(aFb1dSDK, false) <= 0) {
            if (!aFb1hSDK.AFKeystoreWrapper()) {
                return;
            }
            aFb1hSDK.AFInAppEventType.AFInAppEventType().execute(aFb1hSDK.values);
            this.afInfoLog = System.currentTimeMillis();
            this.afDebugLog = AFf1pSDK.AFa1zSDK.AFInAppEventType;
            this.addObserver(new Observer(this){
                private /* synthetic */ AFf1pSDK values;
                {
                    this.values = aFf1pSDK;
                }

                public final void update(java.util.Observable observable, Object object) {
                    this.values.values.run();
                }
            });
        }
    }
}

