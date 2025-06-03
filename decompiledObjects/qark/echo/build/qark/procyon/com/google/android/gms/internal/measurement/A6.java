// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class A6 implements s
{
    public static A6 p;
    public final s o;
    
    static {
        A6.p = new A6();
    }
    
    public A6() {
        this.o = t.b(new C6());
    }
    
    public static boolean a() {
        return ((z6)A6.p.get()).a();
    }
    
    public static boolean b() {
        return ((z6)A6.p.get()).b();
    }
    
    public static boolean c() {
        return ((z6)A6.p.get()).c();
    }
    
    public static boolean d() {
        return ((z6)A6.p.get()).d();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
