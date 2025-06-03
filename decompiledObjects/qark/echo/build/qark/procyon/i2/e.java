// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i2;

public final class e
{
    public static final e c;
    public final long a;
    public final long b;
    
    static {
        c = new a().a();
    }
    
    public e(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public static a c() {
        return new a();
    }
    
    public long a() {
        return this.a;
    }
    
    public long b() {
        return this.b;
    }
    
    public static final class a
    {
        public long a;
        public long b;
        
        public a() {
            this.a = 0L;
            this.b = 0L;
        }
        
        public e a() {
            return new e(this.a, this.b);
        }
        
        public a b(final long a) {
            this.a = a;
            return this;
        }
        
        public a c(final long b) {
            this.b = b;
            return this;
        }
    }
}
