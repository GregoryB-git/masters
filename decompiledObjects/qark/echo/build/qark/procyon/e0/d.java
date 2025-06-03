// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e0;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public abstract class d implements b
{
    public a b;
    public a c;
    public a d;
    public a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;
    
    public d() {
        final ByteBuffer a = e0.b.a;
        this.f = a;
        this.g = a;
        final a e = e0.b.a.e;
        this.d = e;
        this.e = e;
        this.b = e;
        this.c = e;
    }
    
    @Override
    public boolean a() {
        return this.e != e0.b.a.e;
    }
    
    @Override
    public final void b() {
        this.flush();
        this.f = e0.b.a;
        final a e = e0.b.a.e;
        this.d = e;
        this.e = e;
        this.b = e;
        this.c = e;
        this.l();
    }
    
    @Override
    public boolean c() {
        return this.h && this.g == e0.b.a;
    }
    
    @Override
    public ByteBuffer d() {
        final ByteBuffer g = this.g;
        this.g = e0.b.a;
        return g;
    }
    
    @Override
    public final void e() {
        this.h = true;
        this.k();
    }
    
    @Override
    public final void flush() {
        this.g = e0.b.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        this.j();
    }
    
    @Override
    public final a g(final a d) {
        this.d = d;
        this.e = this.i(d);
        if (this.a()) {
            return this.e;
        }
        return e0.b.a.e;
    }
    
    public final boolean h() {
        return this.g.hasRemaining();
    }
    
    public abstract a i(final a p0);
    
    public void j() {
    }
    
    public void k() {
    }
    
    public void l() {
    }
    
    public final ByteBuffer m(final int capacity) {
        if (this.f.capacity() < capacity) {
            this.f = ByteBuffer.allocateDirect(capacity).order(ByteOrder.nativeOrder());
        }
        else {
            this.f.clear();
        }
        return this.g = this.f;
    }
}
