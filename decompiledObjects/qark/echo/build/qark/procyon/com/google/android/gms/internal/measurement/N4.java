// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Modifier;
import java.util.TreeMap;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public abstract class N4
{
    public static final char[] a;
    
    static {
        Arrays.fill(a = new char[80], ' ');
    }
    
    public static String a(final I4 i4, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(i4, sb, 0);
        return sb.toString();
    }
    
    public static void b(int i, final StringBuilder sb) {
        while (i > 0) {
            final char[] a = N4.a;
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
    
    public static void c(final I4 i4, final StringBuilder sb, final int n) {
        final HashSet<String> set = new HashSet<String>();
        final HashMap<Object, Method> hashMap = new HashMap<Object, Method>();
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
        final Method[] declaredMethods = i4.getClass().getDeclaredMethods();
        final int length = declaredMethods.length;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = 3;
            if (n2 >= length) {
                break;
            }
            final Method method = declaredMethods[n2];
            if (!Modifier.isStatic(method.getModifiers()) && method.getName().length() >= 3) {
                if (method.getName().startsWith("set")) {
                    set.add(method.getName());
                }
                else if (Modifier.isPublic(method.getModifiers()) && method.getParameterTypes().length == 0) {
                    if (method.getName().startsWith("has")) {
                        hashMap.put(method.getName(), method);
                    }
                    else if (method.getName().startsWith("get")) {
                        treeMap.put(method.getName(), method);
                    }
                }
            }
            ++n2;
        }
        final Iterator<Map.Entry<String, Method>> iterator = treeMap.entrySet().iterator();
        int beginIndex = n3;
    Label_0443_Outer:
        while (iterator.hasNext()) {
            final Map.Entry<String, Method> entry = iterator.next();
            final String substring = entry.getKey().substring(beginIndex);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                final Method method2 = entry.getValue();
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    d(sb, n, substring.substring(0, substring.length() - 4), Y3.s(method2, i4, new Object[0]));
                    beginIndex = 3;
                    continue Label_0443_Outer;
                }
            }
            while (true) {
                Label_0448: {
                    if (!substring.endsWith("Map") || substring.equals("Map")) {
                        break Label_0448;
                    }
                    final Method method3 = entry.getValue();
                    if (method3 == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                        break Label_0448;
                    }
                    d(sb, n, substring.substring(0, substring.length() - 3), Y3.s(method3, i4, new Object[0]));
                    beginIndex = 3;
                    continue Label_0443_Outer;
                }
                final StringBuilder sb2 = new StringBuilder("set");
                sb2.append(substring);
                if (!set.contains(sb2.toString())) {
                    continue;
                }
                if (substring.endsWith("Bytes")) {
                    final String substring2 = substring.substring(0, substring.length() - 5);
                    final StringBuilder sb3 = new StringBuilder("get");
                    sb3.append(substring2);
                    if (treeMap.containsKey(sb3.toString())) {
                        continue;
                    }
                }
                final Method method4 = entry.getValue();
                final StringBuilder sb4 = new StringBuilder("has");
                sb4.append(substring);
                final Method method5 = hashMap.get(sb4.toString());
                if (method4 != null) {
                    final Object s = Y3.s(method4, i4, new Object[0]);
                    Label_0822: {
                        if (method5 == null) {
                            if (s instanceof Boolean) {
                                if (!(boolean)s) {
                                    continue;
                                }
                            }
                            else if (s instanceof Integer) {
                                if ((int)s == 0) {
                                    continue;
                                }
                            }
                            else if (s instanceof Float) {
                                if (Float.floatToRawIntBits((float)s) == 0) {
                                    continue;
                                }
                            }
                            else if (s instanceof Double) {
                                if (Double.doubleToRawLongBits((double)s) == 0L) {
                                    continue;
                                }
                            }
                            else {
                                Serializable p3;
                                if (s instanceof String) {
                                    p3 = "";
                                }
                                else if (s instanceof q3) {
                                    p3 = q3.p;
                                }
                                else if (s instanceof I4) {
                                    if (s == ((I4)s).b()) {
                                        continue;
                                    }
                                    break Label_0822;
                                }
                                else {
                                    if (s instanceof Enum && ((Enum)s).ordinal() == 0) {
                                        continue;
                                    }
                                    break Label_0822;
                                }
                                if (s.equals(p3)) {
                                    continue;
                                }
                            }
                        }
                        else if (!(boolean)Y3.s(method5, i4, new Object[0])) {
                            continue;
                        }
                    }
                    d(sb, n, substring, s);
                }
                continue;
            }
        }
        final v5 zzb = ((Y3)i4).zzb;
        if (zzb != null) {
            zzb.h(sb, n);
        }
    }
    
    public static void d(final StringBuilder sb, final int n, String string, final Object obj) {
        if (obj instanceof List) {
            final Iterator<Object> iterator = ((List)obj).iterator();
            while (iterator.hasNext()) {
                d(sb, n, string, iterator.next());
            }
            return;
        }
        if (obj instanceof Map) {
            final Iterator<Map.Entry<?, ?>> iterator2 = ((Map)obj).entrySet().iterator();
            while (iterator2.hasNext()) {
                d(sb, n, string, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        b(n, sb);
        if (!string.isEmpty()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(string.charAt(0)));
            for (int i = 1; i < string.length(); ++i) {
                final char char1 = string.charAt(i);
                if (Character.isUpperCase(char1)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(char1));
            }
            string = sb2.toString();
        }
        sb.append(string);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(s5.a(q3.k((String)obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof q3) {
            sb.append(": \"");
            sb.append(s5.a((q3)obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof Y3) {
            sb.append(" {");
            c((I4)obj, sb, n + 2);
            sb.append("\n");
            b(n, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            final Map.Entry entry = (Map.Entry)obj;
            final int n2 = n + 2;
            d(sb, n2, "key", entry.getKey());
            d(sb, n2, "value", entry.getValue());
            sb.append("\n");
            b(n, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }
}
