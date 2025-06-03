// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a6;

import kotlin.jvm.internal.Intrinsics;

public abstract class b
{
    public static final a a(final Enum[] array) {
        Intrinsics.checkNotNullParameter(array, "entries");
        return new c(array);
    }
}
