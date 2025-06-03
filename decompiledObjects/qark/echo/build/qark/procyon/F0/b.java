// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.y;
import d0.q;
import d0.m;
import g0.z;
import g0.M;
import java.nio.ByteBuffer;

public abstract class b
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    
    static {
        a = new int[] { 1, 2, 3, 6 };
        b = new int[] { 48000, 44100, 32000 };
        c = new int[] { 24000, 22050, 16000 };
        d = new int[] { 2, 1, 2, 3, 3, 4, 4, 5 };
        e = new int[] { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640 };
        f = new int[] { 69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
    }
    
    public static int a(final int n, final int n2, final int n3) {
        return n * n2 / (n3 * 32);
    }
    
    public static int b(final ByteBuffer byteBuffer) {
        final int position = byteBuffer.position();
        for (int limit = byteBuffer.limit(), i = position; i <= limit - 10; ++i) {
            if ((M.O(byteBuffer, i + 4) & 0xFFFFFFFE) == 0xF8726FBA) {
                return i - position;
            }
        }
        return -1;
    }
    
    public static int c(int n, int n2) {
        final int n3 = n2 / 2;
        if (n >= 0) {
            final int[] b = F0.b.b;
            if (n < b.length && n2 >= 0) {
                final int[] f = F0.b.f;
                if (n3 < f.length) {
                    n = b[n];
                    if (n == 44100) {
                        return (f[n3] + n2 % 2) * 2;
                    }
                    n2 = F0.b.e[n3];
                    if (n == 32000) {
                        return n2 * 6;
                    }
                    return n2 * 4;
                }
            }
        }
        return -1;
    }
    
    public static q d(final z z, final String s, final String s2, final m m) {
        final y y = new y();
        y.m(z);
        final int n = F0.b.b[y.h(2)];
        y.r(8);
        int n2 = F0.b.d[y.h(3)];
        if (y.h(1) != 0) {
            ++n2;
        }
        final int n3 = F0.b.e[y.h(5)] * 1000;
        y.c();
        z.T(y.d());
        return new q.b().a0(s).o0("audio/ac3").N(n2).p0(n).U(m).e0(s2).M(n3).j0(n3).K();
    }
    
    public static int e(final ByteBuffer byteBuffer) {
        final byte value = byteBuffer.get(byteBuffer.position() + 5);
        int n = 3;
        if ((value & 0xF8) >> 3 > 10) {
            if ((byteBuffer.get(byteBuffer.position() + 4) & 0xC0) >> 6 != 3) {
                n = (byteBuffer.get(byteBuffer.position() + 4) & 0x30) >> 4;
            }
            return F0.b.a[n] * 256;
        }
        return 1536;
    }
    
    public static b f(final y y) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static int g(final byte[] array) {
        if (array.length < 6) {
            return -1;
        }
        if ((array[5] & 0xF8) >> 3 > 10) {
            return (((array[3] & 0xFF) | (array[2] & 0x7) << 8) + 1) * 2;
        }
        final byte b = array[4];
        return c((b & 0xC0) >> 6, b & 0x3F);
    }
    
    public static q h(final z z, final String s, final String s2, final m m) {
        final y y = new y();
        y.m(z);
        final int h = y.h(13);
        y.r(3);
        final int n = F0.b.b[y.h(2)];
        y.r(10);
        int n3;
        final int n2 = n3 = F0.b.d[y.h(3)];
        if (y.h(1) != 0) {
            n3 = n2 + 1;
        }
        y.r(3);
        final int h2 = y.h(4);
        y.r(1);
        int n4 = n3;
        if (h2 > 0) {
            y.r(6);
            n4 = n3;
            if (y.h(1) != 0) {
                n4 = n3 + 2;
            }
            y.r(1);
        }
        String s3 = null;
        Label_0182: {
            if (y.b() > 7) {
                y.r(7);
                if (y.h(1) != 0) {
                    s3 = "audio/eac3-joc";
                    break Label_0182;
                }
            }
            s3 = "audio/eac3";
        }
        y.c();
        z.T(y.d());
        return new q.b().a0(s).o0(s3).N(n4).p0(n).U(m).e0(s2).j0(h * 1000).K();
    }
    
    public static int i(final ByteBuffer byteBuffer, final int n) {
        final boolean b = (byteBuffer.get(byteBuffer.position() + n + 7) & 0xFF) == 0xBB;
        final int position = byteBuffer.position();
        int n2;
        if (b) {
            n2 = 9;
        }
        else {
            n2 = 8;
        }
        return 40 << (byteBuffer.get(position + n + n2) >> 4 & 0x7);
    }
    
    public static int j(final byte[] array) {
        final byte b = array[4];
        boolean b2 = false;
        if (b != -8 || array[5] != 114 || array[6] != 111) {
            return 0;
        }
        final byte b3 = array[7];
        if ((b3 & 0xFE) != 0xBA) {
            return 0;
        }
        if ((b3 & 0xFF) == 0xBB) {
            b2 = true;
        }
        int n;
        if (b2) {
            n = 9;
        }
        else {
            n = 8;
        }
        return 40 << (array[n] >> 4 & 0x7);
    }
    
    public static final class b
    {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        
        public b(final String a, final int b, final int d, final int c, final int e, final int f, final int g) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.c = c;
            this.e = e;
            this.f = f;
            this.g = g;
        }
    }
}
