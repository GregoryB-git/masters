// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.RandomAccess;
import java.util.NoSuchElementException;
import java.util.ListIterator;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collection;
import kotlin.jvm.internal.g;
import java.util.List;

public abstract class c extends W5.a implements List, h6.a
{
    public static final a o;
    
    static {
        o = new a(null);
    }
    
    @Override
    public void add(final int n, final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof List && c.o.e(this, (Collection)o));
    }
    
    @Override
    public abstract Object get(final int p0);
    
    @Override
    public int hashCode() {
        return c.o.f(this);
    }
    
    @Override
    public int indexOf(final Object o) {
        final Iterator<Object> iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (Intrinsics.a(iterator.next(), o)) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    @Override
    public Iterator iterator() {
        return new b();
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        final ListIterator<Object> listIterator = this.listIterator(this.size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.a(listIterator.previous(), o)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
    
    @Override
    public ListIterator listIterator() {
        return new c(0);
    }
    
    @Override
    public ListIterator listIterator(final int n) {
        return new c(n);
    }
    
    @Override
    public Object remove(final int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public Object set(final int n, final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public List subList(final int n, final int n2) {
        return new d(this, n, n2);
    }
    
    public static final class a
    {
        public final void a(final int i, final int j) {
            if (i >= 0 && i < j) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("index: ");
            sb.append(i);
            sb.append(", size: ");
            sb.append(j);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        
        public final void b(final int i, final int j) {
            if (i >= 0 && i <= j) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("index: ");
            sb.append(i);
            sb.append(", size: ");
            sb.append(j);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        
        public final void c(final int n, final int n2, final int i) {
            if (n < 0 || n2 > i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("fromIndex: ");
                sb.append(n);
                sb.append(", toIndex: ");
                sb.append(n2);
                sb.append(", size: ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (n <= n2) {
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("fromIndex: ");
            sb2.append(n);
            sb2.append(" > toIndex: ");
            sb2.append(n2);
            throw new IllegalArgumentException(sb2.toString());
        }
        
        public final int d(int n, final int n2) {
            if ((n += n >> 1) - n2 < 0) {
                n = n2;
            }
            int n3 = n;
            if (n - 2147483639 > 0) {
                if (n2 > 2147483639) {
                    return Integer.MAX_VALUE;
                }
                n3 = 2147483639;
            }
            return n3;
        }
        
        public final boolean e(final Collection collection, final Collection collection2) {
            Intrinsics.checkNotNullParameter(collection, "c");
            Intrinsics.checkNotNullParameter(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            final Iterator<Object> iterator = collection2.iterator();
            final Iterator<Object> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                if (!Intrinsics.a(iterator2.next(), iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        public final int f(final Collection collection) {
            Intrinsics.checkNotNullParameter(collection, "c");
            final Iterator<Object> iterator = collection.iterator();
            int n = 1;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                int hashCode;
                if (next != null) {
                    hashCode = next.hashCode();
                }
                else {
                    hashCode = 0;
                }
                n = n * 31 + hashCode;
            }
            return n;
        }
    }
    
    public class b implements Iterator, h6.a
    {
        public int o;
        
        public final int b() {
            return this.o;
        }
        
        public final void d(final int o) {
            this.o = o;
        }
        
        @Override
        public boolean hasNext() {
            return this.o < c.this.size();
        }
        
        @Override
        public Object next() {
            if (this.hasNext()) {
                return c.this.get(this.o++);
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
    
    public class c extends b implements ListIterator, h6.a
    {
        public c(final int n) {
            W5.c.o.b(n, W5.c.this.size());
            ((b)this).d(n);
        }
        
        @Override
        public void add(final Object o) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public boolean hasPrevious() {
            return ((b)this).b() > 0;
        }
        
        @Override
        public int nextIndex() {
            return ((b)this).b();
        }
        
        @Override
        public Object previous() {
            if (this.hasPrevious()) {
                final W5.c q = W5.c.this;
                ((b)this).d(((b)this).b() - 1);
                return q.get(((b)this).b());
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public int previousIndex() {
            return ((b)this).b() - 1;
        }
        
        @Override
        public void set(final Object o) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
    
    public static final class d extends c implements RandomAccess
    {
        public final c p;
        public final int q;
        public int r;
        
        public d(final c p3, final int q, final int n) {
            Intrinsics.checkNotNullParameter(p3, "list");
            this.p = p3;
            this.q = q;
            c.o.c(q, n, p3.size());
            this.r = n - q;
        }
        
        @Override
        public int a() {
            return this.r;
        }
        
        @Override
        public Object get(final int n) {
            c.o.a(n, this.r);
            return this.p.get(this.q + n);
        }
    }
}
