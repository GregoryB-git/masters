package X2;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class d0 {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? P.d() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        W2.m.j(comparator);
        W2.m.j(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof c0)) {
                return false;
            }
            comparator2 = ((c0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
