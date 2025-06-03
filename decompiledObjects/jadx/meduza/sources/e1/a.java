package e1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import d1.b;
import e1.b;
import h6.e;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import q0.g;

/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: g, reason: collision with root package name */
    public Executor f3857g;

    /* renamed from: h, reason: collision with root package name */
    public volatile a<D>.RunnableC0067a f3858h;

    /* renamed from: i, reason: collision with root package name */
    public volatile a<D>.RunnableC0067a f3859i;

    /* renamed from: e1.a$a, reason: collision with other inner class name */
    public final class RunnableC0067a extends c<D> implements Runnable {
        public RunnableC0067a() {
        }

        @Override // e1.c
        public final void a() {
            a.this.c();
        }

        @Override // e1.c
        public final void b(D d10) {
            a aVar = a.this;
            if (aVar.f3859i == this) {
                SystemClock.uptimeMillis();
                aVar.f3859i = null;
                aVar.b();
            }
        }

        @Override // e1.c
        public final void c(D d10) {
            a aVar = a.this;
            if (aVar.f3858h != this) {
                if (aVar.f3859i == this) {
                    SystemClock.uptimeMillis();
                    aVar.f3859i = null;
                    aVar.b();
                    return;
                }
                return;
            }
            if (aVar.f3863d) {
                return;
            }
            SystemClock.uptimeMillis();
            aVar.f3858h = null;
            b.a<D> aVar2 = aVar.f3861b;
            if (aVar2 != null) {
                b.a aVar3 = (b.a) aVar2;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aVar3.setValue(d10);
                } else {
                    aVar3.postValue(d10);
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.b();
        }
    }

    public a(Context context) {
        super(context);
    }

    public final void b() {
        if (this.f3859i != null || this.f3858h == null) {
            return;
        }
        this.f3858h.getClass();
        if (this.f3857g == null) {
            this.f3857g = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        a<D>.RunnableC0067a runnableC0067a = this.f3858h;
        Executor executor = this.f3857g;
        if (runnableC0067a.f3867b == 1) {
            runnableC0067a.f3867b = 2;
            executor.execute(runnableC0067a.f3866a);
            return;
        }
        int c10 = g.c(runnableC0067a.f3867b);
        if (c10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (c10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        e eVar = (e) this;
        Iterator it = eVar.f7158k.iterator();
        if (it.hasNext()) {
            ((k6.e) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            eVar.f7157j.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }
}
