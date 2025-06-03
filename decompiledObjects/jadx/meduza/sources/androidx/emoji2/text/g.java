package androidx.emoji2.text;

import a0.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.d;
import b.m;
import b0.n;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g extends d.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1004d = new a();

    public static class a {
    }

    public static class b implements d.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f1005a;

        /* renamed from: b, reason: collision with root package name */
        public final b0.g f1006b;

        /* renamed from: c, reason: collision with root package name */
        public final a f1007c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f1008d;

        /* renamed from: e, reason: collision with root package name */
        public Handler f1009e;
        public Executor f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f1010g;

        /* renamed from: h, reason: collision with root package name */
        public d.h f1011h;

        public b(Context context, b0.g gVar) {
            a aVar = g.f1004d;
            this.f1008d = new Object();
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            }
            this.f1005a = context.getApplicationContext();
            this.f1006b = gVar;
            this.f1007c = aVar;
        }

        @Override // androidx.emoji2.text.d.g
        public final void a(d.h hVar) {
            synchronized (this.f1008d) {
                this.f1011h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1008d) {
                this.f1011h = null;
                Handler handler = this.f1009e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1009e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1010g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.f1010g = null;
            }
        }

        public final void c() {
            synchronized (this.f1008d) {
                if (this.f1011h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new t0.a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1010g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new m(this, 3));
            }
        }

        public final n d() {
            try {
                a aVar = this.f1007c;
                Context context = this.f1005a;
                b0.g gVar = this.f1006b;
                aVar.getClass();
                b0.m a10 = b0.e.a(context, gVar);
                if (a10.f1694a != 0) {
                    throw new RuntimeException(j.m(defpackage.f.l("fetchFonts failed ("), a10.f1694a, ")"));
                }
                n[] nVarArr = a10.f1695b;
                if (nVarArr == null || nVarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return nVarArr[0];
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public g(Context context, b0.g gVar) {
        super(new b(context, gVar));
    }
}
