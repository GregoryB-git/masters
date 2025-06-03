// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.List;

public class k0 extends RuntimeException
{
    private static final long serialVersionUID = -7466929953374883507L;
    public final List o;
    
    public k0(final O o) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.o = null;
    }
    
    public z a() {
        return new z(this.getMessage());
    }
}
