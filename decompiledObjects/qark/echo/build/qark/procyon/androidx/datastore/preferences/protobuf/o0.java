// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.AbstractList;

public class o0 extends AbstractList implements D, RandomAccess
{
    public final D o;
    
    public o0(final D o) {
        this.o = o;
    }
    
    public static /* synthetic */ D a(final o0 o0) {
        return o0.o;
    }
    
    @Override
    public void H(final g g) {
        throw new UnsupportedOperationException();
    }
    
    public String d(final int n) {
        return this.o.get(n);
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {
            public Iterator o = o0.a(o0.this).iterator();
            
            public String b() {
                return this.o.next();
            }
            
            @Override
            public boolean hasNext() {
                return this.o.hasNext();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    @Override
    public ListIterator listIterator(final int n) {
        return new ListIterator() {
            public ListIterator o = o0.a(o0.this).listIterator(p2);
            
            public void b(final String s) {
                throw new UnsupportedOperationException();
            }
            
            public String d() {
                return this.o.next();
            }
            
            public String e() {
                return this.o.previous();
            }
            
            public void f(final String s) {
                throw new UnsupportedOperationException();
            }
            
            @Override
            public boolean hasNext() {
                return this.o.hasNext();
            }
            
            @Override
            public boolean hasPrevious() {
                return this.o.hasPrevious();
            }
            
            @Override
            public int nextIndex() {
                return this.o.nextIndex();
            }
            
            @Override
            public int previousIndex() {
                return this.o.previousIndex();
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
    @Override
    public D m() {
        return this;
    }
    
    @Override
    public Object n(final int n) {
        return this.o.n(n);
    }
    
    @Override
    public List o() {
        return this.o.o();
    }
    
    @Override
    public int size() {
        return this.o.size();
    }
}
