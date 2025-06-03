// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.lang.reflect.Array;
import kotlin.jvm.internal.Intrinsics;

public class h
{
    public static final Object[] a(final Object[] array, final int length) {
        Intrinsics.checkNotNullParameter(array, "reference");
        final Object instance = Array.newInstance(array.getClass().getComponentType(), length);
        Intrinsics.c(instance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[])instance;
    }
}
