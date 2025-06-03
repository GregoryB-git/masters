// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.List;

public class f0 extends RuntimeException
{
    private static final long serialVersionUID = -7466929953374883507L;
    public final List o;
    
    public f0(final K k) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.o = null;
    }
}
