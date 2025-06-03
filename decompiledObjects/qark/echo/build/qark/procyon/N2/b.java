// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N2;

import java.io.Closeable;

public final class b implements Closeable
{
    public static final b o;
    
    static {
        o = new b(false, null);
    }
    
    public b(final boolean b, final d d) {
    }
    
    public static b a(final boolean b, final c c) {
        return b.o;
    }
    
    @Override
    public final void close() {
    }
}
