/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.internal.measurement.y6;
import java.util.List;

public final class Z6
extends n {
    public final /* synthetic */ y6 q;

    public Z6(w5 w52, String string2, y6 y62) {
        this.q = y62;
        super(string2);
    }

    @Override
    public final s b(f3 object, List object2) {
        C2.g("getValue", 2, (List)object2);
        s s8 = object.b((s)object2.get(0));
        object = object.b((s)object2.get(1));
        object2 = s8.g();
        object2 = this.q.i((String)object2);
        if (object2 != null) {
            object = new u((String)object2);
        }
        return object;
    }
}

