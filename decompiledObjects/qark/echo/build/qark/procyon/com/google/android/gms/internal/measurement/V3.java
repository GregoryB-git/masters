// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public enum V3
{
    p("SCALAR", 0, false), 
    q("VECTOR", 1, true), 
    r("PACKED_VECTOR", 2, true), 
    s("MAP", 3, false);
    
    public final boolean o;
    
    public V3(final String name, final int ordinal, final boolean o) {
        this.o = o;
    }
}
