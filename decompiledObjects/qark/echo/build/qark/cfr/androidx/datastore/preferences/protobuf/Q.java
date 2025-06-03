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
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeSet
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.g;
import androidx.datastore.preferences.protobuf.j0;
import androidx.datastore.preferences.protobuf.m0;
import androidx.datastore.preferences.protobuf.w;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public abstract class Q {
    public static final String a(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < string2.length(); ++i8) {
            char c8 = string2.charAt(i8);
            if (Character.isUpperCase((char)c8)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase((char)c8));
        }
        return stringBuilder.toString();
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
            if (((Float)object).floatValue() != 0.0f) return false;
            return true;
        }
        if (object instanceof Double) {
            if ((Double)object != 0.0) return false;
            return true;
        }
        if (object instanceof String) {
            object2 = "";
            do {
                return object.equals(object2);
                break;
            } while (true);
        }
        if (object instanceof g) {
            object2 = g.p;
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

    /*
     * Enabled aggressive block sorting
     */
    public static final void c(StringBuilder stringBuilder, int n8, String string2, Object object) {
        int n9;
        block17 : {
            block16 : {
                block15 : {
                    if (object instanceof List) {
                        object = ((List)object).iterator();
                        do {
                            if (!object.hasNext()) {
                                return;
                            }
                            Q.c(stringBuilder, n8, string2, object.next());
                        } while (true);
                    }
                    if (object instanceof Map) {
                        object = ((Map)object).entrySet().iterator();
                        do {
                            if (!object.hasNext()) {
                                return;
                            }
                            Q.c(stringBuilder, n8, string2, (Object)((Map.Entry)object.next()));
                        } while (true);
                    }
                    stringBuilder.append('\n');
                    int n10 = 0;
                    int n11 = 0;
                    for (n9 = 0; n9 < n8; ++n9) {
                        stringBuilder.append(' ');
                    }
                    stringBuilder.append(string2);
                    if (!(object instanceof String)) break block15;
                    stringBuilder.append(": \"");
                    string2 = j0.c((String)object);
                    break block16;
                }
                if (!(object instanceof g)) break block17;
                stringBuilder.append(": \"");
                string2 = j0.a((g)object);
            }
            stringBuilder.append(string2);
            stringBuilder.append('\"');
            return;
        }
        if (object instanceof w) {
            stringBuilder.append(" {");
            Q.d((w)object, stringBuilder, n8 + 2);
            stringBuilder.append("\n");
            for (n9 = n11; n9 < n8; ++n9) {
                stringBuilder.append(' ');
            }
        } else {
            if (!(object instanceof Map.Entry)) {
                stringBuilder.append(": ");
                stringBuilder.append(object.toString());
                return;
            }
            stringBuilder.append(" {");
            string2 = (Map.Entry)object;
            n9 = n8 + 2;
            Q.c(stringBuilder, n9, "key", string2.getKey());
            Q.c(stringBuilder, n9, "value", string2.getValue());
            stringBuilder.append("\n");
            for (n9 = n10; n9 < n8; ++n9) {
                stringBuilder.append(' ');
            }
        }
        stringBuilder.append("}");
    }

    public static void d(O object, StringBuilder stringBuilder, int n8) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method object2 : object.getClass().getDeclaredMethods()) {
            hashMap2.put((Object)object2.getName(), (Object)object2);
            if (object2.getParameterTypes().length != 0) continue;
            hashMap.put((Object)object2.getName(), (Object)object2);
            if (!object2.getName().startsWith("get")) continue;
            treeSet.add((Object)object2.getName());
        }
        for (String string2 : treeSet) {
            Object object2;
            Method method;
            Object object4 = string2.replaceFirst("get", "");
            if (object4.endsWith("List") && !object4.endsWith("OrBuilderList") && !object4.equals((Object)"List")) {
                object2 = new StringBuilder();
                object2.append(object4.substring(0, 1).toLowerCase());
                object2.append(object4.substring(1, object4.length() - 4));
                object2 = object2.toString();
                method = (Method)hashMap.get((Object)string2);
                if (method != null && method.getReturnType().equals(List.class)) {
                    Q.c(stringBuilder, n8, Q.a((String)object2), w.w(method, object, new Object[0]));
                    continue;
                }
            }
            if (object4.endsWith("Map") && !object4.equals((Object)"Map")) {
                object2 = new StringBuilder();
                object2.append(object4.substring(0, 1).toLowerCase());
                object2.append(object4.substring(1, object4.length() - 3));
                object2 = object2.toString();
                Method method2 = (Method)hashMap.get((Object)string2);
                if (method2 != null && method2.getReturnType().equals(Map.class) && !method2.isAnnotationPresent(Deprecated.class) && Modifier.isPublic((int)method2.getModifiers())) {
                    Q.c(stringBuilder, n8, Q.a((String)object2), w.w(method2, object, new Object[0]));
                    continue;
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("set");
            stringBuilder2.append((String)object4);
            if ((Method)hashMap2.get((Object)stringBuilder2.toString()) == null) continue;
            if (object4.endsWith("Bytes")) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("get");
                stringBuilder3.append(object4.substring(0, object4.length() - 5));
                if (hashMap.containsKey((Object)stringBuilder3.toString())) continue;
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(object4.substring(0, 1).toLowerCase());
            stringBuilder4.append(object4.substring(1));
            String string3 = stringBuilder4.toString();
            object2 = new StringBuilder();
            object2.append("get");
            object2.append((String)object4);
            object2 = (Method)hashMap.get((Object)object2.toString());
            method = new StringBuilder();
            method.append("has");
            method.append((String)object4);
            object4 = (Method)hashMap.get((Object)method.toString());
            if (object2 == null) continue;
            object2 = w.w((Method)object2, object, new Object[0]);
            if (!(object4 == null ? !Q.b(object2) : (Boolean)w.w((Method)object4, object, new Object[0]) != false)) continue;
            Q.c(stringBuilder, n8, Q.a(string3), object2);
        }
        object = ((w)object).unknownFields;
        if (object != null) {
            object.m(stringBuilder, n8);
        }
    }

    public static String e(O o8, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(string2);
        Q.d(o8, stringBuilder, 0);
        return stringBuilder.toString();
    }
}

