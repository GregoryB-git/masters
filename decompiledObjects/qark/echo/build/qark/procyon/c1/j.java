// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c1;

import j0.h;
import g0.a;
import java.nio.ByteBuffer;
import j0.i;
import j0.k;

public abstract class j extends k implements l
{
    public final String o;
    
    public j(final String o) {
        super(new p[2], new q[2]);
        this.o = o;
        this.w(1024);
    }
    
    public final m A(final Throwable t) {
        return new m("Unexpected decode error", t);
    }
    
    public abstract c1.k B(final byte[] p0, final int p1, final boolean p2);
    
    public final m C(final p p3, final q q, final boolean b) {
        try {
            final ByteBuffer byteBuffer = (ByteBuffer)g0.a.e(p3.r);
            q.z(p3.t, this.B(byteBuffer.array(), byteBuffer.limit(), b), p3.x);
            q.r = false;
            return null;
        }
        catch (m m) {
            return m;
        }
    }
    
    @Override
    public void d(final long n) {
    }
    
    public final p y() {
        return new p();
    }
    
    public final q z() {
        return new q() {
            @Override
            public void x() {
                k.this.t(this);
            }
        };
    }
}
