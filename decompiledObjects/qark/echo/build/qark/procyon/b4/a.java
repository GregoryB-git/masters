// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b4;

import d4.b;
import Y3.m;
import a4.e;
import a4.c;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class a
{
    public final Map a;
    
    public a() {
        this.a = new HashMap();
    }
    
    public List a() {
        return new ArrayList(this.a.values());
    }
    
    public void b(final c obj) {
        final e.a j = obj.j();
        b b = obj.i();
        final e.a p = e.a.p;
        m.g(j == p || j == e.a.r || j == e.a.o, "Only child changes supported for tracking");
        m.f(true ^ obj.i().s());
        c b2;
        Map<b, c> map;
        if (this.a.containsKey(b)) {
            final c obj2 = this.a.get(b);
            final e.a i = obj2.j();
            if (j == p && i == e.a.o) {
                this.a.put(obj.i(), c.d(b, obj.k(), obj2.k()));
                return;
            }
            final e.a o = e.a.o;
            if (j == o && i == p) {
                this.a.remove(b);
                return;
            }
            if (j == o && i == e.a.r) {
                this.a.put(b, c.g(b, obj2.l()));
                return;
            }
            final e.a r = e.a.r;
            if (j == r && i == p) {
                final Map a = this.a;
                b2 = c.b(b, obj.k());
                map = (Map<b, c>)a;
            }
            else {
                if (j != r || i != r) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Illegal combination of changes: ");
                    sb.append(obj);
                    sb.append(" occurred after ");
                    sb.append(obj2);
                    throw new IllegalStateException(sb.toString());
                }
                final Map a2 = this.a;
                final c d = c.d(b, obj.k(), obj2.l());
                map = (Map<b, c>)a2;
                b2 = d;
            }
        }
        else {
            final Map a3 = this.a;
            b = obj.i();
            b2 = obj;
            map = (Map<b, c>)a3;
        }
        map.put(b, b2);
    }
}
