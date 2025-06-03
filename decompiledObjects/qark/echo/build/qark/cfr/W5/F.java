/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package W5;

import V5.m;
import W5.C;
import W5.E;
import W5.z;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class F
extends E {
    public static Map d() {
        z z8 = z.o;
        Intrinsics.c(z8, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return z8;
    }

    public static /* varargs */ HashMap e(m ... arrm) {
        Intrinsics.checkNotNullParameter(arrm, "pairs");
        HashMap hashMap = new HashMap(C.a(arrm.length));
        F.j((Map)hashMap, arrm);
        return hashMap;
    }

    public static /* varargs */ Map f(m ... arrm) {
        Intrinsics.checkNotNullParameter(arrm, "pairs");
        if (arrm.length > 0) {
            return F.n(arrm, (Map)new LinkedHashMap(C.a(arrm.length)));
        }
        return C.d();
    }

    public static /* varargs */ Map g(m ... arrm) {
        Intrinsics.checkNotNullParameter(arrm, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C.a(arrm.length));
        F.j((Map)linkedHashMap, arrm);
        return linkedHashMap;
    }

    public static final Map h(Map map) {
        Intrinsics.checkNotNullParameter((Object)map, "<this>");
        int n8 = map.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return map;
            }
            return E.c(map);
        }
        return C.d();
    }

    public static final void i(Map map, Iterable iterable) {
        Intrinsics.checkNotNullParameter((Object)map, "<this>");
        Intrinsics.checkNotNullParameter((Object)iterable, "pairs");
        for (m m8 : iterable) {
            map.put(m8.a(), m8.b());
        }
    }

    public static final void j(Map map, m[] arrm) {
        Intrinsics.checkNotNullParameter((Object)map, "<this>");
        Intrinsics.checkNotNullParameter(arrm, "pairs");
        for (m m8 : arrm) {
            map.put(m8.a(), m8.b());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Map k(Iterable object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        if (!(object instanceof Collection)) return F.h(F.l((Iterable)object, (Map)new LinkedHashMap()));
        Collection collection = (Collection)object;
        int n8 = collection.size();
        if (n8 == 0) return C.d();
        if (n8 != 1) {
            return F.l((Iterable)object, (Map)new LinkedHashMap(C.a(collection.size())));
        }
        object = object instanceof List ? ((List)object).get(0) : object.iterator().next();
        object = (m)object;
        return C.b((m)object);
    }

    public static final Map l(Iterable iterable, Map map) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        Intrinsics.checkNotNullParameter((Object)map, "destination");
        F.i(map, iterable);
        return map;
    }

    public static Map m(Map map) {
        Intrinsics.checkNotNullParameter((Object)map, "<this>");
        int n8 = map.size();
        if (n8 != 0) {
            if (n8 != 1) {
                return C.o(map);
            }
            return E.c(map);
        }
        return C.d();
    }

    public static final Map n(m[] arrm, Map map) {
        Intrinsics.checkNotNullParameter(arrm, "<this>");
        Intrinsics.checkNotNullParameter((Object)map, "destination");
        F.j(map, arrm);
        return map;
    }

    public static Map o(Map map) {
        Intrinsics.checkNotNullParameter((Object)map, "<this>");
        return new LinkedHashMap(map);
    }
}

