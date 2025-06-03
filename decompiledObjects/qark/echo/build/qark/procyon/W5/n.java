// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public class n
{
    public static final Object[] a(Object[] copy, final boolean b) {
        Intrinsics.checkNotNullParameter(copy, "<this>");
        if (b && Intrinsics.a(copy.getClass(), Object[].class)) {
            return copy;
        }
        copy = Arrays.copyOf(copy, copy.length, (Class<? extends Object[]>)Object[].class);
        Intrinsics.checkNotNullExpressionValue(copy, "copyOf(...)");
        return copy;
    }
    
    public static List b(final Object o) {
        final List<Object> singletonList = Collections.singletonList(o);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }
    
    public static final Object[] c(final int n, final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (n < array.length) {
            array[n] = null;
        }
        return array;
    }
}
