// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import kotlin.jvm.internal.f;
import kotlin.jvm.internal.b;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import h6.a;
import java.util.Collection;

public final class e implements Collection, a
{
    public final Object[] o;
    public final boolean p;
    
    public e(final Object[] o, final boolean p2) {
        Intrinsics.checkNotNullParameter(o, "values");
        this.o = o;
        this.p = p2;
    }
    
    public int a() {
        return this.o.length;
    }
    
    @Override
    public boolean add(final Object o) {
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
    public boolean contains(final Object o) {
        return g.h(this.o, o);
    }
    
    @Override
    public boolean containsAll(final Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        final Collection<Object> collection2 = (Collection<Object>)collection;
        final boolean empty = collection2.isEmpty();
        final boolean b = true;
        if (empty) {
            return true;
        }
        final Iterator<Object> iterator = collection2.iterator();
        do {
            final boolean b2 = b;
            if (iterator.hasNext()) {
                continue;
            }
            return b2;
        } while (this.contains(iterator.next()));
        return false;
    }
    
    @Override
    public boolean isEmpty() {
        return this.o.length == 0;
    }
    
    @Override
    public Iterator iterator() {
        return b.a(this.o);
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
        return this.a();
    }
    
    @Override
    public final Object[] toArray() {
        return n.a(this.o, this.p);
    }
    
    @Override
    public Object[] toArray(final Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return f.b(this, array);
    }
}
