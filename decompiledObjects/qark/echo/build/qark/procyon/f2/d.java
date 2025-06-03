// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import java.util.Arrays;

public final class d extends p
{
    public final String a;
    public final byte[] b;
    public final c2.d c;
    
    public d(final String a, final byte[] b, final c2.d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public byte[] c() {
        return this.b;
    }
    
    @Override
    public c2.d d() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof p) {
            final p p = (p)o;
            if (this.a.equals(p.b())) {
                final byte[] b = this.b;
                byte[] a2;
                if (p instanceof d) {
                    a2 = ((d)p).b;
                }
                else {
                    a2 = p.c();
                }
                if (Arrays.equals(b, a2) && this.c.equals(p.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
    }
    
    public static final class b extends a
    {
        public String a;
        public byte[] b;
        public c2.d c;
        
        @Override
        public p a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" backendName");
                string = sb.toString();
            }
            String string2 = string;
            if (this.c == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" priority");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new d(this.a, this.b, this.c, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a b(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }
        
        @Override
        public a c(final byte[] b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a d(final c2.d c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }
}
