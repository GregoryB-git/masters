// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W5;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.HashMap;
import V5.m;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;

public class F extends E
{
    public static Map d() {
        final z o = z.o;
        Intrinsics.c(o, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return o;
    }
    
    public static HashMap e(final m... array) {
        Intrinsics.checkNotNullParameter(array, "pairs");
        final HashMap hashMap = new HashMap(C.a(array.length));
        j(hashMap, array);
        return hashMap;
    }
    
    public static Map f(final m... array) {
        Intrinsics.checkNotNullParameter(array, "pairs");
        if (array.length > 0) {
            return n(array, new LinkedHashMap(C.a(array.length)));
        }
        return C.d();
    }
    
    public static Map g(final m... array) {
        Intrinsics.checkNotNullParameter(array, "pairs");
        final LinkedHashMap linkedHashMap = new LinkedHashMap(C.a(array.length));
        j(linkedHashMap, array);
        return linkedHashMap;
    }
    
    public static final Map h(final Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        final int size = map.size();
        if (size == 0) {
            return C.d();
        }
        if (size != 1) {
            return map;
        }
        return E.c(map);
    }
    
    public static final void i(final Map map, final Iterable iterable) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "pairs");
        for (final m m : iterable) {
            map.put(m.a(), m.b());
        }
    }
    
    public static final void j(final Map map, final m[] array) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(array, "pairs");
        for (int length = array.length, i = 0; i < length; ++i) {
            final m m = array[i];
            map.put(m.a(), m.b());
        }
    }
    
    public static Map k(final Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return h(l(iterable, new LinkedHashMap()));
        }
        final Collection collection = (Collection)iterable;
        final int size = collection.size();
        if (size == 0) {
            return C.d();
        }
        if (size != 1) {
            return l(iterable, new LinkedHashMap(C.a(collection.size())));
        }
        m m;
        if (iterable instanceof List) {
            m = ((List<Object>)iterable).get(0);
        }
        else {
            m = iterable.iterator().next();
        }
        return C.b(m);
    }
    
    public static final Map l(final Iterable iterable, final Map map) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(map, "destination");
        i(map, iterable);
        return map;
    }
    
    public static Map m(final Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        final int size = map.size();
        if (size == 0) {
            return C.d();
        }
        if (size != 1) {
            return C.o(map);
        }
        return E.c(map);
    }
    
    public static final Map n(final m[] array, final Map map) {
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(map, "destination");
        j(map, array);
        return map;
    }
    
    public static Map o(final Map m) {
        Intrinsics.checkNotNullParameter(m, "<this>");
        return new LinkedHashMap(m);
    }
}
