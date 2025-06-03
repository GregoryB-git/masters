// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;

public final class o extends d3.b
{
    public final q a;
    public final r3.b b;
    public final a c;
    public final Integer d;
    
    public o(final q a, final r3.b b, final a c, final Integer d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static b a() {
        return new b(null);
    }
    
    public static class b
    {
        public q a;
        public r3.b b;
        public Integer c;
        
        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        
        public o a() {
            final q a = this.a;
            if (a == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (a.c() != this.b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.a.f() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.a.f() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.a, this.b, this.b(), this.c, null);
        }
        
        public final a b() {
            if (this.a.e() == q.c.d) {
                return r3.a.a(new byte[0]);
            }
            if (this.a.e() == q.c.c) {
                return r3.a.a(ByteBuffer.allocate(5).put((byte)0).putInt(this.c).array());
            }
            if (this.a.e() == q.c.b) {
                return r3.a.a(ByteBuffer.allocate(5).put((byte)1).putInt(this.c).array());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown AesGcmParameters.Variant: ");
            sb.append(this.a.e());
            throw new IllegalStateException(sb.toString());
        }
        
        public b c(final Integer c) {
            this.c = c;
            return this;
        }
        
        public b d(final r3.b b) {
            this.b = b;
            return this;
        }
        
        public b e(final q a) {
            this.a = a;
            return this;
        }
    }
}
