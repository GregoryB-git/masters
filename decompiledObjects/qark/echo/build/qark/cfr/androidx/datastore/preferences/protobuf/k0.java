/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.z;
import java.util.List;

public class k0
extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    public final List o = null;

    public k0(O o8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public z a() {
        return new z(this.getMessage());
    }
}

