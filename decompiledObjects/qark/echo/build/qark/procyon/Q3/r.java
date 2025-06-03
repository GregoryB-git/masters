// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import d4.n;

public abstract class r
{
    public static c a() {
        return new c(false, null, null);
    }
    
    public static c b(final m m) {
        return new c(true, m.b(), null);
    }
    
    public interface b
    {
        c a(final m p0);
        
        void b(final Q3.c p0, final boolean p1, final Q3.b p2);
    }
    
    public static class c
    {
        public boolean a;
        public n b;
        
        public c(final boolean a, final n b) {
            this.a = a;
            this.b = b;
        }
        
        public n a() {
            return this.b;
        }
        
        public boolean b() {
            return this.a;
        }
    }
}
