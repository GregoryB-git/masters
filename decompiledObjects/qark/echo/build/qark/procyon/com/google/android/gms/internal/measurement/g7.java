// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class g7 implements s
{
    public static g7 p;
    public final s o;
    
    static {
        g7.p = new g7();
    }
    
    public g7() {
        this.o = t.b(new i7());
    }
    
    public static boolean a() {
        return ((j7)g7.p.get()).a();
    }
    
    public static boolean b() {
        return ((j7)g7.p.get()).b();
    }
    
    public static boolean c() {
        return ((j7)g7.p.get()).c();
    }
    
    public static boolean d() {
        return ((j7)g7.p.get()).d();
    }
    
    public static boolean e() {
        return ((j7)g7.p.get()).f();
    }
    
    public static boolean f() {
        return ((j7)g7.p.get()).g();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
