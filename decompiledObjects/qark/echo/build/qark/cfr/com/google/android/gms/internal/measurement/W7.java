/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.c;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import java.util.List;
import java.util.Map;

public final class W7
extends n {
    public W7() {
        super("internal.platform");
        this.p.put((Object)"getVersion", (Object)new c(this, "getVersion"));
    }

    @Override
    public final s b(f3 f32, List list) {
        return s.d;
    }
}

