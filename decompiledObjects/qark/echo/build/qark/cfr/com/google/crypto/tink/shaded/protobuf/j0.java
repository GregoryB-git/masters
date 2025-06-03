/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import java.util.List;

public class j0
extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    public final List o = null;

    public j0(O o8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public A a() {
        return new A(this.getMessage());
    }
}

