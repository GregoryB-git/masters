// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class l extends B.e.d
{
    public final long a;
    public final String b;
    public final B.e.d.a c;
    public final B.e.d.c d;
    public final B.e.d.d e;
    
    public l(final long a, final String b, final B.e.d.a c, final B.e.d.c d, final B.e.d.d e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public B.e.d.a b() {
        return this.c;
    }
    
    @Override
    public B.e.d.c c() {
        return this.d;
    }
    
    @Override
    public B.e.d.d d() {
        return this.e;
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
        if (o instanceof B.e.d) {
            final B.e.d d = (B.e.d)o;
            if (this.a == d.e() && this.b.equals(d.f()) && this.c.equals(d.b()) && this.d.equals(d.c())) {
                final B.e.d.d e = this.e;
                final B.e.d.d d2 = d.d();
                if (e == null) {
                    if (d2 == null) {
                        return true;
                    }
                }
                else if (e.equals(d2)) {
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
    public B.e.d.b g() {
        return new b(this, null);
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final B.e.d.d e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        return ((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Event{timestamp=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", app=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", log=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.e.d.b
    {
        public Long a;
        public String b;
        public B.e.d.a c;
        public B.e.d.c d;
        public B.e.d.d e;
        
        public b() {
        }
        
        public b(final B.e.d d) {
            this.a = d.e();
            this.b = d.f();
            this.c = d.b();
            this.d = d.c();
            this.e = d.d();
        }
        
        @Override
        public B.e.d a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" timestamp");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" type");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" app");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" device");
                string4 = sb4.toString();
            }
            if (string4.isEmpty()) {
                return new l(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(string4);
            throw new IllegalStateException(sb5.toString());
        }
        
        @Override
        public B.e.d.b b(final B.e.d.a c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null app");
        }
        
        @Override
        public B.e.d.b c(final B.e.d.c d) {
            if (d != null) {
                this.d = d;
                return this;
            }
            throw new NullPointerException("Null device");
        }
        
        @Override
        public B.e.d.b d(final B.e.d.d e) {
            this.e = e;
            return this;
        }
        
        @Override
        public B.e.d.b e(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public B.e.d.b f(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }
}
