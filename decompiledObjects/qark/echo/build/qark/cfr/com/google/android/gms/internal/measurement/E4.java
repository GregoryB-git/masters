/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchMethodError
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.google.android.gms.internal.measurement.C4;
import com.google.android.gms.internal.measurement.D4;
import com.google.android.gms.internal.measurement.F4;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class E4
implements F4 {
    @Override
    public final D4 b(Object object) {
        a.a(object);
        throw new NoSuchMethodError();
    }

    @Override
    public final Map c(Object object) {
        return (C4)((Object)object);
    }

    @Override
    public final Object d(Object object, Object object2) {
        C4 c42 = (C4)((Object)object);
        object2 = (C4)((Object)object2);
        object = c42;
        if (!object2.isEmpty()) {
            object = c42;
            if (!c42.j()) {
                object = c42.f();
            }
            object.d((C4)((Object)object2));
        }
        return object;
    }

    @Override
    public final Object e(Object object) {
        ((C4)((Object)object)).g();
        return object;
    }

    @Override
    public final Object f(Object object) {
        return C4.b().f();
    }

    @Override
    public final boolean g(Object object) {
        if (!((C4)((Object)object)).j()) {
            return true;
        }
        return false;
    }

    @Override
    public final Map h(Object object) {
        return (C4)((Object)object);
    }

    @Override
    public final int i(int n8, Object object, Object object2) {
        object = (C4)((Object)object);
        a.a(object2);
        if (object.isEmpty()) {
            return 0;
        }
        if (!(object = object.entrySet().iterator()).hasNext()) {
            return 0;
        }
        object = (Map.Entry)object.next();
        object.getKey();
        object.getValue();
        throw new NoSuchMethodError();
    }
}

