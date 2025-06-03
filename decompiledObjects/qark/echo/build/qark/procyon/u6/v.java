// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import java.util.List;
import p6.B0;
import V5.e;

public abstract class v
{
    public static final w a(final Throwable t, final String s) {
        if (t != null) {
            throw t;
        }
        d();
        throw new e();
    }
    
    public static final boolean c(final B0 b0) {
        return b0.H() instanceof w;
    }
    
    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
    
    public static final B0 e(final t t, final List list) {
        try {
            return t.b(list);
        }
        finally {
            final Throwable t2;
            return a(t2, t.a());
        }
    }
}
