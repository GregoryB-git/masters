// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

public abstract class j5
{
    public static final Iterator a;
    public static final Iterable b;
    
    static {
        a = new i5();
        b = new l5();
    }
    
    public static Iterable a() {
        return j5.b;
    }
}
