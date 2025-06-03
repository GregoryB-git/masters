// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import c2.b;
import c2.e;

public final class c extends o
{
    public final p a;
    public final String b;
    public final c2.c c;
    public final e d;
    public final c2.b e;
    
    public c(final p a, final String b, final c2.c c, final e d, final c2.b e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public c2.b b() {
        return this.e;
    }
    
    @Override
    public c2.c c() {
        return this.c;
    }
    
    @Override
    public e e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof o) {
            final o o2 = (o)o;
            return this.a.equals(o2.f()) && this.b.equals(o2.g()) && this.c.equals(o2.c()) && this.d.equals(o2.e()) && this.e.equals(o2.b());
        }
        return false;
    }
    
    @Override
    public p f() {
        return this.a;
    }
    
    @Override
    public String g() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SendRequest{transportContext=");
        sb.append(this.a);
        sb.append(", transportName=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.c);
        sb.append(", transformer=");
        sb.append(this.d);
        sb.append(", encoding=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public p a;
        public String b;
        public c2.c c;
        public e d;
        public c2.b e;
        
        @Override
        public o a() {
            final p a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" transportContext");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" transportName");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" event");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" transformer");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.e == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" encoding");
                string5 = sb5.toString();
            }
            if (string5.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(string5);
            throw new IllegalStateException(sb6.toString());
        }
        
        @Override
        public a b(final c2.b e) {
            if (e != null) {
                this.e = e;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }
        
        @Override
        public a c(final c2.c c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null event");
        }
        
        @Override
        public a d(final e d) {
            if (d != null) {
                this.d = d;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }
        
        @Override
        public a e(final p a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }
        
        @Override
        public a f(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }
}
