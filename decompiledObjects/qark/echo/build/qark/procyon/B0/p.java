// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import java.util.Map;
import java.io.Closeable;
import g0.M;
import java.io.InputStream;
import g0.a;
import i0.i;
import x0.r;
import android.net.Uri;
import i0.g;
import i0.x;
import i0.k;

public final class p implements e
{
    public final long a;
    public final k b;
    public final int c;
    public final x d;
    public final a e;
    public volatile Object f;
    
    public p(final i0.g g, final Uri uri, final int n, final a a) {
        this(g, new k.b().i(uri).b(1).a(), n, a);
    }
    
    public p(final i0.g g, final k b, final int c, final a e) {
        this.d = new x(g);
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = r.a();
    }
    
    public long a() {
        return this.d.q();
    }
    
    @Override
    public final void b() {
        this.d.t();
        final i i = new i(this.d, this.b);
        try {
            i.b();
            this.f = this.e.a((Uri)g0.a.e(this.d.k()), i);
        }
        finally {
            M.m(i);
        }
    }
    
    @Override
    public final void c() {
    }
    
    public Map d() {
        return this.d.s();
    }
    
    public final Object e() {
        return this.f;
    }
    
    public Uri f() {
        return this.d.r();
    }
    
    public interface a
    {
        Object a(final Uri p0, final InputStream p1);
    }
}
