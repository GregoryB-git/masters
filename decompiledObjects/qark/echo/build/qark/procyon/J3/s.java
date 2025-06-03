// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class s extends e.b
{
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    
    public s(final long a, final String b, final String c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public String b() {
        return this.c;
    }
    
    @Override
    public int c() {
        return this.e;
    }
    
    @Override
    public long d() {
        return this.d;
    }
    
    @Override
    public long e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof e.b) {
            final e.b b = (e.b)o;
            if (this.a == b.e() && this.b.equals(b.f())) {
                final String c = this.c;
                if (c == null) {
                    if (b.b() != null) {
                        return false;
                    }
                }
                else if (!c.equals(b.b())) {
                    return false;
                }
                if (this.d == b.d() && this.e == b.c()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final int hashCode = this.b.hashCode();
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final long d = this.d;
        return ((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;
        
        @Override
        public e.b a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" pc");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" symbol");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.d == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" offset");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.e == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" importance");
                string4 = sb4.toString();
            }
            if (string4.isEmpty()) {
                return new s(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(string4);
            throw new IllegalStateException(sb5.toString());
        }
        
        @Override
        public a b(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a c(final int i) {
            this.e = i;
            return this;
        }
        
        @Override
        public a d(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        public a e(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a f(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }
}
