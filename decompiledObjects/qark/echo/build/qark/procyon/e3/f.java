// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e3;

import javax.crypto.AEADBadTagException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import h3.b;

public abstract class f
{
    public static final b.b c;
    public final d a;
    public final d b;
    
    static {
        c = b.b.o;
    }
    
    public f(final byte[] array) {
        if (f.c.c()) {
            this.a = this.e(array, 1);
            this.b = this.e(array, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }
    
    public static byte[] d(final byte[] src, final ByteBuffer src2) {
        int length;
        if (src.length % 16 == 0) {
            length = src.length;
        }
        else {
            length = src.length + 16 - src.length % 16;
        }
        final int remaining = src2.remaining();
        final int n = remaining % 16;
        int n2;
        if (n == 0) {
            n2 = remaining;
        }
        else {
            n2 = remaining + 16 - n;
        }
        final int n3 = n2 + length;
        final ByteBuffer order = ByteBuffer.allocate(n3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(src);
        order.position(length);
        order.put(src2);
        order.position(n3);
        order.putLong(src.length);
        order.putLong(remaining);
        return order.array();
    }
    
    public byte[] a(final ByteBuffer byteBuffer, final byte[] array, final byte[] array2) {
        if (byteBuffer.remaining() >= 16) {
            final int position = byteBuffer.position();
            final byte[] dst = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(dst);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] array3;
            if ((array3 = array2) == null) {
                array3 = new byte[0];
            }
            try {
                i.f(this.c(array), d(array3, byteBuffer), dst);
                byteBuffer.position(position);
                return this.a.c(array, byteBuffer);
            }
            catch (GeneralSecurityException ex) {
                throw new AEADBadTagException(ex.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
    
    public void b(final ByteBuffer byteBuffer, byte[] a, byte[] array, final byte[] array2) {
        if (byteBuffer.remaining() >= array.length + 16) {
            final int position = byteBuffer.position();
            this.a.d(byteBuffer, a, array);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if ((array = array2) == null) {
                array = new byte[0];
            }
            a = i.a(this.c(a), d(array, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
    
    public final byte[] c(final byte[] array) {
        final ByteBuffer a = this.b.a(array, 0);
        final byte[] dst = new byte[32];
        a.get(dst);
        return dst;
    }
    
    public abstract d e(final byte[] p0, final int p1);
}
