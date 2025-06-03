// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m4;

public final class a
{
    public int a;
    public d.a b;
    
    public a() {
        this.b = d.a.o;
    }
    
    public static a b() {
        return new a();
    }
    
    public d a() {
        return new a(this.a, this.b);
    }
    
    public a c(final int a) {
        this.a = a;
        return this;
    }
    
    public static final class a implements d
    {
        public final int a;
        public final d.a b;
        
        public a(final int a, final d.a b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public Class annotationType() {
            return d.class;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return this.a == d.tag() && this.b.equals(d.intEncoding());
        }
        
        @Override
        public int hashCode() {
            return (0xDE0D66 ^ this.a) + (this.b.hashCode() ^ 0x79AD669E);
        }
        
        @Override
        public d.a intEncoding() {
            return this.b;
        }
        
        @Override
        public int tag() {
            return this.a;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
            sb.append('(');
            sb.append("tag=");
            sb.append(this.a);
            sb.append("intEncoding=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
}
