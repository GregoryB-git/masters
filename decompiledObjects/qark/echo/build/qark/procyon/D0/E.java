// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import g0.M;
import android.os.SystemClock;
import g0.a;
import android.os.Handler;
import k0.p;
import d0.q;
import k0.o;
import d0.P;

public interface E
{
    void b(final P p0);
    
    void g(final String p0);
    
    void h(final Object p0, final long p1);
    
    void i(final String p0, final long p1, final long p2);
    
    void n(final o p0);
    
    void o(final o p0);
    
    void q(final Exception p0);
    
    void u(final q p0, final p p1);
    
    void w(final int p0, final long p1);
    
    void y(final long p0, final int p1);
    
    public static final class a
    {
        public final Handler a;
        public final E b;
        
        public a(Handler a, final E b) {
            if (b != null) {
                a = (Handler)g0.a.e(a);
            }
            else {
                a = null;
            }
            this.a = a;
            this.b = b;
        }
        
        public void A(final Object o) {
            if (this.a != null) {
                this.a.post((Runnable)new x(this, o, SystemClock.elapsedRealtime()));
            }
        }
        
        public void B(final long n, final int n2) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new y(this, n, n2));
            }
        }
        
        public void C(final Exception ex) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new z(this, ex));
            }
        }
        
        public void D(final P p) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new v(this, p));
            }
        }
        
        public void k(final String s, final long n, final long n2) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new u(this, s, n, n2));
            }
        }
        
        public void l(final String s) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new D(this, s));
            }
        }
        
        public void m(final o o) {
            o.c();
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new C(this, o));
            }
        }
        
        public void n(final int n, final long n2) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new w(this, n, n2));
            }
        }
        
        public void o(final o o) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new A(this, o));
            }
        }
        
        public void p(final q q, final p p2) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new B(this, q, p2));
            }
        }
    }
}
