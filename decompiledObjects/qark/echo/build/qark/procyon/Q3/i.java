// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import V3.p;
import R3.d;
import R3.g;
import java.util.HashMap;
import r4.a;
import V3.A;
import s3.e;
import java.util.Map;

public class i
{
    public final Map a;
    public final e b;
    public final A c;
    public final A d;
    
    public i(final e b, final a a, final a a2) {
        this.a = new HashMap();
        this.b = b;
        this.c = new g(a);
        this.d = new d(a2);
    }
    
    public h a(final p p) {
        // monitorenter(this)
        while (true) {
            try {
                h h;
                if ((h = this.a.get(p)) == null) {
                    final V3.g g = new V3.g();
                    if (!this.b.y()) {
                        g.O(this.b.q());
                    }
                    g.K(this.b);
                    g.J(this.c);
                    g.I(this.d);
                    h = new h(this.b, p, g);
                    this.a.put(p, h);
                }
                // monitorexit(this)
                return h;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
