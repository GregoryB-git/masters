// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.io.Serializable;

public final class d implements Serializable
{
    public static final a p;
    private static final long serialVersionUID = 0L;
    public final Class o;
    
    static {
        p = new a(null);
    }
    
    public d(final Enum[] array) {
        Intrinsics.checkNotNullParameter(array, "entries");
        final Class<?> componentType = array.getClass().getComponentType();
        Intrinsics.b(componentType);
        this.o = componentType;
    }
    
    private final Object readResolve() {
        final Enum[] enumConstants = this.o.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return b.a(enumConstants);
    }
    
    public static final class a
    {
    }
}
