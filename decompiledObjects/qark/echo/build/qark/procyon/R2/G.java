// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.Iterator;

public final class G implements Iterator
{
    public Iterator o;
    public final /* synthetic */ D p;
    
    public G(final D p) {
        this.p = p;
        this.o = ((BaseBundle)D.d(p)).keySet().iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.o.hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
