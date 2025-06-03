// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.t;
import W2.s;

public final class K7 implements s
{
    public static K7 p;
    public final s o;
    
    static {
        K7.p = new K7();
    }
    
    public K7() {
        this.o = t.b(new M7());
    }
    
    public static boolean a() {
        return ((J7)K7.p.get()).a();
    }
    
    @Override
    public final /* synthetic */ Object get() {
        return this.o.get();
    }
}
