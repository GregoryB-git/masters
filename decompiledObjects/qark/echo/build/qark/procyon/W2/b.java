// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.util.NoSuchElementException;
import java.util.Iterator;

public abstract class b implements Iterator
{
    public b o;
    public Object p;
    
    public b() {
        this.o = b.p;
    }
    
    public abstract Object b();
    
    public final Object d() {
        this.o = b.q;
        return null;
    }
    
    public final boolean e() {
        this.o = b.r;
        this.p = this.b();
        if (this.o != b.q) {
            this.o = b.o;
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean hasNext() {
        m.o(this.o != b.r);
        final int n = b$a.a[this.o.ordinal()];
        return n != 1 && (n == 2 || this.e());
    }
    
    @Override
    public final Object next() {
        if (this.hasNext()) {
            this.o = b.p;
            final Object a = j.a(this.p);
            this.p = null;
            return a;
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
    
    public enum b
    {
        o("READY", 0), 
        p("NOT_READY", 1), 
        q("DONE", 2), 
        r("FAILED", 3);
        
        static {
            s = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.o, b.p, b.q, b.r };
        }
    }
}
