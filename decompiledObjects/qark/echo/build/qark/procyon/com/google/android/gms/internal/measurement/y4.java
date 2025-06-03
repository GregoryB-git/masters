// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public final class y4 extends n
{
    public final d q;
    
    public y4(final d q) {
        super("internal.eventLogger");
        this.q = q;
    }
    
    @Override
    public final s b(final f3 f3, final List list) {
        C2.g(super.o, 3, list);
        final String g = f3.b(list.get(0)).g();
        final long n = (long)C2.a(f3.b(list.get(1)).f());
        final s b = f3.b(list.get(2));
        Map e;
        if (b instanceof r) {
            e = C2.e((r)b);
        }
        else {
            e = new HashMap();
        }
        this.q.c(g, n, e);
        return s.d;
    }
}
