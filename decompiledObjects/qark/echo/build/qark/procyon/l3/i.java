// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import r3.a;
import r3.b;

public final class i extends p
{
    public final l a;
    public final r3.b b;
    public final a c;
    public final Integer d;
    
    public i(final l a, final r3.b b, final a c, final Integer d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static b c() {
        return new b(null);
    }
    
    @Override
    public a a() {
        return this.c;
    }
    
    public l d() {
        return this.a;
    }
    
    public static class b
    {
        public l a;
        public r3.b b;
        public Integer c;
        
        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        
        public i a() {
            final l a = this.a;
            if (a == null || this.b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (a.d() != this.b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.a.g() && this.c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.a.g() && this.c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.a, this.b, this.b(), this.c, null);
        }
        
        public final a b() {
            if (this.a.f() == l.d.e) {
                return r3.a.a(new byte[0]);
            }
            if (this.a.f() == l.d.d || this.a.f() == l.d.c) {
                return r3.a.a(ByteBuffer.allocate(5).put((byte)0).putInt(this.c).array());
            }
            if (this.a.f() == l.d.b) {
                return r3.a.a(ByteBuffer.allocate(5).put((byte)1).putInt(this.c).array());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown HmacParameters.Variant: ");
            sb.append(this.a.f());
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
        
        public b e(final l a) {
            this.a = a;
            return this;
        }
    }
}
