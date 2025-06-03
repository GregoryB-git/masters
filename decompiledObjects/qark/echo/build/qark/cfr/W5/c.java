/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.NoSuchElementException
 *  java.util.RandomAccess
 */
package W5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public abstract class c
extends W5.a
implements List,
h6.a {
    public static final a o = new a(null);

    public void add(int n8, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int n8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        return o.e(this, (Collection)object);
    }

    public abstract Object get(int var1);

    public int hashCode() {
        return o.f(this);
    }

    public int indexOf(Object object) {
        Iterator iterator = this.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            if (Intrinsics.a(iterator.next(), object)) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object object) {
        ListIterator listIterator = this.listIterator(this.size());
        while (listIterator.hasPrevious()) {
            if (!Intrinsics.a(listIterator.previous(), object)) continue;
            return listIterator.nextIndex();
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    public ListIterator listIterator(int n8) {
        return new c(n8);
    }

    public Object remove(int n8) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n8, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int n8, int n9) {
        return new d(this, n8, n9);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final void a(int n8, int n9) {
            if (n8 >= 0 && n8 < n9) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("index: ");
            stringBuilder.append(n8);
            stringBuilder.append(", size: ");
            stringBuilder.append(n9);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public final void b(int n8, int n9) {
            if (n8 >= 0 && n8 <= n9) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("index: ");
            stringBuilder.append(n8);
            stringBuilder.append(", size: ");
            stringBuilder.append(n9);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public final void c(int n8, int n9, int n10) {
            if (n8 >= 0 && n9 <= n10) {
                if (n8 <= n9) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("fromIndex: ");
                stringBuilder.append(n8);
                stringBuilder.append(" > toIndex: ");
                stringBuilder.append(n9);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fromIndex: ");
            stringBuilder.append(n8);
            stringBuilder.append(", toIndex: ");
            stringBuilder.append(n9);
            stringBuilder.append(", size: ");
            stringBuilder.append(n10);
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }

        public final int d(int n8, int n9) {
            int n10;
            n8 = n10 = n8 + (n8 >> 1);
            if (n10 - n9 < 0) {
                n8 = n9;
            }
            n10 = n8;
            if (n8 - 2147483639 > 0) {
                if (n9 > 2147483639) {
                    return Integer.MAX_VALUE;
                }
                n10 = 2147483639;
            }
            return n10;
        }

        public final boolean e(Collection collection, Collection collection2) {
            Intrinsics.checkNotNullParameter((Object)collection, "c");
            Intrinsics.checkNotNullParameter((Object)collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            collection2 = collection2.iterator();
            collection = collection.iterator();
            while (collection.hasNext()) {
                if (Intrinsics.a(collection.next(), collection2.next())) continue;
                return false;
            }
            return true;
        }

        public final int f(Collection collection) {
            Intrinsics.checkNotNullParameter((Object)collection, "c");
            collection = collection.iterator();
            int n8 = 1;
            while (collection.hasNext()) {
                Object object = collection.next();
                int n9 = object != null ? object.hashCode() : 0;
                n8 = n8 * 31 + n9;
            }
            return n8;
        }
    }

    public class b
    implements Iterator,
    h6.a {
        public int o;

        public final int b() {
            return this.o;
        }

        public final void d(int n8) {
            this.o = n8;
        }

        public boolean hasNext() {
            if (this.o < c.this.size()) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                c c8 = c.this;
                int n8 = this.o;
                this.o = n8 + 1;
                return c8.get(n8);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public class c
    extends b
    implements ListIterator,
    h6.a {
        public c(int n8) {
            c.o.b(n8, c.this.size());
            this.d(n8);
        }

        public void add(Object object) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            if (this.b() > 0) {
                return true;
            }
            return false;
        }

        public int nextIndex() {
            return this.b();
        }

        public Object previous() {
            if (this.hasPrevious()) {
                c c8 = c.this;
                this.d(this.b() - 1);
                return c8.get(this.b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.b() - 1;
        }

        public void set(Object object) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class d
    extends c
    implements RandomAccess {
        public final c p;
        public final int q;
        public int r;

        public d(c c8, int n8, int n9) {
            Intrinsics.checkNotNullParameter(c8, "list");
            this.p = c8;
            this.q = n8;
            c.o.c(n8, n9, c8.size());
            this.r = n9 - n8;
        }

        @Override
        public int a() {
            return this.r;
        }

        @Override
        public Object get(int n8) {
            c.o.a(n8, this.r);
            return this.p.get(this.q + n8);
        }
    }

}

