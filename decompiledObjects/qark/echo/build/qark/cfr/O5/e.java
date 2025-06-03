/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.AssetManager
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package O5;

import E5.j;
import E5.k;
import O5.a;
import O5.c;
import O5.d;
import O5.z;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import w5.a;
import y5.f;

public class e
implements k.c {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public k b;
    public io.flutter.embedding.engine.a c;

    public static /* synthetic */ void a(e e8, f f8, v5.j j8, long l8) {
        e8.j(f8, j8, l8);
    }

    public static /* synthetic */ void b(e e8, f f8, Handler handler, v5.j j8, long l8) {
        e8.k(f8, handler, j8, l8);
    }

    public static void m(long l8) {
        a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", l8).apply();
    }

    public static void n(long l8) {
        a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", l8).apply();
    }

    public void d(Intent object, CountDownLatch object2) {
        if (this.c == null) {
            Log.i((String)"FLTFireBGExecutor", (String)"A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        object2 = object2 != null ? new k.d((CountDownLatch)object2){
            public final /* synthetic */ CountDownLatch a;
            {
                this.a = countDownLatch;
            }

            @Override
            public void a(Object object) {
                this.a.countDown();
            }

            @Override
            public void b(String string2, String string3, Object object) {
                this.a.countDown();
            }

            @Override
            public void c() {
                this.a.countDown();
            }
        } : null;
        if ((object = (T)object.getParcelableExtra("notification")) != null) {
            object = z.f((T)object);
            this.b.d("MessagingBackground#onMessage", (Object)new HashMap((Map)object){
                public final /* synthetic */ Map o;
                {
                    this.o = map;
                    this.put((Object)"userCallbackHandle", (Object)e.this.f());
                    this.put((Object)"message", (Object)map);
                }
            }, (k.d)object2);
            return;
        }
        Log.e((String)"FLTFireBGExecutor", (String)"RemoteMessage instance not found in Intent.");
    }

    public final long e() {
        return a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
    }

    public final long f() {
        return a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
    }

    public final void g(E5.c object) {
        this.b = object = new k((E5.c)object, "plugins.flutter.io/firebase_messaging_background");
        object.e(this);
    }

    public boolean h() {
        if (this.e() != 0L) {
            return true;
        }
        return false;
    }

    public boolean i() {
        return this.a.get() ^ true;
    }

    public final /* synthetic */ void j(f object, v5.j object2, long l8) {
        object = object.j();
        AssetManager assetManager = a.a().getAssets();
        if (this.i()) {
            Object object3;
            if (object2 != null) {
                object3 = new StringBuilder();
                object3.append("Creating background FlutterEngine instance, with args: ");
                object3.append(Arrays.toString((Object[])object2.b()));
                Log.i((String)"FLTFireBGExecutor", (String)object3.toString());
                this.c = new io.flutter.embedding.engine.a(a.a(), object2.b());
            } else {
                Log.i((String)"FLTFireBGExecutor", (String)"Creating background FlutterEngine instance.");
                this.c = new io.flutter.embedding.engine.a(a.a());
            }
            object2 = FlutterCallbackInformation.lookupCallbackInformation(l8);
            object3 = this.c.k();
            this.g((E5.c)object3);
            object3.i(new a.b(assetManager, (String)object, (FlutterCallbackInformation)object2));
        }
    }

    public final /* synthetic */ void k(f f8, Handler handler, v5.j j8, long l8) {
        f8.p(a.a());
        f8.i(a.a(), null, handler, new d(this, f8, j8, l8));
    }

    public final void l() {
        this.a.set(true);
        FlutterFirebaseMessagingBackgroundService.m();
    }

    public void o() {
        long l8;
        if (this.i() && (l8 = this.e()) != 0L) {
            this.p(l8, null);
        }
    }

    @Override
    public void onMethodCall(j j8, k.d d8) {
        if (j8.a.equals((Object)"MessagingBackground#initialized")) {
            this.l();
            d8.a((Object)Boolean.TRUE);
            return;
        }
        d8.c();
    }

    public void p(long l8, v5.j j8) {
        if (this.c != null) {
            Log.e((String)"FLTFireBGExecutor", (String)"Background isolate already started.");
            return;
        }
        f f8 = new f();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post((Runnable)new c(this, f8, handler, j8, l8));
    }

}

