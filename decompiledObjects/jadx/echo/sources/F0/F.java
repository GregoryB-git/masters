package F0;

import d0.C1162A;
import g0.AbstractC1300d;
import h0.AbstractC1329d;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final List f1757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1759c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1761e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1762f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1763g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1764h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1765i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1766j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1767k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1768l;

    public F(List list, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f7, int i15, String str) {
        this.f1757a = list;
        this.f1758b = i7;
        this.f1759c = i8;
        this.f1760d = i9;
        this.f1761e = i10;
        this.f1762f = i11;
        this.f1763g = i12;
        this.f1764h = i13;
        this.f1765i = i14;
        this.f1766j = f7;
        this.f1767k = i15;
        this.f1768l = str;
    }

    public static F a(g0.z zVar) {
        int i7;
        int i8;
        try {
            zVar.U(21);
            int G6 = zVar.G() & 3;
            int G7 = zVar.G();
            int f7 = zVar.f();
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < G7; i11++) {
                zVar.U(1);
                int M6 = zVar.M();
                for (int i12 = 0; i12 < M6; i12++) {
                    int M7 = zVar.M();
                    i10 += M7 + 4;
                    zVar.U(M7);
                }
            }
            zVar.T(f7);
            byte[] bArr = new byte[i10];
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            float f8 = 1.0f;
            String str = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < G7) {
                int G8 = zVar.G() & 63;
                int M8 = zVar.M();
                int i23 = i9;
                while (i23 < M8) {
                    int M9 = zVar.M();
                    byte[] bArr2 = AbstractC1329d.f14524a;
                    int i24 = G7;
                    System.arraycopy(bArr2, i9, bArr, i22, bArr2.length);
                    int length = i22 + bArr2.length;
                    System.arraycopy(zVar.e(), zVar.f(), bArr, length, M9);
                    if (G8 == 33 && i23 == 0) {
                        AbstractC1329d.a h7 = AbstractC1329d.h(bArr, length, length + M9);
                        int i25 = h7.f14538k;
                        i14 = h7.f14539l;
                        i15 = h7.f14533f + 8;
                        i16 = h7.f14534g + 8;
                        int i26 = h7.f14542o;
                        int i27 = h7.f14543p;
                        int i28 = h7.f14544q;
                        float f9 = h7.f14540m;
                        int i29 = h7.f14541n;
                        i7 = G8;
                        i8 = M8;
                        i13 = i25;
                        str = AbstractC1300d.c(h7.f14528a, h7.f14529b, h7.f14530c, h7.f14531d, h7.f14535h, h7.f14536i);
                        i18 = i27;
                        i17 = i26;
                        i20 = i29;
                        f8 = f9;
                        i19 = i28;
                    } else {
                        i7 = G8;
                        i8 = M8;
                    }
                    i22 = length + M9;
                    zVar.U(M9);
                    i23++;
                    G7 = i24;
                    G8 = i7;
                    M8 = i8;
                    i9 = 0;
                }
                i21++;
                i9 = 0;
            }
            return new F(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), G6 + 1, i13, i14, i15, i16, i17, i18, i19, f8, i20, str);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw C1162A.a("Error parsing HEVC config", e7);
        }
    }
}
