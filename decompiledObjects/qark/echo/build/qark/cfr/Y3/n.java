/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package Y3;

import Q3.d;
import V3.C;
import V3.k;
import Y3.m;
import d4.b;
import d4.o;
import d4.r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class n {
    public static final Pattern a = Pattern.compile((String)"[\\[\\]\\.#$]");
    public static final Pattern b = Pattern.compile((String)"[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static boolean a(String string2) {
        if (!string2.equals((Object)".info") && b.matcher((CharSequence)string2).find() && !string2.equals((Object)b.m().e()) && !string2.equals((Object)b.n().e())) {
            return false;
        }
        return true;
    }

    public static boolean b(String string2) {
        return a.matcher((CharSequence)string2).find() ^ true;
    }

    public static boolean c(String string2) {
        if (string2 != null && string2.length() > 0 && (string2.equals((Object)".value") || string2.equals((Object)".priority") || !string2.startsWith(".") && !b.matcher((CharSequence)string2).find())) {
            return true;
        }
        return false;
    }

    public static boolean d(k object) {
        if ((object = object.Z()) != null && object.e().startsWith(".")) {
            return false;
        }
        return true;
    }

    public static Map e(k object, Map object2) {
        Object object3;
        TreeMap treeMap = new TreeMap();
        Iterator iterator = object2.entrySet().iterator();
        while (iterator.hasNext()) {
            object2 = (Map.Entry)iterator.next();
            object3 = new k((String)object2.getKey());
            Object object4 = object2.getValue();
            C.g(object.T((k)object3), object4);
            object2 = !object3.isEmpty() ? object3.X().e() : "";
            if (!object2.equals((Object)".sv") && !object2.equals((Object)".value")) {
                object2 = object2.equals((Object)".priority") ? r.c((k)object3, object4) : o.a(object4);
                n.k(object4);
                treeMap.put(object3, object2);
                continue;
            }
            object = new StringBuilder();
            object.append("Path '");
            object.append(object3);
            object.append("' contains disallowed child name: ");
            object.append((String)object2);
            throw new d(object.toString());
        }
        object3 = treeMap.keySet().iterator();
        object = null;
        while (object3.hasNext()) {
            object2 = (k)object3.next();
            boolean bl = object == null || object.V((k)object2) < 0;
            m.f(bl);
            if (object != null && object.W((k)object2)) {
                treeMap = new StringBuilder();
                treeMap.append("Path '");
                treeMap.append(object);
                treeMap.append("' is an ancestor of '");
                treeMap.append(object2);
                treeMap.append("' in an update.");
                throw new d(treeMap.toString());
            }
            object = object2;
        }
        return treeMap;
    }

    public static void f(double d8) {
        if (!Double.isInfinite((double)d8) && !Double.isNaN((double)d8)) {
            return;
        }
        throw new d("Invalid value: Value cannot be NaN, Inf or -Inf.");
    }

    public static void g(String string2) {
        if (string2 != null) {
            if (n.a(string2)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid key: ");
            stringBuilder.append(string2);
            stringBuilder.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
            throw new d(stringBuilder.toString());
        }
    }

    public static void h(String string2) {
        if (n.b(string2)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid Firebase Database path: ");
        stringBuilder.append(string2);
        stringBuilder.append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'");
        throw new d(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void i(String string2) {
        String string3;
        block4 : {
            int n8;
            block3 : {
                block2 : {
                    if (!string2.startsWith(".info")) break block2;
                    n8 = 5;
                    break block3;
                }
                string3 = string2;
                if (!string2.startsWith("/.info")) break block4;
                n8 = 6;
            }
            string3 = string2.substring(n8);
        }
        n.h(string3);
    }

    public static void j(String string2) {
        if (n.c(string2)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid key: ");
        stringBuilder.append(string2);
        stringBuilder.append(". Keys must not contain '/', '.', '#', '$', '[', or ']'");
        throw new d(stringBuilder.toString());
    }

    public static void k(Object object) {
        if (object instanceof Map) {
            if ((object = (Map)object).containsKey((Object)".sv")) {
                return;
            }
            for (Map.Entry entry : object.entrySet()) {
                n.j((String)entry.getKey());
                n.k(entry.getValue());
            }
        } else if (object instanceof List) {
            object = ((List)object).iterator();
            while (object.hasNext()) {
                n.k(object.next());
            }
        } else if (object instanceof Double || object instanceof Float) {
            n.f((Double)object);
        }
    }

    public static void l(k k8) {
        if (n.d(k8)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid write location: ");
        stringBuilder.append(k8.toString());
        throw new d(stringBuilder.toString());
    }
}

