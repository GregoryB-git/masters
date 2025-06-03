// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Collection;

public final class r4 extends q4
{
    public r4() {
        super(null);
    }
    
    public static h4 e(final Object o, final long n) {
        return (h4)D5.B(o, n);
    }
    
    @Override
    public final void b(final Object o, final Object o2, final long n) {
        final h4 e = e(o, n);
        final h4 e2 = e(o2, n);
        final int size = e.size();
        final int size2 = e2.size();
        h4 e3 = e;
        if (size > 0) {
            e3 = e;
            if (size2 > 0) {
                e3 = e;
                if (!e.c()) {
                    e3 = e.e(size2 + size);
                }
                e3.addAll(e2);
            }
        }
        h4 h4 = e2;
        if (size > 0) {
            h4 = e3;
        }
        D5.j(o, n, h4);
    }
    
    @Override
    public final void d(final Object o, final long n) {
        e(o, n).G();
    }
}
