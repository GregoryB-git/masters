// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y0;

import android.net.Uri;
import java.util.Map;
import x0.r;
import g0.a;
import i0.g;
import i0.x;
import d0.q;
import i0.k;
import B0.n;

public abstract class e implements n.e
{
    public final long a;
    public final k b;
    public final int c;
    public final q d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    public final x i;
    
    public e(final i0.g g, final k k, final int c, final q d, final int e, final Object f, final long g2, final long h) {
        this.i = new x(g);
        this.b = (k)g0.a.e(k);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g2;
        this.h = h;
        this.a = r.a();
    }
    
    public final long a() {
        return this.i.q();
    }
    
    public final long d() {
        return this.h - this.g;
    }
    
    public final Map e() {
        return this.i.s();
    }
    
    public final Uri f() {
        return this.i.r();
    }
}
