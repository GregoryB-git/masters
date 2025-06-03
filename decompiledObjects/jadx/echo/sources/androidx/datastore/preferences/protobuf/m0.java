package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    public static final m0 f9025f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f9026a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f9027b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9028c;

    /* renamed from: d, reason: collision with root package name */
    public int f9029d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9030e;

    public m0() {
        this(0, new int[8], new Object[8], true);
    }

    public static boolean c(int[] iArr, int[] iArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Object[] objArr, Object[] objArr2, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (!objArr[i8].equals(objArr2[i8])) {
                return false;
            }
        }
        return true;
    }

    public static m0 e() {
        return f9025f;
    }

    public static int h(int[] iArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        return i8;
    }

    public static int i(Object[] objArr, int i7) {
        int i8 = 17;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 = (i8 * 31) + objArr[i9].hashCode();
        }
        return i8;
    }

    public static m0 k(m0 m0Var, m0 m0Var2) {
        int i7 = m0Var.f9026a + m0Var2.f9026a;
        int[] copyOf = Arrays.copyOf(m0Var.f9027b, i7);
        System.arraycopy(m0Var2.f9027b, 0, copyOf, m0Var.f9026a, m0Var2.f9026a);
        Object[] copyOf2 = Arrays.copyOf(m0Var.f9028c, i7);
        System.arraycopy(m0Var2.f9028c, 0, copyOf2, m0Var.f9026a, m0Var2.f9026a);
        return new m0(i7, copyOf, copyOf2, true);
    }

    public static m0 l() {
        return new m0();
    }

    public static void p(int i7, Object obj, s0 s0Var) {
        int a7 = r0.a(i7);
        int b7 = r0.b(i7);
        if (b7 == 0) {
            s0Var.c(a7, ((Long) obj).longValue());
            return;
        }
        if (b7 == 1) {
            s0Var.u(a7, ((Long) obj).longValue());
            return;
        }
        if (b7 == 2) {
            s0Var.J(a7, (AbstractC0760g) obj);
            return;
        }
        if (b7 != 3) {
            if (b7 != 5) {
                throw new RuntimeException(C0778z.d());
            }
            s0Var.l(a7, ((Integer) obj).intValue());
        } else if (s0Var.v() == s0.a.ASCENDING) {
            s0Var.h(a7);
            ((m0) obj).q(s0Var);
            s0Var.z(a7);
        } else {
            s0Var.z(a7);
            ((m0) obj).q(s0Var);
            s0Var.h(a7);
        }
    }

    public void a() {
        if (!this.f9030e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        int i7 = this.f9026a;
        int[] iArr = this.f9027b;
        if (i7 == iArr.length) {
            int i8 = i7 + (i7 < 4 ? 8 : i7 >> 1);
            this.f9027b = Arrays.copyOf(iArr, i8);
            this.f9028c = Arrays.copyOf(this.f9028c, i8);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i7 = this.f9026a;
        return i7 == m0Var.f9026a && c(this.f9027b, m0Var.f9027b, i7) && d(this.f9028c, m0Var.f9028c, this.f9026a);
    }

    public int f() {
        int S6;
        int i7 = this.f9029d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9026a; i9++) {
            int i10 = this.f9027b[i9];
            int a7 = r0.a(i10);
            int b7 = r0.b(i10);
            if (b7 == 0) {
                S6 = AbstractC0763j.S(a7, ((Long) this.f9028c[i9]).longValue());
            } else if (b7 == 1) {
                S6 = AbstractC0763j.n(a7, ((Long) this.f9028c[i9]).longValue());
            } else if (b7 == 2) {
                S6 = AbstractC0763j.f(a7, (AbstractC0760g) this.f9028c[i9]);
            } else if (b7 == 3) {
                S6 = (AbstractC0763j.P(a7) * 2) + ((m0) this.f9028c[i9]).f();
            } else {
                if (b7 != 5) {
                    throw new IllegalStateException(C0778z.d());
                }
                S6 = AbstractC0763j.l(a7, ((Integer) this.f9028c[i9]).intValue());
            }
            i8 += S6;
        }
        this.f9029d = i8;
        return i8;
    }

    public int g() {
        int i7 = this.f9029d;
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9026a; i9++) {
            i8 += AbstractC0763j.D(r0.a(this.f9027b[i9]), (AbstractC0760g) this.f9028c[i9]);
        }
        this.f9029d = i8;
        return i8;
    }

    public int hashCode() {
        int i7 = this.f9026a;
        return ((((527 + i7) * 31) + h(this.f9027b, i7)) * 31) + i(this.f9028c, this.f9026a);
    }

    public void j() {
        this.f9030e = false;
    }

    public final void m(StringBuilder sb, int i7) {
        for (int i8 = 0; i8 < this.f9026a; i8++) {
            Q.c(sb, i7, String.valueOf(r0.a(this.f9027b[i8])), this.f9028c[i8]);
        }
    }

    public void n(int i7, Object obj) {
        a();
        b();
        int[] iArr = this.f9027b;
        int i8 = this.f9026a;
        iArr[i8] = i7;
        this.f9028c[i8] = obj;
        this.f9026a = i8 + 1;
    }

    public void o(s0 s0Var) {
        if (s0Var.v() == s0.a.DESCENDING) {
            for (int i7 = this.f9026a - 1; i7 >= 0; i7--) {
                s0Var.f(r0.a(this.f9027b[i7]), this.f9028c[i7]);
            }
            return;
        }
        for (int i8 = 0; i8 < this.f9026a; i8++) {
            s0Var.f(r0.a(this.f9027b[i8]), this.f9028c[i8]);
        }
    }

    public void q(s0 s0Var) {
        if (this.f9026a == 0) {
            return;
        }
        if (s0Var.v() == s0.a.ASCENDING) {
            for (int i7 = 0; i7 < this.f9026a; i7++) {
                p(this.f9027b[i7], this.f9028c[i7], s0Var);
            }
            return;
        }
        for (int i8 = this.f9026a - 1; i8 >= 0; i8--) {
            p(this.f9027b[i8], this.f9028c[i8], s0Var);
        }
    }

    public m0(int i7, int[] iArr, Object[] objArr, boolean z7) {
        this.f9029d = -1;
        this.f9026a = i7;
        this.f9027b = iArr;
        this.f9028c = objArr;
        this.f9030e = z7;
    }
}
