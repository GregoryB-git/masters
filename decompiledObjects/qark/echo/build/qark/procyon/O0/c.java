// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O0;

import java.nio.ByteBuffer;
import d0.x;

public abstract class c implements a
{
    @Override
    public final x a(final b b) {
        final ByteBuffer byteBuffer = (ByteBuffer)g0.a.e(b.r);
        g0.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return this.b(b, byteBuffer);
    }
    
    public abstract x b(final b p0, final ByteBuffer p1);
}
