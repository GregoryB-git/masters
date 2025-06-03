/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package W2;

import W2.j;
import W2.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class b
implements Iterator {
    public b o = b.p;
    public Object p;

    public abstract Object b();

    public final Object d() {
        this.o = b.q;
        return null;
    }

    public final boolean e() {
        this.o = b.r;
        this.p = this.b();
        if (this.o != b.q) {
            this.o = b.o;
            return true;
        }
        return false;
    }

    public final boolean hasNext() {
        boolean bl = this.o != b.r;
        m.o(bl);
        int n8 = .a[this.o.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                return this.e();
            }
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.hasNext()) {
            this.o = b.p;
            Object object = j.a(this.p);
            this.p = null;
            return object;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o = new b();
        public static final /* enum */ b p = new b();
        public static final /* enum */ b q = new b();
        public static final /* enum */ b r = new b();
        public static final /* synthetic */ b[] s;

        static {
            s = b.c();
        }

        public static /* synthetic */ b[] c() {
            return new b[]{o, p, q, r};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])s.clone();
        }
    }

}

