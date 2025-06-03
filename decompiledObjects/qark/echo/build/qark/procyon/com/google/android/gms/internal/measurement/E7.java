// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class E7 implements s
{
    public static E7 p;
    public final s o;
    
    static {
        E7.p = new E7();
    }
    
    public E7() {
        this.o = t.b(new G7());
    }
    
    public static boolean a() {
        return ((D7)E7.p.get()).a();
    }
    
    public static boolean b() {
        return ((D7)E7.p.get()).b();
    }
    
    public static boolean c() {
        return ((D7)E7.p.get()).c();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
