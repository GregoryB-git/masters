// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L4;

import c2.c;
import c2.e;
import N4.i;
import c2.g;
import c2.f;
import F4.a;

public final class b
{
    public static final a d;
    public final String a;
    public final r4.b b;
    public f c;
    
    static {
        d = a.e();
    }
    
    public b(final r4.b b, final String a) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        if (this.c == null) {
            final g g = (g)this.b.get();
            if (g != null) {
                this.c = g.a(this.a, i.class, c2.b.b("proto"), new L4.a());
            }
            else {
                L4.b.d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.c != null;
    }
    
    public void b(final i i) {
        if (!this.a()) {
            L4.b.d.j("Unable to dispatch event because Flg Transport is not available");
            return;
        }
        this.c.b(c2.c.d(i));
    }
}
