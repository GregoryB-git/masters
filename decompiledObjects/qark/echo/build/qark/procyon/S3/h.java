// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.Comparator;

public interface h
{
    h a();
    
    h b(final Object p0, final Object p1, final Comparator p2);
    
    h c(final Object p0, final Object p1, final a p2, final h p3, final h p4);
    
    boolean d();
    
    void e(final b p0);
    
    h f();
    
    h g(final Object p0, final Comparator p1);
    
    Object getKey();
    
    Object getValue();
    
    h h();
    
    h i();
    
    boolean isEmpty();
    
    int size();
    
    public enum a
    {
        o("RED", 0), 
        p("BLACK", 1);
        
        public a(final String name, final int ordinal) {
        }
    }
    
    public abstract static class b
    {
        public abstract void a(final Object p0, final Object p1);
    }
}
