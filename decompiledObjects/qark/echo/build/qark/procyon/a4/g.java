// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import V3.f;
import c4.c;
import V3.j;

public class g
{
    public final j a;
    public final c b;
    
    public g(final f f) {
        this.a = f.o();
        this.b = f.q("EventRaiser");
    }
    
    public static /* synthetic */ c a(final g g) {
        return g.b;
    }
    
    public void b(final List c) {
        if (this.b.f()) {
            final c b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Raising ");
            sb.append(c.size());
            sb.append(" event(s)");
            b.b(sb.toString(), new Object[0]);
        }
        this.a.b(new Runnable() {
            public final /* synthetic */ ArrayList o = new ArrayList(c);
            
            @Override
            public void run() {
                for (final e e : this.o) {
                    if (g.a(g.this).f()) {
                        final c a = g.a(g.this);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Raising ");
                        sb.append(e.toString());
                        a.b(sb.toString(), new Object[0]);
                    }
                    e.a();
                }
            }
        });
    }
}
