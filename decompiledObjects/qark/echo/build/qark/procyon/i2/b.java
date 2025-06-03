// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i2;

public final class b
{
    public static final b b;
    public final e a;
    
    static {
        b = new a().a();
    }
    
    public b(final e a) {
        this.a = a;
    }
    
    public static a b() {
        return new a();
    }
    
    public e a() {
        return this.a;
    }
    
    public static final class a
    {
        public e a;
        
        public a() {
            this.a = null;
        }
        
        public b a() {
            return new b(this.a);
        }
        
        public a b(final e a) {
            this.a = a;
            return this;
        }
    }
}
