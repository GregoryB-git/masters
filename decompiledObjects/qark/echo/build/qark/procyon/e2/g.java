// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

import java.util.List;

public final class g extends m
{
    public final long a;
    public final long b;
    public final k c;
    public final Integer d;
    public final String e;
    public final List f;
    public final p g;
    
    public g(final long a, final long b, final k c, final Integer d, final String e, final List f, final p g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public k b() {
        return this.c;
    }
    
    @Override
    public List c() {
        return this.f;
    }
    
    @Override
    public Integer d() {
        return this.d;
    }
    
    @Override
    public String e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof m) {
            final m m = (m)o;
            if (this.a == m.g() && this.b == m.h()) {
                final k c = this.c;
                if (c == null) {
                    if (m.b() != null) {
                        return false;
                    }
                }
                else if (!c.equals(m.b())) {
                    return false;
                }
                final Integer d = this.d;
                if (d == null) {
                    if (m.d() != null) {
                        return false;
                    }
                }
                else if (!d.equals(m.d())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (m.e() != null) {
                        return false;
                    }
                }
                else if (!e.equals(m.e())) {
                    return false;
                }
                final List f = this.f;
                if (f == null) {
                    if (m.c() != null) {
                        return false;
                    }
                }
                else if (!f.equals(m.c())) {
                    return false;
                }
                final p g = this.g;
                final p f2 = m.f();
                if (g == null) {
                    if (f2 == null) {
                        return true;
                    }
                }
                else if (g.equals(f2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public p f() {
        return this.g;
    }
    
    @Override
    public long g() {
        return this.a;
    }
    
    @Override
    public long h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final k c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final List f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final p g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LogRequest{requestTimeMs=");
        sb.append(this.a);
        sb.append(", requestUptimeMs=");
        sb.append(this.b);
        sb.append(", clientInfo=");
        sb.append(this.c);
        sb.append(", logSource=");
        sb.append(this.d);
        sb.append(", logSourceName=");
        sb.append(this.e);
        sb.append(", logEvents=");
        sb.append(this.f);
        sb.append(", qosTier=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public Long a;
        public Long b;
        public k c;
        public Integer d;
        public String e;
        public List f;
        public p g;
        
        @Override
        public m a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" requestTimeMs");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" requestUptimeMs");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a b(final k c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a c(final List f) {
            this.f = f;
            return this;
        }
        
        @Override
        public a d(final Integer d) {
            this.d = d;
            return this;
        }
        
        @Override
        public a e(final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public a f(final p g) {
            this.g = g;
            return this;
        }
        
        @Override
        public a g(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a h(final long l) {
            this.b = l;
            return this;
        }
    }
}
