/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Map
 *  java.util.Set
 */
package com.google.protobuf;

import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.F;
import java.util.Map;
import java.util.Set;

public class G
implements F {
    public static int f(int n8, Object object, Object object2) {
        E e82 = (E)((Object)object);
        object = (D)object2;
        boolean bl = e82.isEmpty();
        int n9 = 0;
        if (bl) {
            return 0;
        }
        for (E e82 : e82.entrySet()) {
            n9 += object.a(n8, e82.getKey(), e82.getValue());
        }
        return n9;
    }

    public static E g(Object object, Object object2) {
        E e8 = (E)((Object)object);
        object2 = (E)((Object)object2);
        object = e8;
        if (!object2.isEmpty()) {
            object = e8;
            if (!e8.n()) {
                object = e8.s();
            }
            object.p((E)((Object)object2));
        }
        return object;
    }

    @Override
    public Object a(Object object, Object object2) {
        return G.g(object, object2);
    }

    @Override
    public int b(int n8, Object object, Object object2) {
        return G.f(n8, object, object2);
    }

    @Override
    public Object c(Object object) {
        ((E)((Object)object)).o();
        return object;
    }

    @Override
    public D.a d(Object object) {
        return ((D)object).c();
    }

    @Override
    public Map e(Object object) {
        return (E)((Object)object);
    }
}

