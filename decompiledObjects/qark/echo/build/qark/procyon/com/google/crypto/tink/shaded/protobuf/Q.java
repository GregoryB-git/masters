// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.TreeMap;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.io.Serializable;
import java.util.Arrays;

public abstract class Q
{
    public static final char[] a;
    
    static {
        Arrays.fill(a = new char[80], ' ');
    }
    
    public static void a(int i, final StringBuilder sb) {
        while (i > 0) {
            final char[] a = Q.a;
            int length;
            if (i > a.length) {
                length = a.length;
            }
            else {
                length = i;
            }
            sb.append(a, 0, length);
            i -= length;
        }
    }
    
    public static boolean b(final Object o) {
        if (o instanceof Boolean) {
            return (boolean)o ^ true;
        }
        if (o instanceof Integer) {
            return (int)o == 0;
        }
        if (o instanceof Float) {
            return Float.floatToRawIntBits((float)o) == 0;
        }
        if (o instanceof Double) {
            return Double.doubleToRawLongBits((double)o) == 0L;
        }
        Serializable p;
        if (o instanceof String) {
            p = "";
        }
        else if (o instanceof h) {
            p = h.p;
        }
        else {
            if (o instanceof O) {
                return o == ((O)o).b();
            }
            return o instanceof Enum && ((Enum)o).ordinal() == 0;
        }
        return o.equals(p);
    }
    
    public static String c(final String s) {
        if (s.isEmpty()) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(s.charAt(0)));
        for (int i = 1; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(char1));
        }
        return sb.toString();
    }
    
    public static void d(final StringBuilder sb, final int n, String str, final Object obj) {
        if (obj instanceof List) {
            final Iterator<Object> iterator = ((List)obj).iterator();
            while (iterator.hasNext()) {
                d(sb, n, str, iterator.next());
            }
            return;
        }
        if (obj instanceof Map) {
            final Iterator<Map.Entry<?, ?>> iterator2 = ((Map)obj).entrySet().iterator();
            while (iterator2.hasNext()) {
                d(sb, n, str, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        a(n, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            str = i0.c((String)obj);
        }
        else {
            if (!(obj instanceof h)) {
                if (obj instanceof x) {
                    sb.append(" {");
                    e((O)obj, sb, n + 2);
                }
                else {
                    if (!(obj instanceof Map.Entry)) {
                        sb.append(": ");
                        sb.append(obj);
                        return;
                    }
                    sb.append(" {");
                    final Map.Entry entry = (Map.Entry)obj;
                    final int n2 = n + 2;
                    d(sb, n2, "key", entry.getKey());
                    d(sb, n2, "value", entry.getValue());
                }
                sb.append("\n");
                a(n, sb);
                sb.append("}");
                return;
            }
            sb.append(": \"");
            str = i0.a((h)obj);
        }
        sb.append(str);
        sb.append('\"');
    }
    
    public static void e(final O o, final StringBuilder sb, final int n) {
        final HashSet<String> set = new HashSet<String>();
        final HashMap<Object, Method> hashMap = new HashMap<Object, Method>();
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
        final Method[] declaredMethods = o.getClass().getDeclaredMethods();
        final int length = declaredMethods.length;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = 3;
            if (n2 >= length) {
                break;
            }
            final Method method = declaredMethods[n2];
            if (!Modifier.isStatic(method.getModifiers())) {
                if (method.getName().length() >= 3) {
                    if (method.getName().startsWith("set")) {
                        set.add(method.getName());
                    }
                    else if (Modifier.isPublic(method.getModifiers())) {
                        if (method.getParameterTypes().length == 0) {
                            if (method.getName().startsWith("has")) {
                                hashMap.put(method.getName(), method);
                            }
                            else if (method.getName().startsWith("get")) {
                                treeMap.put(method.getName(), method);
                            }
                        }
                    }
                }
            }
            ++n2;
        }
        final Iterator<Map.Entry<String, Method>> iterator = treeMap.entrySet().iterator();
        int beginIndex = n3;
    Label_0459_Outer:
        while (iterator.hasNext()) {
            final Map.Entry<String, Method> entry = iterator.next();
            final String substring = entry.getKey().substring(beginIndex);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                final Method method2 = entry.getValue();
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    d(sb, n, substring.substring(0, substring.length() - 4), x.A(method2, o, new Object[0]));
                    beginIndex = 3;
                    continue Label_0459_Outer;
                }
            }
            while (true) {
                Label_0464: {
                    if (!substring.endsWith("Map") || substring.equals("Map")) {
                        break Label_0464;
                    }
                    final Method method3 = entry.getValue();
                    if (method3 == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                        break Label_0464;
                    }
                    d(sb, n, substring.substring(0, substring.length() - 3), x.A(method3, o, new Object[0]));
                    beginIndex = 3;
                    continue Label_0459_Outer;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("set");
                sb2.append(substring);
                Label_0504: {
                    if (set.contains(sb2.toString())) {
                        if (substring.endsWith("Bytes")) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("get");
                            sb3.append(substring.substring(0, substring.length() - 5));
                            if (treeMap.containsKey(sb3.toString())) {
                                break Label_0504;
                            }
                        }
                        final Method method4 = entry.getValue();
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("has");
                        sb4.append(substring);
                        final Method method5 = hashMap.get(sb4.toString());
                        if (method4 != null) {
                            final Object a = x.A(method4, o, new Object[0]);
                            if (method5 == null) {
                                if (b(a)) {
                                    continue;
                                }
                            }
                            else if (!(boolean)x.A(method5, o, new Object[0])) {
                                continue;
                            }
                            d(sb, n, substring, a);
                        }
                    }
                }
                continue;
            }
        }
        final l0 unknownFields = ((x)o).unknownFields;
        if (unknownFields != null) {
            unknownFields.m(sb, n);
        }
    }
    
    public static String f(final O o, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(o, sb, 0);
        return sb.toString();
    }
}
