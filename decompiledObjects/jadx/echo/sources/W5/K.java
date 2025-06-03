package W5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class K extends J {
    public static Set b() {
        return A.f6874o;
    }

    public static HashSet c(Object... elements) {
        int a7;
        Intrinsics.checkNotNullParameter(elements, "elements");
        a7 = E.a(elements.length);
        return (HashSet) C0681k.s(elements, new HashSet(a7));
    }

    public static Set d(Object... elements) {
        int a7;
        Intrinsics.checkNotNullParameter(elements, "elements");
        a7 = E.a(elements.length);
        return (Set) C0681k.s(elements, new LinkedHashSet(a7));
    }

    public static final Set e(Set set) {
        Set b7;
        Set a7;
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size == 0) {
            b7 = b();
            return b7;
        }
        if (size != 1) {
            return set;
        }
        a7 = J.a(set.iterator().next());
        return a7;
    }

    public static Set f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C0681k.w(elements);
    }
}
