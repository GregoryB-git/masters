/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 */
package D6;

import D6.a;
import D6.c;
import D6.d;
import D6.g;
import java.util.Arrays;

public final class f
extends c {
    public final transient byte[][] t;
    public final transient int[] u;

    public f(a object, int n8) {
        int n9;
        int n10;
        super(null);
        g.b(object.p, 0L, n8);
        byte[][] arrby = object.o;
        int n11 = 0;
        int n12 = n10 = 0;
        while (n10 < n8) {
            n9 = arrby.c;
            int n13 = arrby.b;
            if (n9 != n13) {
                n10 += n9 - n13;
                ++n12;
                arrby = arrby.f;
                continue;
            }
            throw new AssertionError((Object)"s.limit == s.pos");
        }
        this.t = new byte[n12][];
        this.u = new int[n12 * 2];
        object = object.o;
        n10 = 0;
        n12 = n11;
        while (n12 < n8) {
            arrby = this.t;
            arrby[n10] = object.a;
            n11 = object.c;
            n9 = object.b;
            n12 = n11 = n12 + (n11 - n9);
            if (n11 > n8) {
                n12 = n8;
            }
            int[] arrn = this.u;
            arrn[n10] = n12;
            arrn[arrby.length + n10] = n9;
            object.d = true;
            ++n10;
            object = object.f;
        }
    }

    private Object writeReplace() {
        return this.C();
    }

    public final c C() {
        return new c(this.z());
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof c && (object = (c)object).r() == this.r() && this.w(0, (c)object, 0, this.r())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = this.p;
        if (n8 != 0) {
            return n8;
        }
        int n9 = this.t.length;
        int n10 = 1;
        int n11 = 0;
        for (int i8 = 0; i8 < n9; ++i8) {
            byte[] arrby = this.t[i8];
            int[] arrn = this.u;
            int n12 = arrn[n9 + i8];
            int n13 = arrn[i8];
            for (n8 = n12; n8 < n13 - n11 + n12; ++n8) {
                n10 = n10 * 31 + arrby[n8];
            }
            n11 = n13;
        }
        this.p = n10;
        return n10;
    }

    @Override
    public byte l(int n8) {
        g.b(this.u[this.t.length - 1], n8, 1L);
        int n9 = this.x(n8);
        int n10 = n9 == 0 ? 0 : this.u[n9 - 1];
        int[] arrn = this.u;
        byte[][] arrby = this.t;
        int n11 = arrn[arrby.length + n9];
        return arrby[n9][n8 - n10 + n11];
    }

    @Override
    public String m() {
        return this.C().m();
    }

    @Override
    public boolean o(int n8, byte[] arrby, int n9, int n10) {
        if (n8 >= 0 && n8 <= this.r() - n10 && n9 >= 0) {
            if (n9 > arrby.length - n10) {
                return false;
            }
            int n11 = this.x(n8);
            int n12 = n8;
            n8 = n11;
            while (n10 > 0) {
                n11 = n8 == 0 ? 0 : this.u[n8 - 1];
                byte[][] arrby2 = this.t;
                int[] arrn = this.u;
                int n13 = arrn[arrby2.length + n8];
                int n14 = Math.min((int)n10, (int)(this.u[n8] - n11 + n11 - n12));
                if (!g.a(arrby2[n8], n12 - n11 + n13, arrby, n9, n14)) {
                    return false;
                }
                n12 += n14;
                n9 += n14;
                n10 -= n14;
                ++n8;
            }
            return true;
        }
        return false;
    }

    @Override
    public int r() {
        return this.u[this.t.length - 1];
    }

    @Override
    public c s(int n8, int n9) {
        return this.C().s(n8, n9);
    }

    @Override
    public String toString() {
        return this.C().toString();
    }

    @Override
    public String u() {
        return this.C().u();
    }

    public boolean w(int n8, c c8, int n9, int n10) {
        if (n8 >= 0) {
            if (n8 > this.r() - n10) {
                return false;
            }
            int n11 = this.x(n8);
            int n12 = n8;
            n8 = n11;
            while (n10 > 0) {
                n11 = n8 == 0 ? 0 : this.u[n8 - 1];
                byte[][] arrby = this.t;
                int[] arrn = this.u;
                int n13 = arrn[arrby.length + n8];
                int n14 = Math.min((int)n10, (int)(this.u[n8] - n11 + n11 - n12));
                if (!c8.o(n9, arrby[n8], n12 - n11 + n13, n14)) {
                    return false;
                }
                n12 += n14;
                n9 += n14;
                n10 -= n14;
                ++n8;
            }
            return true;
        }
        return false;
    }

    public final int x(int n8) {
        if ((n8 = Arrays.binarySearch((int[])this.u, (int)0, (int)this.t.length, (int)(n8 + 1))) >= 0) {
            return n8;
        }
        return n8;
    }

    public byte[] z() {
        int[] arrn = this.u;
        byte[][] arrby = this.t;
        arrn = new byte[arrn[arrby.length - 1]];
        int n8 = arrby.length;
        Object object = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrby = this.u;
            byte[] arrby2 = arrby[n8 + i8];
            byte[] arrby3 = arrby[i8];
            System.arraycopy((Object)this.t[i8], (int)arrby2, (Object)arrn, (int)object, (int)(arrby3 - object));
            object = arrby3;
        }
        return arrn;
    }
}

