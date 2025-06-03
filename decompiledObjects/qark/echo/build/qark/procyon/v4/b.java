// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v4;

public final class b extends f
{
    public final String a;
    public final long b;
    public final f.b c;
    
    public b(final String a, final long b, final f.b c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public f.b b() {
        return this.c;
    }
    
    @Override
    public String c() {
        return this.a;
    }
    
    @Override
    public long d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            final String a = this.a;
            if (a == null) {
                if (f.c() != null) {
                    return false;
                }
            }
            else if (!a.equals(f.c())) {
                return false;
            }
            if (this.b == f.d()) {
                final f.b c = this.c;
                final f.b b = f.b();
                if (c == null) {
                    if (b == null) {
                        return true;
                    }
                }
                else if (c.equals(b)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final f.b c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return ((hashCode2 ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public String a;
        public Long b;
        public f.b c;
        
        @Override
        public f a() {
            final Long b = this.b;
            String string = "";
            if (b == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" tokenExpirationTimestamp");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new v4.b(this.a, this.b, this.c, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public a b(final f.b c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a c(final String a) {
            this.a = a;
            return this;
        }
        
        @Override
        public a d(final long l) {
            this.b = l;
            return this;
        }
    }
}
