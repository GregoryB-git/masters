// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import d0.q;
import java.io.EOFException;
import d0.i;
import g0.z;

public final class n implements T
{
    public final byte[] a;
    
    public n() {
        this.a = new byte[4096];
    }
    
    @Override
    public void a(final z z, final int n, final int n2) {
        z.U(n);
    }
    
    @Override
    public void b(final long n, final int n2, final int n3, final int n4, final a a) {
    }
    
    @Override
    public int c(final i i, int b, final boolean b2, final int n) {
        b = Math.min(this.a.length, b);
        b = i.read(this.a, 0, b);
        if (b != -1) {
            return b;
        }
        if (b2) {
            return -1;
        }
        throw new EOFException();
    }
    
    @Override
    public void d(final q q) {
    }
}
