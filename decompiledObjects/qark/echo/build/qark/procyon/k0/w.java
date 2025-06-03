// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import B0.j;
import x0.n;
import F0.m;
import B0.e;
import g0.M;
import g0.a;
import d0.b;
import W2.g;
import W2.s;
import g0.c;
import android.content.Context;
import android.os.Looper;
import x0.x;
import d0.D;

public interface w extends D
{
    void d(final boolean p0);
    
    void e(final x p0);
    
    int j();
    
    void release();
    
    public interface a
    {
        void C(final boolean p0);
        
        void m(final boolean p0);
    }
    
    public static final class b
    {
        public long A;
        public boolean B;
        public boolean C;
        public Looper D;
        public boolean E;
        public boolean F;
        public String G;
        public boolean H;
        public final Context a;
        public g0.c b;
        public long c;
        public s d;
        public s e;
        public s f;
        public s g;
        public s h;
        public g i;
        public Looper j;
        public int k;
        public d0.b l;
        public boolean m;
        public int n;
        public boolean o;
        public boolean p;
        public boolean q;
        public int r;
        public int s;
        public boolean t;
        public d1 u;
        public long v;
        public long w;
        public long x;
        public w0 y;
        public long z;
        
        public b(final Context context) {
            this(context, new y(context), new z(context));
        }
        
        public b(final Context context, final s s, final s s2) {
            this(context, s, s2, new A(context), new B(), new C(context), new k0.D());
        }
        
        public b(final Context context, final s d, final s e, final s f, final s g, final s h, final g i) {
            this.a = (Context)g0.a.e(context);
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = M.U();
            this.l = d0.b.g;
            this.n = 0;
            this.r = 1;
            this.s = 0;
            this.t = true;
            this.u = d1.g;
            this.v = 5000L;
            this.w = 15000L;
            this.x = 3000L;
            this.y = new q.b().a();
            this.b = g0.c.a;
            this.z = 500L;
            this.A = 2000L;
            this.C = true;
            this.G = "";
            this.k = -1000;
        }
        
        public w f() {
            g0.a.f(this.E ^ true);
            this.E = true;
            return new f0(this, null);
        }
        
        public b l(final w0 w0) {
            g0.a.f(this.E ^ true);
            this.y = (w0)g0.a.e(w0);
            return this;
        }
        
        public b m(final x0 x0) {
            g0.a.f(this.E ^ true);
            g0.a.e(x0);
            this.g = new k0.x(x0);
            return this;
        }
    }
    
    public static class c
    {
        public static final c b;
        public final long a;
        
        static {
            b = new c(-9223372036854775807L);
        }
        
        public c(final long a) {
            this.a = a;
        }
    }
}
