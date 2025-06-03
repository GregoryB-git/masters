// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.nio.ByteBuffer;
import e3.h;
import c3.a;

public final class s implements a
{
    public final h a;
    
    public s(final byte[] array) {
        this.a = new h(array);
    }
    
    @Override
    public byte[] a(final byte[] array, final byte[] array2) {
        final ByteBuffer allocate = ByteBuffer.allocate(array.length + 40);
        final byte[] c = p.c(24);
        allocate.put(c);
        this.a.b(allocate, c, array, array2);
        return allocate.array();
    }
    
    @Override
    public byte[] b(final byte[] array, final byte[] array2) {
        if (array.length >= 40) {
            return this.a.a(ByteBuffer.wrap(array, 24, array.length - 24), Arrays.copyOf(array, 24), array2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
