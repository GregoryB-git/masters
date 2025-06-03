/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Comparator
 *  java.util.SortedSet
 */
package X2;

import W2.m;
import X2.P;
import X2.c0;
import java.util.Comparator;
import java.util.SortedSet;

public abstract class d0 {
    public static Comparator a(SortedSet object) {
        Comparator comparator = object.comparator();
        object = comparator;
        if (comparator == null) {
            object = P.d();
        }
        return object;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        block4 : {
            block3 : {
                block2 : {
                    m.j((Object)comparator);
                    m.j((Object)iterable);
                    if (!(iterable instanceof SortedSet)) break block2;
                    iterable = d0.a((SortedSet)iterable);
                    break block3;
                }
                if (!(iterable instanceof c0)) break block4;
                iterable = ((c0)iterable).comparator();
            }
            return comparator.equals((Object)iterable);
        }
        return false;
    }
}

