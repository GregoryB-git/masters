// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Iterator;

public final class n5 implements Iterator
{
    public int o;
    public boolean p;
    public Iterator q;
    public final /* synthetic */ d5 r;
    
    public n5(final d5 r) {
        this.r = r;
        this.o = -1;
    }
    
    public final Iterator b() {
        if (this.q == null) {
            this.q = d5.i(this.r).entrySet().iterator();
        }
        return this.q;
    }
    
    @Override
    public final boolean hasNext() {
        return this.o + 1 < d5.e(this.r).size() || (!d5.i(this.r).isEmpty() && this.b().hasNext());
    }
    
    @Override
    public final void remove() {
        if (!this.p) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.p = false;
        d5.n(this.r);
        if (this.o < d5.e(this.r).size()) {
            d5.c(this.r, this.o--);
            return;
        }
        this.b().remove();
    }
}
