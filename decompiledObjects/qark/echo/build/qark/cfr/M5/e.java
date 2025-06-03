/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.ExecutorService
 */
package M5;

import A5.a;
import E5.d;
import E5.j;
import E5.k;
import M5.a;
import M5.b;
import M5.c;
import M5.d;
import P4.n;
import P4.o;
import P4.p;
import P4.q;
import P4.r;
import P4.s;
import P4.t;
import V2.m;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/*
 * Exception performing whole class analysis ignored.
 */
public class e
implements FlutterFirebasePlugin,
k.c,
A5.a,
d.d {
    public k a;
    public final Map b = new HashMap();
    public E5.d c;
    public final Handler d = new Handler(Looper.getMainLooper());

    public e() {
    }

    public static /* synthetic */ void c(k.d d8, V2.j j8) {
        e.l(d8, j8);
    }

    public static /* synthetic */ void d(e e8, s3.e e9, V2.k k8) {
        e8.k(e9, k8);
    }

    public static /* synthetic */ void e(V2.k k8) {
        e.j(k8);
    }

    public static /* synthetic */ void j(V2.k k8) {
        try {
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void l(k.d var0, V2.j var1_1) {
        block5 : {
            block4 : {
                if (var1_1.n()) {
                    var0.a(var1_1.j());
                    return;
                }
                var3_2 = var1_1.i();
                var2_3 = new HashMap();
                if (!(var3_2 instanceof p)) break block4;
                var2_3.put((Object)"code", (Object)"throttled");
                var1_1 = "frequency of requests exceeds throttled limits";
                ** GOTO lbl25
            }
            if (!(var3_2 instanceof n)) break block5;
            var2_3.put((Object)"code", (Object)"internal");
            var1_1 = "internal remote config fetch error";
            ** GOTO lbl25
        }
        if (var3_2 instanceof r) {
            var2_3.put((Object)"code", (Object)"remote-config-server-error");
            var2_3.put((Object)"message", (Object)var3_2.getMessage());
            var1_1 = var3_2.getCause();
            if (var1_1 != null && (var1_1 = var1_1.getMessage()) != null && var1_1.contains((CharSequence)"Forbidden")) {
                var2_3.put((Object)"code", (Object)"forbidden");
            }
        } else {
            var2_3.put((Object)"code", (Object)"unknown");
            var1_1 = "unknown remote config error";
lbl25: // 3 sources:
            var2_3.put((Object)"message", var1_1);
        }
        var1_1 = var3_2 != null ? var3_2.getMessage() : null;
        var0.b("firebase_remote_config", (String)var1_1, (Object)var2_3);
    }

    @Override
    public void a(Object object) {
        object = ((Map)object).get((Object)"appName");
        Objects.requireNonNull((Object)object);
        object = (String)object;
        P4.d d8 = (P4.d)this.b.get(object);
        if (d8 != null) {
            d8.remove();
            this.b.remove(object);
        }
    }

    @Override
    public void b(Object object, final d.b b8) {
        Object object2 = (Map)object;
        object = this.i((Map)object2);
        object2 = object2.get((Object)"appName");
        Objects.requireNonNull((Object)object2);
        object2 = (String)object2;
        this.b.put(object2, (Object)object.i(new P4.c(){

            public static /* synthetic */ void c(d.b b82, ArrayList arrayList) {
                b82.a((Object)arrayList);
            }

            @Override
            public void a(o o8) {
                b8.b("firebase_remote_config", o8.getMessage(), null);
            }

            @Override
            public void b(P4.b b82) {
                b82 = new ArrayList((Collection)b82.b());
                e.this.d.post((Runnable)new d(b8, (ArrayList)b82));
            }
        }));
    }

    @Override
    public V2.j didReinitializeFirebaseCore() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new a(k8));
        return k8.a();
    }

    public final Map g(t t8) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"value", (Object)t8.e());
        hashMap.put((Object)"source", (Object)this.n(t8.f()));
        return hashMap;
    }

    @Override
    public V2.j getPluginConstantsForFirebaseApp(s3.e e8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new b(this, e8, k8));
        return k8.a();
    }

    public final Map h(P4.m m8) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"fetchTimeout", (Object)m8.n().b().a());
        hashMap.put((Object)"minimumFetchInterval", (Object)m8.n().b().b());
        hashMap.put((Object)"lastFetchTime", (Object)m8.n().a());
        hashMap.put((Object)"lastFetchStatus", (Object)this.m(m8.n().c()));
        m8 = new StringBuilder();
        m8.append("Sending fetchTimeout: ");
        m8.append(hashMap.get((Object)"fetchTimeout"));
        t5.b.a("FRCPlugin", m8.toString());
        return hashMap;
    }

    public final P4.m i(Map object) {
        object = object.get((Object)"appName");
        Objects.requireNonNull((Object)object);
        return P4.m.o(s3.e.p((String)object));
    }

    public final /* synthetic */ void k(s3.e object, V2.k k8) {
        try {
            object = P4.m.o((s3.e)object);
            HashMap hashMap = new HashMap(this.h((P4.m)object));
            hashMap.put((Object)"parameters", (Object)this.o(object.m()));
            k8.c((Object)hashMap);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final String m(int n8) {
        if (n8 != -1) {
            if (n8 != 0) {
                if (n8 != 2) {
                    return "failure";
                }
                return "throttled";
            }
            return "noFetchYet";
        }
        return "success";
    }

    public final String n(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                return "static";
            }
            return "remote";
        }
        return "default";
    }

    public final Map o(Map map) {
        HashMap hashMap = new HashMap();
        for (String string2 : map.keySet()) {
            t t8 = (t)map.get((Object)string2);
            Objects.requireNonNull((Object)t8);
            hashMap.put((Object)string2, (Object)this.g(t8));
        }
        return hashMap;
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.p(b8.b());
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.q();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void onMethodCall(j var1_1, k.d var2_2) {
        var5_3 = this.i((Map)var1_1.b());
        var6_4 = var1_1.a;
        var6_4.hashCode();
        var4_5 = var6_4.hashCode();
        var3_6 = -1;
        switch (var4_5) {
            default: {
                break;
            }
            case 1069772825: {
                if (!var6_4.equals((Object)"RemoteConfig#setDefaults")) break;
                var3_6 = 7;
                break;
            }
            case 198105259: {
                if (!var6_4.equals((Object)"RemoteConfig#fetchAndActivate")) break;
                var3_6 = 6;
                break;
            }
            case 120001542: {
                if (!var6_4.equals((Object)"RemoteConfig#getAll")) break;
                var3_6 = 5;
                break;
            }
            case 47629262: {
                if (!var6_4.equals((Object)"RemoteConfig#activate")) break;
                var3_6 = 4;
                break;
            }
            case 2948543: {
                if (!var6_4.equals((Object)"RemoteConfig#fetch")) break;
                var3_6 = 3;
                break;
            }
            case -824350930: {
                if (!var6_4.equals((Object)"RemoteConfig#getProperties")) break;
                var3_6 = 2;
                break;
            }
            case -967766516: {
                if (!var6_4.equals((Object)"RemoteConfig#setConfigSettings")) break;
                var3_6 = 1;
                break;
            }
            case -1145383109: {
                if (!var6_4.equals((Object)"RemoteConfig#ensureInitialized")) break;
                var3_6 = 0;
            }
        }
        switch (var3_6) {
            default: {
                var2_2.c();
                return;
            }
            case 7: {
                var1_1 = (Map)var1_1.a("defaults");
                Objects.requireNonNull((Object)var1_1);
                var1_1 = var5_3.z((Map)var1_1);
                ** break;
            }
            case 6: {
                var1_1 = var5_3.l();
                ** break;
            }
            case 5: {
                var1_1 = this.o(var5_3.m());
                ** GOTO lbl63
            }
            case 4: {
                var1_1 = var5_3.h();
                ** break;
            }
            case 3: {
                var1_1 = var5_3.k();
                ** break;
            }
            case 2: {
                var1_1 = this.h(var5_3);
lbl63: // 2 sources:
                var1_1 = m.e(var1_1);
                ** break;
            }
            case 1: {
                var6_4 = (Integer)var1_1.a("fetchTimeout");
                Objects.requireNonNull((Object)var6_4);
                var3_6 = var6_4.intValue();
                var1_1 = (Integer)var1_1.a("minimumFetchInterval");
                Objects.requireNonNull((Object)var1_1);
                var4_5 = var1_1.intValue();
                var1_1 = var5_3.x(new s.b().d(var3_6).e(var4_5).c());
                ** break;
            }
            case 0: 
        }
        var1_1 = m.g(new V2.j[]{var5_3.j()});
lbl76: // 7 sources:
        var1_1.b(new c(var2_2));
    }

    public final void p(E5.c object) {
        k k8;
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_remote_config", this);
        this.a = k8 = new k((E5.c)object, "plugins.flutter.io/firebase_remote_config");
        k8.e(this);
        this.c = object = new E5.d((E5.c)object, "plugins.flutter.io/firebase_remote_config_updated");
        object.d(this);
    }

    public final void q() {
        this.a.e(null);
        this.a = null;
        this.c.d(null);
        this.c = null;
    }

}

