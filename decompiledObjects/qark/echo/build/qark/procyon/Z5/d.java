// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z5;

import X5.e;
import org.jetbrains.annotations.NotNull;
import kotlin.jvm.internal.Intrinsics;
import X5.g;

public abstract class d extends a
{
    private final g _context;
    private transient X5.d intercepted;
    
    public d(final X5.d d) {
        g context;
        if (d != null) {
            context = d.getContext();
        }
        else {
            context = null;
        }
        this(d, context);
    }
    
    public d(final X5.d d, final g context) {
        super(d);
        this._context = context;
    }
    
    @NotNull
    @Override
    public g getContext() {
        final g context = this._context;
        Intrinsics.b(context);
        return context;
    }
    
    @NotNull
    public final X5.d intercepted() {
        X5.d intercepted;
        if ((intercepted = this.intercepted) == null) {
            final X5.e e = (X5.e)this.getContext().b((g.c)X5.e.c);
            if (e == null || (intercepted = e.i(this)) == null) {
                intercepted = this;
            }
            this.intercepted = intercepted;
        }
        return intercepted;
    }
    
    @Override
    public void releaseIntercepted() {
        final X5.d intercepted = this.intercepted;
        if (intercepted != null && intercepted != this) {
            final g.b b = this.getContext().b((g.c)X5.e.c);
            Intrinsics.b(b);
            ((X5.e)b).C(intercepted);
        }
        this.intercepted = c.o;
    }
}
