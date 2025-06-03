// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j0;

import d0.v;
import java.nio.ByteBuffer;
import d0.q;

public class i extends j0.a
{
    public q p;
    public final c q;
    public ByteBuffer r;
    public boolean s;
    public long t;
    public ByteBuffer u;
    public final int v;
    public final int w;
    
    static {
        v.a("media3.decoder");
    }
    
    public i(final int n) {
        this(n, 0);
    }
    
    public i(final int v, final int w) {
        this.q = new c();
        this.v = v;
        this.w = w;
    }
    
    public static i F() {
        return new i(0);
    }
    
    public final void C() {
        final ByteBuffer r = this.r;
        if (r != null) {
            r.flip();
        }
        final ByteBuffer u = this.u;
        if (u != null) {
            u.flip();
        }
    }
    
    public final boolean D() {
        return this.n(1073741824);
    }
    
    public void G(final int capacity) {
        final ByteBuffer u = this.u;
        if (u != null && u.capacity() >= capacity) {
            this.u.clear();
            return;
        }
        this.u = ByteBuffer.allocate(capacity);
    }
    
    @Override
    public void m() {
        super.m();
        final ByteBuffer r = this.r;
        if (r != null) {
            r.clear();
        }
        final ByteBuffer u = this.u;
        if (u != null) {
            u.clear();
        }
        this.s = false;
    }
    
    public final ByteBuffer x(final int n) {
        final int v = this.v;
        if (v == 1) {
            return ByteBuffer.allocate(n);
        }
        if (v == 2) {
            return ByteBuffer.allocateDirect(n);
        }
        final ByteBuffer r = this.r;
        int capacity;
        if (r == null) {
            capacity = 0;
        }
        else {
            capacity = r.capacity();
        }
        throw new a(capacity, n);
    }
    
    public void z(int capacity) {
        final int n = capacity + this.w;
        final ByteBuffer r = this.r;
        if (r == null) {
            this.r = this.x(n);
            return;
        }
        capacity = r.capacity();
        final int position = r.position();
        final int n2 = n + position;
        if (capacity >= n2) {
            this.r = r;
            return;
        }
        final ByteBuffer x = this.x(n2);
        x.order(r.order());
        if (position > 0) {
            r.flip();
            x.put(r);
        }
        this.r = x;
    }
    
    public static final class a extends IllegalStateException
    {
        public final int o;
        public final int p;
        
        public a(final int n, final int n2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Buffer too small (");
            sb.append(n);
            sb.append(" < ");
            sb.append(n2);
            sb.append(")");
            super(sb.toString());
            this.o = n;
            this.p = n2;
        }
    }
}
