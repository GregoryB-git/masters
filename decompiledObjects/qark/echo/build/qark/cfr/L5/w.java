/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Set
 *  java.util.concurrent.ExecutorService
 */
package L5;

import A5.a;
import E5.c;
import E5.d;
import E5.k;
import L5.A;
import L5.D;
import L5.b;
import L5.d;
import L5.e;
import L5.f;
import L5.g;
import L5.h;
import L5.i;
import L5.j;
import L5.k;
import L5.l;
import L5.m;
import L5.n;
import L5.o;
import L5.p;
import L5.q;
import L5.r;
import L5.s;
import L5.t;
import L5.u;
import L5.v;
import L5.x;
import L5.y;
import L5.z;
import Q3.r;
import android.util.Log;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class w
implements FlutterFirebasePlugin,
a,
k.c {
    public static final HashMap e = new HashMap();
    public int a = 0;
    public final Map b = new HashMap();
    public E5.k c;
    public c d;

    public static /* synthetic */ void E(V2.k k8) {
        try {
            k8.c((Object)new HashMap());
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void J(k.d d8, E5.j object, V2.j j8) {
        if (j8.n()) {
            d8.a(j8.j());
            return;
        }
        if ((j8 = j8.i()) instanceof y) {
            object = (y)((Object)j8);
        } else if (j8 instanceof Q3.d) {
            object = y.b((Q3.d)((Object)j8));
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("An unknown error occurred handling native method call ");
            stringBuilder.append(object.a);
            Log.e((String)"firebase_database", (String)stringBuilder.toString(), (Throwable)j8);
            object = y.c((Exception)j8);
        }
        d8.b(object.e(), object.getMessage(), (Object)object.d());
    }

    public static /* synthetic */ void a(w w8, Map map, V2.k k8) {
        w8.M(map, k8);
    }

    public static /* synthetic */ void b(w w8, Map map, V2.k k8) {
        w8.P(map, k8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b0(Q3.h h8, String string2) {
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                if ((Q3.h)hashMap.get((Object)string2) == null) {
                    hashMap.put((Object)string2, (Object)h8);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* synthetic */ void c(w w8, Map map, V2.k k8) {
        w8.I(map, k8);
    }

    public static /* synthetic */ void d(w w8, Map map, V2.k k8) {
        w8.U(map, k8);
    }

    public static /* synthetic */ void e(w w8, Map map, V2.k k8) {
        w8.Q(map, k8);
    }

    public static /* synthetic */ void f(w w8, Map map, V2.k k8) {
        w8.R(map, k8);
    }

    public static /* synthetic */ void g(w w8, V2.k k8) {
        w8.D(k8);
    }

    public static /* synthetic */ void h(w w8, Map map, V2.k k8) {
        w8.L(map, k8);
    }

    public static /* synthetic */ void i(w w8, Map map, V2.k k8) {
        w8.O(map, k8);
    }

    public static /* synthetic */ void j(w w8, Map map, V2.k k8) {
        w8.N(map, k8);
    }

    public static /* synthetic */ void k(w w8, Map map, V2.k k8) {
        w8.F(map, k8);
    }

    public static /* synthetic */ void l(k.d d8, E5.j j8, V2.j j9) {
        w.J(d8, j8, j9);
    }

    public static /* synthetic */ void m(w w8, Map map, V2.k k8) {
        w8.T(map, k8);
    }

    public static /* synthetic */ void n(w w8, Map map, V2.k k8) {
        w8.C(map, k8);
    }

    public static /* synthetic */ void o(w w8, Map map, V2.k k8) {
        w8.G(map, k8);
    }

    public static /* synthetic */ void p(w w8, Map map, V2.k k8) {
        w8.S(map, k8);
    }

    public static /* synthetic */ void q(V2.k k8) {
        w.E(k8);
    }

    public static /* synthetic */ void r(w w8, Map map, V2.k k8) {
        w8.K(map, k8);
    }

    public static /* synthetic */ void s(E5.d d8) {
        d8.d(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Q3.h v(String object) {
        HashMap hashMap = e;
        synchronized (hashMap) {
            return (Q3.h)hashMap.get(object);
        }
    }

    public final V2.j A(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new u(this, map, k8));
        return k8.a();
    }

    public final void B(c object) {
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_database", this);
        this.d = object;
        this.c = object = new E5.k((c)object, "plugins.flutter.io/firebase_database");
        object.e(this);
    }

    public final /* synthetic */ void C(Map map, V2.k k8) {
        try {
            V2.m.a(this.y(map).Z().c());
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void D(V2.k k8) {
        try {
            this.u();
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void F(Map map, V2.k k8) {
        try {
            this.w(map).h();
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void G(Map map, V2.k k8) {
        try {
            this.w(map).i();
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void I(Map object, V2.k k8) {
        try {
            Object object2 = this.x((Map)object);
            object = (String)object.get((Object)"eventChannelNamePrefix");
            Object object3 = new StringBuilder();
            object3.append((String)object);
            object3.append("#");
            int n8 = this.a;
            this.a = n8 + 1;
            object3.append(n8);
            object = object3.toString();
            object3 = new E5.d(this.d, (String)object);
            object2 = new b((Q3.p)object2, new m((E5.d)object3));
            object3.d((d.d)object2);
            this.b.put(object3, object2);
            k8.c(object);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void K(Map map, V2.k k8) {
        try {
            this.w(map).j();
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void L(Map map, V2.k k8) {
        try {
            k8.c((Object)new x((Q3.b)V2.m.a(this.x(map).r())).a());
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void M(Map object, V2.k k8) {
        try {
            Q3.p p8 = this.x((Map)object);
            object = object.get((Object)"value");
            Objects.requireNonNull((Object)object);
            p8.v((Boolean)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void N(Map object, V2.k k8) {
        try {
            Q3.e e8 = this.y((Map)object);
            Object object2 = object.get((Object)"transactionKey");
            Objects.requireNonNull((Object)object2);
            int n8 = (Integer)object2;
            object = object.get((Object)"transactionApplyLocally");
            Objects.requireNonNull((Object)object);
            boolean bl = (Boolean)object;
            object = new D(this.c, n8);
            e8.a0((r.b)object, bl);
            k8.c((Object)((Map)V2.m.a(object.c())));
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void O(Map map, V2.k k8) {
        try {
            Object object = map.get((Object)"value");
            V2.m.a(this.y(map).Z().f(object));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void P(Map map, V2.k k8) {
        try {
            V2.m.a(this.y(map).b0(map.get((Object)"priority")));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void Q(Map map, V2.k k8) {
        try {
            V2.m.a(this.y(map).d0(map.get((Object)"value")));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void R(Map map, V2.k k8) {
        try {
            V2.m.a(this.y(map).e0(map.get((Object)"value"), map.get((Object)"priority")));
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
    public final /* synthetic */ void S(Map object, V2.k k8) {
        try {
            Object object2 = object.get((Object)"value");
            Object object3 = object.get((Object)"priority");
            object = this.y((Map)object).Z();
            if (object3 instanceof Double) {
                object = object.g(object2, ((Number)object3).doubleValue());
            } else if (object3 instanceof String) {
                object = object.h(object2, (String)object3);
            } else {
                if (object3 != null) {
                    throw new Exception("Invalid priority value for OnDisconnect.setWithPriority");
                }
                object = object.h(object2, null);
            }
            V2.m.a((V2.j)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public final /* synthetic */ void T(Map object, V2.k k8) {
        try {
            Q3.e e8 = this.y((Map)object);
            object = object.get((Object)"value");
            Objects.requireNonNull((Object)object);
            V2.m.a(e8.g0((Map)object));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void U(Map object, V2.k k8) {
        try {
            Q3.e e8 = this.y((Map)object);
            object = object.get((Object)"value");
            Objects.requireNonNull((Object)object);
            object = (Map)object;
            V2.m.a(e8.Z().i((Map)object));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final V2.j V(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new g(this, map, k8));
        return k8.a();
    }

    public final V2.j W(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new q(this, map, k8));
        return k8.a();
    }

    public final V2.j X(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new k(this, map, k8));
        return k8.a();
    }

    public final V2.j Y(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new f(this, map, k8));
        return k8.a();
    }

    public final void Z() {
        for (E5.d d8 : this.b.keySet()) {
            d.d d9 = (d.d)this.b.get((Object)d8);
            if (d9 == null) continue;
            d9.a(null);
            d8.d(null);
        }
        this.b.clear();
    }

    public final V2.j a0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new s(this, map, k8));
        return k8.a();
    }

    public final V2.j c0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new v(this, map, k8));
        return k8.a();
    }

    public final V2.j d0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new j(this, map, k8));
        return k8.a();
    }

    @Override
    public V2.j didReinitializeFirebaseCore() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new n(this, k8));
        return k8.a();
    }

    public final V2.j e0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new i(this, map, k8));
        return k8.a();
    }

    public final V2.j f0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new t(this, map, k8));
        return k8.a();
    }

    public final V2.j g0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new r(this, map, k8));
        return k8.a();
    }

    @Override
    public V2.j getPluginConstantsForFirebaseApp(s3.e object) {
        object = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new d((V2.k)object));
        return object.a();
    }

    public final V2.j h0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new l(this, map, k8));
        return k8.a();
    }

    public final V2.j i0(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new p(this, map, k8));
        return k8.a();
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.B(b8.b());
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.c.e(null);
        this.u();
    }

    @Override
    public void onMethodCall(E5.j j8, k.d d8) {
        Object object = (Map)j8.b();
        String string2 = j8.a;
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1749611585: {
                if (!string2.equals((Object)"Query#observe")) break;
                n9 = 14;
                break;
            }
            case 1653150716: {
                if (!string2.equals((Object)"FirebaseDatabase#goOnline")) break;
                n9 = 13;
                break;
            }
            case 1185022340: {
                if (!string2.equals((Object)"OnDisconnect#setWithPriority")) break;
                n9 = 12;
                break;
            }
            case 734082383: {
                if (!string2.equals((Object)"DatabaseReference#set")) break;
                n9 = 11;
                break;
            }
            case 485025361: {
                if (!string2.equals((Object)"OnDisconnect#update")) break;
                n9 = 10;
                break;
            }
            case 272980762: {
                if (!string2.equals((Object)"Query#keepSynced")) break;
                n9 = 9;
                break;
            }
            case 195628283: {
                if (!string2.equals((Object)"Query#get")) break;
                n9 = 8;
                break;
            }
            case -43852798: {
                if (!string2.equals((Object)"OnDisconnect#cancel")) break;
                n9 = 7;
                break;
            }
            case -429179942: {
                if (!string2.equals((Object)"OnDisconnect#set")) break;
                n9 = 6;
                break;
            }
            case -526424742: {
                if (!string2.equals((Object)"FirebaseDatabase#goOffline")) break;
                n9 = 5;
                break;
            }
            case -858161988: {
                if (!string2.equals((Object)"DatabaseReference#update")) break;
                n9 = 4;
                break;
            }
            case -1481870471: {
                if (!string2.equals((Object)"DatabaseReference#setWithPriority")) break;
                n9 = 3;
                break;
            }
            case -1666493916: {
                if (!string2.equals((Object)"FirebaseDatabase#purgeOutstandingWrites")) break;
                n9 = 2;
                break;
            }
            case -2059578349: {
                if (!string2.equals((Object)"DatabaseReference#setPriority")) break;
                n9 = 1;
                break;
            }
            case -2082411450: {
                if (!string2.equals((Object)"DatabaseReference#runTransaction")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                d8.c();
                return;
            }
            case 14: {
                object = this.V((Map)object);
                break;
            }
            case 13: {
                object = this.A((Map)object);
                break;
            }
            case 12: {
                object = this.g0((Map)object);
                break;
            }
            case 11: {
                object = this.e0((Map)object);
                break;
            }
            case 10: {
                object = this.i0((Map)object);
                break;
            }
            case 9: {
                object = this.Y((Map)object);
                break;
            }
            case 8: {
                object = this.X((Map)object);
                break;
            }
            case 7: {
                object = this.t((Map)object);
                break;
            }
            case 6: {
                object = this.c0((Map)object);
                break;
            }
            case 5: {
                object = this.z((Map)object);
                break;
            }
            case 4: {
                object = this.h0((Map)object);
                break;
            }
            case 3: {
                object = this.f0((Map)object);
                break;
            }
            case 2: {
                object = this.W((Map)object);
                break;
            }
            case 1: {
                object = this.d0((Map)object);
                break;
            }
            case 0: {
                object = this.a0((Map)object);
            }
        }
        object.b(new o(d8, j8));
    }

    public final V2.j t(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new e(this, map, k8));
        return k8.a();
    }

    public final void u() {
        this.Z();
        e.clear();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Q3.h w(Map var1_1) {
        block10 : {
            var6_2 = (String)var1_1.get((Object)"appName");
            var5_4 = var6_2;
            if (var6_2 == null) {
                var5_4 = "[DEFAULT]";
            }
            var6_2 = var7_5 = (String)var1_1.get((Object)"databaseURL");
            if (var7_5 == null) {
                var6_2 = "";
            }
            if ((var8_6 = w.v(var7_5 = var5_4.concat(var6_2))) != null) {
                return var8_6;
            }
            var5_4 = s3.e.p((String)var5_4);
            var5_4 = var6_2.isEmpty() == false ? Q3.h.e((s3.e)var5_4, var6_2) : Q3.h.d((s3.e)var5_4);
            var11_7 = (Boolean)var1_1.get((Object)"loggingEnabled");
            var6_2 = (Boolean)var1_1.get((Object)"persistenceEnabled");
            var8_6 = (String)var1_1.get((Object)"emulatorHost");
            var9_8 = (Integer)var1_1.get((Object)"emulatorPort");
            var10_9 = var1_1.get((Object)"cacheSizeBytes");
            if (var11_7 == null) ** GOTO lbl21
            try {
                var1_1 = var11_7 != false ? Q3.l.o : Q3.l.s;
                var5_4.k((Q3.l)var1_1);
lbl21: // 2 sources:
                if (var8_6 != null && var9_8 != null) {
                    var5_4.n((String)var8_6, var9_8);
                }
                if (var6_2 != null) {
                    var5_4.m(var6_2.booleanValue());
                }
                if (var10_9 == null) break block10;
                if (var10_9 instanceof Long) {
                    var3_10 = (Long)var10_9;
                } else {
                    if (!(var10_9 instanceof Integer)) break block10;
                    var2_11 = (Integer)var10_9;
                    var3_10 = var2_11;
                }
                var5_4.l(var3_10);
                break block10;
            }
            catch (Q3.d var6_3) {}
            var1_1 = var6_3.getMessage();
            if (var1_1 == null) throw var6_3;
            if (var1_1.contains((CharSequence)"must be made before any other usage of FirebaseDatabase") == false) throw var6_3;
        }
        w.b0((Q3.h)var5_4, var7_5);
        return var5_4;
    }

    public final Q3.p x(Map object) {
        Q3.e e8 = this.y((Map)object);
        object = object.get((Object)"modifiers");
        Objects.requireNonNull((Object)object);
        return new A(e8, (List)object).a();
    }

    public final Q3.e y(Map object) {
        Q3.h h8 = this.w((Map)object);
        object = object.get((Object)"path");
        Objects.requireNonNull((Object)object);
        return h8.f((String)object);
    }

    public final V2.j z(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new h(this, map, k8));
        return k8.a();
    }
}

