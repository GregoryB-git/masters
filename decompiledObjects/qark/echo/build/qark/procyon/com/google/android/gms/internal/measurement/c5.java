// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import android.support.v4.media.a;

public final class c5 extends d5
{
    public c5(final int n) {
        super(n, null);
    }
    
    @Override
    public final void f() {
        if (!this.o()) {
            if (this.g() > 0) {
                a.a(this.h(0).getKey());
                throw null;
            }
            final Iterator<Map.Entry<Object, V>> iterator = this.j().iterator();
            if (iterator.hasNext()) {
                a.a(iterator.next().getKey());
                throw null;
            }
        }
        super.f();
    }
}
