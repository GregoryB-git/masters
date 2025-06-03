// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h0;

import java.util.Arrays;
import d0.h;
import g0.o;
import g0.a;
import java.nio.ByteBuffer;

public abstract class d
{
    public static final byte[] a;
    public static final float[] b;
    public static final Object c;
    public static int[] d;
    
    static {
        a = new byte[] { 0, 0, 0, 1 };
        b = new float[] { 1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f };
        c = new Object();
        h0.d.d = new int[10];
    }
    
    public static void a(final boolean[] array) {
        array[0] = false;
        array[2] = (array[1] = false);
    }
    
    public static void b(final ByteBuffer byteBuffer) {
        final int position = byteBuffer.position();
        int n2;
        int n = n2 = 0;
        while (true) {
            final int n3 = n + 1;
            if (n3 >= position) {
                byteBuffer.clear();
                return;
            }
            final int n4 = byteBuffer.get(n) & 0xFF;
            int n5;
            if (n2 == 3) {
                n5 = n2;
                if (n4 == 1) {
                    n5 = n2;
                    if ((byteBuffer.get(n3) & 0x1F) == 0x7) {
                        final ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(n - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                }
            }
            else {
                n5 = n2;
                if (n4 == 0) {
                    n5 = n2 + 1;
                }
            }
            n2 = n5;
            if (n4 != 0) {
                n2 = 0;
            }
            n = n3;
        }
    }
    
    public static int c(final byte[] array, int i, final int n, final boolean[] array2) {
        final int n2 = n - i;
        final boolean b = false;
        g0.a.f(n2 >= 0);
        if (n2 == 0) {
            return n;
        }
        if (array2[0]) {
            a(array2);
            return i - 3;
        }
        if (n2 > 1 && array2[1] && array[i] == 1) {
            a(array2);
            return i - 2;
        }
        if (n2 > 2 && array2[2] && array[i] == 0 && array[i + 1] == 1) {
            a(array2);
            return i - 1;
        }
        int n3;
        byte b2;
        int n4;
        for (n3 = n - 1, i += 2; i < n3; i += 3) {
            b2 = array[i];
            if ((b2 & 0xFE) == 0x0) {
                n4 = i - 2;
                if (array[n4] == 0 && array[i - 1] == 0 && b2 == 1) {
                    a(array2);
                    return n4;
                }
                i -= 2;
            }
        }
        array2[0] = ((n2 <= 2) ? ((n2 != 2) ? (array2[1] && array[n3] == 1) : (array2[2] && array[n - 2] == 0 && array[n3] == 1)) : (array[n - 3] == 0 && array[n - 2] == 0 && array[n3] == 1));
        array2[1] = ((n2 <= 1) ? (array2[2] && array[n3] == 0) : (array[n - 2] == 0 && array[n3] == 0));
        boolean b3 = b;
        if (array[n3] == 0) {
            b3 = true;
        }
        array2[2] = b3;
        return n;
    }
    
    public static int d(final byte[] array, int i, final int n) {
        while (i < n - 2) {
            if (array[i] == 0 && array[i + 1] == 0 && array[i + 2] == 3) {
                return i;
            }
            ++i;
        }
        return n;
    }
    
    public static int e(final byte[] array, final int n) {
        return (array[n + 3] & 0x7E) >> 1;
    }
    
    public static int f(final byte[] array, final int n) {
        return array[n + 3] & 0x1F;
    }
    
    public static boolean g(final String s, final byte b) {
        final boolean equals = "video/avc".equals(s);
        boolean b2 = true;
        if (!equals || (b & 0x1F) != 0x6) {
            if ("video/hevc".equals(s) && (b & 0x7E) >> 1 == 39) {
                return true;
            }
            b2 = false;
        }
        return b2;
    }
    
    public static a h(final byte[] array, final int n, final int n2) {
        return i(array, n + 2, n2);
    }
    
    public static a i(final byte[] array, int i, int n) {
        final e e = new e(array, i, n);
        e.l(4);
        final int e2 = e.e(3);
        e.k();
        int n2 = 2;
        final int e3 = e.e(2);
        final boolean d = e.d();
        final int e4 = e.e(5);
        int n3 = 0;
        for (i = 0; i < 32; ++i, n3 = n) {
            n = n3;
            if (e.d()) {
                n = (n3 | 1 << i);
            }
        }
        final int[] array2 = new int[6];
        for (i = 0; i < 6; ++i) {
            array2[i] = e.e(8);
        }
        final int e5 = e.e(8);
        int j = 0;
        i = 0;
        while (j < e2) {
            n = i;
            if (e.d()) {
                n = i + 89;
            }
            i = n;
            if (e.d()) {
                i = n + 8;
            }
            ++j;
        }
        e.l(i);
        if (e2 > 0) {
            e.l((8 - e2) * 2);
        }
        final int h = e.h();
        final int h2 = e.h();
        if (h2 == 3) {
            e.k();
        }
        final int h3 = e.h();
        final int h4 = e.h();
        int n4 = h3;
        n = h4;
        if (e.d()) {
            final int h5 = e.h();
            final int h6 = e.h();
            final int h7 = e.h();
            final int h8 = e.h();
            if (h2 != 1 && h2 != 2) {
                i = 1;
            }
            else {
                i = 2;
            }
            if (h2 == 1) {
                n = 2;
            }
            else {
                n = 1;
            }
            n4 = h3 - i * (h5 + h6);
            n = h4 - n * (h7 + h8);
        }
        final int h9 = e.h();
        final int h10 = e.h();
        final int h11 = e.h();
        if (e.d()) {
            i = 0;
        }
        else {
            i = e2;
        }
        int k = -1;
        int max = -1;
        while (true) {
            e.h();
            if (i > e2) {
                break;
            }
            max = Math.max(e.h(), max);
            e.h();
            ++i;
        }
        e.h();
        e.h();
        e.h();
        e.h();
        e.h();
        if (e.d() && e.d()) {
            n(e);
        }
        e.l(2);
        if (e.d()) {
            e.l(8);
            e.h();
            e.h();
            e.k();
        }
        q(e);
        if (e.d()) {
            int h12;
            for (h12 = e.h(), i = 0; i < h12; ++i) {
                e.l(h11 + 5);
            }
        }
        e.l(2);
        final boolean d2 = e.d();
        final float n5 = 1.0f;
        float n6;
        if (d2) {
            n6 = n5;
            if (e.d()) {
                i = e.e(8);
                if (i == 255) {
                    i = e.e(16);
                    final int e6 = e.e(16);
                    n6 = n5;
                    if (i != 0) {
                        n6 = n5;
                        if (e6 != 0) {
                            n6 = i / (float)e6;
                        }
                    }
                }
                else {
                    final float[] b = h0.d.b;
                    if (i < b.length) {
                        n6 = b[i];
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(i);
                        o.h("NalUnitUtil", sb.toString());
                        n6 = n5;
                    }
                }
            }
            if (e.d()) {
                e.k();
            }
            if (e.d()) {
                e.l(3);
                if (e.d()) {
                    n2 = 1;
                }
                if (e.d()) {
                    final int e7 = e.e(8);
                    i = e.e(8);
                    e.l(8);
                    k = d0.h.j(e7);
                    i = d0.h.k(i);
                }
                else {
                    i = -1;
                }
            }
            else {
                i = (n2 = -1);
            }
            if (e.d()) {
                e.h();
                e.h();
            }
            e.k();
            int n7 = n;
            if (e.d()) {
                n7 = n * 2;
            }
            n = n7;
        }
        else {
            n6 = 1.0f;
            n2 = (i = -1);
        }
        return new a(e3, d, e4, n3, h2, h9, h10, array2, e5, h, n4, n, n6, max, k, n2, i);
    }
    
    public static b j(final byte[] array, final int n, final int n2) {
        return k(array, n + 1, n2);
    }
    
    public static b k(final byte[] array, int h, int h2) {
        final e e = new e(array, h, h2);
        h = e.h();
        h2 = e.h();
        e.k();
        return new b(h, h2, e.d());
    }
    
    public static c l(final byte[] array, final int n, final int n2) {
        return m(array, n + 1, n2);
    }
    
    public static c m(final byte[] array, final int n, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static void n(final e e) {
        for (int i = 0; i < 4; ++i) {
            int n2;
            for (int j = 0; j < 6; j += n2) {
                final boolean d = e.d();
                final int n = 1;
                if (!d) {
                    e.h();
                }
                else {
                    final int min = Math.min(64, 1 << (i << 1) + 4);
                    if (i > 1) {
                        e.g();
                    }
                    for (int k = 0; k < min; ++k) {
                        e.g();
                    }
                }
                n2 = n;
                if (i == 3) {
                    n2 = 3;
                }
            }
        }
    }
    
    public static void o(final e e) {
        final int h = e.h();
        e.l(8);
        for (int i = 0; i < h + 1; ++i) {
            e.h();
            e.h();
            e.k();
        }
        e.l(20);
    }
    
    public static void p(final e e, final int n) {
        int n2 = 8;
        int i = 0;
        int n3 = 8;
        while (i < n) {
            int n4;
            if ((n4 = n2) != 0) {
                n4 = (e.g() + n3 + 256) % 256;
            }
            if (n4 != 0) {
                n3 = n4;
            }
            ++i;
            n2 = n4;
        }
    }
    
    public static void q(final e e) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static int r(final byte[] array, int n) {
        final Object c = h0.d.c;
        // monitorenter(c)
        int n2;
        int d = n2 = 0;
        int n3;
        int[] d2;
        int n4;
        int n5;
        int n6;
        int n7;
        Block_5_Outer:Label_0081_Outer:
        while (true) {
            while (true) {
                Label_0172: {
                    if (d >= n) {
                        break Label_0172;
                    }
                    while (true) {
                        try {
                            n3 = (d = d(array, d, n));
                            if (n3 < n) {
                                d2 = h0.d.d;
                                if (d2.length <= n2) {
                                    h0.d.d = Arrays.copyOf(d2, d2.length * 2);
                                }
                                h0.d.d[n2] = n3;
                                d = n3 + 3;
                                ++n2;
                                continue Block_5_Outer;
                            }
                            continue Block_5_Outer;
                            Label_0145: {
                                System.arraycopy(array, n4, array, n, n5 - n);
                            }
                            // monitorexit(c)
                            return n5;
                            // iftrue(Label_0145:, d >= n2)
                            while (true) {
                                n6 = h0.d.d[d] - n4;
                                System.arraycopy(array, n4, array, n, n6);
                                n7 = n + n6;
                                array[n7] = 0;
                                n = n7 + 2;
                                array[n7 + 1] = 0;
                                n4 += n6 + 3;
                                ++d;
                                continue Label_0081_Outer;
                            }
                            // monitorexit(c)
                            throw array;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                n5 = n - n2;
                d = 0;
                n = (n4 = d);
                continue;
            }
        }
    }
    
    public static final class a
    {
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
        
        public a(final int a, final boolean b, final int c, final int d, final int e, final int f, final int g, final int[] h, final int i, final int j, final int k, final int l, final float m, final int n, final int o, final int p17, final int q) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p17;
            this.q = q;
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final boolean c;
        
        public b(final int a, final int b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static final class c
    {
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
        
        public c(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final float h, final int i, final int j, final boolean k, final boolean l, final int m, final int n, final int o, final boolean p20, final int q, final int r, final int s, final int t) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p20;
            this.q = q;
            this.r = r;
            this.s = s;
            this.t = t;
        }
    }
}
