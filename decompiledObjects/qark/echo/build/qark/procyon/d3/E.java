// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.nio.BufferUnderflowException;
import java.security.GeneralSecurityException;
import java.nio.ByteBuffer;
import c3.x;
import p3.A;
import c3.a;

public final class E implements a
{
    public static final byte[] c;
    public final A a;
    public final a b;
    
    static {
        c = new byte[0];
    }
    
    public E(final A a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public byte[] a(final byte[] array, final byte[] array2) {
        final byte[] f = x.j(this.a).f();
        return this.c(this.b.a(f, E.c), ((a)x.f(this.a.a0(), f, a.class)).a(array, array2));
    }
    
    @Override
    public byte[] b(byte[] array, final byte[] array2) {
        try {
            final ByteBuffer wrap = ByteBuffer.wrap(array);
            final int int1 = wrap.getInt();
            if (int1 > 0 && int1 <= array.length - 4) {
                final byte[] dst = new byte[int1];
                wrap.get(dst, 0, int1);
                array = new byte[wrap.remaining()];
                wrap.get(array, 0, wrap.remaining());
                return ((a)x.f(this.a.a0(), this.b.b(dst, E.c), a.class)).b(array, array2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        }
        catch (NegativeArraySizeException cause) {
            throw new GeneralSecurityException("invalid ciphertext", cause);
        }
        catch (BufferUnderflowException cause) {
            throw new GeneralSecurityException("invalid ciphertext", cause);
        }
        catch (IndexOutOfBoundsException cause) {
            throw new GeneralSecurityException("invalid ciphertext", cause);
        }
    }
    
    public final byte[] c(final byte[] src, final byte[] src2) {
        return ByteBuffer.allocate(src.length + 4 + src2.length).putInt(src.length).put(src).put(src2).array();
    }
}
