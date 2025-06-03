package L5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public Map f3460a = new HashMap();

    public x(Q3.b bVar) {
        Collection asList;
        HashMap hashMap = new HashMap();
        hashMap.put("key", bVar.e());
        hashMap.put("value", bVar.h());
        hashMap.put("priority", bVar.f());
        int d7 = (int) bVar.d();
        if (d7 == 0) {
            asList = new ArrayList();
        } else {
            String[] strArr = new String[d7];
            Iterator it = bVar.c().iterator();
            int i7 = 0;
            while (it.hasNext()) {
                strArr[i7] = ((Q3.b) it.next()).e();
                i7++;
            }
            asList = Arrays.asList(strArr);
        }
        hashMap.put("childKeys", asList);
        this.f3460a.put("snapshot", hashMap);
    }

    public Map a() {
        return this.f3460a;
    }

    public x b(Map map) {
        Map map2 = this.f3460a;
        HashMap hashMap = new HashMap();
        this.f3460a = hashMap;
        hashMap.putAll(map2);
        this.f3460a.putAll(map);
        return this;
    }
}
