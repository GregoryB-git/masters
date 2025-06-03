// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class r extends e
{
    public final String a;
    public final int b;
    public final C c;
    
    public r(final String a, final int b, final C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public C b() {
        return this.c;
    }
    
    @Override
    public int c() {
        return this.b;
    }
    
    @Override
    public String d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            return this.a.equals(e.d()) && this.b == e.c() && this.c.equals(e.b());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends e.a
    {
        public String a;
        public Integer b;
        public C c;
        
        @Override
        public e a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" name");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" importance");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" frames");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new r(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public e.a b(final C c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null frames");
        }
        
        @Override
        public e.a c(final int i) {
            this.b = i;
            return this;
        }
        
        @Override
        public e.a d(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }
}
