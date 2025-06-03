// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

public class k
{
    public static boolean b = true;
    public static volatile k c;
    public static final k d;
    public final Map a;
    
    static {
        d = new k(true);
    }
    
    public k(final boolean b) {
        this.a = Collections.emptyMap();
    }
    
    public static k a() {
        final k c = k.c;
        if (c == null) {
            // monitorenter(k.class)
            while (true) {
                try {
                    k c2;
                    if ((c2 = k.c) == null) {
                        if (k.b) {
                            c2 = j.a();
                        }
                        else {
                            c2 = k.d;
                        }
                        k.c = c2;
                    }
                    // monitorexit(k.class)
                    return c2;
                    // monitorexit(k.class)
                    return c;
                }
                finally {}
                continue;
            }
        }
        return c;
    }
}
