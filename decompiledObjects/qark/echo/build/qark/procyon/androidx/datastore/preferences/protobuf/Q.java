// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.util.TreeSet;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.Serializable;

public abstract class Q
{
    public static final String a(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(char1));
        }
        return sb.toString();
    }
    
    public static boolean b(final Object o) {
        if (o instanceof Boolean) {
            return (boolean)o ^ true;
        }
        if (o instanceof Integer) {
            return (int)o == 0;
        }
        if (o instanceof Float) {
            return (float)o == 0.0f;
        }
        if (o instanceof Double) {
            return (double)o == 0.0;
        }
        Serializable p;
        if (o instanceof String) {
            p = "";
        }
        else if (o instanceof g) {
            p = g.p;
        }
        else {
            if (o instanceof O) {
                return o == ((O)o).b();
            }
            return o instanceof Enum && ((Enum)o).ordinal() == 0;
        }
        return o.equals(p);
    }
    
    public static final void c(final StringBuilder sb, final int n, String s, final Object o) {
        if (o instanceof List) {
            final Iterator<Object> iterator = (Iterator<Object>)((List)o).iterator();
            while (iterator.hasNext()) {
                c(sb, n, s, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator<Map.Entry<?, ?>> iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                c(sb, n, s, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        sb.append(s);
        if (o instanceof String) {
            sb.append(": \"");
            s = j0.c((String)o);
        }
        else {
            if (!(o instanceof g)) {
                if (o instanceof w) {
                    sb.append(" {");
                    d((O)o, sb, n + 2);
                    sb.append("\n");
                    for (int j = n3; j < n; ++j) {
                        sb.append(' ');
                    }
                }
                else {
                    if (!(o instanceof Map.Entry)) {
                        sb.append(": ");
                        sb.append(o.toString());
                        return;
                    }
                    sb.append(" {");
                    final Map.Entry entry = (Map.Entry)o;
                    final int n4 = n + 2;
                    c(sb, n4, "key", entry.getKey());
                    c(sb, n4, "value", entry.getValue());
                    sb.append("\n");
                    for (int k = n2; k < n; ++k) {
                        sb.append(' ');
                    }
                }
                sb.append("}");
                return;
            }
            sb.append(": \"");
            s = j0.a((g)o);
        }
        sb.append(s);
        sb.append('\"');
    }
    
    public static void d(final O o, final StringBuilder sb, final int n) {
        final HashMap<Object, Method> hashMap = new HashMap<Object, Method>();
        final HashMap<String, Method> hashMap2 = new HashMap<String, Method>();
        final TreeSet<String> set = new TreeSet<String>();
        final Method[] declaredMethods = o.getClass().getDeclaredMethods();
        for (int length = declaredMethods.length, i = 0; i < length; ++i) {
            final Method method = declaredMethods[i];
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    set.add(method.getName());
                }
            }
        }
        for (final String s : set) {
            final String replaceFirst = s.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceFirst.substring(0, 1).toLowerCase());
                sb2.append(replaceFirst.substring(1, replaceFirst.length() - 4));
                final String string = sb2.toString();
                final Method method2 = hashMap.get(s);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, n, a(string), w.w(method2, o, new Object[0]));
                    continue;
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(replaceFirst.substring(0, 1).toLowerCase());
                sb3.append(replaceFirst.substring(1, replaceFirst.length() - 3));
                final String string2 = sb3.toString();
                final Method method3 = hashMap.get(s);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, n, a(string2), w.w(method3, o, new Object[0]));
                    continue;
                }
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("set");
            sb4.append(replaceFirst);
            if (hashMap2.get(sb4.toString()) == null) {
                continue;
            }
            if (replaceFirst.endsWith("Bytes")) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("get");
                sb5.append(replaceFirst.substring(0, replaceFirst.length() - 5));
                if (hashMap.containsKey(sb5.toString())) {
                    continue;
                }
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(replaceFirst.substring(0, 1).toLowerCase());
            sb6.append(replaceFirst.substring(1));
            final String string3 = sb6.toString();
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("get");
            sb7.append(replaceFirst);
            final Method method4 = hashMap.get(sb7.toString());
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("has");
            sb8.append(replaceFirst);
            final Method method5 = hashMap.get(sb8.toString());
            if (method4 == null) {
                continue;
            }
            final Object w = androidx.datastore.preferences.protobuf.w.w(method4, o, new Object[0]);
            if (method5 == null) {
                if (b(w)) {
                    continue;
                }
            }
            else if (!(boolean)androidx.datastore.preferences.protobuf.w.w(method5, o, new Object[0])) {
                continue;
            }
            c(sb, n, a(string3), w);
        }
        final m0 unknownFields = ((w)o).unknownFields;
        if (unknownFields != null) {
            unknownFields.m(sb, n);
        }
    }
    
    public static String e(final O o, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(o, sb, 0);
        return sb.toString();
    }
}
