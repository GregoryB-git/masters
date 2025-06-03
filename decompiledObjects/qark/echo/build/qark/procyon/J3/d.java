// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class d extends B.a.a
{
    public final String a;
    public final String b;
    public final String c;
    
    public d(final String a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public String c() {
        return this.c;
    }
    
    @Override
    public String d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof B.a.a) {
            final B.a.a a = (B.a.a)o;
            return this.a.equals(a.b()) && this.b.equals(a.d()) && this.c.equals(a.c());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends B.a.a.a
    {
        public String a;
        public String b;
        public String c;
        
        @Override
        public B.a.a a() {
            final String a = this.a;
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
                sb2.append(" libraryName");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" buildId");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new d(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public B.a.a.a b(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null arch");
        }
        
        @Override
        public B.a.a.a c(final String c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }
        
        @Override
        public B.a.a.a d(final String b) {
            if (b != null) {
                this.b = b;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }
}
