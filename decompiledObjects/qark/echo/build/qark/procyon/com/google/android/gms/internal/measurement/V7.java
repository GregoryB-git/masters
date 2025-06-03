// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class V7 extends n
{
    public final Callable q;
    
    public V7(final String s, final Callable q) {
        super(s);
        this.q = q;
    }
    
    @Override
    public final s b(final f3 f3, final List list) {
        try {
            return b4.b(this.q.call());
        }
        catch (Exception ex) {
            return s.d;
        }
    }
}
