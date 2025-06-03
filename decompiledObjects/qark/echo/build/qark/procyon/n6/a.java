// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements b
{
    public final AtomicReference a;
    
    public a(final b initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "sequence");
        this.a = new AtomicReference((V)initialValue);
    }
    
    @Override
    public Iterator iterator() {
        final b b = this.a.getAndSet(null);
        if (b != null) {
            return b.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
