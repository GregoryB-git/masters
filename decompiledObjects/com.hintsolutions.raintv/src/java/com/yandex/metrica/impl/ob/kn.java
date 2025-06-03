/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.HashMap
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.hn;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

public class kn<T>
implements Comparator<Collection<T>> {
    private final hn<T> a;
    private final Comparator<T> b;

    public kn(hn<T> hn2, Comparator<T> comparator) {
        this.a = hn2;
        this.b = comparator;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int compare(Object object, Object object2) {
        Object object3;
        Object object42;
        Collection collection = (Collection)object;
        object2 = (Collection)object2;
        boolean bl = true;
        int n4 = 0;
        int n5 = collection == null ? 1 : 0;
        if (object2 != null) {
            bl = false;
        }
        if (bl ^ n5) return 10;
        if (collection == object2) {
            return n4;
        }
        if (collection.size() != object2.size()) return 10;
        object = new HashMap();
        for (Object object42 : collection) {
            object.put((Object)this.a.a(object42), object42);
        }
        object42 = object2.iterator();
        do {
            n5 = n4;
            if (!object42.hasNext()) return n5;
            object3 = object42.next();
            object2 = object.get((Object)this.a.a(object3));
            if (object2 == null) return 10;
        } while (this.b.compare(object2, object3) == 0);
        return 10;
    }
}

