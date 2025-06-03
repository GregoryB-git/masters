package sb;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y extends x6.b {
    public static final int H0(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> I0(rb.d<? extends K, ? extends V> dVar) {
        ec.i.e(dVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(dVar.f13844a, dVar.f13845b);
        ec.i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map J0(LinkedHashMap linkedHashMap) {
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        ec.i.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
