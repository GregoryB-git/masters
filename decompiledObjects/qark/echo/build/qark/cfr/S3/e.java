/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 */
package S3;

import S3.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e
implements Iterable {
    public final c o;

    public e(c c8) {
        this.o = c8;
    }

    public e(List list, Comparator comparator) {
        this.o = c.a.b(list, Collections.emptyMap(), c.a.e(), comparator);
    }

    public Iterator P() {
        return new a(this.o.P());
    }

    public Object a() {
        return this.o.g();
    }

    public Object d() {
        return this.o.i();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return this.o.equals(object.o);
    }

    public Object f(Object object) {
        return this.o.k(object);
    }

    public e g(Object object) {
        return new e(this.o.s(object, null));
    }

    public int hashCode() {
        return this.o.hashCode();
    }

    public e i(Object object) {
        if ((object = this.o.D(object)) == this.o) {
            return this;
        }
        return new e((c)object);
    }

    public Iterator iterator() {
        return new a(this.o.iterator());
    }

    public static class a
    implements Iterator {
        public final Iterator o;

        public a(Iterator iterator) {
            this.o = iterator;
        }

        public boolean hasNext() {
            return this.o.hasNext();
        }

        public Object next() {
            return ((Map.Entry)this.o.next()).getKey();
        }

        public void remove() {
            this.o.remove();
        }
    }

}

