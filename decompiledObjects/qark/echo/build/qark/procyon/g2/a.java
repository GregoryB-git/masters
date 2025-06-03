// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g2;

import java.util.Arrays;

public final class a extends f
{
    public final Iterable a;
    public final byte[] b;
    
    public a(final Iterable a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Iterable b() {
        return this.a;
    }
    
    @Override
    public byte[] c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            if (this.a.equals(f.b())) {
                final byte[] b = this.b;
                byte[] a2;
                if (f instanceof a) {
                    a2 = ((a)f).b;
                }
                else {
                    a2 = f.c();
                }
                if (Arrays.equals(b, a2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BackendRequest{events=");
        sb.append(this.a);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.b));
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends f.a
    {
        public Iterable a;
        public byte[] b;
        
        @Override
        public f a() {
            final Iterable a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" events");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new a(this.a, this.b, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public f.a b(final Iterable a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null events");
        }
        
        @Override
        public f.a c(final byte[] b) {
            this.b = b;
            return this;
        }
    }
}
