/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Map
 *  java.util.Set
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import java.util.Map;
import java.util.Set;

public class K
implements J {
    public static int i(int n8, Object object, Object object2) {
        I i82 = (I)((Object)object);
        object = (H)object2;
        boolean bl = i82.isEmpty();
        int n9 = 0;
        if (bl) {
            return 0;
        }
        for (I i82 : i82.entrySet()) {
            n9 += object.a(n8, i82.getKey(), i82.getValue());
        }
        return n9;
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
        return ((H)object).c();
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

