// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D6;

public abstract class e
{
    public static d a;
    public static long b;
    
    public static void a(final d a) {
        // monitorenter(e.class)
        while (true) {
            Label_0083: {
                if (a.f != null || a.g != null) {
                    break Label_0083;
                }
                if (a.d) {
                    return;
                }
                try {
                    final long b = e.b;
                    if (b + 8192L > 65536L) {
                        // monitorexit(e.class)
                        return;
                    }
                    e.b = b + 8192L;
                    a.f = e.a;
                    a.c = 0;
                    a.b = 0;
                    e.a = a;
                    // monitorexit(e.class)
                    return;
                    throw new IllegalArgumentException();
                }
                // monitorexit(e.class)
                finally {}
            }
            continue;
        }
    }
    
    public static d b() {
        // monitorenter(e.class)
        while (true) {
            try {
                final d a = e.a;
                if (a != null) {
                    e.a = a.f;
                    a.f = null;
                    e.b -= 8192L;
                    // monitorexit(e.class)
                    return a;
                }
                // monitorexit(e.class)
                return new d();
                // monitorexit(e.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
