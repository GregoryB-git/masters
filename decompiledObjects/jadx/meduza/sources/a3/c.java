package a3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import nc.c1;
import y2.r;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final r f98a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f99b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f100c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final a f101d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.this.f100c.post(runnable);
        }
    }

    public c(ExecutorService executorService) {
        r rVar = new r(executorService);
        this.f98a = rVar;
        this.f99b = x6.b.W(rVar);
    }

    @Override // a3.b
    public final c1 a() {
        return this.f99b;
    }

    @Override // a3.b
    public final a b() {
        return this.f101d;
    }

    @Override // a3.b
    public final r c() {
        return this.f98a;
    }

    @Override // a3.b
    public final void d(Runnable runnable) {
        this.f98a.execute(runnable);
    }
}
