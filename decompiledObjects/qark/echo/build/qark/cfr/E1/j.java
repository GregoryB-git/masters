/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArraySet
 *  org.json.JSONObject
 */
package E1;

import G1.i;
import T1.a;
import W5.C;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.B;

public final class j {
    public static final j a = new j();
    public static SharedPreferences b;
    public static final Set c;
    public static final Map d;

    static {
        c = new CopyOnWriteArraySet();
        d = new ConcurrentHashMap();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final boolean d() {
        if (a.d(j.class)) {
            return false;
        }
        try {
            j.a.g();
            var0 = System.currentTimeMillis() / 1000L;
            var4_1 = j.b;
            if (var4_1 == null) ** GOTO lbl19
        }
        catch (Throwable var4_2) {}
        var2_3 = var4_1.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
        if (var2_3 != 0L && var0 - var2_3 < (long)86400) {
            return false;
        }
        var4_1 = j.b;
        if (var4_1 != null) {
            var4_1.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", var0).apply();
            return true;
        }
        Intrinsics.n("sharedPreferences");
        throw null;
lbl19: // 1 sources:
        Intrinsics.n("sharedPreferences");
        throw null;
        a.b(var4_2, j.class);
        return false;
    }

    public static final void e(Map map, Map map2) {
        if (a.d(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)map, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter((Object)map2, "skuDetailsMap");
            j j8 = a;
            j8.g();
            j8.f(j8.c(j8.a(map), map2));
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, j.class);
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Map a(Map map) {
        if (a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)map, "purchaseDetailsMap");
            long l8 = System.currentTimeMillis() / 1000L;
            Iterator iterator = C.m(map).entrySet().iterator();
            do {
                if (iterator.hasNext()) {
                    Object object = (Map.Entry)iterator.next();
                    String string2 = (String)object.getKey();
                    object = (JSONObject)object.getValue();
                    if (!object.has("purchaseToken")) continue;
                    if (d.containsKey(object = object.getString("purchaseToken"))) {
                        map.remove((Object)string2);
                        continue;
                    }
                    string2 = c;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(object);
                    stringBuilder.append(';');
                    stringBuilder.append(l8);
                    string2.add((Object)stringBuilder.toString());
                }
                iterator = b;
                if (iterator != null) {
                    iterator.edit().putStringSet("PURCHASE_DETAILS_SET", c).apply();
                    return new HashMap(map);
                }
                Intrinsics.n("sharedPreferences");
                throw null;
                catch (Exception exception) {}
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
        return null;
    }

    /*
     * Exception decompiling
     */
    public final void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final Map c(Map map, Map map2) {
        Throwable throwable;
        block10 : {
            LinkedHashMap linkedHashMap;
            if (a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter((Object)map, "purchaseDetailsMap");
                Intrinsics.checkNotNullParameter((Object)map2, "skuDetailsMap");
                long l8 = System.currentTimeMillis() / 1000L;
                linkedHashMap = new LinkedHashMap();
                map = map.entrySet().iterator();
                while (map.hasNext()) {
                    boolean bl;
                    Object object = (Map.Entry)map.next();
                    String string2 = (String)object.getKey();
                    object = (JSONObject)object.getValue();
                    string2 = (JSONObject)map2.get((Object)string2);
                    if (object == null || !(bl = object.has("purchaseTime")) || l8 - object.getLong("purchaseTime") / 1000L > 86400L || string2 == null) continue;
                    object = object.toString();
                    Intrinsics.checkNotNullExpressionValue(object, "purchaseDetail.toString()");
                    string2 = string2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "skuDetail.toString()");
                    linkedHashMap.put(object, (Object)string2);
                }
            }
            finally {
                break block10;
            }
            return linkedHashMap;
        }
        a.b(throwable, this);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(Map map) {
        if (a.d(this)) {
            return;
        }
        try {
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Object object = (Map.Entry)map.next();
                String string2 = (String)object.getKey();
                object = (String)object.getValue();
                if (string2 == null || object == null) continue;
                i.f(string2, (String)object, false);
            }
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        if (a.d(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = B.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            sharedPreferences = B.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            Intrinsics.checkNotNullExpressionValue((Object)sharedPreferences, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            b = sharedPreferences;
            Set set = c;
            if (sharedPreferences == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            sharedPreferences = sharedPreferences2 = sharedPreferences.getStringSet("PURCHASE_DETAILS_SET", (Set)new HashSet());
            if (sharedPreferences2 == null) {
                sharedPreferences = new HashSet();
            }
            set.addAll((Collection)sharedPreferences);
            sharedPreferences = set.iterator();
            do {
                if (!sharedPreferences.hasNext()) {
                    this.b();
                    return;
                }
                sharedPreferences2 = kotlin.text.i.V((String)sharedPreferences.next(), new String[]{";"}, false, 2, 2, null);
                d.put(sharedPreferences2.get(0), (Object)Long.parseLong((String)((String)sharedPreferences2.get(1))));
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
    }
}

