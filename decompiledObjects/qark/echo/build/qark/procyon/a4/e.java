// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

public interface e
{
    void a();
    
    String toString();
    
    public enum a
    {
        o("CHILD_REMOVED", 0), 
        p("CHILD_ADDED", 1), 
        q("CHILD_MOVED", 2), 
        r("CHILD_CHANGED", 3), 
        s("VALUE", 4);
        
        public a(final String name, final int ordinal) {
        }
    }
}
