// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

public final class e extends k
{
    public final k.b a;
    public final e2.a b;
    
    public e(final k.b a, final e2.a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public e2.a b() {
        return this.b;
    }
    
    @Override
    public k.b c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof k) {
            final k k = (k)o;
            final k.b a = this.a;
            if (a == null) {
                if (k.c() != null) {
                    return false;
                }
            }
            else if (!a.equals(k.c())) {
                return false;
            }
            final e2.a b = this.b;
            final e2.a b2 = k.b();
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
        final k.b a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final e2.a b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 ^ 0xF4243) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ClientInfo{clientType=");
        sb.append(this.a);
        sb.append(", androidClientInfo=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public k.b a;
        public e2.a b;
        
        @Override
        public k a() {
            return new e(this.a, this.b, null);
        }
        
        @Override
        public a b(final e2.a b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a c(final k.b a) {
            this.a = a;
            return this;
        }
    }
}
