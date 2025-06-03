// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class q extends d
{
    public final String a;
    public final String b;
    public final long c;
    
    public q(final String a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public long b() {
        return this.c;
    }
    
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    public String d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof d) {
            final d d = (d)o;
            return this.a.equals(d.d()) && this.b.equals(d.c()) && this.c == d.b();
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public String a;
        public String b;
        public Long c;
        
        @Override
        public d a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" name");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" code");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" address");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new q(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public a b(final long l) {
            this.c = l;
            return this;
        }
        
        @Override
        public a c(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null code");
        }
        
        @Override
        public a d(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }
}
