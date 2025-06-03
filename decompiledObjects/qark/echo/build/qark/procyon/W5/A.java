// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import kotlin.jvm.internal.f;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import h6.a;
import java.io.Serializable;
import java.util.Set;

public final class A implements Set, Serializable, a
{
    public static final A o;
    private static final long serialVersionUID = 3406603774387020532L;
    
    static {
        o = new A();
    }
    
    private final Object readResolve() {
        return A.o;
    }
    
    public boolean a(final Void void1) {
        Intrinsics.checkNotNullParameter(void1, "element");
        return false;
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
    
    public int d() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Set && ((Set)o).isEmpty();
    }
    
    @Override
    public int hashCode() {
        return 0;
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
        return this.d();
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
