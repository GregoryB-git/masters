// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.media3.exoplayer.dash;

import d0.x;
import F0.S;
import d0.q;
import d0.i;
import g0.z;
import k0.v0;
import x0.P;
import F0.T;
import java.util.Iterator;
import y0.e;
import android.os.Message;
import java.util.Map;
import d0.A;
import Q0.a;
import g0.M;
import o0.c;
import java.util.TreeMap;
import android.os.Handler;
import B0.b;
import android.os.Handler$Callback;

public final class d implements Handler$Callback
{
    public final B0.b o;
    public final b p;
    public final Q0.b q;
    public final Handler r;
    public final TreeMap s;
    public o0.c t;
    public long u;
    public boolean v;
    public boolean w;
    public boolean x;
    
    public d(final o0.c t, final b p3, final B0.b o) {
        this.t = t;
        this.p = p3;
        this.o = o;
        this.s = new TreeMap();
        this.r = M.B((Handler$Callback)this);
        this.q = new Q0.b();
    }
    
    public static /* synthetic */ Q0.b a(final d d) {
        return d.q;
    }
    
    public static /* synthetic */ Handler d(final d d) {
        return d.r;
    }
    
    public static long f(final Q0.a a) {
        try {
            return M.Q0(M.H(a.s));
        }
        catch (A a2) {
            return -9223372036854775807L;
        }
    }
    
    public static boolean h(final String anObject, final String anObject2) {
        return "urn:mpeg:dash:event:2012".equals(anObject) && ("1".equals(anObject2) || "2".equals(anObject2) || "3".equals(anObject2));
    }
    
    public final Map.Entry e(final long l) {
        return (Map.Entry)this.s.ceilingEntry(l);
    }
    
    public final void g(final long l, final long n) {
        final Long n2 = this.s.get(n);
        if (n2 != null && n2 <= l) {
            return;
        }
        this.s.put(n, l);
    }
    
    public boolean handleMessage(final Message message) {
        if (this.x) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        final a a = (a)message.obj;
        this.g(a.a, a.b);
        return true;
    }
    
    public final void i() {
        if (!this.v) {
            return;
        }
        this.w = true;
        this.v = false;
        this.p.a();
    }
    
    public boolean j(final long n) {
        final o0.c t = this.t;
        final boolean d = t.d;
        final boolean b = false;
        if (!d) {
            return false;
        }
        if (this.w) {
            return true;
        }
        final Map.Entry e = this.e(t.h);
        boolean b2 = b;
        if (e != null) {
            b2 = b;
            if (e.getValue() < n) {
                this.u = e.getKey();
                this.l();
                b2 = true;
            }
        }
        if (b2) {
            this.i();
        }
        return b2;
    }
    
    public c k() {
        return new c(this.o);
    }
    
    public final void l() {
        this.p.b(this.u);
    }
    
    public void m(final e e) {
        this.v = true;
    }
    
    public boolean n(final boolean b) {
        if (!this.t.d) {
            return false;
        }
        if (this.w) {
            return true;
        }
        if (b) {
            this.i();
            return true;
        }
        return false;
    }
    
    public void o() {
        this.x = true;
        this.r.removeCallbacksAndMessages((Object)null);
    }
    
    public final void p() {
        final Iterator<Map.Entry<Long, V>> iterator = this.s.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey() < this.t.h) {
                iterator.remove();
            }
        }
    }
    
    public void q(final o0.c t) {
        this.w = false;
        this.u = -9223372036854775807L;
        this.t = t;
        this.p();
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public interface b
    {
        void a();
        
        void b(final long p0);
    }
    
    public final class c implements T
    {
        public final P a;
        public final v0 b;
        public final O0.b c;
        public long d;
        
        public c(final B0.b b) {
            this.a = P.l(b);
            this.b = new v0();
            this.c = new O0.b();
            this.d = -9223372036854775807L;
        }
        
        @Override
        public void a(final z z, final int n, final int n2) {
            this.a.e(z, n);
        }
        
        @Override
        public void b(final long n, final int n2, final int n3, final int n4, final T.a a) {
            this.a.b(n, n2, n3, n4, a);
            this.l();
        }
        
        @Override
        public int c(final i i, final int n, final boolean b, final int n2) {
            return this.a.f(i, n, b);
        }
        
        @Override
        public void d(final q q) {
            this.a.d(q);
        }
        
        public final O0.b g() {
            this.c.m();
            if (this.a.T(this.b, this.c, 0, false) == -4) {
                this.c.C();
                return this.c;
            }
            return null;
        }
        
        public boolean h(final long n) {
            return androidx.media3.exoplayer.dash.d.this.j(n);
        }
        
        public void i(final e e) {
            final long d = this.d;
            if (d == -9223372036854775807L || e.h > d) {
                this.d = e.h;
            }
            androidx.media3.exoplayer.dash.d.this.m(e);
        }
        
        public boolean j(final e e) {
            final long d = this.d;
            return androidx.media3.exoplayer.dash.d.this.n(d != -9223372036854775807L && d < e.g);
        }
        
        public final void k(final long n, final long n2) {
            androidx.media3.exoplayer.dash.d.d(androidx.media3.exoplayer.dash.d.this).sendMessage(androidx.media3.exoplayer.dash.d.d(androidx.media3.exoplayer.dash.d.this).obtainMessage(1, (Object)new d.a(n, n2)));
        }
        
        public final void l() {
            while (this.a.L(false)) {
                final O0.b g = this.g();
                if (g == null) {
                    continue;
                }
                final long t = g.t;
                final x a = androidx.media3.exoplayer.dash.d.a(androidx.media3.exoplayer.dash.d.this).a(g);
                if (a == null) {
                    continue;
                }
                final a a2 = (a)a.d(0);
                if (!h(a2.o, a2.p)) {
                    continue;
                }
                this.m(t, a2);
            }
            this.a.s();
        }
        
        public final void m(final long n, final a a) {
            final long c = f(a);
            if (c == -9223372036854775807L) {
                return;
            }
            this.k(n, c);
        }
        
        public void n() {
            this.a.U();
        }
    }
}
