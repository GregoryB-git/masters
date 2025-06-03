// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class x implements Iterator
{
    public int o;
    public final /* synthetic */ u p;
    
    public x(final u p) {
        this.p = p;
        this.o = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.o < u.a(this.p).length();
    }
}
