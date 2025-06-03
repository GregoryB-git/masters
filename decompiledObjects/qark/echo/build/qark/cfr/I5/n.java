/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.ExecutorService
 */
package I5;

import A5.a;
import E5.k;
import I5.a;
import I5.b;
import I5.c;
import I5.d;
import I5.e;
import I5.f;
import I5.g;
import I5.h;
import I5.i;
import I5.j;
import I5.k;
import I5.l;
import I5.m;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class n
implements FlutterFirebasePlugin,
k.c,
A5.a {
    public FirebaseAnalytics a;
    public E5.k b;

    public static /* synthetic */ void H(k.d d8, V2.j object) {
        if (object.n()) {
            d8.a(object.j());
            return;
        }
        object = (object = object.i()) != null ? object.getMessage() : "An unknown error occurred";
        d8.b("firebase_analytics", (String)object, null);
    }

    public static /* synthetic */ void a(n n8, Map map, V2.k k8) {
        n8.I(map, k8);
    }

    public static /* synthetic */ void b(n n8, Map map, V2.k k8) {
        n8.D(map, k8);
    }

    public static /* synthetic */ void c(V2.k k8) {
        n.x(k8);
    }

    public static /* synthetic */ void d(k.d d8, V2.j j8) {
        n.H(d8, j8);
    }

    public static /* synthetic */ void e(n n8, Map map, V2.k k8) {
        n8.F(map, k8);
    }

    public static /* synthetic */ void f(n n8, Map map, V2.k k8) {
        n8.G(map, k8);
    }

    public static /* synthetic */ void g(n n8, V2.k k8) {
        n8.y(k8);
    }

    public static /* synthetic */ void h(n n8, Map map, V2.k k8) {
        n8.J(map, k8);
    }

    public static /* synthetic */ void i(n n8, V2.k k8) {
        n8.C(k8);
    }

    public static /* synthetic */ void j(n n8, V2.k k8) {
        n8.z(k8);
    }

    public static /* synthetic */ void k(n n8, Map map, V2.k k8) {
        n8.B(map, k8);
    }

    public static /* synthetic */ void l(n n8, Map map, V2.k k8) {
        n8.E(map, k8);
    }

    public static /* synthetic */ void m(n n8, V2.k k8) {
        n8.A(k8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Bundle n(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        map = map.entrySet().iterator();
        do {
            Object object;
            Object object22;
            block16 : {
                long l8;
                block15 : {
                    block14 : {
                        if (!map.hasNext()) {
                            return bundle;
                        }
                        object = (Map.Entry)map.next();
                        object22 = object.getValue();
                        object = (String)object.getKey();
                        if (object22 instanceof String) {
                            bundle.putString((String)object, (String)object22);
                            continue;
                        }
                        if (!(object22 instanceof Integer)) break block14;
                        l8 = ((Integer)object22).intValue();
                        break block15;
                    }
                    if (!(object22 instanceof Long)) break block16;
                    l8 = (Long)object22;
                }
                bundle.putLong((String)object, l8);
                continue;
            }
            if (object22 instanceof Double) {
                bundle.putDouble((String)object, ((Double)object22).doubleValue());
                continue;
            }
            if (object22 instanceof Boolean) {
                bundle.putBoolean((String)object, ((Boolean)object22).booleanValue());
                continue;
            }
            if (object22 == null) {
                bundle.putString((String)object, null);
                continue;
            }
            if (object22 instanceof Iterable) {
                ArrayList arrayList = new ArrayList();
                for (Object object22 : (Iterable)object22) {
                    if (!(object22 instanceof Map)) {
                        map = new StringBuilder();
                        map.append("Unsupported value type: ");
                        map.append(object22.getClass().getCanonicalName());
                        map.append(" in list at key ");
                        map.append((String)object);
                        throw new IllegalArgumentException(map.toString());
                    }
                    arrayList.add((Object)n.n((Map)object22));
                }
                bundle.putParcelableArrayList((String)object, arrayList);
                continue;
            }
            if (!(object22 instanceof Map)) {
                map = new StringBuilder();
                map.append("Unsupported value type: ");
                map.append(object22.getClass().getCanonicalName());
                throw new IllegalArgumentException(map.toString());
            }
            bundle.putParcelable((String)object, (Parcelable)n.n((Map)object22));
        } while (true);
    }

    private void w(E5.c object, Context context) {
        this.a = FirebaseAnalytics.getInstance(context);
        this.b = object = new E5.k((E5.c)object, "plugins.flutter.io/firebase_analytics");
        object.e(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    public static /* synthetic */ void x(V2.k k8) {
        try {
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void A(V2.k k8) {
        try {
            k8.c((Object)((Long)V2.m.a(this.a.b())));
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void B(Map map, V2.k k8) {
        try {
            Object object = map.get((Object)"eventName");
            Objects.requireNonNull((Object)object);
            object = (String)object;
            map = n.n((Map)map.get((Object)"parameters"));
            this.a.c((String)object, (Bundle)map);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void C(V2.k k8) {
        try {
            this.a.d();
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void D(Map object, V2.k k8) {
        try {
            object = object.get((Object)"enabled");
            Objects.requireNonNull((Object)object);
            object = (Boolean)object;
            this.a.e(object.booleanValue());
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void E(Map object, V2.k k8) {
        try {
            object = object.get((Object)"milliseconds");
            Objects.requireNonNull((Object)object);
            object = (Integer)object;
            this.a.h(object.intValue());
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void F(Map object, V2.k k8) {
        try {
            object = (String)object.get((Object)"userId");
            this.a.i((String)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void G(Map object, V2.k k8) {
        try {
            Object object2 = object.get((Object)"name");
            Objects.requireNonNull((Object)object2);
            object2 = (String)object2;
            object = (String)object.get((Object)"value");
            this.a.j((String)object2, (String)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void I(Map object, V2.k k8) {
        try {
            FirebaseAnalytics.b b8;
            Boolean bl = (Boolean)object.get((Object)"adStorageConsentGranted");
            Boolean bl2 = (Boolean)object.get((Object)"analyticsStorageConsentGranted");
            HashMap hashMap = new HashMap();
            if (bl != null) {
                b8 = FirebaseAnalytics.b.o;
                object = bl != false ? FirebaseAnalytics.a.o : FirebaseAnalytics.a.p;
                hashMap.put((Object)b8, object);
            }
            if (bl2 != null) {
                b8 = FirebaseAnalytics.b.p;
                object = bl2 != false ? FirebaseAnalytics.a.o : FirebaseAnalytics.a.p;
                hashMap.put((Object)b8, object);
            }
            this.a.f((Map)hashMap);
            k8.c(null);
            return;
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public final /* synthetic */ void J(Map map, V2.k k8) {
        try {
            this.a.g(n.n(map));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final V2.j K(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new b(this, map, k8));
        return k8.a();
    }

    public final V2.j L(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new d(this, map, k8));
        return k8.a();
    }

    @Override
    public V2.j didReinitializeFirebaseCore() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new e(k8));
        return k8.a();
    }

    @Override
    public V2.j getPluginConstantsForFirebaseApp(s3.e object) {
        object = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new a(this, (V2.k)object));
        return object.a();
    }

    public final V2.j o() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new j(this, k8));
        return k8.a();
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.w(b8.b(), b8.a());
    }

    @Override
    public void onDetachedFromEngine(a.b object) {
        object = this.b;
        if (object != null) {
            object.e(null);
            this.b = null;
        }
    }

    @Override
    public void onMethodCall(E5.j object, k.d d8) {
        String string2 = object.a;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1992044651: {
                if (!string2.equals((Object)"Analytics#setUserId")) break;
                n9 = 9;
                break;
            }
            case 1751063748: {
                if (!string2.equals((Object)"Analytics#setSessionTimeoutDuration")) break;
                n9 = 8;
                break;
            }
            case 1083589925: {
                if (!string2.equals((Object)"Analytics#setUserProperty")) break;
                n9 = 7;
                break;
            }
            case 179244440: {
                if (!string2.equals((Object)"Analytics#getSessionId")) break;
                n9 = 6;
                break;
            }
            case -45011405: {
                if (!string2.equals((Object)"Analytics#logEvent")) break;
                n9 = 5;
                break;
            }
            case -99047480: {
                if (!string2.equals((Object)"Analytics#setDefaultEventParameters")) break;
                n9 = 4;
                break;
            }
            case -273201790: {
                if (!string2.equals((Object)"Analytics#setAnalyticsCollectionEnabled")) break;
                n9 = 3;
                break;
            }
            case -1572470123: {
                if (!string2.equals((Object)"Analytics#setConsent")) break;
                n9 = 2;
                break;
            }
            case -1931910274: {
                if (!string2.equals((Object)"Analytics#resetAnalyticsData")) break;
                n9 = 1;
                break;
            }
            case -2090892968: {
                if (!string2.equals((Object)"Analytics#getAppInstanceId")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 9: {
                object = this.u((Map)object.b());
                break;
            }
            case 8: {
                object = this.t((Map)object.b());
                break;
            }
            case 7: {
                object = this.v((Map)object.b());
                break;
            }
            case 6: {
                object = this.p();
                break;
            }
            case 5: {
                object = this.q((Map)object.b());
                break;
            }
            case 4: {
                object = this.L((Map)object.b());
                break;
            }
            case 3: {
                object = this.s((Map)object.b());
                break;
            }
            case 2: {
                object = this.K((Map)object.b());
                break;
            }
            case 1: {
                object = this.r();
                break;
            }
            case 0: {
                object = this.o();
            }
        }
        object.b(new f(d8));
    }

    public final V2.j p() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new g(this, k8));
        return k8.a();
    }

    public final V2.j q(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new i(this, map, k8));
        return k8.a();
    }

    public final V2.j r() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new m(this, k8));
        return k8.a();
    }

    public final V2.j s(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new l(this, map, k8));
        return k8.a();
    }

    public final V2.j t(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new k(this, map, k8));
        return k8.a();
    }

    public final V2.j u(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new c(this, map, k8));
        return k8.a();
    }

    public final V2.j v(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new h(this, map, k8));
        return k8.a();
    }

    public final /* synthetic */ void y(V2.k k8) {
        try {
            k8.c((Object)new HashMap(){});
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void z(V2.k k8) {
        try {
            k8.c((String)V2.m.a(this.a.a()));
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

}

