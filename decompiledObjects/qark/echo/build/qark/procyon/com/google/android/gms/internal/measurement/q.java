// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public final class q implements s
{
    @Override
    public final s c() {
        return s.e;
    }
    
    @Override
    public final Boolean d() {
        return Boolean.FALSE;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || o instanceof q;
    }
    
    @Override
    public final Double f() {
        return 0.0;
    }
    
    @Override
    public final String g() {
        return "null";
    }
    
    @Override
    public final int hashCode() {
        return 1;
    }
    
    @Override
    public final Iterator k() {
        return null;
    }
    
    @Override
    public final s s(final String s, final f3 f3, final List list) {
        throw new IllegalStateException(String.format("null has no function %s", s));
    }
}
