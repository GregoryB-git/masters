package q4;

import defpackage.g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p4.d;
import v5.t;

/* loaded from: classes.dex */
public final class b extends e9.a {
    @Override // e9.a
    public final p4.a i(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        t tVar = new t(byteBuffer.array(), byteBuffer.limit());
        tVar.m(12);
        int d10 = (tVar.d() + tVar.g(12)) - 4;
        tVar.m(44);
        tVar.n(tVar.g(12));
        tVar.m(16);
        ArrayList arrayList = new ArrayList();
        while (tVar.d() < d10) {
            tVar.m(48);
            int g10 = tVar.g(8);
            tVar.m(4);
            int d11 = tVar.d() + tVar.g(12);
            String str = null;
            String str2 = null;
            while (tVar.d() < d11) {
                int g11 = tVar.g(8);
                int g12 = tVar.g(8);
                int d12 = tVar.d() + g12;
                if (g11 == 2) {
                    int g13 = tVar.g(16);
                    tVar.m(8);
                    if (g13 == 3) {
                        while (tVar.d() < d12) {
                            int g14 = tVar.g(8);
                            Charset charset = n7.d.f11282a;
                            byte[] bArr = new byte[g14];
                            tVar.i(bArr, g14);
                            str = new String(bArr, charset);
                            int g15 = tVar.g(8);
                            for (int i10 = 0; i10 < g15; i10++) {
                                tVar.n(tVar.g(8));
                            }
                        }
                    }
                } else if (g11 == 21) {
                    Charset charset2 = n7.d.f11282a;
                    byte[] bArr2 = new byte[g12];
                    tVar.i(bArr2, g12);
                    str2 = new String(bArr2, charset2);
                }
                tVar.k(d12 * 8);
            }
            tVar.k(d11 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(g10, g.d(str, str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p4.a(arrayList);
    }
}
