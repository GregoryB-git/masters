// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class d extends q
{
    public final int a;
    public final int b;
    public final c c;
    
    public d(final int a, final int b, final c c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        final c c = this.c;
        if (c == d.c.e) {
            return this.b();
        }
        if (c != d.c.b) {
            if (c != d.c.c) {
                if (c != d.c.d) {
                    throw new IllegalStateException("Unknown variant");
                }
            }
        }
        return this.b() + 5;
    }
    
    public c e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final d d = (d)o;
        boolean b3 = b2;
        if (d.c() == this.c()) {
            b3 = b2;
            if (d.d() == this.d()) {
                b3 = b2;
                if (d.e() == this.e()) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    public boolean f() {
        return this.c != d.c.e;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.b);
        sb.append("-byte tags, and ");
        sb.append(this.a);
        sb.append("-byte key)");
        return sb.toString();
    }
    
    public static final class b
    {
        public Integer a;
        public Integer b;
        public c c;
        
        public b() {
            this.a = null;
            this.b = null;
            this.c = c.e;
        }
        
        public d a() {
            final Integer a = this.a;
            if (a == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.c != null) {
                return new d(a, this.b, this.c, null);
            }
            throw new GeneralSecurityException("variant not set");
        }
        
        public b b(final int i) {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", i * 8));
            }
            this.a = i;
            return this;
        }
        
        public b c(final int n) {
            if (n >= 10 && 16 >= n) {
                this.b = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid tag size for AesCmacParameters: ");
            sb.append(n);
            throw new GeneralSecurityException(sb.toString());
        }
        
        public b d(final c c) {
            this.c = c;
            return this;
        }
    }
    
    public static final class c
    {
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public final String a;
        
        static {
            b = new c("TINK");
            c = new c("CRUNCHY");
            d = new c("LEGACY");
            e = new c("NO_PREFIX");
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
