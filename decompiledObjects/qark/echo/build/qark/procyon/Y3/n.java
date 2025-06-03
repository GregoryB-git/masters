// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import java.util.List;
import java.util.Iterator;
import d4.o;
import d4.r;
import Q3.d;
import V3.C;
import java.util.TreeMap;
import java.util.Map;
import V3.k;
import d4.b;
import java.util.regex.Pattern;

public abstract class n
{
    public static final Pattern a;
    public static final Pattern b;
    
    static {
        a = Pattern.compile("[\\[\\]\\.#$]");
        b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");
    }
    
    public static boolean a(final String input) {
        return input.equals(".info") || !n.b.matcher(input).find() || input.equals(d4.b.m().e()) || input.equals(d4.b.n().e());
    }
    
    public static boolean b(final String input) {
        return n.a.matcher(input).find() ^ true;
    }
    
    public static boolean c(final String input) {
        return input != null && input.length() > 0 && (input.equals(".value") || input.equals(".priority") || (!input.startsWith(".") && !n.b.matcher(input).find()));
    }
    
    public static boolean d(final k k) {
        final b z = k.Z();
        return z == null || !z.e().startsWith(".");
    }
    
    public static Map e(k obj, final Map map) {
        final TreeMap<k, d4.n> treeMap = new TreeMap<k, d4.n>();
        for (final Map.Entry<K, Object> entry : map.entrySet()) {
            final k obj2 = new k((String)entry.getKey());
            final Object value = entry.getValue();
            C.g(obj.T(obj2), value);
            String e;
            if (!obj2.isEmpty()) {
                e = obj2.X().e();
            }
            else {
                e = "";
            }
            if (e.equals(".sv") || e.equals(".value")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Path '");
                sb.append(obj2);
                sb.append("' contains disallowed child name: ");
                sb.append(e);
                throw new d(sb.toString());
            }
            d4.n n;
            if (e.equals(".priority")) {
                n = r.c(obj2, value);
            }
            else {
                n = o.a(value);
            }
            k(value);
            treeMap.put(obj2, n);
        }
        final Iterator<k> iterator2 = treeMap.keySet().iterator();
        obj = null;
        while (iterator2.hasNext()) {
            final k obj3 = iterator2.next();
            m.f(obj == null || obj.V(obj3) < 0);
            if (obj != null && obj.W(obj3)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Path '");
                sb2.append(obj);
                sb2.append("' is an ancestor of '");
                sb2.append(obj3);
                sb2.append("' in an update.");
                throw new d(sb2.toString());
            }
            obj = obj3;
        }
        return treeMap;
    }
    
    public static void f(final double n) {
        if (!Double.isInfinite(n) && !Double.isNaN(n)) {
            return;
        }
        throw new d("Invalid value: Value cannot be NaN, Inf or -Inf.");
    }
    
    public static void g(final String str) {
        if (str == null) {
            return;
        }
        if (a(str)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid key: ");
        sb.append(str);
        sb.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
        throw new d(sb.toString());
    }
    
    public static void h(final String str) {
        if (b(str)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid Firebase Database path: ");
        sb.append(str);
        sb.append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
        throw new d(sb.toString());
    }
    
    public static void i(final String s) {
        String substring = null;
        Label_0017: {
            int beginIndex;
            if (s.startsWith(".info")) {
                beginIndex = 5;
            }
            else {
                substring = s;
                if (!s.startsWith("/.info")) {
                    break Label_0017;
                }
                beginIndex = 6;
            }
            substring = s.substring(beginIndex);
        }
        h(substring);
    }
    
    public static void j(final String str) {
        if (c(str)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid key: ");
        sb.append(str);
        sb.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
        throw new d(sb.toString());
    }
    
    public static void k(final Object o) {
        if (o instanceof Map) {
            final Map map = (Map)o;
            if (map.containsKey(".sv")) {
                return;
            }
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                j(entry.getKey());
                k(entry.getValue());
            }
        }
        else if (o instanceof List) {
            final Iterator<Object> iterator2 = ((List)o).iterator();
            while (iterator2.hasNext()) {
                k(iterator2.next());
            }
        }
        else if (o instanceof Double || o instanceof Float) {
            f((double)o);
        }
    }
    
    public static void l(final k k) {
        if (d(k)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid write location: ");
        sb.append(k.toString());
        throw new d(sb.toString());
    }
}
