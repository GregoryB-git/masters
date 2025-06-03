/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package t;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class e
implements Iterator {
    public int o;
    public int p;
    public boolean q;

    public e(int n8) {
        this.o = n8;
    }

    public abstract Object b(int var1);

    public abstract void d(int var1);

    public final boolean hasNext() {
        if (this.p < this.o) {
            return true;
        }
        return false;
    }

    public Object next() {
        if (this.hasNext()) {
            Object object = this.b(this.p);
            ++this.p;
            this.q = true;
            return object;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.q) {
            int n8;
            this.p = n8 = this.p - 1;
            this.d(n8);
            --this.o;
            this.q = false;
            return;
        }
        throw new IllegalStateException();
    }
}

