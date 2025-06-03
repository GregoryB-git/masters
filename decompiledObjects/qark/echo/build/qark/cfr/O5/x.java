/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.ExecutorService
 */
package O5;

import A5.a;
import E5.c;
import E5.k;
import O5.A;
import O5.B;
import O5.C;
import O5.a;
import O5.b;
import O5.g;
import O5.h;
import O5.i;
import O5.j;
import O5.k;
import O5.l;
import O5.m;
import O5.n;
import O5.o;
import O5.p;
import O5.q;
import O5.r;
import O5.s;
import O5.t;
import O5.u;
import O5.v;
import O5.w;
import O5.y;
import O5.z;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import s3.e;

public class x
implements FlutterFirebasePlugin,
k.c,
E5.n,
A5.a,
B5.a {
    public final HashMap a = new HashMap();
    public E5.k b;
    public Activity c;
    public final LiveData d = B.k();
    public androidx.lifecycle.m e;
    public final LiveData f = C.k();
    public androidx.lifecycle.m g;
    public T h;
    public Map i;
    public A j;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void C(e e8, V2.k k8) {
        try {
            HashMap hashMap = new HashMap();
            if (e8.q().equals((Object)"[DEFAULT]")) {
                hashMap.put((Object)"AUTO_INIT_ENABLED", (Object)FirebaseMessaging.r().y());
            }
            k8.c((Object)hashMap);
            return;
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public static /* synthetic */ void H(Map map, V2.k k8, int n8) {
        map.put((Object)"authorizationStatus", (Object)n8);
        k8.c((Object)map);
    }

    public static /* synthetic */ void K(Map map, V2.k k8) {
        try {
            z.a(map).L(z.b(map));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void M(Map object, V2.k k8) {
        try {
            FirebaseMessaging firebaseMessaging = z.a((Map)object);
            object = object.get((Object)"enabled");
            Objects.requireNonNull((Object)object);
            firebaseMessaging.N((Boolean)object);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void N(Map object, V2.k k8) {
        try {
            FirebaseMessaging firebaseMessaging = z.a((Map)object);
            object = object.get((Object)"topic");
            Objects.requireNonNull((Object)object);
            V2.m.a(firebaseMessaging.R((String)object));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void O(Map object, V2.k k8) {
        try {
            FirebaseMessaging firebaseMessaging = z.a((Map)object);
            object = object.get((Object)"topic");
            Objects.requireNonNull((Object)object);
            V2.m.a(firebaseMessaging.U((String)object));
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void a(Map map, V2.k k8) {
        x.K(map, k8);
    }

    public static /* synthetic */ void b(Map map, V2.k k8) {
        x.N(map, k8);
    }

    public static /* synthetic */ void c(x x8, T t8) {
        x8.E(t8);
    }

    public static /* synthetic */ void d(Map map, V2.k k8) {
        x.O(map, k8);
    }

    public static /* synthetic */ void e(x x8, k.d d8, V2.j j8) {
        x8.G(d8, j8);
    }

    public static /* synthetic */ void f(x x8, String string2) {
        x8.F(string2);
    }

    public static /* synthetic */ void g(x x8, V2.k k8) {
        x8.J(k8);
    }

    public static /* synthetic */ void h(V2.k k8) {
        x.y(k8);
    }

    public static /* synthetic */ void i(x x8, V2.k k8) {
        x8.A(k8);
    }

    public static /* synthetic */ void j(e e8, V2.k k8) {
        x.C(e8, k8);
    }

    public static /* synthetic */ void k(V2.k k8, String string2) {
        k8.b(new Exception(string2));
    }

    public static /* synthetic */ void l(Map map, V2.k k8) {
        x.M(map, k8);
    }

    public static /* synthetic */ void m(x x8, Map map, V2.k k8) {
        x8.L(map, k8);
    }

    public static /* synthetic */ void n(V2.k k8) {
        k8.c(null);
    }

    public static /* synthetic */ void o(Map map, V2.k k8, int n8) {
        x.H(map, k8, n8);
    }

    public static /* synthetic */ void p(x x8, V2.k k8) {
        x8.B(k8);
    }

    public static /* synthetic */ void q(x x8, V2.k k8) {
        x8.D(k8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map t(Exception object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"code", (Object)"unknown");
        object = object != null ? object.getMessage() : "An unknown error has occurred.";
        hashMap.put((Object)"message", object);
        return hashMap;
    }

    private void x(c object) {
        this.b = object = new E5.k((c)object, "plugins.flutter.io/firebase_messaging");
        object.e(this);
        this.j = new A();
        this.e = new o(this);
        this.g = new p(this);
        this.d.e(this.e);
        this.f.e(this.g);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    public static /* synthetic */ void y(V2.k k8) {
        try {
            V2.m.a(FirebaseMessaging.r().o());
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ void A(V2.k var1_1) {
        block11 : {
            block10 : {
                try {
                    block12 : {
                        block13 : {
                            var2_2 = this.h;
                            if (var2_2 != null) {
                                var2_2 = z.f((T)var2_2);
                                var3_4 = this.i;
                                if (var3_4 != null) {
                                    var2_2.put((Object)"notification", (Object)var3_4);
                                }
                                var1_1.c(var2_2);
                                this.h = null;
                                this.i = null;
                                return;
                            }
                            var2_2 = this.c;
                            if (var2_2 == null) {
                                var1_1.c(null);
                                return;
                            }
                            var3_5 = var2_2.getIntent();
                            if (var3_5 == null || var3_5.getExtras() == null) break block12;
                            var4_6 = var2_2 = var3_5.getExtras().getString("google.message_id");
                            if (var2_2 == null) {
                                var4_6 = var3_5.getExtras().getString("message_id");
                            }
                            if (var4_6 == null || this.a.get(var4_6) != null) break block13;
                            var2_2 = (T)FlutterFirebaseMessagingReceiver.a.get(var4_6);
                            if (var2_2 != null) break block10;
                            var5_7 = y.b().a((String)var4_6);
                            if (var5_7 == null) ** GOTO lbl-1000
                            var2_2 = var3_5 = z.b(var5_7);
                            if (var5_7.get((Object)"notification") != null) {
                                var5_7 = (Map)var5_7.get((Object)"notification");
                                var2_2 = var3_5;
                                var3_5 = var5_7;
                            } else lbl-1000: // 2 sources:
                            {
                                var3_5 = null;
                            }
                            y.b().g((String)var4_6);
                            break block11;
                        }
                        var1_1.c(null);
                        return;
                    }
                    var1_1.c(null);
                    return;
                }
                catch (Exception var2_3) {}
                var1_1.b(var2_3);
                return;
            }
            var3_5 = null;
        }
        if (var2_2 == null) {
            var1_1.c(null);
            return;
        }
        this.a.put(var4_6, (Object)Boolean.TRUE);
        var4_6 = z.f((T)var2_2);
        if (var2_2.q() == null && var3_5 != null) {
            var4_6.put((Object)"notification", var3_5);
        }
        var1_1.c(var4_6);
    }

    public final /* synthetic */ void B(V2.k k8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final /* synthetic */ void D(V2.k k8) {
        try {
            k8.c((Object)new HashMap((String)V2.m.a(FirebaseMessaging.r().u())){
                public final /* synthetic */ String o;
                {
                    this.o = string2;
                    this.put((Object)"token", (Object)string2);
                }
            });
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final /* synthetic */ void E(T t8) {
        t8 = z.f(t8);
        this.b.c("Messaging#onMessage", t8);
    }

    public final /* synthetic */ void F(String string2) {
        this.b.c("Messaging#onTokenRefresh", string2);
    }

    public final /* synthetic */ void G(k.d d8, V2.j object) {
        if (object.n()) {
            d8.a(object.j());
            return;
        }
        Exception exception = object.i();
        object = exception != null ? exception.getMessage() : null;
        d8.b("firebase_messaging", (String)object, (Object)this.t(exception));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void J(V2.k k8) {
        HashMap hashMap = new HashMap();
        try {
            if (!this.r().booleanValue()) {
                this.j.a(this.c, new m((Map)hashMap, k8), new n(k8));
                return;
            }
            hashMap.put((Object)"authorizationStatus", (Object)1);
            k8.c((Object)hashMap);
            return;
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public final /* synthetic */ void L(Map object, V2.k k8) {
        try {
            final FirebaseMessaging firebaseMessaging = z.a((Map)object);
            object = object.get((Object)"enabled");
            Objects.requireNonNull((Object)object);
            firebaseMessaging.M((Boolean)object);
            k8.c((Object)new HashMap(){
                {
                    this.put((Object)"isAutoInitEnabled", (Object)firebaseMessaging2.y());
                }
            });
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public final V2.j P() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new s(this, k8));
        return k8.a();
    }

    public final V2.j Q(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new t(map, k8));
        return k8.a();
    }

    public final V2.j R(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new k(this, map, k8));
        return k8.a();
    }

    public final V2.j S(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new j(map, k8));
        return k8.a();
    }

    public final V2.j T(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new l(map, k8));
        return k8.a();
    }

    public final V2.j U(Map map) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new i(map, k8));
        return k8.a();
    }

    @Override
    public V2.j didReinitializeFirebaseCore() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new q(k8));
        return k8.a();
    }

    @Override
    public V2.j getPluginConstantsForFirebaseApp(e e8) {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new g(e8, k8));
        return k8.a();
    }

    @Override
    public void onAttachedToActivity(B5.c c8) {
        c8.g(this);
        c8.e(this.j);
        c8 = c8.c();
        this.c = c8;
        if (c8.getIntent() != null && this.c.getIntent().getExtras() != null && (this.c.getIntent().getFlags() & 1048576) != 1048576) {
            this.onNewIntent(this.c.getIntent());
        }
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.x(b8.b());
    }

    @Override
    public void onDetachedFromActivity() {
        this.c = null;
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.c = null;
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.f.i(this.g);
        this.d.i(this.e);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void onMethodCall(E5.j var1_1, k.d var2_2) {
        var9_3 = var1_1.a;
        var9_3.hashCode();
        var4_4 = var9_3.hashCode();
        var3_5 = -1;
        switch (var4_4) {
            default: {
                break;
            }
            case 1459336962: {
                if (!var9_3.equals((Object)"Messaging#getToken")) break;
                var3_5 = 10;
                break;
            }
            case 1243856389: {
                if (!var9_3.equals((Object)"Messaging#getNotificationSettings")) break;
                var3_5 = 9;
                break;
            }
            case 1231338975: {
                if (!var9_3.equals((Object)"Messaging#requestPermission")) break;
                var3_5 = 8;
                break;
            }
            case 1165917248: {
                if (!var9_3.equals((Object)"Messaging#sendMessage")) break;
                var3_5 = 7;
                break;
            }
            case 928431066: {
                if (!var9_3.equals((Object)"Messaging#startBackgroundIsolate")) break;
                var3_5 = 6;
                break;
            }
            case 607887267: {
                if (!var9_3.equals((Object)"Messaging#setDeliveryMetricsExportToBigQuery")) break;
                var3_5 = 5;
                break;
            }
            case 506322569: {
                if (!var9_3.equals((Object)"Messaging#subscribeToTopic")) break;
                var3_5 = 4;
                break;
            }
            case 421314579: {
                if (!var9_3.equals((Object)"Messaging#unsubscribeFromTopic")) break;
                var3_5 = 3;
                break;
            }
            case -657665041: {
                if (!var9_3.equals((Object)"Messaging#deleteToken")) break;
                var3_5 = 2;
                break;
            }
            case -1661255137: {
                if (!var9_3.equals((Object)"Messaging#setAutoInitEnabled")) break;
                var3_5 = 1;
                break;
            }
            case -1704007366: {
                if (!var9_3.equals((Object)"Messaging#getInitialMessage")) break;
                var3_5 = 0;
            }
        }
        switch (var3_5) {
            default: {
                var2_2.c();
                return;
            }
            case 10: {
                var1_1 = this.w();
                ** break;
            }
            case 8: {
                if (Build.VERSION.SDK_INT >= 33) {
                    var1_1 = this.P();
                    ** break;
                }
            }
            case 9: {
                var1_1 = this.v();
                ** break;
            }
            case 7: {
                var1_1 = this.Q((Map)var1_1.b());
                ** break;
            }
            case 6: {
                var9_3 = (Map)var1_1.b;
                var1_1 = var9_3.get((Object)"pluginCallbackHandle");
                var9_3 = var9_3.get((Object)"userCallbackHandle");
                if (var1_1 instanceof Long) {
                    var5_6 = (Long)var1_1;
                } else {
                    if (var1_1 instanceof Integer == false) throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    var5_6 = ((Integer)var1_1).intValue();
                }
                if (var9_3 instanceof Long) {
                    var7_7 = (Long)var9_3;
                } else {
                    if (var9_3 instanceof Integer == false) throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    var7_7 = ((Integer)var9_3).intValue();
                }
                var1_1 = this.c;
                var1_1 = var1_1 != null ? v5.j.a(var1_1.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.n(var5_6);
                FlutterFirebaseMessagingBackgroundService.o(var7_7);
                FlutterFirebaseMessagingBackgroundService.p(var5_6, (v5.j)var1_1);
                var1_1 = V2.m.e(null);
                ** break;
            }
            case 5: {
                var1_1 = this.S((Map)var1_1.b());
                ** break;
            }
            case 4: {
                var1_1 = this.T((Map)var1_1.b());
                ** break;
            }
            case 3: {
                var1_1 = this.U((Map)var1_1.b());
                ** break;
            }
            case 2: {
                var1_1 = this.s();
                ** break;
            }
            case 1: {
                var1_1 = this.R((Map)var1_1.b());
                ** break;
            }
            case 0: 
        }
        var1_1 = this.u();
lbl106: // 11 sources:
        var1_1.b(new r(this, var2_2));
    }

    @Override
    public boolean onNewIntent(Intent intent) {
        Map map;
        if (intent.getExtras() == null) {
            return false;
        }
        Object object = intent.getExtras().getString("google.message_id");
        String string2 = object;
        if (object == null) {
            string2 = intent.getExtras().getString("message_id");
        }
        if (string2 == null) {
            return false;
        }
        object = (T)FlutterFirebaseMessagingReceiver.a.get((Object)string2);
        if (object == null && (map = y.b().a(string2)) != null) {
            object = z.b(map);
            map = z.c(map);
        } else {
            map = null;
        }
        if (object == null) {
            return false;
        }
        this.h = object;
        this.i = map;
        FlutterFirebaseMessagingReceiver.a.remove((Object)string2);
        string2 = z.f((T)object);
        if (object.q() == null && (object = this.i) != null) {
            string2.put((Object)"notification", object);
        }
        this.b.c("Messaging#onMessageOpenedApp", string2);
        this.c.setIntent(intent);
        return true;
    }

    @Override
    public void onReattachedToActivityForConfigChanges(B5.c c8) {
        c8.g(this);
        this.c = c8.c();
    }

    public final Boolean r() {
        boolean bl = a.a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0;
        return bl;
    }

    public final V2.j s() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new v(k8));
        return k8.a();
    }

    public final V2.j u() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new h(this, k8));
        return k8.a();
    }

    public final V2.j v() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new w(this, k8));
        return k8.a();
    }

    public final V2.j w() {
        V2.k k8 = new V2.k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new u(this, k8));
        return k8.a();
    }

}

