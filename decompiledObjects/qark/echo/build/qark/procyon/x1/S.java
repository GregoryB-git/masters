// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import kotlin.jvm.internal.Intrinsics;
import java.util.HashMap;
import java.util.Map;
import android.os.Handler;
import java.io.OutputStream;

public final class S extends OutputStream implements U
{
    public final Handler o;
    public final Map p;
    public F q;
    public V r;
    public int s;
    
    public S(final Handler o) {
        this.o = o;
        this.p = new HashMap();
    }
    
    @Override
    public void a(final F q) {
        this.q = q;
        V r;
        if (q != null) {
            r = this.p.get(q);
        }
        else {
            r = null;
        }
        this.r = r;
    }
    
    public final void b(final long n) {
        final F q = this.q;
        if (q == null) {
            return;
        }
        if (this.r == null) {
            final V r = new V(this.o, q);
            this.r = r;
            this.p.put(q, r);
        }
        final V r2 = this.r;
        if (r2 != null) {
            r2.b(n);
        }
        this.s += (int)n;
    }
    
    public final int c() {
        return this.s;
    }
    
    public final Map e() {
        return this.p;
    }
    
    @Override
    public void write(final int n) {
        this.b(1L);
    }
    
    @Override
    public void write(final byte[] array) {
        Intrinsics.checkNotNullParameter(array, "buffer");
        this.b(array.length);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        Intrinsics.checkNotNullParameter(array, "buffer");
        this.b(n2);
    }
}
