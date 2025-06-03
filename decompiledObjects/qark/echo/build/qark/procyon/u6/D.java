// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import kotlin.jvm.internal.Intrinsics;

public abstract class D
{
    public static Object a(final Object o) {
        return o;
    }
    
    public static final C b(final Object o) {
        if (o != d.a()) {
            Intrinsics.c(o, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (C)o;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }
    
    public static final boolean c(final Object o) {
        return o == d.a();
    }
}
