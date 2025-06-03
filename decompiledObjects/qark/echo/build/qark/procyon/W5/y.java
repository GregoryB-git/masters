// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import kotlin.jvm.internal.f;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import h6.a;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.List;

public final class y implements List, Serializable, RandomAccess, a
{
    public static final y o;
    private static final long serialVersionUID = -7390468764508069838L;
    
    static {
        o = new y();
    }
    
    private final Object readResolve() {
        return y.o;
    }
    
    public boolean a(final Void void1) {
        Intrinsics.checkNotNullParameter(void1, "element");
        return false;
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof Void && this.a((Void)o);
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return collection.isEmpty();
    }
    
    public Void d(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof List && ((List)o).isEmpty();
    }
    
    public int f() {
        return 0;
    }
    
    public int g(final Void void1) {
        Intrinsics.checkNotNullParameter(void1, "element");
        return -1;
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
    
    public int i(final Void void1) {
        Intrinsics.checkNotNullParameter(void1, "element");
        return -1;
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (!(o instanceof Void)) {
            return -1;
        }
        return this.g((Void)o);
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public Iterator iterator() {
        return x.o;
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (!(o instanceof Void)) {
            return -1;
        }
        return this.i((Void)o);
    }
    
    @Override
    public ListIterator listIterator() {
        return x.o;
    }
    
    @Override
    public ListIterator listIterator(final int i) {
        if (i == 0) {
            return x.o;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.f();
    }
    
    @Override
    public List subList(final int i, final int j) {
        if (i == 0 && j == 0) {
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public Object[] toArray() {
        return f.a(this);
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return f.b(this, array);
    }
    
    @Override
    public String toString() {
        return "[]";
    }
}
