// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class c extends B.a
{
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final C i;
    
    public c(final int a, final String b, final int c, final int d, final long e, final long f, final long g, final String h, final C i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public C b() {
        return this.i;
    }
    
    @Override
    public int c() {
        return this.d;
    }
    
    @Override
    public int d() {
        return this.a;
    }
    
    @Override
    public String e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof B.a) {
            final B.a a = (B.a)o;
            if (this.a == a.d() && this.b.equals(a.e()) && this.c == a.g() && this.d == a.c() && this.e == a.f() && this.f == a.h() && this.g == a.i()) {
                final String h = this.h;
                if (h == null) {
                    if (a.j() != null) {
                        return false;
                    }
                }
                else if (!h.equals(a.j())) {
                    return false;
                }
                final C i = this.i;
                final C b = a.b();
                if (i == null) {
                    if (b == null) {
                        return true;
                    }
                }
                else if (i.equals(b)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public long f() {
        return this.e;
    }
    
    @Override
    public int g() {
        return this.c;
    }
    
    @Override
    public long h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int c = this.c;
        final int d = this.d;
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final long f = this.f;
        final int n2 = (int)(f ^ f >>> 32);
        final long g = this.g;
        final int n3 = (int)(g ^ g >>> 32);
        final String h = this.h;
        int hashCode2 = 0;
        int hashCode3;
        if (h == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = h.hashCode();
        }
        final C i = this.i;
        if (i != null) {
            hashCode2 = i.hashCode();
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ hashCode3) * 1000003 ^ hashCode2;
    }
    
    @Override
    public long i() {
        return this.g;
    }
    
    @Override
    public String j() {
        return this.h;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ApplicationExitInfo{pid=");
        sb.append(this.a);
        sb.append(", processName=");
        sb.append(this.b);
        sb.append(", reasonCode=");
        sb.append(this.c);
        sb.append(", importance=");
        sb.append(this.d);
        sb.append(", pss=");
        sb.append(this.e);
        sb.append(", rss=");
        sb.append(this.f);
        sb.append(", timestamp=");
        sb.append(this.g);
        sb.append(", traceFile=");
        sb.append(this.h);
        sb.append(", buildIdMappingForArch=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.a.b
    {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;
        public C i;
        
        @Override
        public B.a a() {
            final Integer a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" pid");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" processName");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" reasonCode");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" importance");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.e == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" pss");
                string5 = sb5.toString();
            }
            String string6 = string5;
            if (this.f == null) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(string5);
                sb6.append(" rss");
                string6 = sb6.toString();
            }
            String string7 = string6;
            if (this.g == null) {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(string6);
                sb7.append(" timestamp");
                string7 = sb7.toString();
            }
            if (string7.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
            }
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing required properties:");
            sb8.append(string7);
            throw new IllegalStateException(sb8.toString());
        }
        
        @Override
        public B.a.b b(final C i) {
            this.i = i;
            return this;
        }
        
        @Override
        public B.a.b c(final int i) {
            this.d = i;
            return this;
        }
        
        @Override
        public B.a.b d(final int i) {
            this.a = i;
            return this;
        }
        
        @Override
        public B.a.b e(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null processName");
        }
        
        @Override
        public B.a.b f(final long l) {
            this.e = l;
            return this;
        }
        
        @Override
        public B.a.b g(final int i) {
            this.c = i;
            return this;
        }
        
        @Override
        public B.a.b h(final long l) {
            this.f = l;
            return this;
        }
        
        @Override
        public B.a.b i(final long l) {
            this.g = l;
            return this;
        }
        
        @Override
        public B.a.b j(final String h) {
            this.h = h;
            return this;
        }
    }
}
