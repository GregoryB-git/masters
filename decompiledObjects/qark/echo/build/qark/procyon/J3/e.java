// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class e extends c
{
    public final String a;
    public final String b;
    
    public e(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            return this.a.equals(c.b()) && this.b.equals(c.c());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public String a;
        public String b;
        
        @Override
        public c a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" key");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" value");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new e(this.a, this.b, null);
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
            throw new NullPointerException("Null key");
        }
        
        @Override
        public a c(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }
}
