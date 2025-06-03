package W5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class F extends E {
    public static Map d() {
        z zVar = z.f6895o;
        Intrinsics.c(zVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return zVar;
    }

    public static HashMap e(V5.m... pairs) {
        int a7;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        a7 = E.a(pairs.length);
        HashMap hashMap = new HashMap(a7);
        j(hashMap, pairs);
        return hashMap;
    }

    public static Map f(V5.m... pairs) {
        Map d7;
        int a7;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length > 0) {
            a7 = E.a(pairs.length);
            return n(pairs, new LinkedHashMap(a7));
        }
        d7 = d();
        return d7;
    }

    public static Map g(V5.m... pairs) {
        int a7;
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        a7 = E.a(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        j(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map h(Map map) {
        Map d7;
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : E.c(map);
        }
        d7 = d();
        return d7;
    }

    public static final void i(Map map, Iterable pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            V5.m mVar = (V5.m) it.next();
            map.put(mVar.a(), mVar.b());
        }
    }

    public static final void j(Map map, V5.m[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (V5.m mVar : pairs) {
            map.put(mVar.a(), mVar.b());
        }
    }

    public static Map k(Iterable iterable) {
        Map d7;
        Map b7;
        int a7;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return h(l(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            d7 = d();
            return d7;
        }
        if (size != 1) {
            a7 = E.a(collection.size());
            return l(iterable, new LinkedHashMap(a7));
        }
        b7 = E.b((V5.m) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        return b7;
    }

    public static final Map l(Iterable iterable, Map destination) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        i(destination, iterable);
        return destination;
    }

    public static Map m(Map map) {
        Map d7;
        Map o7;
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            d7 = d();
            return d7;
        }
        if (size == 1) {
            return E.c(map);
        }
        o7 = o(map);
        return o7;
    }

    public static final Map n(V5.m[] mVarArr, Map destination) {
        Intrinsics.checkNotNullParameter(mVarArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        j(destination, mVarArr);
        return destination;
    }

    public static Map o(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
