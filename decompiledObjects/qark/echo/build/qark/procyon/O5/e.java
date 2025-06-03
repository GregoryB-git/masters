// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import android.os.Looper;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import android.content.res.AssetManager;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import E5.c;
import java.util.Map;
import java.util.HashMap;
import com.google.firebase.messaging.T;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import android.content.Intent;
import android.os.Handler;
import v5.j;
import y5.f;
import io.flutter.embedding.engine.a;
import java.util.concurrent.atomic.AtomicBoolean;
import E5.k;

public class e implements c
{
    public final AtomicBoolean a;
    public k b;
    public io.flutter.embedding.engine.a c;
    
    public e() {
        this.a = new AtomicBoolean(false);
    }
    
    public static void m(final long n) {
        O5.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", n).apply();
    }
    
    public static void n(final long n) {
        O5.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", n).apply();
    }
    
    public void d(final Intent intent, final CountDownLatch countDownLatch) {
        if (this.c == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        Object o;
        if (countDownLatch != null) {
            o = new d() {
                @Override
                public void a(final Object o) {
                    countDownLatch.countDown();
                }
                
                @Override
                public void b(final String s, final String s2, final Object o) {
                    countDownLatch.countDown();
                }
                
                @Override
                public void c() {
                    countDownLatch.countDown();
                }
            };
        }
        else {
            o = null;
        }
        final T t = (T)intent.getParcelableExtra("notification");
        if (t != null) {
            this.b.d("MessagingBackground#onMessage", new HashMap() {
                public final /* synthetic */ Map o = z.f(t);
                
                {
                    this.put("userCallbackHandle", e.this.f());
                    this.put("message", map);
                }
            }, (k.d)o);
            return;
        }
        Log.e("FLTFireBGExecutor", "RemoteMessage instance not found in Intent.");
    }
    
    public final long e() {
        return O5.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
    }
    
    public final long f() {
        return O5.a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
    }
    
    public final void g(final E5.c c) {
        (this.b = new k(c, "plugins.flutter.io/firebase_messaging_background")).e((k.c)this);
    }
    
    public boolean h() {
        return this.e() != 0L;
    }
    
    public boolean i() {
        return this.a.get() ^ true;
    }
    
    public final void l() {
        this.a.set(true);
        FlutterFirebaseMessagingBackgroundService.m();
    }
    
    public void o() {
        if (this.i()) {
            final long e = this.e();
            if (e != 0L) {
                this.p(e, null);
            }
        }
    }
    
    @Override
    public void onMethodCall(final E5.j j, final d d) {
        if (j.a.equals("MessagingBackground#initialized")) {
            this.l();
            d.a(Boolean.TRUE);
            return;
        }
        d.c();
    }
    
    public void p(final long n, final j j) {
        if (this.c != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        final f f = new f();
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post((Runnable)new O5.c(this, f, handler, j, n));
    }
}
