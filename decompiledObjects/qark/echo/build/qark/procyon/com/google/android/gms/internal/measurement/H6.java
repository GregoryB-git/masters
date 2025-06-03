// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class H6 implements s
{
    public static H6 p;
    public final s o;
    
    static {
        H6.p = new H6();
    }
    
    public H6() {
        this.o = t.b(new J6());
    }
    
    public static boolean a() {
        return ((K6)H6.p.get()).a();
    }
    
    public static boolean b() {
        return ((K6)H6.p.get()).b();
    }
    
    public static boolean c() {
        return ((K6)H6.p.get()).c();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
