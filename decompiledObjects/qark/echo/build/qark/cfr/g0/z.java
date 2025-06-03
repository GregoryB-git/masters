/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.util.Arrays
 */
package g0;

import W2.e;
import a3.b;
import a3.i;
import g0.M;
import g0.a;
import g0.y;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class z {
    public static final char[] d = new char[]{'\r', '\n'};
    public static final char[] e = new char[]{'\n'};
    public static final X2.y f = X2.y.b0((Object)e.a, (Object)e.c, (Object)e.f, (Object)e.d, (Object)e.e);
    public byte[] a;
    public int b;
    public int c;

    public z() {
        this.a = M.f;
    }

    public z(int n8) {
        this.a = new byte[n8];
        this.c = n8;
    }

    public z(byte[] arrby) {
        this.a = arrby;
        this.c = arrby.length;
    }

    public z(byte[] arrby, int n8) {
        this.a = arrby;
        this.c = n8;
    }

    public String A() {
        return this.n('\u0000');
    }

    public String B(int n8) {
        if (n8 == 0) {
            return "";
        }
        int n9 = this.b;
        int n10 = n9 + n8 - 1;
        n10 = n10 < this.c && this.a[n10] == 0 ? n8 - 1 : n8;
        String string2 = M.I(this.a, n9, n10);
        this.b += n8;
        return string2;
    }

    public short C() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        this.b = n8 + 2;
        return (short)(arrby[n8 + 1] & 255 | (by & 255) << 8);
    }

    public String D(int n8) {
        return this.E(n8, e.c);
    }

    public String E(int n8, Charset object) {
        object = new String(this.a, this.b, n8, (Charset)object);
        this.b += n8;
        return object;
    }

    public int F() {
        return this.G() << 21 | this.G() << 14 | this.G() << 7 | this.G();
    }

    public int G() {
        byte[] arrby = this.a;
        int n8 = this.b;
        this.b = n8 + 1;
        return arrby[n8] & 255;
    }

    public int H() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        this.b = n8 + 4;
        return by2 & 255 | (by & 255) << 8;
    }

    public long I() {
        byte[] arrby = this.a;
        int n8 = this.b;
        long l8 = arrby[n8];
        long l9 = arrby[n8 + 1];
        long l10 = arrby[n8 + 2];
        this.b = n8 + 4;
        return (long)arrby[n8 + 3] & 255L | ((l8 & 255L) << 24 | (l9 & 255L) << 16 | (l10 & 255L) << 8);
    }

    public int J() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        this.b = n8 + 3;
        return arrby[n8 + 2] & 255 | ((by2 & 255) << 8 | (by & 255) << 16);
    }

    public int K() {
        int n8 = this.p();
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public long L() {
        long l8 = this.z();
        if (l8 >= 0L) {
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(l8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int M() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        this.b = n8 + 2;
        return arrby[n8 + 1] & 255 | (by & 255) << 8;
    }

    public long N() {
        int n8;
        int n9;
        int n10;
        long l8;
        block7 : {
            l8 = this.a[this.b];
            n9 = 7;
            do {
                n8 = 1;
                if (n9 < 0) break;
                n10 = 1 << n9;
                if (((long)n10 & l8) == 0L) {
                    if (n9 < 6) {
                        l8 &= (long)(n10 - 1);
                        n9 = 7 - n9;
                    } else {
                        if (n9 != 7) break;
                        n9 = 1;
                    }
                    break block7;
                }
                --n9;
            } while (true);
            n9 = 0;
        }
        if (n9 != 0) {
            while (n8 < n9) {
                n10 = this.a[this.b + n8];
                if ((n10 & 192) == 128) {
                    l8 = l8 << 6 | (long)(n10 & 63);
                    ++n8;
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid UTF-8 sequence continuation byte: ");
                stringBuilder.append(l8);
                throw new NumberFormatException(stringBuilder.toString());
            }
            this.b += n9;
            return l8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-8 sequence first byte: ");
        stringBuilder.append(l8);
        throw new NumberFormatException(stringBuilder.toString());
    }

    public Charset O() {
        byte[] arrby;
        int n8;
        if (this.a() >= 3 && (arrby = this.a)[n8 = this.b] == -17 && arrby[n8 + 1] == -69 && arrby[n8 + 2] == -65) {
            this.b = n8 + 3;
            return e.c;
        }
        if (this.a() >= 2) {
            arrby = this.a;
            n8 = this.b;
            byte by = arrby[n8];
            if (by == -2 && arrby[n8 + 1] == -1) {
                this.b = n8 + 2;
                return e.d;
            }
            if (by == -1 && arrby[n8 + 1] == -2) {
                this.b = n8 + 2;
                return e.e;
            }
        }
        return null;
    }

    public void P(int n8) {
        byte[] arrby = this.b() < n8 ? new byte[n8] : this.a;
        this.R(arrby, n8);
    }

    public void Q(byte[] arrby) {
        this.R(arrby, arrby.length);
    }

    public void R(byte[] arrby, int n8) {
        this.a = arrby;
        this.c = n8;
        this.b = 0;
    }

    public void S(int n8) {
        boolean bl = n8 >= 0 && n8 <= this.a.length;
        a.a(bl);
        this.c = n8;
    }

    public void T(int n8) {
        boolean bl = n8 >= 0 && n8 <= this.c;
        a.a(bl);
        this.b = n8;
    }

    public void U(int n8) {
        this.T(this.b + n8);
    }

    public final void V(Charset charset) {
        if (this.m(charset, d) == '\r') {
            this.m(charset, e);
        }
    }

    public int a() {
        return this.c - this.b;
    }

    public int b() {
        return this.a.length;
    }

    public void c(int n8) {
        if (n8 > this.b()) {
            this.a = Arrays.copyOf((byte[])this.a, (int)n8);
        }
    }

    public final int d(Charset charset) {
        int n8;
        int n9;
        if (!charset.equals((Object)e.c) && !charset.equals((Object)e.a)) {
            if (!(charset.equals((Object)e.f) || charset.equals((Object)e.e) || charset.equals((Object)e.d))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported charset: ");
                stringBuilder.append((Object)charset);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            n8 = 2;
        } else {
            n8 = 1;
        }
        for (int i8 = this.b; i8 < (n9 = this.c) - (n8 - 1); i8 += n8) {
            byte[] arrby;
            if ((charset.equals((Object)e.c) || charset.equals((Object)e.a)) && M.C0(this.a[i8])) {
                return i8;
            }
            if ((charset.equals((Object)e.f) || charset.equals((Object)e.d)) && (arrby = this.a)[i8] == 0 && M.C0(arrby[i8 + 1])) {
                return i8;
            }
            if (!charset.equals((Object)e.e) || (arrby = this.a)[i8 + 1] != 0 || !M.C0(arrby[i8])) continue;
            return i8;
        }
        return n9;
    }

    public byte[] e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public char h(Charset charset) {
        boolean bl = f.contains((Object)charset);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported charset: ");
        stringBuilder.append((Object)charset);
        a.b(bl, stringBuilder.toString());
        return (char)(this.i(charset) >> 16);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int i(Charset arrby) {
        byte by;
        boolean bl = arrby.equals((Object)e.c);
        int n8 = 1;
        if ((bl || arrby.equals((Object)e.a)) && this.a() >= 1) {
            by = (byte)b.a(i.b(this.a[this.b]));
            return (b.a(by) << 16) + n8;
        }
        if ((arrby.equals((Object)e.f) || arrby.equals((Object)e.d)) && this.a() >= 2) {
            arrby = this.a;
            n8 = this.b;
            n8 = b.c(arrby[n8], arrby[n8 + 1]);
        } else {
            if (!arrby.equals((Object)e.e)) return 0;
            if (this.a() < 2) return 0;
            arrby = this.a;
            n8 = this.b;
            n8 = b.c(arrby[n8 + 1], arrby[n8]);
        }
        by = (byte)n8;
        n8 = 2;
        return (b.a(by) << 16) + n8;
    }

    public int j() {
        return this.a[this.b] & 255;
    }

    public void k(y y8, int n8) {
        this.l(y8.a, 0, n8);
        y8.p(0);
    }

    public void l(byte[] arrby, int n8, int n9) {
        System.arraycopy((Object)this.a, (int)this.b, (Object)arrby, (int)n8, (int)n9);
        this.b += n9;
    }

    public final char m(Charset charset, char[] arrc) {
        char c8;
        int n8 = this.i(charset);
        if (n8 != 0 && b.b(arrc, c8 = (char)(n8 >> 16))) {
            this.b += n8 & 65535;
            return c8;
        }
        return '\u0000';
    }

    public String n(char c8) {
        int n8;
        if (this.a() == 0) {
            return null;
        }
        for (n8 = this.b; n8 < this.c && this.a[n8] != c8; ++n8) {
        }
        Object object = this.a;
        c8 = (char)this.b;
        object = M.I((byte[])object, c8, n8 - c8);
        this.b = n8;
        if (n8 < this.c) {
            this.b = n8 + 1;
        }
        return object;
    }

    public double o() {
        return Double.longBitsToDouble((long)this.z());
    }

    public int p() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        byte by3 = arrby[n8 + 2];
        this.b = n8 + 4;
        return arrby[n8 + 3] & 255 | ((by2 & 255) << 16 | (by & 255) << 24 | (by3 & 255) << 8);
    }

    public int q() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        this.b = n8 + 3;
        return arrby[n8 + 2] & 255 | ((by2 & 255) << 8 | (by & 255) << 24 >> 8);
    }

    public String r() {
        return this.s(e.c);
    }

    public String s(Charset charset) {
        boolean bl = f.contains((Object)charset);
        Object object = new StringBuilder();
        object.append("Unsupported charset: ");
        object.append((Object)charset);
        a.b(bl, object.toString());
        if (this.a() == 0) {
            return null;
        }
        if (!charset.equals((Object)e.a)) {
            this.O();
        }
        object = this.E(this.d(charset) - this.b, charset);
        if (this.b == this.c) {
            return object;
        }
        this.V(charset);
        return object;
    }

    public int t() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        byte by2 = arrby[n8 + 1];
        byte by3 = arrby[n8 + 2];
        this.b = n8 + 4;
        return (arrby[n8 + 3] & 255) << 24 | ((by2 & 255) << 8 | by & 255 | (by3 & 255) << 16);
    }

    public long u() {
        byte[] arrby = this.a;
        int n8 = this.b;
        long l8 = arrby[n8];
        long l9 = arrby[n8 + 1];
        long l10 = arrby[n8 + 2];
        long l11 = arrby[n8 + 3];
        long l12 = arrby[n8 + 4];
        long l13 = arrby[n8 + 5];
        long l14 = arrby[n8 + 6];
        this.b = n8 + 8;
        return ((long)arrby[n8 + 7] & 255L) << 56 | (l8 & 255L | (l9 & 255L) << 8 | (l10 & 255L) << 16 | (l11 & 255L) << 24 | (l12 & 255L) << 32 | (l13 & 255L) << 40 | (l14 & 255L) << 48);
    }

    public short v() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        this.b = n8 + 2;
        return (short)((arrby[n8 + 1] & 255) << 8 | by & 255);
    }

    public long w() {
        byte[] arrby = this.a;
        int n8 = this.b;
        long l8 = arrby[n8];
        long l9 = arrby[n8 + 1];
        long l10 = arrby[n8 + 2];
        this.b = n8 + 4;
        return ((long)arrby[n8 + 3] & 255L) << 24 | (l8 & 255L | (l9 & 255L) << 8 | (l10 & 255L) << 16);
    }

    public int x() {
        int n8 = this.t();
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Top bit not zero: ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public int y() {
        byte[] arrby = this.a;
        int n8 = this.b;
        byte by = arrby[n8];
        this.b = n8 + 2;
        return (arrby[n8 + 1] & 255) << 8 | by & 255;
    }

    public long z() {
        byte[] arrby = this.a;
        int n8 = this.b;
        long l8 = arrby[n8];
        long l9 = arrby[n8 + 1];
        long l10 = arrby[n8 + 2];
        long l11 = arrby[n8 + 3];
        long l12 = arrby[n8 + 4];
        long l13 = arrby[n8 + 5];
        long l14 = arrby[n8 + 6];
        this.b = n8 + 8;
        return (long)arrby[n8 + 7] & 255L | ((l8 & 255L) << 56 | (l9 & 255L) << 48 | (l10 & 255L) << 40 | (l11 & 255L) << 32 | (l12 & 255L) << 24 | (l13 & 255L) << 16 | (l14 & 255L) << 8);
    }
}

