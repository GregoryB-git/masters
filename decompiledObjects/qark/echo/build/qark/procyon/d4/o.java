// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import java.util.Iterator;
import java.util.HashMap;
import Q3.d;
import java.util.List;
import java.util.Map;

public abstract class o
{
    public static n a(final Object o) {
        return b(o, r.a());
    }
    
    public static n b(Object o, n d) {
    Label_0423_Outer:
        while (true) {
            Object value = o;
            n n = d;
            while (true) {
                int i = 0;
                Label_0547: {
                    try {
                        if (o instanceof Map) {
                            final Map map = (Map)o;
                            if (map.containsKey(".priority")) {
                                d = r.d(map.get(".priority"));
                            }
                            value = o;
                            n = d;
                            if (map.containsKey(".value")) {
                                value = map.get(".value");
                                n = d;
                            }
                        }
                        if (value == null) {
                            return g.W();
                        }
                        if (value instanceof String) {
                            return new t((String)value, n);
                        }
                        if (value instanceof Long) {
                            return new l((Long)value, n);
                        }
                        if (value instanceof Integer) {
                            return new l((long)(int)value, n);
                        }
                        if (value instanceof Double) {
                            return new f((Double)value, n);
                        }
                        if (value instanceof Boolean) {
                            return new a((Boolean)value, n);
                        }
                        if (!(value instanceof Map) && !(value instanceof List)) {
                            o = new StringBuilder();
                            ((StringBuilder)o).append("Failed to parse node with class ");
                            ((StringBuilder)o).append(((Map<String, V>)value).getClass().toString());
                            throw new d(((StringBuilder)o).toString());
                        }
                        if (value instanceof Map) {
                            final Map<String, V> map2 = (Map<String, V>)value;
                            if (map2.containsKey(".sv")) {
                                return new e(map2, n);
                            }
                            final Map<b, n> map3 = new HashMap<b, n>(map2.size());
                            final Iterator<String> iterator = map2.keySet().iterator();
                            while (true) {
                                o = map3;
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                final String s = iterator.next();
                                if (s.startsWith(".")) {
                                    continue Label_0423_Outer;
                                }
                                final n a = a(map2.get(s));
                                if (a.isEmpty()) {
                                    continue Label_0423_Outer;
                                }
                                map3.put(b.j(s), a);
                            }
                        }
                        else {
                            final List<Object> list = (List<Object>)value;
                            final Map<b, n> map4 = new HashMap<b, n>(list.size());
                            i = 0;
                            o = map4;
                            if (i < list.size()) {
                                o = new StringBuilder();
                                ((StringBuilder)o).append("");
                                ((StringBuilder)o).append(i);
                                final String string = ((StringBuilder)o).toString();
                                final n a2 = a(list.get(i));
                                if (!a2.isEmpty()) {
                                    map4.put(b.j(string), a2);
                                }
                                break Label_0547;
                            }
                        }
                        if (((Map)o).isEmpty()) {
                            return g.W();
                        }
                        o = new c(S3.c.a.d((Map)o, c.r), n);
                        return (n)o;
                    }
                    catch (ClassCastException ex) {
                        throw new d("Failed to parse node", ex);
                    }
                }
                ++i;
                continue;
            }
        }
    }
    
    public static int c(final b b, final n n, final b b2, final n n2) {
        final int compareTo = n.compareTo(n2);
        if (compareTo != 0) {
            return compareTo;
        }
        return b.h(b2);
    }
}
