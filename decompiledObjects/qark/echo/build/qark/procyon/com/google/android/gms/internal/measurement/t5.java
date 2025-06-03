// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class t5 extends RuntimeException
{
    public final List o;
    
    public t5(final I4 i4) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.o = null;
    }
}
