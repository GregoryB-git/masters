// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import android.net.Uri;
import java.util.Arrays;
import g0.M;

public final class a
{
    public static final a g;
    public static final a h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final Object a;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final a[] f;
    
    static {
        g = new a(null, new a[0], 0L, -9223372036854775807L, 0);
        h = new a(0L).i(0);
        i = M.w0(1);
        j = M.w0(2);
        k = M.w0(3);
        l = M.w0(4);
    }
    
    public a(final Object a, final a[] f, final long c, final long d, final int e) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = f.length + e;
        this.f = f;
        this.e = e;
    }
    
    public a a(final int n) {
        final int e = this.e;
        if (n < e) {
            return d0.a.h;
        }
        return this.f[n - e];
    }
    
    public int b(final long n, final long n2) {
        int n3 = -1;
        if (n != Long.MIN_VALUE) {
            if (n2 != -9223372036854775807L && n >= n2) {
                return -1;
            }
            int e;
            for (e = this.e; e < this.b && ((this.a(e).a != Long.MIN_VALUE && this.a(e).a <= n) || !this.a(e).h()); ++e) {}
            n3 = n3;
            if (e < this.b) {
                n3 = e;
            }
        }
        return n3;
    }
    
    public int c(final long n, final long n2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public boolean d(final int n) {
        return n == this.b - 1 && this.a(n).g();
    }
    
    public final boolean e(final long n, final long n2, final int n3) {
        final boolean b = false;
        boolean b2 = false;
        if (n == Long.MIN_VALUE) {
            return false;
        }
        final a a = this.a(n3);
        final long a2 = a.a;
        if (a2 == Long.MIN_VALUE) {
            if (n2 == -9223372036854775807L || (a.i && a.b == -1) || n < n2) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (n < a2) {
            b3 = true;
        }
        return b3;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (a.class != o.getClass()) {
            return false;
        }
        final a a = (a)o;
        return M.c(this.a, a.a) && this.b == a.b && this.c == a.c && this.d == a.d && this.e == a.e && Arrays.equals(this.f, a.f);
    }
    
    @Override
    public int hashCode() {
        final int b = this.b;
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return ((((b * 31 + hashCode) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + this.e) * 31 + Arrays.hashCode(this.f);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.f.length; ++i) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f[i].a);
            sb.append(", ads=[");
            for (int j = 0; j < this.f[i].f.length; ++j) {
                sb.append("ad(state=");
                final int n = this.f[i].f[j];
                char c;
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                if (n != 4) {
                                    c = '?';
                                }
                                else {
                                    c = '!';
                                }
                            }
                            else {
                                c = 'P';
                            }
                        }
                        else {
                            c = 'S';
                        }
                    }
                    else {
                        c = 'R';
                    }
                }
                else {
                    c = '_';
                }
                sb.append(c);
                sb.append(", durationUs=");
                sb.append(this.f[i].g[j]);
                sb.append(')');
                if (j < this.f[i].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.f.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
    
    public static final class a
    {
        public static final String j;
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public static final String q;
        public static final String r;
        public final long a;
        public final int b;
        public final int c;
        public final Uri[] d;
        public final u[] e;
        public final int[] f;
        public final long[] g;
        public final long h;
        public final boolean i;
        
        static {
            j = M.w0(0);
            k = M.w0(1);
            l = M.w0(2);
            m = M.w0(3);
            n = M.w0(4);
            o = M.w0(5);
            p = M.w0(6);
            q = M.w0(7);
            r = M.w0(8);
        }
        
        public a(final long n) {
            this(n, -1, -1, new int[0], new u[0], new long[0], 0L, false);
        }
        
        public a(final long a, int b, final int c, final int[] f, final u[] e, final long[] g, final long h, final boolean i) {
            final int length = f.length;
            final int length2 = e.length;
            final int n = 0;
            g0.a.a(length == length2);
            this.a = a;
            this.b = b;
            this.c = c;
            this.f = f;
            this.e = e;
            this.g = g;
            this.h = h;
            this.i = i;
            this.d = new Uri[e.length];
            b = n;
            while (true) {
                final Uri[] d = this.d;
                if (b >= d.length) {
                    break;
                }
                final u u = e[b];
                Uri a2;
                if (u == null) {
                    a2 = null;
                }
                else {
                    a2 = ((u.h)g0.a.e(u.b)).a;
                }
                d[b] = a2;
                ++b;
            }
        }
        
        public static long[] b(long[] copy, int max) {
            final int length = copy.length;
            max = Math.max(max, length);
            copy = Arrays.copyOf(copy, max);
            Arrays.fill(copy, length, max, -9223372036854775807L);
            return copy;
        }
        
        public static int[] c(int[] copy, int max) {
            final int length = copy.length;
            max = Math.max(max, length);
            copy = Arrays.copyOf(copy, max);
            Arrays.fill(copy, length, max, 0);
            return copy;
        }
        
        public int d() {
            return this.e(-1);
        }
        
        public int e(int n) {
            ++n;
            while (true) {
                final int[] f = this.f;
                if (n >= f.length || this.i) {
                    break;
                }
                final int n2 = f[n];
                if (n2 == 0) {
                    break;
                }
                if (n2 == 1) {
                    return n;
                }
                ++n;
            }
            return n;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (a.class != o.getClass()) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b && this.c == a.c && Arrays.equals(this.e, a.e) && Arrays.equals(this.f, a.f) && Arrays.equals(this.g, a.g) && this.h == a.h && this.i == a.i;
        }
        
        public boolean f() {
            if (this.b == -1) {
                return true;
            }
            for (int i = 0; i < this.b; ++i) {
                final int n = this.f[i];
                if (n == 0) {
                    return true;
                }
                if (n == 1) {
                    return true;
                }
            }
            return false;
        }
        
        public final boolean g() {
            return this.i && this.a == Long.MIN_VALUE && this.b == -1;
        }
        
        public boolean h() {
            return this.b == -1 || this.d() < this.b;
        }
        
        @Override
        public int hashCode() {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }
        
        public a i(final int newLength) {
            return new a(this.a, newLength, this.c, c(this.f, newLength), Arrays.copyOf(this.e, newLength), b(this.g, newLength), this.h, this.i);
        }
    }
}
