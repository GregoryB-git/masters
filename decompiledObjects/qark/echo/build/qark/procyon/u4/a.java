// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u4;

public final class a extends d
{
    public final String b;
    public final c.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    
    public a(final String b, final c.a c, final String d, final String e, final long f, final long g, final String h) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public String b() {
        return this.d;
    }
    
    @Override
    public long c() {
        return this.f;
    }
    
    @Override
    public String d() {
        return this.b;
    }
    
    @Override
    public String e() {
        return this.h;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof d) {
            final d d = (d)o;
            final String b = this.b;
            if (b == null) {
                if (d.d() != null) {
                    return false;
                }
            }
            else if (!b.equals(d.d())) {
                return false;
            }
            if (this.c.equals(d.g())) {
                final String d2 = this.d;
                if (d2 == null) {
                    if (d.b() != null) {
                        return false;
                    }
                }
                else if (!d2.equals(d.b())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (d.f() != null) {
                        return false;
                    }
                }
                else if (!e.equals(d.f())) {
                    return false;
                }
                if (this.f == d.c() && this.g == d.h()) {
                    final String h = this.h;
                    final String e2 = d.e();
                    if (h == null) {
                        if (e2 == null) {
                            return true;
                        }
                    }
                    else if (h.equals(e2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.e;
    }
    
    @Override
    public c.a g() {
        return this.c;
    }
    
    @Override
    public long h() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        final String b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int hashCode3 = this.c.hashCode();
        final String d = this.d;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        final String e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final long g = this.g;
        final int n2 = (int)(g ^ g >>> 32);
        final String h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ hashCode;
    }
    
    @Override
    public d.a n() {
        return new b(this, null);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends d.a
    {
        public String a;
        public c.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;
        
        public b() {
        }
        
        public b(final d d) {
            this.a = d.d();
            this.b = d.g();
            this.c = d.b();
            this.d = d.f();
            this.e = d.c();
            this.f = d.h();
            this.g = d.e();
        }
        
        @Override
        public d a() {
            final c.a b = this.b;
            String string = "";
            if (b == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" registrationStatus");
                string = sb.toString();
            }
            String string2 = string;
            if (this.e == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" expiresInSecs");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.f == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" tokenCreationEpochInSecs");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public d.a b(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public d.a c(final long l) {
            this.e = l;
            return this;
        }
        
        @Override
        public d.a d(final String a) {
            this.a = a;
            return this;
        }
        
        @Override
        public d.a e(final String g) {
            this.g = g;
            return this;
        }
        
        @Override
        public d.a f(final String d) {
            this.d = d;
            return this;
        }
        
        @Override
        public d.a g(final c.a b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }
        
        @Override
        public d.a h(final long l) {
            this.f = l;
            return this;
        }
    }
}
