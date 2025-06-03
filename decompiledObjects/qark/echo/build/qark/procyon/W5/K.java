// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.LinkedHashSet;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import java.util.HashSet;
import java.util.Set;

public class K extends J
{
    public static Set b() {
        return A.o;
    }
    
    public static HashSet c(final Object... array) {
        Intrinsics.checkNotNullParameter(array, "elements");
        return (HashSet)k.s(array, new HashSet(C.a(array.length)));
    }
    
    public static Set d(final Object... array) {
        Intrinsics.checkNotNullParameter(array, "elements");
        return (Set)k.s(array, new LinkedHashSet(C.a(array.length)));
    }
    
    public static final Set e(final Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        final int size = set.size();
        if (size == 0) {
            return I.b();
        }
        if (size != 1) {
            return set;
        }
        return I.a(set.iterator().next());
    }
    
    public static Set f(final Object... array) {
        Intrinsics.checkNotNullParameter(array, "elements");
        return k.w(array);
    }
}
