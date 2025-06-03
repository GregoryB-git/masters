/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package W5;

import h6.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b
implements Iterator,
a {
    public int o;
    public Object p;

    public abstract void b();

    public final void d() {
        this.o = 2;
    }

    public final void e(Object object) {
        this.p = object;
        this.o = 1;
    }

    public final boolean f() {
        this.o = 3;
        this.b();
        if (this.o == 1) {
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        boolean bl;
        int n8 = this.o;
        if (n8 != 0) {
            bl = true;
            if (n8 != 1) {
                if (n8 == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }
        } else {
            bl = this.f();
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object next() {
        int n8 = this.o;
        if (n8 == 1 || n8 != 2 && this.f()) {
            this.o = 0;
            return this.p;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

