// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class S6 implements s
{
    public static S6 p;
    public final s o;
    
    static {
        S6.p = new S6();
    }
    
    public S6() {
        this.o = t.b(new U6());
    }
    
    public static boolean a() {
        return ((R6)S6.p.get()).a();
    }
    
    public static boolean b() {
        return ((R6)S6.p.get()).b();
    }
    
    public static boolean c() {
        return ((R6)S6.p.get()).c();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
