// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.b;

public final class a extends p
{
    public final d a;
    public final r3.b b;
    public final r3.a c;
    public final Integer d;
    
    public a(final d a, final r3.b b, final r3.a c, final Integer d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static b c() {
        return new b(null);
    }
    
    @Override
    public r3.a a() {
        return this.c;
    }
    
    public d d() {
        return this.a;
    }
    
    public static class b
    {
        public d a;
        public r3.b b;
        public Integer c;
        
        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        
        public a a() {
            final d a = this.a;
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
            return new a(this.a, this.b, this.b(), this.c, null);
        }
        
        public final r3.a b() {
            if (this.a.e() == l3.d.c.e) {
                return r3.a.a(new byte[0]);
            }
            if (this.a.e() == l3.d.c.d || this.a.e() == l3.d.c.c) {
                return r3.a.a(ByteBuffer.allocate(5).put((byte)0).putInt(this.c).array());
            }
            if (this.a.e() == l3.d.c.b) {
                return r3.a.a(ByteBuffer.allocate(5).put((byte)1).putInt(this.c).array());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown AesCmacParametersParameters.Variant: ");
            sb.append(this.a.e());
            throw new IllegalStateException(sb.toString());
        }
        
        public b c(final r3.b b) {
            this.b = b;
            return this;
        }
        
        public b d(final Integer c) {
            this.c = c;
            return this;
        }
        
        public b e(final d a) {
            this.a = a;
            return this;
        }
    }
}
