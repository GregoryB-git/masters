// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class B6 implements s
{
    public static B6 p;
    public final s o;
    
    static {
        B6.p = new B6();
    }
    
    public B6() {
        this.o = t.b(new D6());
    }
    
    public static boolean a() {
        return ((E6)B6.p.get()).a();
    }
    
    public static boolean b() {
        return ((E6)B6.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
