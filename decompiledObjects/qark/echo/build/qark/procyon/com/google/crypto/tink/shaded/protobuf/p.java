// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.Map;

public class p
{
    public static boolean b = true;
    public static volatile p c;
    public static final p d;
    public final Map a;
    
    static {
        d = new p(true);
    }
    
    public p(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static p b() {
        final p c = p.c;
        if (c == null) {
            // monitorenter(p.class)
            while (true) {
                try {
                    p c2;
                    if ((c2 = p.c) == null) {
                        if (p.b) {
                            c2 = o.a();
                        }
                        else {
                            c2 = p.d;
                        }
                        p.c = c2;
                    }
                    // monitorexit(p.class)
                    return c2;
                }
                // monitorexit(p.class)
                finally {}
                continue;
            }
        }
        return c;
    }
    
    public x.c a(final O o, final int n) {
        android.support.v4.media.a.a(this.a.get(new a(o, n)));
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
        public boolean equals(final Object o) {
            final boolean b = o instanceof a;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final a a = (a)o;
            boolean b3 = b2;
            if (this.a == a.a) {
                b3 = b2;
                if (this.b == a.b) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            return System.identityHashCode(this.a) * 65535 + this.b;
        }
    }
}
