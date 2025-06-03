// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import android.support.v4.media.a;

public final class E4 implements F4
{
    @Override
    public final D4 b(final Object o) {
        a.a(o);
        throw new NoSuchMethodError();
    }
    
    @Override
    public final Map c(final Object o) {
        return (C4)o;
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final C4 c4 = (C4)o;
        final C4 c5 = (C4)o2;
        C4 f = c4;
        if (!c5.isEmpty()) {
            f = c4;
            if (!c4.j()) {
                f = c4.f();
            }
            f.d(c5);
        }
        return f;
    }
    
    @Override
    public final Object e(final Object o) {
        ((C4)o).g();
        return o;
    }
    
    @Override
    public final Object f(final Object o) {
        return C4.b().f();
    }
    
    @Override
    public final boolean g(final Object o) {
        return !((C4)o).j();
    }
    
    @Override
    public final Map h(final Object o) {
        return (C4)o;
    }
    
    @Override
    public final int i(final int n, final Object o, final Object o2) {
        final C4 c4 = (C4)o;
        a.a(o2);
        if (c4.isEmpty()) {
            return 0;
        }
        final Iterator iterator = c4.entrySet().iterator();
        if (!iterator.hasNext()) {
            return 0;
        }
        final Map.Entry entry = iterator.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
