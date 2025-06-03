package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049v5 {

    /* renamed from: f, reason: collision with root package name */
    public static final C1049v5 f11196f = new C1049v5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11197a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11198b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11199c;

    /* renamed from: d, reason: collision with root package name */
    public int f11200d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11201e;

    public C1049v5() {
        this(0, new int[8], new Object[8], true);
    }

    public static C1049v5 c(C1049v5 c1049v5, C1049v5 c1049v52) {
        int i7 = c1049v5.f11197a + c1049v52.f11197a;
        int[] copyOf = Arrays.copyOf(c1049v5.f11198b, i7);
        System.arraycopy(c1049v52.f11198b, 0, copyOf, c1049v5.f11197a, c1049v52.f11197a);
        Object[] copyOf2 = Arrays.copyOf(c1049v5.f11199c, i7);
        System.arraycopy(c1049v52.f11199c, 0, copyOf2, c1049v5.f11197a, c1049v52.f11197a);
        return new C1049v5(i7, copyOf, copyOf2, true);
    }

    public static void f(int i7, Object obj, T5 t52) {
        int i8 = i7 >>> 3;
        int i9 = i7 & 7;
        if (i9 == 0) {
            t52.j(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 1) {
            t52.M(i8, ((Long) obj).longValue());
            return;
        }
        if (i9 == 2) {
            t52.f(i8, (AbstractC1003q3) obj);
            return;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new RuntimeException(C0950k4.a());
            }
            t52.k(i8, ((Integer) obj).intValue());
        } else if (t52.a() == W5.f10704a) {
            t52.l(i8);
            ((C1049v5) obj).j(t52);
            t52.e(i8);
        } else {
            t52.e(i8);
            ((C1049v5) obj).j(t52);
            t52.l(i8);
        }
    }

    public static C1049v5 k() {
        return f11196f;
    }

    public static C1049v5 l() {
        return new C1049v5();
    }

    public final int a() {
        int m02;
        int i7 = this.f11200d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f11197a; i9++) {
            int i10 = this.f11198b[i9];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                m02 = J3.m0(i11, ((Long) this.f11199c[i9]).longValue());
            } else if (i12 == 1) {
                m02 = J3.P(i11, ((Long) this.f11199c[i9]).longValue());
            } else if (i12 == 2) {
                m02 = J3.Q(i11, (AbstractC1003q3) this.f11199c[i9]);
            } else if (i12 == 3) {
                m02 = (J3.s0(i11) << 1) + ((C1049v5) this.f11199c[i9]).a();
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException(C0950k4.a());
                }
                m02 = J3.h0(i11, ((Integer) this.f11199c[i9]).intValue());
            }
            i8 += m02;
        }
        this.f11200d = i8;
        return i8;
    }

    public final C1049v5 b(C1049v5 c1049v5) {
        if (c1049v5.equals(f11196f)) {
            return this;
        }
        n();
        int i7 = this.f11197a + c1049v5.f11197a;
        d(i7);
        System.arraycopy(c1049v5.f11198b, 0, this.f11198b, this.f11197a, c1049v5.f11197a);
        System.arraycopy(c1049v5.f11199c, 0, this.f11199c, this.f11197a, c1049v5.f11197a);
        this.f11197a = i7;
        return this;
    }

    public final void d(int i7) {
        int[] iArr = this.f11198b;
        if (i7 > iArr.length) {
            int i8 = this.f11197a;
            int i9 = i8 + (i8 / 2);
            if (i9 >= i7) {
                i7 = i9;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f11198b = Arrays.copyOf(iArr, i7);
            this.f11199c = Arrays.copyOf(this.f11199c, i7);
        }
    }

    public final void e(int i7, Object obj) {
        n();
        d(this.f11197a + 1);
        int[] iArr = this.f11198b;
        int i8 = this.f11197a;
        iArr[i8] = i7;
        this.f11199c[i8] = obj;
        this.f11197a = i8 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1049v5)) {
            return false;
        }
        C1049v5 c1049v5 = (C1049v5) obj;
        int i7 = this.f11197a;
        if (i7 == c1049v5.f11197a) {
            int[] iArr = this.f11198b;
            int[] iArr2 = c1049v5.f11198b;
            int i8 = 0;
            while (true) {
                if (i8 >= i7) {
                    Object[] objArr = this.f11199c;
                    Object[] objArr2 = c1049v5.f11199c;
                    int i9 = this.f11197a;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (objArr[i10].equals(objArr2[i10])) {
                        }
                    }
                    return true;
                }
                if (iArr[i8] != iArr2[i8]) {
                    break;
                }
                i8++;
            }
        }
        return false;
    }

    public final void g(T5 t52) {
        if (t52.a() == W5.f10705b) {
            for (int i7 = this.f11197a - 1; i7 >= 0; i7--) {
                t52.t(this.f11198b[i7] >>> 3, this.f11199c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f11197a; i8++) {
            t52.t(this.f11198b[i8] >>> 3, this.f11199c[i8]);
        }
    }

    public final void h(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f11197a; i8++) {
            N4.d(sb, i7, String.valueOf(this.f11198b[i8] >>> 3), this.f11199c[i8]);
        }
    }

    public final int hashCode() {
        int i7 = this.f11197a;
        int i8 = (i7 + 527) * 31;
        int[] iArr = this.f11198b;
        int i9 = 17;
        int i10 = 17;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        int i12 = (i8 + i10) * 31;
        Object[] objArr = this.f11199c;
        int i13 = this.f11197a;
        for (int i14 = 0; i14 < i13; i14++) {
            i9 = (i9 * 31) + objArr[i14].hashCode();
        }
        return i12 + i9;
    }

    public final int i() {
        int i7 = this.f11200d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f11197a; i9++) {
            i8 += J3.Z(this.f11198b[i9] >>> 3, (AbstractC1003q3) this.f11199c[i9]);
        }
        this.f11200d = i8;
        return i8;
    }

    public final void j(T5 t52) {
        if (this.f11197a == 0) {
            return;
        }
        if (t52.a() == W5.f10704a) {
            for (int i7 = 0; i7 < this.f11197a; i7++) {
                f(this.f11198b[i7], this.f11199c[i7], t52);
            }
            return;
        }
        for (int i8 = this.f11197a - 1; i8 >= 0; i8--) {
            f(this.f11198b[i8], this.f11199c[i8], t52);
        }
    }

    public final void m() {
        if (this.f11201e) {
            this.f11201e = false;
        }
    }

    public final void n() {
        if (!this.f11201e) {
            throw new UnsupportedOperationException();
        }
    }

    public C1049v5(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f11200d = -1;
        this.f11197a = i7;
        this.f11198b = iArr;
        this.f11199c = objArr;
        this.f11201e = z7;
    }
}
