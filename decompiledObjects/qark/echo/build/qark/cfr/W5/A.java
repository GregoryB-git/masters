/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Set
 */
package W5;

import W5.x;
import h6.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f;

public final class A
implements Set,
Serializable,
a {
    public static final A o = new A();
    private static final long serialVersionUID = 3406603774387020532L;

    private final Object readResolve() {
        return o;
    }

    public boolean a(Void void_) {
        Intrinsics.checkNotNullParameter((Object)void_, "element");
        return false;
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.checkNotNullParameter((Object)collection, "elements");
        return collection.isEmpty();
    }

    public int d() {
        return 0;
    }

    public boolean equals(Object object) {
        if (object instanceof Set && ((Set)object).isEmpty()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return x.o;
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
        return f.a((Collection)this);
    }

    public Object[] toArray(Object[] arrobject) {
        Intrinsics.checkNotNullParameter(arrobject, "array");
        return f.b((Collection)this, arrobject);
    }

    public String toString() {
        return "[]";
    }
}

