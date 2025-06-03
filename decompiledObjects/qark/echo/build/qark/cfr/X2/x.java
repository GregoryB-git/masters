/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package X2;

import X2.C;
import X2.Q;
import X2.Y;
import X2.f;
import X2.g;
import X2.g0;
import X2.t;
import X2.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class x
extends g
implements Serializable {
    private static final long serialVersionUID = 0L;
    public final transient w r;
    public final transient int s;

    public x(w w8, int n8) {
        this.r = w8;
        this.s = n8;
    }

    @Override
    public boolean b(Object object) {
        if (object != null && f.super.b(object)) {
            return true;
        }
        return false;
    }

    @Override
    public Map c() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set d() {
        throw new AssertionError((Object)"unreachable");
    }

    public w h() {
        return this.r;
    }

    public t i() {
        return new d(this);
    }

    public g0 j() {
        return new g0(){
            public Iterator o;
            public Iterator p;
            {
                this.o = x.this.r.k().q();
                this.p = C.f();
            }

            public boolean hasNext() {
                if (!this.p.hasNext() && !this.o.hasNext()) {
                    return false;
                }
                return true;
            }

            public Object next() {
                if (!this.p.hasNext()) {
                    this.p = ((t)((Object)this.o.next())).q();
                }
                return this.p.next();
            }
        };
    }

    public t k() {
        return (t)f.super.values();
    }

    @Override
    public final boolean put(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return this.s;
    }

    public static abstract class b {
        public final Map a = Q.c();
        public Comparator b;
        public Comparator c;
    }

    public static abstract class c {
        public static final Y.b a = Y.a(x.class, "map");
        public static final Y.b b = Y.a(x.class, "size");
    }

    public static final class d
    extends t {
        private static final long serialVersionUID = 0L;
        public final transient x p;

        public d(x x8) {
            this.p = x8;
        }

        @Override
        public boolean contains(Object object) {
            return this.p.b(object);
        }

        @Override
        public int d(Object[] arrobject, int n8) {
            g0 g02 = this.p.r.k().q();
            while (g02.hasNext()) {
                n8 = ((t)((Object)g02.next())).d(arrobject, n8);
            }
            return n8;
        }

        @Override
        public g0 q() {
            return this.p.j();
        }

        public int size() {
            return this.p.size();
        }

        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

}

