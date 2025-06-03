// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class y extends b
{
    public final A a;
    public final r3.b b;
    public final a c;
    public final Integer d;
    
    public y(final A a, final r3.b b, final a c, final Integer d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static y a(final A.a obj, final r3.b b, final Integer n) {
        final A.a d = A.a.d;
        if (obj != d && n == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("For given Variant ");
            sb.append(obj);
            sb.append(" the value of idRequirement must be non-null");
            throw new GeneralSecurityException(sb.toString());
        }
        if (obj == d && n != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (b.b() == 32) {
            final A a = A.a(obj);
            return new y(a, b, b(a, n), n);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
        sb2.append(b.b());
        throw new GeneralSecurityException(sb2.toString());
    }
    
    public static a b(final A a, final Integer n) {
        if (a.b() == A.a.d) {
            return a.a(new byte[0]);
        }
        if (a.b() == A.a.c) {
            return a.a(ByteBuffer.allocate(5).put((byte)0).putInt(n).array());
        }
        if (a.b() == A.a.b) {
            return a.a(ByteBuffer.allocate(5).put((byte)1).putInt(n).array());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown Variant: ");
        sb.append(a.b());
        throw new IllegalStateException(sb.toString());
    }
}
