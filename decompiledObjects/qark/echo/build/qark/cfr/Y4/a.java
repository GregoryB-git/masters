/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 */
package Y4;

import java.util.Arrays;

public final class a
implements Cloneable {
    public int[] o;
    public int p;

    public a() {
        this.p = 0;
        this.o = new int[1];
    }

    public a(int[] arrn, int n8) {
        this.o = arrn;
        this.p = n8;
    }

    public static int[] o(int n8) {
        return new int[(n8 + 31) / 32];
    }

    public void a(boolean bl) {
        this.g(this.p + 1);
        if (bl) {
            int[] arrn = this.o;
            int n8 = this.p;
            int n9 = n8 / 32;
            arrn[n9] = 1 << (n8 & 31) | arrn[n9];
        }
        ++this.p;
    }

    public void b(a a8) {
        int n8 = a8.p;
        this.g(this.p + n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            this.a(a8.j(i8));
        }
    }

    public void d(int n8, int n9) {
        if (n9 >= 0 && n9 <= 32) {
            this.g(this.p + n9);
            while (n9 > 0) {
                boolean bl = true;
                if ((n8 >> n9 - 1 & 1) != 1) {
                    bl = false;
                }
                this.a(bl);
                --n9;
            }
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (this.p == object.p && Arrays.equals((int[])this.o, (int[])object.o)) {
            return true;
        }
        return false;
    }

    public a f() {
        return new a((int[])this.o.clone(), this.p);
    }

    public final void g(int n8) {
        if (n8 > this.o.length << 5) {
            int[] arrn = a.o(n8);
            int[] arrn2 = this.o;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            this.o = arrn;
        }
    }

    public int hashCode() {
        return this.p * 31 + Arrays.hashCode((int[])this.o);
    }

    public boolean j(int n8) {
        if ((1 << (n8 & 31) & this.o[n8 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public int l() {
        return this.p;
    }

    public int n() {
        return (this.p + 7) / 8;
    }

    public void p(int n8, byte[] arrby, int n9, int n10) {
        int n11 = 0;
        int n12 = n8;
        for (n8 = n11; n8 < n10; ++n8) {
            int n13 = n11 = 0;
            while (n11 < 8) {
                int n14 = n13;
                if (this.j(n12)) {
                    n14 = n13 | 1 << 7 - n11;
                }
                ++n12;
                ++n11;
                n13 = n14;
            }
            arrby[n9 + n8] = (byte)n13;
        }
    }

    public void s(a a8) {
        if (this.p == a8.p) {
            int[] arrn;
            for (int i8 = 0; i8 < (arrn = this.o).length; ++i8) {
                arrn[i8] = arrn[i8] ^ a8.o[i8];
            }
            return;
        }
        throw new IllegalArgumentException("Sizes don't match");
    }

    public String toString() {
        int n8 = this.p;
        StringBuilder stringBuilder = new StringBuilder(n8 + n8 / 8 + 1);
        for (n8 = 0; n8 < this.p; ++n8) {
            if ((n8 & 7) == 0) {
                stringBuilder.append(' ');
            }
            char c8 = this.j(n8) ? 'X' : '.';
            stringBuilder.append(c8);
        }
        return stringBuilder.toString();
    }
}

