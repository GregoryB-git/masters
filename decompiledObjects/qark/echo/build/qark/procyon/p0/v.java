// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p0;

import java.util.Iterator;
import g0.M;
import g0.a;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.x;

public interface v
{
    void M(final int p0, final x.b p1, final int p2);
    
    void S(final int p0, final x.b p1);
    
    void T(final int p0, final x.b p1);
    
    void b0(final int p0, final x.b p1);
    
    void d0(final int p0, final x.b p1, final Exception p2);
    
    void g0(final int p0, final x.b p1);
    
    void l0(final int p0, final x.b p1);
    
    public static class a
    {
        public final int a;
        public final x.b b;
        public final CopyOnWriteArrayList c;
        
        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }
        
        public a(final CopyOnWriteArrayList c, final int a, final x.b b) {
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        public void g(final Handler handler, final v v) {
            g0.a.e(handler);
            g0.a.e(v);
            this.c.add(new v.a.a(handler, v));
        }
        
        public void h() {
            for (final v.a.a a : this.c) {
                M.S0(a.a, new u(this, a.b));
            }
        }
        
        public void i() {
            for (final v.a.a a : this.c) {
                M.S0(a.a, new s(this, a.b));
            }
        }
        
        public void j() {
            for (final v.a.a a : this.c) {
                M.S0(a.a, new t(this, a.b));
            }
        }
        
        public void k(final int n) {
            for (final v.a.a a : this.c) {
                M.S0(a.a, new q(this, a.b, n));
            }
        }
        
        public void l(final Exception ex) {
            for (final v.a.a a : this.c) {
                M.S0(a.a, new p(this, a.b, ex));
            }
        }
        
        public void m() {
            for (final v.a.a a : this.c) {
                M.S0(a.a, new r(this, a.b));
            }
        }
        
        public void t(final v v) {
            for (final v.a.a o : this.c) {
                if (o.b == v) {
                    this.c.remove(o);
                }
            }
        }
        
        public v.a u(final int n, final x.b b) {
            return new v.a(this.c, n, b);
        }
        
        public static final class a
        {
            public Handler a;
            public v b;
            
            public a(final Handler a, final v b) {
                this.a = a;
                this.b = b;
            }
        }
    }
}
