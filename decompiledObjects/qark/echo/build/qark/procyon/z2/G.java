// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import com.google.android.gms.common.api.Status;
import A2.l;
import V2.j;
import A2.p;
import android.os.SystemClock;
import A2.c;
import A2.o;
import V2.e;

public final class G implements e
{
    public final z2.e a;
    public final int b;
    public final b c;
    public final long d;
    public final long e;
    
    public G(final z2.e a, final int b, final b c, final long d, final long e, final String s, final String s2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static G b(final z2.e e, final int n, final b b) {
        if (!e.f()) {
            return null;
        }
        final p a = o.b().a();
        boolean i;
        if (a != null) {
            if (!a.f()) {
                return null;
            }
            final boolean g = a.g();
            final x w = e.w(b);
            i = g;
            if (w != null) {
                if (!(w.t() instanceof c)) {
                    return null;
                }
                final c c = (c)w.t();
                i = g;
                if (c.J()) {
                    i = g;
                    if (!c.i()) {
                        final A2.e c2 = c(w, c, n);
                        if (c2 == null) {
                            return null;
                        }
                        w.F();
                        i = c2.i();
                    }
                }
            }
        }
        else {
            i = true;
        }
        long currentTimeMillis;
        if (i) {
            currentTimeMillis = System.currentTimeMillis();
        }
        else {
            currentTimeMillis = 0L;
        }
        long elapsedRealtime;
        if (i) {
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        else {
            elapsedRealtime = 0L;
        }
        return new G(e, n, b, currentTimeMillis, elapsedRealtime, null, null);
    }
    
    public static A2.e c(final x x, final c c, final int n) {
        final A2.e h = c.H();
        if (h != null && h.g()) {
            final int[] d = h.d();
            if (d == null) {
                final int[] f = h.f();
                if (f != null) {
                    if (E2.b.a(f, n)) {
                        return null;
                    }
                }
            }
            else if (!E2.b.a(d, n)) {
                return null;
            }
            if (x.r() < h.a()) {
                return h;
            }
        }
        return null;
    }
    
    @Override
    public final void a(final j j) {
        if (!this.a.f()) {
            return;
        }
        final p a = o.b().a();
        if (a != null && !a.f()) {
            return;
        }
        final x w = this.a.w(this.c);
        if (w != null) {
            if (!(w.t() instanceof c)) {
                return;
            }
            final c c = (c)w.t();
            final long d = this.d;
            final boolean b = true;
            final boolean b2 = false;
            final boolean b3 = d > 0L;
            final int z = c.z();
            int a2;
            int i;
            int n;
            boolean b6;
            if (a != null) {
                final boolean b4 = b3 & a.g();
                a2 = a.a();
                final int d2 = a.d();
                i = a.i();
                boolean b5 = b4;
                int a3 = d2;
                if (c.J()) {
                    b5 = b4;
                    a3 = d2;
                    if (!c.i()) {
                        final A2.e c2 = c(w, c, this.b);
                        if (c2 == null) {
                            return;
                        }
                        b5 = (c2.i() && this.d > 0L && b);
                        a3 = c2.a();
                    }
                }
                n = a3;
                b6 = b5;
            }
            else {
                i = 0;
                n = 100;
                a2 = 5000;
                b6 = b3;
            }
            final z2.e a4 = this.a;
            int n2 = 0;
            int n3 = 0;
            Label_0341: {
                if (j.n()) {
                    n2 = 0;
                    n3 = (b2 ? 1 : 0);
                }
                else {
                    if (j.l()) {
                        n3 = 100;
                    }
                    else {
                        final Exception k = j.i();
                        if (k instanceof y2.b) {
                            final Status a5 = ((y2.b)k).a();
                            final int d3 = a5.d();
                            final x2.b a6 = a5.a();
                            int a7;
                            if (a6 == null) {
                                a7 = -1;
                            }
                            else {
                                a7 = a6.a();
                            }
                            n2 = a7;
                            n3 = d3;
                            break Label_0341;
                        }
                        n3 = 101;
                    }
                    n2 = -1;
                }
            }
            long d4;
            long currentTimeMillis;
            int n4;
            if (b6) {
                d4 = this.d;
                currentTimeMillis = System.currentTimeMillis();
                n4 = (int)(SystemClock.elapsedRealtime() - this.e);
            }
            else {
                d4 = (currentTimeMillis = 0L);
                n4 = -1;
            }
            a4.E(new l(this.b, n3, n2, d4, currentTimeMillis, null, null, z, n4), i, a2, n);
        }
    }
}
