package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final l0 f11388f = new l0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11389a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11390b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11391c;

    /* renamed from: d, reason: collision with root package name */
    public int f11392d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11393e;

    public l0() {
        this(0, new int[8], new Object[8], true);
    }

    public static l0 c() {
        return f11388f;
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

    public static l0 j(l0 l0Var, l0 l0Var2) {
        int i7 = l0Var.f11389a + l0Var2.f11389a;
        int[] copyOf = Arrays.copyOf(l0Var.f11390b, i7);
        System.arraycopy(l0Var2.f11390b, 0, copyOf, l0Var.f11389a, l0Var2.f11389a);
        Object[] copyOf2 = Arrays.copyOf(l0Var.f11391c, i7);
        System.arraycopy(l0Var2.f11391c, 0, copyOf2, l0Var.f11389a, l0Var2.f11389a);
        return new l0(i7, copyOf, copyOf2, true);
    }

    public static l0 k() {
        return new l0();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i7, Object obj, r0 r0Var) {
        int a7 = q0.a(i7);
        int b7 = q0.b(i7);
        if (b7 == 0) {
            r0Var.c(a7, ((Long) obj).longValue());
            return;
        }
        if (b7 == 1) {
            r0Var.u(a7, ((Long) obj).longValue());
            return;
        }
        if (b7 == 2) {
            r0Var.M(a7, (AbstractC1093h) obj);
            return;
        }
        if (b7 != 3) {
            if (b7 != 5) {
                throw new RuntimeException(A.e());
            }
            r0Var.l(a7, ((Integer) obj).intValue());
        } else if (r0Var.v() == r0.a.ASCENDING) {
            r0Var.h(a7);
            ((l0) obj).r(r0Var);
            r0Var.z(a7);
        } else {
            r0Var.z(a7);
            ((l0) obj).r(r0Var);
            r0Var.h(a7);
        }
    }

    public void a() {
        if (!this.f11393e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i7) {
        int[] iArr = this.f11390b;
        if (i7 > iArr.length) {
            int i8 = this.f11389a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f11390b = Arrays.copyOf(iArr, i7);
            this.f11391c = Arrays.copyOf(this.f11391c, i7);
        }
    }

    public int d() {
        int O6;
        int i7 = this.f11392d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f11389a; i9++) {
            int i10 = this.f11390b[i9];
            int a7 = q0.a(i10);
            int b7 = q0.b(i10);
            if (b7 == 0) {
                O6 = AbstractC1096k.O(a7, ((Long) this.f11391c[i9]).longValue());
            } else if (b7 == 1) {
                O6 = AbstractC1096k.n(a7, ((Long) this.f11391c[i9]).longValue());
            } else if (b7 == 2) {
                O6 = AbstractC1096k.f(a7, (AbstractC1093h) this.f11391c[i9]);
            } else if (b7 == 3) {
                O6 = (AbstractC1096k.L(a7) * 2) + ((l0) this.f11391c[i9]).d();
            } else {
                if (b7 != 5) {
                    throw new IllegalStateException(A.e());
                }
                O6 = AbstractC1096k.l(a7, ((Integer) this.f11391c[i9]).intValue());
            }
            i8 += O6;
        }
        this.f11392d = i8;
        return i8;
    }

    public int e() {
        int i7 = this.f11392d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f11389a; i9++) {
            i8 += AbstractC1096k.A(q0.a(this.f11390b[i9]), (AbstractC1093h) this.f11391c[i9]);
        }
        this.f11392d = i8;
        return i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        int i7 = this.f11389a;
        return i7 == l0Var.f11389a && o(this.f11390b, l0Var.f11390b, i7) && l(this.f11391c, l0Var.f11391c, this.f11389a);
    }

    public void h() {
        this.f11393e = false;
    }

    public int hashCode() {
        int i7 = this.f11389a;
        return ((((527 + i7) * 31) + f(this.f11390b, i7)) * 31) + g(this.f11391c, this.f11389a);
    }

    public l0 i(l0 l0Var) {
        if (l0Var.equals(c())) {
            return this;
        }
        a();
        int i7 = this.f11389a + l0Var.f11389a;
        b(i7);
        System.arraycopy(l0Var.f11390b, 0, this.f11390b, this.f11389a, l0Var.f11389a);
        System.arraycopy(l0Var.f11391c, 0, this.f11391c, this.f11389a, l0Var.f11389a);
        this.f11389a = i7;
        return this;
    }

    public final void m(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f11389a; i8++) {
            Q.d(sb, i7, String.valueOf(q0.a(this.f11390b[i8])), this.f11391c[i8]);
        }
    }

    public void n(int i7, Object obj) {
        a();
        b(this.f11389a + 1);
        int[] iArr = this.f11390b;
        int i8 = this.f11389a;
        iArr[i8] = i7;
        this.f11391c[i8] = obj;
        this.f11389a = i8 + 1;
    }

    public void p(r0 r0Var) {
        if (r0Var.v() == r0.a.DESCENDING) {
            for (int i7 = this.f11389a - 1; i7 >= 0; i7--) {
                r0Var.f(q0.a(this.f11390b[i7]), this.f11391c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f11389a; i8++) {
            r0Var.f(q0.a(this.f11390b[i8]), this.f11391c[i8]);
        }
    }

    public void r(r0 r0Var) {
        if (this.f11389a == 0) {
            return;
        }
        if (r0Var.v() == r0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f11389a; i7++) {
                q(this.f11390b[i7], this.f11391c[i7], r0Var);
            }
            return;
        }
        for (int i8 = this.f11389a - 1; i8 >= 0; i8--) {
            q(this.f11390b[i8], this.f11391c[i8], r0Var);
        }
    }

    public l0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f11392d = -1;
        this.f11389a = i7;
        this.f11390b = iArr;
        this.f11391c = objArr;
        this.f11393e = z7;
    }
}
