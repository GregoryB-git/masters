package kotlin.jvm.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b {
    public static final Iterator a(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new a(array);
    }
}
