/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class h {
    public int a;
    public int b = 100;
    public int c = Integer.MAX_VALUE;
    public i d;
    public boolean e = false;

    public h() {
    }

    public /* synthetic */ h( a8) {
        this();
    }

    public static int b(int n8) {
        return - (n8 & 1) ^ n8 >>> 1;
    }

    public static long c(long l8) {
        return - (l8 & 1L) ^ l8 >>> 1;
    }

    public static h f(InputStream inputStream) {
        return h.g(inputStream, 4096);
    }

    public static h g(InputStream inputStream, int n8) {
        if (n8 > 0) {
            if (inputStream == null) {
                return h.h(y.c);
            }
            return new c(inputStream, n8, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h h(byte[] arrby) {
        return h.i(arrby, 0, arrby.length);
    }

    public static h i(byte[] arrby, int n8, int n9) {
        return h.j(arrby, n8, n9, false);
    }

    public static h j(byte[] object, int n8, int n9, boolean bl) {
        object = new b((byte[])object, n8, n9, bl, null);
        try {
            object.l(n9);
            return object;
        }
        catch (z z8) {
            throw new IllegalArgumentException((Throwable)z8);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int var1);

    public abstract void a(int var1);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int var1);

    public abstract int l(int var1);

    public abstract boolean m();

    public abstract g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public static final class b
    extends h {
        public final byte[] f;
        public final boolean g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public boolean m;
        public int n = Integer.MAX_VALUE;

        public b(byte[] arrby, int n8, int n9, boolean bl) {
            super(null);
            this.f = arrby;
            this.h = n9 + n8;
            this.j = n8;
            this.k = n8;
            this.g = bl;
        }

        public /* synthetic */ b(byte[] arrby, int n8, int n9, boolean bl,  a8) {
            this(arrby, n8, n9, bl);
        }

        @Override
        public String A() {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n8 = this.h) - (n9 = this.j)) {
                String string2 = q0.e(this.f, n9, n10);
                this.j += n10;
                return string2;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 <= 0) {
                throw z.f();
            }
            throw z.k();
        }

        @Override
        public int B() {
            int n8;
            if (this.e()) {
                this.l = 0;
                return 0;
            }
            this.l = n8 = this.J();
            if (r0.a(n8) != 0) {
                return this.l;
            }
            throw z.b();
        }

        @Override
        public int C() {
            return this.J();
        }

        @Override
        public long D() {
            return this.K();
        }

        @Override
        public boolean E(int n8) {
            int n9 = r0.b(n8);
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            if (n9 != 4) {
                                if (n9 == 5) {
                                    this.O(4);
                                    return true;
                                }
                                throw z.d();
                            }
                            return false;
                        }
                        this.N();
                        this.a(r0.c(r0.a(n8), 4));
                        return true;
                    }
                    this.O(this.J());
                    return true;
                }
                this.O(8);
                return true;
            }
            this.P();
            return true;
        }

        public byte F() {
            int n8 = this.j;
            if (n8 != this.h) {
                byte[] arrby = this.f;
                this.j = n8 + 1;
                return arrby[n8];
            }
            throw z.k();
        }

        public byte[] G(int n8) {
            int n9;
            int n10;
            if (n8 > 0 && n8 <= (n10 = this.h) - (n9 = this.j)) {
                this.j = n8 += n9;
                return Arrays.copyOfRange((byte[])this.f, (int)n9, (int)n8);
            }
            if (n8 <= 0) {
                if (n8 == 0) {
                    return y.c;
                }
                throw z.f();
            }
            throw z.k();
        }

        public int H() {
            int n8 = this.j;
            if (this.h - n8 >= 4) {
                byte[] arrby = this.f;
                this.j = n8 + 4;
                byte by = arrby[n8];
                byte by2 = arrby[n8 + 1];
                byte by3 = arrby[n8 + 2];
                return (arrby[n8 + 3] & 255) << 24 | (by & 255 | (by2 & 255) << 8 | (by3 & 255) << 16);
            }
            throw z.k();
        }

        public long I() {
            int n8 = this.j;
            if (this.h - n8 >= 8) {
                byte[] arrby = this.f;
                this.j = n8 + 8;
                long l8 = arrby[n8];
                long l9 = arrby[n8 + 1];
                long l10 = arrby[n8 + 2];
                long l11 = arrby[n8 + 3];
                long l12 = arrby[n8 + 4];
                long l13 = arrby[n8 + 5];
                long l14 = arrby[n8 + 6];
                return ((long)arrby[n8 + 7] & 255L) << 56 | (l8 & 255L | (l9 & 255L) << 8 | (l10 & 255L) << 16 | (l11 & 255L) << 24 | (l12 & 255L) << 32 | (l13 & 255L) << 40 | (l14 & 255L) << 48);
            }
            throw z.k();
        }

        /*
         * Enabled aggressive block sorting
         */
        public int J() {
            int n8;
            int n9;
            block5 : {
                int n10;
                int n11;
                block10 : {
                    block9 : {
                        block7 : {
                            byte[] arrby;
                            block8 : {
                                block6 : {
                                    block4 : {
                                        n8 = this.h;
                                        n11 = this.j;
                                        if (n8 == n11) {
                                            return (int)this.L();
                                        }
                                        arrby = this.f;
                                        n9 = n11 + 1;
                                        n10 = arrby[n11];
                                        if (n10 >= 0) {
                                            this.j = n9;
                                            return n10;
                                        }
                                        if (n8 - n9 < 9) {
                                            return (int)this.L();
                                        }
                                        n8 = n11 + 2;
                                        if ((n10 = arrby[n9] << 7 ^ n10) >= 0) break block4;
                                        n9 = n10 ^ -128;
                                        break block5;
                                    }
                                    n9 = n11 + 3;
                                    if ((n10 = arrby[n8] << 14 ^ n10) < 0) break block6;
                                    n8 = n10 ^ 16256;
                                    break block7;
                                }
                                n8 = n11 + 4;
                                if ((n9 = n10 ^ arrby[n9] << 21) >= 0) break block8;
                                n10 = -2080896 ^ n9;
                                n9 = n8;
                                n8 = n10;
                                break block9;
                            }
                            n10 = n11 + 5;
                            int n12 = arrby[n8];
                            n8 = n9 ^ n12 << 28 ^ 266354560;
                            n9 = n10;
                            if (n12 >= 0) break block7;
                            n9 = n12 = n11 + 6;
                            if (arrby[n10] >= 0) break block9;
                            n9 = n10 = n11 + 7;
                            if (arrby[n12] >= 0) break block7;
                            n9 = n12 = n11 + 8;
                            if (arrby[n10] >= 0) break block9;
                            n9 = n10 = n11 + 9;
                            if (arrby[n12] >= 0) break block7;
                            if (arrby[n10] < 0) {
                                return (int)this.L();
                            }
                            break block10;
                        }
                        n10 = n9;
                        n9 = n8;
                        n8 = n10;
                        break block5;
                    }
                    n10 = n9;
                    n9 = n8;
                    n8 = n10;
                    break block5;
                }
                n10 = n11 + 10;
                n9 = n8;
                n8 = n10;
            }
            this.j = n8;
            return n9;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public long K() {
            block10 : {
                block14 : {
                    block13 : {
                        block12 : {
                            block11 : {
                                block9 : {
                                    var1_2 = this.h;
                                    var3_1 = this.j;
                                    if (var1_2 == var3_1) {
                                        return this.L();
                                    }
                                    var9_3 = this.f;
                                    var2_4 = var3_1 + 1;
                                    var4_5 = var9_3[var3_1];
                                    if (var4_5 >= 0) {
                                        this.j = var2_4;
                                        return var4_5;
                                    }
                                    if (var1_2 - var2_4 < 9) {
                                        return this.L();
                                    }
                                    var1_2 = var3_1 + 2;
                                    if ((var4_5 = var9_3[var2_4] << 7 ^ var4_5) >= 0) break block9;
                                    var5_6 = var4_5 ^ -128;
                                    break block10;
                                }
                                var2_4 = var3_1 + 3;
                                if ((var4_5 = var9_3[var1_2] << 14 ^ var4_5) < 0) break block11;
                                var5_6 = var4_5 ^ 16256;
                                var1_2 = var2_4;
                                break block10;
                            }
                            var1_2 = var3_1 + 4;
                            if ((var2_4 = var4_5 ^ var9_3[var2_4] << 21) >= 0) break block12;
                            var5_6 = -2080896 ^ var2_4;
                            break block10;
                        }
                        var5_6 = var2_4;
                        var2_4 = var3_1 + 5;
                        if ((var5_6 ^= (long)var9_3[var1_2] << 28) < 0L) break block13;
                        var7_7 = 266354560L;
                        var1_2 = var2_4;
                        ** GOTO lbl47
                    }
                    var1_2 = var3_1 + 6;
                    var7_7 = var5_6 ^ (long)var9_3[var2_4] << 35;
                    if (var7_7 >= 0L) break block14;
                    var5_6 = -34093383808L;
                    ** GOTO lbl53
                }
                var2_4 = var3_1 + 7;
                var5_6 = var7_7 ^ (long)var9_3[var1_2] << 42;
                if (var5_6 >= 0L) {
                    var7_7 = 4363953127296L;
                    var1_2 = var2_4;
lbl47: // 2 sources:
                    var5_6 ^= var7_7;
                } else {
                    var1_2 = var3_1 + 8;
                    var7_7 = var5_6 ^ (long)var9_3[var2_4] << 49;
                    if (var7_7 < 0L) {
                        var5_6 = -558586000294016L;
lbl53: // 2 sources:
                        var5_6 = var7_7 ^ var5_6;
                    } else {
                        var2_4 = var3_1 + 9;
                        var5_6 = var7_7 ^ (long)var9_3[var1_2] << 56 ^ 71499008037633920L;
                        var1_2 = var2_4;
                        if (var5_6 < 0L) {
                            if ((long)var9_3[var2_4] < 0L) {
                                return this.L();
                            }
                            var1_2 = var3_1 + 10;
                        }
                    }
                }
            }
            this.j = var1_2;
            return var5_6;
        }

        public long L() {
            long l8 = 0L;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte by = this.F();
                l8 |= (long)(by & 127) << i8;
                if ((by & 128) != 0) continue;
                return l8;
            }
            throw z.e();
        }

        public final void M() {
            int n8;
            this.h = n8 = this.h + this.i;
            int n9 = n8 - this.k;
            int n10 = this.n;
            if (n9 > n10) {
                this.i = n9 -= n10;
                this.h = n8 - n9;
                return;
            }
            this.i = 0;
        }

        public void N() {
            int n8;
            while ((n8 = this.B()) != 0 && this.E(n8)) {
            }
        }

        public void O(int n8) {
            int n9;
            int n10;
            if (n8 >= 0 && n8 <= (n9 = this.h) - (n10 = this.j)) {
                this.j = n10 + n8;
                return;
            }
            if (n8 < 0) {
                throw z.f();
            }
            throw z.k();
        }

        public final void P() {
            if (this.h - this.j >= 10) {
                this.Q();
                return;
            }
            this.R();
        }

        public final void Q() {
            for (int i8 = 0; i8 < 10; ++i8) {
                byte[] arrby = this.f;
                int n8 = this.j;
                this.j = n8 + 1;
                if (arrby[n8] < 0) continue;
                return;
            }
            throw z.e();
        }

        public final void R() {
            for (int i8 = 0; i8 < 10; ++i8) {
                if (this.F() < 0) continue;
                return;
            }
            throw z.e();
        }

        @Override
        public void a(int n8) {
            if (this.l == n8) {
                return;
            }
            throw z.a();
        }

        @Override
        public int d() {
            return this.j - this.k;
        }

        @Override
        public boolean e() {
            if (this.j == this.h) {
                return true;
            }
            return false;
        }

        @Override
        public void k(int n8) {
            this.n = n8;
            this.M();
        }

        @Override
        public int l(int n8) {
            if (n8 >= 0) {
                int n9;
                if ((n8 += this.d()) <= (n9 = this.n)) {
                    this.n = n8;
                    this.M();
                    return n9;
                }
                throw z.k();
            }
            throw z.f();
        }

        @Override
        public boolean m() {
            if (this.K() != 0L) {
                return true;
            }
            return false;
        }

        @Override
        public g n() {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n8 = this.h) - (n9 = this.j)) {
                g g8 = this.g && this.m ? g.c0(this.f, n9, n10) : g.k(this.f, n9, n10);
                this.j += n10;
                return g8;
            }
            if (n10 == 0) {
                return g.p;
            }
            return g.b0(this.G(n10));
        }

        @Override
        public double o() {
            return Double.longBitsToDouble((long)this.I());
        }

        @Override
        public int p() {
            return this.J();
        }

        @Override
        public int q() {
            return this.H();
        }

        @Override
        public long r() {
            return this.I();
        }

        @Override
        public float s() {
            return Float.intBitsToFloat((int)this.H());
        }

        @Override
        public int t() {
            return this.J();
        }

        @Override
        public long u() {
            return this.K();
        }

        @Override
        public int v() {
            return this.H();
        }

        @Override
        public long w() {
            return this.I();
        }

        @Override
        public int x() {
            return h.b(this.J());
        }

        @Override
        public long y() {
            return h.c(this.K());
        }

        @Override
        public String z() {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n8 = this.h) - (n9 = this.j)) {
                String string2 = new String(this.f, n9, n10, y.a);
                this.j += n10;
                return string2;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 < 0) {
                throw z.f();
            }
            throw z.k();
        }
    }

    public static final class c
    extends h {
        public final InputStream f;
        public final byte[] g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m = Integer.MAX_VALUE;

        public c(InputStream inputStream, int n8) {
            super(null);
            y.b((Object)inputStream, "input");
            this.f = inputStream;
            this.g = new byte[n8];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }

        public /* synthetic */ c(InputStream inputStream, int n8,  a8) {
            this(inputStream, n8);
        }

        private void P() {
            int n8;
            this.h = n8 = this.h + this.i;
            int n9 = this.l + n8;
            int n10 = this.m;
            if (n9 > n10) {
                this.i = n9 -= n10;
                this.h = n8 - n9;
                return;
            }
            this.i = 0;
        }

        private void U() {
            if (this.h - this.j >= 10) {
                this.V();
                return;
            }
            this.W();
        }

        private void V() {
            for (int i8 = 0; i8 < 10; ++i8) {
                byte[] arrby = this.g;
                int n8 = this.j;
                this.j = n8 + 1;
                if (arrby[n8] < 0) continue;
                return;
            }
            throw z.e();
        }

        private void W() {
            for (int i8 = 0; i8 < 10; ++i8) {
                if (this.G() < 0) continue;
                return;
            }
            throw z.e();
        }

        @Override
        public String A() {
            byte[] arrby;
            int n8;
            int n9;
            int n10 = this.M();
            if (n10 <= (n9 = this.h) - (n8 = this.j) && n10 > 0) {
                arrby = this.g;
                this.j = n8 + n10;
            } else {
                if (n10 == 0) {
                    return "";
                }
                n8 = 0;
                if (n10 <= n9) {
                    this.Q(n10);
                    arrby = this.g;
                    this.j = n10;
                } else {
                    arrby = this.H(n10, false);
                }
            }
            return q0.e(arrby, n8, n10);
        }

        @Override
        public int B() {
            int n8;
            if (this.e()) {
                this.k = 0;
                return 0;
            }
            this.k = n8 = this.M();
            if (r0.a(n8) != 0) {
                return this.k;
            }
            throw z.b();
        }

        @Override
        public int C() {
            return this.M();
        }

        @Override
        public long D() {
            return this.N();
        }

        @Override
        public boolean E(int n8) {
            int n9 = r0.b(n8);
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            if (n9 != 4) {
                                if (n9 == 5) {
                                    this.S(4);
                                    return true;
                                }
                                throw z.d();
                            }
                            return false;
                        }
                        this.R();
                        this.a(r0.c(r0.a(n8), 4));
                        return true;
                    }
                    this.S(this.M());
                    return true;
                }
                this.S(8);
                return true;
            }
            this.U();
            return true;
        }

        public final g F(int n8) {
            byte[] arrby = this.I(n8);
            if (arrby != null) {
                return g.i(arrby);
            }
            int n9 = this.j;
            int n10 = this.h;
            int n11 = n10 - n9;
            this.l += n10;
            this.j = 0;
            this.h = 0;
            List list = this.J(n8 - n11);
            arrby = new byte[n8];
            System.arraycopy((Object)this.g, (int)n9, (Object)arrby, (int)0, (int)n11);
            list = list.iterator();
            n8 = n11;
            while (list.hasNext()) {
                byte[] arrby2 = (byte[])list.next();
                System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n8, (int)arrby2.length);
                n8 += arrby2.length;
            }
            return g.b0(arrby);
        }

        public byte G() {
            if (this.j == this.h) {
                this.Q(1);
            }
            byte[] arrby = this.g;
            int n8 = this.j;
            this.j = n8 + 1;
            return arrby[n8];
        }

        public final byte[] H(int n8, boolean bl) {
            List list = this.I(n8);
            if (list != null) {
                List list2 = list;
                if (bl) {
                    list2 = (byte[])list.clone();
                }
                return list2;
            }
            int n9 = this.j;
            int n10 = this.h;
            int n11 = n10 - n9;
            this.l += n10;
            this.j = 0;
            this.h = 0;
            list = this.J(n8 - n11);
            byte[] arrby = new byte[n8];
            System.arraycopy((Object)this.g, (int)n9, (Object)arrby, (int)0, (int)n11);
            list = list.iterator();
            n8 = n11;
            while (list.hasNext()) {
                byte[] arrby2 = (byte[])list.next();
                System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n8, (int)arrby2.length);
                n8 += arrby2.length;
            }
            return arrby;
        }

        public final byte[] I(int n8) {
            if (n8 == 0) {
                return y.c;
            }
            if (n8 >= 0) {
                int n9 = this.l;
                int n10 = this.j;
                int n11 = n9 + n10 + n8;
                if (n11 - this.c <= 0) {
                    int n12 = this.m;
                    if (n11 <= n12) {
                        n9 = this.h - n10;
                        n10 = n8 - n9;
                        if (n10 >= 4096 && n10 > this.f.available()) {
                            return null;
                        }
                        byte[] arrby = new byte[n8];
                        System.arraycopy((Object)this.g, (int)this.j, (Object)arrby, (int)0, (int)n9);
                        this.l += this.h;
                        this.j = 0;
                        this.h = 0;
                        while (n9 < n8) {
                            n10 = this.f.read(arrby, n9, n8 - n9);
                            if (n10 != -1) {
                                this.l += n10;
                                n9 += n10;
                                continue;
                            }
                            throw z.k();
                        }
                        return arrby;
                    }
                    this.S(n12 - n9 - n10);
                    throw z.k();
                }
                throw z.j();
            }
            throw z.f();
        }

        public final List J(int n8) {
            ArrayList arrayList = new ArrayList();
            while (n8 > 0) {
                int n9;
                int n10 = Math.min((int)n8, (int)4096);
                byte[] arrby = new byte[n10];
                for (int i8 = 0; i8 < n10; i8 += n9) {
                    n9 = this.f.read(arrby, i8, n10 - i8);
                    if (n9 != -1) {
                        this.l += n9;
                        continue;
                    }
                    throw z.k();
                }
                n8 -= n10;
                arrayList.add((Object)arrby);
            }
            return arrayList;
        }

        public int K() {
            int n8;
            int n9 = n8 = this.j;
            if (this.h - n8 < 4) {
                this.Q(4);
                n9 = this.j;
            }
            byte[] arrby = this.g;
            this.j = n9 + 4;
            n8 = arrby[n9];
            byte by = arrby[n9 + 1];
            byte by2 = arrby[n9 + 2];
            return (arrby[n9 + 3] & 255) << 24 | (n8 & 255 | (by & 255) << 8 | (by2 & 255) << 16);
        }

        public long L() {
            int n8;
            int n9 = n8 = this.j;
            if (this.h - n8 < 8) {
                this.Q(8);
                n9 = this.j;
            }
            byte[] arrby = this.g;
            this.j = n9 + 8;
            long l8 = arrby[n9];
            long l9 = arrby[n9 + 1];
            long l10 = arrby[n9 + 2];
            long l11 = arrby[n9 + 3];
            long l12 = arrby[n9 + 4];
            long l13 = arrby[n9 + 5];
            long l14 = arrby[n9 + 6];
            return ((long)arrby[n9 + 7] & 255L) << 56 | (l8 & 255L | (l9 & 255L) << 8 | (l10 & 255L) << 16 | (l11 & 255L) << 24 | (l12 & 255L) << 32 | (l13 & 255L) << 40 | (l14 & 255L) << 48);
        }

        /*
         * Enabled aggressive block sorting
         */
        public int M() {
            int n8;
            int n9;
            block5 : {
                int n10;
                int n11;
                block10 : {
                    block9 : {
                        block7 : {
                            byte[] arrby;
                            block8 : {
                                block6 : {
                                    block4 : {
                                        n8 = this.h;
                                        n11 = this.j;
                                        if (n8 == n11) {
                                            return (int)this.O();
                                        }
                                        arrby = this.g;
                                        n9 = n11 + 1;
                                        n10 = arrby[n11];
                                        if (n10 >= 0) {
                                            this.j = n9;
                                            return n10;
                                        }
                                        if (n8 - n9 < 9) {
                                            return (int)this.O();
                                        }
                                        n8 = n11 + 2;
                                        if ((n10 = arrby[n9] << 7 ^ n10) >= 0) break block4;
                                        n9 = n10 ^ -128;
                                        break block5;
                                    }
                                    n9 = n11 + 3;
                                    if ((n10 = arrby[n8] << 14 ^ n10) < 0) break block6;
                                    n8 = n10 ^ 16256;
                                    break block7;
                                }
                                n8 = n11 + 4;
                                if ((n9 = n10 ^ arrby[n9] << 21) >= 0) break block8;
                                n10 = -2080896 ^ n9;
                                n9 = n8;
                                n8 = n10;
                                break block9;
                            }
                            n10 = n11 + 5;
                            int n12 = arrby[n8];
                            n8 = n9 ^ n12 << 28 ^ 266354560;
                            n9 = n10;
                            if (n12 >= 0) break block7;
                            n9 = n12 = n11 + 6;
                            if (arrby[n10] >= 0) break block9;
                            n9 = n10 = n11 + 7;
                            if (arrby[n12] >= 0) break block7;
                            n9 = n12 = n11 + 8;
                            if (arrby[n10] >= 0) break block9;
                            n9 = n10 = n11 + 9;
                            if (arrby[n12] >= 0) break block7;
                            if (arrby[n10] < 0) {
                                return (int)this.O();
                            }
                            break block10;
                        }
                        n10 = n9;
                        n9 = n8;
                        n8 = n10;
                        break block5;
                    }
                    n10 = n9;
                    n9 = n8;
                    n8 = n10;
                    break block5;
                }
                n10 = n11 + 10;
                n9 = n8;
                n8 = n10;
            }
            this.j = n8;
            return n9;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public long N() {
            block10 : {
                block14 : {
                    block13 : {
                        block12 : {
                            block11 : {
                                block9 : {
                                    var1_2 = this.h;
                                    var3_1 = this.j;
                                    if (var1_2 == var3_1) {
                                        return this.O();
                                    }
                                    var9_3 = this.g;
                                    var2_4 = var3_1 + 1;
                                    var4_5 = var9_3[var3_1];
                                    if (var4_5 >= 0) {
                                        this.j = var2_4;
                                        return var4_5;
                                    }
                                    if (var1_2 - var2_4 < 9) {
                                        return this.O();
                                    }
                                    var1_2 = var3_1 + 2;
                                    if ((var4_5 = var9_3[var2_4] << 7 ^ var4_5) >= 0) break block9;
                                    var5_6 = var4_5 ^ -128;
                                    break block10;
                                }
                                var2_4 = var3_1 + 3;
                                if ((var4_5 = var9_3[var1_2] << 14 ^ var4_5) < 0) break block11;
                                var5_6 = var4_5 ^ 16256;
                                var1_2 = var2_4;
                                break block10;
                            }
                            var1_2 = var3_1 + 4;
                            if ((var2_4 = var4_5 ^ var9_3[var2_4] << 21) >= 0) break block12;
                            var5_6 = -2080896 ^ var2_4;
                            break block10;
                        }
                        var5_6 = var2_4;
                        var2_4 = var3_1 + 5;
                        if ((var5_6 ^= (long)var9_3[var1_2] << 28) < 0L) break block13;
                        var7_7 = 266354560L;
                        var1_2 = var2_4;
                        ** GOTO lbl47
                    }
                    var1_2 = var3_1 + 6;
                    var7_7 = var5_6 ^ (long)var9_3[var2_4] << 35;
                    if (var7_7 >= 0L) break block14;
                    var5_6 = -34093383808L;
                    ** GOTO lbl53
                }
                var2_4 = var3_1 + 7;
                var5_6 = var7_7 ^ (long)var9_3[var1_2] << 42;
                if (var5_6 >= 0L) {
                    var7_7 = 4363953127296L;
                    var1_2 = var2_4;
lbl47: // 2 sources:
                    var5_6 ^= var7_7;
                } else {
                    var1_2 = var3_1 + 8;
                    var7_7 = var5_6 ^ (long)var9_3[var2_4] << 49;
                    if (var7_7 < 0L) {
                        var5_6 = -558586000294016L;
lbl53: // 2 sources:
                        var5_6 = var7_7 ^ var5_6;
                    } else {
                        var2_4 = var3_1 + 9;
                        var5_6 = var7_7 ^ (long)var9_3[var1_2] << 56 ^ 71499008037633920L;
                        var1_2 = var2_4;
                        if (var5_6 < 0L) {
                            if ((long)var9_3[var2_4] < 0L) {
                                return this.O();
                            }
                            var1_2 = var3_1 + 10;
                        }
                    }
                }
            }
            this.j = var1_2;
            return var5_6;
        }

        public long O() {
            long l8 = 0L;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte by = this.G();
                l8 |= (long)(by & 127) << i8;
                if ((by & 128) != 0) continue;
                return l8;
            }
            throw z.e();
        }

        public final void Q(int n8) {
            if (!this.X(n8)) {
                if (n8 > this.c - this.l - this.j) {
                    throw z.j();
                }
                throw z.k();
            }
        }

        public void R() {
            int n8;
            while ((n8 = this.B()) != 0 && this.E(n8)) {
            }
        }

        public void S(int n8) {
            int n9 = this.h;
            int n10 = this.j;
            if (n8 <= n9 - n10 && n8 >= 0) {
                this.j = n10 + n8;
                return;
            }
            this.T(n8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void T(int n8) {
            long l8;
            if (n8 < 0) {
                throw z.f();
            }
            int n9 = this.l;
            int n10 = this.j;
            int n11 = this.m;
            if (n9 + n10 + n8 > n11) {
                this.S(n11 - n9 - n10);
                throw z.k();
            }
            this.l = n9 + n10;
            this.h = 0;
            this.j = 0;
            for (n9 = this.h - n10; n9 < n8; n9 += (int)l8) {
                InputStream inputStream;
                try {
                    inputStream = this.f;
                }
                catch (Throwable throwable) {
                    this.l += n9;
                    this.P();
                    throw throwable;
                }
                long l9 = n8 - n9;
                l8 = inputStream.skip(l9);
                n10 = (int)(l8 LCMP 0L);
                if (n10 >= 0 && l8 <= l9) {
                    if (n10 != 0) continue;
                    break;
                }
                inputStream = new StringBuilder();
                inputStream.append((Object)this.f.getClass());
                inputStream.append("#skip returned invalid result: ");
                inputStream.append(l8);
                inputStream.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(inputStream.toString());
            }
            this.l += n9;
            this.P();
            if (n9 < n8) {
                n10 = this.h;
                n9 = n10 - this.j;
                this.j = n10;
                do {
                    this.Q(1);
                    n11 = n8 - n9;
                    n10 = this.h;
                    if (n11 <= n10) break;
                    n9 += n10;
                    this.j = n10;
                } while (true);
                this.j = n11;
            }
        }

        public final boolean X(int n8) {
            int n9 = this.j;
            int n10 = this.h;
            if (n9 + n8 > n10) {
                StringBuilder stringBuilder;
                int n11 = this.c;
                int n12 = this.l;
                if (n8 > n11 - n12 - n9) {
                    return false;
                }
                if (n12 + n9 + n8 > this.m) {
                    return false;
                }
                if (n9 > 0) {
                    if (n10 > n9) {
                        stringBuilder = this.g;
                        System.arraycopy((Object)stringBuilder, (int)n9, (Object)stringBuilder, (int)0, (int)(n10 - n9));
                    }
                    this.l += n9;
                    this.h -= n9;
                    this.j = 0;
                }
                stringBuilder = this.f;
                byte[] arrby = this.g;
                n9 = this.h;
                if ((n9 = stringBuilder.read(arrby, n9, Math.min((int)(arrby.length - n9), (int)(this.c - this.l - n9)))) != 0 && n9 >= -1 && n9 <= this.g.length) {
                    if (n9 > 0) {
                        this.h += n9;
                        this.P();
                        if (this.h >= n8) {
                            return true;
                        }
                        return this.X(n8);
                    }
                    return false;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this.f.getClass());
                stringBuilder.append("#read(byte[]) returned invalid result: ");
                stringBuilder.append(n9);
                stringBuilder.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("refillBuffer() called when ");
            stringBuilder.append(n8);
            stringBuilder.append(" bytes were already available in buffer");
            throw new IllegalStateException(stringBuilder.toString());
        }

        @Override
        public void a(int n8) {
            if (this.k == n8) {
                return;
            }
            throw z.a();
        }

        @Override
        public int d() {
            return this.l + this.j;
        }

        @Override
        public boolean e() {
            if (this.j == this.h && !this.X(1)) {
                return true;
            }
            return false;
        }

        @Override
        public void k(int n8) {
            this.m = n8;
            this.P();
        }

        @Override
        public int l(int n8) {
            if (n8 >= 0) {
                int n9 = this.m;
                if ((n8 += this.l + this.j) <= n9) {
                    this.m = n8;
                    this.P();
                    return n9;
                }
                throw z.k();
            }
            throw z.f();
        }

        @Override
        public boolean m() {
            if (this.N() != 0L) {
                return true;
            }
            return false;
        }

        @Override
        public g n() {
            int n8;
            int n9;
            int n10 = this.M();
            if (n10 <= (n8 = this.h) - (n9 = this.j) && n10 > 0) {
                g g8 = g.k(this.g, n9, n10);
                this.j += n10;
                return g8;
            }
            if (n10 == 0) {
                return g.p;
            }
            return this.F(n10);
        }

        @Override
        public double o() {
            return Double.longBitsToDouble((long)this.L());
        }

        @Override
        public int p() {
            return this.M();
        }

        @Override
        public int q() {
            return this.K();
        }

        @Override
        public long r() {
            return this.L();
        }

        @Override
        public float s() {
            return Float.intBitsToFloat((int)this.K());
        }

        @Override
        public int t() {
            return this.M();
        }

        @Override
        public long u() {
            return this.N();
        }

        @Override
        public int v() {
            return this.K();
        }

        @Override
        public long w() {
            return this.L();
        }

        @Override
        public int x() {
            return h.b(this.M());
        }

        @Override
        public long y() {
            return h.c(this.N());
        }

        @Override
        public String z() {
            int n8;
            int n9;
            int n10 = this.M();
            if (n10 > 0 && n10 <= (n8 = this.h) - (n9 = this.j)) {
                String string2 = new String(this.g, n9, n10, y.a);
                this.j += n10;
                return string2;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 <= this.h) {
                this.Q(n10);
                String string3 = new String(this.g, this.j, n10, y.a);
                this.j += n10;
                return string3;
            }
            return new String(this.H(n10, false), y.a);
        }
    }

}

