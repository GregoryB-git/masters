// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class h extends B.e
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final B.e.a g;
    public final f h;
    public final B.e.e i;
    public final B.e.c j;
    public final C k;
    public final int l;
    
    public h(final String a, final String b, final String c, final long d, final Long e, final boolean f, final B.e.a g, final f h, final B.e.e i, final B.e.c j, final C k, final int l) {
        this.a = a;
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
    public B.e.a b() {
        return this.g;
    }
    
    @Override
    public String c() {
        return this.c;
    }
    
    @Override
    public B.e.c d() {
        return this.j;
    }
    
    @Override
    public Long e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof B.e) {
            final B.e e = (B.e)o;
            if (this.a.equals(e.g()) && this.b.equals(e.i())) {
                final String c = this.c;
                if (c == null) {
                    if (e.c() != null) {
                        return false;
                    }
                }
                else if (!c.equals(e.c())) {
                    return false;
                }
                if (this.d == e.l()) {
                    final Long e2 = this.e;
                    if (e2 == null) {
                        if (e.e() != null) {
                            return false;
                        }
                    }
                    else if (!e2.equals(e.e())) {
                        return false;
                    }
                    if (this.f == e.n() && this.g.equals(e.b())) {
                        final f h = this.h;
                        if (h == null) {
                            if (e.m() != null) {
                                return false;
                            }
                        }
                        else if (!h.equals(e.m())) {
                            return false;
                        }
                        final B.e.e i = this.i;
                        if (i == null) {
                            if (e.k() != null) {
                                return false;
                            }
                        }
                        else if (!i.equals(e.k())) {
                            return false;
                        }
                        final B.e.c j = this.j;
                        if (j == null) {
                            if (e.d() != null) {
                                return false;
                            }
                        }
                        else if (!j.equals(e.d())) {
                            return false;
                        }
                        final C k = this.k;
                        if (k == null) {
                            if (e.f() != null) {
                                return false;
                            }
                        }
                        else if (!k.equals(e.f())) {
                            return false;
                        }
                        if (this.l == e.h()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public C f() {
        return this.k;
    }
    
    @Override
    public String g() {
        return this.a;
    }
    
    @Override
    public int h() {
        return this.l;
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
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final Long e = this.e;
        int hashCode5;
        if (e == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = e.hashCode();
        }
        int n2;
        if (this.f) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        final int hashCode6 = this.g.hashCode();
        final f h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final B.e.e i = this.i;
        int hashCode8;
        if (i == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = i.hashCode();
        }
        final B.e.c j = this.j;
        int hashCode9;
        if (j == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = j.hashCode();
        }
        final C k = this.k;
        if (k != null) {
            hashCode3 = k.hashCode();
        }
        return (((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ n) * 1000003 ^ hashCode5) * 1000003 ^ n2) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode3) * 1000003 ^ this.l;
    }
    
    @Override
    public String i() {
        return this.b;
    }
    
    @Override
    public B.e.e k() {
        return this.i;
    }
    
    @Override
    public long l() {
        return this.d;
    }
    
    @Override
    public f m() {
        return this.h;
    }
    
    @Override
    public boolean n() {
        return this.f;
    }
    
    @Override
    public B.e.b o() {
        return new b(this, null);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.e.b
    {
        public String a;
        public String b;
        public String c;
        public Long d;
        public Long e;
        public Boolean f;
        public B.e.a g;
        public f h;
        public B.e.e i;
        public B.e.c j;
        public C k;
        public Integer l;
        
        public b() {
        }
        
        public b(final B.e e) {
            this.a = e.g();
            this.b = e.i();
            this.c = e.c();
            this.d = e.l();
            this.e = e.e();
            this.f = e.n();
            this.g = e.b();
            this.h = e.m();
            this.i = e.k();
            this.j = e.d();
            this.k = e.f();
            this.l = e.h();
        }
        
        @Override
        public B.e a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" generator");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" identifier");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.d == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" startedAt");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.f == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" crashed");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.g == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" app");
                string5 = sb5.toString();
            }
            String string6 = string5;
            if (this.l == null) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(string5);
                sb6.append(" generatorType");
                string6 = sb6.toString();
            }
            if (string6.isEmpty()) {
                return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
            }
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing required properties:");
            sb7.append(string6);
            throw new IllegalStateException(sb7.toString());
        }
        
        @Override
        public B.e.b b(final B.e.a g) {
            if (g != null) {
                this.g = g;
                return this;
            }
            throw new NullPointerException("Null app");
        }
        
        @Override
        public B.e.b c(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public B.e.b d(final boolean b) {
            this.f = b;
            return this;
        }
        
        @Override
        public B.e.b e(final B.e.c j) {
            this.j = j;
            return this;
        }
        
        @Override
        public B.e.b f(final Long e) {
            this.e = e;
            return this;
        }
        
        @Override
        public B.e.b g(final C k) {
            this.k = k;
            return this;
        }
        
        @Override
        public B.e.b h(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null generator");
        }
        
        @Override
        public B.e.b i(final int i) {
            this.l = i;
            return this;
        }
        
        @Override
        public B.e.b j(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
        
        @Override
        public B.e.b l(final B.e.e i) {
            this.i = i;
            return this;
        }
        
        @Override
        public B.e.b m(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        public B.e.b n(final f h) {
            this.h = h;
            return this;
        }
    }
}
