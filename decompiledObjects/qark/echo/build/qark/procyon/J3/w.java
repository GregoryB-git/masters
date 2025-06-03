// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

public final class w extends f
{
    public final String a;
    
    public w(final String a) {
        this.a = a;
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof f && this.a.equals(((f)o).b()));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("User{identifier=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    public static final class b extends a
    {
        public String a;
        
        @Override
        public f a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" identifier");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new w(this.a, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public a b(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }
}
