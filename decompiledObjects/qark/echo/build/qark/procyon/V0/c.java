// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V0;

import d0.x;
import java.nio.ByteBuffer;
import O0.b;
import g0.E;
import g0.y;
import g0.z;

public final class c extends O0.c
{
    public final z a;
    public final y b;
    public E c;
    
    public c() {
        this.a = new z();
        this.b = new y();
    }
    
    @Override
    public x b(final b b, final ByteBuffer byteBuffer) {
        final E c = this.c;
        if (c == null || b.x != c.f()) {
            (this.c = new E(b.t)).a(b.t - b.x);
        }
        final byte[] array = byteBuffer.array();
        final int limit = byteBuffer.limit();
        this.a.R(array, limit);
        this.b.o(array, limit);
        this.b.r(39);
        final long n = (long)this.b.h(1) << 32 | (long)this.b.h(32);
        this.b.r(20);
        final int h = this.b.h(12);
        final int h2 = this.b.h(8);
        this.a.U(14);
        x.b b2;
        if (h2 != 0) {
            if (h2 != 255) {
                if (h2 != 4) {
                    if (h2 != 5) {
                        if (h2 != 6) {
                            b2 = null;
                        }
                        else {
                            b2 = g.a(this.a, n, this.c);
                        }
                    }
                    else {
                        b2 = d.a(this.a, n, this.c);
                    }
                }
                else {
                    b2 = f.a(this.a);
                }
            }
            else {
                b2 = V0.a.a(this.a, h, n);
            }
        }
        else {
            b2 = new e();
        }
        if (b2 == null) {
            return new x(new x.b[0]);
        }
        return new x(new x.b[] { b2 });
    }
}
