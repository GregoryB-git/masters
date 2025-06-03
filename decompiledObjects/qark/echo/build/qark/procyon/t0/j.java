// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import java.nio.ByteBuffer;
import g0.a;
import j0.i;

public final class j extends i
{
    public long x;
    public int y;
    public int z;
    
    public j() {
        super(2);
        this.z = 32;
    }
    
    public boolean H(final i i) {
        g0.a.a(i.D() ^ true);
        g0.a.a(i.o() ^ true);
        g0.a.a(i.p() ^ true);
        if (!this.K(i)) {
            return false;
        }
        if (this.y++ == 0) {
            super.t = i.t;
            if (i.s()) {
                this.w(1);
            }
        }
        final ByteBuffer r = i.r;
        if (r != null) {
            this.z(r.remaining());
            super.r.put(r);
        }
        this.x = i.t;
        return true;
    }
    
    public final boolean K(final i i) {
        if (!this.U()) {
            return true;
        }
        if (this.y >= this.z) {
            return false;
        }
        final ByteBuffer r = i.r;
        if (r != null) {
            final ByteBuffer r2 = super.r;
            if (r2 != null && r2.position() + r.remaining() > 3072000) {
                return false;
            }
        }
        return true;
    }
    
    public long M() {
        return super.t;
    }
    
    public long S() {
        return this.x;
    }
    
    public int T() {
        return this.y;
    }
    
    public boolean U() {
        return this.y > 0;
    }
    
    public void V(final int z) {
        g0.a.a(z > 0);
        this.z = z;
    }
    
    @Override
    public void m() {
        super.m();
        this.y = 0;
    }
}
