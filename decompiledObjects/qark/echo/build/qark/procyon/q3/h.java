// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.nio.ByteBuffer;
import c3.t;
import c3.a;

public final class h implements a
{
    public final l a;
    public final t b;
    public final int c;
    
    public h(final l a, final t b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public byte[] a(byte[] array, byte[] copy) {
        final byte[] a = this.a.a(array);
        array = copy;
        if (copy == null) {
            array = new byte[0];
        }
        copy = Arrays.copyOf(ByteBuffer.allocate(8).putLong(array.length * 8L).array(), 8);
        return f.a(new byte[][] { a, this.b.b(f.a(new byte[][] { array, a, copy })) });
    }
    
    @Override
    public byte[] b(byte[] array, byte[] copy) {
        final int length = array.length;
        final int c = this.c;
        if (length >= c) {
            final byte[] copyOfRange = Arrays.copyOfRange(array, 0, array.length - c);
            final byte[] copyOfRange2 = Arrays.copyOfRange(array, array.length - this.c, array.length);
            if ((array = copy) == null) {
                array = new byte[0];
            }
            copy = Arrays.copyOf(ByteBuffer.allocate(8).putLong(array.length * 8L).array(), 8);
            this.b.a(copyOfRange2, f.a(new byte[][] { array, copyOfRange, copy }));
            return this.a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
