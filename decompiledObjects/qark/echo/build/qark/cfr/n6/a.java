/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.concurrent.atomic.AtomicReference
 */
package n6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import n6.b;

public final class a
implements b {
    public final AtomicReference a;

    public a(b b8) {
        Intrinsics.checkNotNullParameter(b8, "sequence");
        this.a = new AtomicReference((Object)b8);
    }

    @Override
    public Iterator iterator() {
        b b8 = (b)this.a.getAndSet((Object)null);
        if (b8 != null) {
            return b8.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

