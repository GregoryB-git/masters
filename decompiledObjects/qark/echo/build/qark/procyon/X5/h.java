// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X5;

import g6.p;
import kotlin.jvm.internal.Intrinsics;
import java.io.Serializable;

public final class h implements g, Serializable
{
    public static final h o;
    private static final long serialVersionUID = 0L;
    
    static {
        o = new h();
    }
    
    private final Object readResolve() {
        return h.o;
    }
    
    @Override
    public b b(final c c) {
        Intrinsics.checkNotNullParameter(c, "key");
        return null;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @Override
    public g k(final g g) {
        Intrinsics.checkNotNullParameter(g, "context");
        return g;
    }
    
    @Override
    public String toString() {
        return "EmptyCoroutineContext";
    }
    
    @Override
    public Object u(final Object o, final p p2) {
        Intrinsics.checkNotNullParameter(p2, "operation");
        return o;
    }
    
    @Override
    public g x(final c c) {
        Intrinsics.checkNotNullParameter(c, "key");
        return this;
    }
}
