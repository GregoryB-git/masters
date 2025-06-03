package O1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.r;

/* renamed from: O1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447j {

    /* renamed from: g, reason: collision with root package name */
    public static final a f3847g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static C0447j f3848h;

    /* renamed from: a, reason: collision with root package name */
    public final Map f3849a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3850b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3851c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3852d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3853e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3854f;

    /* renamed from: O1.j$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C0447j a(JSONArray jSONArray) {
            Map map;
            Map map2;
            Map map3;
            String str;
            String str2;
            String str3;
            String optString;
            boolean l7;
            boolean l8;
            boolean l9;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i7 = 0;
                Map map4 = null;
                Map map5 = null;
                Map map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i8 = i7 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        l7 = kotlin.text.r.l(optString, "other", true);
                        if (l7) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map4 = d(optJSONObject);
                        } else {
                            l8 = kotlin.text.r.l(optString, "transient", true);
                            if (l8) {
                                str5 = optJSONObject.optString("recovery_message", null);
                                map5 = d(optJSONObject);
                            } else {
                                l9 = kotlin.text.r.l(optString, "login_recoverable", true);
                                if (l9) {
                                    str6 = optJSONObject.optString("recovery_message", null);
                                    map6 = d(optJSONObject);
                                }
                            }
                        }
                    }
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new C0447j(map, map2, map3, str, str2, str3);
        }

        public final synchronized C0447j b() {
            C0447j c0447j;
            try {
                if (C0447j.f3848h == null) {
                    C0447j.f3848h = c();
                }
                c0447j = C0447j.f3848h;
                if (c0447j == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            } catch (Throwable th) {
                throw th;
            }
            return c0447j;
        }

        public final C0447j c() {
            HashMap e7;
            HashMap e8;
            e7 = W5.F.e(V5.q.a(2, null), V5.q.a(4, null), V5.q.a(9, null), V5.q.a(17, null), V5.q.a(341, null));
            e8 = W5.F.e(V5.q.a(102, null), V5.q.a(190, null), V5.q.a(412, null));
            return new C0447j(null, e7, e8, null, null, null);
        }

        public final Map d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i9 = 0;
                                while (true) {
                                    int i10 = i9 + 1;
                                    int optInt2 = optJSONArray2.optInt(i9);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i10 >= length2) {
                                        break;
                                    }
                                    i9 = i10;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return hashMap;
        }
    }

    /* renamed from: O1.j$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3855a;

        static {
            int[] iArr = new int[r.a.valuesCustom().length];
            iArr[r.a.OTHER.ordinal()] = 1;
            iArr[r.a.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[r.a.TRANSIENT.ordinal()] = 3;
            f3855a = iArr;
        }
    }

    public C0447j(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f3849a = map;
        this.f3850b = map2;
        this.f3851c = map3;
        this.f3852d = str;
        this.f3853e = str2;
        this.f3854f = str3;
    }

    public final r.a c(int i7, int i8, boolean z7) {
        Set set;
        Set set2;
        Set set3;
        if (z7) {
            return r.a.TRANSIENT;
        }
        Map map = this.f3849a;
        if (map != null && map.containsKey(Integer.valueOf(i7)) && ((set3 = (Set) this.f3849a.get(Integer.valueOf(i7))) == null || set3.contains(Integer.valueOf(i8)))) {
            return r.a.OTHER;
        }
        Map map2 = this.f3851c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i7)) && ((set2 = (Set) this.f3851c.get(Integer.valueOf(i7))) == null || set2.contains(Integer.valueOf(i8)))) {
            return r.a.LOGIN_RECOVERABLE;
        }
        Map map3 = this.f3850b;
        return (map3 != null && map3.containsKey(Integer.valueOf(i7)) && ((set = (Set) this.f3850b.get(Integer.valueOf(i7))) == null || set.contains(Integer.valueOf(i8)))) ? r.a.TRANSIENT : r.a.OTHER;
    }

    public final String d(r.a aVar) {
        int i7 = aVar == null ? -1 : b.f3855a[aVar.ordinal()];
        if (i7 == 1) {
            return this.f3852d;
        }
        if (i7 == 2) {
            return this.f3854f;
        }
        if (i7 != 3) {
            return null;
        }
        return this.f3853e;
    }
}
