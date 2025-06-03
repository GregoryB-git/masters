// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import java.util.Map;

public final class b extends i
{
    public final String a;
    public final Integer b;
    public final h c;
    public final long d;
    public final long e;
    public final Map f;
    
    public b(final String a, final Integer b, final h c, final long d, final long e, final Map f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public Map c() {
        return this.f;
    }
    
    @Override
    public Integer d() {
        return this.b;
    }
    
    @Override
    public h e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (this.a.equals(i.j())) {
                final Integer b = this.b;
                if (b == null) {
                    if (i.d() != null) {
                        return false;
                    }
                }
                else if (!b.equals(i.d())) {
                    return false;
                }
                if (this.c.equals(i.e()) && this.d == i.f() && this.e == i.k() && this.f.equals(i.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public long f() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int hashCode3 = this.c.hashCode();
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        return (((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ n) * 1000003 ^ (int)(e ^ e >>> 32)) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public String j() {
        return this.a;
    }
    
    @Override
    public long k() {
        return this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EventInternal{transportName=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", encodedPayload=");
        sb.append(this.c);
        sb.append(", eventMillis=");
        sb.append(this.d);
        sb.append(", uptimeMillis=");
        sb.append(this.e);
        sb.append(", autoMetadata=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public String a;
        public Integer b;
        public h c;
        public Long d;
        public Long e;
        public Map f;
        
        @Override
        public i d() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" transportName");
                string = sb.toString();
            }
            String string2 = string;
            if (this.c == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" encodedPayload");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.d == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" eventMillis");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.e == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" uptimeMillis");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.f == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" autoMetadata");
                string5 = sb5.toString();
            }
            if (string5.isEmpty()) {
                return new f2.b(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(string5);
            throw new IllegalStateException(sb6.toString());
        }
        
        @Override
        public Map e() {
            final Map f = this.f;
            if (f != null) {
                return f;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        
        @Override
        public a f(final Map f) {
            if (f != null) {
                this.f = f;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }
        
        @Override
        public a g(final Integer b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a h(final h c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        
        @Override
        public a i(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        public a j(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
        
        @Override
        public a k(final long l) {
            this.e = l;
            return this;
        }
    }
}
