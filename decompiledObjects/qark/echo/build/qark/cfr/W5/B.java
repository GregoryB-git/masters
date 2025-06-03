/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 */
package W5;

import h6.a;
import java.util.Iterator;

public abstract class B
implements Iterator,
a {
    public abstract int b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

