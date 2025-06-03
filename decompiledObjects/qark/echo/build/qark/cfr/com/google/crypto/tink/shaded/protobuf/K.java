/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.J;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class K
implements J {
    public static int i(int n8, Object object, Object object2) {
        object = (I)((Object)object);
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
        throw null;
    }

    public static I j(Object object, Object object2) {
        I i8 = (I)((Object)object);
        object2 = (I)((Object)object2);
        object = i8;
        if (!object2.isEmpty()) {
            object = i8;
            if (!i8.n()) {
                object = i8.s();
            }
            object.p((I)((Object)object2));
        }
        return object;
    }

    @Override
    public Object a(Object object, Object object2) {
        return K.j(object, object2);
    }

    @Override
    public int b(int n8, Object object, Object object2) {
        return K.i(n8, object, object2);
    }

    @Override
    public Object c(Object object) {
        ((I)((Object)object)).o();
        return object;
    }

    @Override
    public H.a d(Object object) {
        a.a(object);
        throw null;
    }

    @Override
    public Map e(Object object) {
        return (I)((Object)object);
    }

    @Override
    public Object f(Object object) {
        return I.f().s();
    }

    @Override
    public boolean g(Object object) {
        return ((I)((Object)object)).n() ^ true;
    }

    @Override
    public Map h(Object object) {
        return (I)((Object)object);
    }
}

