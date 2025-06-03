// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public final class z implements s
{
    @Override
    public final s c() {
        return s.d;
    }
    
    @Override
    public final Boolean d() {
        return Boolean.FALSE;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || o instanceof z;
    }
    
    @Override
    public final Double f() {
        return Double.NaN;
    }
    
    @Override
    public final String g() {
        return "undefined";
    }
    
    @Override
    public final Iterator k() {
        return null;
    }
    
    @Override
    public final s s(final String s, final f3 f3, final List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", s));
    }
}
