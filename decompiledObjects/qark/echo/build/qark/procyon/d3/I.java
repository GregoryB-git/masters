// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import java.util.Objects;

public final class I extends c
{
    public final a a;
    
    public I(final a a) {
        this.a = a;
    }
    
    public static I a(final a a) {
        return new I(a);
    }
    
    public a b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof I;
        boolean b2 = false;
        if (!b) {
            return false;
        }
        if (((I)o).b() == this.b()) {
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.a);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public static final a b;
        public static final a c;
        public static final a d;
        public final String a;
        
        static {
            b = new a("TINK");
            c = new a("CRUNCHY");
            d = new a("NO_PREFIX");
        }
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public String toString() {
            return this.a;
        }
    }
}
