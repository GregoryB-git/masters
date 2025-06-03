// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class o extends B.e.d.a.b.a
{
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    
    public o(final long a, final long b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public long b() {
        return this.a;
    }
    
    @Override
    public String c() {
        return this.c;
    }
    
    @Override
    public long d() {
        return this.b;
    }
    
    @Override
    public String e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof B.e.d.a.b.a) {
            final B.e.d.a.b.a a = (B.e.d.a.b.a)o;
            if (this.a == a.b() && this.b == a.d() && this.c.equals(a.c())) {
                final String d = this.d;
                final String e = a.e();
                if (d == null) {
                    if (e == null) {
                        return true;
                    }
                }
                else if (d.equals(e)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final int hashCode = this.c.hashCode();
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        return (((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode) * 1000003 ^ hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.e.d.a.b.a.a
    {
        public Long a;
        public Long b;
        public String c;
        public String d;
        
        @Override
        public B.e.d.a.b.a a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" baseAddress");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" size");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" name");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new o(this.a, this.b, this.c, this.d, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public B.e.d.a.b.a.a b(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public B.e.d.a.b.a.a c(final String c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null name");
        }
        
        @Override
        public B.e.d.a.b.a.a d(final long l) {
            this.b = l;
            return this;
        }
        
        @Override
        public B.e.d.a.b.a.a e(final String d) {
            this.d = d;
            return this;
        }
    }
}
