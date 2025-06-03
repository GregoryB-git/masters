/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.networktasks.api;

import com.yandex.metrica.networktasks.api.NetworkCore;
import com.yandex.metrica.networktasks.api.NetworkServiceLifecycleObserver;

public final class NetworkServiceLocator
implements NetworkServiceLifecycleObserver {
    private static volatile NetworkServiceLocator b;
    private NetworkCore a;

    private NetworkServiceLocator() {
    }

    public static void destroy() {
        b = null;
    }

    public static NetworkServiceLocator getInstance() {
        return b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void init() {
        if (b != null) return;
        Class<NetworkServiceLocator> clazz = NetworkServiceLocator.class;
        synchronized (NetworkServiceLocator.class) {
            NetworkServiceLocator networkServiceLocator;
            if (b != null) return;
            b = networkServiceLocator = new NetworkServiceLocator();
            // ** MonitorExit[var1] (shouldn't be in output)
            return;
        }
    }

    public NetworkCore getNetworkCore() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void initAsync() {
        if (this.a != null) return;
        NetworkServiceLocator networkServiceLocator = this;
        synchronized (networkServiceLocator) {
            NetworkCore networkCore;
            if (this.a != null) return;
            this.a = networkCore = new NetworkCore();
            networkCore.setName("YMM-NC");
            this.a.start();
            return;
        }
    }

    @Override
    public void onCreate() {
    }

    @Override
    public void onDestroy() {
        NetworkCore networkCore = this.a;
        if (networkCore != null) {
            networkCore.onDestroy();
        }
    }
}

