// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class f extends d
{
    public final C a;
    public final String b;
    
    public f(final C a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public C b() {
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
        if (o instanceof d) {
            final d d = (d)o;
            if (this.a.equals(d.b())) {
                final String b = this.b;
                final String c = d.c();
                if (b == null) {
                    if (c == null) {
                        return true;
                    }
                }
                else if (b.equals(c)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return (hashCode ^ 0xF4243) * 1000003 ^ hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends d.a
    {
        public C a;
        public String b;
        
        @Override
        public d a() {
            final C a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" files");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new f(this.a, this.b, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public d.a b(final C a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null files");
        }
        
        @Override
        public d.a c(final String b) {
            this.b = b;
            return this;
        }
    }
}
