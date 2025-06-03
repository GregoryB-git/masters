/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.Iterator
 */
package W5;

import W5.m;
import g6.l;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f;

public abstract class a
implements Collection,
h6.a {
    public abstract int a();

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
        boolean bl;
        block2 : {
            bl = this.isEmpty();
            boolean bl2 = false;
            if (bl) {
                return false;
            }
            Iterator iterator = this.iterator();
            do {
                bl = bl2;
                if (!iterator.hasNext()) break block2;
            } while (!Intrinsics.a(iterator.next(), object));
            bl = true;
        }
        return bl;
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
        if (this.size() == 0) {
            return true;
        }
        return false;
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

    public Object[] toArray() {
        return f.a(this);
    }

    public Object[] toArray(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "array");
        return f.b(this, arrobject);
    }

    public String toString() {
        return m.x((Iterable)this, ", ", "[", "]", 0, null, new l(){

            public final CharSequence a(Object object) {
                if (object == this) {
                    return "(this Collection)";
                }
                return String.valueOf((Object)object);
            }
        }, 24, null);
    }

}

