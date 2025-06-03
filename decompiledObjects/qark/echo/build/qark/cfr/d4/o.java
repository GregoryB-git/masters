/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package d4;

import Q3.d;
import S3.c;
import d4.a;
import d4.b;
import d4.c;
import d4.e;
import d4.f;
import d4.g;
import d4.l;
import d4.n;
import d4.r;
import d4.t;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class o {
    public static n a(Object object) {
        return o.b(object, r.a());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static n b(Object var0, n var1_2) {
        var4_3 = var0;
        var3_4 = var1_2;
        try {
            block19 : {
                if (var0 instanceof Map) {
                    var5_5 = (Map)var0;
                    if (var5_5.containsKey((Object)".priority")) {
                        var1_2 = r.d(var5_5.get((Object)".priority"));
                    }
                    var4_3 = var0;
                    var3_4 = var1_2;
                    if (var5_5.containsKey((Object)".value")) {
                        var4_3 = var5_5.get((Object)".value");
                        var3_4 = var1_2;
                    }
                }
                if (var4_3 == null) {
                    return g.W();
                }
                if (var4_3 instanceof String) {
                    return new t((String)var4_3, var3_4);
                }
                if (var4_3 instanceof Long) {
                    return new l((Long)var4_3, var3_4);
                }
                if (var4_3 instanceof Integer) {
                    return new l((long)((Integer)var4_3), var3_4);
                }
                if (var4_3 instanceof Double) {
                    return new f((Double)var4_3, var3_4);
                }
                if (var4_3 instanceof Boolean) {
                    return new a((Boolean)var4_3, var3_4);
                }
                if (!(var4_3 instanceof Map) && !(var4_3 instanceof List)) {
                    var0 = new StringBuilder();
                    var0.append("Failed to parse node with class ");
                    var0.append(var4_3.getClass().toString());
                    throw new d(var0.toString());
                }
                if (!(var4_3 instanceof Map)) break block19;
                if ((var4_3 = (Map)var4_3).containsKey((Object)".sv")) {
                    return new e((Map)var4_3, var3_4);
                }
                var1_2 = new HashMap(var4_3.size());
                var5_5 = var4_3.keySet().iterator();
                do {
                    var0 = var1_2;
                    if (var5_5.hasNext()) {
                        var0 = (String)var5_5.next();
                        if (var0.startsWith(".") || (var6_6 = o.a(var4_3.get(var0))).isEmpty()) continue;
                        var1_2.put((Object)b.j((String)var0), (Object)var6_6);
                        continue;
                    }
                    ** GOTO lbl-1000
                    break;
                } while (true);
            }
            var4_3 = (List)var4_3;
            var1_2 = new HashMap(var4_3.size());
            var2_7 = 0;
        }
        catch (ClassCastException var0_1) {
            throw new d("Failed to parse node", (Throwable)var0_1);
        }
        do {
            var0 = var1_2;
            if (var2_7 < var4_3.size()) {
                var0 = new StringBuilder();
                var0.append("");
                var0.append(var2_7);
                var0 = var0.toString();
                var5_5 = o.a(var4_3.get(var2_7));
                if (!var5_5.isEmpty()) {
                    var1_2.put((Object)b.j((String)var0), var5_5);
                }
            } else lbl-1000: // 2 sources:
            {
                if (var0.isEmpty() == false) return new c(c.a.d((Map)var0, c.r), var3_4);
                return g.W();
            }
            ++var2_7;
        } while (true);
    }

    public static int c(b b8, n n8, b b9, n n9) {
        int n10 = n8.compareTo((Object)n9);
        if (n10 != 0) {
            return n10;
        }
        return b8.h(b9);
    }
}

