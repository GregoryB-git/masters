// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;

public final class h extends n
{
    public final Throwable a;
    
    public h(final Throwable a) {
        Intrinsics.checkNotNullParameter(a, "finalException");
        super(null);
        this.a = a;
    }
    
    public final Throwable a() {
        return this.a;
    }
}
