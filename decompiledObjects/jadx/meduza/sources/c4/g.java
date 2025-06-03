package c4;

import c4.v;
import java.io.EOFException;
import v3.i0;

/* loaded from: classes.dex */
public final class g implements v {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2287a = new byte[4096];

    @Override // c4.v
    public final void a(int i10, v5.u uVar) {
        uVar.H(i10);
    }

    @Override // c4.v
    public final void b(int i10, v5.u uVar) {
        uVar.H(i10);
    }

    @Override // c4.v
    public final void c(long j10, int i10, int i11, int i12, v.a aVar) {
    }

    @Override // c4.v
    public final void d(i0 i0Var) {
    }

    @Override // c4.v
    public final int e(t5.h hVar, int i10, boolean z10) {
        return f(hVar, i10, z10);
    }

    public final int f(t5.h hVar, int i10, boolean z10) {
        int read = hVar.read(this.f2287a, 0, Math.min(this.f2287a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
