/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.P7;
import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class S7
extends n {
    public boolean q;
    public boolean r;
    public final /* synthetic */ P7 s;

    public S7(P7 p72, boolean bl, boolean bl2) {
        this.s = p72;
        super("log");
        this.q = bl;
        this.r = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final s b(f3 object, List list) {
        C2.k("log", 1, list);
        if (list.size() == 1) {
            P7.h(this.s).a(Q7.r, object.b((s)list.get(0)).g(), Collections.emptyList(), this.q, this.r);
            return s.d;
        }
        Q7 q72 = Q7.c(C2.i(object.b((s)list.get(0)).f()));
        String string2 = object.b((s)list.get(1)).g();
        int n8 = list.size();
        if (n8 == 2) {
            object = P7.h(this.s);
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 2; i8 < Math.min((int)list.size(), (int)5); ++i8) {
                arrayList.add((Object)object.b((s)list.get(i8)).g());
            }
            object = P7.h(this.s);
            list = arrayList;
        }
        object.a(q72, string2, list, this.q, this.r);
        return s.d;
    }
}

