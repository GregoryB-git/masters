package w5;

import b.a0;
import java.util.Collections;
import java.util.List;
import v3.a1;
import v5.q;
import v5.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f16345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16346b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16348d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16349e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16350g;

    public e(List list, int i10, float f, String str, int i11, int i12, int i13) {
        this.f16345a = list;
        this.f16346b = i10;
        this.f16347c = f;
        this.f16350g = str;
        this.f16348d = i11;
        this.f16349e = i12;
        this.f = i13;
    }

    public static e a(u uVar) {
        int i10;
        int i11;
        try {
            uVar.H(21);
            int v10 = uVar.v() & 3;
            int v11 = uVar.v();
            int i12 = uVar.f15975b;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < v11; i15++) {
                uVar.H(1);
                int A = uVar.A();
                for (int i16 = 0; i16 < A; i16++) {
                    int A2 = uVar.A();
                    i14 += A2 + 4;
                    uVar.H(A2);
                }
            }
            uVar.G(i12);
            byte[] bArr = new byte[i14];
            float f = 1.0f;
            String str = null;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = 0;
            int i21 = 0;
            while (i20 < v11) {
                int v12 = uVar.v() & 63;
                int A3 = uVar.A();
                int i22 = i13;
                while (i22 < A3) {
                    int A4 = uVar.A();
                    int i23 = v11;
                    System.arraycopy(q.f15932a, i13, bArr, i21, 4);
                    int i24 = i21 + 4;
                    System.arraycopy(uVar.f15974a, uVar.f15975b, bArr, i24, A4);
                    if (v12 == 33 && i22 == 0) {
                        q.a c10 = q.c(bArr, i24, i24 + A4);
                        i17 = c10.f15944j;
                        int i25 = c10.f15945k;
                        i18 = i25;
                        i10 = v12;
                        i11 = A3;
                        i19 = c10.f15946l;
                        f = c10.f15943i;
                        str = a0.m(c10.f15936a, c10.f15937b, c10.f15938c, c10.f15939d, c10.f15940e, c10.f);
                    } else {
                        i10 = v12;
                        i11 = A3;
                    }
                    i21 = i24 + A4;
                    uVar.H(A4);
                    i22++;
                    v11 = i23;
                    v12 = i10;
                    A3 = i11;
                    i13 = 0;
                }
                i20++;
                i13 = 0;
            }
            return new e(i14 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), v10 + 1, f, str, i17, i18, i19);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw a1.a("Error parsing HEVC config", e10);
        }
    }
}
