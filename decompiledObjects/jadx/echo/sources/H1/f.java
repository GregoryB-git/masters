package H1;

import G1.k;
import H1.f;
import O1.C0451n;
import O1.P;
import V5.l;
import W5.B;
import W5.o;
import W5.p;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import kotlin.text.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.F;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2181a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2182b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final List f2183c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f2184d;

    public enum a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: H1.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0036a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2188a;

            static {
                int[] iArr = new int[a.valuesCustom().length];
                iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                f2188a = iArr;
            }
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final String e() {
            int i7 = C0036a.f2188a[ordinal()];
            if (i7 == 1) {
                return "integrity_detect";
            }
            if (i7 == 2) {
                return "app_event_pred";
            }
            throw new l();
        }

        public final String h() {
            int i7 = C0036a.f2188a[ordinal()];
            if (i7 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i7 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new l();
        }
    }

    public static final class b {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2189i = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public String f2190a;

        /* renamed from: b, reason: collision with root package name */
        public String f2191b;

        /* renamed from: c, reason: collision with root package name */
        public String f2192c;

        /* renamed from: d, reason: collision with root package name */
        public int f2193d;

        /* renamed from: e, reason: collision with root package name */
        public float[] f2194e;

        /* renamed from: f, reason: collision with root package name */
        public File f2195f;

        /* renamed from: g, reason: collision with root package name */
        public H1.b f2196g;

        /* renamed from: h, reason: collision with root package name */
        public Runnable f2197h;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public static final void g(List slaves, File file) {
                Intrinsics.checkNotNullParameter(slaves, "$slaves");
                Intrinsics.checkNotNullParameter(file, "file");
                final H1.b a7 = H1.b.f2167m.a(file);
                if (a7 != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final b bVar = (b) it.next();
                        b.f2189i.e(bVar.e(), bVar.g() + '_' + bVar.h() + "_rule", new k.a() { // from class: H1.h
                            @Override // G1.k.a
                            public final void a(File file2) {
                                f.b.a.h(f.b.this, a7, file2);
                            }
                        });
                    }
                }
            }

            public static final void h(b slave, H1.b bVar, File file) {
                Intrinsics.checkNotNullParameter(slave, "$slave");
                Intrinsics.checkNotNullParameter(file, "file");
                slave.i(bVar);
                slave.k(file);
                Runnable runnable = slave.f2197h;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            public final b c(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString("use_case");
                    String assetUri = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", null);
                    int i7 = jSONObject.getInt("version_id");
                    float[] d7 = f.d(f.f2181a, jSONObject.getJSONArray("thresholds"));
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new b(useCase, assetUri, optString, i7, d7);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void d(String str, int i7) {
                File[] listFiles;
                boolean s7;
                boolean s8;
                File a7 = j.a();
                if (a7 == null || (listFiles = a7.listFiles()) == null || listFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i7;
                int length = listFiles.length;
                int i8 = 0;
                while (i8 < length) {
                    File file = listFiles[i8];
                    i8++;
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    s7 = r.s(name, str, false, 2, null);
                    if (s7) {
                        s8 = r.s(name, str2, false, 2, null);
                        if (!s8) {
                            file.delete();
                        }
                    }
                }
            }

            public final void e(String str, String str2, k.a aVar) {
                File file = new File(j.a(), str2);
                if (str == null || file.exists()) {
                    aVar.a(file);
                } else {
                    new k(str, file, aVar).execute(new String[0]);
                }
            }

            public final void f(b master, final List slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                d(master.g(), master.h());
                e(master.b(), master.g() + '_' + master.h(), new k.a() { // from class: H1.g
                    @Override // G1.k.a
                    public final void a(File file) {
                        f.b.a.g(slaves, file);
                    }
                });
            }
        }

        public b(String useCase, String assetUri, String str, int i7, float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.f2190a = useCase;
            this.f2191b = assetUri;
            this.f2192c = str;
            this.f2193d = i7;
            this.f2194e = fArr;
        }

        public final String b() {
            return this.f2191b;
        }

        public final H1.b c() {
            return this.f2196g;
        }

        public final File d() {
            return this.f2195f;
        }

        public final String e() {
            return this.f2192c;
        }

        public final float[] f() {
            return this.f2194e;
        }

        public final String g() {
            return this.f2190a;
        }

        public final int h() {
            return this.f2193d;
        }

        public final void i(H1.b bVar) {
            this.f2196g = bVar;
        }

        public final b j(Runnable runnable) {
            this.f2197h = runnable;
            return this;
        }

        public final void k(File file) {
            this.f2195f = file;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2198a;

        static {
            int[] iArr = new int[a.valuesCustom().length];
            iArr[a.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[a.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            f2198a = iArr;
        }
    }

    static {
        List i7;
        List i8;
        i7 = o.i("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        f2183c = i7;
        i8 = o.i("none", "address", "health");
        f2184d = i8;
    }

    public static final /* synthetic */ float[] d(f fVar, JSONArray jSONArray) {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            return fVar.o(jSONArray);
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public static final void f() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            P p7 = P.f3756a;
            P.B0(new Runnable() { // from class: H1.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.g();
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: all -> 0x002c, Exception -> 0x007d, TryCatch #2 {Exception -> 0x007d, all -> 0x002c, blocks: (B:6:0x000d, B:8:0x001f, B:11:0x0026, B:12:0x0033, B:14:0x0043, B:16:0x0049, B:18:0x0071, B:21:0x0051, B:24:0x005a, B:25:0x002e), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g() {
        /*
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            java.lang.Class<H1.f> r2 = H1.f.class
            boolean r3 = T1.a.d(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            android.content.Context r3 = x1.C2146B.l()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            java.lang.String r4 = "com.facebook.internal.MODEL_STORE"
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r4 = 0
            java.lang.String r4 = r3.getString(r1, r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L2e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r5 != 0) goto L26
            goto L2e
        L26:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            goto L33
        L2c:
            r0 = move-exception
            goto L7a
        L2e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r5.<init>()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
        L33:
            r6 = 0
            long r6 = r3.getLong(r0, r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            O1.n r4 = O1.C0451n.f3862a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            O1.n$b r4 = O1.C0451n.b.ModelRequest     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            boolean r4 = O1.C0451n.g(r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L51
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 == 0) goto L51
            H1.f r4 = H1.f.f2181a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            boolean r4 = r4.n(r6)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r4 != 0) goto L71
        L51:
            H1.f r4 = H1.f.f2181a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            org.json.JSONObject r5 = r4.k()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            if (r5 != 0) goto L5a
            return
        L5a:
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            android.content.SharedPreferences$Editor r1 = r3.putString(r1, r4)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.apply()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
        L71:
            H1.f r0 = H1.f.f2181a     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.e(r5)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            r0.h()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L7d
            goto L7d
        L7a:
            T1.a.b(r0, r2)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.f.g():void");
    }

    public static final void i() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            K1.e.b();
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public static final void j() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            F1.a.a();
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public static final File l(a task) {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            b bVar = (b) f2182b.get(task.h());
            if (bVar == null) {
                return null;
            }
            return bVar.d();
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public static final String[] q(a task, float[][] denses, String[] texts) {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            b bVar = (b) f2182b.get(task.h());
            H1.b c7 = bVar == null ? null : bVar.c();
            if (c7 == null) {
                return null;
            }
            float[] f7 = bVar.f();
            int length = texts.length;
            int length2 = denses[0].length;
            H1.a aVar = new H1.a(new int[]{length, length2});
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    System.arraycopy(denses[i7], 0, aVar.a(), i7 * length2, length2);
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
            }
            H1.a b7 = c7.b(aVar, texts, task.e());
            if (b7 != null && f7 != null && b7.a().length != 0 && f7.length != 0) {
                int i9 = c.f2198a[task.ordinal()];
                if (i9 == 1) {
                    return f2181a.s(b7, f7);
                }
                if (i9 == 2) {
                    return f2181a.r(b7, f7);
                }
                throw new l();
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public final void e(JSONObject jSONObject) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    b c7 = b.f2189i.c(jSONObject.getJSONObject(keys.next()));
                    if (c7 != null) {
                        f2182b.put(c7.g(), c7);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i7 = 0;
            for (Map.Entry entry : f2182b.entrySet()) {
                String str2 = (String) entry.getKey();
                b bVar = (b) entry.getValue();
                if (Intrinsics.a(str2, a.MTML_APP_EVENT_PREDICTION.h())) {
                    String b7 = bVar.b();
                    int max = Math.max(i7, bVar.h());
                    C0451n c0451n = C0451n.f3862a;
                    if (C0451n.g(C0451n.b.SuggestedEvents) && m()) {
                        arrayList.add(bVar.j(new Runnable() { // from class: H1.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.i();
                            }
                        }));
                    }
                    str = b7;
                    i7 = max;
                }
                if (Intrinsics.a(str2, a.MTML_INTEGRITY_DETECT.h())) {
                    str = bVar.b();
                    i7 = Math.max(i7, bVar.h());
                    C0451n c0451n2 = C0451n.f3862a;
                    if (C0451n.g(C0451n.b.IntelligentIntegrity)) {
                        arrayList.add(bVar.j(new Runnable() { // from class: H1.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.j();
                            }
                        }));
                    }
                }
            }
            if (str == null || i7 <= 0 || arrayList.isEmpty()) {
                return;
            }
            b.f2189i.f(new b("MTML", str, null, i7, null), arrayList);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final JSONObject k() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            F x7 = F.f20890n.x(null, "app/model_asset", null);
            x7.G(bundle);
            JSONObject c7 = x7.k().c();
            if (c7 == null) {
                return null;
            }
            return p(c7);
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean m() {
        boolean v7;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Locale N6 = P.N();
            if (N6 != null) {
                String language = N6.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                v7 = s.v(language, "en", false, 2, null);
                if (!v7) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean n(long j7) {
        if (T1.a.d(this) || j7 == 0) {
            return false;
        }
        try {
            return System.currentTimeMillis() - j7 < 259200000;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final float[] o(JSONArray jSONArray) {
        if (T1.a.d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    try {
                        String string = jSONArray.getString(i7);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        fArr[i7] = Float.parseFloat(string);
                    } catch (JSONException unused) {
                    }
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return fArr;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final JSONObject p(JSONObject jSONObject) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject2;
                }
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                    if (i8 >= length) {
                        return jSONObject2;
                    }
                    i7 = i8;
                }
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final String[] r(H1.a aVar, float[] fArr) {
        l6.c g7;
        int l7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            int b7 = aVar.b(0);
            int b8 = aVar.b(1);
            float[] a7 = aVar.a();
            if (b8 != fArr.length) {
                return null;
            }
            g7 = l6.f.g(0, b7);
            l7 = p.l(g7, 10);
            ArrayList arrayList = new ArrayList(l7);
            Iterator it = g7.iterator();
            while (it.hasNext()) {
                int b9 = ((B) it).b();
                Object obj = "none";
                int length = fArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = i8 + 1;
                    if (a7[(b9 * b8) + i8] >= fArr[i7]) {
                        obj = f2184d.get(i8);
                    }
                    i7++;
                    i8 = i9;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final String[] s(H1.a aVar, float[] fArr) {
        l6.c g7;
        int l7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            int b7 = aVar.b(0);
            int b8 = aVar.b(1);
            float[] a7 = aVar.a();
            if (b8 != fArr.length) {
                return null;
            }
            g7 = l6.f.g(0, b7);
            l7 = p.l(g7, 10);
            ArrayList arrayList = new ArrayList(l7);
            Iterator it = g7.iterator();
            while (it.hasNext()) {
                int b9 = ((B) it).b();
                Object obj = "other";
                int length = fArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    int i9 = i8 + 1;
                    if (a7[(b9 * b8) + i8] >= fArr[i7]) {
                        obj = f2183c.get(i8);
                    }
                    i7++;
                    i8 = i9;
                }
                arrayList.add((String) obj);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }
}
