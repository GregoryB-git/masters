/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package l1;

import F0.T;
import F0.t;
import android.util.Pair;
import d0.q;
import g0.z;
import h0.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l1.K;
import l1.M;
import l1.m;
import l1.w;

public final class n
implements m {
    public static final double[] q = new double[]{23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0};
    public String a;
    public T b;
    public final M c;
    public final z d;
    public final w e;
    public final boolean[] f;
    public final a g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public n() {
        this(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public n(M object) {
        this.c = object;
        this.f = new boolean[4];
        this.g = new a(128);
        if (object != null) {
            this.e = new w(178, 128);
            object = new z();
        } else {
            object = null;
            this.e = null;
        }
        this.d = object;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Pair f(a a8, String object) {
        int n8;
        double[] arrd;
        int n9;
        float f8;
        int n10;
        byte[] arrby;
        long l8;
        block5 : {
            block6 : {
                block2 : {
                    block3 : {
                        block4 : {
                            arrby = Arrays.copyOf((byte[])a8.d, (int)a8.b);
                            n9 = arrby[4];
                            n8 = arrby[5];
                            n10 = arrby[6];
                            n9 = (n9 & 255) << 4 | (n8 & 255) >> 4;
                            n10 = (n8 & 15) << 8 | n10 & 255;
                            n8 = (arrby[7] & 240) >> 4;
                            if (n8 == 2) break block2;
                            if (n8 == 3) break block3;
                            if (n8 == 4) break block4;
                            f8 = 1.0f;
                            break block5;
                        }
                        f8 = n10 * 121;
                        n8 = n9 * 100;
                        break block6;
                    }
                    f8 = n10 * 16;
                    n8 = n9 * 9;
                    break block6;
                }
                f8 = n10 * 4;
                n8 = n9 * 3;
            }
            f8 /= (float)n8;
        }
        object = new q.b().a0((String)object).o0("video/mpeg2").v0(n9).Y(n10).k0(f8).b0(Collections.singletonList((Object)arrby)).K();
        n8 = (arrby[7] & 15) - 1;
        if (n8 >= 0 && n8 < (arrd = q).length) {
            double d8 = arrd[n8];
            n9 = arrby[a8.c + 9];
            n8 = (n9 & 96) >> 5;
            double d9 = d8;
            if (n8 != (n9 &= 31)) {
                d9 = d8 * (((double)n8 + 1.0) / (double)(n9 + 1));
            }
            l8 = (long)(1000000.0 / d9);
            return Pair.create((Object)object, (Object)l8);
        }
        l8 = 0L;
        return Pair.create((Object)object, (Object)l8);
    }

    @Override
    public void a(z z8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void b() {
        d.a(this.f);
        this.g.c();
        w w8 = this.e;
        if (w8 != null) {
            w8.d();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    @Override
    public void c(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public void d(long l8, int n8) {
        this.l = l8;
    }

    @Override
    public void e(t t8, K.d d8) {
        d8.a();
        this.a = d8.b();
        this.b = t8.a(d8.c(), 2);
        M m8 = this.c;
        if (m8 != null) {
            m8.b(t8, d8);
        }
    }

    public static final class a {
        public static final byte[] e = new byte[]{0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int n8) {
            this.d = new byte[n8];
        }

        public void a(byte[] arrby, int n8, int n9) {
            if (!this.a) {
                return;
            }
            byte[] arrby2 = this.d;
            int n10 = arrby2.length;
            int n11 = this.b;
            if (n10 < n11 + (n9 -= n8)) {
                this.d = Arrays.copyOf((byte[])arrby2, (int)((n11 + n9) * 2));
            }
            System.arraycopy((Object)arrby, (int)n8, (Object)this.d, (int)this.b, (int)n9);
            this.b += n9;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean b(int var1_1, int var2_2) {
            if (!this.a) ** GOTO lbl8
            this.b = var2_2 = this.b - var2_2;
            if (this.c == 0 && var1_1 == 181) {
                this.c = var2_2;
            } else {
                this.a = false;
                return true;
lbl8: // 1 sources:
                if (var1_1 == 179) {
                    this.a = true;
                }
            }
            var3_3 = a.e;
            this.a(var3_3, 0, var3_3.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

}

