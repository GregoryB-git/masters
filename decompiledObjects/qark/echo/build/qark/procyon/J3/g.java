// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

import java.util.Arrays;

public final class g extends d.b
{
    public final String a;
    public final byte[] b;
    
    public g(final String a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public byte[] b() {
        return this.b;
    }
    
    @Override
    public String c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof d.b) {
            final d.b b = (d.b)o;
            if (this.a.equals(b.c())) {
                final byte[] b2 = this.b;
                byte[] a2;
                if (b instanceof g) {
                    a2 = ((g)b).b;
                }
                else {
                    a2 = b.b();
                }
                if (Arrays.equals(b2, a2)) {
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
        sb.append("File{filename=");
        sb.append(this.a);
        sb.append(", contents=");
        sb.append(Arrays.toString(this.b));
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public String a;
        public byte[] b;
        
        @Override
        public d.b a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" filename");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" contents");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new g(this.a, this.b, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a b(final byte[] b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null contents");
        }
        
        @Override
        public a c(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }
}
