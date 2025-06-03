package O5;

import E5.k;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import v5.C2071j;
import w5.C2105a;

/* renamed from: O5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0464e implements k.c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f4036a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public E5.k f4037b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.a f4038c;

    /* renamed from: O5.e$a */
    public class a implements k.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f4039a;

        public a(CountDownLatch countDownLatch) {
            this.f4039a = countDownLatch;
        }

        @Override // E5.k.d
        public void a(Object obj) {
            this.f4039a.countDown();
        }

        @Override // E5.k.d
        public void b(String str, String str2, Object obj) {
            this.f4039a.countDown();
        }

        @Override // E5.k.d
        public void c() {
            this.f4039a.countDown();
        }
    }

    /* renamed from: O5.e$b */
    public class b extends HashMap {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Map f4041o;

        public b(Map map) {
            this.f4041o = map;
            put("userCallbackHandle", Long.valueOf(C0464e.this.f()));
            put("message", map);
        }
    }

    public static void m(long j7) {
        AbstractC0460a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", j7).apply();
    }

    public static void n(long j7) {
        AbstractC0460a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", j7).apply();
    }

    public void d(Intent intent, CountDownLatch countDownLatch) {
        if (this.f4038c == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        a aVar = countDownLatch != null ? new a(countDownLatch) : null;
        T t7 = (T) intent.getParcelableExtra("notification");
        if (t7 != null) {
            this.f4037b.d("MessagingBackground#onMessage", new b(z.f(t7)), aVar);
        } else {
            Log.e("FLTFireBGExecutor", "RemoteMessage instance not found in Intent.");
        }
    }

    public final long e() {
        return AbstractC0460a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
    }

    public final long f() {
        return AbstractC0460a.a().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L);
    }

    public final void g(E5.c cVar) {
        E5.k kVar = new E5.k(cVar, "plugins.flutter.io/firebase_messaging_background");
        this.f4037b = kVar;
        kVar.e(this);
    }

    public boolean h() {
        return e() != 0;
    }

    public boolean i() {
        return !this.f4036a.get();
    }

    public final /* synthetic */ void j(y5.f fVar, C2071j c2071j, long j7) {
        String j8 = fVar.j();
        AssetManager assets = AbstractC0460a.a().getAssets();
        if (i()) {
            if (c2071j != null) {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance, with args: " + Arrays.toString(c2071j.b()));
                this.f4038c = new io.flutter.embedding.engine.a(AbstractC0460a.a(), c2071j.b());
            } else {
                Log.i("FLTFireBGExecutor", "Creating background FlutterEngine instance.");
                this.f4038c = new io.flutter.embedding.engine.a(AbstractC0460a.a());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j7);
            C2105a k7 = this.f4038c.k();
            g(k7);
            k7.i(new C2105a.b(assets, j8, lookupCallbackInformation));
        }
    }

    public final /* synthetic */ void k(final y5.f fVar, Handler handler, final C2071j c2071j, final long j7) {
        fVar.p(AbstractC0460a.a());
        fVar.i(AbstractC0460a.a(), null, handler, new Runnable() { // from class: O5.d
            @Override // java.lang.Runnable
            public final void run() {
                C0464e.this.j(fVar, c2071j, j7);
            }
        });
    }

    public final void l() {
        this.f4036a.set(true);
        FlutterFirebaseMessagingBackgroundService.m();
    }

    public void o() {
        if (i()) {
            long e7 = e();
            if (e7 != 0) {
                p(e7, null);
            }
        }
    }

    @Override // E5.k.c
    public void onMethodCall(E5.j jVar, k.d dVar) {
        if (!jVar.f1670a.equals("MessagingBackground#initialized")) {
            dVar.c();
        } else {
            l();
            dVar.a(Boolean.TRUE);
        }
    }

    public void p(final long j7, final C2071j c2071j) {
        if (this.f4038c != null) {
            Log.e("FLTFireBGExecutor", "Background isolate already started.");
            return;
        }
        final y5.f fVar = new y5.f();
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() { // from class: O5.c
            @Override // java.lang.Runnable
            public final void run() {
                C0464e.this.k(fVar, handler, c2071j, j7);
            }
        });
    }
}
