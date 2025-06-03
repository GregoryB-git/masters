// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class q extends d3.c
{
    public final int a;
    public final int b;
    public final int c;
    public final c d;
    
    public q(final int a, final int b, final int c, final c d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static b a() {
        return new b(null);
    }
    
    public int b() {
        return this.b;
    }
    
    public int c() {
        return this.a;
    }
    
    public int d() {
        return this.c;
    }
    
    public c e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof q;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final q q = (q)o;
        boolean b3 = b2;
        if (q.c() == this.c()) {
            b3 = b2;
            if (q.b() == this.b()) {
                b3 = b2;
                if (q.d() == this.d()) {
                    b3 = b2;
                    if (q.e() == this.e()) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public boolean f() {
        return this.d != q.c.d;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AesGcm Parameters (variant: ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.b);
        sb.append("-byte IV, ");
        sb.append(this.c);
        sb.append("-byte tag, and ");
        sb.append(this.a);
        sb.append("-byte key)");
        return sb.toString();
    }
    
    public static final class b
    {
        public Integer a;
        public Integer b;
        public Integer c;
        public c d;
        
        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = c.d;
        }
        
        public q a() {
            final Integer a = this.a;
            if (a == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.c != null) {
                return new q(a, this.b, this.c, this.d, null);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }
        
        public b b(final int n) {
            if (n > 0) {
                this.b = n;
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", n));
        }
        
        public b c(final int n) {
            if (n != 16 && n != 24 && n != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", n));
            }
            this.a = n;
            return this;
        }
        
        public b d(final int n) {
            if (n != 12 && n != 13 && n != 14 && n != 15 && n != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", n));
            }
            this.c = n;
            return this;
        }
        
        public b e(final c d) {
            this.d = d;
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
