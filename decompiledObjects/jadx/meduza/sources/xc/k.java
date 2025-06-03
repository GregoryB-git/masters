package xc;

/* loaded from: classes.dex */
public abstract class k implements y {

    /* renamed from: a, reason: collision with root package name */
    public final y f17264a;

    public k(y yVar) {
        ec.i.e(yVar, "delegate");
        this.f17264a = yVar;
    }

    @Override // xc.y
    public final z c() {
        return this.f17264a.c();
    }

    @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17264a.close();
    }

    @Override // xc.y
    public long e0(f fVar, long j10) {
        ec.i.e(fVar, "sink");
        return this.f17264a.e0(fVar, j10);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f17264a + ')';
    }
}
