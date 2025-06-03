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

import com.google.android.gms.internal.measurement.A7;
import com.google.android.gms.internal.measurement.R7;
import com.google.android.gms.internal.measurement.S7;
import com.google.android.gms.internal.measurement.T7;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import java.util.List;
import java.util.Map;

public final class P7
extends n {
    public final T7 q;

    public P7(T7 t72) {
        super("internal.logger");
        this.q = t72;
        this.p.put((Object)"log", (Object)new S7(this, false, true));
        this.p.put((Object)"silent", (Object)new A7(this, "silent"));
        ((n)this.p.get((Object)"silent")).a("log", new S7(this, true, true));
        this.p.put((Object)"unmonitored", (Object)new R7(this, "unmonitored"));
        ((n)this.p.get((Object)"unmonitored")).a("log", new S7(this, false, false));
    }

    @Override
    public final s b(f3 f32, List list) {
        return s.d;
    }
}

