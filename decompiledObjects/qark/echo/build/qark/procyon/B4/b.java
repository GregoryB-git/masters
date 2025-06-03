// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B4;

import N4.d;
import java.lang.ref.WeakReference;

public abstract class b implements B4.a.b
{
    public final a o;
    public final WeakReference p;
    public boolean q;
    public d r;
    
    public b(final a o) {
        this.q = false;
        this.r = d.p;
        this.o = o;
        this.p = new WeakReference((T)this);
    }
    
    @Override
    public void b(d s) {
        final d r = this.r;
        final d p = d.p;
        if (r != p) {
            if (r == s || s == p) {
                return;
            }
            s = d.s;
        }
        this.r = s;
    }
    
    public d c() {
        return this.r;
    }
    
    public void d(final int n) {
        this.o.e(n);
    }
    
    public void e() {
        if (this.q) {
            return;
        }
        this.r = this.o.a();
        this.o.j(this.p);
        this.q = true;
    }
    
    public void f() {
        if (!this.q) {
            return;
        }
        this.o.o(this.p);
        this.q = false;
    }
}
