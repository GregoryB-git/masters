// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class P7 extends n
{
    public final T7 q;
    
    public P7(final T7 q) {
        super("internal.logger");
        this.q = q;
        super.p.put("log", new S7(this, false, true));
        super.p.put("silent", new A7(this, "silent"));
        super.p.get("silent").a("log", new S7(this, true, true));
        super.p.put("unmonitored", new R7(this, "unmonitored"));
        super.p.get("unmonitored").a("log", new S7(this, false, false));
    }
    
    @Override
    public final s b(final f3 f3, final List list) {
        return s.d;
    }
}
