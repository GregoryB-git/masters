// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class U7 extends n
{
    public b q;
    
    public U7(final b q) {
        super("internal.registerCallback");
        this.q = q;
    }
    
    @Override
    public final s b(final f3 f3, final List list) {
        C2.g(super.o, 3, list);
        final String g = f3.b(list.get(0)).g();
        final s b = f3.b(list.get(1));
        if (!(b instanceof t)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        final s b2 = f3.b(list.get(2));
        if (!(b2 instanceof r)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        final r r = (r)b2;
        if (r.q("type")) {
            final String g2 = r.i("type").g();
            int i;
            if (r.q("priority")) {
                i = C2.i(r.i("priority").f());
            }
            else {
                i = 1000;
            }
            this.q.c(g, i, (t)b, g2);
            return s.d;
        }
        throw new IllegalArgumentException("Undefined rule type");
    }
}
