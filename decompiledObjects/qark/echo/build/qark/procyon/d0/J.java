// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import java.util.Arrays;
import g0.o;
import g0.a;
import g0.M;

public final class J
{
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final q[] d;
    public int e;
    
    static {
        f = M.w0(0);
        g = M.w0(1);
    }
    
    public J(final String b, final q... d) {
        g0.a.a(d.length > 0);
        this.b = b;
        this.d = d;
        this.a = d.length;
        int c;
        if ((c = z.k(d[0].n)) == -1) {
            c = z.k(d[0].m);
        }
        this.c = c;
        this.f();
    }
    
    public J(final q... array) {
        this("", array);
    }
    
    public static void c(final String str, final String str2, final String str3, final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        o.d("TrackGroup", "", new IllegalStateException(sb.toString()));
    }
    
    public static String d(final String s) {
        if (s != null) {
            final String s2 = s;
            if (!s.equals("und")) {
                return s2;
            }
        }
        return "";
    }
    
    public static int e(final int n) {
        return n | 0x4000;
    }
    
    public q a(final int n) {
        return this.d[n];
    }
    
    public int b(final q q) {
        int n = 0;
        while (true) {
            final q[] d = this.d;
            if (n >= d.length) {
                return -1;
            }
            if (q == d[n]) {
                return n;
            }
            ++n;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (J.class != o.getClass()) {
            return false;
        }
        final J j = (J)o;
        return this.b.equals(j.b) && Arrays.equals(this.d, j.d);
    }
    
    public final void f() {
        final String d = d(this.d[0].d);
        final int e = e(this.d[0].f);
        int n = 1;
        while (true) {
            final q[] d2 = this.d;
            if (n >= d2.length) {
                return;
            }
            if (!d.equals(d(d2[n].d))) {
                final q[] d3 = this.d;
                c("languages", d3[0].d, d3[n].d, n);
                return;
            }
            if (e != e(this.d[n].f)) {
                c("role flags", Integer.toBinaryString(this.d[0].f), Integer.toBinaryString(this.d[n].f), n);
                return;
            }
            ++n;
        }
    }
    
    @Override
    public int hashCode() {
        if (this.e == 0) {
            this.e = (527 + this.b.hashCode()) * 31 + Arrays.hashCode(this.d);
        }
        return this.e;
    }
}
