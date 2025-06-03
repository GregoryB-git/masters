// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

import java.util.List;

public abstract class m
{
    public static a a() {
        return (a)new g.b();
    }
    
    public abstract k b();
    
    public abstract List c();
    
    public abstract Integer d();
    
    public abstract String e();
    
    public abstract p f();
    
    public abstract long g();
    
    public abstract long h();
    
    public abstract static class a
    {
        public abstract m a();
        
        public abstract a b(final k p0);
        
        public abstract a c(final List p0);
        
        public abstract a d(final Integer p0);
        
        public abstract a e(final String p0);
        
        public abstract a f(final p p0);
        
        public abstract a g(final long p0);
        
        public abstract a h(final long p0);
        
        public a i(final int i) {
            return this.d(i);
        }
        
        public a j(final String s) {
            return this.e(s);
        }
    }
}
