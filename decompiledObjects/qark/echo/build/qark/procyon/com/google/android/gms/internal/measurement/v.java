// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class v implements s
{
    public final String o;
    public final ArrayList p;
    
    public v(final String o, final List c) {
        this.o = o;
        (this.p = new ArrayList()).addAll(c);
    }
    
    public final String a() {
        return this.o;
    }
    
    public final ArrayList b() {
        return this.p;
    }
    
    @Override
    public final s c() {
        return this;
    }
    
    @Override
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v)) {
            return false;
        }
        final v v = (v)o;
        final String o2 = this.o;
        if (o2 != null) {
            if (!o2.equals(v.o)) {
                return false;
            }
        }
        else if (v.o != null) {
            return false;
        }
        final ArrayList p = this.p;
        final ArrayList p2 = v.p;
        if (p != null) {
            return p.equals(p2);
        }
        return p2 == null;
    }
    
    @Override
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
    
    @Override
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
    
    @Override
    public final int hashCode() {
        final String o = this.o;
        int hashCode = 0;
        int hashCode2;
        if (o != null) {
            hashCode2 = o.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final ArrayList p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final Iterator k() {
        return null;
    }
    
    @Override
    public final s s(final String s, final f3 f3, final List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
