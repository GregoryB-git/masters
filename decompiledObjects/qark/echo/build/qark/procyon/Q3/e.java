// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import d4.o;
import Z3.a;
import V3.C;
import d4.b;
import Y3.g;
import V2.j;
import Y3.n;
import V3.k;
import V3.m;

public class e extends p
{
    public e(final m m, final k k) {
        super(m, k);
    }
    
    public e W(final String s) {
        if (s != null) {
            if (this.s().isEmpty()) {
                n.i(s);
            }
            else {
                n.h(s);
            }
            return new e(super.a, this.s().T(new k(s)));
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
    }
    
    public String X() {
        if (this.s().isEmpty()) {
            return null;
        }
        return this.s().X().e();
    }
    
    public e Y() {
        final k a0 = this.s().a0();
        if (a0 != null) {
            return new e(super.a, a0);
        }
        return null;
    }
    
    public Q3.n Z() {
        n.l(this.s());
        return new Q3.n(super.a, this.s());
    }
    
    public void a0(final r.b b, final boolean b2) {
        if (b != null) {
            n.l(this.s());
            super.a.i0(new Runnable() {
                @Override
                public void run() {
                    final e q = e.this;
                    q.a.n0(q.s(), b, b2);
                }
            });
            return;
        }
        throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
    }
    
    public j b0(final Object o) {
        return this.c0(d4.r.c(super.b, o), null);
    }
    
    public final j c0(final d4.n n, final e e) {
        n.l(this.s());
        final g l = Y3.m.l(e);
        super.a.i0(new Runnable() {
            @Override
            public void run() {
                final e q = e.this;
                q.a.m0(q.s().U(d4.b.o()), n, (e)l.b());
            }
        });
        return (j)l.a();
    }
    
    public j d0(final Object o) {
        return this.f0(o, d4.r.c(super.b, null), null);
    }
    
    public j e0(final Object o, final Object o2) {
        return this.f0(o, d4.r.c(super.b, o2), null);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof e && this.toString().equals(o.toString());
    }
    
    public final j f0(Object b, final d4.n n, final e e) {
        n.l(this.s());
        C.g(this.s(), b);
        b = Z3.a.b(b);
        n.k(b);
        final d4.n b2 = o.b(b, n);
        final g l = Y3.m.l(e);
        super.a.i0(new Runnable() {
            @Override
            public void run() {
                final e q = e.this;
                q.a.m0(q.s(), b2, (e)l.b());
            }
        });
        return (j)l.a();
    }
    
    public j g0(final Map map) {
        return this.h0(map, null);
    }
    
    public final j h0(Map c, final e e) {
        if (c != null) {
            c = Z3.a.c(c);
            final V3.b d = V3.b.D(n.e(this.s(), c));
            final g l = Y3.m.l(e);
            super.a.i0(new Runnable() {
                @Override
                public void run() {
                    final e r = e.this;
                    r.a.o0(r.s(), d, (e)l.b(), c);
                }
            });
            return (j)l.a();
        }
        throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
    }
    
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public String toString() {
        final e y = this.Y();
        if (y == null) {
            return super.a.toString();
        }
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append(y.toString());
            sb.append("/");
            sb.append(URLEncoder.encode(this.X(), "UTF-8").replace("+", "%20"));
            return sb.toString();
        }
        catch (UnsupportedEncodingException ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to URLEncode key: ");
            sb2.append(this.X());
            throw new d(sb2.toString(), ex);
        }
    }
    
    public interface e
    {
        void a(final c p0, final Q3.e p1);
    }
}
