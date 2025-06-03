// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.io.OutputStream;
import java.util.List;

public abstract class a implements O
{
    protected int memoizedHashCode;
    
    public a() {
        this.memoizedHashCode = 0;
    }
    
    public static void e(final Iterable iterable, final List list) {
        a.j(iterable, list);
    }
    
    public abstract int i();
    
    public int j(final e0 e0) {
        int n;
        if ((n = this.i()) == -1) {
            n = e0.e(this);
            this.l(n);
        }
        return n;
    }
    
    public k0 k() {
        return new k0(this);
    }
    
    public abstract void l(final int p0);
    
    public void m(final OutputStream outputStream) {
        final j z = j.Z(outputStream, j.C(this.a()));
        this.g(z);
        z.W();
    }
    
    public abstract static class a implements O.a
    {
        public static void j(final Iterable iterable, final List list) {
            y.a(iterable);
            if (iterable instanceof D) {
                final List o = ((D)iterable).o();
                final D d = (D)list;
                final int size = list.size();
                for (final g next : o) {
                    if (next == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Element at index ");
                        sb.append(d.size() - size);
                        sb.append(" is null.");
                        final String string = sb.toString();
                        for (int i = d.size() - 1; i >= size; --i) {
                            d.remove(i);
                        }
                        throw new NullPointerException(string);
                    }
                    if (next instanceof g) {
                        d.H(next);
                    }
                    else {
                        d.add((String)next);
                    }
                }
            }
            else {
                if (iterable instanceof Y) {
                    list.addAll((Collection<?>)iterable);
                    return;
                }
                l(iterable, list);
            }
        }
        
        public static void l(final Iterable iterable, final List list) {
            if (list instanceof ArrayList && iterable instanceof Collection) {
                ((ArrayList<Object>)list).ensureCapacity(list.size() + ((Collection<Object>)iterable).size());
            }
            final int size = list.size();
            for (final Object next : iterable) {
                if (next == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Element at index ");
                    sb.append(list.size() - size);
                    sb.append(" is null.");
                    final String string = sb.toString();
                    for (int i = list.size() - 1; i >= size; --i) {
                        list.remove(i);
                    }
                    throw new NullPointerException(string);
                }
                list.add(next);
            }
        }
        
        public static k0 p(final O o) {
            return new k0(o);
        }
        
        public abstract a n(final androidx.datastore.preferences.protobuf.a p0);
        
        public a o(final O o) {
            if (this.b().getClass().isInstance(o)) {
                return this.n((androidx.datastore.preferences.protobuf.a)o);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }
}
