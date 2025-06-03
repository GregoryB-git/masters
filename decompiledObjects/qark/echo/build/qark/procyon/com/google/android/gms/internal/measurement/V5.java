// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class V5 implements s
{
    public static V5 p;
    public final s o;
    
    static {
        V5.p = new V5();
    }
    
    public V5() {
        this.o = t.b(new Y5());
    }
    
    public static boolean a() {
        return ((Z5)V5.p.get()).a();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
