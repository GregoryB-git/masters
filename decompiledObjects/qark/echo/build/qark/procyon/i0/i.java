// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import g0.a;
import java.io.InputStream;

public final class i extends InputStream
{
    public final g o;
    public final k p;
    public final byte[] q;
    public boolean r;
    public boolean s;
    public long t;
    
    public i(final g o, final k p2) {
        this.r = false;
        this.s = false;
        this.o = o;
        this.p = p2;
        this.q = new byte[1];
    }
    
    public final void a() {
        if (!this.r) {
            this.o.e(this.p);
            this.r = true;
        }
    }
    
    public void b() {
        this.a();
    }
    
    @Override
    public void close() {
        if (!this.s) {
            this.o.close();
            this.s = true;
        }
    }
    
    @Override
    public int read() {
        if (this.read(this.q) == -1) {
            return -1;
        }
        return this.q[0] & 0xFF;
    }
    
    @Override
    public int read(final byte[] array) {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public int read(final byte[] array, int read, final int n) {
        a.f(this.s ^ true);
        this.a();
        read = this.o.read(array, read, n);
        if (read == -1) {
            return -1;
        }
        this.t += read;
        return read;
    }
}
