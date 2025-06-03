// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class L7 implements s
{
    public static L7 p;
    public final s o;
    
    static {
        L7.p = new L7();
    }
    
    public L7() {
        this.o = t.b(new N7());
    }
    
    public static boolean a() {
        return ((O7)L7.p.get()).a();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
