// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import java.util.Arrays;
import F0.L;
import java.util.List;
import java.util.regex.Matcher;
import g0.a;
import d0.A;
import android.text.TextUtils;
import k1.h;
import F0.s;
import d0.q;
import F0.T;
import F0.M;
import c1.v;
import c1.t;
import g0.z;
import g0.E;
import java.util.regex.Pattern;
import F0.r;

public final class w implements r
{
    public static final Pattern i;
    public static final Pattern j;
    public final String a;
    public final E b;
    public final z c;
    public final t.a d;
    public final boolean e;
    public F0.t f;
    public byte[] g;
    public int h;
    
    static {
        i = Pattern.compile("LOCAL:([^,]+)");
        j = Pattern.compile("MPEGTS:(-?\\d+)");
    }
    
    public w(final String a, final E b, final t.a d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = new z();
        this.g = new byte[1024];
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void a(final long n, final long n2) {
        throw new IllegalStateException();
    }
    
    @Override
    public void b(final F0.t t) {
        F0.t f;
        if (this.e) {
            f = new v(t, this.d);
        }
        else {
            f = t;
        }
        this.f = f;
        t.e(new M.b(-9223372036854775807L));
    }
    
    public final T c(final long n) {
        final T a = this.f.a(0, 3);
        a.d(new q.b().o0("text/vtt").e0(this.a).s0(n).K());
        this.f.j();
        return a;
    }
    
    @Override
    public boolean e(final s s) {
        s.l(this.g, 0, 6, false);
        this.c.R(this.g, 6);
        if (k1.h.b(this.c)) {
            return true;
        }
        s.l(this.g, 6, 3, false);
        this.c.R(this.g, 9);
        return k1.h.b(this.c);
    }
    
    public final void f() {
        final z z = new z(this.g);
        k1.h.e(z);
        String s = z.r();
        long d;
        long h = d = 0L;
        while (!TextUtils.isEmpty((CharSequence)s)) {
            if (s.startsWith("X-TIMESTAMP-MAP")) {
                final Matcher matcher = w.i.matcher(s);
                if (!matcher.find()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("X-TIMESTAMP-MAP doesn't contain local timestamp: ");
                    sb.append(s);
                    throw A.a(sb.toString(), null);
                }
                final Matcher matcher2 = w.j.matcher(s);
                if (!matcher2.find()) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("X-TIMESTAMP-MAP doesn't contain media timestamp: ");
                    sb2.append(s);
                    throw A.a(sb2.toString(), null);
                }
                d = k1.h.d((String)g0.a.e(matcher.group(1)));
                h = E.h(Long.parseLong((String)g0.a.e(matcher2.group(1))));
            }
            s = z.r();
        }
        final Matcher a = k1.h.a(z);
        if (a == null) {
            this.c(0L);
            return;
        }
        final long d2 = k1.h.d((String)g0.a.e(a.group(1)));
        final long b = this.b.b(E.l(h + d2 - d));
        final T c = this.c(b - d2);
        this.c.R(this.g, this.h);
        c.e(this.c, this.h);
        c.b(b, 1, this.h, 0, null);
    }
    
    @Override
    public int i(final s s, final L l) {
        g0.a.e(this.f);
        final int n = (int)s.a();
        final int h = this.h;
        final byte[] g = this.g;
        if (h == g.length) {
            int length;
            if (n != -1) {
                length = n;
            }
            else {
                length = g.length;
            }
            this.g = Arrays.copyOf(g, length * 3 / 2);
        }
        final byte[] g2 = this.g;
        final int h2 = this.h;
        final int read = s.read(g2, h2, g2.length - h2);
        if (read != -1) {
            final int h3 = this.h + read;
            this.h = h3;
            if (n == -1 || h3 != n) {
                return 0;
            }
        }
        this.f();
        return -1;
    }
    
    @Override
    public void release() {
    }
}
