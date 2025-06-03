package A0;

import android.util.Pair;
import d0.AbstractC1170I;
import d0.C1171J;
import g0.M;
import java.util.Arrays;
import k0.Z0;
import k0.a1;
import k0.b1;
import x0.InterfaceC2142x;
import x0.Z;

/* loaded from: classes.dex */
public abstract class A extends D {

    /* renamed from: c, reason: collision with root package name */
    public a f31c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f32a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f33b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f34c;

        /* renamed from: d, reason: collision with root package name */
        public final Z[] f35d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f36e;

        /* renamed from: f, reason: collision with root package name */
        public final int[][][] f37f;

        /* renamed from: g, reason: collision with root package name */
        public final Z f38g;

        public a(String[] strArr, int[] iArr, Z[] zArr, int[] iArr2, int[][][] iArr3, Z z7) {
            this.f33b = strArr;
            this.f34c = iArr;
            this.f35d = zArr;
            this.f37f = iArr3;
            this.f36e = iArr2;
            this.f38g = z7;
            this.f32a = iArr.length;
        }

        public int a(int i7, int i8, boolean z7) {
            int i9 = this.f35d[i7].b(i8).f12438a;
            int[] iArr = new int[i9];
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                int g7 = g(i7, i8, i11);
                if (g7 == 4 || (z7 && g7 == 3)) {
                    iArr[i10] = i11;
                    i10++;
                }
            }
            return b(i7, i8, Arrays.copyOf(iArr, i10));
        }

        public int b(int i7, int i8, int[] iArr) {
            int i9 = 0;
            int i10 = 16;
            String str = null;
            boolean z7 = false;
            int i11 = 0;
            while (i9 < iArr.length) {
                String str2 = this.f35d[i7].b(i8).a(iArr[i9]).f12726n;
                int i12 = i11 + 1;
                if (i11 == 0) {
                    str = str2;
                } else {
                    z7 |= !M.c(str, str2);
                }
                i10 = Math.min(i10, Z0.e(this.f37f[i7][i8][i9]));
                i9++;
                i11 = i12;
            }
            return z7 ? Math.min(i10, this.f36e[i7]) : i10;
        }

        public int c(int i7, int i8, int i9) {
            return this.f37f[i7][i8][i9];
        }

        public int d() {
            return this.f32a;
        }

        public int e(int i7) {
            return this.f34c[i7];
        }

        public Z f(int i7) {
            return this.f35d[i7];
        }

        public int g(int i7, int i8, int i9) {
            return Z0.h(c(i7, i8, i9));
        }

        public Z h() {
            return this.f38g;
        }
    }

    public static int n(a1[] a1VarArr, C1171J c1171j, int[] iArr, boolean z7) {
        int length = a1VarArr.length;
        int i7 = 0;
        boolean z8 = true;
        for (int i8 = 0; i8 < a1VarArr.length; i8++) {
            a1 a1Var = a1VarArr[i8];
            int i9 = 0;
            for (int i10 = 0; i10 < c1171j.f12438a; i10++) {
                i9 = Math.max(i9, Z0.h(a1Var.a(c1171j.a(i10))));
            }
            boolean z9 = iArr[i8] == 0;
            if (i9 > i7 || (i9 == i7 && z7 && !z8 && z9)) {
                length = i8;
                z8 = z9;
                i7 = i9;
            }
        }
        return length;
    }

    public static int[] o(a1 a1Var, C1171J c1171j) {
        int[] iArr = new int[c1171j.f12438a];
        for (int i7 = 0; i7 < c1171j.f12438a; i7++) {
            iArr[i7] = a1Var.a(c1171j.a(i7));
        }
        return iArr;
    }

    public static int[] p(a1[] a1VarArr) {
        int length = a1VarArr.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = a1VarArr[i7].s();
        }
        return iArr;
    }

    @Override // A0.D
    public final void i(Object obj) {
        this.f31c = (a) obj;
    }

    @Override // A0.D
    public final E k(a1[] a1VarArr, Z z7, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I) {
        int[] iArr = new int[a1VarArr.length + 1];
        int length = a1VarArr.length + 1;
        C1171J[][] c1171jArr = new C1171J[length][];
        int[][][] iArr2 = new int[a1VarArr.length + 1][][];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = z7.f20702a;
            c1171jArr[i7] = new C1171J[i8];
            iArr2[i7] = new int[i8][];
        }
        int[] p7 = p(a1VarArr);
        for (int i9 = 0; i9 < z7.f20702a; i9++) {
            C1171J b7 = z7.b(i9);
            int n7 = n(a1VarArr, b7, iArr, b7.f12440c == 5);
            int[] o7 = n7 == a1VarArr.length ? new int[b7.f12438a] : o(a1VarArr[n7], b7);
            int i10 = iArr[n7];
            c1171jArr[n7][i10] = b7;
            iArr2[n7][i10] = o7;
            iArr[n7] = i10 + 1;
        }
        Z[] zArr = new Z[a1VarArr.length];
        String[] strArr = new String[a1VarArr.length];
        int[] iArr3 = new int[a1VarArr.length];
        for (int i11 = 0; i11 < a1VarArr.length; i11++) {
            int i12 = iArr[i11];
            zArr[i11] = new Z((C1171J[]) M.O0(c1171jArr[i11], i12));
            iArr2[i11] = (int[][]) M.O0(iArr2[i11], i12);
            strArr[i11] = a1VarArr[i11].d();
            iArr3[i11] = a1VarArr[i11].l();
        }
        a aVar = new a(strArr, iArr3, zArr, p7, iArr2, new Z((C1171J[]) M.O0(c1171jArr[a1VarArr.length], iArr[a1VarArr.length])));
        Pair q7 = q(aVar, iArr2, p7, bVar, abstractC1170I);
        return new E((b1[]) q7.first, (y[]) q7.second, C.a(aVar, (B[]) q7.second), aVar);
    }

    public abstract Pair q(a aVar, int[][][] iArr, int[] iArr2, InterfaceC2142x.b bVar, AbstractC1170I abstractC1170I);
}
