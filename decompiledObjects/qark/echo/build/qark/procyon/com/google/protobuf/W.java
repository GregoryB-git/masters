// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class W
{
    public static final W c;
    public final a0 a;
    public final ConcurrentMap b;
    
    static {
        c = new W();
    }
    
    public W() {
        this.b = new ConcurrentHashMap();
        this.a = new C();
    }
    
    public static W a() {
        return W.c;
    }
    
    public Z b(final Class clazz, final Z z) {
        t.b(clazz, "messageType");
        t.b(z, "schema");
        return this.b.putIfAbsent(clazz, z);
    }
    
    public Z c(final Class clazz) {
        t.b(clazz, "messageType");
        Z a;
        if ((a = (Z)this.b.get(clazz)) == null) {
            a = this.a.a(clazz);
            final Z b = this.b(clazz, a);
            if (b != null) {
                a = b;
            }
        }
        return a;
    }
    
    public Z d(final Object o) {
        return this.c(o.getClass());
    }
}
