/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.Set
 */
package W5;

import W5.A;
import W5.C;
import W5.I;
import W5.J;
import W5.k;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public class K
extends J {
    public static Set b() {
        return A.o;
    }

    public static /* varargs */ HashSet c(Object ... arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "elements");
        return (HashSet)k.s(arrobject, (Collection)new HashSet(C.a(arrobject.length)));
    }

    public static /* varargs */ Set d(Object ... arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "elements");
        return (Set)k.s(arrobject, (Collection)new LinkedHashSet(C.a(arrobject.length)));
    }

    public static final Set e(Set set) {
        Intrinsics.checkNotNullParameter((Object)set, "<this>");
        int n8 = set.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return set;
            }
            return I.a(set.iterator().next());
        }
        return I.b();
    }

    public static /* varargs */ Set f(Object ... arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "elements");
        return k.w(arrobject);
    }
}

