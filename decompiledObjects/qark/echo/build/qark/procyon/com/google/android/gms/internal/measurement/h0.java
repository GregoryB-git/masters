// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.net.URLConnection;
import java.net.URL;

public abstract class h0
{
    public static h0 a;
    
    static {
        h0.a = new k0(null);
    }
    
    public static h0 a() {
        synchronized (h0.class) {
            return h0.a;
        }
    }
    
    public abstract URLConnection b(final URL p0, final String p1);
}
