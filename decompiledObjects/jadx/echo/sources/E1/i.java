package E1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1577a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1578b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f1579c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final String f1580d = C2146B.l().getPackageName();

    /* renamed from: e, reason: collision with root package name */
    public static final SharedPreferences f1581e = C2146B.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final SharedPreferences f1582f = C2146B.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    public static final Object a(Context context, IBinder iBinder) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            return f1577a.n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final void b() {
        SharedPreferences.Editor putLong;
        if (T1.a.d(i.class)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f1581e;
            long j7 = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j7 == 0) {
                putLong = sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            } else if (currentTimeMillis - j7 <= 604800) {
                return;
            } else {
                putLong = sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis);
            }
            putLong.apply();
        } catch (Throwable th) {
            T1.a.b(th, i.class);
        }
    }

    public static final ArrayList g(Context context, Object obj) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList arrayList = new ArrayList();
            if (obj == null) {
                return arrayList;
            }
            i iVar = f1577a;
            Class d7 = iVar.d(context, "com.android.vending.billing.IInAppBillingService");
            return d7 == null ? arrayList : iVar.e(d7, "getPurchaseHistory") == null ? arrayList : iVar.c(iVar.f(context, obj, "inapp"));
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final ArrayList i(Context context, Object obj) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = f1577a;
            return iVar.c(iVar.h(context, obj, "inapp"));
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final ArrayList j(Context context, Object obj) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = f1577a;
            return iVar.c(iVar.h(context, obj, "subs"));
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public static final Map k(Context context, ArrayList skuList, Object obj, boolean z7) {
        if (T1.a.d(i.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(skuList, "skuList");
            Map p7 = f1577a.p(skuList);
            ArrayList arrayList = new ArrayList();
            Iterator it = skuList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!p7.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            p7.putAll(f1577a.l(context, arrayList, obj, z7));
            return p7;
        } catch (Throwable th) {
            T1.a.b(th, i.class);
            return null;
        }
    }

    public final ArrayList c(ArrayList arrayList) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor edit = f1582f.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j7 = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j7 / 1000) <= 86400 && !Intrinsics.a(f1582f.getString(string, ""), string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final Class d(Context context, String str) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = f1579c;
            Class cls = (Class) hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            Class b7 = m.b(context, str);
            if (b7 != null) {
                hashMap.put(str, b7);
            }
            return b7;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Method e(Class cls, String str) {
        Class[] clsArr;
        Method c7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = f1578b;
            Method method = (Method) hashMap.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        Class TYPE = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
                        clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                        break;
                    }
                    clsArr = null;
                    break;
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE2 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE2, "TYPE");
                        clsArr = new Class[]{TYPE2, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE3 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE3, "TYPE");
                        clsArr = new Class[]{TYPE3, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Class TYPE4 = Integer.TYPE;
                        Intrinsics.checkNotNullExpressionValue(TYPE4, "TYPE");
                        clsArr = new Class[]{TYPE4, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            if (clsArr == null) {
                c7 = m.c(cls, str, null);
            } else {
                m mVar = m.f1598a;
                c7 = m.c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            if (c7 != null) {
                hashMap.put(str, c7);
            }
            return c7;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final ArrayList f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (o(context, obj, str)) {
                String str2 = null;
                int i7 = 0;
                boolean z7 = false;
                do {
                    Object n7 = n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f1580d, str, str2, new Bundle()});
                    if (n7 != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n7;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z7 = true;
                                    break;
                                }
                                arrayList.add(next);
                                i7++;
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i7 < 30 || str2 == null) {
                                break;
                                break;
                            }
                        }
                    }
                    str2 = null;
                    if (i7 < 30) {
                        break;
                    }
                } while (!z7);
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[EDGE_INSN: B:24:0x0064->B:28:0x0064 BREAK  A[LOOP:0: B:12:0x0019->B:23:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = T1.a.d(r12)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            if (r14 != 0) goto L10
            return r0
        L10:
            boolean r2 = r12.o(r13, r14, r15)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L64
            r2 = 0
            r3 = r1
            r4 = r2
        L19:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L5b
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L5b
            r11[r2] = r6     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = E1.i.f1580d     // Catch: java.lang.Throwable -> L5b
            r7 = 1
            r11[r7] = r6     // Catch: java.lang.Throwable -> L5b
            r6 = 2
            r11[r6] = r15     // Catch: java.lang.Throwable -> L5b
            r11[r5] = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.n(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L5d
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L64
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L5b
            goto L5e
        L5b:
            r13 = move-exception
            goto L65
        L5d:
            r3 = r1
        L5e:
            r5 = 30
            if (r4 >= r5) goto L64
            if (r3 != 0) goto L19
        L64:
            return r0
        L65:
            T1.a.b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.i.h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    public final Map l(Context context, ArrayList arrayList, Object obj, boolean z7) {
        int size;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Map linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                int i7 = 0;
                objArr[0] = 3;
                objArr[1] = f1580d;
                objArr[2] = z7 ? "subs" : "inapp";
                objArr[3] = bundle;
                Object n7 = n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (n7 != null) {
                    Bundle bundle2 = (Bundle) n7;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size() && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i8 = i7 + 1;
                                Object obj2 = arrayList.get(i7);
                                Intrinsics.checkNotNullExpressionValue(obj2, "skuList[i]");
                                String str = stringArrayList.get(i7);
                                Intrinsics.checkNotNullExpressionValue(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str);
                                if (i8 > size) {
                                    break;
                                }
                                i7 = i8;
                            }
                        }
                        q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean m(String skuDetail) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(skuDetail, "skuDetail");
            try {
                String optString = new JSONObject(skuDetail).optString("freeTrialPeriod");
                if (optString != null) {
                    return optString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final Object n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Class d7 = d(context, str);
            if (d7 == null || (e7 = e(d7, str2)) == null) {
                return null;
            }
            m mVar = m.f1598a;
            return m.e(d7, e7, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean o(Context context, Object obj, String str) {
        if (T1.a.d(this) || obj == null) {
            return false;
        }
        try {
            Object n7 = n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f1580d, str});
            if (n7 != null) {
                return ((Integer) n7).intValue() == 0;
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final Map p(ArrayList arrayList) {
        List V6;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String sku = (String) it.next();
                String string = f1581e.getString(sku, null);
                if (string != null) {
                    V6 = s.V(string, new String[]{";"}, false, 2, 2, null);
                    if (currentTimeMillis - Long.parseLong((String) V6.get(0)) < 43200) {
                        Intrinsics.checkNotNullExpressionValue(sku, "sku");
                        linkedHashMap.put(sku, V6.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void q(Map map) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor edit = f1581e.edit();
            for (Map.Entry entry : map.entrySet()) {
                edit.putString((String) entry.getKey(), currentTimeMillis + ';' + ((String) entry.getValue()));
            }
            edit.apply();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
