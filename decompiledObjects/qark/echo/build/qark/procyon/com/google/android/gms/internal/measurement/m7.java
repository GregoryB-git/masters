// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class m7 implements s
{
    public static m7 p;
    public final s o;
    
    static {
        m7.p = new m7();
    }
    
    public m7() {
        this.o = t.b(new o7());
    }
    
    public static boolean a() {
        return ((p7)m7.p.get()).a();
    }
    
    public static boolean b() {
        return ((p7)m7.p.get()).b();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
