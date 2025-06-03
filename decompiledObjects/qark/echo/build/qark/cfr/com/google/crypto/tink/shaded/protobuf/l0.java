/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Arrays;

public final class l0 {
    public static final l0 f = new l0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public l0() {
        this(0, new int[8], new Object[8], true);
    }

    public l0(int n8, int[] arrn, Object[] arrobject, boolean bl) {
        this.a = n8;
        this.b = arrn;
        this.c = arrobject;
        this.e = bl;
    }

    public static l0 c() {
        return f;
    }

    public static int f(int[] arrn, int n8) {
        int n9 = 17;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + arrn[i8];
        }
        return n9;
    }

    public static int g(Object[] arrobject, int n8) {
        int n9 = 17;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + arrobject[i8].hashCode();
        }
        return n9;
    }

    public static l0 j(l0 l02, l0 l03) {
        int n8 = l02.a + l03.a;
        int[] arrn = Arrays.copyOf((int[])l02.b, (int)n8);
        System.arraycopy((Object)l03.b, (int)0, (Object)arrn, (int)l02.a, (int)l03.a);
        Object[] arrobject = Arrays.copyOf((Object[])l02.c, (int)n8);
        System.arraycopy((Object)l03.c, (int)0, (Object)arrobject, (int)l02.a, (int)l03.a);
        return new l0(n8, arrn, arrobject, true);
    }

    public static l0 k() {
        return new l0();
    }

    public static boolean l(Object[] arrobject, Object[] arrobject2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrobject[i8].equals(arrobject2[i8])) continue;
            return false;
        }
        return true;
    }

    public static boolean o(int[] arrn, int[] arrn2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrn[i8] == arrn2[i8]) continue;
            return false;
        }
        return true;
    }

    public static void q(int n8, Object object, r0 r02) {
        int n9 = q0.a(n8);
        if ((n8 = q0.b(n8)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 5) {
                            r02.l(n9, (Integer)object);
                            return;
                        }
                        throw new RuntimeException((Throwable)A.e());
                    }
                    if (r02.v() == r0.a.o) {
                        r02.h(n9);
                        ((l0)object).r(r02);
                        r02.z(n9);
                        return;
                    }
                    r02.z(n9);
                    ((l0)object).r(r02);
                    r02.h(n9);
                    return;
                }
                r02.M(n9, (h)object);
                return;
            }
            r02.u(n9, (Long)object);
            return;
        }
        r02.c(n9, (Long)object);
    }

    public void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void b(int n8) {
        int[] arrn = this.b;
        if (n8 > arrn.length) {
            int n9 = this.a;
            if ((n9 += n9 / 2) >= n8) {
                n8 = n9;
            }
            n9 = n8;
            if (n8 < 8) {
                n9 = 8;
            }
            this.b = Arrays.copyOf((int[])arrn, (int)n9);
            this.c = Arrays.copyOf((Object[])this.c, (int)n9);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int d() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        int n9 = 0;
        int n10 = 0;
        do {
            if (n9 >= this.a) {
                this.d = n10;
                return n10;
            }
            int n11 = this.b[n9];
            n8 = q0.a(n11);
            if ((n11 = q0.b(n11)) != 0) {
                if (n11 != 1) {
                    if (n11 != 2) {
                        if (n11 != 3) {
                            if (n11 != 5) {
                                throw new IllegalStateException((Throwable)A.e());
                            }
                            n8 = k.l(n8, (Integer)this.c[n9]);
                        } else {
                            n8 = k.L(n8) * 2 + ((l0)this.c[n9]).d();
                        }
                    } else {
                        n8 = k.f(n8, (h)this.c[n9]);
                    }
                } else {
                    n8 = k.n(n8, (Long)this.c[n9]);
                }
            } else {
                n8 = k.O(n8, (Long)this.c[n9]);
            }
            n10 += n8;
            ++n9;
        } while (true);
    }

    public int e() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        int n9 = 0;
        for (n8 = 0; n8 < this.a; ++n8) {
            n9 += k.A(q0.a(this.b[n8]), (h)this.c[n8]);
        }
        this.d = n9;
        return n9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof l0)) {
            return false;
        }
        object = (l0)object;
        int n8 = this.a;
        if (n8 == object.a && l0.o(this.b, object.b, n8)) {
            if (!l0.l(this.c, object.c, this.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void h() {
        this.e = false;
    }

    public int hashCode() {
        int n8 = this.a;
        return ((527 + n8) * 31 + l0.f(this.b, n8)) * 31 + l0.g(this.c, this.a);
    }

    public l0 i(l0 l02) {
        if (l02.equals(l0.c())) {
            return this;
        }
        this.a();
        int n8 = this.a + l02.a;
        this.b(n8);
        System.arraycopy((Object)l02.b, (int)0, (Object)this.b, (int)this.a, (int)l02.a);
        System.arraycopy((Object)l02.c, (int)0, (Object)this.c, (int)this.a, (int)l02.a);
        this.a = n8;
        return this;
    }

    public final void m(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < this.a; ++i8) {
            Q.d(stringBuilder, n8, String.valueOf((int)q0.a(this.b[i8])), this.c[i8]);
        }
    }

    public void n(int n8, Object object) {
        this.a();
        this.b(this.a + 1);
        int[] arrn = this.b;
        int n9 = this.a;
        arrn[n9] = n8;
        this.c[n9] = object;
        this.a = n9 + 1;
    }

    public void p(r0 r02) {
        if (r02.v() == r0.a.p) {
            for (int i8 = this.a - 1; i8 >= 0; --i8) {
                r02.f(q0.a(this.b[i8]), this.c[i8]);
            }
        } else {
            for (int i9 = 0; i9 < this.a; ++i9) {
                r02.f(q0.a(this.b[i9]), this.c[i9]);
            }
        }
    }

    public void r(r0 r02) {
        if (this.a == 0) {
            return;
        }
        if (r02.v() == r0.a.o) {
            for (int i8 = 0; i8 < this.a; ++i8) {
                l0.q(this.b[i8], this.c[i8], r02);
            }
        } else {
            for (int i9 = this.a - 1; i9 >= 0; --i9) {
                l0.q(this.b[i9], this.c[i9], r02);
            }
        }
    }
}

