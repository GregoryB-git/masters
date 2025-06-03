/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import java.util.List;

public final class t5
extends RuntimeException {
    public final List o = null;

    public t5(I4 i42) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}

