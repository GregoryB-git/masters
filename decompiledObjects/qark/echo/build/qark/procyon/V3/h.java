// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import Y3.m;
import a4.e;
import a4.d;
import a4.c;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class h
{
    public AtomicBoolean a;
    public i b;
    public boolean c;
    
    public h() {
        this.a = new AtomicBoolean(false);
        this.c = false;
    }
    
    public abstract h a(final a4.i p0);
    
    public abstract d b(final c p0, final a4.i p1);
    
    public abstract void c(final Q3.c p0);
    
    public abstract void d(final d p0);
    
    public abstract a4.i e();
    
    public abstract boolean f(final h p0);
    
    public boolean g() {
        return this.c;
    }
    
    public boolean h() {
        return this.a.get();
    }
    
    public abstract boolean i(final e.a p0);
    
    public void j(final boolean c) {
        this.c = c;
    }
    
    public void k(final i b) {
        final boolean h = this.h();
        boolean b2 = true;
        m.f(h ^ true);
        if (this.b != null) {
            b2 = false;
        }
        m.f(b2);
        this.b = b;
    }
    
    public void l() {
        if (this.a.compareAndSet(false, true)) {
            final i b = this.b;
            if (b != null) {
                b.a(this);
                this.b = null;
            }
        }
    }
}
