/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package V3;

import V3.E;
import V3.b;
import V3.k;
import V3.t;
import V3.x;
import Y3.a;
import Y3.m;
import d4.c;
import d4.n;
import d4.o;
import d4.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class s {
    public static boolean b(Number number) {
        if (!(number instanceof Double) && !(number instanceof Float)) {
            return true;
        }
        return false;
    }

    public static Map c(a a8) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"timestamp", (Object)a8.a());
        return hashMap;
    }

    public static Object d(Map object, E object2, Map map) {
        if (!object.containsKey((Object)"increment")) {
            return null;
        }
        if (!((object = object.get((Object)"increment")) instanceof Number)) {
            return null;
        }
        map = (Number)object;
        object2 = object2.b();
        object = map;
        if (object2.B()) {
            long l8;
            long l9;
            long l10;
            if (!(object2.getValue() instanceof Number)) {
                return map;
            }
            object = (Number)object2.getValue();
            if (s.b((Number)map) && s.b((Number)object) && (((l8 = map.longValue()) ^ (l10 = l8 + (l9 = object.longValue()))) & (l9 ^ l10)) >= 0L) {
                return l10;
            }
            object = map.doubleValue() + object.doubleValue();
        }
        return object;
    }

    public static Object e(Object object, E object2, Map map) {
        if (!(object instanceof Map)) {
            return object;
        }
        Object object3 = (Map)object;
        if (!object3.containsKey((Object)".sv")) {
            return object;
        }
        object2 = (object3 = object3.get((Object)".sv")) instanceof String ? s.j((String)object3, map) : (object3 instanceof Map ? s.d((Map)object3, (E)object2, map) : null);
        if (object2 == null) {
            return object;
        }
        return object2;
    }

    public static b f(b b8, x x8, k k8, Map map) {
        b b9 = b.s();
        Iterator iterator = b8.iterator();
        b8 = b9;
        while (iterator.hasNext()) {
            b9 = (Map.Entry)iterator.next();
            E.a a8 = new E.a(x8, k8.T((k)b9.getKey()));
            b8 = b8.a((k)b9.getKey(), s.h((n)b9.getValue(), a8, map));
        }
        return b8;
    }

    public static n g(n n8, x x8, k k8, Map map) {
        return s.h(n8, new E.a(x8, k8), map);
    }

    public static n h(n n8, E object, final Map map) {
        Object object2 = n8.t().getValue();
        Object object3 = s.e(object2, object.a(d4.b.j(".priority")), map);
        if (n8.B()) {
            object = s.e(n8.getValue(), (E)object, map);
            if (object.equals(n8.getValue()) && m.d(object3, object2)) {
                return n8;
            }
            return o.b(object, r.d(object3));
        }
        if (n8.isEmpty()) {
            return n8;
        }
        n8 = (c)n8;
        object2 = new t(n8);
        n8.M(new c.c((t)object2){
            public final /* synthetic */ t c;
            {
                this.c = t8;
            }

            @Override
            public void b(d4.b b8, n n8) {
                n n9 = s.h(n8, E.this.a(b8), map);
                if (n9 != n8) {
                    this.c.c(new k(b8.e()), n9);
                }
            }
        });
        if (!object2.b().t().equals(object3)) {
            return object2.b().J(r.d(object3));
        }
        return object2.b();
    }

    public static n i(n n8, n n9, Map map) {
        return s.h(n8, new E.b(n9), map);
    }

    public static Object j(String string2, Map map) {
        if ("timestamp".equals((Object)string2) && map.containsKey((Object)string2)) {
            return map.get((Object)string2);
        }
        return null;
    }

}

