/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package W5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class n {
    public static final Object[] a(Object[] arrobject, boolean bl) {
        Intrinsics.checkNotNullParameter(arrobject, "<this>");
        if (bl && Intrinsics.a((Object)arrobject.getClass(), Object[].class)) {
            return arrobject;
        }
        arrobject = Arrays.copyOf((Object[])arrobject, (int)arrobject.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(arrobject, "copyOf(...)");
        return arrobject;
    }

    public static List b(Object object) {
        object = Collections.singletonList((Object)object);
        Intrinsics.checkNotNullExpressionValue(object, "singletonList(...)");
        return object;
    }

    public static final Object[] c(int n8, Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "array");
        if (n8 < arrobject.length) {
            arrobject[n8] = null;
        }
        return arrobject;
    }
}

