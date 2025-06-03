package A1;

import A1.g;
import O1.C;
import O1.P;
import V5.q;
import V5.t;
import W5.E;
import W5.K;
import W5.w;
import g6.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlin.text.s;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.F;
import x1.N;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f265a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f266b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f267c;

    /* renamed from: d, reason: collision with root package name */
    public static a f268d;

    /* renamed from: e, reason: collision with root package name */
    public static List f269e;

    /* renamed from: f, reason: collision with root package name */
    public static int f270f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f271a;

        /* renamed from: b, reason: collision with root package name */
        public final String f272b;

        /* renamed from: c, reason: collision with root package name */
        public final String f273c;

        public a(String datasetID, String cloudBridgeURL, String accessKey) {
            Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.f271a = datasetID;
            this.f272b = cloudBridgeURL;
            this.f273c = accessKey;
        }

        public final String a() {
            return this.f273c;
        }

        public final String b() {
            return this.f272b;
        }

        public final String c() {
            return this.f271a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.f271a, aVar.f271a) && Intrinsics.a(this.f272b, aVar.f272b) && Intrinsics.a(this.f273c, aVar.f273c);
        }

        public int hashCode() {
            return (((this.f271a.hashCode() * 31) + this.f272b.hashCode()) * 31) + this.f273c.hashCode();
        }

        public String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.f271a + ", cloudBridgeURL=" + this.f272b + ", accessKey=" + this.f273c + ')';
        }
    }

    public static final class b extends kotlin.jvm.internal.l implements p {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f274o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(2);
            this.f274o = list;
        }

        public static final void d(Integer num, List processedEvents) {
            boolean o7;
            Intrinsics.checkNotNullParameter(processedEvents, "$processedEvents");
            o7 = w.o(g.f266b, num);
            if (o7) {
                return;
            }
            g.f265a.g(num, processedEvents, 5);
        }

        public final void b(String str, final Integer num) {
            P p7 = P.f3756a;
            final List list = this.f274o;
            P.B0(new Runnable() { // from class: A1.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.d(num, list);
                }
            });
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((String) obj, (Integer) obj2);
            return t.f6803a;
        }
    }

    static {
        HashSet c7;
        HashSet c8;
        c7 = K.c(200, 202);
        f266b = c7;
        c8 = K.c(503, 504, 429);
        f267c = c8;
    }

    public static final void d(String datasetID, String url, String accessKey) {
        Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        C.f3715e.c(N.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        g gVar = f265a;
        gVar.i(new a(datasetID, url, accessKey));
        gVar.j(new ArrayList());
    }

    public static final void l(final F request) {
        Intrinsics.checkNotNullParameter(request, "request");
        P p7 = P.f3756a;
        P.B0(new Runnable() { // from class: A1.f
            @Override // java.lang.Runnable
            public final void run() {
                g.m(F.this);
            }
        });
    }

    public static final void m(F request) {
        List D7;
        Map b7;
        Intrinsics.checkNotNullParameter(request, "$request");
        String r7 = request.r();
        List V6 = r7 == null ? null : s.V(r7, new String[]{"/"}, false, 0, 6, null);
        if (V6 == null || V6.size() != 2) {
            C.f3715e.c(N.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            g gVar = f265a;
            String str = gVar.e().b() + "/capi/" + gVar.e().c() + "/events";
            List k7 = gVar.k(request);
            if (k7 == null) {
                return;
            }
            gVar.c(k7);
            int min = Math.min(gVar.f().size(), 10);
            D7 = w.D(gVar.f(), new l6.c(0, min - 1));
            gVar.f().subList(0, min).clear();
            JSONArray jSONArray = new JSONArray((Collection) D7);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", gVar.e().a());
            JSONObject jSONObject = new JSONObject(linkedHashMap);
            C.a aVar = C.f3715e;
            N n7 = N.APP_EVENTS;
            String jSONObject2 = jSONObject.toString(2);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonBodyStr.toString(2)");
            aVar.c(n7, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, jSONObject2);
            String jSONObject3 = jSONObject.toString();
            b7 = E.b(q.a("Content-Type", "application/json"));
            gVar.h(str, "POST", jSONObject3, b7, 60000, new b(D7));
        } catch (V5.s e7) {
            C.f3715e.c(N.DEVELOPER_ERRORS, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", e7);
        }
    }

    public final void c(List list) {
        List p7;
        if (list != null) {
            f().addAll(list);
        }
        int max = Math.max(0, f().size() - 1000);
        if (max > 0) {
            p7 = w.p(f(), max);
            j(y.a(p7));
        }
    }

    public final a e() {
        a aVar = f268d;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("credentials");
        throw null;
    }

    public final List f() {
        List list = f269e;
        if (list != null) {
            return list;
        }
        Intrinsics.n("transformedEvents");
        throw null;
    }

    public final void g(Integer num, List processedEvents, int i7) {
        boolean o7;
        Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        o7 = w.o(f267c, num);
        if (o7) {
            if (f270f >= i7) {
                f().clear();
                f270f = 0;
            } else {
                f().addAll(0, processedEvents);
                f270f++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7 A[Catch: IOException -> 0x004b, UnknownHostException -> 0x004e, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x004e, IOException -> 0x004b, blocks: (B:3:0x0011, B:5:0x0022, B:8:0x0051, B:10:0x005d, B:14:0x006d, B:16:0x00a7, B:23:0x00c3, B:31:0x00c9, B:32:0x00cc, B:34:0x00cd, B:36:0x00f0, B:40:0x002a, B:43:0x0031, B:44:0x0035, B:46:0x003b, B:48:0x00fc, B:49:0x0103), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0 A[Catch: IOException -> 0x004b, UnknownHostException -> 0x004e, TryCatch #4 {UnknownHostException -> 0x004e, IOException -> 0x004b, blocks: (B:3:0x0011, B:5:0x0022, B:8:0x0051, B:10:0x005d, B:14:0x006d, B:16:0x00a7, B:23:0x00c3, B:31:0x00c9, B:32:0x00cc, B:34:0x00cd, B:36:0x00f0, B:40:0x002a, B:43:0x0031, B:44:0x0035, B:46:0x003b, B:48:0x00fc, B:49:0x0103), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map r11, int r12, g6.p r13) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.g.h(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, g6.p):void");
    }

    public final void i(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f268d = aVar;
    }

    public final void j(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        f269e = list;
    }

    public final List k(F f7) {
        Map o7;
        JSONObject q7 = f7.q();
        if (q7 == null) {
            return null;
        }
        o7 = W5.F.o(P.n(q7));
        Object w7 = f7.w();
        if (w7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        o7.put("custom_events", w7);
        StringBuilder sb = new StringBuilder();
        for (String str : o7.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(o7.get(str));
            sb.append(System.getProperty("line.separator"));
        }
        C.f3715e.c(N.APP_EVENTS, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", sb);
        return e.f242a.e(o7);
    }
}
