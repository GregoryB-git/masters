/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package W5;

import W5.x;
import h6.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f;

public final class y
implements List,
Serializable,
RandomAccess,
a {
    public static final y o = new y();
    private static final long serialVersionUID = -7390468764508069838L;

    private final Object readResolve() {
        return o;
    }

    public boolean a(Void void_) {
        Intrinsics.checkNotNullParameter((Object)void_, "element");
        return false;
    }

    public boolean addAll(int n8, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public Void d(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty list doesn't contain element at index ");
        stringBuilder.append(n8);
        stringBuilder.append('.');
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public boolean equals(Object object) {
        if (object instanceof List && ((List)object).isEmpty()) {
            return true;
        }
        return false;
    }

    public int f() {
        return 0;
    }

    public int g(Void void_) {
        Intrinsics.checkNotNullParameter((Object)void_, "element");
        return -1;
    }

    public int hashCode() {
        return 1;
    }

    public int i(Void void_) {
        Intrinsics.checkNotNullParameter((Object)void_, "element");
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return x.o;
    }

    public ListIterator listIterator() {
        return x.o;
    }

    public ListIterator listIterator(int n8) {
        if (n8 == 0) {
            return x.o;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index: ");
        stringBuilder.append(n8);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
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

    public List subList(int n8, int n9) {
        if (n8 == 0 && n9 == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fromIndex: ");
        stringBuilder.append(n8);
        stringBuilder.append(", toIndex: ");
        stringBuilder.append(n9);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
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

