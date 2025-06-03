/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import java.util.List;
import java.util.concurrent.Callable;

public final class V7
extends n {
    public final Callable q;

    public V7(String string2, Callable callable) {
        super(string2);
        this.q = callable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final s b(f3 object, List list) {
        try {
            return b4.b(this.q.call());
        }
        catch (Exception exception) {
            return s.d;
        }
    }
}

