package androidx.work;

import android.content.Context;
import androidx.work.d;

/* loaded from: classes.dex */
public abstract class Worker extends d {

    /* renamed from: e, reason: collision with root package name */
    public z2.c<d.a> f1432e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z2.c f1433a;

        public a(z2.c cVar) {
            this.f1433a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
            } catch (Throwable th) {
                this.f1433a.j(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.d
    public final s7.e<o2.d> b() {
        z2.c cVar = new z2.c();
        this.f1458b.f1437c.execute(new a(cVar));
        return cVar;
    }

    @Override // androidx.work.d
    public final z2.c h() {
        this.f1432e = new z2.c<>();
        this.f1458b.f1437c.execute(new e(this));
        return this.f1432e;
    }

    public abstract d.a j();
}
