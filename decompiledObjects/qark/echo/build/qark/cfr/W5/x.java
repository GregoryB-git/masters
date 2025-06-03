/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.util.ListIterator
 *  java.util.NoSuchElementException
 */
package W5;

import h6.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class x
implements ListIterator,
a {
    public static final x o = new x();

    public Void b() {
        throw new NoSuchElementException();
    }

    public Void d() {
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

