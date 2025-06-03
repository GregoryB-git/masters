/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements Iterator,
h6.a {
    public final Object[] o;
    public int p;

    public a(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "array");
        this.o = arrobject;
    }

    public boolean hasNext() {
        if (this.p < this.o.length) {
            return true;
        }
        return false;
    }

    public Object next() {
        int n8;
        Object object;
        try {
            object = this.o;
            n8 = this.p;
            this.p = n8 + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.p;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        object = object[n8];
        return object;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

