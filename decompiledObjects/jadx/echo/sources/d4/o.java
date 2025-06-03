package d4;

import S3.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class o {
    public static n a(Object obj) {
        return b(obj, r.a());
    }

    public static n b(Object obj, n nVar) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    nVar = r.d(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return g.W();
            }
            if (obj instanceof String) {
                return new t((String) obj, nVar);
            }
            if (obj instanceof Long) {
                return new l((Long) obj, nVar);
            }
            if (obj instanceof Integer) {
                return new l(Long.valueOf(((Integer) obj).intValue()), nVar);
            }
            if (obj instanceof Double) {
                return new f((Double) obj, nVar);
            }
            if (obj instanceof Boolean) {
                return new C1226a((Boolean) obj, nVar);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new Q3.d("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new e(map2, nVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        n a7 = a(map2.get(str));
                        if (!a7.isEmpty()) {
                            hashMap.put(C1227b.j(str), a7);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i7 = 0; i7 < list.size(); i7++) {
                    String str2 = "" + i7;
                    n a8 = a(list.get(i7));
                    if (!a8.isEmpty()) {
                        hashMap.put(C1227b.j(str2), a8);
                    }
                }
            }
            return hashMap.isEmpty() ? g.W() : new c(c.a.d(hashMap, c.f13275r), nVar);
        } catch (ClassCastException e7) {
            throw new Q3.d("Failed to parse node", e7);
        }
    }

    public static int c(C1227b c1227b, n nVar, C1227b c1227b2, n nVar2) {
        int compareTo = nVar.compareTo(nVar2);
        return compareTo != 0 ? compareTo : c1227b.compareTo(c1227b2);
    }
}
