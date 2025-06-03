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
package com.google.protobuf;

import com.google.protobuf.M;
import com.google.protobuf.f;
import com.google.protobuf.h;
import com.google.protobuf.m0;
import com.google.protobuf.n0;
import com.google.protobuf.v;
import java.util.Arrays;

public final class h0 {
    public static final h0 f = new h0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public h0(int n8, int[] arrn, Object[] arrobject, boolean bl) {
        this.a = n8;
        this.b = arrn;
        this.c = arrobject;
        this.e = bl;
    }

    public static h0 c() {
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

    public static h0 j(h0 h02, h0 h03) {
        int n8 = h02.a + h03.a;
        int[] arrn = Arrays.copyOf((int[])h02.b, (int)n8);
        System.arraycopy((Object)h03.b, (int)0, (Object)arrn, (int)h02.a, (int)h03.a);
        Object[] arrobject = Arrays.copyOf((Object[])h02.c, (int)n8);
        System.arraycopy((Object)h03.c, (int)0, (Object)arrobject, (int)h02.a, (int)h03.a);
        return new h0(n8, arrn, arrobject, true);
    }

    public static boolean k(Object[] arrobject, Object[] arrobject2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrobject[i8].equals(arrobject2[i8])) continue;
            return false;
        }
        return true;
    }

    public static boolean m(int[] arrn, int[] arrn2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrn[i8] == arrn2[i8]) continue;
            return false;
        }
        return true;
    }

    public static void o(int n8, Object object, n0 n02) {
        int n9 = m0.a(n8);
        if ((n8 = m0.b(n8)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 5) {
                            n02.l(n9, (Integer)object);
                            return;
                        }
                        throw new RuntimeException((Throwable)v.a());
                    }
                    if (n02.v() == n0.a.o) {
                        n02.h(n9);
                        ((h0)object).p(n02);
                        n02.z(n9);
                        return;
                    }
                    n02.z(n9);
                    ((h0)object).p(n02);
                    n02.h(n9);
                    return;
                }
                n02.M(n9, (f)object);
                return;
            }
            n02.u(n9, (Long)object);
            return;
        }
        n02.c(n9, (Long)object);
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
            n8 = m0.a(n11);
            if ((n11 = m0.b(n11)) != 0) {
                if (n11 != 1) {
                    if (n11 != 2) {
                        if (n11 != 3) {
                            if (n11 != 5) {
                                throw new IllegalStateException((Throwable)v.a());
                            }
                            n8 = h.m(n8, (Integer)this.c[n9]);
                        } else {
                            n8 = h.O(n8) * 2 + ((h0)this.c[n9]).d();
                        }
                    } else {
                        n8 = h.g(n8, (f)this.c[n9]);
                    }
                } else {
                    n8 = h.o(n8, (Long)this.c[n9]);
                }
            } else {
                n8 = h.R(n8, (Long)this.c[n9]);
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
            n9 += h.D(m0.a(this.b[n8]), (f)this.c[n8]);
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
        if (!(object instanceof h0)) {
            return false;
        }
        object = (h0)object;
        int n8 = this.a;
        if (n8 == object.a && h0.m(this.b, object.b, n8)) {
            if (!h0.k(this.c, object.c, this.a)) {
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
        return ((527 + n8) * 31 + h0.f(this.b, n8)) * 31 + h0.g(this.c, this.a);
    }

    public h0 i(h0 h02) {
        if (h02.equals(h0.c())) {
            return this;
        }
        this.a();
        int n8 = this.a + h02.a;
        this.b(n8);
        System.arraycopy((Object)h02.b, (int)0, (Object)this.b, (int)this.a, (int)h02.a);
        System.arraycopy((Object)h02.c, (int)0, (Object)this.c, (int)this.a, (int)h02.a);
        this.a = n8;
        return this;
    }

    public final void l(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < this.a; ++i8) {
            M.d(stringBuilder, n8, String.valueOf((int)m0.a(this.b[i8])), this.c[i8]);
        }
    }

    public void n(n0 n02) {
        if (n02.v() == n0.a.p) {
            for (int i8 = this.a - 1; i8 >= 0; --i8) {
                n02.f(m0.a(this.b[i8]), this.c[i8]);
            }
        } else {
            for (int i9 = 0; i9 < this.a; ++i9) {
                n02.f(m0.a(this.b[i9]), this.c[i9]);
            }
        }
    }

    public void p(n0 n02) {
        if (this.a == 0) {
            return;
        }
        if (n02.v() == n0.a.o) {
            for (int i8 = 0; i8 < this.a; ++i8) {
                h0.o(this.b[i8], this.c[i8], n02);
            }
        } else {
            for (int i9 = this.a - 1; i9 >= 0; --i9) {
                h0.o(this.b[i9], this.c[i9], n02);
            }
        }
    }
}

