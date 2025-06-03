// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V5;

import kotlin.jvm.internal.Intrinsics;

public abstract class o
{
    public static final Object a(final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "exception");
        return new n.b(t);
    }
    
    public static final void b(final Object o) {
        if (!(o instanceof n.b)) {
            return;
        }
        throw ((n.b)o).o;
    }
}
