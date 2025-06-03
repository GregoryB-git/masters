// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

public final class c extends a
{
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    
    public c(final Integer a, final String b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final String j, final String k, final String l) {
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
    public String b() {
        return this.l;
    }
    
    @Override
    public String c() {
        return this.j;
    }
    
    @Override
    public String d() {
        return this.d;
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
        if (o instanceof a) {
            final a a = (a)o;
            final Integer a2 = this.a;
            if (a2 == null) {
                if (a.m() != null) {
                    return false;
                }
            }
            else if (!a2.equals(a.m())) {
                return false;
            }
            final String b = this.b;
            if (b == null) {
                if (a.j() != null) {
                    return false;
                }
            }
            else if (!b.equals(a.j())) {
                return false;
            }
            final String c = this.c;
            if (c == null) {
                if (a.f() != null) {
                    return false;
                }
            }
            else if (!c.equals(a.f())) {
                return false;
            }
            final String d = this.d;
            if (d == null) {
                if (a.d() != null) {
                    return false;
                }
            }
            else if (!d.equals(a.d())) {
                return false;
            }
            final String e = this.e;
            if (e == null) {
                if (a.l() != null) {
                    return false;
                }
            }
            else if (!e.equals(a.l())) {
                return false;
            }
            final String f = this.f;
            if (f == null) {
                if (a.k() != null) {
                    return false;
                }
            }
            else if (!f.equals(a.k())) {
                return false;
            }
            final String g = this.g;
            if (g == null) {
                if (a.h() != null) {
                    return false;
                }
            }
            else if (!g.equals(a.h())) {
                return false;
            }
            final String h = this.h;
            if (h == null) {
                if (a.e() != null) {
                    return false;
                }
            }
            else if (!h.equals(a.e())) {
                return false;
            }
            final String i = this.i;
            if (i == null) {
                if (a.g() != null) {
                    return false;
                }
            }
            else if (!i.equals(a.g())) {
                return false;
            }
            final String j = this.j;
            if (j == null) {
                if (a.c() != null) {
                    return false;
                }
            }
            else if (!j.equals(a.c())) {
                return false;
            }
            final String k = this.k;
            if (k == null) {
                if (a.i() != null) {
                    return false;
                }
            }
            else if (!k.equals(a.i())) {
                return false;
            }
            final String l = this.l;
            final String b2 = a.b();
            if (l == null) {
                if (b2 == null) {
                    return true;
                }
            }
            else if (l.equals(b2)) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.c;
    }
    
    @Override
    public String g() {
        return this.i;
    }
    
    @Override
    public String h() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
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
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final String j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final String k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final String l = this.l;
        if (l != null) {
            hashCode = l.hashCode();
        }
        return (((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode;
    }
    
    @Override
    public String i() {
        return this.k;
    }
    
    @Override
    public String j() {
        return this.b;
    }
    
    @Override
    public String k() {
        return this.f;
    }
    
    @Override
    public String l() {
        return this.e;
    }
    
    @Override
    public Integer m() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public Integer a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        
        @Override
        public a a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
        }
        
        @Override
        public a b(final String l) {
            this.l = l;
            return this;
        }
        
        @Override
        public a c(final String j) {
            this.j = j;
            return this;
        }
        
        @Override
        public a d(final String d) {
            this.d = d;
            return this;
        }
        
        @Override
        public a e(final String h) {
            this.h = h;
            return this;
        }
        
        @Override
        public a f(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a g(final String i) {
            this.i = i;
            return this;
        }
        
        @Override
        public a h(final String g) {
            this.g = g;
            return this;
        }
        
        @Override
        public a i(final String k) {
            this.k = k;
            return this;
        }
        
        @Override
        public a j(final String b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a k(final String f) {
            this.f = f;
            return this;
        }
        
        @Override
        public a l(final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public a m(final Integer a) {
            this.a = a;
            return this;
        }
    }
}
