// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

public final class o
{
    public static o b;
    public static final p c;
    public p a;
    
    static {
        c = new p(0, false, false, 0, 0);
    }
    
    public static o b() {
        // monitorenter(o.class)
        while (true) {
            try {
                if (o.b == null) {
                    o.b = new o();
                }
                // monitorexit(o.class)
                return o.b;
                // monitorexit(o.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public p a() {
        return this.a;
    }
    
    public final void c(final p a) {
        // monitorenter(this)
        Label_0020: {
            if (a == null) {
                Label_0061: {
                    try {
                        this.a = o.c;
                        // monitorexit(this)
                        return;
                    }
                    finally {
                        break Label_0061;
                    }
                    break Label_0020;
                }
            }
            // monitorexit(this)
        }
        final p a2 = this.a;
        if (a2 != null && a2.i() >= a.i()) {
            // monitorexit(this)
            return;
        }
        this.a = a;
    }
    // monitorexit(this)
}
