// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class X7 extends n
{
    public final X4 q;
    public final Map r;
    
    public X7(final X4 q) {
        super("require");
        this.r = new HashMap();
        this.q = q;
    }
    
    @Override
    public final s b(final f3 f3, final List list) {
        C2.g("require", 1, list);
        final String g = f3.b(list.get(0)).g();
        if (this.r.containsKey(g)) {
            return (s)this.r.get(g);
        }
        final s a = this.q.a(g);
        if (a instanceof n) {
            this.r.put(g, a);
        }
        return a;
    }
}
