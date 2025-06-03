// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class i6 implements s
{
    public static i6 p;
    public final s o;
    
    static {
        i6.p = new i6();
    }
    
    public i6() {
        this.o = t.b(new k6());
    }
    
    public static boolean a() {
        return ((l6)i6.p.get()).a();
    }
    
    public static boolean b() {
        return ((l6)i6.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
