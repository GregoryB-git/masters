/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
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
import d0.q;
import g0.y;
import g0.z;
import h0.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l1.K;
import l1.M;
import l1.m;
import l1.w;

public final class o
implements m {
    public static final float[] l = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final M a;
    public final z b;
    public final boolean[] c;
    public final a d;
    public final w e;
    public b f;
    public long g;
    public String h;
    public T i;
    public boolean j;
    public long k;

    /*
     * Enabled aggressive block sorting
     */
    public o(M object) {
        this.a = object;
        this.c = new boolean[4];
        this.d = new a(128);
        this.k = -9223372036854775807L;
        if (object != null) {
            this.e = new w(178, 128);
            object = new z();
        } else {
            object = null;
            this.e = null;
        }
        this.b = object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static q f(a var0, int var1_1, String var2_2) {
        block11 : {
            block10 : {
                var0 = Arrays.copyOf((byte[])var0.e, (int)var0.c);
                var5_3 = new y(var0);
                var5_3.s(var1_1);
                var5_3.s(4);
                var5_3.q();
                var5_3.r(8);
                if (var5_3.g()) {
                    var5_3.r(4);
                    var5_3.r(3);
                }
                var1_1 = var5_3.h(4);
                var3_4 = 1.0f;
                if (var1_1 != 15) break block10;
                var1_1 = var5_3.h(8);
                var4_5 = var5_3.h(8);
                if (var4_5 == 0) ** GOTO lbl-1000
                var3_4 = (float)var1_1 / (float)var4_5;
                break block11;
            }
            var6_6 = o.l;
            if (var1_1 < var6_6.length) {
                var3_4 = var6_6[var1_1];
            } else lbl-1000: // 2 sources:
            {
                g0.o.h("H263Reader", "Invalid aspect ratio");
            }
        }
        if (var5_3.g()) {
            var5_3.r(2);
            var5_3.r(1);
            if (var5_3.g()) {
                var5_3.r(15);
                var5_3.q();
                var5_3.r(15);
                var5_3.q();
                var5_3.r(15);
                var5_3.q();
                var5_3.r(3);
                var5_3.r(11);
                var5_3.q();
                var5_3.r(15);
                var5_3.q();
            }
        }
        if (var5_3.h(2) != 0) {
            g0.o.h("H263Reader", "Unhandled video object layer shape");
        }
        var5_3.q();
        var1_1 = var5_3.h(16);
        var5_3.q();
        if (var5_3.g()) {
            if (var1_1 == 0) {
                g0.o.h("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                --var1_1;
                var4_5 = 0;
                while (var1_1 > 0) {
                    ++var4_5;
                    var1_1 >>= 1;
                }
                var5_3.r(var4_5);
            }
        }
        var5_3.q();
        var1_1 = var5_3.h(13);
        var5_3.q();
        var4_5 = var5_3.h(13);
        var5_3.q();
        var5_3.q();
        return new q.b().a0(var2_2).o0("video/mp4v-es").v0(var1_1).Y(var4_5).k0(var3_4).b0(Collections.singletonList((Object)var0)).K();
    }

    @Override
    public void a(z object) {
        g0.a.h(this.f);
        g0.a.h(this.i);
        int n8 = object.f();
        int n9 = object.g();
        byte[] arrby = object.e();
        this.g += (long)object.a();
        this.i.e((z)object, object.a());
        do {
            int n10;
            if ((n10 = d.c(arrby, n8, n9, this.c)) == n9) {
                if (!this.j) {
                    this.d.a(arrby, n8, n9);
                }
                this.f.a(arrby, n8, n9);
                object = this.e;
                if (object != null) {
                    object.a(arrby, n8, n9);
                }
                return;
            }
            Object object2 = object.e();
            int n11 = n10 + 3;
            int n12 = object2[n11] & 255;
            int n13 = n10 - n8;
            boolean bl = this.j;
            int n14 = 0;
            if (!bl) {
                int n15;
                if (n13 > 0) {
                    this.d.a(arrby, n8, n10);
                }
                if (this.d.b(n12, n15 = n13 < 0 ? - n13 : 0)) {
                    object2 = this.i;
                    a a8 = this.d;
                    object2.d(o.f(a8, a8.d, (String)g0.a.e(this.h)));
                    this.j = true;
                }
            }
            this.f.a(arrby, n8, n10);
            object2 = this.e;
            if (object2 != null) {
                if (n13 > 0) {
                    object2.a(arrby, n8, n10);
                    n8 = n14;
                } else {
                    n8 = - n13;
                }
                if (this.e.b(n8)) {
                    object2 = this.e;
                    n8 = d.r(object2.d, object2.e);
                    ((z)g0.M.i(this.b)).R(this.e.d, n8);
                    ((M)g0.M.i(this.a)).a(this.k, this.b);
                }
                if (n12 == 178 && object.e()[n10 + 2] == 1) {
                    this.e.e(n12);
                }
            }
            n8 = n9 - n10;
            long l8 = this.g;
            long l9 = n8;
            this.f.b(l8 - l9, n8, this.j);
            this.f.c(n12, this.k);
            n8 = n11;
        } while (true);
    }

    @Override
    public void b() {
        d.a(this.c);
        this.d.c();
        Object object = this.f;
        if (object != null) {
            object.d();
        }
        if ((object = this.e) != null) {
            object.d();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override
    public void c(boolean bl) {
        g0.a.h(this.f);
        if (bl) {
            this.f.b(this.g, 0, this.j);
            this.f.d();
        }
    }

    @Override
    public void d(long l8, int n8) {
        this.k = l8;
    }

    @Override
    public void e(t t8, K.d d8) {
        d8.a();
        this.h = d8.b();
        Object object = t8.a(d8.c(), 2);
        this.i = object;
        this.f = new b((T)object);
        object = this.a;
        if (object != null) {
            object.b(t8, d8);
        }
    }

    public static final class a {
        public static final byte[] f = new byte[]{0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int n8) {
            this.e = new byte[n8];
        }

        public void a(byte[] arrby, int n8, int n9) {
            if (!this.a) {
                return;
            }
            byte[] arrby2 = this.e;
            int n10 = arrby2.length;
            int n11 = this.c;
            if (n10 < n11 + (n9 -= n8)) {
                this.e = Arrays.copyOf((byte[])arrby2, (int)((n11 + n9) * 2));
            }
            System.arraycopy((Object)arrby, (int)n8, (Object)this.e, (int)this.c, (int)n9);
            this.c += n9;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean b(int var1_1, int var2_2) {
            block8 : {
                block4 : {
                    block5 : {
                        block6 : {
                            block7 : {
                                var4_3 = this.b;
                                if (var4_3 == 0) break block4;
                                var3_4 = 2;
                                if (var4_3 == 1) break block5;
                                if (var4_3 == 2) break block6;
                                var3_4 = 4;
                                if (var4_3 == 3) break block7;
                                if (var4_3 != 4) throw new IllegalStateException();
                                if (var1_1 == 179 || var1_1 == 181) {
                                    this.c -= var2_2;
                                    this.a = false;
                                    return true;
                                }
                                break block8;
                            }
                            if ((var1_1 & 240) != 32) ** GOTO lbl-1000
                            this.d = this.c;
                            var2_2 = var3_4;
                            ** GOTO lbl-1000
                        }
                        if (var1_1 > 31) ** GOTO lbl-1000
                        this.b = 3;
                        break block8;
                    }
                    var2_2 = var3_4;
                    if (var1_1 != 181) lbl-1000: // 3 sources:
                    {
                        g0.o.h("H263Reader", "Unexpected start code value");
                        this.c();
                    } else lbl-1000: // 2 sources:
                    {
                        this.b = var2_2;
                    }
                    break block8;
                }
                if (var1_1 == 176) {
                    this.b = 1;
                    this.a = true;
                }
            }
            var5_5 = a.f;
            this.a(var5_5, 0, var5_5.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    public static final class b {
        public final T a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(T t8) {
            this.a = t8;
        }

        public void a(byte[] arrby, int n8, int n9) {
            if (this.c) {
                int n10 = this.f;
                int n11 = n8 + 1 - n10;
                if (n11 < n9) {
                    boolean bl = (arrby[n11] & 192) >> 6 == 0;
                    this.d = bl;
                    this.c = false;
                    return;
                }
                this.f = n10 + (n9 - n8);
            }
        }

        public void b(long l8, int n8, boolean bl) {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public void c(int n8, long l8) {
            this.e = n8;
            this.d = false;
            boolean bl = true;
            boolean bl2 = n8 == 182 || n8 == 179;
            this.b = bl2;
            bl2 = n8 == 182 ? bl : false;
            this.c = bl2;
            this.f = 0;
            this.h = l8;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

}

