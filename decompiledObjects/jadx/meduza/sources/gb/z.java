package gb;

/* loaded from: classes.dex */
public abstract class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final eb.p f6993a;

    public z(eb.p pVar) {
        this.f6993a = pVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        eb.p a10 = this.f6993a.a();
        try {
            a();
        } finally {
            this.f6993a.c(a10);
        }
    }
}
