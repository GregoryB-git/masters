/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Observable
 *  java.util.Observer
 */
package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

public abstract class AFf1pSDK
extends Observable {
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    public final String AFKeystoreWrapper;
    public AFa1zSDK afDebugLog = AFa1zSDK.valueOf;
    long afInfoLog;
    public final String afRDLog;
    final Runnable values;

    public AFf1pSDK(String string2, String string3, Runnable runnable) {
        this.values = runnable;
        this.AFKeystoreWrapper = string3;
        this.afRDLog = string2;
    }

    public abstract void valueOf(Context var1);

    public final void values() {
        this.AFInAppEventParameterName.put((Object)"source", (Object)this.AFKeystoreWrapper);
        this.AFInAppEventParameterName.put((Object)"type", (Object)this.afRDLog);
        this.AFInAppEventParameterName.put((Object)"latency", (Object)(System.currentTimeMillis() - this.afInfoLog));
        this.afDebugLog = AFa1zSDK.values;
        this.setChanged();
        this.notifyObservers();
    }

    public static final class AFa1zSDK
    extends Enum<AFa1zSDK> {
        public static final /* enum */ AFa1zSDK AFInAppEventType;
        private static final /* synthetic */ AFa1zSDK[] AFKeystoreWrapper;
        public static final /* enum */ AFa1zSDK valueOf;
        public static final /* enum */ AFa1zSDK values;

        static {
            AFa1zSDK aFa1zSDK;
            AFa1zSDK aFa1zSDK2;
            AFa1zSDK aFa1zSDK3;
            valueOf = aFa1zSDK3 = new AFa1zSDK();
            AFInAppEventType = aFa1zSDK = new AFa1zSDK();
            values = aFa1zSDK2 = new AFa1zSDK();
            AFKeystoreWrapper = new AFa1zSDK[]{aFa1zSDK3, aFa1zSDK, aFa1zSDK2};
        }

        private AFa1zSDK() {
        }

        public static AFa1zSDK valueOf(String string2) {
            return (AFa1zSDK)Enum.valueOf(AFa1zSDK.class, (String)string2);
        }

        public static AFa1zSDK[] values() {
            return (AFa1zSDK[])AFKeystoreWrapper.clone();
        }
    }

}

