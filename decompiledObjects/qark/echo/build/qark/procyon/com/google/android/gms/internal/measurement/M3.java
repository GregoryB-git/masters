// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.Map;

public class M3
{
    public static volatile M3 b;
    public static final M3 c;
    public final Map a;
    
    static {
        c = new M3(true);
    }
    
    public M3(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static M3 a() {
        final M3 b = M3.b;
        if (b != null) {
            return b;
        }
        // monitorenter(M3.class)
        while (true) {
            try {
                final M3 b2 = M3.b;
                if (b2 != null) {
                    // monitorexit(M3.class)
                    return b2;
                }
                // monitorexit(M3.class)
                return M3.b = X3.a(M3.class);
                // monitorexit(M3.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Y3.d b(final I4 i4, final int n) {
        android.support.v4.media.a.a(this.a.get(new a(i4, n)));
        return null;
    }
    
    public static final class a
    {
        public final Object a;
        public final int b;
        
        public a(final Object a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}
