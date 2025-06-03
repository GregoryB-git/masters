// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D0;

import android.view.Surface;
import t0.p;
import t0.o;

public class j extends o
{
    public final int r;
    public final boolean s;
    
    public j(final Throwable t, final p p3, final Surface surface) {
        super(t, p3);
        this.r = System.identityHashCode(surface);
        this.s = (surface == null || surface.isValid());
    }
}
