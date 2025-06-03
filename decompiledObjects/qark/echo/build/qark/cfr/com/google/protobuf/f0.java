/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package com.google.protobuf;

import com.google.protobuf.K;
import java.util.List;

public class f0
extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    public final List o = null;

    public f0(K k8) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}

