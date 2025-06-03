package A1;

import A1.a;
import O1.C;
import O1.P;
import V5.q;
import V5.t;
import W5.F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.N;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f242a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f243b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f244c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f245d;

    public enum a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* renamed from: p, reason: collision with root package name */
        public static final C0002a f246p = new C0002a(null);

        /* renamed from: o, reason: collision with root package name */
        public final String f251o;

        /* renamed from: A1.e$a$a, reason: collision with other inner class name */
        public static final class C0002a {
            public C0002a() {
            }

            public /* synthetic */ C0002a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final a a(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (a aVar : a.valuesCustom()) {
                    if (Intrinsics.a(aVar.e(), rawValue)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        a(String str) {
            this.f251o = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String e() {
            return this.f251o;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public k f252a;

        /* renamed from: b, reason: collision with root package name */
        public i f253b;

        public b(k kVar, i field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f252a = kVar;
            this.f253b = field;
        }

        public final i a() {
            return this.f253b;
        }

        public final k b() {
            return this.f252a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f252a == bVar.f252a && this.f253b == bVar.f253b;
        }

        public int hashCode() {
            k kVar = this.f252a;
            return ((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f253b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f252a + ", field=" + this.f253b + ')';
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public k f254a;

        /* renamed from: b, reason: collision with root package name */
        public l f255b;

        public c(k section, l lVar) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.f254a = section;
            this.f255b = lVar;
        }

        public final l a() {
            return this.f255b;
        }

        public final k b() {
            return this.f254a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f254a == cVar.f254a && this.f255b == cVar.f255b;
        }

        public int hashCode() {
            int hashCode = this.f254a.hashCode() * 31;
            l lVar = this.f255b;
            return hashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f254a + ", field=" + this.f255b + ')';
        }
    }

    public enum d {
        ARRAY,
        BOOL,
        INT;


        /* renamed from: o, reason: collision with root package name */
        public static final a f256o = new a(null);

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final d a(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (Intrinsics.a(rawValue, A1.b.EXT_INFO.e()) || Intrinsics.a(rawValue, A1.b.URL_SCHEMES.e()) || Intrinsics.a(rawValue, m.CONTENT_IDS.e()) || Intrinsics.a(rawValue, m.CONTENTS.e()) || Intrinsics.a(rawValue, a.OPTIONS.e())) {
                    return d.ARRAY;
                }
                if (Intrinsics.a(rawValue, A1.b.ADV_TE.e()) || Intrinsics.a(rawValue, A1.b.APP_TE.e())) {
                    return d.BOOL;
                }
                if (Intrinsics.a(rawValue, m.EVENT_TIME.e())) {
                    return d.INT;
                }
                return null;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            d[] valuesCustom = values();
            return (d[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: A1.e$e, reason: collision with other inner class name */
    public /* synthetic */ class C0003e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f261a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f262b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f263c;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            iArr[d.ARRAY.ordinal()] = 1;
            iArr[d.BOOL.ordinal()] = 2;
            iArr[d.INT.ordinal()] = 3;
            f261a = iArr;
            int[] iArr2 = new int[k.valuesCustom().length];
            iArr2[k.APP_DATA.ordinal()] = 1;
            iArr2[k.USER_DATA.ordinal()] = 2;
            f262b = iArr2;
            int[] iArr3 = new int[A1.a.valuesCustom().length];
            iArr3[A1.a.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[A1.a.CUSTOM.ordinal()] = 2;
            f263c = iArr3;
        }
    }

    static {
        Map f7;
        Map f8;
        Map f9;
        A1.b bVar = A1.b.ANON_ID;
        k kVar = k.USER_DATA;
        V5.m a7 = q.a(bVar, new c(kVar, l.ANON_ID));
        V5.m a8 = q.a(A1.b.APP_USER_ID, new c(kVar, l.FB_LOGIN_ID));
        V5.m a9 = q.a(A1.b.ADVERTISER_ID, new c(kVar, l.MAD_ID));
        V5.m a10 = q.a(A1.b.PAGE_ID, new c(kVar, l.PAGE_ID));
        V5.m a11 = q.a(A1.b.PAGE_SCOPED_USER_ID, new c(kVar, l.PAGE_SCOPED_USER_ID));
        A1.b bVar2 = A1.b.ADV_TE;
        k kVar2 = k.APP_DATA;
        f7 = F.f(a7, a8, a9, a10, a11, q.a(bVar2, new c(kVar2, l.ADV_TE)), q.a(A1.b.APP_TE, new c(kVar2, l.APP_TE)), q.a(A1.b.CONSIDER_VIEWS, new c(kVar2, l.CONSIDER_VIEWS)), q.a(A1.b.DEVICE_TOKEN, new c(kVar2, l.DEVICE_TOKEN)), q.a(A1.b.EXT_INFO, new c(kVar2, l.EXT_INFO)), q.a(A1.b.INCLUDE_DWELL_DATA, new c(kVar2, l.INCLUDE_DWELL_DATA)), q.a(A1.b.INCLUDE_VIDEO_DATA, new c(kVar2, l.INCLUDE_VIDEO_DATA)), q.a(A1.b.INSTALL_REFERRER, new c(kVar2, l.INSTALL_REFERRER)), q.a(A1.b.INSTALLER_PACKAGE, new c(kVar2, l.INSTALLER_PACKAGE)), q.a(A1.b.RECEIPT_DATA, new c(kVar2, l.RECEIPT_DATA)), q.a(A1.b.URL_SCHEMES, new c(kVar2, l.URL_SCHEMES)), q.a(A1.b.USER_DATA, new c(kVar, null)));
        f243b = f7;
        V5.m a12 = q.a(m.EVENT_TIME, new b(null, i.EVENT_TIME));
        V5.m a13 = q.a(m.EVENT_NAME, new b(null, i.EVENT_NAME));
        m mVar = m.VALUE_TO_SUM;
        k kVar3 = k.CUSTOM_DATA;
        f8 = F.f(a12, a13, q.a(mVar, new b(kVar3, i.VALUE_TO_SUM)), q.a(m.CONTENT_IDS, new b(kVar3, i.CONTENT_IDS)), q.a(m.CONTENTS, new b(kVar3, i.CONTENTS)), q.a(m.CONTENT_TYPE, new b(kVar3, i.CONTENT_TYPE)), q.a(m.CURRENCY, new b(kVar3, i.CURRENCY)), q.a(m.DESCRIPTION, new b(kVar3, i.DESCRIPTION)), q.a(m.LEVEL, new b(kVar3, i.LEVEL)), q.a(m.MAX_RATING_VALUE, new b(kVar3, i.MAX_RATING_VALUE)), q.a(m.NUM_ITEMS, new b(kVar3, i.NUM_ITEMS)), q.a(m.PAYMENT_INFO_AVAILABLE, new b(kVar3, i.PAYMENT_INFO_AVAILABLE)), q.a(m.REGISTRATION_METHOD, new b(kVar3, i.REGISTRATION_METHOD)), q.a(m.SEARCH_STRING, new b(kVar3, i.SEARCH_STRING)), q.a(m.SUCCESS, new b(kVar3, i.SUCCESS)), q.a(m.ORDER_ID, new b(kVar3, i.ORDER_ID)), q.a(m.AD_TYPE, new b(kVar3, i.AD_TYPE)));
        f244c = f8;
        f9 = F.f(q.a("fb_mobile_achievement_unlocked", j.UNLOCKED_ACHIEVEMENT), q.a("fb_mobile_activate_app", j.ACTIVATED_APP), q.a("fb_mobile_add_payment_info", j.ADDED_PAYMENT_INFO), q.a("fb_mobile_add_to_cart", j.ADDED_TO_CART), q.a("fb_mobile_add_to_wishlist", j.ADDED_TO_WISHLIST), q.a("fb_mobile_complete_registration", j.COMPLETED_REGISTRATION), q.a("fb_mobile_content_view", j.VIEWED_CONTENT), q.a("fb_mobile_initiated_checkout", j.INITIATED_CHECKOUT), q.a("fb_mobile_level_achieved", j.ACHIEVED_LEVEL), q.a("fb_mobile_purchase", j.PURCHASED), q.a("fb_mobile_rate", j.RATED), q.a("fb_mobile_search", j.SEARCHED), q.a("fb_mobile_spent_credits", j.SPENT_CREDITS), q.a("fb_mobile_tutorial_completion", j.COMPLETED_TUTORIAL));
        f245d = f9;
    }

    public static final ArrayList k(String appEvents) {
        String b7;
        Object l7;
        Intrinsics.checkNotNullParameter(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            P p7 = P.f3756a;
            for (String str : P.m(new JSONArray(appEvents))) {
                P p8 = P.f3756a;
                arrayList.add(P.n(new JSONObject(str)));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    m a7 = m.f345p.a(str2);
                    b bVar = (b) f244c.get(a7);
                    if (a7 != null && bVar != null) {
                        k b8 = bVar.b();
                        if (b8 == null) {
                            try {
                                String e7 = bVar.a().e();
                                if (a7 == m.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    e eVar = f242a;
                                    Object obj = map.get(str2);
                                    if (obj == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    l7 = eVar.j((String) obj);
                                } else if (a7 == m.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    if (obj2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                    l7 = l(str2, obj2);
                                    if (l7 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                }
                                linkedHashMap2.put(e7, l7);
                            } catch (ClassCastException e8) {
                                C.a aVar = C.f3715e;
                                N n7 = N.APP_EVENTS;
                                b7 = V5.b.b(e8);
                                aVar.c(n7, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", b7);
                            }
                        } else if (b8 == k.CUSTOM_DATA) {
                            String e9 = bVar.a().e();
                            Object obj3 = map.get(str2);
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            Object l8 = l(str2, obj3);
                            if (l8 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                            }
                            linkedHashMap.put(e9, l8);
                        } else {
                            continue;
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(k.CUSTOM_DATA.e(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e10) {
            C.f3715e.c(N.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Map] */
    public static final Object l(String field, Object value) {
        Integer f7;
        Integer f8;
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        d a7 = d.f256o.a(field);
        String str = value instanceof String ? (String) value : null;
        if (a7 == null || str == null) {
            return value;
        }
        int i7 = C0003e.f261a[a7.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new V5.l();
                }
                f8 = kotlin.text.q.f(value.toString());
                return f8;
            }
            f7 = kotlin.text.q.f(str);
            if (f7 != null) {
                return Boolean.valueOf(f7.intValue() != 0);
            }
            return null;
        }
        try {
            P p7 = P.f3756a;
            List<??> m7 = P.m(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            for (?? r42 : m7) {
                try {
                    try {
                        P p8 = P.f3756a;
                        r42 = P.n(new JSONObject((String) r42));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    P p9 = P.f3756a;
                    r42 = P.m(new JSONArray((String) r42));
                }
                arrayList.add(r42);
            }
            return arrayList;
        } catch (JSONException e7) {
            C.f3715e.c(N.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e7);
            return t.f6803a;
        }
    }

    public final List a(A1.a eventType, Map userData, Map appData, Map restOfData, List customEvents, Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        Intrinsics.checkNotNullParameter(customEvents, "customEvents");
        Map d7 = d(userData, appData, restOfData);
        int i7 = C0003e.f263c[eventType.ordinal()];
        if (i7 == 1) {
            return c(d7, obj);
        }
        if (i7 != 2) {
            return null;
        }
        return b(d7, customEvents);
    }

    public final List b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    public final List c(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(i.EVENT_NAME.e(), n.MOBILE_APP_INSTALL.e());
        linkedHashMap.put(i.EVENT_TIME.e(), obj);
        return W5.n.b(linkedHashMap);
    }

    public final Map d(Map userData, Map appData, Map restOfData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(n.ACTION_SOURCE.e(), n.APP.e());
        linkedHashMap.put(k.USER_DATA.e(), userData);
        linkedHashMap.put(k.APP_DATA.e(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    public final List e(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        A1.a f7 = f(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (f7 == A1.a.OTHER) {
            return null;
        }
        return a(f7, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(n.INSTALL_EVENT_TIME.e()));
    }

    public final A1.a f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(n.EVENT.e());
        a.C0001a c0001a = A1.a.f214o;
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        A1.a a7 = c0001a.a((String) obj);
        if (a7 == A1.a.OTHER) {
            return a7;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            A1.b a8 = A1.b.f227p.a(str);
            if (a8 != null) {
                f242a.g(map2, map3, a8, value);
            } else {
                boolean a9 = Intrinsics.a(str, k.CUSTOM_EVENTS.e());
                boolean z7 = value instanceof String;
                if (a7 == A1.a.CUSTOM && a9 && z7) {
                    ArrayList k7 = k((String) value);
                    if (k7 != null) {
                        arrayList.addAll(k7);
                    }
                } else if (a.f246p.a(str) != null) {
                    map4.put(str, value);
                }
            }
        }
        return a7;
    }

    public final void g(Map userData, Map appData, A1.b field, Object value) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        c cVar = (c) f243b.get(field);
        if (cVar == null) {
            return;
        }
        int i7 = C0003e.f262b[cVar.b().ordinal()];
        if (i7 == 1) {
            h(appData, field, value);
        } else {
            if (i7 != 2) {
                return;
            }
            i(userData, field, value);
        }
    }

    public final void h(Map map, A1.b bVar, Object obj) {
        c cVar = (c) f243b.get(bVar);
        l a7 = cVar == null ? null : cVar.a();
        if (a7 == null) {
            return;
        }
        map.put(a7.e(), obj);
    }

    public final void i(Map map, A1.b bVar, Object obj) {
        if (bVar == A1.b.USER_DATA) {
            try {
                P p7 = P.f3756a;
                map.putAll(P.n(new JSONObject((String) obj)));
                return;
            } catch (JSONException e7) {
                C.f3715e.c(N.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e7);
                return;
            }
        }
        c cVar = (c) f243b.get(bVar);
        l a7 = cVar == null ? null : cVar.a();
        if (a7 == null) {
            return;
        }
        map.put(a7.e(), obj);
    }

    public final String j(String str) {
        Map map = f245d;
        if (!map.containsKey(str)) {
            return str;
        }
        j jVar = (j) map.get(str);
        return jVar == null ? "" : jVar.e();
    }
}
