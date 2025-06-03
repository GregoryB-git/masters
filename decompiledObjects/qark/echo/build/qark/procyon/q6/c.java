// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q6;

import p6.W;
import p6.u0;
import java.util.concurrent.CancellationException;
import p6.B0;
import kotlin.jvm.internal.Intrinsics;
import android.os.Looper;
import kotlin.jvm.internal.g;
import android.os.Handler;
import p6.S;

public final class c extends d implements S
{
    private volatile c _immediate;
    public final Handler q;
    public final String r;
    public final boolean s;
    public final c t;
    
    public c(final Handler handler, final String s) {
        this(handler, s, false);
    }
    
    public c(final Handler q, final String r, final boolean s) {
        c immediate = null;
        super((kotlin.jvm.internal.g)null);
        this.q = q;
        this.r = r;
        this.s = s;
        if (s) {
            immediate = this;
        }
        this._immediate = immediate;
        c immediate2;
        if ((immediate2 = this._immediate) == null) {
            immediate2 = new c(q, r, true);
            this._immediate = immediate2;
        }
        this.t = immediate2;
    }
    
    @Override
    public void E(final g g, final Runnable runnable) {
        if (!this.q.post(runnable)) {
            this.J(g, runnable);
        }
    }
    
    @Override
    public boolean F(final g g) {
        return !this.s || !Intrinsics.a(Looper.myLooper(), this.q.getLooper());
    }
    
    public final void J(final g g, final Runnable runnable) {
        final StringBuilder sb = new StringBuilder();
        sb.append("The task was rejected, the handler underlying the dispatcher '");
        sb.append(this);
        sb.append("' was closed");
        u0.c(g, new CancellationException(sb.toString()));
        W.b().E(g, runnable);
    }
    
    public c K() {
        return this.t;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof c && ((c)o).q == this.q;
    }
    
    @Override
    public int hashCode() {
        return System.identityHashCode(this.q);
    }
    
    @Override
    public String toString() {
        String s;
        if ((s = this.I()) == null) {
            String str;
            if ((str = this.r) == null) {
                str = this.q.toString();
            }
            s = str;
            if (this.s) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".immediate");
                s = sb.toString();
            }
        }
        return s;
    }
}
