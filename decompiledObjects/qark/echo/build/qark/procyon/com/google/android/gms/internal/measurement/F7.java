// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class F7 implements s
{
    public static F7 p;
    public final s o;
    
    static {
        F7.p = new F7();
    }
    
    public F7() {
        this.o = t.b(new H7());
    }
    
    public static boolean a() {
        return ((I7)F7.p.get()).a();
    }
    
    public static boolean b() {
        return ((I7)F7.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
