// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

public final class t3 extends v3
{
    public int o;
    public final int p;
    public final /* synthetic */ q3 q;
    
    public t3(final q3 q) {
        this.q = q;
        this.o = 0;
        this.p = q.S();
    }
    
    @Override
    public final byte a() {
        final int o = this.o;
        if (o < this.p) {
            this.o = o + 1;
            return this.q.M(o);
        }
        throw new NoSuchElementException();
    }
    
    @Override
    public final boolean hasNext() {
        return this.o < this.p;
    }
}
