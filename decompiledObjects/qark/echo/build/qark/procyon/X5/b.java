// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X5;

import kotlin.jvm.internal.Intrinsics;
import g6.l;

public abstract class b implements c
{
    public final l o;
    public final c p;
    
    public b(final c c, final l o) {
        Intrinsics.checkNotNullParameter(c, "baseKey");
        Intrinsics.checkNotNullParameter(o, "safeCast");
        this.o = o;
        c p2 = c;
        if (c instanceof b) {
            p2 = ((b)c).p;
        }
        this.p = p2;
    }
    
    public final boolean a(final c c) {
        Intrinsics.checkNotNullParameter(c, "key");
        return c == this || this.p == c;
    }
    
    public final g.b b(final g.b b) {
        Intrinsics.checkNotNullParameter(b, "element");
        return (g.b)this.o.invoke(b);
    }
}
