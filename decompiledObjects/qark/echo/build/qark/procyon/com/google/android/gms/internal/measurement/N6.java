// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class N6 implements s
{
    public static N6 p;
    public final s o;
    
    static {
        N6.p = new N6();
    }
    
    public N6() {
        this.o = t.b(new P6());
    }
    
    public static boolean a() {
        return ((Q6)N6.p.get()).a();
    }
    
    public static boolean b() {
        return ((Q6)N6.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
