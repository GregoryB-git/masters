package E1;

import W5.F;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static SharedPreferences f1584b;

    /* renamed from: a, reason: collision with root package name */
    public static final j f1583a = new j();

    /* renamed from: c, reason: collision with root package name */
    public static final Set f1585c = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public static final Map f1586d = new ConcurrentHashMap();

    public static final boolean d() {
        if (T1.a.d(j.class)) {
            return false;
        }
        try {
            f1583a.g();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f1584b;
            if (sharedPreferences == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            long j7 = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j7 != 0 && currentTimeMillis - j7 < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences2 = f1584b;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                return true;
            }
            Intrinsics.n("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            T1.a.b(th, j.class);
            return false;
        }
    }

    public static final void e(Map purchaseDetailsMap, Map skuDetailsMap) {
        if (T1.a.d(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            j jVar = f1583a;
            jVar.g();
            jVar.f(jVar.c(jVar.a(purchaseDetailsMap), skuDetailsMap));
        } catch (Throwable th) {
            T1.a.b(th, j.class);
        }
    }

    public final Map a(Map purchaseDetailsMap) {
        Map m7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            m7 = F.m(purchaseDetailsMap);
            for (Map.Entry entry : m7.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f1586d.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            Set set = f1585c;
                            StringBuilder sb = new StringBuilder();
                            sb.append((Object) string);
                            sb.append(';');
                            sb.append(currentTimeMillis);
                            set.add(sb.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f1584b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f1585c).apply();
                return new HashMap(purchaseDetailsMap);
            }
            Intrinsics.n("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void b() {
        Map m7;
        SharedPreferences.Editor putLong;
        if (T1.a.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f1584b;
            if (sharedPreferences == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            long j7 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j7 == 0) {
                SharedPreferences sharedPreferences2 = f1584b;
                if (sharedPreferences2 == null) {
                    Intrinsics.n("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            } else {
                if (currentTimeMillis - j7 <= 604800) {
                    return;
                }
                m7 = F.m(f1586d);
                for (Map.Entry entry : m7.entrySet()) {
                    String str = (String) entry.getKey();
                    long longValue = ((Number) entry.getValue()).longValue();
                    if (currentTimeMillis - longValue > 86400) {
                        f1585c.remove(str + ';' + longValue);
                        f1586d.remove(str);
                    }
                }
                SharedPreferences sharedPreferences3 = f1584b;
                if (sharedPreferences3 == null) {
                    Intrinsics.n("sharedPreferences");
                    throw null;
                }
                putLong = sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f1585c).putLong("LAST_CLEARED_TIME", currentTimeMillis);
            }
            putLong.apply();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final Map c(Map purchaseDetailsMap, Map skuDetailsMap) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(purchaseDetailsMap, "purchaseDetailsMap");
            Intrinsics.checkNotNullParameter(skuDetailsMap, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : purchaseDetailsMap.entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) skuDetailsMap.get(str);
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400 && jSONObject2 != null) {
                            String jSONObject3 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject3, "purchaseDetail.toString()");
                            String jSONObject4 = jSONObject2.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject4, "skuDetail.toString()");
                            linkedHashMap.put(jSONObject3, jSONObject4);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void f(Map map) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str != null && str2 != null) {
                    G1.i.f(str, str2, false);
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void g() {
        List V6;
        if (T1.a.d(this)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = C2146B.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = C2146B.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = C2146B.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            f1584b = sharedPreferences3;
            Set set = f1585c;
            if (sharedPreferences3 == null) {
                Intrinsics.n("sharedPreferences");
                throw null;
            }
            Set<String> stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            set.addAll(stringSet);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                V6 = s.V((String) it.next(), new String[]{";"}, false, 2, 2, null);
                f1586d.put(V6.get(0), Long.valueOf(Long.parseLong((String) V6.get(1))));
            }
            b();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
