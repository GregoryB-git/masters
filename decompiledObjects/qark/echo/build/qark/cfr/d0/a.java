/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package d0;

import android.net.Uri;
import d0.u;
import g0.M;
import java.util.Arrays;

public final class a {
    public static final a g = new a(null, new a[0], 0L, -9223372036854775807L, 0);
    public static final a h = new a(0L).i(0);
    public static final String i = M.w0(1);
    public static final String j = M.w0(2);
    public static final String k = M.w0(3);
    public static final String l = M.w0(4);
    public final Object a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final a[] f;

    public a(Object object, a[] arra, long l8, long l9, int n8) {
        this.a = object;
        this.c = l8;
        this.d = l9;
        this.b = arra.length + n8;
        this.f = arra;
        this.e = n8;
    }

    public a a(int n8) {
        int n9 = this.e;
        if (n8 < n9) {
            return h;
        }
        return this.f[n8 - n9];
    }

    public int b(long l8, long l9) {
        int n8;
        int n9 = n8 = -1;
        if (l8 != Long.MIN_VALUE) {
            int n10;
            if (l9 != -9223372036854775807L && l8 >= l9) {
                return -1;
            }
            for (n10 = this.e; n10 < this.b && (this.a((int)n10).a != Long.MIN_VALUE && this.a((int)n10).a <= l8 || !this.a(n10).h()); ++n10) {
            }
            n9 = n8;
            if (n10 < this.b) {
                n9 = n10;
            }
        }
        return n9;
    }

    public int c(long l8, long l9) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public boolean d(int n8) {
        if (n8 == this.b - 1 && this.a(n8).g()) {
            return true;
        }
        return false;
    }

    public final boolean e(long l8, long l9, int n8) {
        boolean bl = false;
        boolean bl2 = false;
        if (l8 == Long.MIN_VALUE) {
            return false;
        }
        a a8 = this.a(n8);
        long l10 = a8.a;
        if (l10 == Long.MIN_VALUE) {
            if (l9 == -9223372036854775807L || a8.i && a8.b == -1 || l8 < l9) {
                bl2 = true;
            }
            return bl2;
        }
        bl2 = bl;
        if (l8 < l10) {
            bl2 = true;
        }
        return bl2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (a.class != object.getClass()) {
                return false;
            }
            object = (a)object;
            if (M.c(this.a, object.a) && this.b == object.b && this.c == object.c && this.d == object.d && this.e == object.e && Arrays.equals((Object[])this.f, (Object[])object.f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.b;
        Object object = this.a;
        int n9 = object == null ? 0 : object.hashCode();
        return ((((n8 * 31 + n9) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + this.e) * 31 + Arrays.hashCode((Object[])this.f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdPlaybackState(adsId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", adResumePositionUs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", adGroups=[");
        int n8 = 0;
        do {
            if (n8 >= this.f.length) {
                stringBuilder.append("])");
                return stringBuilder.toString();
            }
            stringBuilder.append("adGroup(timeUs=");
            stringBuilder.append(this.f[n8].a);
            stringBuilder.append(", ads=[");
            for (int i8 = 0; i8 < this.f[n8].f.length; ++i8) {
                stringBuilder.append("ad(state=");
                int n9 = this.f[n8].f[i8];
                int n10 = n9 != 0 ? (n9 != 1 ? (n9 != 2 ? (n9 != 3 ? (n9 != 4 ? 63 : 33) : 80) : 83) : 82) : 95;
                stringBuilder.append((char)n10);
                stringBuilder.append(", durationUs=");
                stringBuilder.append(this.f[n8].g[i8]);
                stringBuilder.append(')');
                if (i8 >= this.f[n8].f.length - 1) continue;
                stringBuilder.append(", ");
            }
            stringBuilder.append("])");
            if (n8 < this.f.length - 1) {
                stringBuilder.append(", ");
            }
            ++n8;
        } while (true);
    }

    public static final class a {
        public static final String j = M.w0(0);
        public static final String k = M.w0(1);
        public static final String l = M.w0(2);
        public static final String m = M.w0(3);
        public static final String n = M.w0(4);
        public static final String o = M.w0(5);
        public static final String p = M.w0(6);
        public static final String q = M.w0(7);
        public static final String r = M.w0(8);
        public final long a;
        public final int b;
        public final int c;
        public final Uri[] d;
        public final u[] e;
        public final int[] f;
        public final long[] g;
        public final long h;
        public final boolean i;

        public a(long l8) {
            this(l8, -1, -1, new int[0], new u[0], new long[0], 0L, false);
        }

        public a(long l8, int n8, int n9, int[] object, u[] arru, long[] arrl, long l9, boolean bl) {
            int n10 = object.length;
            int n11 = arru.length;
            int n12 = 0;
            boolean bl2 = n10 == n11;
            g0.a.a(bl2);
            this.a = l8;
            this.b = n8;
            this.c = n9;
            this.f = object;
            this.e = arru;
            this.g = arrl;
            this.h = l9;
            this.i = bl;
            this.d = new Uri[arru.length];
            for (n8 = n12; n8 < (arrl = this.d).length; ++n8) {
                object = arru[n8];
                object = object == null ? null : ((u.h)g0.a.e((Object)object.b)).a;
                arrl[n8] = object;
            }
        }

        public static long[] b(long[] arrl, int n8) {
            int n9 = arrl.length;
            n8 = Math.max((int)n8, (int)n9);
            arrl = Arrays.copyOf((long[])arrl, (int)n8);
            Arrays.fill((long[])arrl, (int)n9, (int)n8, (long)-9223372036854775807L);
            return arrl;
        }

        public static int[] c(int[] arrn, int n8) {
            int n9 = arrn.length;
            n8 = Math.max((int)n8, (int)n9);
            arrn = Arrays.copyOf((int[])arrn, (int)n8);
            Arrays.fill((int[])arrn, (int)n9, (int)n8, (int)0);
            return arrn;
        }

        public int d() {
            return this.e(-1);
        }

        public int e(int n8) {
            int n9;
            int[] arrn;
            ++n8;
            while (n8 < (arrn = this.f).length && !this.i && (n9 = arrn[n8]) != 0) {
                if (n9 == 1) {
                    return n8;
                }
                ++n8;
            }
            return n8;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null) {
                if (a.class != object.getClass()) {
                    return false;
                }
                object = (a)object;
                if (this.a == object.a && this.b == object.b && this.c == object.c && Arrays.equals((Object[])this.e, (Object[])object.e) && Arrays.equals((int[])this.f, (int[])object.f) && Arrays.equals((long[])this.g, (long[])object.g) && this.h == object.h && this.i == object.i) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public boolean f() {
            if (this.b == -1) {
                return true;
            }
            for (int i8 = 0; i8 < this.b; ++i8) {
                int n8 = this.f[i8];
                if (n8 != 0) {
                    if (n8 != 1) continue;
                    return true;
                }
                return true;
            }
            return false;
        }

        public final boolean g() {
            if (this.i && this.a == Long.MIN_VALUE && this.b == -1) {
                return true;
            }
            return false;
        }

        public boolean h() {
            if (this.b != -1 && this.d() >= this.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public a i(int n8) {
            int[] arrn = a.c(this.f, n8);
            long[] arrl = a.b(this.g, n8);
            u[] arru = (u[])Arrays.copyOf((Object[])this.e, (int)n8);
            return new a(this.a, n8, this.c, arrn, arru, arrl, this.h, this.i);
        }
    }

}

