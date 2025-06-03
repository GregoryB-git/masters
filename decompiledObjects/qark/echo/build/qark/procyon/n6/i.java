// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n6;

import h6.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import g6.l;

public final class i implements b
{
    public final b a;
    public final l b;
    
    public i(final b a, final l b) {
        Intrinsics.checkNotNullParameter(a, "sequence");
        Intrinsics.checkNotNullParameter(b, "transformer");
        this.a = a;
        this.b = b;
    }
    
    public static final /* synthetic */ b a(final i i) {
        return i.a;
    }
    
    public static final /* synthetic */ l b(final i i) {
        return i.b;
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {
            public final Iterator o = i.a(i.this).iterator();
            public final /* synthetic */ i p;
            
            @Override
            public boolean hasNext() {
                return this.o.hasNext();
            }
            
            @Override
            public Object next() {
                return i.b(this.p).invoke(this.o.next());
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
