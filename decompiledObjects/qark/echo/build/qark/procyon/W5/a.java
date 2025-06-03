// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import g6.l;
import kotlin.jvm.internal.f;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collection;

public abstract class a implements Collection, h6.a
{
    public abstract int a();
    
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
        final boolean empty = this.isEmpty();
        final boolean b = false;
        if (empty) {
            return false;
        }
        final Iterator<Object> iterator = this.iterator();
        do {
            final boolean b2 = b;
            if (iterator.hasNext()) {
                continue;
            }
            return b2;
        } while (!Intrinsics.a(iterator.next(), o));
        return true;
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
        return this.size() == 0;
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
        return m.x(this, ", ", "[", "]", 0, null, new l() {
            public final /* synthetic */ a o;
            
            public final CharSequence a(final Object obj) {
                if (obj == this.o) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            }
        }, 24, null);
    }
}
