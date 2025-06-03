package W5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class n {
    public static final Object[] a(Object[] objArr, boolean z7) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (z7 && Intrinsics.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final Object[] c(int i7, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i7 < array.length) {
            array[i7] = null;
        }
        return array;
    }
}
