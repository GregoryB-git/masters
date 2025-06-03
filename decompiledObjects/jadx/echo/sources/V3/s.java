package V3;

import V3.E;
import d4.C1227b;
import d4.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s {

    public class a extends c.AbstractC0192c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ E f6669a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f6670b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f6671c;

        public a(E e7, Map map, t tVar) {
            this.f6669a = e7;
            this.f6670b = map;
            this.f6671c = tVar;
        }

        @Override // d4.c.AbstractC0192c
        public void b(C1227b c1227b, d4.n nVar) {
            d4.n h7 = s.h(nVar, this.f6669a.a(c1227b), this.f6670b);
            if (h7 != nVar) {
                this.f6671c.c(new k(c1227b.e()), h7);
            }
        }
    }

    public static boolean b(Number number) {
        return ((number instanceof Double) || (number instanceof Float)) ? false : true;
    }

    public static Map c(Y3.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(aVar.a()));
        return hashMap;
    }

    public static Object d(Map map, E e7, Map map2) {
        if (!map.containsKey("increment")) {
            return null;
        }
        Object obj = map.get("increment");
        if (!(obj instanceof Number)) {
            return null;
        }
        Number number = (Number) obj;
        d4.n b7 = e7.b();
        if (!b7.B() || !(b7.getValue() instanceof Number)) {
            return number;
        }
        Number number2 = (Number) b7.getValue();
        if (b(number) && b(number2)) {
            long longValue = number.longValue();
            long longValue2 = number2.longValue();
            long j7 = longValue + longValue2;
            if (((longValue ^ j7) & (longValue2 ^ j7)) >= 0) {
                return Long.valueOf(j7);
            }
        }
        return Double.valueOf(number.doubleValue() + number2.doubleValue());
    }

    public static Object e(Object obj, E e7, Map map) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(".sv")) {
            return obj;
        }
        Object obj2 = map2.get(".sv");
        Object j7 = obj2 instanceof String ? j((String) obj2, map) : obj2 instanceof Map ? d((Map) obj2, e7, map) : null;
        return j7 == null ? obj : j7;
    }

    public static C0663b f(C0663b c0663b, x xVar, k kVar, Map map) {
        C0663b s7 = C0663b.s();
        Iterator it = c0663b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            s7 = s7.a((k) entry.getKey(), h((d4.n) entry.getValue(), new E.a(xVar, kVar.T((k) entry.getKey())), map));
        }
        return s7;
    }

    public static d4.n g(d4.n nVar, x xVar, k kVar, Map map) {
        return h(nVar, new E.a(xVar, kVar), map);
    }

    public static d4.n h(d4.n nVar, E e7, Map map) {
        Object value = nVar.t().getValue();
        Object e8 = e(value, e7.a(C1227b.j(".priority")), map);
        if (nVar.B()) {
            Object e9 = e(nVar.getValue(), e7, map);
            return (e9.equals(nVar.getValue()) && Y3.m.d(e8, value)) ? nVar : d4.o.b(e9, d4.r.d(e8));
        }
        if (nVar.isEmpty()) {
            return nVar;
        }
        d4.c cVar = (d4.c) nVar;
        t tVar = new t(cVar);
        cVar.M(new a(e7, map, tVar));
        return !tVar.b().t().equals(e8) ? tVar.b().J(d4.r.d(e8)) : tVar.b();
    }

    public static d4.n i(d4.n nVar, d4.n nVar2, Map map) {
        return h(nVar, new E.b(nVar2), map);
    }

    public static Object j(String str, Map map) {
        if ("timestamp".equals(str) && map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }
}
