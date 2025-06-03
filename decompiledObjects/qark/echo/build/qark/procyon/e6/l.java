// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import java.util.NoSuchElementException;
import h6.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.io.BufferedReader;
import n6.b;

public final class l implements b
{
    public final BufferedReader a;
    
    public l(final BufferedReader a) {
        Intrinsics.checkNotNullParameter(a, "reader");
        this.a = a;
    }
    
    public static final /* synthetic */ BufferedReader a(final l l) {
        return l.a;
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {
            public String o;
            public boolean p;
            public final /* synthetic */ l q;
            
            public String b() {
                if (this.hasNext()) {
                    final String o = this.o;
                    this.o = null;
                    Intrinsics.b(o);
                    return o;
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                if (this.o == null && !this.p && (this.o = l.a(this.q).readLine()) == null) {
                    this.p = true;
                }
                return this.o != null;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
