// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public class j0 extends RuntimeException
{
    private static final long serialVersionUID = -7466929953374883507L;
    public final List o;
    
    public j0(final O o) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.o = null;
    }
    
    public A a() {
        return new A(this.getMessage());
    }
}
