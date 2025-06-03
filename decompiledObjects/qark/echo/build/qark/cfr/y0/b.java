/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.NoSuchElementException
 */
package y0;

import java.util.NoSuchElementException;
import y0.n;

public abstract class b
implements n {
    public final long b;
    public final long c;
    public long d;

    public b(long l8, long l9) {
        this.b = l8;
        this.c = l9;
        this.f();
    }

    public final void c() {
        long l8 = this.d;
        if (l8 >= this.b && l8 <= this.c) {
            return;
        }
        throw new NoSuchElementException();
    }

    public final long d() {
        return this.d;
    }

    public boolean e() {
        if (this.d > this.c) {
            return true;
        }
        return false;
    }

    public void f() {
        this.d = this.b - 1L;
    }

    @Override
    public boolean next() {
        ++this.d;
        return this.e() ^ true;
    }
}

