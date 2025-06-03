package F0;

import T0.h;
import d0.C1201x;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final g0.z f1769a = new g0.z(10);

    public C1201x a(InterfaceC0373s interfaceC0373s, h.a aVar) {
        C1201x c1201x = null;
        int i7 = 0;
        while (true) {
            try {
                interfaceC0373s.n(this.f1769a.e(), 0, 10);
                this.f1769a.T(0);
                if (this.f1769a.J() != 4801587) {
                    break;
                }
                this.f1769a.U(3);
                int F6 = this.f1769a.F();
                int i8 = F6 + 10;
                if (c1201x == null) {
                    byte[] bArr = new byte[i8];
                    System.arraycopy(this.f1769a.e(), 0, bArr, 0, 10);
                    interfaceC0373s.n(bArr, 10, F6);
                    c1201x = new T0.h(aVar).e(bArr, i8);
                } else {
                    interfaceC0373s.o(F6);
                }
                i7 += i8;
            } catch (EOFException unused) {
            }
        }
        interfaceC0373s.h();
        interfaceC0373s.o(i7);
        return c1201x;
    }
}
