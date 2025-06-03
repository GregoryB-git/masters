// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class m extends B.e.d.a
{
    public final B.e.d.a.b a;
    public final C b;
    public final C c;
    public final Boolean d;
    public final int e;
    
    public m(final B.e.d.a.b a, final C b, final C c, final Boolean d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public Boolean b() {
        return this.d;
    }
    
    @Override
    public C c() {
        return this.b;
    }
    
    @Override
    public B.e.d.a.b d() {
        return this.a;
    }
    
    @Override
    public C e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof B.e.d.a) {
            final B.e.d.a a = (B.e.d.a)o;
            if (this.a.equals(a.d())) {
                final C b = this.b;
                if (b == null) {
                    if (a.c() != null) {
                        return false;
                    }
                }
                else if (!b.equals(a.c())) {
                    return false;
                }
                final C c = this.c;
                if (c == null) {
                    if (a.e() != null) {
                        return false;
                    }
                }
                else if (!c.equals(a.e())) {
                    return false;
                }
                final Boolean d = this.d;
                if (d == null) {
                    if (a.b() != null) {
                        return false;
                    }
                }
                else if (!d.equals(a.b())) {
                    return false;
                }
                if (this.e == a.f()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int f() {
        return this.e;
    }
    
    @Override
    public B.e.d.a.a g() {
        return new b(this, null);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final C b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final C c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode2) * 1000003 ^ this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", uiOrientation=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.e.d.a.a
    {
        public B.e.d.a.b a;
        public C b;
        public C c;
        public Boolean d;
        public Integer e;
        
        public b() {
        }
        
        public b(final B.e.d.a a) {
            this.a = a.d();
            this.b = a.c();
            this.c = a.e();
            this.d = a.b();
            this.e = a.f();
        }
        
        @Override
        public B.e.d.a a() {
            final B.e.d.a.b a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" execution");
                string = sb.toString();
            }
            String string2 = string;
            if (this.e == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" uiOrientation");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new m(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public B.e.d.a.a b(final Boolean d) {
            this.d = d;
            return this;
        }
        
        @Override
        public B.e.d.a.a c(final C b) {
            this.b = b;
            return this;
        }
        
        @Override
        public B.e.d.a.a d(final B.e.d.a.b a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null execution");
        }
        
        @Override
        public B.e.d.a.a e(final C c) {
            this.c = c;
            return this;
        }
        
        @Override
        public B.e.d.a.a f(final int i) {
            this.e = i;
            return this;
        }
    }
}
