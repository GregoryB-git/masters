// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class i extends B.e.a
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    
    public i(final String a, final String b, final String c, final B.e.a.b b2, final String d, final String e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public String b() {
        return this.e;
    }
    
    @Override
    public String c() {
        return this.f;
    }
    
    @Override
    public String d() {
        return this.c;
    }
    
    @Override
    public String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof B.e.a) {
            final B.e.a a = (B.e.a)o;
            if (this.a.equals(a.e()) && this.b.equals(a.h())) {
                final String c = this.c;
                if (c == null) {
                    if (a.d() != null) {
                        return false;
                    }
                }
                else if (!c.equals(a.d())) {
                    return false;
                }
                a.g();
                final String d = this.d;
                if (d == null) {
                    if (a.f() != null) {
                        return false;
                    }
                }
                else if (!d.equals(a.f())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (a.b() != null) {
                        return false;
                    }
                }
                else if (!e.equals(a.b())) {
                    return false;
                }
                final String f = this.f;
                final String c2 = a.c();
                if (f == null) {
                    if (c2 == null) {
                        return true;
                    }
                }
                else if (f.equals(c2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.d;
    }
    
    @Override
    public B.e.a.b g() {
        return null;
    }
    
    @Override
    public String h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        if (f != null) {
            hashCode3 = f.hashCode();
        }
        return (((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * -721379959 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode3;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=");
        sb.append((Object)null);
        sb.append(", installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.e);
        sb.append(", developmentPlatformVersion=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.e.a.a
    {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        
        @Override
        public B.e.a a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" identifier");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" version");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new i(this.a, this.b, this.c, null, this.d, this.e, this.f, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public B.e.a.a b(final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public B.e.a.a c(final String f) {
            this.f = f;
            return this;
        }
        
        @Override
        public B.e.a.a d(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public B.e.a.a e(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
        
        @Override
        public B.e.a.a f(final String d) {
            this.d = d;
            return this;
        }
        
        @Override
        public B.e.a.a g(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }
}
