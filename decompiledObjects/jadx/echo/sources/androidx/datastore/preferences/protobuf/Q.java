package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class Q {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof AbstractC0760g)) {
                return obj instanceof O ? obj == ((O) obj).b() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = AbstractC0760g.f8950p;
        }
        return obj.equals(obj2);
    }

    public static final void c(StringBuilder sb, int i7, String str, Object obj) {
        String a7;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            a7 = j0.c((String) obj);
        } else {
            if (!(obj instanceof AbstractC0760g)) {
                if (obj instanceof AbstractC0775w) {
                    sb.append(" {");
                    d((AbstractC0775w) obj, sb, i7 + 2);
                    sb.append("\n");
                    while (i8 < i7) {
                        sb.append(' ');
                        i8++;
                    }
                } else {
                    if (!(obj instanceof Map.Entry)) {
                        sb.append(": ");
                        sb.append(obj.toString());
                        return;
                    }
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i10 = i7 + 2;
                    c(sb, i10, "key", entry.getKey());
                    c(sb, i10, "value", entry.getValue());
                    sb.append("\n");
                    while (i8 < i7) {
                        sb.append(' ');
                        i8++;
                    }
                }
                sb.append("}");
                return;
            }
            sb.append(": \"");
            a7 = j0.a((AbstractC0760g) obj);
        }
        sb.append(a7);
        sb.append('\"');
    }

    public static void d(O o7, StringBuilder sb, int i7) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : o7.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i7, a(str2), AbstractC0775w.w(method2, o7, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i7, a(str3), AbstractC0775w.w(method3, o7, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object w7 = AbstractC0775w.w(method4, o7, new Object[0]);
                    if (method5 == null) {
                        if (!b(w7)) {
                            c(sb, i7, a(str4), w7);
                        }
                    } else if (((Boolean) AbstractC0775w.w(method5, o7, new Object[0])).booleanValue()) {
                        c(sb, i7, a(str4), w7);
                    }
                }
            }
        }
        m0 m0Var = ((AbstractC0775w) o7).unknownFields;
        if (m0Var != null) {
            m0Var.m(sb, i7);
        }
    }

    public static String e(O o7, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(o7, sb, 0);
        return sb.toString();
    }
}
