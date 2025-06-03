// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class a7 implements s
{
    public static a7 p;
    public final s o;
    
    static {
        a7.p = new a7();
    }
    
    public a7() {
        this.o = t.b(new c7());
    }
    
    public static double a() {
        return ((d7)a7.p.get()).a();
    }
    
    public static long b() {
        return ((d7)a7.p.get()).b();
    }
    
    public static long c() {
        return ((d7)a7.p.get()).c();
    }
    
    public static String d() {
        return ((d7)a7.p.get()).d();
    }
    
    public static boolean e() {
        return ((d7)a7.p.get()).f();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
