// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import kotlin.jvm.internal.Intrinsics;

public abstract class p
{
    public static final Object a;
    
    static {
        a = new F("CONDITION_FALSE");
    }
    
    public static final Object a() {
        return p.a;
    }
    
    public static final q b(final Object o) {
        z z;
        if (o instanceof z) {
            z = (z)o;
        }
        else {
            z = null;
        }
        q a;
        if (z == null || (a = z.a) == null) {
            Intrinsics.c(o, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            a = (q)o;
        }
        return a;
    }
}
