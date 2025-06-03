/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package n6;

import W5.m;
import g6.l;
import h6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n6.b;
import n6.g;
import n6.i;

public abstract class h
extends g {
    public static Iterable c(final b b8) {
        Intrinsics.checkNotNullParameter(b8, "<this>");
        return new Iterable(){

            public Iterator iterator() {
                return b8.iterator();
            }
        };
    }

    public static b d(b b8, l l8) {
        Intrinsics.checkNotNullParameter(b8, "<this>");
        Intrinsics.checkNotNullParameter(l8, "transform");
        return new i(b8, l8);
    }

    public static List e(b object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Iterator iterator = object.iterator();
        if (!iterator.hasNext()) {
            return m.f();
        }
        object = iterator.next();
        if (!iterator.hasNext()) {
            return m.b(object);
        }
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(object);
            if (!iterator.hasNext()) break;
            object = iterator.next();
        } while (true);
        return arrayList;
    }

}

