// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q0;

import java.util.Arrays;
import g0.z;
import d0.x;
import java.nio.ByteBuffer;
import O0.c;

public final class b extends c
{
    @Override
    public x b(final O0.b b, final ByteBuffer byteBuffer) {
        return new x(new x.b[] { this.c(new z(byteBuffer.array(), byteBuffer.limit())) });
    }
    
    public Q0.a c(final z z) {
        return new Q0.a((String)g0.a.e(z.A()), (String)g0.a.e(z.A()), z.z(), z.z(), Arrays.copyOfRange(z.e(), z.f(), z.g()));
    }
}
