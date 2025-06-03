// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i2;

public final class f
{
    public static final f c;
    public final long a;
    public final long b;
    
    static {
        c = new a().a();
    }
    
    public f(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public static a c() {
        return new a();
    }
    
    public long a() {
        return this.b;
    }
    
    public long b() {
        return this.a;
    }
    
    public static final class a
    {
        public long a;
        public long b;
        
        public a() {
            this.a = 0L;
            this.b = 0L;
        }
        
        public f a() {
            return new f(this.a, this.b);
        }
        
        public a b(final long b) {
            this.b = b;
            return this;
        }
        
        public a c(final long a) {
            this.a = a;
            return this;
        }
    }
}
