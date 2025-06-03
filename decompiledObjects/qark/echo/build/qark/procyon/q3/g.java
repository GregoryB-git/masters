// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.nio.ByteBuffer;
import e3.e;
import c3.a;

public final class g implements a
{
    public final e a;
    
    public g(final byte[] array) {
        this.a = new e(array);
    }
    
    @Override
    public byte[] a(final byte[] array, final byte[] array2) {
        final ByteBuffer allocate = ByteBuffer.allocate(array.length + 28);
        final byte[] c = p.c(12);
        allocate.put(c);
        this.a.b(allocate, c, array, array2);
        return allocate.array();
    }
    
    @Override
    public byte[] b(final byte[] array, final byte[] array2) {
        if (array.length >= 28) {
            return this.a.a(ByteBuffer.wrap(array, 12, array.length - 12), Arrays.copyOf(array, 12), array2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
