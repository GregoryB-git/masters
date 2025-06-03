// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.HashMap;
import E5.l;
import E5.c;
import E5.q;
import E5.j;
import w5.a;
import java.util.Map;
import E5.k;

public class g
{
    public final k a;
    public Map b;
    public final k.c c;
    
    public g(final a a) {
        final k.c c = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                g.a(g.this);
            }
        };
        this.c = c;
        (this.a = new k(a, "flutter/deferredcomponent", q.b)).e((k.c)c);
        t5.a.e().a();
        this.b = new HashMap();
    }
    
    public static /* synthetic */ x5.a a(final g g) {
        g.getClass();
        return null;
    }
}
