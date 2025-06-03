package y2;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final p2.r f17399a;

    /* renamed from: b, reason: collision with root package name */
    public final p2.x f17400b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkerParameters.a f17401c;

    public s(p2.r rVar, p2.x xVar, WorkerParameters.a aVar) {
        ec.i.e(rVar, "processor");
        this.f17399a = rVar;
        this.f17400b = xVar;
        this.f17401c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17399a.f(this.f17400b, this.f17401c);
    }
}
