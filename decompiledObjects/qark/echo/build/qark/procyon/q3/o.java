// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.a;
import c3.t;

public class o implements t
{
    public final a a;
    public final int b;
    
    public o(final a a, final int b) {
        this.a = a;
        this.b = b;
        if (b >= 10) {
            a.a(new byte[0], b);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
    
    @Override
    public void a(final byte[] array, final byte[] array2) {
        if (f.b(this.b(array2), array)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }
    
    @Override
    public byte[] b(final byte[] array) {
        return this.a.a(array, this.b);
    }
}
