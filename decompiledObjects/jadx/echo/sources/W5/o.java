package W5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class o extends n {
    public static ArrayList d(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C0675e(elements, true));
    }

    public static final Collection e(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new C0675e(objArr, false);
    }

    public static List f() {
        return y.f6894o;
    }

    public static l6.c g(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new l6.c(0, collection.size() - 1);
    }

    public static int h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List i(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C0680j.b(elements) : f();
    }

    public static final List j(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : n.b(list.get(0)) : f();
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
