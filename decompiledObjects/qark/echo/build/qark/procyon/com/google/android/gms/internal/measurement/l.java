// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public final class l implements s
{
    public final s o;
    public final String p;
    
    public l(final String p) {
        this.o = s.d;
        this.p = p;
    }
    
    public l(final String p2, final s o) {
        this.o = o;
        this.p = p2;
    }
    
    public final s a() {
        return this.o;
    }
    
    public final String b() {
        return this.p;
    }
    
    @Override
    public final s c() {
        return new l(this.p, this.o.c());
    }
    
    @Override
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof l)) {
            return false;
        }
        final String p = this.p;
        final l l = (l)o;
        return p.equals(l.p) && this.o.equals(l.o);
    }
    
    @Override
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }
    
    @Override
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }
    
    @Override
    public final int hashCode() {
        return this.p.hashCode() * 31 + this.o.hashCode();
    }
    
    @Override
    public final Iterator k() {
        return null;
    }
    
    @Override
    public final s s(final String s, final f3 f3, final List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
