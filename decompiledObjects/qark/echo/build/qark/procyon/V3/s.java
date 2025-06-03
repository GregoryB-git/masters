// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import d4.c;
import d4.o;
import d4.r;
import Y3.m;
import java.util.Iterator;
import java.util.HashMap;
import Y3.a;
import java.util.Map;
import d4.n;

public abstract class s
{
    public static boolean b(final Number n) {
        return !(n instanceof Double) && !(n instanceof Float);
    }
    
    public static Map c(final a a) {
        final HashMap<String, Long> hashMap = new HashMap<String, Long>();
        hashMap.put("timestamp", a.a());
        return hashMap;
    }
    
    public static Object d(final Map map, final E e, final Map map2) {
        if (!map.containsKey("increment")) {
            return null;
        }
        final Number value = map.get("increment");
        if (!(value instanceof Number)) {
            return null;
        }
        final Number n = value;
        final n b = e.b();
        Number value2 = n;
        if (b.B()) {
            if (!(b.getValue() instanceof Number)) {
                return n;
            }
            final Number n2 = (Number)b.getValue();
            if (b(n) && b(n2)) {
                final long longValue = n.longValue();
                final long longValue2 = n2.longValue();
                final long l = longValue + longValue2;
                if (((longValue ^ l) & (longValue2 ^ l)) >= 0L) {
                    return l;
                }
            }
            value2 = n.doubleValue() + n2.doubleValue();
        }
        return value2;
    }
    
    public static Object e(final Object o, final E e, final Map map) {
        if (!(o instanceof Map)) {
            return o;
        }
        final Map map2 = (Map)o;
        if (!map2.containsKey(".sv")) {
            return o;
        }
        final String value = map2.get(".sv");
        Object o2;
        if (value instanceof String) {
            o2 = j(value, map);
        }
        else if (value instanceof Map) {
            o2 = d((Map)value, e, map);
        }
        else {
            o2 = null;
        }
        if (o2 == null) {
            return o;
        }
        return o2;
    }
    
    public static b f(b a, final x x, final k k, final Map map) {
        final b s = b.s();
        final Iterator iterator = a.iterator();
        a = s;
        while (iterator.hasNext()) {
            final Map.Entry<k, V> entry = iterator.next();
            a = a.a(entry.getKey(), h((n)entry.getValue(), new E.a(x, k.T(entry.getKey())), map));
        }
        return a;
    }
    
    public static n g(final n n, final x x, final k k, final Map map) {
        return h(n, new E.a(x, k), map);
    }
    
    public static n h(final n n, final E e, final Map map) {
        final Object value = n.t().getValue();
        final Object e2 = e(value, e.a(d4.b.j(".priority")), map);
        if (n.B()) {
            final Object e3 = e(n.getValue(), e, map);
            if (e3.equals(n.getValue()) && m.d(e2, value)) {
                return n;
            }
            return o.b(e3, r.d(e2));
        }
        else {
            if (n.isEmpty()) {
                return n;
            }
            final c c = (c)n;
            final t t = new t(c);
            c.M((c.c)new c.c() {
                @Override
                public void b(final d4.b b, final n n) {
                    final n a = h(n, e.a(b), map);
                    if (a != n) {
                        t.c(new k(b.e()), a);
                    }
                }
            });
            if (!t.b().t().equals(e2)) {
                return t.b().J(r.d(e2));
            }
            return t.b();
        }
    }
    
    public static n i(final n n, final n n2, final Map map) {
        return h(n, new E.b(n2), map);
    }
    
    public static Object j(final String anObject, final Map map) {
        if ("timestamp".equals(anObject) && map.containsKey(anObject)) {
            return map.get(anObject);
        }
        return null;
    }
}
