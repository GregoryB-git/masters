/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.D;
import com.google.android.gms.internal.measurement.F;
import com.google.android.gms.internal.measurement.J;
import com.google.android.gms.internal.measurement.L;
import com.google.android.gms.internal.measurement.S;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.X;
import com.google.android.gms.internal.measurement.Z;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class E {
    public Map a = new HashMap();
    public U b = new U();

    public E() {
        this.b(new y());
        this.b(new D());
        this.b(new F());
        this.b(new J());
        this.b(new L());
        this.b(new S());
        this.b(new X());
    }

    public final s a(f3 f32, s object) {
        C2.b(f32);
        if (object instanceof v) {
            object = (v)object;
            ArrayList arrayList = object.b();
            String string2 = object.a();
            object = this.a.containsKey((Object)string2) ? (A)this.a.get((Object)string2) : this.b;
            return object.b(string2, f32, (List)arrayList);
        }
        return object;
    }

    public final void b(A a8) {
        Iterator iterator = a8.a.iterator();
        while (iterator.hasNext()) {
            String string2 = ((Z)((Object)iterator.next())).toString();
            this.a.put((Object)string2, (Object)a8);
        }
    }
}

