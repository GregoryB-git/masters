// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

public final class i extends o
{
    public final c a;
    public final o.b b;
    
    public i(final c a, final o.b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public o.b b() {
        return this.b;
    }
    
    @Override
    public c c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof o) {
            final o o2 = (o)o;
            final c a = this.a;
            if (a == null) {
                if (o2.c() != null) {
                    return false;
                }
            }
            else if (!a.equals(o2.c())) {
                return false;
            }
            final o.b b = this.b;
            final o.b b2 = o2.b();
            if (b == null) {
                if (b2 == null) {
                    return true;
                }
            }
            else if (b.equals(b2)) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final c a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final o.b b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NetworkConnectionInfo{networkType=");
        sb.append(this.a);
        sb.append(", mobileSubtype=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public c a;
        public o.b b;
        
        @Override
        public o a() {
            return new i(this.a, this.b, null);
        }
        
        @Override
        public a b(final o.b b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a c(final c a) {
            this.a = a;
            return this;
        }
    }
}
