/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.WeakHashMap
 *  java.util.concurrent.ExecutorService
 */
package io.flutter.plugins.firebase.core;

import J5.j;
import J5.k;
import V2.m;
import androidx.annotation.Keep;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import s3.e;

@Keep
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static /* synthetic */ void a(V2.k k8) {
        FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(k8);
    }

    public static /* synthetic */ void b(e e8, V2.k k8) {
        FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(e8, k8);
    }

    public static V2.j didReinitializeFirebaseCore() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new j(k8));
        return k8.a();
    }

    public static V2.j getPluginConstantsForFirebaseApp(e e8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new k(e8, k8));
        return k8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(V2.k k8) {
        try {
            Iterator iterator = registeredPlugins.entrySet().iterator();
            do {
                if (!iterator.hasNext()) {
                    k8.c(null);
                    return;
                }
                m.a(((FlutterFirebasePlugin)((Map.Entry)iterator.next()).getValue()).didReinitializeFirebaseCore());
            } while (true);
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(e e8, V2.k k8) {
        try {
            Iterator iterator = registeredPlugins;
            HashMap hashMap = new HashMap(iterator.size());
            iterator = iterator.entrySet().iterator();
            do {
                if (!iterator.hasNext()) {
                    k8.c((Object)hashMap);
                    return;
                }
                Map.Entry entry = (Map.Entry)iterator.next();
                hashMap.put((Object)((String)entry.getKey()), m.a(((FlutterFirebasePlugin)entry.getValue()).getPluginConstantsForFirebaseApp(e8)));
            } while (true);
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public static void registerPlugin(String string2, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put((Object)string2, (Object)flutterFirebasePlugin);
    }
}

