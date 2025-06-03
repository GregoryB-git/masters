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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class i {
    public static volatile int f = 100;
    public int a;
    public int b = f;
    public int c = Integer.MAX_VALUE;
    public j d;
    public boolean e = false;

    public i() {
    }

    public /* synthetic */ i( a8) {
        this();
    }

    public static int b(int n8) {
        return - (n8 & 1) ^ n8 >>> 1;
    }

    public static long c(long l8) {
        return - (l8 & 1L) ^ l8 >>> 1;
    }

    public static i f(InputStream inputStream) {
        return i.g(inputStream, 4096);
    }

    public static i g(InputStream inputStream, int n8) {
        if (n8 > 0) {
            if (inputStream == null) {
                return i.h(z.d);
            }
            return new c(inputStream, n8, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i h(byte[] arrby) {
        return i.i(arrby, 0, arrby.length);
    }

    public static i i(byte[] arrby, int n8, int n9) {
        return i.j(arrby, n8, n9, false);
    }

    public static i j(byte[] object, int n8, int n9, boolean bl) {
        object = new b((byte[])object, n8, n9, bl, null);
        try {
            object.l(n9);
            return object;
        }
        catch (A a8) {
            throw new IllegalArgumentException((Throwable)a8);
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

    public abstract h n();

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
    extends i {
        public final byte[] g;
        public final boolean h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public boolean n;
        public int o = Integer.MAX_VALUE;

        public b(byte[] arrby, int n8, int n9, boolean bl) {
            super(null);
            this.g = arrby;
            this.i = n9 + n8;
            this.k = n8;
            this.l = n8;
            this.h = bl;
        }

        public /* synthetic */ b(byte[] arrby, int n8, int n9, boolean bl,  a8) {
            this(arrby, n8, n9, bl);
        }

        @Override
        public String A() {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n8 = this.i) - (n9 = this.k)) {
                String string2 = p0.e(this.g, n9, n10);
                this.k += n10;
                return string2;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 <= 0) {
                throw A.g();
            }
            throw A.m();
        }

        @Override
        public int B() {
            int n8;
            if (this.e()) {
                this.m = 0;
                return 0;
            }
            this.m = n8 = this.J();
            if (q0.a(n8) != 0) {
                return this.m;
            }
            throw A.c();
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
            int n9 = q0.b(n8);
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            if (n9 != 4) {
                                if (n9 == 5) {
                                    this.O(4);
                                    return true;
                                }
                                throw A.e();
                            }
                            return false;
                        }
                        this.N();
                        this.a(q0.c(q0.a(n8), 4));
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
            int n8 = this.k;
            if (n8 != this.i) {
                byte[] arrby = this.g;
                this.k = n8 + 1;
                return arrby[n8];
            }
            throw A.m();
        }

        public byte[] G(int n8) {
            int n9;
            int n10;
            if (n8 > 0 && n8 <= (n10 = this.i) - (n9 = this.k)) {
                this.k = n8 += n9;
                return Arrays.copyOfRange((byte[])this.g, (int)n9, (int)n8);
            }
            if (n8 <= 0) {
                if (n8 == 0) {
                    return z.d;
                }
                throw A.g();
            }
            throw A.m();
        }

        public int H() {
            int n8 = this.k;
            if (this.i - n8 >= 4) {
                byte[] arrby = this.g;
                this.k = n8 + 4;
                byte by = arrby[n8];
                byte by2 = arrby[n8 + 1];
                byte by3 = arrby[n8 + 2];
                return (arrby[n8 + 3] & 255) << 24 | (by & 255 | (by2 & 255) << 8 | (by3 & 255) << 16);
            }
            throw A.m();
        }

        public long I() {
            int n8 = this.k;
            if (this.i - n8 >= 8) {
                byte[] arrby = this.g;
                this.k = n8 + 8;
                long l8 = arrby[n8];
                long l9 = arrby[n8 + 1];
                long l10 = arrby[n8 + 2];
                long l11 = arrby[n8 + 3];
                long l12 = arrby[n8 + 4];
                long l13 = arrby[n8 + 5];
                long l14 = arrby[n8 + 6];
                return ((long)arrby[n8 + 7] & 255L) << 56 | (l8 & 255L | (l9 & 255L) << 8 | (l10 & 255L) << 16 | (l11 & 255L) << 24 | (l12 & 255L) << 32 | (l13 & 255L) << 40 | (l14 & 255L) << 48);
            }
            throw A.m();
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
                                        n8 = this.i;
                                        n11 = this.k;
                                        if (n8 == n11) {
                                            return (int)this.L();
                                        }
                                        arrby = this.g;
                                        n9 = n11 + 1;
                                        n10 = arrby[n11];
                                        if (n10 >= 0) {
                                            this.k = n9;
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
            this.k = n8;
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
                                    var1_2 = this.i;
                                    var3_1 = this.k;
                                    if (var1_2 == var3_1) {
                                        return this.L();
                                    }
                                    var9_3 = this.g;
                                    var2_4 = var3_1 + 1;
                                    var4_5 = var9_3[var3_1];
                                    if (var4_5 >= 0) {
                                        this.k = var2_4;
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
            this.k = var1_2;
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
            throw A.f();
        }

        public final void M() {
            int n8;
            this.i = n8 = this.i + this.j;
            int n9 = n8 - this.l;
            int n10 = this.o;
            if (n9 > n10) {
                this.j = n9 -= n10;
                this.i = n8 - n9;
                return;
            }
            this.j = 0;
        }

        public void N() {
            int n8;
            while ((n8 = this.B()) != 0 && this.E(n8)) {
            }
        }

        public void O(int n8) {
            int n9;
            int n10;
            if (n8 >= 0 && n8 <= (n9 = this.i) - (n10 = this.k)) {
                this.k = n10 + n8;
                return;
            }
            if (n8 < 0) {
                throw A.g();
            }
            throw A.m();
        }

        public final void P() {
            if (this.i - this.k >= 10) {
                this.Q();
                return;
            }
            this.R();
        }

        public final void Q() {
            for (int i8 = 0; i8 < 10; ++i8) {
                byte[] arrby = this.g;
                int n8 = this.k;
                this.k = n8 + 1;
                if (arrby[n8] < 0) continue;
                return;
            }
            throw A.f();
        }

        public final void R() {
            for (int i8 = 0; i8 < 10; ++i8) {
                if (this.F() < 0) continue;
                return;
            }
            throw A.f();
        }

        @Override
        public void a(int n8) {
            if (this.m == n8) {
                return;
            }
            throw A.b();
        }

        @Override
        public int d() {
            return this.k - this.l;
        }

        @Override
        public boolean e() {
            if (this.k == this.i) {
                return true;
            }
            return false;
        }

        @Override
        public void k(int n8) {
            this.o = n8;
            this.M();
        }

        @Override
        public int l(int n8) {
            if (n8 >= 0) {
                if ((n8 += this.d()) >= 0) {
                    int n9 = this.o;
                    if (n8 <= n9) {
                        this.o = n8;
                        this.M();
                        return n9;
                    }
                    throw A.m();
                }
                throw A.h();
            }
            throw A.g();
        }

        @Override
        public boolean m() {
            if (this.K() != 0L) {
                return true;
            }
            return false;
        }

        @Override
        public h n() {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n8 = this.i) - (n9 = this.k)) {
                h h8 = this.h && this.n ? h.f0(this.g, n9, n10) : h.k(this.g, n9, n10);
                this.k += n10;
                return h8;
            }
            if (n10 == 0) {
                return h.p;
            }
            return h.e0(this.G(n10));
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
            return i.b(this.J());
        }

        @Override
        public long y() {
            return i.c(this.K());
        }

        @Override
        public String z() {
            int n8;
            int n9;
            int n10 = this.J();
            if (n10 > 0 && n10 <= (n8 = this.i) - (n9 = this.k)) {
                String string2 = new String(this.g, n9, n10, z.b);
                this.k += n10;
                return string2;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 < 0) {
                throw A.g();
            }
            throw A.m();
        }
    }

    public static final class c
    extends i {
        public final InputStream g;
        public final byte[] h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n = Integer.MAX_VALUE;

        public c(InputStream inputStream, int n8) {
            super(null);
            z.b((Object)inputStream, "input");
            this.g = inputStream;
            this.h = new byte[n8];
            this.i = 0;
            this.k = 0;
            this.m = 0;
        }

        public /* synthetic */ c(InputStream inputStream, int n8,  a8) {
            this(inputStream, n8);
        }

        public static int F(InputStream inputStream) {
            try {
                int n8 = inputStream.available();
                return n8;
            }
            catch (A a8) {
                a8.j();
                throw a8;
            }
        }

        public static int G(InputStream inputStream, byte[] arrby, int n8, int n9) {
            try {
                n8 = inputStream.read(arrby, n8, n9);
                return n8;
            }
            catch (A a8) {
                a8.j();
                throw a8;
            }
        }

        private void R() {
            int n8;
            this.i = n8 = this.i + this.j;
            int n9 = this.m + n8;
            int n10 = this.n;
            if (n9 > n10) {
                this.j = n9 -= n10;
                this.i = n8 - n9;
                return;
            }
            this.j = 0;
        }

        public static long T(InputStream inputStream, long l8) {
            try {
                l8 = inputStream.skip(l8);
                return l8;
            }
            catch (A a8) {
                a8.j();
                throw a8;
            }
        }

        private void X() {
            if (this.i - this.k >= 10) {
                this.Y();
                return;
            }
            this.Z();
        }

        private void Y() {
            for (int i8 = 0; i8 < 10; ++i8) {
                byte[] arrby = this.h;
                int n8 = this.k;
                this.k = n8 + 1;
                if (arrby[n8] < 0) continue;
                return;
            }
            throw A.f();
        }

        private void Z() {
            for (int i8 = 0; i8 < 10; ++i8) {
                if (this.I() < 0) continue;
                return;
            }
            throw A.f();
        }

        @Override
        public String A() {
            byte[] arrby;
            int n8;
            int n9;
            int n10 = this.O();
            if (n10 <= (n9 = this.i) - (n8 = this.k) && n10 > 0) {
                arrby = this.h;
                this.k = n8 + n10;
            } else {
                if (n10 == 0) {
                    return "";
                }
                n8 = 0;
                if (n10 <= n9) {
                    this.S(n10);
                    arrby = this.h;
                    this.k = n10;
                } else {
                    arrby = this.J(n10, false);
                }
            }
            return p0.e(arrby, n8, n10);
        }

        @Override
        public int B() {
            int n8;
            if (this.e()) {
                this.l = 0;
                return 0;
            }
            this.l = n8 = this.O();
            if (q0.a(n8) != 0) {
                return this.l;
            }
            throw A.c();
        }

        @Override
        public int C() {
            return this.O();
        }

        @Override
        public long D() {
            return this.P();
        }

        @Override
        public boolean E(int n8) {
            int n9 = q0.b(n8);
            if (n9 != 0) {
                if (n9 != 1) {
                    if (n9 != 2) {
                        if (n9 != 3) {
                            if (n9 != 4) {
                                if (n9 == 5) {
                                    this.V(4);
                                    return true;
                                }
                                throw A.e();
                            }
                            return false;
                        }
                        this.U();
                        this.a(q0.c(q0.a(n8), 4));
                        return true;
                    }
                    this.V(this.O());
                    return true;
                }
                this.V(8);
                return true;
            }
            this.X();
            return true;
        }

        public final h H(int n8) {
            byte[] arrby = this.K(n8);
            if (arrby != null) {
                return h.i(arrby);
            }
            int n9 = this.k;
            int n10 = this.i;
            int n11 = n10 - n9;
            this.m += n10;
            this.k = 0;
            this.i = 0;
            List list = this.L(n8 - n11);
            arrby = new byte[n8];
            System.arraycopy((Object)this.h, (int)n9, (Object)arrby, (int)0, (int)n11);
            list = list.iterator();
            n8 = n11;
            while (list.hasNext()) {
                byte[] arrby2 = (byte[])list.next();
                System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n8, (int)arrby2.length);
                n8 += arrby2.length;
            }
            return h.e0(arrby);
        }

        public byte I() {
            if (this.k == this.i) {
                this.S(1);
            }
            byte[] arrby = this.h;
            int n8 = this.k;
            this.k = n8 + 1;
            return arrby[n8];
        }

        public final byte[] J(int n8, boolean bl) {
            List list = this.K(n8);
            if (list != null) {
                List list2 = list;
                if (bl) {
                    list2 = (byte[])list.clone();
                }
                return list2;
            }
            int n9 = this.k;
            int n10 = this.i;
            int n11 = n10 - n9;
            this.m += n10;
            this.k = 0;
            this.i = 0;
            list = this.L(n8 - n11);
            byte[] arrby = new byte[n8];
            System.arraycopy((Object)this.h, (int)n9, (Object)arrby, (int)0, (int)n11);
            list = list.iterator();
            n8 = n11;
            while (list.hasNext()) {
                byte[] arrby2 = (byte[])list.next();
                System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n8, (int)arrby2.length);
                n8 += arrby2.length;
            }
            return arrby;
        }

        public final byte[] K(int n8) {
            if (n8 == 0) {
                return z.d;
            }
            if (n8 >= 0) {
                int n9 = this.m;
                int n10 = this.k;
                int n11 = n9 + n10 + n8;
                if (n11 - this.c <= 0) {
                    int n12 = this.n;
                    if (n11 <= n12) {
                        n9 = this.i - n10;
                        n10 = n8 - n9;
                        if (n10 >= 4096 && n10 > c.F(this.g)) {
                            return null;
                        }
                        byte[] arrby = new byte[n8];
                        System.arraycopy((Object)this.h, (int)this.k, (Object)arrby, (int)0, (int)n9);
                        this.m += this.i;
                        this.k = 0;
                        this.i = 0;
                        while (n9 < n8) {
                            n10 = c.G(this.g, arrby, n9, n8 - n9);
                            if (n10 != -1) {
                                this.m += n10;
                                n9 += n10;
                                continue;
                            }
                            throw A.m();
                        }
                        return arrby;
                    }
                    this.V(n12 - n9 - n10);
                    throw A.m();
                }
                throw A.l();
            }
            throw A.g();
        }

        public final List L(int n8) {
            ArrayList arrayList = new ArrayList();
            while (n8 > 0) {
                int n9;
                int n10 = Math.min((int)n8, (int)4096);
                byte[] arrby = new byte[n10];
                for (int i8 = 0; i8 < n10; i8 += n9) {
                    n9 = this.g.read(arrby, i8, n10 - i8);
                    if (n9 != -1) {
                        this.m += n9;
                        continue;
                    }
                    throw A.m();
                }
                n8 -= n10;
                arrayList.add((Object)arrby);
            }
            return arrayList;
        }

        public int M() {
            int n8;
            int n9 = n8 = this.k;
            if (this.i - n8 < 4) {
                this.S(4);
                n9 = this.k;
            }
            byte[] arrby = this.h;
            this.k = n9 + 4;
            n8 = arrby[n9];
            byte by = arrby[n9 + 1];
            byte by2 = arrby[n9 + 2];
            return (arrby[n9 + 3] & 255) << 24 | (n8 & 255 | (by & 255) << 8 | (by2 & 255) << 16);
        }

        public long N() {
            int n8;
            int n9 = n8 = this.k;
            if (this.i - n8 < 8) {
                this.S(8);
                n9 = this.k;
            }
            byte[] arrby = this.h;
            this.k = n9 + 8;
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
        public int O() {
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
                                        n8 = this.i;
                                        n11 = this.k;
                                        if (n8 == n11) {
                                            return (int)this.Q();
                                        }
                                        arrby = this.h;
                                        n9 = n11 + 1;
                                        n10 = arrby[n11];
                                        if (n10 >= 0) {
                                            this.k = n9;
                                            return n10;
                                        }
                                        if (n8 - n9 < 9) {
                                            return (int)this.Q();
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
                                return (int)this.Q();
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
            this.k = n8;
            return n9;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public long P() {
            block10 : {
                block14 : {
                    block13 : {
                        block12 : {
                            block11 : {
                                block9 : {
                                    var1_2 = this.i;
                                    var3_1 = this.k;
                                    if (var1_2 == var3_1) {
                                        return this.Q();
                                    }
                                    var9_3 = this.h;
                                    var2_4 = var3_1 + 1;
                                    var4_5 = var9_3[var3_1];
                                    if (var4_5 >= 0) {
                                        this.k = var2_4;
                                        return var4_5;
                                    }
                                    if (var1_2 - var2_4 < 9) {
                                        return this.Q();
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
                                return this.Q();
                            }
                            var1_2 = var3_1 + 10;
                        }
                    }
                }
            }
            this.k = var1_2;
            return var5_6;
        }

        public long Q() {
            long l8 = 0L;
            for (int i8 = 0; i8 < 64; i8 += 7) {
                byte by = this.I();
                l8 |= (long)(by & 127) << i8;
                if ((by & 128) != 0) continue;
                return l8;
            }
            throw A.f();
        }

        public final void S(int n8) {
            if (!this.a0(n8)) {
                if (n8 > this.c - this.m - this.k) {
                    throw A.l();
                }
                throw A.m();
            }
        }

        public void U() {
            int n8;
            while ((n8 = this.B()) != 0 && this.E(n8)) {
            }
        }

        public void V(int n8) {
            int n9 = this.i;
            int n10 = this.k;
            if (n8 <= n9 - n10 && n8 >= 0) {
                this.k = n10 + n8;
                return;
            }
            this.W(n8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void W(int n8) {
            long l8;
            if (n8 < 0) {
                throw A.g();
            }
            int n9 = this.m;
            int n10 = this.k;
            int n11 = this.n;
            if (n9 + n10 + n8 > n11) {
                this.V(n11 - n9 - n10);
                throw A.m();
            }
            this.m = n9 + n10;
            this.i = 0;
            this.k = 0;
            for (n9 = this.i - n10; n9 < n8; n9 += (int)l8) {
                InputStream inputStream;
                try {
                    inputStream = this.g;
                }
                catch (Throwable throwable) {
                    this.m += n9;
                    this.R();
                    throw throwable;
                }
                long l9 = n8 - n9;
                l8 = c.T(inputStream, l9);
                n10 = (int)(l8 LCMP 0L);
                if (n10 >= 0 && l8 <= l9) {
                    if (n10 != 0) continue;
                    break;
                }
                inputStream = new StringBuilder();
                inputStream.append((Object)this.g.getClass());
                inputStream.append("#skip returned invalid result: ");
                inputStream.append(l8);
                inputStream.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(inputStream.toString());
            }
            this.m += n9;
            this.R();
            if (n9 < n8) {
                n10 = this.i;
                n9 = n10 - this.k;
                this.k = n10;
                do {
                    this.S(1);
                    n11 = n8 - n9;
                    n10 = this.i;
                    if (n11 <= n10) break;
                    n9 += n10;
                    this.k = n10;
                } while (true);
                this.k = n11;
            }
        }

        @Override
        public void a(int n8) {
            if (this.l == n8) {
                return;
            }
            throw A.b();
        }

        public final boolean a0(int n8) {
            int n9 = this.k;
            int n10 = this.i;
            if (n9 + n8 > n10) {
                StringBuilder stringBuilder;
                int n11 = this.c;
                int n12 = this.m;
                if (n8 > n11 - n12 - n9) {
                    return false;
                }
                if (n12 + n9 + n8 > this.n) {
                    return false;
                }
                if (n9 > 0) {
                    if (n10 > n9) {
                        stringBuilder = this.h;
                        System.arraycopy((Object)stringBuilder, (int)n9, (Object)stringBuilder, (int)0, (int)(n10 - n9));
                    }
                    this.m += n9;
                    this.i -= n9;
                    this.k = 0;
                }
                stringBuilder = this.g;
                byte[] arrby = this.h;
                n9 = this.i;
                if ((n9 = c.G((InputStream)stringBuilder, arrby, n9, Math.min((int)(arrby.length - n9), (int)(this.c - this.m - n9)))) != 0 && n9 >= -1 && n9 <= this.h.length) {
                    if (n9 > 0) {
                        this.i += n9;
                        this.R();
                        if (this.i >= n8) {
                            return true;
                        }
                        return this.a0(n8);
                    }
                    return false;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append((Object)this.g.getClass());
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
        public int d() {
            return this.m + this.k;
        }

        @Override
        public boolean e() {
            if (this.k == this.i && !this.a0(1)) {
                return true;
            }
            return false;
        }

        @Override
        public void k(int n8) {
            this.n = n8;
            this.R();
        }

        @Override
        public int l(int n8) {
            if (n8 >= 0) {
                int n9 = this.n;
                if ((n8 += this.m + this.k) <= n9) {
                    this.n = n8;
                    this.R();
                    return n9;
                }
                throw A.m();
            }
            throw A.g();
        }

        @Override
        public boolean m() {
            if (this.P() != 0L) {
                return true;
            }
            return false;
        }

        @Override
        public h n() {
            int n8;
            int n9;
            int n10 = this.O();
            if (n10 <= (n8 = this.i) - (n9 = this.k) && n10 > 0) {
                h h8 = h.k(this.h, n9, n10);
                this.k += n10;
                return h8;
            }
            if (n10 == 0) {
                return h.p;
            }
            return this.H(n10);
        }

        @Override
        public double o() {
            return Double.longBitsToDouble((long)this.N());
        }

        @Override
        public int p() {
            return this.O();
        }

        @Override
        public int q() {
            return this.M();
        }

        @Override
        public long r() {
            return this.N();
        }

        @Override
        public float s() {
            return Float.intBitsToFloat((int)this.M());
        }

        @Override
        public int t() {
            return this.O();
        }

        @Override
        public long u() {
            return this.P();
        }

        @Override
        public int v() {
            return this.M();
        }

        @Override
        public long w() {
            return this.N();
        }

        @Override
        public int x() {
            return i.b(this.O());
        }

        @Override
        public long y() {
            return i.c(this.P());
        }

        @Override
        public String z() {
            int n8;
            int n9;
            int n10 = this.O();
            if (n10 > 0 && n10 <= (n8 = this.i) - (n9 = this.k)) {
                String string2 = new String(this.h, n9, n10, z.b);
                this.k += n10;
                return string2;
            }
            if (n10 == 0) {
                return "";
            }
            if (n10 <= this.i) {
                this.S(n10);
                String string3 = new String(this.h, this.k, n10, z.b);
                this.k += n10;
                return string3;
            }
            return new String(this.J(n10, false), z.b);
        }
    }

}

