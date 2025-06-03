package W5;

import java.lang.reflect.Array;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0678h {
    public static final Object[] a(Object[] reference, int i7) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i7);
        Intrinsics.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}
