package hb;

import c4.x;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements jb.c {

    /* renamed from: a, reason: collision with root package name */
    public final jb.c f7225a;

    public c(jb.c cVar) {
        x6.b.y(cVar, "delegate");
        this.f7225a = cVar;
    }

    @Override // jb.c
    public final void A(boolean z10, int i10, List list) {
        this.f7225a.A(z10, i10, list);
    }

    @Override // jb.c
    public final void a0(x xVar) {
        this.f7225a.a0(xVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7225a.close();
    }

    @Override // jb.c
    public final void d(int i10, long j10) {
        this.f7225a.d(i10, j10);
    }

    @Override // jb.c
    public final void flush() {
        this.f7225a.flush();
    }

    @Override // jb.c
    public final void o0(jb.a aVar, byte[] bArr) {
        this.f7225a.o0(aVar, bArr);
    }

    @Override // jb.c
    public final int t0() {
        return this.f7225a.t0();
    }

    @Override // jb.c
    public final void u(boolean z10, int i10, xc.f fVar, int i11) {
        this.f7225a.u(z10, i10, fVar, i11);
    }

    @Override // jb.c
    public final void w() {
        this.f7225a.w();
    }
}
