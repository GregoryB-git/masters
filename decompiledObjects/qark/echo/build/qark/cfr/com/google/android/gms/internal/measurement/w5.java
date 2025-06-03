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

import com.google.android.gms.internal.measurement.Z6;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.y6;
import java.util.List;
import java.util.Map;

public final class w5
extends n {
    public final y6 q;

    public w5(String string2, y6 y62) {
        super(string2);
        this.q = y62;
        this.p.put((Object)"getValue", (Object)new Z6(this, "getValue", y62));
    }

    @Override
    public final s b(f3 f32, List list) {
        return s.d;
    }
}

