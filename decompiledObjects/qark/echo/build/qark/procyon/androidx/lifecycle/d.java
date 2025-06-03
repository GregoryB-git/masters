// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class d
{
    public AtomicReference a;
    
    public d() {
        this.a = new AtomicReference();
    }
    
    public abstract void a(final g p0);
    
    public abstract c b();
    
    public abstract void c(final g p0);
    
    public enum b
    {
        ON_ANY("ON_ANY", 6), 
        ON_CREATE("ON_CREATE", 0), 
        ON_DESTROY("ON_DESTROY", 5), 
        ON_PAUSE("ON_PAUSE", 3), 
        ON_RESUME("ON_RESUME", 2), 
        ON_START("ON_START", 1), 
        ON_STOP("ON_STOP", 4);
        
        public b(final String name, final int ordinal) {
        }
        
        public static b c(final c c) {
            final int n = d$a.a[c.ordinal()];
            if (n == 1) {
                return b.ON_DESTROY;
            }
            if (n == 2) {
                return b.ON_STOP;
            }
            if (n != 3) {
                return null;
            }
            return b.ON_PAUSE;
        }
        
        public static b h(final c c) {
            final int n = d$a.a[c.ordinal()];
            if (n == 1) {
                return b.ON_START;
            }
            if (n == 2) {
                return b.ON_RESUME;
            }
            if (n != 5) {
                return null;
            }
            return b.ON_CREATE;
        }
        
        public c e() {
            switch (d$a.b[this.ordinal()]) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(" has no target state");
                    throw new IllegalArgumentException(sb.toString());
                }
                case 6: {
                    return c.o;
                }
                case 5: {
                    return c.s;
                }
                case 3:
                case 4: {
                    return c.r;
                }
                case 1:
                case 2: {
                    return c.q;
                }
            }
        }
    }
    
    public enum c
    {
        o("DESTROYED", 0), 
        p("INITIALIZED", 1), 
        q("CREATED", 2), 
        r("STARTED", 3), 
        s("RESUMED", 4);
        
        public c(final String name, final int ordinal) {
        }
        
        public boolean c(final c o) {
            return this.compareTo(o) >= 0;
        }
    }
}
