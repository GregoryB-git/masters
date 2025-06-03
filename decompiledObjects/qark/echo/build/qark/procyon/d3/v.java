// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class v extends d3.c
{
    public final int a;
    public final c b;
    
    public v(final int a, final c b) {
        this.a = a;
        this.b = b;
    }
    
    public static b a() {
        return new b(null);
    }
    
    public int b() {
        return this.a;
    }
    
    public c c() {
        return this.b;
    }
    
    public boolean d() {
        return this.b != c.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof v;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final v v = (v)o;
        boolean b3 = b2;
        if (v.b() == this.b()) {
            b3 = b2;
            if (v.c() == this.c()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.a);
        sb.append("-byte key)");
        return sb.toString();
    }
    
    public static final class b
    {
        public Integer a;
        public c b;
        
        public b() {
            this.a = null;
            this.b = c.d;
        }
        
        public v a() {
            final Integer a = this.a;
            if (a == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.b != null) {
                return new v(a, this.b, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        
        public b b(final int n) {
            if (n != 16 && n != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", n));
            }
            this.a = n;
            return this;
        }
        
        public b c(final c b) {
            this.b = b;
            return this;
        }
    }
    
    public static final class c
    {
        public static final c b;
        public static final c c;
        public static final c d;
        public final String a;
        
        static {
            b = new c("TINK");
            c = new c("CRUNCHY");
            d = new c("NO_PREFIX");
        }
        
        public c(final String a) {
            this.a = a;
        }
        
        @Override
        public String toString() {
            return this.a;
        }
    }
}
