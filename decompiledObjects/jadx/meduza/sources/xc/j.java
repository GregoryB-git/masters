package xc;

/* loaded from: classes.dex */
public abstract class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final w f17263a;

    public j(w wVar) {
        ec.i.e(wVar, "delegate");
        this.f17263a = wVar;
    }

    @Override // xc.w
    public final z c() {
        return this.f17263a.c();
    }

    @Override // xc.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17263a.close();
    }

    @Override // xc.w, java.io.Flushable
    public void flush() {
        this.f17263a.flush();
    }

    @Override // xc.w
    public void g0(f fVar, long j10) {
        ec.i.e(fVar, "source");
        this.f17263a.g0(fVar, j10);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f17263a + ')';
    }
}
