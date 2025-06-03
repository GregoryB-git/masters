/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.v5;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public abstract class N4 {
    public static final char[] a;

    static {
        char[] arrc = new char[80];
        a = arrc;
        Arrays.fill((char[])arrc, (char)' ');
    }

    public static String a(I4 i42, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string2);
        N4.c(i42, stringBuilder, 0);
        return stringBuilder.toString();
    }

    public static void b(int n8, StringBuilder stringBuilder) {
        while (n8 > 0) {
            char[] arrc = a;
            int n9 = n8 > arrc.length ? arrc.length : n8;
            stringBuilder.append(arrc, 0, n9);
            n8 -= n9;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void c(I4 object, StringBuilder stringBuilder, int n8) {
        int n9;
        Method method;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Object object2 = object.getClass().getDeclaredMethods();
        int n10 = object2.length;
        int n11 = 0;
        do {
            n9 = 3;
            if (n11 >= n10) break;
            method = object2[n11];
            if (!Modifier.isStatic((int)method.getModifiers()) && method.getName().length() >= 3) {
                if (method.getName().startsWith("set")) {
                    hashSet.add((Object)method.getName());
                } else if (Modifier.isPublic((int)method.getModifiers()) && method.getParameterTypes().length == 0) {
                    if (method.getName().startsWith("has")) {
                        hashMap.put((Object)method.getName(), (Object)method);
                    } else if (method.getName().startsWith("get")) {
                        treeMap.put((Object)method.getName(), (Object)method);
                    }
                }
            }
            ++n11;
        } while (true);
        method = treeMap.entrySet().iterator();
        n11 = n9;
        while (method.hasNext()) {
            block15 : {
                Object object3;
                String string2;
                block19 : {
                    StringBuilder stringBuilder2;
                    block17 : {
                        block25 : {
                            block24 : {
                                block23 : {
                                    block22 : {
                                        block21 : {
                                            block20 : {
                                                block18 : {
                                                    block16 : {
                                                        block14 : {
                                                            object2 = (Map.Entry)method.next();
                                                            string2 = ((String)object2.getKey()).substring(n11);
                                                            if (string2.endsWith("List") && !string2.endsWith("OrBuilderList") && !string2.equals((Object)"List") && (object3 = (Method)object2.getValue()) != null && object3.getReturnType().equals(List.class)) {
                                                                N4.d(stringBuilder, n8, string2.substring(0, string2.length() - 4), Y3.s((Method)object3, object, new Object[0]));
                                                                n11 = 3;
                                                                continue;
                                                            }
                                                            if (!string2.endsWith("Map") || string2.equals((Object)"Map") || (object3 = (Method)object2.getValue()) == null || !object3.getReturnType().equals(Map.class) || object3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic((int)object3.getModifiers())) break block14;
                                                            N4.d(stringBuilder, n8, string2.substring(0, string2.length() - 3), Y3.s((Method)object3, object, new Object[0]));
                                                            break block15;
                                                        }
                                                        object3 = new StringBuilder("set");
                                                        object3.append(string2);
                                                        if (!hashSet.contains((Object)object3.toString())) break block15;
                                                        if (!string2.endsWith("Bytes")) break block16;
                                                        object3 = string2.substring(0, string2.length() - 5);
                                                        stringBuilder2 = new StringBuilder("get");
                                                        stringBuilder2.append((String)object3);
                                                        if (treeMap.containsKey((Object)stringBuilder2.toString())) break block15;
                                                    }
                                                    object2 = (Method)object2.getValue();
                                                    object3 = new StringBuilder("has");
                                                    object3.append(string2);
                                                    stringBuilder2 = (Method)hashMap.get((Object)object3.toString());
                                                    if (object2 == null) break block15;
                                                    object3 = Y3.s((Method)object2, object, new Object[0]);
                                                    if (stringBuilder2 != null) break block17;
                                                    if (!(object3 instanceof Boolean)) break block18;
                                                    if (((Boolean)object3).booleanValue()) break block19;
                                                    break block15;
                                                }
                                                if (!(object3 instanceof Integer)) break block20;
                                                if ((Integer)object3 != 0) break block19;
                                                break block15;
                                            }
                                            if (!(object3 instanceof Float)) break block21;
                                            if (Float.floatToRawIntBits((float)((Float)object3).floatValue()) != 0) break block19;
                                            break block15;
                                        }
                                        if (!(object3 instanceof Double)) break block22;
                                        if (Double.doubleToRawLongBits((double)((Double)object3)) != 0L) break block19;
                                        break block15;
                                    }
                                    if (!(object3 instanceof String)) break block23;
                                    object2 = "";
                                    break block24;
                                }
                                if (!(object3 instanceof q3)) break block25;
                                object2 = q3.p;
                            }
                            boolean bl = object3.equals(object2);
                            if (bl) break block15;
                            break block19;
                        }
                        if (!(object3 instanceof I4 ? object3 == ((I4)object3).b() : object3 instanceof Enum && ((Enum)object3).ordinal() == 0)) break block19;
                        break block15;
                    }
                    if (!((Boolean)Y3.s((Method)stringBuilder2, object, new Object[0])).booleanValue()) break block15;
                }
                N4.d(stringBuilder, n8, string2, object3);
            }
            n11 = 3;
        }
        object = ((Y3)object).zzb;
        if (object != null) {
            object.h(stringBuilder, n8);
        }
    }

    public static void d(StringBuilder stringBuilder, int n8, String string2, Object object) {
        int n9;
        if (object instanceof List) {
            object = ((List)object).iterator();
            while (object.hasNext()) {
                N4.d(stringBuilder, n8, string2, object.next());
            }
            return;
        }
        if (object instanceof Map) {
            object = ((Map)object).entrySet().iterator();
            while (object.hasNext()) {
                N4.d(stringBuilder, n8, string2, (Object)((Map.Entry)object.next()));
            }
            return;
        }
        stringBuilder.append('\n');
        N4.b(n8, stringBuilder);
        if (!string2.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(Character.toLowerCase((char)string2.charAt(0)));
            for (n9 = 1; n9 < string2.length(); ++n9) {
                char c8 = string2.charAt(n9);
                if (Character.isUpperCase((char)c8)) {
                    stringBuilder2.append("_");
                }
                stringBuilder2.append(Character.toLowerCase((char)c8));
            }
            string2 = stringBuilder2.toString();
        }
        stringBuilder.append(string2);
        if (object instanceof String) {
            stringBuilder.append(": \"");
            stringBuilder.append(s5.a(q3.k((String)object)));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof q3) {
            stringBuilder.append(": \"");
            stringBuilder.append(s5.a((q3)object));
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof Y3) {
            stringBuilder.append(" {");
            N4.c((Y3)object, stringBuilder, n8 + 2);
            stringBuilder.append("\n");
            N4.b(n8, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        if (object instanceof Map.Entry) {
            stringBuilder.append(" {");
            string2 = (Map.Entry)object;
            n9 = n8 + 2;
            N4.d(stringBuilder, n9, "key", string2.getKey());
            N4.d(stringBuilder, n9, "value", string2.getValue());
            stringBuilder.append("\n");
            N4.b(n8, stringBuilder);
            stringBuilder.append("}");
            return;
        }
        stringBuilder.append(": ");
        stringBuilder.append(object);
    }
}

