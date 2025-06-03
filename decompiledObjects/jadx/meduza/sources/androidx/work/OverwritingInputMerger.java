package androidx.work;

import androidx.work.c;
import ec.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o2.f;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends f {
    @Override // o2.f
    public final c a(ArrayList arrayList) {
        c.a aVar = new c.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((c) it.next()).f1455a);
            i.d(unmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(unmodifiableMap);
        }
        aVar.a(linkedHashMap);
        c cVar = new c(aVar.f1456a);
        c.e(cVar);
        return cVar;
    }
}
