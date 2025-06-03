package io.flutter.plugins.firebase.core;

import V2.AbstractC0659j;
import V2.C0660k;
import V2.m;
import androidx.annotation.Keep;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import s3.C1947e;

@Keep
/* loaded from: classes.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    public static AbstractC0659j didReinitializeFirebaseCore() {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.j
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(C0660k.this);
            }
        });
        return c0660k.a();
    }

    public static AbstractC0659j getPluginConstantsForFirebaseApp(final C1947e c1947e) {
        final C0660k c0660k = new C0660k();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: J5.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(C1947e.this, c0660k);
            }
        });
        return c0660k.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(C0660k c0660k) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                m.a(it.next().getValue().didReinitializeFirebaseCore());
            }
            c0660k.c(null);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(C1947e c1947e, C0660k c0660k) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), m.a(entry.getValue().getPluginConstantsForFirebaseApp(c1947e)));
            }
            c0660k.c(hashMap);
        } catch (Exception e7) {
            c0660k.b(e7);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
