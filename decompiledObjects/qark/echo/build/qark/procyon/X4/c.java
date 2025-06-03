// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X4;

import Y4.b;
import Y4.a;

public abstract class c
{
    public static final int[] a;
    
    static {
        a = new int[] { 4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12 };
    }
    
    public static int[] a(final a a, final int n, int i) {
        final int[] array = new int[i];
        int n2;
        int n3;
        int j;
        int n4;
        for (n2 = a.l() / n, i = 0; i < n2; ++i) {
            for (j = (n3 = 0); j < n; ++j) {
                if (a.j(i * n + j)) {
                    n4 = 1 << n - j - 1;
                }
                else {
                    n4 = 0;
                }
                n3 |= n4;
            }
            array[i] = n3;
        }
        return array;
    }
    
    public static void b(final b b, int n, final int n2) {
        for (int i = 0; i < n2; i += 2) {
            int n4;
            final int n3 = n4 = n - i;
            while (true) {
                final int n5 = n + i;
                if (n4 > n5) {
                    break;
                }
                b.l(n4, n3);
                b.l(n4, n5);
                b.l(n3, n4);
                b.l(n5, n4);
                ++n4;
            }
        }
        final int n6 = n - n2;
        b.l(n6, n6);
        final int n7 = n6 + 1;
        b.l(n7, n6);
        b.l(n6, n7);
        n += n2;
        b.l(n, n6);
        b.l(n, n7);
        b.l(n, n - 1);
    }
    
    public static void c(final b b, final boolean b2, int i, final a a) {
        final int n = i / 2;
        i = 0;
        final int n2 = 0;
        if (b2) {
            int n3;
            for (i = n2; i < 7; ++i) {
                n3 = n - 3 + i;
                if (a.j(i)) {
                    b.l(n3, n - 5);
                }
                if (a.j(i + 7)) {
                    b.l(n + 5, n3);
                }
                if (a.j(20 - i)) {
                    b.l(n3, n + 5);
                }
                if (a.j(27 - i)) {
                    b.l(n - 5, n3);
                }
            }
            return;
        }
        while (i < 10) {
            final int n4 = n - 5 + i + i / 5;
            if (a.j(i)) {
                b.l(n4, n - 7);
            }
            if (a.j(i + 10)) {
                b.l(n + 7, n4);
            }
            if (a.j(29 - i)) {
                b.l(n4, n + 7);
            }
            if (a.j(39 - i)) {
                b.l(n - 7, n4);
            }
            ++i;
        }
    }
    
    public static X4.a d(final byte[] array, final int n, final int n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static a e(final a a, int i, final int n) {
        final int n2 = a.l() / n;
        final Z4.c c = new Z4.c(g(n));
        final int n3 = i / n;
        final int[] a2 = a(a, n, n3);
        c.b(a2, n3 - n2);
        final a a3 = new a();
        final int n4 = 0;
        a3.d(0, i % n);
        int length;
        for (length = a2.length, i = n4; i < length; ++i) {
            a3.d(a2[i], n);
        }
        return a3;
    }
    
    public static a f(final boolean b, int n, final int n2) {
        final a a = new a();
        --n;
        if (b) {
            a.d(n, 2);
            a.d(n2 - 1, 6);
            n = 28;
        }
        else {
            a.d(n, 5);
            a.d(n2 - 1, 11);
            n = 40;
        }
        return e(a, n, 4);
    }
    
    public static Z4.a g(final int i) {
        if (i == 4) {
            return Z4.a.k;
        }
        if (i == 6) {
            return Z4.a.j;
        }
        if (i == 8) {
            return Z4.a.n;
        }
        if (i == 10) {
            return Z4.a.i;
        }
        if (i == 12) {
            return Z4.a.h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }
    
    public static a h(final a a, final int n) {
        final a a2 = new a();
        final int l = a.l();
        final int n2 = (1 << n) - 2;
        for (int i = 0; i < l; i += n) {
            int n3;
            int n5;
            for (int j = n3 = 0; j < n; ++j, n3 = n5) {
                final int n4 = i + j;
                if (n4 < l) {
                    n5 = n3;
                    if (!a.j(n4)) {
                        continue;
                    }
                }
                n5 = (n3 | 1 << n - 1 - j);
            }
            final int n6 = n3 & n2;
            int n7;
            if (n6 == n2) {
                n7 = n6;
            }
            else {
                if (n6 != 0) {
                    a2.d(n3, n);
                    continue;
                }
                n7 = (n3 | 0x1);
            }
            a2.d(n7, n);
            --i;
        }
        return a2;
    }
    
    public static int i(final int n, final boolean b) {
        int n2;
        if (b) {
            n2 = 88;
        }
        else {
            n2 = 112;
        }
        return (n2 + (n << 4)) * n;
    }
}
