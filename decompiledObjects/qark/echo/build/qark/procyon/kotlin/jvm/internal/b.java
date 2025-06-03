// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import java.util.Iterator;

public abstract class b
{
    public static final Iterator a(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new a(array);
    }
}
