// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class b extends B
{
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final B.e j;
    public final B.d k;
    public final B.a l;
    
    public b(final String b, final String c, final int d, final String e, final String f, final String g, final String h, final String i, final B.e j, final B.d k, final B.a l) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    @Override
    public B.a c() {
        return this.l;
    }
    
    @Override
    public String d() {
        return this.g;
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
        if (o instanceof B) {
            final B b = (B)o;
            if (this.b.equals(b.l()) && this.c.equals(b.h()) && this.d == b.k() && this.e.equals(b.i())) {
                final String f = this.f;
                if (f == null) {
                    if (b.g() != null) {
                        return false;
                    }
                }
                else if (!f.equals(b.g())) {
                    return false;
                }
                final String g = this.g;
                if (g == null) {
                    if (b.d() != null) {
                        return false;
                    }
                }
                else if (!g.equals(b.d())) {
                    return false;
                }
                if (this.h.equals(b.e()) && this.i.equals(b.f())) {
                    final B.e j = this.j;
                    if (j == null) {
                        if (b.m() != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(b.m())) {
                        return false;
                    }
                    final B.d k = this.k;
                    if (k == null) {
                        if (b.j() != null) {
                            return false;
                        }
                    }
                    else if (!k.equals(b.j())) {
                        return false;
                    }
                    final B.a l = this.l;
                    final B.a c = b.c();
                    if (l == null) {
                        if (c == null) {
                            return true;
                        }
                    }
                    else if (l.equals(c)) {
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
        return this.i;
    }
    
    @Override
    public String g() {
        return this.f;
    }
    
    @Override
    public String h() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int d = this.d;
        final int hashCode3 = this.e.hashCode();
        final String f = this.f;
        int hashCode4 = 0;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final String g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final int hashCode7 = this.h.hashCode();
        final int hashCode8 = this.i.hashCode();
        final B.e j = this.j;
        int hashCode9;
        if (j == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = j.hashCode();
        }
        final B.d k = this.k;
        int hashCode10;
        if (k == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = k.hashCode();
        }
        final B.a l = this.l;
        if (l != null) {
            hashCode4 = l.hashCode();
        }
        return ((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ d) * 1000003 ^ hashCode3) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode4;
    }
    
    @Override
    public String i() {
        return this.e;
    }
    
    @Override
    public B.d j() {
        return this.k;
    }
    
    @Override
    public int k() {
        return this.d;
    }
    
    @Override
    public String l() {
        return this.b;
    }
    
    @Override
    public B.e m() {
        return this.j;
    }
    
    @Override
    public B.b n() {
        return new b(this, null);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CrashlyticsReport{sdkVersion=");
        sb.append(this.b);
        sb.append(", gmpAppId=");
        sb.append(this.c);
        sb.append(", platform=");
        sb.append(this.d);
        sb.append(", installationUuid=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", appQualitySessionId=");
        sb.append(this.g);
        sb.append(", buildVersion=");
        sb.append(this.h);
        sb.append(", displayVersion=");
        sb.append(this.i);
        sb.append(", session=");
        sb.append(this.j);
        sb.append(", ndkPayload=");
        sb.append(this.k);
        sb.append(", appExitInfo=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.b
    {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public B.e i;
        public B.d j;
        public B.a k;
        
        public b() {
        }
        
        public b(final B b) {
            this.a = b.l();
            this.b = b.h();
            this.c = b.k();
            this.d = b.i();
            this.e = b.g();
            this.f = b.d();
            this.g = b.e();
            this.h = b.f();
            this.i = b.m();
            this.j = b.j();
            this.k = b.c();
        }
        
        @Override
        public B a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" sdkVersion");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" gmpAppId");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" platform");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" installationUuid");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.g == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" buildVersion");
                string5 = sb5.toString();
            }
            String string6 = string5;
            if (this.h == null) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(string5);
                sb6.append(" displayVersion");
                string6 = sb6.toString();
            }
            if (string6.isEmpty()) {
                return new J3.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
            }
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing required properties:");
            sb7.append(string6);
            throw new IllegalStateException(sb7.toString());
        }
        
        @Override
        public B.b b(final B.a k) {
            this.k = k;
            return this;
        }
        
        @Override
        public B.b c(final String f) {
            this.f = f;
            return this;
        }
        
        @Override
        public B.b d(final String g) {
            if (g != null) {
                this.g = g;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }
        
        @Override
        public B.b e(final String h) {
            if (h != null) {
                this.h = h;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }
        
        @Override
        public B.b f(final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public B.b g(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }
        
        @Override
        public B.b h(final String d) {
            if (d != null) {
                this.d = d;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }
        
        @Override
        public B.b i(final B.d j) {
            this.j = j;
            return this;
        }
        
        @Override
        public B.b j(final int i) {
            this.c = i;
            return this;
        }
        
        @Override
        public B.b k(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }
        
        @Override
        public B.b l(final B.e i) {
            this.i = i;
            return this;
        }
    }
}
