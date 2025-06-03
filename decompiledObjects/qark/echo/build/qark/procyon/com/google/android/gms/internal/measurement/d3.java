// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import X2.x;
import W2.m;

public final class d3
{
    public final boolean a;
    
    public d3(final h3 h3) {
        m.k(h3, "BuildInfo must be non-null");
        this.a = (h3.a() ^ true);
    }
    
    public final boolean a(final String s) {
        m.k(s, "flagName must not be null");
        return !this.a || ((x)g3.a.get()).b(s);
    }
}
