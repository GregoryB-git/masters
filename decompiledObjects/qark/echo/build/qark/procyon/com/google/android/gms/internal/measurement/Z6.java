// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class Z6 extends n
{
    public final /* synthetic */ y6 q;
    
    public Z6(final w5 w5, final String s, final y6 q) {
        this.q = q;
        super(s);
    }
    
    @Override
    public final s b(final f3 f3, final List list) {
        C2.g("getValue", 2, list);
        final s b = f3.b(list.get(0));
        s b2 = f3.b(list.get(1));
        final String i = this.q.i(b.g());
        if (i != null) {
            b2 = new u(i);
        }
        return b2;
    }
}
