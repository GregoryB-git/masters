/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package n6;

import g6.l;
import h6.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import n6.b;

public final class i
implements b {
    public final b a;
    public final l b;

    public i(b b8, l l8) {
        Intrinsics.checkNotNullParameter(b8, "sequence");
        Intrinsics.checkNotNullParameter(l8, "transformer");
        this.a = b8;
        this.b = l8;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(){
            public final Iterator o;
            {
                this.o = i8.a.iterator();
            }

            public boolean hasNext() {
                return this.o.hasNext();
            }

            public Object next() {
                return this.b.invoke(this.o.next());
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

}

