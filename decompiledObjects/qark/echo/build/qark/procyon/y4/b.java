// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y4;

import com.google.firebase.messaging.M;

public final class b
{
    public static final b b;
    public final y4.a a;
    
    static {
        b = new a().a();
    }
    
    public b(final y4.a a) {
        this.a = a;
    }
    
    public static a b() {
        return new a();
    }
    
    public y4.a a() {
        return this.a;
    }
    
    public byte[] c() {
        return M.a(this);
    }
    
    public static final class a
    {
        public y4.a a;
        
        public a() {
            this.a = null;
        }
        
        public b a() {
            return new b(this.a);
        }
        
        public a b(final y4.a a) {
            this.a = a;
            return this;
        }
    }
}
