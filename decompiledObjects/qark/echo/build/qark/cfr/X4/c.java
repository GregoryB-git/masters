/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package X4;

import X4.a;
import Y4.b;

public abstract class c {
    public static final int[] a = new int[]{4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(Y4.a a8, int n8, int n9) {
        int[] arrn = new int[n9];
        int n10 = a8.l() / n8;
        for (n9 = 0; n9 < n10; ++n9) {
            int n11;
            int n12 = n11 = 0;
            while (n11 < n8) {
                int n13 = a8.j(n9 * n8 + n11) ? 1 << n8 - n11 - 1 : 0;
                n12 |= n13;
                ++n11;
            }
            arrn[n9] = n12;
        }
        return arrn;
    }

    public static void b(b b8, int n8, int n9) {
        int n10;
        int n11;
        for (n11 = 0; n11 < n9; n11 += 2) {
            int n12;
            for (n10 = n13 = n8 - n11; n10 <= (n12 = n8 + n11); ++n10) {
                int n13;
                b8.l(n10, n13);
                b8.l(n10, n12);
                b8.l(n13, n10);
                b8.l(n12, n10);
            }
        }
        n11 = n8 - n9;
        b8.l(n11, n11);
        n10 = n11 + 1;
        b8.l(n10, n11);
        b8.l(n11, n10);
        b8.l(n8 += n9, n11);
        b8.l(n8, n10);
        b8.l(n8, n8 - 1);
    }

    public static void c(b b8, boolean bl, int n8, Y4.a a8) {
        int n9 = n8 / 2;
        int n10 = 0;
        if (bl) {
            for (n8 = n10; n8 < 7; ++n8) {
                n10 = n9 - 3 + n8;
                if (a8.j(n8)) {
                    b8.l(n10, n9 - 5);
                }
                if (a8.j(n8 + 7)) {
                    b8.l(n9 + 5, n10);
                }
                if (a8.j(20 - n8)) {
                    b8.l(n10, n9 + 5);
                }
                if (!a8.j(27 - n8)) continue;
                b8.l(n9 - 5, n10);
            }
            return;
        }
        for (n8 = 0; n8 < 10; ++n8) {
            n10 = n9 - 5 + n8 + n8 / 5;
            if (a8.j(n8)) {
                b8.l(n10, n9 - 7);
            }
            if (a8.j(n8 + 10)) {
                b8.l(n9 + 7, n10);
            }
            if (a8.j(29 - n8)) {
                b8.l(n10, n9 + 7);
            }
            if (!a8.j(39 - n8)) continue;
            b8.l(n9 - 7, n10);
        }
    }

    public static a d(byte[] arrby, int n8, int n9) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static Y4.a e(Y4.a arrn, int n8, int n9) {
        int n10 = arrn.l() / n9;
        Object object = new Z4.c(c.g(n9));
        int n11 = n8 / n9;
        arrn = c.a((Y4.a)arrn, n9, n11);
        object.b(arrn, n11 - n10);
        object = new Y4.a();
        n10 = 0;
        object.d(0, n8 % n9);
        n11 = arrn.length;
        for (n8 = n10; n8 < n11; ++n8) {
            object.d(arrn[n8], n9);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Y4.a f(boolean bl, int n8, int n9) {
        Y4.a a8 = new Y4.a();
        --n8;
        if (bl) {
            a8.d(n8, 2);
            a8.d(n9 - 1, 6);
            n8 = 28;
            do {
                return c.e(a8, n8, 4);
                break;
            } while (true);
        }
        a8.d(n8, 5);
        a8.d(n9 - 1, 11);
        n8 = 40;
        return c.e(a8, n8, 4);
    }

    public static Z4.a g(int n8) {
        if (n8 != 4) {
            if (n8 != 6) {
                if (n8 != 8) {
                    if (n8 != 10) {
                        if (n8 == 12) {
                            return Z4.a.h;
                        }
                        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf((int)n8)));
                    }
                    return Z4.a.i;
                }
                return Z4.a.n;
            }
            return Z4.a.j;
        }
        return Z4.a.k;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Y4.a h(Y4.a var0, int var1_1) {
        var9_2 = new Y4.a();
        var6_3 = var0.l();
        var7_4 = (1 << var1_1) - 2;
        var2_5 = 0;
        while (var2_5 < var6_3) {
            block9 : {
                var3_6 = var4_7 = 0;
                while (var4_7 < var1_1) {
                    block8 : {
                        block7 : {
                            var8_9 = var2_5 + var4_7;
                            if (var8_9 >= var6_3) break block7;
                            var5_8 = var3_6;
                            if (!var0.j(var8_9)) break block8;
                        }
                        var5_8 = var3_6 | 1 << var1_1 - 1 - var4_7;
                    }
                    ++var4_7;
                    var3_6 = var5_8;
                }
                var4_7 = var3_6 & var7_4;
                if (var4_7 != var7_4) break block9;
                var3_6 = var4_7;
                ** GOTO lbl25
            }
            if (var4_7 == 0) {
                var3_6 |= 1;
lbl25: // 2 sources:
                var9_2.d(var3_6, var1_1);
                --var2_5;
            } else {
                var9_2.d(var3_6, var1_1);
            }
            var2_5 += var1_1;
        }
        return var9_2;
    }

    public static int i(int n8, boolean bl) {
        int n9 = bl ? 88 : 112;
        return (n9 + (n8 << 4)) * n8;
    }
}

