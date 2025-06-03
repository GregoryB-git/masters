/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.os.IBinder
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package E1;

import E1.m;
import T1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;

public final class i {
    public static final i a = new i();
    public static final HashMap b = new HashMap();
    public static final HashMap c = new HashMap();
    public static final String d = B.l().getPackageName();
    public static final SharedPreferences e = B.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
    public static final SharedPreferences f = B.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final Object a(Context object, IBinder iBinder) {
        if (a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "context");
            object = a.n((Context)object, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
            return object;
        }
        catch (Throwable throwable) {
            a.b(throwable, i.class);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void b() {
        if (a.d(i.class)) {
            return;
        }
        try {
            long l8 = System.currentTimeMillis() / 1000L;
            SharedPreferences sharedPreferences = e;
            long l9 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (l9 == 0L) {
                sharedPreferences = sharedPreferences.edit().putLong("LAST_CLEARED_TIME", l8);
            } else {
                if (l8 - l9 <= (long)604800) return;
                sharedPreferences = sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", l8);
            }
            sharedPreferences.apply();
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, i.class);
    }

    public static final ArrayList g(Context context, Object object) {
        i i8;
        block8 : {
            ArrayList arrayList;
            Class class_;
            block7 : {
                block6 : {
                    if (a.d(i.class)) {
                        return null;
                    }
                    try {
                        Intrinsics.checkNotNullParameter((Object)context, "context");
                        arrayList = new ArrayList();
                        if (object != null) break block6;
                        return arrayList;
                    }
                    catch (Throwable throwable) {
                        a.b(throwable, i.class);
                        return null;
                    }
                }
                i8 = a;
                class_ = i8.d(context, "com.android.vending.billing.IInAppBillingService");
                if (class_ != null) break block7;
                return arrayList;
            }
            if (i8.e(class_, "getPurchaseHistory") != null) break block8;
            return arrayList;
        }
        context = i8.c(i8.f(context, object, "inapp"));
        return context;
    }

    public static final ArrayList i(Context context, Object object) {
        if (a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            i i8 = a;
            context = i8.c(i8.h(context, object, "inapp"));
            return context;
        }
        catch (Throwable throwable) {
            a.b(throwable, i.class);
            return null;
        }
    }

    public static final ArrayList j(Context context, Object object) {
        if (a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            i i8 = a;
            context = i8.c(i8.h(context, object, "subs"));
            return context;
        }
        catch (Throwable throwable) {
            a.b(throwable, i.class);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Map k(Context context, ArrayList arrayList, Object object, boolean bl) {
        if (a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter((Object)arrayList, "skuList");
            Map map = a.p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList = arrayList.iterator();
            do {
                if (!arrayList.hasNext()) {
                    map.putAll(a.l(context, arrayList2, object, bl));
                    return map;
                }
                String string2 = (String)arrayList.next();
                if (map.containsKey((Object)string2)) continue;
                arrayList2.add((Object)string2);
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, i.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2;
        long l8;
        SharedPreferences.Editor editor;
        block7 : {
            if (a.d(this)) {
                return null;
            }
            try {
                arrayList2 = new ArrayList();
                editor = f.edit();
                l8 = System.currentTimeMillis() / 1000L;
                arrayList = arrayList.iterator();
                break block7;
            }
            catch (Throwable throwable) {}
            a.b(throwable, this);
            return null;
        }
        do {
            if (!arrayList.hasNext()) {
                editor.apply();
                return arrayList2;
            }
            String string2 = (String)arrayList.next();
            try {
                Object object = new JSONObject(string2);
                String string3 = object.getString("productId");
                long l9 = object.getLong("purchaseTime");
                object = object.getString("purchaseToken");
                if (l8 - l9 / 1000L > 86400L || Intrinsics.a(f.getString(string3, ""), object)) continue;
                editor.putString(string3, (String)object);
                arrayList2.add((Object)string2);
            }
            catch (JSONException jSONException) {
            }
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Class d(Context context, String string2) {
        HashMap hashMap;
        Throwable throwable2;
        block5 : {
            if (a.d(this)) {
                return null;
            }
            try {
                hashMap = c;
                Class class_ = (Class)hashMap.get((Object)string2);
                if (class_ == null) break block5;
                return class_;
            }
            catch (Throwable throwable2) {}
        }
        context = m.b(context, string2);
        if (context == null) return context;
        hashMap.put((Object)string2, (Object)context);
        return context;
        a.b(throwable2, this);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Method e(Class var1_1, String var2_3) {
        block18 : {
            block17 : {
                if (a.d(this)) {
                    return null;
                }
                try {
                    var5_4 = i.b;
                    var4_5 = (Object[])var5_4.get((Object)var2_3);
                    if (var4_5 != null) {
                        return var4_5;
                    }
                    var3_6 = var2_3.hashCode();
                }
                catch (Throwable var1_2) {}
                switch (var3_6) {
                    default: {
                        break;
                    }
                    case -573310373: {
                        if (!var2_3.equals((Object)"getSkuDetails")) break;
                        var4_5 = new Class[4];
                        var6_7 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(var6_7, "TYPE");
                        var4_5[0] = var6_7;
                        var4_5[1] = String.class;
                        var4_5[2] = String.class;
                        var4_5[3] = Bundle.class;
                        ** break;
                    }
                    case -594356707: {
                        if (!var2_3.equals((Object)"getPurchaseHistory")) break;
                        var4_5 = new Class[5];
                        var6_7 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(var6_7, "TYPE");
                        var4_5[0] = var6_7;
                        var4_5[1] = String.class;
                        var4_5[2] = String.class;
                        var4_5[3] = String.class;
                        var4_5[4] = Bundle.class;
                        ** break;
                    }
                    case -1123215065: {
                        if (!var2_3.equals((Object)"asInterface")) break;
                        var4_5 = new Class[]{IBinder.class};
                        ** break;
                    }
                    case -1450694211: {
                        if (!var2_3.equals((Object)"isBillingSupported")) break;
                        var4_5 = new Class[3];
                        var6_7 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(var6_7, "TYPE");
                        var4_5[0] = var6_7;
                        var4_5[1] = String.class;
                        var4_5[2] = String.class;
                        ** break;
                    }
                    case -1801122596: {
                        if (!var2_3.equals((Object)"getPurchases")) break;
                        var4_5 = new Class[4];
                        var6_7 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(var6_7, "TYPE");
                        var4_5[0] = var6_7;
                        var4_5[1] = String.class;
                        var4_5[2] = String.class;
                        var4_5[3] = String.class;
                        break block17;
                    }
                }
                var4_5 = null;
            }
            if (var4_5 != null) ** GOTO lbl68
            var1_1 = m.c(var1_1, var2_3, new Class[]{null});
            break block18;
lbl68: // 1 sources:
            var6_7 = m.a;
            var1_1 = m.c(var1_1, var2_3, (Class[])Arrays.copyOf((Object[])var4_5, (int)var4_5.length));
        }
        if (var1_1 == null) return var1_1;
        var5_4.put((Object)var2_3, (Object)var1_1);
        return var1_1;
        a.b(var1_2, this);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final ArrayList f(Context var1_1, Object var2_3, String var3_4) {
        block13 : {
            block12 : {
                if (a.d(this)) {
                    return null;
                }
                try {
                    var10_5 = new ArrayList();
                    if (this.o(var1_1, var2_3, var3_4) == false) return var10_5;
                    var9_6 = null;
                    var4_8 = var5_7 = 0;
lbl8: // 2 sources:
                    v0 = new Object[]{6, i.d, var3_4, var9_6, new Bundle()};
                    var9_6 = this.n(var1_1, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", var2_3, v0);
                    if (var9_6 == null) ** GOTO lbl-1000
                    var7_10 = System.currentTimeMillis() / 1000L;
                    if ((var9_6 = (Bundle)var9_6).getInt("RESPONSE_CODE") == 0 && (var11_11 = var9_6.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                        var11_11 = var11_11.iterator();
                    } else lbl-1000: // 2 sources:
                    {
                        var9_6 = null;
                        var6_9 = var4_8;
                        break block12;
                    }
                    var6_9 = var4_8;
                    if (var11_11.hasNext()) {
                        var12_12 = (String)var11_11.next();
                        if (var7_10 - new JSONObject(var12_12).getLong("purchaseTime") / 1000L <= 1200L) {
                            var10_5.add((Object)var12_12);
                            ++var5_7;
                        }
                        var6_9 = 1;
                    }
                    var9_6 = var9_6.getString("INAPP_CONTINUATION_TOKEN");
                }
                catch (Throwable var1_2) {
                    break block13;
                }
            }
            if (var5_7 >= 30) return var10_5;
            if (var9_6 == null) return var10_5;
            var4_8 = var6_9;
            if (var6_9 == 0) ** GOTO lbl8
            return var10_5;
        }
        a.b(var1_2, this);
        return null;
        catch (JSONException var12_13) {
        }
    }

    public final ArrayList h(Context context, Object object, String string2) {
        Throwable throwable2;
        block12 : {
            ArrayList arrayList;
            block9 : {
                Object object2;
                block8 : {
                    if (a.d(this)) {
                        return null;
                    }
                    arrayList = new ArrayList();
                    if (object != null) break block8;
                    return arrayList;
                }
                if (!this.o(context, object, string2)) break block9;
                Object object3 = null;
                int n8 = 0;
                do {
                    block11 : {
                        block10 : {
                            try {
                                object2 = this.n(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", object, new Object[]{3, d, string2, object3});
                                if (object2 == null) break block10;
                            }
                            catch (Throwable throwable2) {}
                            object2 = (Bundle)object2;
                            if (object2.getInt("RESPONSE_CODE") != 0) break block10;
                            object3 = object2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (object3 == null) break;
                            n8 += object3.size();
                            arrayList.addAll((Collection)object3);
                            object2 = object2.getString("INAPP_CONTINUATION_TOKEN");
                            break block11;
                            break block12;
                        }
                        object2 = null;
                    }
                    if (n8 >= 30) break;
                    object3 = object2;
                } while (object2 != null);
            }
            return arrayList;
        }
        a.b(throwable2, this);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Map l(Context var1_1, ArrayList var2_3, Object var3_4, boolean var4_5) {
        if (a.d(this)) {
            return null;
        }
        var9_6 = new LinkedHashMap();
        if (var3_4 == null) return var9_6;
        if (var2_3.isEmpty()) {
            return var9_6;
        }
        var10_7 = new Bundle();
        var10_7.putStringArrayList("ITEM_ID_LIST", var2_3);
        var5_8 = 0;
        var11_9 = i.d;
        var8_10 = var4_5 != false ? "subs" : "inapp";
        if ((var1_1 = this.n((Context)var1_1, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", var3_4, new Object[]{3, var11_9, var8_10, var10_7})) == null) return var9_6;
        if ((var1_1 = (Bundle)var1_1).getInt("RESPONSE_CODE") != 0) return var9_6;
        if ((var1_1 = var1_1.getStringArrayList("DETAILS_LIST")) == null || var2_3.size() != var1_1.size() || (var7_11 = var2_3.size() - 1) < 0) ** GOTO lbl25
        do {
            block7 : {
                var6_12 = var5_8 + 1;
                try {
                    var3_4 = var2_3.get(var5_8);
                    Intrinsics.checkNotNullExpressionValue(var3_4, "skuList[i]");
                    var8_10 = var1_1.get(var5_8);
                    Intrinsics.checkNotNullExpressionValue(var8_10, "skuDetailsList[i]");
                    var9_6.put(var3_4, var8_10);
                    if (var6_12 <= var7_11) break block7;
lbl25: // 2 sources:
                    this.q((Map)var9_6);
                    return var9_6;
                }
                catch (Throwable var1_2) {}
                a.b(var1_2, this);
                return null;
            }
            var5_8 = var6_12;
        } while (true);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean m(String string2) {
        if (a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "skuDetail");
            string2 = new JSONObject(string2).optString("freeTrialPeriod");
            if (string2 == null) return false;
            int n8 = string2.length();
            if (n8 <= 0) return false;
            return true;
        }
        catch (Throwable throwable222) {}
        a.b(throwable222, this);
        return false;
        catch (JSONException jSONException) {
            return false;
        }
    }

    public final Object n(Context object, String string2, String object2, Object object3, Object[] arrobject) {
        block6 : {
            block5 : {
                if (a.d(this)) {
                    return null;
                }
                try {
                    object = this.d((Context)object, string2);
                    if (object != null) break block5;
                    return null;
                }
                catch (Throwable throwable) {
                    a.b(throwable, this);
                    return null;
                }
            }
            string2 = this.e((Class)object, (String)object2);
            if (string2 != null) break block6;
            return null;
        }
        object2 = m.a;
        object = m.e((Class)object, (Method)string2, object3, Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
        return object;
    }

    public final boolean o(Context object, Object object2, String string2) {
        Throwable throwable2;
        block7 : {
            block6 : {
                if (a.d(this)) {
                    return false;
                }
                if (object2 == null) {
                    return false;
                }
                try {
                    object = this.n((Context)object, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", object2, new Object[]{3, d, string2});
                    if (object == null) break block6;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                int n8 = (Integer)object;
                if (n8 == 0) {
                    return true;
                }
            }
            return false;
        }
        a.b(throwable2, this);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map p(ArrayList arrayList) {
        if (a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long l8 = System.currentTimeMillis() / 1000L;
            for (String string2 : arrayList) {
                String string3 = e.getString(string2, null);
                if (string3 == null || l8 - Long.parseLong((String)((String)(string3 = kotlin.text.i.V(string3, new String[]{";"}, false, 2, 2, null)).get(0))) >= 43200L) continue;
                Intrinsics.checkNotNullExpressionValue(string2, "sku");
                linkedHashMap.put((Object)string2, string3.get(1));
            }
            return linkedHashMap;
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q(Map map) {
        if (a.d(this)) {
            return;
        }
        try {
            long l8 = System.currentTimeMillis() / 1000L;
            SharedPreferences.Editor editor = e.edit();
            map = map.entrySet().iterator();
            do {
                if (!map.hasNext()) {
                    editor.apply();
                    return;
                }
                Object object = (Map.Entry)map.next();
                String string2 = (String)object.getKey();
                object = (String)object.getValue();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(l8);
                stringBuilder.append(';');
                stringBuilder.append((String)object);
                editor.putString(string2, stringBuilder.toString());
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
    }
}

