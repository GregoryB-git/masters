// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import java.io.OutputStream;
import java.util.Map;
import java.io.FilterOutputStream;

public final class T extends FilterOutputStream implements U
{
    public final J o;
    public final Map p;
    public final long q;
    public final long r;
    public long s;
    public long t;
    public V u;
    
    public T(final OutputStream out, final J o, final Map p4, final long q) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(o, "requests");
        Intrinsics.checkNotNullParameter(p4, "progressMap");
        super(out);
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = B.A();
    }
    
    private final void b(long s) {
        final V u = this.u;
        if (u != null) {
            u.a(s);
        }
        s += this.s;
        this.s = s;
        if (s >= this.t + this.r || s >= this.q) {
            this.c();
        }
    }
    
    @Override
    public void a(final F f) {
        V u;
        if (f != null) {
            u = this.p.get(f);
        }
        else {
            u = null;
        }
        this.u = u;
    }
    
    public final void c() {
        if (this.s > this.t) {
            for (J.a a : this.o.T()) {}
            this.t = this.s;
        }
    }
    
    @Override
    public void close() {
        super.close();
        final Iterator<V> iterator = this.p.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().c();
        }
        this.c();
    }
    
    @Override
    public void write(final int n) {
        super.out.write(n);
        this.b(1L);
    }
    
    @Override
    public void write(final byte[] b) {
        Intrinsics.checkNotNullParameter(b, "buffer");
        super.out.write(b);
        this.b(b.length);
    }
    
    @Override
    public void write(final byte[] b, final int off, final int len) {
        Intrinsics.checkNotNullParameter(b, "buffer");
        super.out.write(b, off, len);
        this.b(len);
    }
}
