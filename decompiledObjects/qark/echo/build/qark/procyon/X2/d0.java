// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.m;
import java.util.Comparator;
import java.util.SortedSet;

public abstract class d0
{
    public static Comparator a(final SortedSet set) {
        Comparator comparator;
        if ((comparator = set.comparator()) == null) {
            comparator = P.d();
        }
        return comparator;
    }
    
    public static boolean b(final Comparator comparator, final Iterable iterable) {
        m.j(comparator);
        m.j(iterable);
        Comparator comparator2;
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet)iterable);
        }
        else {
            if (!(iterable instanceof c0)) {
                return false;
            }
            comparator2 = ((c0)iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
