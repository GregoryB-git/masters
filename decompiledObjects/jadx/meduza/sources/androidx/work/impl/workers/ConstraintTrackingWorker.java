package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.d;
import b.m;
import b3.a;
import ec.i;
import o2.j;
import rb.h;
import t2.b;
import x2.s;
import z2.c;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends d implements t2.d {

    /* renamed from: e, reason: collision with root package name */
    public final WorkerParameters f1548e;
    public final Object f;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f1549o;

    /* renamed from: p, reason: collision with root package name */
    public final c<d.a> f1550p;

    /* renamed from: q, reason: collision with root package name */
    public d f1551q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.e(context, "appContext");
        i.e(workerParameters, "workerParameters");
        this.f1548e = workerParameters;
        this.f = new Object();
        this.f1550p = new c<>();
    }

    @Override // t2.d
    public final void d(s sVar, b bVar) {
        i.e(sVar, "workSpec");
        i.e(bVar, "state");
        j.d().a(a.f1821a, "Constraints changed for " + sVar);
        if (bVar instanceof b.C0227b) {
            synchronized (this.f) {
                this.f1549o = true;
                h hVar = h.f13851a;
            }
        }
    }

    @Override // androidx.work.d
    public final void g() {
        d dVar = this.f1551q;
        if (dVar == null || dVar.f()) {
            return;
        }
        dVar.i(Build.VERSION.SDK_INT >= 31 ? this.f1459c : 0);
    }

    @Override // androidx.work.d
    public final c h() {
        this.f1458b.f1437c.execute(new m(this, 9));
        c<d.a> cVar = this.f1550p;
        i.d(cVar, "future");
        return cVar;
    }
}
