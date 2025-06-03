// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class J extends A
{
    public J() {
        super.a.add(Z.q);
        super.a.add(Z.k0);
        super.a.add(Z.n0);
    }
    
    @Override
    public final s b(final String s, final f3 f3, final List list) {
        final int n = M.a[C2.c(s).ordinal()];
        if (n != 1) {
            if (n == 2) {
                C2.f(Z.k0, 1, list);
                return new h(f3.b(list.get(0)).d() ^ true);
            }
            if (n != 3) {
                return super.a(s);
            }
            C2.f(Z.n0, 2, list);
            final s b = f3.b(list.get(0));
            if (b.d()) {
                return b;
            }
        }
        else {
            C2.f(Z.q, 2, list);
            final s b2 = f3.b(list.get(0));
            if (!b2.d()) {
                return b2;
            }
        }
        return f3.b(list.get(1));
    }
}
