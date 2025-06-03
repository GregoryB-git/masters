// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import g0.E;
import android.util.SparseArray;

public final class v
{
    public final SparseArray a;
    
    public v() {
        this.a = new SparseArray();
    }
    
    public E a(final int n) {
        E e;
        if ((e = (E)this.a.get(n)) == null) {
            e = new E(9223372036854775806L);
            this.a.put(n, (Object)e);
        }
        return e;
    }
    
    public void b() {
        this.a.clear();
    }
}
