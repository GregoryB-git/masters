// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class Y6 implements s
{
    public static Y6 p;
    public final s o;
    
    static {
        Y6.p = new Y6();
    }
    
    public Y6() {
        this.o = t.b(new b7());
    }
    
    public static boolean a() {
        return ((X6)Y6.p.get()).a();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
