// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import E5.l;
import E5.c;
import E5.q;
import java.util.HashMap;
import t5.b;
import E5.j;
import w5.a;
import E5.k;

public class m
{
    public final k a;
    public b b;
    public final k.c c;
    
    public m(final a a) {
        final k.c c = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                if (m.a(m.this) == null) {
                    return;
                }
                final String a = j.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Received '");
                sb.append(a);
                sb.append("' message.");
                b.f("MouseCursorChannel", sb.toString());
                while (true) {
                    try {
                        if (a.hashCode() != -1307105544) {
                            return;
                        }
                        if (a.equals("activateSystemCursor")) {
                            final String s = ((HashMap)j.b).get("kind");
                            try {
                                m.a(m.this).a(s);
                                d.a(Boolean.TRUE);
                                return;
                            }
                            catch (Exception ex) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Error when setting cursors: ");
                                sb2.append(ex.getMessage());
                                d.b("error", sb2.toString(), null);
                                return;
                            }
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Unhandled error: ");
                            final Exception ex2;
                            sb3.append(ex2.getMessage());
                            d.b("error", sb3.toString(), null);
                        }
                        return;
                    }
                    catch (Exception ex3) {}
                    final Exception ex3;
                    final Exception ex2 = ex3;
                    continue;
                }
            }
        };
        this.c = c;
        (this.a = new k(a, "flutter/mousecursor", q.b)).e((k.c)c);
    }
    
    public static /* synthetic */ b a(final m m) {
        return m.b;
    }
    
    public void b(final b b) {
        this.b = b;
    }
    
    public interface b
    {
        void a(final String p0);
    }
}
