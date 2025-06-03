// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class M6 implements s
{
    public static M6 p;
    public final s o;
    
    static {
        M6.p = new M6();
    }
    
    public M6() {
        this.o = t.b(new O6());
    }
    
    public static boolean a() {
        return ((L6)M6.p.get()).a();
    }
    
    public static boolean b() {
        return ((L6)M6.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
