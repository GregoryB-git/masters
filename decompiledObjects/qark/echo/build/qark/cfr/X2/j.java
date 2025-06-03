/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.StringBuilder
 *  java.util.AbstractCollection
 *  java.util.Collection
 *  java.util.Iterator
 */
package X2;

import W2.m;
import W2.n;
import X2.B;
import X2.C;
import X2.E;
import X2.i;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class j {
    public static boolean a(Collection collection, Collection collection2) {
        collection2 = collection2.iterator();
        while (collection2.hasNext()) {
            if (collection.contains(collection2.next())) continue;
            return false;
        }
        return true;
    }

    public static StringBuilder b(int n8) {
        i.b(n8, "size");
        return new StringBuilder((int)Math.min((long)((long)n8 * 8L), (long)0x40000000L));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(Collection collection, Object object) {
        m.j((Object)collection);
        try {
            return collection.contains(object);
        }
        catch (ClassCastException | NullPointerException classCastException) {
            return false;
        }
    }

    public static abstract class a
    extends AbstractCollection {
        public final Collection o;
        public final n p;

        public a(Collection collection, n n8) {
            this.o = collection;
            this.p = n8;
        }

        public boolean add(Object object) {
            m.d(this.p.apply(object));
            return this.o.add(object);
        }

        public boolean addAll(Collection collection) {
            for (Object object : collection) {
                m.d(this.p.apply(object));
            }
            return this.o.addAll(collection);
        }

        public void clear() {
            B.h((Iterable)this.o, this.p);
        }

        public boolean contains(Object object) {
            if (j.c(this.o, object)) {
                return this.p.apply(object);
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            return j.a((Collection)this, collection);
        }

        public boolean isEmpty() {
            return B.a((Iterable)this.o, this.p) ^ true;
        }

        public Iterator iterator() {
            return C.i(this.o.iterator(), this.p);
        }

        public boolean remove(Object object) {
            if (this.contains(object) && this.o.remove(object)) {
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection collection) {
            Iterator iterator = this.o.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                Object object = iterator.next();
                if (!this.p.apply(object) || !collection.contains(object)) continue;
                iterator.remove();
                bl = true;
            }
            return bl;
        }

        public boolean retainAll(Collection collection) {
            Iterator iterator = this.o.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                Object object = iterator.next();
                if (!this.p.apply(object) || collection.contains(object)) continue;
                iterator.remove();
                bl = true;
            }
            return bl;
        }

        public int size() {
            Iterator iterator = this.o.iterator();
            int n8 = 0;
            while (iterator.hasNext()) {
                Object object = iterator.next();
                if (!this.p.apply(object)) continue;
                ++n8;
            }
            return n8;
        }

        public Object[] toArray() {
            return E.i(this.iterator()).toArray();
        }

        public Object[] toArray(Object[] arrobject) {
            return E.i(this.iterator()).toArray(arrobject);
        }
    }

}

