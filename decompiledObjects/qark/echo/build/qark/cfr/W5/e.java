/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.Iterator
 */
package W5;

import W5.g;
import W5.n;
import h6.a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.f;

public final class e
implements Collection,
a {
    public final Object[] o;
    public final boolean p;

    public e(Object[] arrobject, boolean bl) {
        Intrinsics.checkNotNullParameter(arrobject, "values");
        this.o = arrobject;
        this.p = bl;
    }

    public int a() {
        return this.o.length;
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object object) {
        return g.h(this.o, object);
    }

    public boolean containsAll(Collection collection) {
        boolean bl;
        block2 : {
            Intrinsics.checkNotNullParameter((Object)collection, "elements");
            collection = (Iterable)collection;
            bl = collection.isEmpty();
            boolean bl2 = true;
            if (bl) {
                return true;
            }
            collection = collection.iterator();
            do {
                bl = bl2;
                if (!collection.hasNext()) break block2;
            } while (this.contains(collection.next()));
            bl = false;
        }
        return bl;
    }

    public boolean isEmpty() {
        if (this.o.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return b.a(this.o);
    }

    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray() {
        return n.a(this.o, this.p);
    }

    public Object[] toArray(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "array");
        return f.b(this, arrobject);
    }
}

