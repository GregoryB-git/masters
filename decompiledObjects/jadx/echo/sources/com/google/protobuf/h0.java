package com.google.protobuf;

import com.google.protobuf.n0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final h0 f12077f = new h0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f12078a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f12079b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f12080c;

    /* renamed from: d, reason: collision with root package name */
    public int f12081d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12082e;

    public h0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f12078a = i7;
        this.f12079b = iArr;
        this.f12080c = objArr;
        this.f12082e = z7;
    }

    public static h0 c() {
        return f12077f;
    }

    public static int f(int[] iArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        return i8;
    }

    public static int g(Object[] objArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + objArr[i9].hashCode();
        }
        return i8;
    }

    public static h0 j(h0 h0Var, h0 h0Var2) {
        int i7 = h0Var.f12078a + h0Var2.f12078a;
        int[] copyOf = Arrays.copyOf(h0Var.f12079b, i7);
        System.arraycopy(h0Var2.f12079b, 0, copyOf, h0Var.f12078a, h0Var2.f12078a);
        Object[] copyOf2 = Arrays.copyOf(h0Var.f12080c, i7);
        System.arraycopy(h0Var2.f12080c, 0, copyOf2, h0Var.f12078a, h0Var2.f12078a);
        return new h0(i7, copyOf, copyOf2, true);
    }

    public static boolean k(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    public static boolean m(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static void o(int i7, Object obj, n0 n0Var) {
        int a7 = m0.a(i7);
        int b7 = m0.b(i7);
        if (b7 == 0) {
            n0Var.c(a7, ((Long) obj).longValue());
            return;
        }
        if (b7 == 1) {
            n0Var.u(a7, ((Long) obj).longValue());
            return;
        }
        if (b7 == 2) {
            n0Var.M(a7, (AbstractC1141f) obj);
            return;
        }
        if (b7 != 3) {
            if (b7 != 5) {
                throw new RuntimeException(C1156v.a());
            }
            n0Var.l(a7, ((Integer) obj).intValue());
        } else if (n0Var.v() == n0.a.ASCENDING) {
            n0Var.h(a7);
            ((h0) obj).p(n0Var);
            n0Var.z(a7);
        } else {
            n0Var.z(a7);
            ((h0) obj).p(n0Var);
            n0Var.h(a7);
        }
    }

    public void a() {
        if (!this.f12082e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i7) {
        int[] iArr = this.f12079b;
        if (i7 > iArr.length) {
            int i8 = this.f12078a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f12079b = Arrays.copyOf(iArr, i7);
            this.f12080c = Arrays.copyOf(this.f12080c, i7);
        }
    }

    public int d() {
        int R6;
        int i7 = this.f12081d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f12078a; i9++) {
            int i10 = this.f12079b[i9];
            int a7 = m0.a(i10);
            int b7 = m0.b(i10);
            if (b7 == 0) {
                R6 = AbstractC1143h.R(a7, ((Long) this.f12080c[i9]).longValue());
            } else if (b7 == 1) {
                R6 = AbstractC1143h.o(a7, ((Long) this.f12080c[i9]).longValue());
            } else if (b7 == 2) {
                R6 = AbstractC1143h.g(a7, (AbstractC1141f) this.f12080c[i9]);
            } else if (b7 == 3) {
                R6 = (AbstractC1143h.O(a7) * 2) + ((h0) this.f12080c[i9]).d();
            } else {
                if (b7 != 5) {
                    throw new IllegalStateException(C1156v.a());
                }
                R6 = AbstractC1143h.m(a7, ((Integer) this.f12080c[i9]).intValue());
            }
            i8 += R6;
        }
        this.f12081d = i8;
        return i8;
    }

    public int e() {
        int i7 = this.f12081d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f12078a; i9++) {
            i8 += AbstractC1143h.D(m0.a(this.f12079b[i9]), (AbstractC1141f) this.f12080c[i9]);
        }
        this.f12081d = i8;
        return i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        int i7 = this.f12078a;
        return i7 == h0Var.f12078a && m(this.f12079b, h0Var.f12079b, i7) && k(this.f12080c, h0Var.f12080c, this.f12078a);
    }

    public void h() {
        this.f12082e = false;
    }

    public int hashCode() {
        int i7 = this.f12078a;
        return ((((527 + i7) * 31) + f(this.f12079b, i7)) * 31) + g(this.f12080c, this.f12078a);
    }

    public h0 i(h0 h0Var) {
        if (h0Var.equals(c())) {
            return this;
        }
        a();
        int i7 = this.f12078a + h0Var.f12078a;
        b(i7);
        System.arraycopy(h0Var.f12079b, 0, this.f12079b, this.f12078a, h0Var.f12078a);
        System.arraycopy(h0Var.f12080c, 0, this.f12080c, this.f12078a, h0Var.f12078a);
        this.f12078a = i7;
        return this;
    }

    public final void l(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f12078a; i8++) {
            M.d(sb, i7, String.valueOf(m0.a(this.f12079b[i8])), this.f12080c[i8]);
        }
    }

    public void n(n0 n0Var) {
        if (n0Var.v() == n0.a.DESCENDING) {
            for (int i7 = this.f12078a - 1; i7 >= 0; i7--) {
                n0Var.f(m0.a(this.f12079b[i7]), this.f12080c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f12078a; i8++) {
            n0Var.f(m0.a(this.f12079b[i8]), this.f12080c[i8]);
        }
    }

    public void p(n0 n0Var) {
        if (this.f12078a == 0) {
            return;
        }
        if (n0Var.v() == n0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f12078a; i7++) {
                o(this.f12079b[i7], this.f12080c[i7], n0Var);
            }
            return;
        }
        for (int i8 = this.f12078a - 1; i8 >= 0; i8--) {
            o(this.f12079b[i8], this.f12080c[i8], n0Var);
        }
    }
}
