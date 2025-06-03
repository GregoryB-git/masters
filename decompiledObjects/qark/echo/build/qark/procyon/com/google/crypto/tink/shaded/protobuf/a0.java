// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class a0
{
    public static final a0 c;
    public final f0 a;
    public final ConcurrentMap b;
    
    static {
        c = new a0();
    }
    
    public a0() {
        this.b = new ConcurrentHashMap();
        this.a = new G();
    }
    
    public static a0 a() {
        return a0.c;
    }
    
    public e0 b(final Class clazz, final e0 e0) {
        z.b(clazz, "messageType");
        z.b(e0, "schema");
        return this.b.putIfAbsent(clazz, e0);
    }
    
    public e0 c(final Class clazz) {
        z.b(clazz, "messageType");
        e0 a;
        if ((a = (e0)this.b.get(clazz)) == null) {
            a = this.a.a(clazz);
            final e0 b = this.b(clazz, a);
            if (b != null) {
                a = b;
            }
        }
        return a;
    }
    
    public e0 d(final Object o) {
        return this.c(o.getClass());
    }
}
