// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import E5.l;
import E5.q;
import java.util.HashMap;
import java.util.Map;
import E5.c;
import E5.k;

public class j
{
    public final k a;
    public b b;
    public final k.c c;
    
    public j(final c c) {
        final k.c c2 = new k.c() {
            public Map a = new HashMap();
            
            @Override
            public void onMethodCall(final E5.j j, final d d) {
                if (j.a(j.this) != null) {
                    final String a = j.a;
                    a.hashCode();
                    if (!a.equals("getKeyboardState")) {
                        d.c();
                        return;
                    }
                    try {
                        this.a = j.a(j.this).a();
                    }
                    catch (IllegalStateException ex) {
                        d.b("error", ex.getMessage(), null);
                    }
                }
                d.a(this.a);
            }
        };
        this.c = c2;
        (this.a = new k(c, "flutter/keyboard", q.b)).e((k.c)c2);
    }
    
    public static /* synthetic */ b a(final j j) {
        return j.b;
    }
    
    public void b(final b b) {
        this.b = b;
    }
    
    public interface b
    {
        Map a();
    }
}
