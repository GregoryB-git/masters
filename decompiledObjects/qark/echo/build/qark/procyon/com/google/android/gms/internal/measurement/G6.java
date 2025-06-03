// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class G6 implements s
{
    public static G6 p;
    public final s o;
    
    static {
        G6.p = new G6();
    }
    
    public G6() {
        this.o = t.b(new I6());
    }
    
    public static boolean a() {
        return ((F6)G6.p.get()).a();
    }
    
    public static boolean b() {
        return ((F6)G6.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
