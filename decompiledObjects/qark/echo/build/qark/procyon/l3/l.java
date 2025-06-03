// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import java.security.InvalidAlgorithmParameterException;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class l extends q
{
    public final int a;
    public final int b;
    public final d c;
    public final c d;
    
    public l(final int a, final int b, final d c, final c d) {
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
    
    public c c() {
        return this.d;
    }
    
    public int d() {
        return this.a;
    }
    
    public int e() {
        final d c = this.c;
        if (c == l.d.e) {
            return this.b();
        }
        if (c != l.d.b) {
            if (c != l.d.c) {
                if (c != l.d.d) {
                    throw new IllegalStateException("Unknown variant");
                }
            }
        }
        return this.b() + 5;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof l;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final l l = (l)o;
        boolean b3 = b2;
        if (l.d() == this.d()) {
            b3 = b2;
            if (l.e() == this.e()) {
                b3 = b2;
                if (l.f() == this.f()) {
                    b3 = b2;
                    if (l.c() == this.c()) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    public d f() {
        return this.c;
    }
    
    public boolean g() {
        return this.c != l.d.e;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("HMAC Parameters (variant: ");
        sb.append(this.c);
        sb.append(", hashType: ");
        sb.append(this.d);
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
        public d d;
        
        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = d.e;
        }
        
        public static void f(final int n, final c c) {
            if (n < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", n));
            }
            if (c == l.c.b) {
                if (n <= 20) {
                    return;
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", n));
            }
            else if (c == l.c.c) {
                if (n <= 28) {
                    return;
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", n));
            }
            else if (c == l.c.d) {
                if (n <= 32) {
                    return;
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", n));
            }
            else if (c == l.c.e) {
                if (n <= 48) {
                    return;
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", n));
            }
            else {
                if (c != l.c.f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (n <= 64) {
                    return;
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", n));
            }
        }
        
        public l a() {
            final Integer a = this.a;
            if (a == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (a >= 16) {
                f(this.b, this.c);
                return new l(this.a, this.b, this.d, this.c, null);
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
        }
        
        public b b(final c c) {
            this.c = c;
            return this;
        }
        
        public b c(final int i) {
            this.a = i;
            return this;
        }
        
        public b d(final int i) {
            this.b = i;
            return this;
        }
        
        public b e(final d d) {
            this.d = d;
            return this;
        }
    }
    
    public static final class c
    {
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public final String a;
        
        static {
            b = new c("SHA1");
            c = new c("SHA224");
            d = new c("SHA256");
            e = new c("SHA384");
            f = new c("SHA512");
        }
        
        public c(final String a) {
            this.a = a;
        }
        
        @Override
        public String toString() {
            return this.a;
        }
    }
    
    public static final class d
    {
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public final String a;
        
        static {
            b = new d("TINK");
            c = new d("CRUNCHY");
            d = new d("LEGACY");
            e = new d("NO_PREFIX");
        }
        
        public d(final String a) {
            this.a = a;
        }
        
        @Override
        public String toString() {
            return this.a;
        }
    }
}
