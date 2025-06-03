// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import java.util.List;
import g0.a;
import j0.j;

public abstract class q extends j implements k
{
    public k s;
    public long t;
    
    @Override
    public int c(final long n) {
        return ((k)g0.a.e(this.s)).c(n - this.t);
    }
    
    @Override
    public long e(final int n) {
        return ((k)g0.a.e(this.s)).e(n) + this.t;
    }
    
    @Override
    public List h(final long n) {
        return ((k)g0.a.e(this.s)).h(n - this.t);
    }
    
    @Override
    public int j() {
        return ((k)g0.a.e(this.s)).j();
    }
    
    @Override
    public void m() {
        super.m();
        this.s = null;
    }
    
    public void z(long n, final k s, final long n2) {
        super.p = n;
        this.s = s;
        if (n2 != Long.MAX_VALUE) {
            n = n2;
        }
        this.t = n;
    }
}
