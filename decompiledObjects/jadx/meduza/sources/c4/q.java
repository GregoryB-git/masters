package c4;

import java.io.EOFException;
import u4.g;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final v5.u f2308a = new v5.u(10);

    public final p4.a a(i iVar, g.a aVar) {
        p4.a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                iVar.m(this.f2308a.f15974a, 0, 10);
                this.f2308a.G(0);
                if (this.f2308a.x() != 4801587) {
                    break;
                }
                this.f2308a.H(3);
                int u10 = this.f2308a.u();
                int i11 = u10 + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f2308a.f15974a, 0, bArr, 0, 10);
                    iVar.m(bArr, 10, u10);
                    aVar2 = new u4.g(aVar).C(bArr, i11);
                } else {
                    iVar.e(u10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        iVar.i();
        iVar.e(i10);
        return aVar2;
    }
}
