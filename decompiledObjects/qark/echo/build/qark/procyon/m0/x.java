// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import g0.M;
import g0.a;
import android.os.Handler;
import k0.p;
import d0.q;
import k0.o;

public interface x
{
    void A(final o p0);
    
    void a(final z.a p0);
    
    void c(final boolean p0);
    
    void d(final Exception p0);
    
    void e(final z.a p0);
    
    void f(final o p0);
    
    void l(final long p0);
    
    void p(final Exception p0);
    
    void s(final String p0);
    
    void t(final String p0, final long p1, final long p2);
    
    void v(final int p0, final long p1, final long p2);
    
    void z(final q p0, final p p1);
    
    public static final class a
    {
        public final Handler a;
        public final x b;
        
        public a(Handler a, final x b) {
            if (b != null) {
                a = (Handler)g0.a.e(a);
            }
            else {
                a = null;
            }
            this.a = a;
            this.b = b;
        }
        
        public void H(final long n) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new u(this, n));
            }
        }
        
        public void I(final boolean b) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new w(this, b));
            }
        }
        
        public void J(final int n, final long n2, final long n3) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new v(this, n, n2, n3));
            }
        }
        
        public void m(final Exception ex) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new m0.o(this, ex));
            }
        }
        
        public void n(final Exception ex) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new m0.p(this, ex));
            }
        }
        
        public void o(final z.a a) {
            final Handler a2 = this.a;
            if (a2 != null) {
                a2.post((Runnable)new m(this, a));
            }
        }
        
        public void p(final z.a a) {
            final Handler a2 = this.a;
            if (a2 != null) {
                a2.post((Runnable)new n(this, a));
            }
        }
        
        public void q(final String s, final long n, final long n2) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new r(this, s, n, n2));
            }
        }
        
        public void r(final String s) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new s(this, s));
            }
        }
        
        public void s(final o o) {
            o.c();
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new t(this, o));
            }
        }
        
        public void t(final o o) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new l(this, o));
            }
        }
        
        public void u(final q q, final p p2) {
            final Handler a = this.a;
            if (a != null) {
                a.post((Runnable)new m0.q(this, q, p2));
            }
        }
    }
}
