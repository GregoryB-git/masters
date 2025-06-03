package sb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class z extends y {
    public static final <K, V> Map<K, V> K0(rb.d<? extends K, ? extends V>... dVarArr) {
        if (dVarArr.length <= 0) {
            return t.f14325a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.H0(dVarArr.length));
        for (rb.d<? extends K, ? extends V> dVar : dVarArr) {
            linkedHashMap.put(dVar.f13844a, dVar.f13845b);
        }
        return linkedHashMap;
    }

    public static final Map L0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return t.f14325a;
        }
        if (size == 1) {
            return y.I0((rb.d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.H0(arrayList.size()));
        M0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    public static final void M0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rb.d dVar = (rb.d) it.next();
            linkedHashMap.put(dVar.f13844a, dVar.f13845b);
        }
    }
}
