// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.HashMap;
import t5.b;
import E5.l;
import E5.c;
import E5.g;
import E5.j;
import w5.a;
import E5.k;

public class n
{
    public final k a;
    public final k.c b;
    
    public n(final a a) {
        final k.c b = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                d.a(null);
            }
        };
        this.b = b;
        (this.a = new k(a, "flutter/navigation", g.a)).e((k.c)b);
    }
    
    public void a() {
        t5.b.f("NavigationChannel", "Sending message to pop route.");
        this.a.c("popRoute", null);
    }
    
    public void b(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message to push route information '");
        sb.append(str);
        sb.append("'");
        t5.b.f("NavigationChannel", sb.toString());
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("location", str);
        this.a.c("pushRouteInformation", hashMap);
    }
    
    public void c(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message to set initial route to '");
        sb.append(str);
        sb.append("'");
        t5.b.f("NavigationChannel", sb.toString());
        this.a.c("setInitialRoute", str);
    }
}
