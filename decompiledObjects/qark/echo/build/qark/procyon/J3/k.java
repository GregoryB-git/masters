// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class k extends c
{
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    
    public k(final int a, final String b, final int c, final long d, final long e, final boolean f, final int g, final String h, final String i) {
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
    public int b() {
        return this.a;
    }
    
    @Override
    public int c() {
        return this.c;
    }
    
    @Override
    public long d() {
        return this.e;
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
        if (o instanceof c) {
            final c c = (c)o;
            return this.a == c.b() && this.b.equals(c.f()) && this.c == c.c() && this.d == c.h() && this.e == c.d() && this.f == c.j() && this.g == c.i() && this.h.equals(c.e()) && this.i.equals(c.g());
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.b;
    }
    
    @Override
    public String g() {
        return this.i;
    }
    
    @Override
    public long h() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int c = this.c;
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        final int n2 = (int)(e ^ e >>> 32);
        int n3;
        if (this.f) {
            n3 = 1231;
        }
        else {
            n3 = 1237;
        }
        return ((((((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }
    
    @Override
    public int i() {
        return this.g;
    }
    
    @Override
    public boolean j() {
        return this.f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;
        
        @Override
        public c a() {
            final Integer a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" arch");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" model");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" cores");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" ram");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.e == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" diskSpace");
                string5 = sb5.toString();
            }
            String string6 = string5;
            if (this.f == null) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(string5);
                sb6.append(" simulator");
                string6 = sb6.toString();
            }
            String string7 = string6;
            if (this.g == null) {
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(string6);
                sb7.append(" state");
                string7 = sb7.toString();
            }
            String string8 = string7;
            if (this.h == null) {
                final StringBuilder sb8 = new StringBuilder();
                sb8.append(string7);
                sb8.append(" manufacturer");
                string8 = sb8.toString();
            }
            String string9 = string8;
            if (this.i == null) {
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(string8);
                sb9.append(" modelClass");
                string9 = sb9.toString();
            }
            if (string9.isEmpty()) {
                return new k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
            }
            final StringBuilder sb10 = new StringBuilder();
            sb10.append("Missing required properties:");
            sb10.append(string9);
            throw new IllegalStateException(sb10.toString());
        }
        
        @Override
        public a b(final int i) {
            this.a = i;
            return this;
        }
        
        @Override
        public a c(final int i) {
            this.c = i;
            return this;
        }
        
        @Override
        public a d(final long l) {
            this.e = l;
            return this;
        }
        
        @Override
        public a e(final String h) {
            if (h != null) {
                this.h = h;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }
        
        @Override
        public a f(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null model");
        }
        
        @Override
        public a g(final String i) {
            if (i != null) {
                this.i = i;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }
        
        @Override
        public a h(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        public a i(final boolean b) {
            this.f = b;
            return this;
        }
        
        @Override
        public a j(final int i) {
            this.g = i;
            return this;
        }
    }
}
