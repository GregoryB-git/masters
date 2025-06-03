/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package Y4;

import java.util.Arrays;

public final class b
implements Cloneable {
    public final int o;
    public final int p;
    public final int q;
    public final int[] r;

    public b(int n8) {
        this(n8, n8);
    }

    public b(int n8, int n9) {
        if (n8 > 0 && n9 > 0) {
            this.o = n8;
            this.p = n9;
            this.q = n8 = (n8 + 31) / 32;
            this.r = new int[n8 * n9];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    public b(int n8, int n9, int n10, int[] arrn) {
        this.o = n8;
        this.p = n9;
        this.q = n10;
        this.r = arrn;
    }

    public final String a(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder(this.p * (this.o + 1));
        for (int i8 = 0; i8 < this.p; ++i8) {
            for (int i9 = 0; i9 < this.o; ++i9) {
                String string5 = this.f(i9, i8) ? string2 : string3;
                stringBuilder.append(string5);
            }
            stringBuilder.append(string4);
        }
        return stringBuilder.toString();
    }

    public void b() {
        int n8 = this.r.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            this.r[i8] = 0;
        }
    }

    public b d() {
        return new b(this.o, this.p, this.q, (int[])this.r.clone());
    }

    public boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (this.o == object.o && this.p == object.p && this.q == object.q && Arrays.equals((int[])this.r, (int[])object.r)) {
            return true;
        }
        return false;
    }

    public boolean f(int n8, int n9) {
        int n10 = this.q;
        int n11 = n8 / 32;
        if ((this.r[n9 * n10 + n11] >>> (n8 & 31) & 1) != 0) {
            return true;
        }
        return false;
    }

    public int g() {
        return this.p;
    }

    public int hashCode() {
        int n8 = this.o;
        return (((n8 * 31 + n8) * 31 + this.p) * 31 + this.q) * 31 + Arrays.hashCode((int[])this.r);
    }

    public int j() {
        return this.o;
    }

    public void l(int n8, int n9) {
        n9 = n9 * this.q + n8 / 32;
        int[] arrn = this.r;
        arrn[n9] = 1 << (n8 & 31) | arrn[n9];
    }

    public void n(int n8, int n9, int n10, int n11) {
        if (n9 >= 0 && n8 >= 0) {
            if (n11 > 0 && n10 > 0) {
                int n12 = n10 + n8;
                if ((n11 += n9) <= this.p && n12 <= this.o) {
                    while (n9 < n11) {
                        int n13 = this.q;
                        for (n10 = n8; n10 < n12; ++n10) {
                            int[] arrn = this.r;
                            int n14 = n10 / 32 + n13 * n9;
                            arrn[n14] = arrn[n14] | 1 << (n10 & 31);
                        }
                        ++n9;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public String o(String string2, String string3) {
        return this.a(string2, string3, "\n");
    }

    public String toString() {
        return this.o("X ", "  ");
    }
}

