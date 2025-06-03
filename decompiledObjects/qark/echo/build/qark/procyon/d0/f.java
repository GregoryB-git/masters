// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

public abstract class f implements D
{
    public final I.c a;
    
    public f() {
        this.a = new I.c();
    }
    
    @Override
    public final boolean B() {
        return this.b() != -1;
    }
    
    @Override
    public final boolean G() {
        return this.c() != -1;
    }
    
    @Override
    public final boolean I() {
        final I l = this.L();
        return !l.q() && l.n(this.E(), this.a).i;
    }
    
    @Override
    public final int M() {
        return this.L().p();
    }
    
    @Override
    public final boolean Q() {
        final I l = this.L();
        return !l.q() && l.n(this.E(), this.a).f();
    }
    
    public final int R() {
        int q;
        if ((q = this.q()) == 1) {
            q = 0;
        }
        return q;
    }
    
    public final void S(final int n) {
        this.U(-1, -9223372036854775807L, n, false);
    }
    
    public final void T(final int n) {
        this.U(this.E(), -9223372036854775807L, n, true);
    }
    
    public abstract void U(final int p0, final long p1, final int p2, final boolean p3);
    
    public final void V(final int n, final int n2) {
        this.U(n, -9223372036854775807L, n2, false);
    }
    
    public final void W(final int n) {
        final int b = this.b();
        if (b == -1) {
            this.S(n);
            return;
        }
        if (b == this.E()) {
            this.T(n);
            return;
        }
        this.V(b, n);
    }
    
    public final long a() {
        final I l = this.L();
        if (l.q()) {
            return -9223372036854775807L;
        }
        return l.n(this.E(), this.a).d();
    }
    
    public final int b() {
        final I l = this.L();
        if (l.q()) {
            return -1;
        }
        return l.e(this.E(), this.R(), this.N());
    }
    
    public final int c() {
        final I l = this.L();
        if (l.q()) {
            return -1;
        }
        return l.l(this.E(), this.R(), this.N());
    }
    
    @Override
    public final void s(final int n, final long n2) {
        this.U(n, n2, 10, false);
    }
    
    @Override
    public final boolean w() {
        final I l = this.L();
        return !l.q() && l.n(this.E(), this.a).h;
    }
    
    @Override
    public final void y() {
        this.W(8);
    }
}
