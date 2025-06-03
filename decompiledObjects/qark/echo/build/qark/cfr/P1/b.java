/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 */
package P1;

import P1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final List a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap)this.a.get((Object)string2);
        if (concurrentHashMap == null) {
            return null;
        }
        string2 = new ArrayList(concurrentHashMap.size());
        concurrentHashMap = concurrentHashMap.entrySet().iterator();
        while (concurrentHashMap.hasNext()) {
            string2.add((Object)((a)((Map.Entry)concurrentHashMap.next()).getValue()));
        }
        return string2;
    }

    public final void b(String string2, List list) {
        Intrinsics.checkNotNullParameter(string2, "appId");
        Intrinsics.checkNotNullParameter((Object)list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (a a8 : (Iterable)list) {
            concurrentHashMap.put((Object)a8.a(), (Object)a8);
        }
        this.a.put((Object)string2, (Object)concurrentHashMap);
    }
}

