/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package g0;

import W2.g;
import X2.v;
import android.os.Bundle;
import g0.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class b {
    public static v a(g g8, List list) {
        v.a a8 = v.M();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            a8.h(g8.apply((Object)((Bundle)a.e((Object)((Bundle)list.get(i8))))));
        }
        return a8.k();
    }

    public static ArrayList b(Collection collection, g g8) {
        ArrayList arrayList = new ArrayList(collection.size());
        collection = collection.iterator();
        while (collection.hasNext()) {
            arrayList.add((Object)((Bundle)g8.apply(collection.next())));
        }
        return arrayList;
    }
}

