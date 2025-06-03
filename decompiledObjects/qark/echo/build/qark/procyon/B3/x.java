// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import r4.b;

public class x implements b
{
    public static final Object c;
    public volatile Object a;
    public volatile b b;
    
    static {
        c = new Object();
    }
    
    public x(final b b) {
        this.a = x.c;
        this.b = b;
    }
    
    @Override
    public Object get() {
        final Object a = this.a;
        final Object c = x.c;
        if (a == c) {
            // monitorenter(this)
            while (true) {
                try {
                    Object a2;
                    if ((a2 = this.a) == c) {
                        a2 = this.b.get();
                        this.a = a2;
                        this.b = null;
                    }
                    // monitorexit(this)
                    return a2;
                    // monitorexit(this)
                    return a;
                }
                finally {}
                continue;
            }
        }
        return a;
    }
}
