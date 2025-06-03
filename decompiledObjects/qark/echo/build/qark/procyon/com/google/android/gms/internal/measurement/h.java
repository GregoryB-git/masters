// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public final class h implements s
{
    public final boolean o;
    
    public h(final Boolean b) {
        this.o = (b != null && b);
    }
    
    @Override
    public final s c() {
        return new h(this.o);
    }
    
    @Override
    public final Boolean d() {
        return this.o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h && this.o == ((h)o).o);
    }
    
    @Override
    public final Double f() {
        double d;
        if (this.o) {
            d = 1.0;
        }
        else {
            d = 0.0;
        }
        return d;
    }
    
    @Override
    public final String g() {
        return Boolean.toString(this.o);
    }
    
    @Override
    public final int hashCode() {
        return Boolean.valueOf(this.o).hashCode();
    }
    
    @Override
    public final Iterator k() {
        return null;
    }
    
    @Override
    public final s s(final String anObject, final f3 f3, final List list) {
        if ("toString".equals(anObject)) {
            return new u(Boolean.toString(this.o));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.o), anObject));
    }
    
    @Override
    public final String toString() {
        return String.valueOf(this.o);
    }
}
