/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class t
extends n
implements m {
    public final List q;
    public final List r;
    public f3 s;

    public t(t t8) {
        super(t8.o);
        ArrayList arrayList = new ArrayList(t8.q.size());
        this.q = arrayList;
        arrayList.addAll((Collection)t8.q);
        arrayList = new ArrayList(t8.r.size());
        this.r = arrayList;
        arrayList.addAll((Collection)t8.r);
        this.s = t8.s;
    }

    public t(String string2, List object, List list, f3 f32) {
        super(string2);
        this.q = new ArrayList();
        this.s = f32;
        if (!object.isEmpty()) {
            string2 = object.iterator();
            while (string2.hasNext()) {
                object = (s)string2.next();
                this.q.add((Object)object.g());
            }
        }
        this.r = new ArrayList((Collection)list);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final s b(f3 object, List object2) {
        s s8;
        Object object3;
        f3 f32 = this.s.d();
        for (int i8 = 0; i8 < this.q.size(); ++i8) {
            if (i8 < object2.size()) {
                object3 = (String)this.q.get(i8);
                s8 = object.b((s)object2.get(i8));
            } else {
                object3 = (String)this.q.get(i8);
                s8 = s.d;
            }
            f32.e((String)object3, s8);
        }
        object3 = this.r.iterator();
        do {
            if (!object3.hasNext()) {
                return s.d;
            }
            s8 = (s)object3.next();
            object = object2 = f32.b(s8);
            if (!(object2 instanceof v)) continue;
            object = f32.b(s8);
        } while (!(object instanceof l));
        return ((l)object).a();
    }

    @Override
    public final s c() {
        return new t(this);
    }
}

