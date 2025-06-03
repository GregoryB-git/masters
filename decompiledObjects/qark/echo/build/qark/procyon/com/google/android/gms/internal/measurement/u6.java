// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class u6 implements s
{
    public static u6 p;
    public final s o;
    
    static {
        u6.p = new u6();
    }
    
    public u6() {
        this.o = t.b(new w6());
    }
    
    public static boolean a() {
        return ((x6)u6.p.get()).a();
    }
    
    public static boolean b() {
        return ((x6)u6.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
