/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.List
 */
package W5;

import W5.i;
import W5.l;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class j
extends i {
    public static List b(Object[] list) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        list = l.a((Object[])list);
        Intrinsics.checkNotNullExpressionValue((Object)list, "asList(...)");
        return list;
    }

    public static final Object[] c(Object[] arrobject, Object[] arrobject2, int n8, int n9, int n10) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        Intrinsics.checkNotNullParameter(arrobject2, "destination");
        System.arraycopy((Object)arrobject, (int)n9, (Object)arrobject2, (int)n8, (int)(n10 - n9));
        return arrobject2;
    }

    public static /* synthetic */ Object[] d(Object[] arrobject, Object[] arrobject2, int n8, int n9, int n10, int n11, Object object) {
        if ((n11 & 2) != 0) {
            n8 = 0;
        }
        if ((n11 & 4) != 0) {
            n9 = 0;
        }
        if ((n11 & 8) != 0) {
            n10 = arrobject.length;
        }
        return j.c(arrobject, arrobject2, n8, n9, n10);
    }

    public static final void e(Object[] arrobject, Object object, int n8, int n9) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        Arrays.fill((Object[])arrobject, (int)n8, (int)n9, (Object)object);
    }

    public static void f(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        if (arrobject.length > 1) {
            Arrays.sort((Object[])arrobject);
        }
    }

    public static final void g(Object[] arrobject, Comparator comparator) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        Intrinsics.checkNotNullParameter((Object)comparator, "comparator");
        if (arrobject.length > 1) {
            Arrays.sort((Object[])arrobject, (Comparator)comparator);
        }
    }
}

