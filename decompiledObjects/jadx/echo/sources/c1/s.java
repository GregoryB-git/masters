package c1;

import X2.AbstractC0703v;
import c1.t;
import g0.InterfaceC1303g;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s {
    public static k a(t tVar, byte[] bArr, int i7, int i8) {
        t.b bVar;
        final AbstractC0703v.a M6 = AbstractC0703v.M();
        bVar = t.b.f10047c;
        Objects.requireNonNull(M6);
        tVar.c(bArr, i7, i8, bVar, new InterfaceC1303g() { // from class: c1.r
            @Override // g0.InterfaceC1303g
            public final void accept(Object obj) {
                AbstractC0703v.a.this.a((C0816e) obj);
            }
        });
        return new g(M6.k());
    }

    public static void b(t tVar) {
    }
}
