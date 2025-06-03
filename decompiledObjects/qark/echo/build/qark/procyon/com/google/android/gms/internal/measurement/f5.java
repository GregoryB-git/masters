// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;
import java.util.Iterator;

public final class f5 implements Iterator
{
    public int o;
    public Iterator p;
    public final /* synthetic */ d5 q;
    
    public f5(final d5 q) {
        this.q = q;
        this.o = d5.e(q).size();
    }
    
    public final Iterator b() {
        if (this.p == null) {
            this.p = d5.l(this.q).entrySet().iterator();
        }
        return this.p;
    }
    
    @Override
    public final boolean hasNext() {
        final int o = this.o;
        return (o > 0 && o <= d5.e(this.q).size()) || this.b().hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
