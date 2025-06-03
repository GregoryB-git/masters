/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.reflect.Array
 */
package W5;

import java.lang.reflect.Array;
import kotlin.jvm.internal.Intrinsics;

public class h {
    public static final Object[] a(Object[] object, int n8) {
        Intrinsics.checkNotNullParameter(object, "reference");
        object = Array.newInstance((Class)object.getClass().getComponentType(), (int)n8);
        Intrinsics.c(object, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[])object;
    }
}

