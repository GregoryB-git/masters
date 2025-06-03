// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class T6 implements s
{
    public static T6 p;
    public final s o;
    
    static {
        T6.p = new T6();
    }
    
    public T6() {
        this.o = t.b(new V6());
    }
    
    public static boolean a() {
        return ((W6)T6.p.get()).a();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
