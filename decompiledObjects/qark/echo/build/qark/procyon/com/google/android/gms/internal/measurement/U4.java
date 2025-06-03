// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class U4
{
    public static final U4 c;
    public final b5 a;
    public final ConcurrentMap b;
    
    static {
        c = new U4();
    }
    
    public U4() {
        this.b = new ConcurrentHashMap();
        this.a = new v4();
    }
    
    public static U4 a() {
        return U4.c;
    }
    
    public final Z4 b(final Class clazz) {
        a4.f(clazz, "messageType");
        Z4 a;
        if ((a = (Z4)this.b.get(clazz)) == null) {
            a = this.a.a(clazz);
            a4.f(clazz, "messageType");
            a4.f(a, "schema");
            final Z4 z4 = this.b.putIfAbsent(clazz, a);
            if (z4 != null) {
                a = z4;
            }
        }
        return a;
    }
    
    public final Z4 c(final Object o) {
        return this.b(o.getClass());
    }
}
