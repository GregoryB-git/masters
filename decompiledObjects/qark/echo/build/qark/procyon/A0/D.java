// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A0;

import d0.b;
import d0.I;
import x0.x;
import x0.Z;
import k0.Y0;
import k0.a1;
import d0.K;
import g0.a;
import B0.e;

public abstract class D
{
    public a a;
    public e b;
    
    public final e b() {
        return (e)g0.a.h(this.b);
    }
    
    public abstract K c();
    
    public abstract a1.a d();
    
    public void e(final a a, final e b) {
        this.a = a;
        this.b = b;
    }
    
    public final void f() {
        final a a = this.a;
        if (a != null) {
            a.d();
        }
    }
    
    public final void g(final Y0 y0) {
        final a a = this.a;
        if (a != null) {
            a.a(y0);
        }
    }
    
    public abstract boolean h();
    
    public abstract void i(final Object p0);
    
    public void j() {
        this.a = null;
        this.b = null;
    }
    
    public abstract E k(final a1[] p0, final Z p1, final x.b p2, final I p3);
    
    public abstract void l(final b p0);
    
    public abstract void m(final K p0);
    
    public interface a
    {
        void a(final Y0 p0);
        
        void d();
    }
}
