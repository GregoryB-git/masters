package Y3;

import V3.C;
import d4.C1227b;
import d4.o;
import d4.r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7568a = Pattern.compile("[\\[\\]\\.#$]");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7569b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static boolean a(String str) {
        return str.equals(".info") || !f7569b.matcher(str).find() || str.equals(C1227b.m().e()) || str.equals(C1227b.n().e());
    }

    public static boolean b(String str) {
        return !f7568a.matcher(str).find();
    }

    public static boolean c(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || f7569b.matcher(str).find()));
    }

    public static boolean d(V3.k kVar) {
        C1227b Z6 = kVar.Z();
        return Z6 == null || !Z6.e().startsWith(".");
    }

    public static Map e(V3.k kVar, Map map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : map.entrySet()) {
            V3.k kVar2 = new V3.k((String) entry.getKey());
            Object value = entry.getValue();
            C.g(kVar.T(kVar2), value);
            String e7 = !kVar2.isEmpty() ? kVar2.X().e() : "";
            if (e7.equals(".sv") || e7.equals(".value")) {
                throw new Q3.d("Path '" + kVar2 + "' contains disallowed child name: " + e7);
            }
            d4.n c7 = e7.equals(".priority") ? r.c(kVar2, value) : o.a(value);
            k(value);
            treeMap.put(kVar2, c7);
        }
        V3.k kVar3 = null;
        for (V3.k kVar4 : treeMap.keySet()) {
            m.f(kVar3 == null || kVar3.compareTo(kVar4) < 0);
            if (kVar3 != null && kVar3.W(kVar4)) {
                throw new Q3.d("Path '" + kVar3 + "' is an ancestor of '" + kVar4 + "' in an update.");
            }
            kVar3 = kVar4;
        }
        return treeMap;
    }

    public static void f(double d7) {
        if (Double.isInfinite(d7) || Double.isNaN(d7)) {
            throw new Q3.d("Invalid value: Value cannot be NaN, Inf or -Inf.");
        }
    }

    public static void g(String str) {
        if (str == null || a(str)) {
            return;
        }
        throw new Q3.d("Invalid key: " + str + ". Keys must not contain '/', '.', '#', '$', '[', or ']'");
    }

    public static void h(String str) {
        if (b(str)) {
            return;
        }
        throw new Q3.d("Invalid Firebase Database path: " + str + ". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
    }

    public static void i(String str) {
        int i7;
        if (!str.startsWith(".info")) {
            i7 = str.startsWith("/.info") ? 6 : 5;
            h(str);
        }
        str = str.substring(i7);
        h(str);
    }

    public static void j(String str) {
        if (c(str)) {
            return;
        }
        throw new Q3.d("Invalid key: " + str + ". Keys must not contain '/', '.', '#', '$', '[', or ']'");
    }

    public static void k(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.containsKey(".sv")) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                j((String) entry.getKey());
                k(entry.getValue());
            }
            return;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                k(it.next());
            }
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            f(((Double) obj).doubleValue());
        }
    }

    public static void l(V3.k kVar) {
        if (d(kVar)) {
            return;
        }
        throw new Q3.d("Invalid write location: " + kVar.toString());
    }
}
