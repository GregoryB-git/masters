// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

public final class a extends n
{
    public final String a;
    public final long b;
    public final long c;
    
    public a(final String a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public long c() {
        return this.c;
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
        if (o instanceof n) {
            final n n = (n)o;
            return this.a.equals(n.b()) && this.b == n.d() && this.c == n.c();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends n.a
    {
        public String a;
        public Long b;
        public Long c;
        
        @Override
        public n a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" token");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" tokenExpirationTimestamp");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" tokenCreationTimestamp");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new a(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public n.a b(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null token");
        }
        
        @Override
        public n.a c(final long l) {
            this.c = l;
            return this;
        }
        
        @Override
        public n.a d(final long l) {
            this.b = l;
            return this;
        }
    }
}
