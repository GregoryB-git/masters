// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z5;

import X5.g;
import X5.h;
import X5.d;

public abstract class j extends a
{
    public j(final d d) {
        super(d);
        if (d == null) {
            return;
        }
        if (d.getContext() == h.o) {
            return;
        }
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
    }
    
    @Override
    public g getContext() {
        return h.o;
    }
}
