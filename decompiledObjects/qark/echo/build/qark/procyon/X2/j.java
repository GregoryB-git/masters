// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import W2.n;
import java.util.AbstractCollection;
import W2.m;
import java.util.Iterator;
import java.util.Collection;

public abstract class j
{
    public static boolean a(final Collection collection, final Collection collection2) {
        final Iterator<Object> iterator = collection2.iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public static StringBuilder b(final int n) {
        i.b(n, "size");
        return new StringBuilder((int)Math.min(n * 8L, 1073741824L));
    }
    
    public static boolean c(final Collection collection, final Object o) {
        m.j(collection);
        try {
            return collection.contains(o);
        }
        catch (ClassCastException | NullPointerException ex) {
            return false;
        }
    }
    
    public abstract static class a extends AbstractCollection
    {
        public final Collection o;
        public final n p;
        
        public a(final Collection o, final n p2) {
            this.o = o;
            this.p = p2;
        }
        
        @Override
        public boolean add(final Object o) {
            m.d(this.p.apply(o));
            return this.o.add(o);
        }
        
        @Override
        public boolean addAll(final Collection collection) {
            final Iterator<Object> iterator = collection.iterator();
            while (iterator.hasNext()) {
                m.d(this.p.apply(iterator.next()));
            }
            return this.o.addAll(collection);
        }
        
        @Override
        public void clear() {
            B.h(this.o, this.p);
        }
        
        @Override
        public boolean contains(final Object o) {
            return j.c(this.o, o) && this.p.apply(o);
        }
        
        @Override
        public boolean containsAll(final Collection collection) {
            return j.a(this, collection);
        }
        
        @Override
        public boolean isEmpty() {
            return B.a(this.o, this.p) ^ true;
        }
        
        @Override
        public Iterator iterator() {
            return C.i(this.o.iterator(), this.p);
        }
        
        @Override
        public boolean remove(final Object o) {
            return this.contains(o) && this.o.remove(o);
        }
        
        @Override
        public boolean removeAll(final Collection collection) {
            final Iterator iterator = this.o.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                if (this.p.apply(next) && collection.contains(next)) {
                    iterator.remove();
                    b = true;
                }
            }
            return b;
        }
        
        @Override
        public boolean retainAll(final Collection collection) {
            final Iterator iterator = this.o.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                if (this.p.apply(next) && !collection.contains(next)) {
                    iterator.remove();
                    b = true;
                }
            }
            return b;
        }
        
        @Override
        public int size() {
            final Iterator<Object> iterator = this.o.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                if (this.p.apply(iterator.next())) {
                    ++n;
                }
            }
            return n;
        }
        
        @Override
        public Object[] toArray() {
            return E.i(this.iterator()).toArray();
        }
        
        @Override
        public Object[] toArray(final Object[] a) {
            return E.i(this.iterator()).toArray(a);
        }
    }
}
