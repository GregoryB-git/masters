package x1;

import O1.C;
import W5.C0681k;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.F;
import x1.J;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: n, reason: collision with root package name */
    public static final c f20890n = new c(null);

    /* renamed from: o, reason: collision with root package name */
    public static final String f20891o = F.class.getSimpleName();

    /* renamed from: p, reason: collision with root package name */
    public static final String f20892p;

    /* renamed from: q, reason: collision with root package name */
    public static String f20893q;

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f20894r;

    /* renamed from: s, reason: collision with root package name */
    public static volatile String f20895s;

    /* renamed from: a, reason: collision with root package name */
    public C2148a f20896a;

    /* renamed from: b, reason: collision with root package name */
    public String f20897b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f20898c;

    /* renamed from: d, reason: collision with root package name */
    public String f20899d;

    /* renamed from: e, reason: collision with root package name */
    public String f20900e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20901f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f20902g;

    /* renamed from: h, reason: collision with root package name */
    public Object f20903h;

    /* renamed from: i, reason: collision with root package name */
    public String f20904i;

    /* renamed from: j, reason: collision with root package name */
    public b f20905j;

    /* renamed from: k, reason: collision with root package name */
    public L f20906k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20907l;

    /* renamed from: m, reason: collision with root package name */
    public String f20908m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final F f20909a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f20910b;

        public a(F request, Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f20909a = request;
            this.f20910b = obj;
        }

        public final F a() {
            return this.f20909a;
        }

        public final Object b() {
            return this.f20910b;
        }
    }

    public interface b {
        void a(K k7);
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static final void H(ArrayList callbacks, J requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                b bVar = (b) pair.first;
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                bVar.a((K) obj);
            }
            Iterator it2 = requests.T().iterator();
            while (it2.hasNext()) {
                ((J.a) it2.next()).a(requests);
            }
        }

        public static final void z(d dVar, K response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (dVar == null) {
                return;
            }
            dVar.a(response.c(), response);
        }

        public final F A(C2148a c2148a, String str, JSONObject jSONObject, b bVar) {
            F f7 = new F(c2148a, str, null, L.POST, bVar, null, 32, null);
            f7.E(jSONObject);
            return f7;
        }

        public final F B(C2148a c2148a, String str, Bundle bundle, b bVar) {
            return new F(c2148a, str, bundle, L.POST, bVar, null, 32, null);
        }

        public final String C(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
            return format;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void D(org.json.JSONObject r10, java.lang.String r11, x1.F.e r12) {
            /*
                r9 = this;
                boolean r0 = r9.u(r11)
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L23
                r7 = 6
                r8 = 0
                java.lang.String r4 = ":"
                r5 = 0
                r6 = 0
                r3 = r11
                int r0 = kotlin.text.i.D(r3, r4, r5, r6, r7, r8)
                java.lang.String r4 = "?"
                int r11 = kotlin.text.i.D(r3, r4, r5, r6, r7, r8)
                r3 = 3
                if (r0 <= r3) goto L23
                r3 = -1
                if (r11 == r3) goto L21
                if (r0 >= r11) goto L23
            L21:
                r11 = r1
                goto L24
            L23:
                r11 = r2
            L24:
                java.util.Iterator r0 = r10.keys()
            L28:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L53
                java.lang.Object r3 = r0.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r10.opt(r3)
                if (r11 == 0) goto L44
                java.lang.String r5 = "image"
                boolean r5 = kotlin.text.i.l(r3, r5, r1)
                if (r5 == 0) goto L44
                r5 = r1
                goto L45
            L44:
                r5 = r2
            L45:
                java.lang.String r6 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
                java.lang.String r6 = "value"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
                r9.E(r3, r4, r12, r5)
                goto L28
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.F.c.D(org.json.JSONObject, java.lang.String, x1.F$e):void");
        }

        public final void E(String str, Object obj, e eVar, boolean z7) {
            String obj2;
            String jSONObject;
            String str2;
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (z7) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject2.opt(next);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        E(format, opt, eVar, z7);
                    }
                    return;
                }
                if (jSONObject2.has("id")) {
                    jSONObject = jSONObject2.optString("id");
                    str2 = "jsonObject.optString(\"id\")";
                } else if (jSONObject2.has("url")) {
                    jSONObject = jSONObject2.optString("url");
                    str2 = "jsonObject.optString(\"url\")";
                } else {
                    if (!jSONObject2.has("fbsdk:create_object")) {
                        return;
                    }
                    jSONObject = jSONObject2.toString();
                    str2 = "jsonObject.toString()";
                }
                Intrinsics.checkNotNullExpressionValue(jSONObject, str2);
                E(str, jSONObject, eVar, z7);
                return;
            }
            if (!JSONArray.class.isAssignableFrom(cls)) {
                if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                    obj2 = obj.toString();
                } else {
                    if (!Date.class.isAssignableFrom(cls)) {
                        O1.P p7 = O1.P.f3756a;
                        O1.P.j0(F.f20891o, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                        return;
                    }
                    obj2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(obj2, "iso8601DateFormat.format(date)");
                }
                eVar.a(str, obj2);
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length <= 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                kotlin.jvm.internal.x xVar2 = kotlin.jvm.internal.x.f16233a;
                String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i7)}, 2));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                Object opt2 = jSONArray.opt(i7);
                Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                E(format2, opt2, eVar, z7);
                if (i8 >= length) {
                    return;
                } else {
                    i7 = i8;
                }
            }
        }

        public final void F(J j7, O1.C c7, int i7, URL url, OutputStream outputStream, boolean z7) {
            g gVar = new g(outputStream, c7, z7);
            if (i7 != 1) {
                String p7 = p(j7);
                if (p7.length() == 0) {
                    throw new C2162o("App ID was not specified at the request or Settings.");
                }
                gVar.a("batch_app_id", p7);
                HashMap hashMap = new HashMap();
                K(gVar, j7, hashMap);
                if (c7 != null) {
                    c7.b("  Attachments:\n");
                }
                I(hashMap, gVar);
                return;
            }
            F f7 = j7.get(0);
            HashMap hashMap2 = new HashMap();
            for (String key : f7.u().keySet()) {
                Object obj = f7.u().get(key);
                if (v(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, new a(f7, obj));
                }
            }
            if (c7 != null) {
                c7.b("  Parameters:\n");
            }
            J(f7.u(), gVar, f7);
            if (c7 != null) {
                c7.b("  Attachments:\n");
            }
            I(hashMap2, gVar);
            JSONObject q7 = f7.q();
            if (q7 != null) {
                String path = url.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "url.path");
                D(q7, path, gVar);
            }
        }

        public final void G(final J requests, List responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            if (size > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    F f7 = requests.get(i7);
                    if (f7.o() != null) {
                        arrayList.add(new Pair(f7.o(), responses.get(i7)));
                    }
                    if (i8 >= size) {
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: x1.H
                    @Override // java.lang.Runnable
                    public final void run() {
                        F.c.H(arrayList, requests);
                    }
                };
                Handler S6 = requests.S();
                if ((S6 == null ? null : Boolean.valueOf(S6.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        public final void I(Map map, g gVar) {
            for (Map.Entry entry : map.entrySet()) {
                if (F.f20890n.v(((a) entry.getValue()).b())) {
                    gVar.j((String) entry.getKey(), ((a) entry.getValue()).b(), ((a) entry.getValue()).a());
                }
            }
        }

        public final void J(Bundle bundle, g gVar, F f7) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (w(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    gVar.j(key, obj, f7);
                }
            }
        }

        public final void K(g gVar, Collection collection, Map map) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((F) it.next()).B(jSONArray, map);
            }
            gVar.l("batch", jSONArray, collection);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void L(x1.J r14, java.net.HttpURLConnection r15) {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.F.c.L(x1.J, java.net.HttpURLConnection):void");
        }

        public final void M(HttpURLConnection httpURLConnection, boolean z7) {
            if (!z7) {
                httpURLConnection.setRequestProperty("Content-Type", q());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        public final HttpURLConnection N(J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            O(requests);
            try {
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = g(requests.size() == 1 ? new URL(requests.get(0).x()) : new URL(O1.H.h()));
                    L(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e7) {
                    O1.P.q(httpURLConnection);
                    throw new C2162o("could not construct request body", e7);
                } catch (JSONException e8) {
                    O1.P.q(httpURLConnection);
                    throw new C2162o("could not construct request body", e8);
                }
            } catch (MalformedURLException e9) {
                throw new C2162o("could not construct URL for request", e9);
            }
        }

        public final void O(J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<E> it = requests.iterator();
            while (it.hasNext()) {
                F f7 = (F) it.next();
                if (L.GET == f7.t()) {
                    O1.P p7 = O1.P.f3756a;
                    if (O1.P.c0(f7.u().getString("fields"))) {
                        C.a aVar = O1.C.f3715e;
                        N n7 = N.DEVELOPER_ERRORS;
                        StringBuilder sb = new StringBuilder();
                        sb.append("GET requests for /");
                        String r7 = f7.r();
                        if (r7 == null) {
                            r7 = "";
                        }
                        sb.append(r7);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        aVar.a(n7, 5, "Request", sb.toString());
                    }
                }
            }
        }

        public final HttpURLConnection g(URL url) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        public final K h(F request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List k7 = k(request);
            if (k7.size() == 1) {
                return (K) k7.get(0);
            }
            throw new C2162o("invalid state: expected a single response");
        }

        public final List i(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return j(new J(requests));
        }

        public final List j(J requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            O1.Q.i(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = N(requests);
                exc = null;
            } catch (Exception e7) {
                exc = e7;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                O1.P.q(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = o(httpURLConnection, requests);
                } else {
                    List a7 = K.f20934i.a(requests.V(), null, new C2162o(exc));
                    G(requests, a7);
                    list = a7;
                }
                O1.P.q(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                O1.P.q(httpURLConnection2);
                throw th;
            }
        }

        public final List k(F... requests) {
            List u7;
            Intrinsics.checkNotNullParameter(requests, "requests");
            u7 = C0681k.u(requests);
            return i(u7);
        }

        public final I l(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return m(new J(requests));
        }

        public final I m(J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            O1.Q.i(requests, "requests");
            I i7 = new I(requests);
            i7.executeOnExecutor(C2146B.t(), new Void[0]);
            return i7;
        }

        public final I n(F... requests) {
            List u7;
            Intrinsics.checkNotNullParameter(requests, "requests");
            u7 = C0681k.u(requests);
            return l(u7);
        }

        public final List o(HttpURLConnection connection, J requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List f7 = K.f20934i.f(connection, requests);
            O1.P.q(connection);
            int size = requests.size();
            if (size == f7.size()) {
                G(requests, f7);
                C2154g.f21044f.e().h();
                return f7;
            }
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(f7.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new C2162o(format);
        }

        public final String p(J j7) {
            String M6 = j7.M();
            if (M6 != null && (!j7.isEmpty())) {
                return M6;
            }
            Iterator<E> it = j7.iterator();
            while (it.hasNext()) {
                C2148a m7 = ((F) it.next()).m();
                if (m7 != null) {
                    return m7.c();
                }
            }
            String str = F.f20893q;
            return (str == null || str.length() <= 0) ? C2146B.m() : str;
        }

        public final String q() {
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{F.f20892p}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        public final String r() {
            if (F.f20895s == null) {
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "16.3.0"}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                F.f20895s = format;
                String a7 = O1.z.a();
                if (!O1.P.c0(a7)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{F.f20895s, a7}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    F.f20895s = format2;
                }
            }
            return F.f20895s;
        }

        public final boolean s(J j7) {
            for (J.a aVar : j7.T()) {
            }
            Iterator<E> it = j7.iterator();
            while (it.hasNext()) {
                ((F) it.next()).o();
            }
            return false;
        }

        public final boolean t(J j7) {
            Iterator<E> it = j7.iterator();
            while (it.hasNext()) {
                F f7 = (F) it.next();
                Iterator<String> it2 = f7.u().keySet().iterator();
                while (it2.hasNext()) {
                    if (v(f7.u().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final boolean u(String str) {
            boolean s7;
            boolean s8;
            Matcher matcher = F.f20894r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            s7 = kotlin.text.r.s(str, "me/", false, 2, null);
            if (s7) {
                return true;
            }
            s8 = kotlin.text.r.s(str, "/me/", false, 2, null);
            return s8;
        }

        public final boolean v(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof f);
        }

        public final boolean w(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        public final F x(C2148a c2148a, String str, b bVar) {
            return new F(c2148a, str, null, null, bVar, null, 32, null);
        }

        public final F y(C2148a c2148a, final d dVar) {
            return new F(c2148a, "me", null, null, new b(dVar) { // from class: x1.G
                @Override // x1.F.b
                public final void a(K k7) {
                    F.c.z(null, k7);
                }
            }, null, 32, null);
        }
    }

    public interface d {
        void a(JSONObject jSONObject, K k7);
    }

    public interface e {
        void a(String str, String str2);
    }

    public static final class f implements Parcelable {

        /* renamed from: o, reason: collision with root package name */
        public final String f20912o;

        /* renamed from: p, reason: collision with root package name */
        public final Parcelable f20913p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f20911q = new b(null);

        @NotNull
        public static final Parcelable.Creator<f> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new f(source, (kotlin.jvm.internal.g) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i7) {
                return new f[i7];
            }
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public f(Parcel parcel) {
            this.f20912o = parcel.readString();
            this.f20913p = parcel.readParcelable(C2146B.l().getClassLoader());
        }

        public final String a() {
            return this.f20912o;
        }

        public final Parcelable b() {
            return this.f20913p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i7) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f20912o);
            out.writeParcelable(this.f20913p, i7);
        }

        public /* synthetic */ f(Parcel parcel, kotlin.jvm.internal.g gVar) {
            this(parcel);
        }

        public f(Parcelable parcelable, String str) {
            this.f20912o = str;
            this.f20913p = parcelable;
        }
    }

    public static final class g implements e {

        /* renamed from: a, reason: collision with root package name */
        public final OutputStream f20914a;

        /* renamed from: b, reason: collision with root package name */
        public final O1.C f20915b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f20916c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f20917d;

        public g(OutputStream outputStream, O1.C c7, boolean z7) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.f20914a = outputStream;
            this.f20915b = c7;
            this.f20916c = true;
            this.f20917d = z7;
        }

        @Override // x1.F.e
        public void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            f(key, null, null);
            i("%s", value);
            k();
            O1.C c7 = this.f20915b;
            if (c7 == null) {
                return;
            }
            c7.d(Intrinsics.i("    ", key), value);
        }

        public final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void c(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (this.f20917d) {
                OutputStream outputStream = this.f20914a;
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                Locale locale = Locale.US;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                String encode = URLEncoder.encode(format2, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
                byte[] bytes = encode.getBytes(kotlin.text.b.f16240b);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f20916c) {
                OutputStream outputStream2 = this.f20914a;
                Charset charset = kotlin.text.b.f16240b;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f20914a;
                String str = F.f20892p;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes3 = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f20914a;
                byte[] bytes4 = "\r\n".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f20916c = false;
            }
            OutputStream outputStream5 = this.f20914a;
            kotlin.jvm.internal.x xVar2 = kotlin.jvm.internal.x.f16233a;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(format, Arrays.copyOf(copyOf2, copyOf2.length));
            Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(format, *args)");
            byte[] bytes5 = format3.getBytes(kotlin.text.b.f16240b);
            Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void d(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            f(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f20914a);
            i("", new Object[0]);
            k();
            O1.C c7 = this.f20915b;
            if (c7 == null) {
                return;
            }
            c7.d(Intrinsics.i("    ", key), "<Image>");
        }

        public final void e(String key, byte[] bytes) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            f(key, key, "content/unknown");
            this.f20914a.write(bytes);
            i("", new Object[0]);
            k();
            O1.C c7 = this.f20915b;
            if (c7 == null) {
                return;
            }
            String i7 = Intrinsics.i("    ", key);
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            c7.d(i7, format);
        }

        public final void f(String str, String str2, String str3) {
            if (this.f20917d) {
                OutputStream outputStream = this.f20914a;
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                byte[] bytes = format.getBytes(kotlin.text.b.f16240b);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            c("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                c("; filename=\"%s\"", str2);
            }
            i("", new Object[0]);
            if (str3 != null) {
                i("%s: %s", "Content-Type", str3);
            }
            i("", new Object[0]);
        }

        public final void g(String key, Uri contentUri, String str) {
            int p7;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            if (this.f20914a instanceof S) {
                ((S) this.f20914a).b(O1.P.z(contentUri));
                p7 = 0;
            } else {
                InputStream openInputStream = C2146B.l().getContentResolver().openInputStream(contentUri);
                O1.P p8 = O1.P.f3756a;
                p7 = O1.P.p(openInputStream, this.f20914a);
            }
            i("", new Object[0]);
            k();
            O1.C c7 = this.f20915b;
            if (c7 == null) {
                return;
            }
            String i7 = Intrinsics.i("    ", key);
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p7)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            c7.d(i7, format);
        }

        public final void h(String key, ParcelFileDescriptor descriptor, String str) {
            int p7;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            f(key, key, str);
            OutputStream outputStream = this.f20914a;
            if (outputStream instanceof S) {
                ((S) outputStream).b(descriptor.getStatSize());
                p7 = 0;
            } else {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                O1.P p8 = O1.P.f3756a;
                p7 = O1.P.p(autoCloseInputStream, this.f20914a);
            }
            i("", new Object[0]);
            k();
            O1.C c7 = this.f20915b;
            if (c7 == null) {
                return;
            }
            String i7 = Intrinsics.i("    ", key);
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(p7)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            c7.d(i7, format);
        }

        public final void i(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            c(format, Arrays.copyOf(args, args.length));
            if (this.f20917d) {
                return;
            }
            c("\r\n", new Object[0]);
        }

        public final void j(String key, Object obj, F f7) {
            Intrinsics.checkNotNullParameter(key, "key");
            Closeable closeable = this.f20914a;
            if (closeable instanceof U) {
                ((U) closeable).a(f7);
            }
            c cVar = F.f20890n;
            if (cVar.w(obj)) {
                a(key, cVar.C(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                d(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                e(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                g(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof f)) {
                throw b();
            }
            f fVar = (f) obj;
            Parcelable b7 = fVar.b();
            String a7 = fVar.a();
            if (b7 instanceof ParcelFileDescriptor) {
                h(key, (ParcelFileDescriptor) b7, a7);
            } else {
                if (!(b7 instanceof Uri)) {
                    throw b();
                }
                g(key, (Uri) b7, a7);
            }
        }

        public final void k() {
            if (!this.f20917d) {
                i("--%s", F.f20892p);
                return;
            }
            OutputStream outputStream = this.f20914a;
            byte[] bytes = "&".getBytes(kotlin.text.b.f16240b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void l(String key, JSONArray requestJsonArray, Collection requests) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = this.f20914a;
            if (!(closeable instanceof U)) {
                String jSONArray = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                a(key, jSONArray);
                return;
            }
            U u7 = (U) closeable;
            f(key, null, null);
            c("[", new Object[0]);
            Iterator it = requests.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                int i8 = i7 + 1;
                F f7 = (F) it.next();
                JSONObject jSONObject = requestJsonArray.getJSONObject(i7);
                u7.a(f7);
                if (i7 > 0) {
                    c(",%s", jSONObject.toString());
                } else {
                    c("%s", jSONObject.toString());
                }
                i7 = i8;
            }
            c("]", new Object[0]);
            O1.C c7 = this.f20915b;
            if (c7 == null) {
                return;
            }
            String i9 = Intrinsics.i("    ", key);
            String jSONArray2 = requestJsonArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
            c7.d(i9, jSONArray2);
        }
    }

    public static final class h implements e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f20918a;

        public h(ArrayList arrayList) {
            this.f20918a = arrayList;
        }

        @Override // x1.F.e
        public void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f20918a;
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i7 = 0;
            do {
                i7++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i7 < nextInt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        f20892p = sb2;
        f20894r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public F(C2148a c2148a, String str, Bundle bundle, L l7, b bVar, String str2) {
        this.f20901f = true;
        this.f20896a = c2148a;
        this.f20897b = str;
        this.f20904i = str2;
        C(bVar);
        F(l7);
        this.f20902g = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f20904i == null) {
            this.f20904i = C2146B.w();
        }
    }

    public static final void b(b bVar, K response) {
        int length;
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject c7 = response.c();
        JSONObject optJSONObject = c7 == null ? null : c7.optJSONObject("__debug__");
        JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray("messages");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i7);
                String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                if (optString != null && optString2 != null) {
                    N n7 = N.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.a(optString2, "warning")) {
                        n7 = N.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!O1.P.c0(optString3)) {
                        optString = ((Object) optString) + " Link: " + ((Object) optString3);
                    }
                    C.a aVar = O1.C.f3715e;
                    String TAG = f20891o;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    aVar.b(n7, TAG, optString);
                }
                if (i8 >= length) {
                    break;
                } else {
                    i7 = i8;
                }
            }
        }
        if (bVar == null) {
            return;
        }
        bVar.a(response);
    }

    public final boolean A() {
        if (Intrinsics.a(C2146B.x(), "instagram.com")) {
            return !z();
        }
        return true;
    }

    public final void B(JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String str = this.f20899d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f20901f);
        }
        String str2 = this.f20900e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String v7 = v();
        jSONObject.put("relative_url", v7);
        jSONObject.put("method", this.f20906k);
        C2148a c2148a = this.f20896a;
        if (c2148a != null) {
            O1.C.f3715e.d(c2148a.l());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f20902g.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.f20902g.get(it.next());
            if (f20890n.v(obj)) {
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f20898c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f20890n.D(jSONObject2, v7, new h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    public final void C(final b bVar) {
        C2146B c2146b = C2146B.f20862a;
        if (C2146B.H(N.GRAPH_API_DEBUG_INFO) || C2146B.H(N.GRAPH_API_DEBUG_WARNING)) {
            this.f20905j = new b() { // from class: x1.E
                @Override // x1.F.b
                public final void a(K k7) {
                    F.b(F.b.this, k7);
                }
            };
        } else {
            this.f20905j = bVar;
        }
    }

    public final void D(boolean z7) {
        this.f20907l = z7;
    }

    public final void E(JSONObject jSONObject) {
        this.f20898c = jSONObject;
    }

    public final void F(L l7) {
        if (this.f20908m != null && l7 != L.GET) {
            throw new C2162o("Can't change HTTP method on request with overridden URL.");
        }
        if (l7 == null) {
            l7 = L.GET;
        }
        this.f20906k = l7;
    }

    public final void G(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.f20902g = bundle;
    }

    public final void H(Object obj) {
        this.f20903h = obj;
    }

    public final boolean I() {
        boolean s7;
        String n7 = n();
        boolean v7 = n7 == null ? false : kotlin.text.s.v(n7, "|", false, 2, null);
        if (n7 != null) {
            s7 = kotlin.text.r.s(n7, "IG", false, 2, null);
            if (s7 && !v7 && z()) {
                return true;
            }
        }
        return (A() || v7) ? false : true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 java.lang.String, still in use, count: 2, list:
          (r1v1 java.lang.String) from 0x0016: IF  (r1v1 java.lang.String) != (null java.lang.String)  -> B:4:0x000e A[HIDDEN] (LINE:23)
          (r1v1 java.lang.String) from 0x000e: PHI (r1v17 java.lang.String) = (r1v1 java.lang.String) binds: [B:21:0x0016] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final void i() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.f20902g
            boolean r1 = r3.I()
            java.lang.String r2 = "access_token"
            if (r1 == 0) goto L12
            java.lang.String r1 = r3.p()
        Le:
            r0.putString(r2, r1)
            goto L19
        L12:
            java.lang.String r1 = r3.n()
            if (r1 == 0) goto L19
            goto Le
        L19:
            boolean r1 = r0.containsKey(r2)
            if (r1 != 0) goto L32
            O1.P r1 = O1.P.f3756a
            java.lang.String r1 = x1.C2146B.r()
            boolean r1 = O1.P.c0(r1)
            if (r1 == 0) goto L32
            java.lang.String r1 = x1.F.f20891o
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
        L32:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            x1.B r1 = x1.C2146B.f20862a
            x1.N r1 = x1.N.GRAPH_API_DEBUG_INFO
            boolean r1 = x1.C2146B.H(r1)
            java.lang.String r2 = "debug"
            if (r1 == 0) goto L52
            java.lang.String r1 = "info"
        L4e:
            r0.putString(r2, r1)
            goto L5d
        L52:
            x1.N r1 = x1.N.GRAPH_API_DEBUG_WARNING
            boolean r1 = x1.C2146B.H(r1)
            if (r1 == 0) goto L5d
            java.lang.String r1 = "warning"
            goto L4e
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.F.i():void");
    }

    public final String j(String str, boolean z7) {
        if (!z7 && this.f20906k == L.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f20902g.keySet()) {
            Object obj = this.f20902g.get(str2);
            if (obj == null) {
                obj = "";
            }
            c cVar = f20890n;
            if (cVar.w(obj)) {
                buildUpon.appendQueryParameter(str2, cVar.C(obj).toString());
            } else if (this.f20906k != L.GET) {
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    public final K k() {
        return f20890n.h(this);
    }

    public final I l() {
        return f20890n.n(this);
    }

    public final C2148a m() {
        return this.f20896a;
    }

    public final String n() {
        C2148a c2148a = this.f20896a;
        if (c2148a != null) {
            if (!this.f20902g.containsKey("access_token")) {
                String l7 = c2148a.l();
                O1.C.f3715e.d(l7);
                return l7;
            }
        } else if (!this.f20902g.containsKey("access_token")) {
            return p();
        }
        return this.f20902g.getString("access_token");
    }

    public final b o() {
        return this.f20905j;
    }

    public final String p() {
        String m7 = C2146B.m();
        String r7 = C2146B.r();
        if (m7.length() <= 0 || r7.length() <= 0) {
            O1.P p7 = O1.P.f3756a;
            O1.P.j0(f20891o, "Warning: Request without access token missing application ID or client token.");
            return null;
        }
        return m7 + '|' + r7;
    }

    public final JSONObject q() {
        return this.f20898c;
    }

    public final String r() {
        return this.f20897b;
    }

    public final String s() {
        if (f20894r.matcher(this.f20897b).matches()) {
            return this.f20897b;
        }
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f20904i, this.f20897b}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final L t() {
        return this.f20906k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f20896a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f20897b);
        sb.append(", graphObject: ");
        sb.append(this.f20898c);
        sb.append(", httpMethod: ");
        sb.append(this.f20906k);
        sb.append(", parameters: ");
        sb.append(this.f20902g);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    public final Bundle u() {
        return this.f20902g;
    }

    public final String v() {
        if (this.f20908m != null) {
            throw new C2162o("Can't override URL for a batch request");
        }
        String y7 = y(O1.H.h());
        i();
        Uri parse = Uri.parse(j(y7, true));
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("%s?%s", Arrays.copyOf(new Object[]{parse.getPath(), parse.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final Object w() {
        return this.f20903h;
    }

    public final String x() {
        String i7;
        boolean k7;
        String str = this.f20908m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f20897b;
        if (this.f20906k == L.POST && str2 != null) {
            k7 = kotlin.text.r.k(str2, "/videos", false, 2, null);
            if (k7) {
                i7 = O1.H.j();
                String y7 = y(i7);
                i();
                return j(y7, false);
            }
        }
        O1.H h7 = O1.H.f3745a;
        i7 = O1.H.i(C2146B.x());
        String y72 = y(i7);
        i();
        return j(y72, false);
    }

    public final String y(String str) {
        if (!A()) {
            str = O1.H.f();
        }
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{str, s()}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final boolean z() {
        if (this.f20897b == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(C2146B.m());
        sb.append("/?.*");
        return this.f20907l || Pattern.matches(sb.toString(), this.f20897b) || Pattern.matches("^/?app/?.*", this.f20897b);
    }

    public /* synthetic */ F(C2148a c2148a, String str, Bundle bundle, L l7, b bVar, String str2, int i7, kotlin.jvm.internal.g gVar) {
        this((i7 & 1) != 0 ? null : c2148a, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : bundle, (i7 & 8) != 0 ? null : l7, (i7 & 16) != 0 ? null : bVar, (i7 & 32) != 0 ? null : str2);
    }
}
