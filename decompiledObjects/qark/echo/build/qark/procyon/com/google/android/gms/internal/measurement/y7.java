// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class y7 implements s
{
    public static y7 p;
    public final s o;
    
    static {
        y7.p = new y7();
    }
    
    public y7() {
        this.o = t.b(new B7());
    }
    
    public static boolean a() {
        return ((C7)y7.p.get()).a();
    }
    
    public static boolean b() {
        return ((C7)y7.p.get()).b();
    }
    
    public static boolean c() {
        return ((C7)y7.p.get()).c();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
