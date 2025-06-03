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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i0;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.x;
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

public abstract class Q {
    public static final char[] a;

    static {
        char[] arrc = new char[80];
        a = arrc;
        Arrays.fill((char[])arrc, (char)' ');
    }

    public static void a(int n8, StringBuilder stringBuilder) {
        while (n8 > 0) {
            char[] arrc = a;
            int n9 = n8 > arrc.length ? arrc.length : n8;
            stringBuilder.append(arrc, 0, n9);
            n8 -= n9;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(Object object) {
        Object object2;
        if (object instanceof Boolean) {
            return (Boolean)object ^ true;
        }
        if (object instanceof Integer) {
            if ((Integer)object != 0) return false;
            return true;
        }
        if (object instanceof Float) {
            if (Float.floatToRawIntBits((float)((Float)object).floatValue()) != 0) return false;
            return true;
        }
        if (object instanceof Double) {
            if (Double.doubleToRawLongBits((double)((Double)object)) != 0L) return false;
            return true;
        }
        if (object instanceof String) {
            object2 = "";
            do {
                return object.equals(object2);
                break;
            } while (true);
        }
        if (object instanceof h) {
            object2 = h.p;
            return object.equals(object2);
        }
        if (object instanceof O) {
            if (object != ((O)object).b()) return false;
            return true;
        }
        if (!(object instanceof Enum)) return false;
        if (((Enum)object).ordinal() != 0) return false;
        return true;
    }

    public static String c(String string2) {
        if (string2.isEmpty()) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toLowerCase((char)string2.charAt(0)));
        for (int i8 = 1; i8 < string2.length(); ++i8) {
            char c8 = string2.charAt(i8);
            if (Character.isUpperCase((char)c8)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase((char)c8));
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d(StringBuilder stringBuilder, int n8, String string2, Object object) {
        block14 : {
            block13 : {
                block12 : {
                    if (object instanceof List) {
                        object = ((List)object).iterator();
                        do {
                            if (!object.hasNext()) {
                                return;
                            }
                            Q.d(stringBuilder, n8, string2, object.next());
                        } while (true);
                    }
                    if (object instanceof Map) {
                        object = ((Map)object).entrySet().iterator();
                        do {
                            if (!object.hasNext()) {
                                return;
                            }
                            Q.d(stringBuilder, n8, string2, (Object)((Map.Entry)object.next()));
                        } while (true);
                    }
                    stringBuilder.append('\n');
                    Q.a(n8, stringBuilder);
                    stringBuilder.append(Q.c(string2));
                    if (!(object instanceof String)) break block12;
                    stringBuilder.append(": \"");
                    string2 = i0.c((String)object);
                    break block13;
                }
                if (!(object instanceof h)) break block14;
                stringBuilder.append(": \"");
                string2 = i0.a((h)object);
            }
            stringBuilder.append(string2);
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof x) {
            stringBuilder.append(" {");
            Q.e((x)object, stringBuilder, n8 + 2);
        } else {
            if (!(object instanceof Map.Entry)) {
                stringBuilder.append(": ");
                stringBuilder.append(object);
                return;
            }
            stringBuilder.append(" {");
            string2 = (Map.Entry)object;
            int n9 = n8 + 2;
            Q.d(stringBuilder, n9, "key", string2.getKey());
            Q.d(stringBuilder, n9, "value", string2.getValue());
        }
        stringBuilder.append("\n");
        Q.a(n8, stringBuilder);
        stringBuilder.append("}");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void e(O object, StringBuilder stringBuilder, int n8) {
        Object object2;
        int n9;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Iterator iterator = object.getClass().getDeclaredMethods();
        int n10 = iterator.length;
        int n11 = 0;
        do {
            n9 = 3;
            if (n11 >= n10) break;
            object2 = iterator[n11];
            if (!Modifier.isStatic((int)object2.getModifiers()) && object2.getName().length() >= 3) {
                if (object2.getName().startsWith("set")) {
                    hashSet.add((Object)object2.getName());
                } else if (Modifier.isPublic((int)object2.getModifiers()) && object2.getParameterTypes().length == 0) {
                    if (object2.getName().startsWith("has")) {
                        hashMap.put((Object)object2.getName(), object2);
                    } else if (object2.getName().startsWith("get")) {
                        treeMap.put((Object)object2.getName(), object2);
                    }
                }
            }
            ++n11;
        } while (true);
        iterator = treeMap.entrySet().iterator();
        n11 = n9;
        while (iterator.hasNext()) {
            block17 : {
                Object object3;
                StringBuilder stringBuilder2;
                block18 : {
                    block16 : {
                        object3 = (Map.Entry)iterator.next();
                        object2 = ((String)object3.getKey()).substring(n11);
                        if (object2.endsWith("List") && !object2.endsWith("OrBuilderList") && !object2.equals((Object)"List") && (stringBuilder2 = (Method)object3.getValue()) != null && stringBuilder2.getReturnType().equals(List.class)) {
                            Q.d(stringBuilder, n8, object2.substring(0, object2.length() - 4), x.A((Method)stringBuilder2, object, new Object[0]));
                            n11 = 3;
                            continue;
                        }
                        if (!object2.endsWith("Map") || object2.equals((Object)"Map") || (stringBuilder2 = (Method)object3.getValue()) == null || !stringBuilder2.getReturnType().equals(Map.class) || stringBuilder2.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic((int)stringBuilder2.getModifiers())) break block16;
                        Q.d(stringBuilder, n8, object2.substring(0, object2.length() - 3), x.A((Method)stringBuilder2, object, new Object[0]));
                        break block17;
                    }
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("set");
                    stringBuilder2.append((String)object2);
                    if (!hashSet.contains((Object)stringBuilder2.toString())) break block17;
                    if (!object2.endsWith("Bytes")) break block18;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("get");
                    stringBuilder2.append(object2.substring(0, object2.length() - 5));
                    if (treeMap.containsKey((Object)stringBuilder2.toString())) break block17;
                }
                object3 = (Method)object3.getValue();
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("has");
                stringBuilder2.append((String)object2);
                stringBuilder2 = (Method)hashMap.get((Object)stringBuilder2.toString());
                if (object3 != null) {
                    object3 = x.A((Method)object3, object, new Object[0]);
                    if (stringBuilder2 == null ? !Q.b(object3) : (Boolean)x.A((Method)stringBuilder2, object, new Object[0]) != false) {
                        Q.d(stringBuilder, n8, (String)object2, object3);
                    }
                }
            }
            n11 = 3;
        }
        object = ((x)object).unknownFields;
        if (object != null) {
            object.m(stringBuilder, n8);
        }
    }

    public static String f(O o8, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string2);
        Q.e(o8, stringBuilder, 0);
        return stringBuilder.toString();
    }
}

