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
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.N4;
import com.google.android.gms.internal.measurement.T5;
import com.google.android.gms.internal.measurement.W5;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.q3;
import java.util.Arrays;

public final class v5 {
    public static final v5 f = new v5(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public v5() {
        this(0, new int[8], new Object[8], true);
    }

    public v5(int n8, int[] arrn, Object[] arrobject, boolean bl) {
        this.a = n8;
        this.b = arrn;
        this.c = arrobject;
        this.e = bl;
    }

    public static v5 c(v5 v52, v5 v53) {
        int n8 = v52.a + v53.a;
        int[] arrn = Arrays.copyOf((int[])v52.b, (int)n8);
        System.arraycopy((Object)v53.b, (int)0, (Object)arrn, (int)v52.a, (int)v53.a);
        Object[] arrobject = Arrays.copyOf((Object[])v52.c, (int)n8);
        System.arraycopy((Object)v53.c, (int)0, (Object)arrobject, (int)v52.a, (int)v53.a);
        return new v5(n8, arrn, arrobject, true);
    }

    public static void f(int n8, Object object, T5 t52) {
        int n9 = n8 >>> 3;
        if ((n8 &= 7) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 5) {
                            t52.k(n9, (Integer)object);
                            return;
                        }
                        throw new RuntimeException((Throwable)k4.a());
                    }
                    if (t52.a() == W5.a) {
                        t52.l(n9);
                        ((v5)object).j(t52);
                        t52.e(n9);
                        return;
                    }
                    t52.e(n9);
                    ((v5)object).j(t52);
                    t52.l(n9);
                    return;
                }
                t52.f(n9, (q3)object);
                return;
            }
            t52.M(n9, (Long)object);
            return;
        }
        t52.j(n9, (Long)object);
    }

    public static v5 k() {
        return f;
    }

    public static v5 l() {
        return new v5();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a() {
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
            n8 = n11 >>> 3;
            if ((n11 &= 7) != 0) {
                if (n11 != 1) {
                    if (n11 != 2) {
                        if (n11 != 3) {
                            if (n11 != 5) {
                                throw new IllegalStateException((Throwable)k4.a());
                            }
                            n8 = J3.h0(n8, (Integer)this.c[n9]);
                        } else {
                            n8 = (J3.s0(n8) << 1) + ((v5)this.c[n9]).a();
                        }
                    } else {
                        n8 = J3.Q(n8, (q3)this.c[n9]);
                    }
                } else {
                    n8 = J3.P(n8, (Long)this.c[n9]);
                }
            } else {
                n8 = J3.m0(n8, (Long)this.c[n9]);
            }
            n10 += n8;
            ++n9;
        } while (true);
    }

    public final v5 b(v5 v52) {
        if (v52.equals(f)) {
            return this;
        }
        this.n();
        int n8 = this.a + v52.a;
        this.d(n8);
        System.arraycopy((Object)v52.b, (int)0, (Object)this.b, (int)this.a, (int)v52.a);
        System.arraycopy((Object)v52.c, (int)0, (Object)this.c, (int)this.a, (int)v52.a);
        this.a = n8;
        return this;
    }

    public final void d(int n8) {
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

    public final void e(int n8, Object object) {
        this.n();
        this.d(this.a + 1);
        int[] arrn = this.b;
        int n9 = this.a;
        arrn[n9] = n8;
        this.c[n9] = object;
        this.a = n9 + 1;
    }

    public final boolean equals(Object arrobject) {
        if (this == arrobject) {
            return true;
        }
        if (arrobject == null) {
            return false;
        }
        if (!(arrobject instanceof v5)) {
            return false;
        }
        arrobject = (v5)arrobject;
        int n8 = this.a;
        if (n8 == arrobject.a) {
            int n9;
            int[] arrn = this.b;
            int[] arrn2 = arrobject.b;
            for (n9 = 0; n9 < n8; ++n9) {
                if (arrn[n9] == arrn2[n9]) continue;
                return false;
            }
            arrn = this.c;
            arrobject = arrobject.c;
            n8 = this.a;
            for (n9 = 0; n9 < n8; ++n9) {
                if (arrn[n9].equals(arrobject[n9])) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public final void g(T5 t52) {
        if (t52.a() == W5.b) {
            for (int i8 = this.a - 1; i8 >= 0; --i8) {
                t52.t(this.b[i8] >>> 3, this.c[i8]);
            }
            return;
        }
        for (int i9 = 0; i9 < this.a; ++i9) {
            t52.t(this.b[i9] >>> 3, this.c[i9]);
        }
    }

    public final void h(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < this.a; ++i8) {
            N4.d(stringBuilder, n8, String.valueOf((int)(this.b[i8] >>> 3)), this.c[i8]);
        }
    }

    public final int hashCode() {
        int n8;
        int n9 = this.a;
        int[] arrn = this.b;
        int n10 = 17;
        int n11 = 0;
        int n12 = 17;
        for (n8 = 0; n8 < n9; ++n8) {
            n12 = n12 * 31 + arrn[n8];
        }
        arrn = this.c;
        int n13 = this.a;
        for (n8 = n11; n8 < n13; ++n8) {
            n10 = n10 * 31 + arrn[n8].hashCode();
        }
        return ((n9 + 527) * 31 + n12) * 31 + n10;
    }

    public final int i() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        int n9 = 0;
        for (n8 = 0; n8 < this.a; ++n8) {
            n9 += J3.Z(this.b[n8] >>> 3, (q3)this.c[n8]);
        }
        this.d = n9;
        return n9;
    }

    public final void j(T5 t52) {
        if (this.a == 0) {
            return;
        }
        if (t52.a() == W5.a) {
            for (int i8 = 0; i8 < this.a; ++i8) {
                v5.f(this.b[i8], this.c[i8], t52);
            }
            return;
        }
        for (int i9 = this.a - 1; i9 >= 0; --i9) {
            v5.f(this.b[i9], this.c[i9], t52);
        }
    }

    public final void m() {
        if (this.e) {
            this.e = false;
        }
    }

    public final void n() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }
}

