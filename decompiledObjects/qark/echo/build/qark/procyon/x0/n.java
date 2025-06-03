// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import java.util.HashMap;
import java.util.Map;
import c1.h;
import i0.l;
import android.content.Context;
import c1.t;
import i0.g;

public final class n implements x.a
{
    public final a a;
    public g.a b;
    public t.a c;
    public long d;
    public long e;
    public long f;
    public float g;
    public float h;
    public boolean i;
    
    public n(final Context context, final F0.x x) {
        this(new l.a(context), x);
    }
    
    public n(final g.a b, final F0.x x) {
        this.b = b;
        final h c = new h();
        this.c = c;
        (this.a = new a(x, c)).a(b);
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }
    
    public static final class a
    {
        public final F0.x a;
        public final Map b;
        public final Map c;
        public g.a d;
        public boolean e;
        public t.a f;
        
        public a(final F0.x a, final t.a f) {
            this.a = a;
            this.f = f;
            this.b = new HashMap();
            this.c = new HashMap();
            this.e = true;
        }
        
        public void a(final g.a d) {
            if (d != this.d) {
                this.d = d;
                this.b.clear();
                this.c.clear();
            }
        }
    }
}
