// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.Comparator;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import java.util.List;

public class j extends i
{
    public static List b(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        final List a = l.a(array);
        Intrinsics.checkNotNullExpressionValue(a, "asList(...)");
        return a;
    }
    
    public static final Object[] c(final Object[] array, final Object[] array2, final int n, final int n2, final int n3) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(array2, "destination");
        System.arraycopy(array, n2, array2, n, n3 - n2);
        return array2;
    }
    
    public static final void e(final Object[] a, final Object val, final int fromIndex, final int toIndex) {
        Intrinsics.checkNotNullParameter(a, "<this>");
        Arrays.fill(a, fromIndex, toIndex, val);
    }
    
    public static void f(final Object[] a) {
        Intrinsics.checkNotNullParameter(a, "<this>");
        if (a.length > 1) {
            Arrays.sort(a);
        }
    }
    
    public static final void g(final Object[] a, final Comparator c) {
        Intrinsics.checkNotNullParameter(a, "<this>");
        Intrinsics.checkNotNullParameter(c, "comparator");
        if (a.length > 1) {
            Arrays.sort(a, c);
        }
    }
}
