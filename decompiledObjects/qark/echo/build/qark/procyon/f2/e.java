// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import h2.b;
import m2.w;
import m2.s;
import n2.N;
import n2.h;
import n2.V;
import n2.i;
import n2.g;
import g2.l;
import g2.j;
import h2.c;
import n2.d;
import android.content.Context;
import U5.a;

public final class e extends v
{
    public U5.a A;
    public U5.a o;
    public U5.a p;
    public U5.a q;
    public U5.a r;
    public U5.a s;
    public U5.a t;
    public U5.a u;
    public U5.a v;
    public U5.a w;
    public U5.a x;
    public U5.a y;
    public U5.a z;
    
    public e(final Context context) {
        this.e(context);
    }
    
    public static a c() {
        return new b(null);
    }
    
    @Override
    public d a() {
        return (d)this.u.get();
    }
    
    @Override
    public u b() {
        return (u)this.A.get();
    }
    
    public final void e(final Context context) {
        this.o = h2.a.a(k.a());
        final h2.b a = c.a(context);
        this.p = a;
        final j a2 = j.a(a, p2.c.a(), p2.d.a());
        this.q = a2;
        this.r = h2.a.a(l.a(this.p, a2));
        this.s = V.a(this.p, g.a(), i.a());
        this.t = h2.a.a(h.a(this.p));
        this.u = h2.a.a(N.a(p2.c.a(), p2.d.a(), n2.j.a(), this.s, this.t));
        final l2.g b = l2.g.b(p2.c.a());
        this.v = b;
        final l2.i a3 = l2.i.a(this.p, this.u, b, p2.d.a());
        this.w = a3;
        final U5.a o = this.o;
        final U5.a r = this.r;
        final U5.a u = this.u;
        this.x = l2.d.a(o, r, a3, u, u);
        final U5.a p = this.p;
        final U5.a r2 = this.r;
        final U5.a u2 = this.u;
        this.y = m2.s.a(p, r2, u2, this.w, this.o, u2, p2.c.a(), p2.d.a(), this.u);
        final U5.a o2 = this.o;
        final U5.a u3 = this.u;
        this.z = m2.w.a(o2, u3, this.w, u3);
        this.A = h2.a.a(f2.w.a(p2.c.a(), p2.d.a(), this.x, this.y, this.z));
    }
    
    public static final class b implements a
    {
        public Context a;
        
        @Override
        public v a() {
            h2.d.a(this.a, Context.class);
            return new e(this.a, null);
        }
        
        public b c(final Context context) {
            this.a = (Context)h2.d.b(context);
            return this;
        }
    }
}
