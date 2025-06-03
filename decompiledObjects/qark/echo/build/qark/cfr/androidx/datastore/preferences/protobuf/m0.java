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
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.z;
import java.util.Arrays;

public final class m0 {
    public static final m0 f = new m0(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public m0() {
        this(0, new int[8], new Object[8], true);
    }

    public m0(int n8, int[] arrn, Object[] arrobject, boolean bl) {
        this.a = n8;
        this.b = arrn;
        this.c = arrobject;
        this.e = bl;
    }

    public static boolean c(int[] arrn, int[] arrn2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrn[i8] == arrn2[i8]) continue;
            return false;
        }
        return true;
    }

    public static boolean d(Object[] arrobject, Object[] arrobject2, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (arrobject[i8].equals(arrobject2[i8])) continue;
            return false;
        }
        return true;
    }

    public static m0 e() {
        return f;
    }

    public static int h(int[] arrn, int n8) {
        int n9 = 17;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + arrn[i8];
        }
        return n9;
    }

    public static int i(Object[] arrobject, int n8) {
        int n9 = 17;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + arrobject[i8].hashCode();
        }
        return n9;
    }

    public static m0 k(m0 m02, m0 m03) {
        int n8 = m02.a + m03.a;
        int[] arrn = Arrays.copyOf((int[])m02.b, (int)n8);
        System.arraycopy((Object)m03.b, (int)0, (Object)arrn, (int)m02.a, (int)m03.a);
        Object[] arrobject = Arrays.copyOf((Object[])m02.c, (int)n8);
        System.arraycopy((Object)m03.c, (int)0, (Object)arrobject, (int)m02.a, (int)m03.a);
        return new m0(n8, arrn, arrobject, true);
    }

    public static m0 l() {
        return new m0();
    }

    public static void p(int n8, Object object, s0 s02) {
        int n9 = r0.a(n8);
        if ((n8 = r0.b(n8)) != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 5) {
                            s02.l(n9, (Integer)object);
                            return;
                        }
                        throw new RuntimeException((Throwable)z.d());
                    }
                    if (s02.v() == s0.a.o) {
                        s02.h(n9);
                        ((m0)object).q(s02);
                        s02.z(n9);
                        return;
                    }
                    s02.z(n9);
                    ((m0)object).q(s02);
                    s02.h(n9);
                    return;
                }
                s02.J(n9, (g)object);
                return;
            }
            s02.u(n9, (Long)object);
            return;
        }
        s02.c(n9, (Long)object);
    }

    public void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void b() {
        int n8 = this.a;
        int[] arrn = this.b;
        if (n8 == arrn.length) {
            int n9 = n8 < 4 ? 8 : n8 >> 1;
            n9 = n8 + n9;
            this.b = Arrays.copyOf((int[])arrn, (int)n9);
            this.c = Arrays.copyOf((Object[])this.c, (int)n9);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof m0)) {
            return false;
        }
        object = (m0)object;
        int n8 = this.a;
        if (n8 == object.a && m0.c(this.b, object.b, n8)) {
            if (!m0.d(this.c, object.c, this.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int f() {
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
            n8 = r0.a(n11);
            if ((n11 = r0.b(n11)) != 0) {
                if (n11 != 1) {
                    if (n11 != 2) {
                        if (n11 != 3) {
                            if (n11 != 5) {
                                throw new IllegalStateException((Throwable)z.d());
                            }
                            n8 = j.l(n8, (Integer)this.c[n9]);
                        } else {
                            n8 = j.P(n8) * 2 + ((m0)this.c[n9]).f();
                        }
                    } else {
                        n8 = j.f(n8, (g)this.c[n9]);
                    }
                } else {
                    n8 = j.n(n8, (Long)this.c[n9]);
                }
            } else {
                n8 = j.S(n8, (Long)this.c[n9]);
            }
            n10 += n8;
            ++n9;
        } while (true);
    }

    public int g() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        int n9 = 0;
        for (n8 = 0; n8 < this.a; ++n8) {
            n9 += j.D(r0.a(this.b[n8]), (g)this.c[n8]);
        }
        this.d = n9;
        return n9;
    }

    public int hashCode() {
        int n8 = this.a;
        return ((527 + n8) * 31 + m0.h(this.b, n8)) * 31 + m0.i(this.c, this.a);
    }

    public void j() {
        this.e = false;
    }

    public final void m(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < this.a; ++i8) {
            Q.c(stringBuilder, n8, String.valueOf((int)r0.a(this.b[i8])), this.c[i8]);
        }
    }

    public void n(int n8, Object object) {
        this.a();
        this.b();
        int[] arrn = this.b;
        int n9 = this.a;
        arrn[n9] = n8;
        this.c[n9] = object;
        this.a = n9 + 1;
    }

    public void o(s0 s02) {
        if (s02.v() == s0.a.p) {
            for (int i8 = this.a - 1; i8 >= 0; --i8) {
                s02.f(r0.a(this.b[i8]), this.c[i8]);
            }
        } else {
            for (int i9 = 0; i9 < this.a; ++i9) {
                s02.f(r0.a(this.b[i9]), this.c[i9]);
            }
        }
    }

    public void q(s0 s02) {
        if (this.a == 0) {
            return;
        }
        if (s02.v() == s0.a.o) {
            for (int i8 = 0; i8 < this.a; ++i8) {
                m0.p(this.b[i8], this.c[i8], s02);
            }
        } else {
            for (int i9 = this.a - 1; i9 >= 0; --i9) {
                m0.p(this.b[i9], this.c[i9], s02);
            }
        }
    }
}

