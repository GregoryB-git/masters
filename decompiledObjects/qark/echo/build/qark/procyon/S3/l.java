// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.Comparator;

public class l implements Comparator
{
    public static l o;
    
    static {
        l.o = new l();
    }
    
    public static l b(final Class clazz) {
        return l.o;
    }
    
    public int a(final Comparable comparable, final Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
