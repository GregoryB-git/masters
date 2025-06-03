// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class i implements Iterator
{
    public int o;
    public final /* synthetic */ g p;
    
    public i(final g p) {
        this.p = p;
        this.o = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.o < this.p.U();
    }
}
