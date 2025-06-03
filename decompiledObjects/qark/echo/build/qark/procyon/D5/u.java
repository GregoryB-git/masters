// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import E5.l;
import E5.c;
import E5.q;
import java.util.ArrayList;
import t5.b;
import E5.j;
import w5.a;
import E5.k;

public class u
{
    public final k a;
    public b b;
    public final k.c c;
    
    public u(final a a) {
        final k.c c = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                if (u.a(u.this) == null) {
                    b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                    return;
                }
                final String a = j.a;
                final Object b = j.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("Received '");
                sb.append(a);
                sb.append("' message.");
                t5.b.f("SpellCheckChannel", sb.toString());
                a.hashCode();
                if (!a.equals("SpellCheck.initiateSpellCheck")) {
                    d.c();
                    return;
                }
                try {
                    final ArrayList<String> list = (ArrayList<String>)b;
                    u.a(u.this).a(list.get(0), list.get(1), d);
                }
                catch (IllegalStateException ex) {
                    d.b("error", ex.getMessage(), null);
                }
            }
        };
        this.c = c;
        (this.a = new k(a, "flutter/spellcheck", q.b)).e((k.c)c);
    }
    
    public static /* synthetic */ b a(final u u) {
        return u.b;
    }
    
    public void b(final b b) {
        this.b = b;
    }
    
    public interface b
    {
        void a(final String p0, final String p1, final k.d p2);
    }
}
