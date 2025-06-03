// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import l6.c;
import java.util.List;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import java.util.ArrayList;

public class o extends n
{
    public static ArrayList d(final Object... array) {
        Intrinsics.checkNotNullParameter(array, "elements");
        if (array.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new e(array, true));
    }
    
    public static final Collection e(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        return new e(array, false);
    }
    
    public static List f() {
        return y.o;
    }
    
    public static c g(final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new c(0, collection.size() - 1);
    }
    
    public static int h(final List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }
    
    public static List i(final Object... array) {
        Intrinsics.checkNotNullParameter(array, "elements");
        if (array.length > 0) {
            return g.b(array);
        }
        return m.f();
    }
    
    public static final List j(final List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        final int size = list.size();
        if (size == 0) {
            return m.f();
        }
        if (size != 1) {
            return list;
        }
        return m.b(list.get(0));
    }
    
    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
