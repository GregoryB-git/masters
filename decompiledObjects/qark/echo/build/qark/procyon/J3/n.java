// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class n extends B.e.d.a.b
{
    public final C a;
    public final c b;
    public final B.a c;
    public final d d;
    public final C e;
    
    public n(final C a, final c b, final B.a c, final d d, final C e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public B.a b() {
        return this.c;
    }
    
    @Override
    public C c() {
        return this.e;
    }
    
    @Override
    public c d() {
        return this.b;
    }
    
    @Override
    public d e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof B.e.d.a.b) {
            final B.e.d.a.b b = (B.e.d.a.b)o;
            final C a = this.a;
            if (a == null) {
                if (b.f() != null) {
                    return false;
                }
            }
            else if (!a.equals(b.f())) {
                return false;
            }
            final c b2 = this.b;
            if (b2 == null) {
                if (b.d() != null) {
                    return false;
                }
            }
            else if (!b2.equals(b.d())) {
                return false;
            }
            final B.a c = this.c;
            if (c == null) {
                if (b.b() != null) {
                    return false;
                }
            }
            else if (!c.equals(b.b())) {
                return false;
            }
            if (this.d.equals(b.e()) && this.e.equals(b.c())) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public C f() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final C a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final c b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final B.a c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.e.d.a.b.b
    {
        public C a;
        public c b;
        public B.a c;
        public d d;
        public C e;
        
        @Override
        public B.e.d.a.b a() {
            final d d = this.d;
            String string = "";
            if (d == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" signal");
                string = sb.toString();
            }
            String string2 = string;
            if (this.e == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" binaries");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public B.e.d.a.b.b b(final B.a c) {
            this.c = c;
            return this;
        }
        
        @Override
        public B.e.d.a.b.b c(final C e) {
            if (e != null) {
                this.e = e;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }
        
        @Override
        public B.e.d.a.b.b d(final c b) {
            this.b = b;
            return this;
        }
        
        @Override
        public B.e.d.a.b.b e(final d d) {
            if (d != null) {
                this.d = d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }
        
        @Override
        public B.e.d.a.b.b f(final C a) {
            this.a = a;
            return this;
        }
    }
}
