// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class r7 implements s
{
    public static r7 p;
    public final s o;
    
    static {
        r7.p = new r7();
    }
    
    public r7() {
        this.o = t.b(new t7());
    }
    
    public static boolean a() {
        return ((q7)r7.p.get()).a();
    }
    
    public static boolean b() {
        return ((q7)r7.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
