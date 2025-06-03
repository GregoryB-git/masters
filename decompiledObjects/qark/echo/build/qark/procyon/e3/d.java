// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e3;

import java.security.GeneralSecurityException;
import q3.f;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;

public abstract class d
{
    public int[] a;
    public final int b;
    
    public d(final byte[] array, final int b) {
        if (array.length == 32) {
            this.a = e3.a.e(array);
            this.b = b;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }
    
    public ByteBuffer a(final byte[] array, int i) {
        final int[] b = this.b(e3.a.e(array), i);
        final int[] array2 = b.clone();
        e3.a.d(array2);
        for (i = 0; i < b.length; ++i) {
            b[i] += array2[i];
        }
        final ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }
    
    public abstract int[] b(final int[] p0, final int p1);
    
    public byte[] c(final byte[] array, final ByteBuffer byteBuffer) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        this.f(array, allocate, byteBuffer);
        return allocate.array();
    }
    
    public void d(final ByteBuffer byteBuffer, final byte[] array, final byte[] array2) {
        if (byteBuffer.remaining() >= array2.length) {
            this.f(array, byteBuffer, ByteBuffer.wrap(array2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }
    
    public abstract int e();
    
    public final void f(final byte[] array, final ByteBuffer byteBuffer, final ByteBuffer byteBuffer2) {
        if (array.length == this.e()) {
            final int remaining = byteBuffer2.remaining();
            for (int n = remaining / 64, i = 0; i < n + 1; ++i) {
                final ByteBuffer a = this.a(array, this.b + i);
                int n2 = 64;
                if (i == n) {
                    n2 = remaining % 64;
                }
                f.c(byteBuffer, byteBuffer2, a, n2);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("The nonce length (in bytes) must be ");
        sb.append(this.e());
        throw new GeneralSecurityException(sb.toString());
    }
}
