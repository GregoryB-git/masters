// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class r implements i
{
    public static final Charset a;
    public static final r b;
    
    static {
        a = Charset.forName("UTF8");
        b = new r();
    }
    
    public String c(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        final int remaining = byteBuffer.remaining();
        int arrayOffset;
        byte[] bytes;
        if (byteBuffer.hasArray()) {
            final byte[] array = byteBuffer.array();
            arrayOffset = byteBuffer.arrayOffset();
            bytes = array;
        }
        else {
            final byte[] dst = new byte[remaining];
            byteBuffer.get(dst);
            arrayOffset = 0;
            bytes = dst;
        }
        return new String(bytes, arrayOffset, remaining, r.a);
    }
    
    public ByteBuffer d(final String s) {
        if (s == null) {
            return null;
        }
        final byte[] bytes = s.getBytes(r.a);
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
