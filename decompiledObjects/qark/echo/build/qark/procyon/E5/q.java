// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import java.nio.ByteOrder;
import t5.b;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class q implements l
{
    public static final q b;
    public final p a;
    
    static {
        b = new q(p.a);
    }
    
    public q(final p a) {
        this.a = a;
    }
    
    @Override
    public ByteBuffer a(final Object o) {
        final p.a a = new p.a();
        a.write(0);
        this.a.p(a, o);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a.size());
        allocateDirect.put(a.a(), 0, a.size());
        return allocateDirect;
    }
    
    @Override
    public ByteBuffer b(final String s, final String s2, final Object o, final String s3) {
        final p.a a = new p.a();
        a.write(1);
        this.a.p(a, s);
        this.a.p(a, s2);
        if (o instanceof Throwable) {
            this.a.p(a, t5.b.d((Throwable)o));
        }
        else {
            this.a.p(a, o);
        }
        this.a.p(a, s3);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a.size());
        allocateDirect.put(a.a(), 0, a.size());
        return allocateDirect;
    }
    
    @Override
    public ByteBuffer c(final j j) {
        final p.a a = new p.a();
        this.a.p(a, j.a);
        this.a.p(a, j.b);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a.size());
        allocateDirect.put(a.a(), 0, a.size());
        return allocateDirect;
    }
    
    @Override
    public ByteBuffer d(final String s, final String s2, final Object o) {
        final p.a a = new p.a();
        a.write(1);
        this.a.p(a, s);
        this.a.p(a, s2);
        if (o instanceof Throwable) {
            this.a.p(a, t5.b.d((Throwable)o));
        }
        else {
            this.a.p(a, o);
        }
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(a.size());
        allocateDirect.put(a.a(), 0, a.size());
        return allocateDirect;
    }
    
    @Override
    public j e(final ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        final Object f = this.a.f(byteBuffer);
        final Object f2 = this.a.f(byteBuffer);
        if (f instanceof String && !byteBuffer.hasRemaining()) {
            return new j((String)f, f2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }
    
    @Override
    public Object f(final ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        final byte value = byteBuffer.get();
        if (value != 0) {
            if (value != 1) {
                throw new IllegalArgumentException("Envelope corrupted");
            }
        }
        else {
            final Object f = this.a.f(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return f;
            }
        }
        final Object f2 = this.a.f(byteBuffer);
        final Object f3 = this.a.f(byteBuffer);
        final Object f4 = this.a.f(byteBuffer);
        if (f2 instanceof String && (f3 == null || f3 instanceof String) && !byteBuffer.hasRemaining()) {
            throw new e((String)f2, (String)f3, f4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
