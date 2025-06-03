/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.util.Arrays
 */
package h0;

import d0.h;
import g0.o;
import h0.e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class d {
    public static final byte[] a = new byte[]{0, 0, 0, 1};
    public static final float[] b = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] arrbl) {
        arrbl[0] = false;
        arrbl[1] = false;
        arrbl[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int n8;
        int n9;
        int n10 = byteBuffer.position();
        int n11 = n9 = 0;
        while ((n8 = n9 + 1) < n10) {
            int n12;
            int n13 = byteBuffer.get(n9) & 255;
            if (n11 == 3) {
                n12 = n11;
                if (n13 == 1) {
                    n12 = n11;
                    if ((byteBuffer.get(n8) & 31) == 7) {
                        ByteBuffer byteBuffer2 = byteBuffer.duplicate();
                        byteBuffer2.position(n9 - 3);
                        byteBuffer2.limit(n10);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBuffer2);
                        return;
                    }
                }
            } else {
                n12 = n11;
                if (n13 == 0) {
                    n12 = n11 + 1;
                }
            }
            n11 = n12;
            if (n13 != 0) {
                n11 = 0;
            }
            n9 = n8;
        }
        byteBuffer.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int c(byte[] arrby, int n8, int n9, boolean[] arrbl) {
        int n10 = n9 - n8;
        boolean bl = false;
        boolean bl2 = n10 >= 0;
        g0.a.f(bl2);
        if (n10 == 0) {
            return n9;
        }
        if (arrbl[0]) {
            d.a(arrbl);
            return n8 - 3;
        }
        if (n10 > 1 && arrbl[1] && arrby[n8] == 1) {
            d.a(arrbl);
            return n8 - 2;
        }
        if (n10 > 2 && arrbl[2] && arrby[n8] == 0 && arrby[n8 + 1] == 1) {
            d.a(arrbl);
            return n8 - 1;
        }
        int n11 = n9 - 1;
        n8 += 2;
        while (n8 < n11) {
            byte by = arrby[n8];
            if ((by & 254) == 0) {
                int n12 = n8 - 2;
                if (arrby[n12] == 0 && arrby[n8 - 1] == 0 && by == 1) {
                    d.a(arrbl);
                    return n12;
                }
                n8 -= 2;
            }
            n8 += 3;
        }
        bl2 = n10 > 2 ? arrby[n9 - 3] == 0 && arrby[n9 - 2] == 0 && arrby[n11] == 1 : (n10 == 2 ? arrbl[2] && arrby[n9 - 2] == 0 && arrby[n11] == 1 : arrbl[1] && arrby[n11] == 1);
        arrbl[0] = bl2;
        bl2 = n10 > 1 ? arrby[n9 - 2] == 0 && arrby[n11] == 0 : arrbl[2] && arrby[n11] == 0;
        arrbl[1] = bl2;
        bl2 = bl;
        if (arrby[n11] == 0) {
            bl2 = true;
        }
        arrbl[2] = bl2;
        return n9;
    }

    public static int d(byte[] arrby, int n8, int n9) {
        while (n8 < n9 - 2) {
            if (arrby[n8] == 0 && arrby[n8 + 1] == 0 && arrby[n8 + 2] == 3) {
                return n8;
            }
            ++n8;
        }
        return n9;
    }

    public static int e(byte[] arrby, int n8) {
        return (arrby[n8 + 3] & 126) >> 1;
    }

    public static int f(byte[] arrby, int n8) {
        return arrby[n8 + 3] & 31;
    }

    public static boolean g(String string2, byte by) {
        boolean bl = "video/avc".equals((Object)string2);
        boolean bl2 = true;
        if (!bl || (by & 31) != 6) {
            if ("video/hevc".equals((Object)string2) && (by & 126) >> 1 == 39) {
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static a h(byte[] arrby, int n8, int n9) {
        return d.i(arrby, n8 + 2, n9);
    }

    public static a i(byte[] object, int n8, int n9) {
        float f8;
        int n10;
        int n11;
        int n12;
        int n13;
        object = new e((byte[])object, n8, n9);
        object.l(4);
        int n14 = object.e(3);
        object.k();
        int n15 = 2;
        int n16 = object.e(2);
        boolean bl = object.d();
        int n17 = object.e(5);
        int n18 = 0;
        for (n8 = 0; n8 < 32; ++n8) {
            n9 = n18;
            if (object.d()) {
                n9 = n18 | 1 << n8;
            }
            n18 = n9;
        }
        int[] arrn = new int[6];
        for (n8 = 0; n8 < 6; ++n8) {
            arrn[n8] = object.e(8);
        }
        int n19 = object.e(8);
        n8 = 0;
        for (n11 = 0; n11 < n14; ++n11) {
            n9 = n8;
            if (object.d()) {
                n9 = n8 + 89;
            }
            n8 = n9;
            if (!object.d()) continue;
            n8 = n9 + 8;
        }
        object.l(n8);
        if (n14 > 0) {
            object.l((8 - n14) * 2);
        }
        int n20 = object.h();
        int n21 = object.h();
        if (n21 == 3) {
            object.k();
        }
        int n22 = object.h();
        n11 = object.h();
        int n23 = n22;
        n9 = n11;
        if (object.d()) {
            n23 = object.h();
            n13 = object.h();
            n12 = object.h();
            n10 = object.h();
            n8 = n21 != 1 && n21 != 2 ? 1 : 2;
            n9 = n21 == 1 ? 2 : 1;
            n23 = n22 - n8 * (n23 + n13);
            n9 = n11 - n9 * (n12 + n10);
        }
        n12 = object.h();
        n10 = object.h();
        n13 = object.h();
        n8 = object.d() ? 0 : n14;
        n11 = -1;
        n22 = -1;
        do {
            object.h();
            if (n8 > n14) break;
            n22 = Math.max((int)object.h(), (int)n22);
            object.h();
            ++n8;
        } while (true);
        object.h();
        object.h();
        object.h();
        object.h();
        object.h();
        if (object.d() && object.d()) {
            d.n((e)object);
        }
        object.l(2);
        if (object.d()) {
            object.l(8);
            object.h();
            object.h();
            object.k();
        }
        d.q((e)object);
        if (object.d()) {
            n14 = object.h();
            for (n8 = 0; n8 < n14; ++n8) {
                object.l(n13 + 5);
            }
        }
        object.l(2);
        boolean bl2 = object.d();
        float f9 = 1.0f;
        if (bl2) {
            f8 = f9;
            if (object.d()) {
                n8 = object.e(8);
                if (n8 == 255) {
                    n8 = object.e(16);
                    n14 = object.e(16);
                    f8 = f9;
                    if (n8 != 0) {
                        f8 = f9;
                        if (n14 != 0) {
                            f8 = (float)n8 / (float)n14;
                        }
                    }
                } else {
                    StringBuilder stringBuilder = b;
                    if (n8 < stringBuilder.length) {
                        f8 = stringBuilder[n8];
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unexpected aspect_ratio_idc value: ");
                        stringBuilder.append(n8);
                        o.h("NalUnitUtil", stringBuilder.toString());
                        f8 = f9;
                    }
                }
            }
            if (object.d()) {
                object.k();
            }
            if (object.d()) {
                object.l(3);
                if (object.d()) {
                    n15 = 1;
                }
                if (object.d()) {
                    n11 = object.e(8);
                    n8 = object.e(8);
                    object.l(8);
                    n11 = h.j(n11);
                    n8 = h.k(n8);
                } else {
                    n8 = -1;
                }
            } else {
                n15 = n8 = -1;
            }
            if (object.d()) {
                object.h();
                object.h();
            }
            object.k();
            n14 = n9;
            if (object.d()) {
                n14 = n9 * 2;
            }
            n9 = n14;
        } else {
            f8 = 1.0f;
            n8 = n15 = -1;
        }
        return new a(n16, bl, n17, n18, n21, n12, n10, arrn, n19, n20, n23, n9, f8, n22, n11, n15, n8);
    }

    public static b j(byte[] arrby, int n8, int n9) {
        return d.k(arrby, n8 + 1, n9);
    }

    public static b k(byte[] object, int n8, int n9) {
        object = new e((byte[])object, n8, n9);
        n8 = object.h();
        n9 = object.h();
        object.k();
        return new b(n8, n9, object.d());
    }

    public static c l(byte[] arrby, int n8, int n9) {
        return d.m(arrby, n8 + 1, n9);
    }

    public static c m(byte[] arrby, int n8, int n9) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static void n(e e8) {
        for (int i8 = 0; i8 < 4; ++i8) {
            int n8;
            for (int i9 = 0; i9 < 6; i9 += n8) {
                boolean bl = e8.d();
                int n9 = 1;
                if (!bl) {
                    e8.h();
                } else {
                    int n10 = Math.min((int)64, (int)(1 << (i8 << 1) + 4));
                    if (i8 > 1) {
                        e8.g();
                    }
                    for (n8 = 0; n8 < n10; ++n8) {
                        e8.g();
                    }
                }
                n8 = n9;
                if (i8 != 3) continue;
                n8 = 3;
            }
        }
    }

    public static void o(e e8) {
        int n8 = e8.h();
        e8.l(8);
        for (int i8 = 0; i8 < n8 + 1; ++i8) {
            e8.h();
            e8.h();
            e8.k();
        }
        e8.l(20);
    }

    public static void p(e e8, int n8) {
        int n9 = 8;
        int n10 = 8;
        for (int i8 = 0; i8 < n8; ++i8) {
            int n11 = n9;
            if (n9 != 0) {
                n11 = (e8.g() + n10 + 256) % 256;
            }
            if (n11 != 0) {
                n10 = n11;
            }
            n9 = n11;
        }
    }

    public static void q(e e8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int r(byte[] arrby, int n8) {
        Object object = c;
        synchronized (object) {
            int n9;
            int n10;
            int n11 = n9 = 0;
            while (n9 < n8) {
                n9 = n10 = d.d(arrby, n9, n8);
                if (n10 >= n8) continue;
                int[] arrn = d;
                if (arrn.length <= n11) {
                    d = Arrays.copyOf((int[])arrn, (int)(arrn.length * 2));
                }
                d.d[n11] = n10;
                n9 = n10 + 3;
                ++n11;
            }
            int n12 = n8 - n11;
            n10 = n8 = (n9 = 0);
            while (n9 < n11) {
                int n13 = d[n9] - n10;
                System.arraycopy((Object)arrby, (int)n10, (Object)arrby, (int)n8, (int)n13);
                int n14 = n8 + n13;
                arrby[n14] = 0;
                n8 = n14 + 2;
                arrby[n14 + 1] = 0;
                n10 += n13 + 3;
                ++n9;
            }
            try {
                System.arraycopy((Object)arrby, (int)n10, (Object)arrby, (int)n8, (int)(n12 - n8));
                return n12;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static final class a {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int[] h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final float m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;

        public a(int n8, boolean bl, int n9, int n10, int n11, int n12, int n13, int[] arrn, int n14, int n15, int n16, int n17, float f8, int n18, int n19, int n20, int n21) {
            this.a = n8;
            this.b = bl;
            this.c = n9;
            this.d = n10;
            this.e = n11;
            this.f = n12;
            this.g = n13;
            this.h = arrn;
            this.i = n14;
            this.j = n15;
            this.k = n16;
            this.l = n17;
            this.m = f8;
            this.n = n18;
            this.o = n19;
            this.p = n20;
            this.q = n21;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final boolean c;

        public b(int n8, int n9, boolean bl) {
            this.a = n8;
            this.b = n9;
            this.c = bl;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final float h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final boolean p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;

        public c(int n8, int n9, int n10, int n11, int n12, int n13, int n14, float f8, int n15, int n16, boolean bl, boolean bl2, int n17, int n18, int n19, boolean bl3, int n20, int n21, int n22, int n23) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
            this.g = n14;
            this.h = f8;
            this.i = n15;
            this.j = n16;
            this.k = bl;
            this.l = bl2;
            this.m = n17;
            this.n = n18;
            this.o = n19;
            this.p = bl3;
            this.q = n20;
            this.r = n21;
            this.s = n22;
            this.t = n23;
        }
    }

}

