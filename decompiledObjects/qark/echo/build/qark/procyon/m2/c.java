// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import java.util.Set;

public final class c extends f.b
{
    public final long a;
    public final long b;
    public final Set c;
    
    public c(final long a, final long b, final Set c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public long b() {
        return this.a;
    }
    
    @Override
    public Set c() {
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
        if (o instanceof f.b) {
            final f.b b = (f.b)o;
            return this.a == b.b() && this.b == b.d() && this.c.equals(b.c());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        return ((n ^ 0xF4243) * 1000003 ^ (int)(b >>> 32 ^ b)) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ConfigValue{delta=");
        sb.append(this.a);
        sb.append(", maxAllowedDelay=");
        sb.append(this.b);
        sb.append(", flags=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public Long a;
        public Long b;
        public Set c;
        
        @Override
        public f.b a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" delta");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" maxAllowedDelay");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" flags");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new c(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public a b(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a c(final Set c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null flags");
        }
        
        @Override
        public a d(final long l) {
            this.b = l;
            return this;
        }
    }
}
