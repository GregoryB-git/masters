/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
package F0;

import d0.m;
import d0.q;
import g0.M;
import g0.y;
import g0.z;
import java.nio.ByteBuffer;

public abstract class b {
    public static final int[] a = new int[]{1, 2, 3, 6};
    public static final int[] b = new int[]{48000, 44100, 32000};
    public static final int[] c = new int[]{24000, 22050, 16000};
    public static final int[] d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int n8, int n9, int n10) {
        return n8 * n9 / (n10 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int n8 = byteBuffer.position();
        int n9 = byteBuffer.limit();
        for (int i8 = n8; i8 <= n9 - 10; ++i8) {
            if ((M.O(byteBuffer, i8 + 4) & -2) != -126718022) continue;
            return i8 - n8;
        }
        return -1;
    }

    public static int c(int n8, int n9) {
        int[] arrn;
        int[] arrn2;
        int n10 = n9 / 2;
        if (n8 >= 0 && n8 < (arrn2 = b).length && n9 >= 0 && n10 < (arrn = f).length) {
            if ((n8 = arrn2[n8]) == 44100) {
                return (arrn[n10] + n9 % 2) * 2;
            }
            n9 = e[n10];
            if (n8 == 32000) {
                return n9 * 6;
            }
            return n9 * 4;
        }
        return -1;
    }

    public static q d(z z8, String string2, String string3, m m8) {
        int n8;
        y y8 = new y();
        y8.m(z8);
        int n9 = y8.h(2);
        int n10 = b[n9];
        y8.r(8);
        n9 = n8 = d[y8.h(3)];
        if (y8.h(1) != 0) {
            n9 = n8 + 1;
        }
        n8 = y8.h(5);
        n8 = e[n8] * 1000;
        y8.c();
        z8.T(y8.d());
        return new q.b().a0(string2).o0("audio/ac3").N(n9).p0(n10).U(m8).e0(string3).M(n8).j0(n8).K();
    }

    public static int e(ByteBuffer byteBuffer) {
        byte by = byteBuffer.get(byteBuffer.position() + 5);
        int n8 = 3;
        if ((by & 248) >> 3 > 10) {
            if ((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6 != 3) {
                n8 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return a[n8] * 256;
        }
        return 1536;
    }

    public static b f(y y8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static int g(byte[] arrby) {
        if (arrby.length < 6) {
            return -1;
        }
        if ((arrby[5] & 248) >> 3 > 10) {
            byte by = arrby[2];
            return ((arrby[3] & 255 | (by & 7) << 8) + 1) * 2;
        }
        byte by = arrby[4];
        return b.c((by & 192) >> 6, by & 63);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static q h(z var0, String var1_1, String var2_2, m var3_3) {
        var10_4 = new y();
        var10_4.m(var0);
        var6_5 = var10_4.h(13);
        var10_4.r(3);
        var4_6 = var10_4.h(2);
        var7_7 = b.b[var4_6];
        var10_4.r(10);
        var4_6 = var5_8 = b.d[var10_4.h(3)];
        if (var10_4.h(1) != 0) {
            var4_6 = var5_8 + 1;
        }
        var10_4.r(3);
        var8_9 = var10_4.h(4);
        var10_4.r(1);
        var5_8 = var4_6;
        if (var8_9 > 0) {
            var10_4.r(6);
            var5_8 = var4_6;
            if (var10_4.h(1) != 0) {
                var5_8 = var4_6 + 2;
            }
            var10_4.r(1);
        }
        if (var10_4.b() <= 7) ** GOTO lbl-1000
        var10_4.r(7);
        if (var10_4.h(1) != 0) {
            var9_10 = "audio/eac3-joc";
        } else lbl-1000: // 2 sources:
        {
            var9_10 = "audio/eac3";
        }
        var10_4.c();
        var0.T(var10_4.d());
        return new q.b().a0(var1_1).o0(var9_10).N(var5_8).p0(var7_7).U(var3_3).e0(var2_2).j0(var6_5 * 1000).K();
    }

    public static int i(ByteBuffer byteBuffer, int n8) {
        int n9 = (byteBuffer.get(byteBuffer.position() + n8 + 7) & 255) == 187 ? 1 : 0;
        int n10 = byteBuffer.position();
        n9 = n9 != 0 ? 9 : 8;
        return 40 << (byteBuffer.get(n10 + n8 + n9) >> 4 & 7);
    }

    public static int j(byte[] arrby) {
        byte by = arrby[4];
        int n8 = 0;
        if (by == -8 && arrby[5] == 114 && arrby[6] == 111) {
            by = arrby[7];
            if ((by & 254) != 186) {
                return 0;
            }
            if ((by & 255) == 187) {
                n8 = 1;
            }
            n8 = n8 != 0 ? 9 : 8;
            return 40 << (arrby[n8] >> 4 & 7);
        }
        return 0;
    }

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        public b(String string2, int n8, int n9, int n10, int n11, int n12, int n13) {
            this.a = string2;
            this.b = n8;
            this.d = n9;
            this.c = n10;
            this.e = n11;
            this.f = n12;
            this.g = n13;
        }

        public /* synthetic */ b(String string2, int n8, int n9, int n10, int n11, int n12, int n13,  a8) {
            this(string2, n8, n9, n10, n11, n12, n13);
        }
    }

}

