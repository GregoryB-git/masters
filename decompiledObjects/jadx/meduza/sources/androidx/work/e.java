package androidx.work;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Worker f1463a;

    public e(Worker worker) {
        this.f1463a = worker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1463a.f1432e.i(this.f1463a.j());
        } catch (Throwable th) {
            this.f1463a.f1432e.j(th);
        }
    }
}
