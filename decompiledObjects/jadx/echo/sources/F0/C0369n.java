package F0;

import F0.T;
import d0.C1194q;
import d0.InterfaceC1186i;
import java.io.EOFException;

/* renamed from: F0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369n implements T {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1938a = new byte[4096];

    @Override // F0.T
    public void a(g0.z zVar, int i7, int i8) {
        zVar.U(i7);
    }

    @Override // F0.T
    public int c(InterfaceC1186i interfaceC1186i, int i7, boolean z7, int i8) {
        int read = interfaceC1186i.read(this.f1938a, 0, Math.min(this.f1938a.length, i7));
        if (read != -1) {
            return read;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // F0.T
    public /* synthetic */ void e(g0.z zVar, int i7) {
        S.b(this, zVar, i7);
    }

    @Override // F0.T
    public /* synthetic */ int f(InterfaceC1186i interfaceC1186i, int i7, boolean z7) {
        return S.a(this, interfaceC1186i, i7, z7);
    }

    @Override // F0.T
    public void d(C1194q c1194q) {
    }

    @Override // F0.T
    public void b(long j7, int i7, int i8, int i9, T.a aVar) {
    }
}
