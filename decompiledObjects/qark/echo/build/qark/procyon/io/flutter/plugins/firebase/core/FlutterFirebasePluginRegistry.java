// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugins.firebase.core;

import java.util.HashMap;
import java.util.Iterator;
import V2.m;
import V2.j;
import s3.e;
import V2.k;
import java.util.WeakHashMap;
import java.util.Map;
import androidx.annotation.Keep;

@Keep
public class FlutterFirebasePluginRegistry
{
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins;
    
    static {
        registeredPlugins = new WeakHashMap<String, FlutterFirebasePlugin>();
    }
    
    public static j didReinitializeFirebaseCore() {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new J5.j(k));
        return k.a();
    }
    
    public static j getPluginConstantsForFirebaseApp(final e e) {
        final k k = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new J5.k(e, k));
        return k.a();
    }
    
    public static void registerPlugin(final String s, final FlutterFirebasePlugin flutterFirebasePlugin) {
        FlutterFirebasePluginRegistry.registeredPlugins.put(s, flutterFirebasePlugin);
    }
}
