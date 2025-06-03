// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import Q3.h;
import java.util.HashMap;
import java.util.Map;

public class q
{
    public static final q b;
    public final Map a;
    
    static {
        b = new q();
    }
    
    public q() {
        this.a = new HashMap();
    }
    
    public static m b(final f f, final p p3, final h h) {
        return q.b.a(f, p3, h);
    }
    
    public static void c(final m m) {
        m.i0(new Runnable() {
            @Override
            public void run() {
                m.P();
            }
        });
    }
    
    public static void d(final m m) {
        m.i0(new Runnable() {
            @Override
            public void run() {
                m.f0();
            }
        });
    }
    
    public final m a(final f f, final p p3, final h h) {
        f.k();
        final StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(p3.a);
        sb.append("/");
        sb.append(p3.c);
        final String string = sb.toString();
        final Map a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                if (!this.a.containsKey(f)) {
                    this.a.put(f, new HashMap());
                }
                final Map<String, m> map = this.a.get(f);
                if (!map.containsKey(string)) {
                    final m m = new m(p3, f, h);
                    map.put(string, m);
                    // monitorexit(a)
                    return m;
                }
                throw new IllegalStateException("createLocalRepo() called for existing repo.");
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
