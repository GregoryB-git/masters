// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.Map;
import E5.l;
import E5.c;
import E5.q;
import java.util.ArrayList;
import E5.j;
import w5.a;
import android.content.pm.PackageManager;
import E5.k;

public class r
{
    public final k a;
    public final PackageManager b;
    public b c;
    public final k.c d;
    
    public r(final a a, final PackageManager b) {
        final k.c d = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                if (r.a(r.this) == null) {
                    return;
                }
                final String a = j.a;
                final Object b = j.b;
                a.hashCode();
                if (!a.equals("ProcessText.processTextAction")) {
                    if (!a.equals("ProcessText.queryTextActions")) {
                        d.c();
                        return;
                    }
                    try {
                        d.a(r.a(r.this).b());
                        return;
                    }
                    catch (IllegalStateException ex) {
                        d.b("error", ex.getMessage(), null);
                        return;
                    }
                }
                final ArrayList<String> list = (ArrayList<String>)b;
                r.a(r.this).c(list.get(0), list.get(1), (boolean)list.get(2), d);
            }
        };
        this.d = d;
        this.b = b;
        (this.a = new k(a, "flutter/processtext", q.b)).e((k.c)d);
    }
    
    public static /* synthetic */ b a(final r r) {
        return r.c;
    }
    
    public void b(final b c) {
        this.c = c;
    }
    
    public interface b
    {
        Map b();
        
        void c(final String p0, final String p1, final boolean p2, final k.d p3);
    }
}
