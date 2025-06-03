package x1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import x1.C2148a;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: i, reason: collision with root package name */
    public static final a f20934i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final String f20935j = K.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final F f20936a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f20937b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20938c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f20939d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONArray f20940e;

    /* renamed from: f, reason: collision with root package name */
    public final r f20941f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONObject f20942g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONArray f20943h;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final List a(List requests, HttpURLConnection httpURLConnection, C2162o c2162o) {
            int l7;
            Intrinsics.checkNotNullParameter(requests, "requests");
            List list = requests;
            l7 = W5.p.l(list, 10);
            ArrayList arrayList = new ArrayList(l7);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new K((F) it.next(), httpURLConnection, new r(httpURLConnection, c2162o)));
            }
            return arrayList;
        }

        public final K b(F f7, HttpURLConnection httpURLConnection, Object NULL, Object obj) {
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                r a7 = r.f21112C.a(jSONObject, obj, httpURLConnection);
                if (a7 != null) {
                    Log.e(K.f20935j, a7.toString());
                    if (a7.b() == 190) {
                        O1.P p7 = O1.P.f3756a;
                        if (O1.P.Y(f7.m())) {
                            if (a7.g() != 493) {
                                C2148a.f21014z.h(null);
                            } else {
                                C2148a.c cVar = C2148a.f21014z;
                                C2148a e7 = cVar.e();
                                if (Intrinsics.a(e7 != null ? Boolean.valueOf(e7.n()) : null, Boolean.FALSE)) {
                                    cVar.d();
                                }
                            }
                        }
                    }
                    return new K(f7, httpURLConnection, a7);
                }
                Object O6 = O1.P.O(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (O6 instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) O6;
                    return new K(f7, httpURLConnection, jSONObject2.toString(), jSONObject2);
                }
                if (O6 instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) O6;
                    return new K(f7, httpURLConnection, jSONArray.toString(), jSONArray);
                }
                NULL = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
            }
            if (NULL == JSONObject.NULL) {
                return new K(f7, httpURLConnection, NULL.toString(), (JSONObject) null);
            }
            throw new C2162o(Intrinsics.i("Got unexpected object type in response, class: ", NULL.getClass().getSimpleName()));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a1 A[LOOP:0: B:15:0x0065->B:19:0x00a1, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a3 A[EDGE_INSN: B:20:0x00a3->B:27:0x00a3 BREAK  A[LOOP:0: B:15:0x0065->B:19:0x00a1], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List c(java.net.HttpURLConnection r9, java.util.List r10, java.lang.Object r11) {
            /*
                r8 = this;
                int r0 = r10.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L51
                java.lang.Object r2 = r10.get(r3)
                x1.F r2 = (x1.F) r2
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                r4.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                java.lang.String r5 = "body"
                r4.put(r5, r11)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                if (r9 != 0) goto L22
                r5 = 200(0xc8, float:2.8E-43)
                goto L26
            L22:
                int r5 = r9.getResponseCode()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
            L26:
                java.lang.String r6 = "code"
                r4.put(r6, r5)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                r5.<init>()     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                r5.put(r4)     // Catch: java.io.IOException -> L34 org.json.JSONException -> L36
                goto L52
            L34:
                r4 = move-exception
                goto L38
            L36:
                r4 = move-exception
                goto L46
            L38:
                x1.K r5 = new x1.K
                x1.r r6 = new x1.r
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
            L42:
                r1.add(r5)
                goto L51
            L46:
                x1.K r5 = new x1.K
                x1.r r6 = new x1.r
                r6.<init>(r9, r4)
                r5.<init>(r2, r9, r6)
                goto L42
            L51:
                r5 = r11
            L52:
                boolean r2 = r5 instanceof org.json.JSONArray
                if (r2 == 0) goto La4
                r2 = r5
                org.json.JSONArray r2 = (org.json.JSONArray) r2
                int r4 = r2.length()
                if (r4 != r0) goto La4
                int r0 = r2.length()
                if (r0 <= 0) goto La3
            L65:
                int r2 = r3 + 1
                java.lang.Object r4 = r10.get(r3)
                x1.F r4 = (x1.F) r4
                r6 = r5
                org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: x1.C2162o -> L81 org.json.JSONException -> L83
                java.lang.Object r3 = r6.get(r3)     // Catch: x1.C2162o -> L81 org.json.JSONException -> L83
                java.lang.String r6 = "obj"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)     // Catch: x1.C2162o -> L81 org.json.JSONException -> L83
                x1.K r3 = r8.b(r4, r9, r3, r11)     // Catch: x1.C2162o -> L81 org.json.JSONException -> L83
                r1.add(r3)     // Catch: x1.C2162o -> L81 org.json.JSONException -> L83
                goto L9e
            L81:
                r3 = move-exception
                goto L85
            L83:
                r3 = move-exception
                goto L93
            L85:
                x1.K r6 = new x1.K
                x1.r r7 = new x1.r
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
            L8f:
                r1.add(r6)
                goto L9e
            L93:
                x1.K r6 = new x1.K
                x1.r r7 = new x1.r
                r7.<init>(r9, r3)
                r6.<init>(r4, r9, r7)
                goto L8f
            L9e:
                if (r2 < r0) goto La1
                goto La3
            La1:
                r3 = r2
                goto L65
            La3:
                return r1
            La4:
                x1.o r9 = new x1.o
                java.lang.String r10 = "Unexpected number of results"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.K.a.c(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
        }

        public final List d(InputStream inputStream, HttpURLConnection httpURLConnection, J requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            String s02 = O1.P.s0(inputStream);
            O1.C.f3715e.c(N.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(s02.length()), s02);
            return e(s02, httpURLConnection, requests);
        }

        public final List e(String responseString, HttpURLConnection httpURLConnection, J requests) {
            Intrinsics.checkNotNullParameter(responseString, "responseString");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Object resultObject = new JSONTokener(responseString).nextValue();
            Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            List c7 = c(httpURLConnection, requests, resultObject);
            O1.C.f3715e.c(N.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.U(), Integer.valueOf(responseString.length()), c7);
            return c7;
        }

        public final List f(HttpURLConnection connection, J requests) {
            List a7;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            InputStream inputStream = null;
            try {
                try {
                } catch (C2162o e7) {
                    O1.C.f3715e.c(N.REQUESTS, "Response", "Response <Error>: %s", e7);
                    a7 = a(requests, connection, e7);
                } catch (Exception e8) {
                    O1.C.f3715e.c(N.REQUESTS, "Response", "Response <Error>: %s", e8);
                    a7 = a(requests, connection, new C2162o(e8));
                }
                if (!C2146B.E()) {
                    Log.e(K.f20935j, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new C2162o("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                inputStream = connection.getResponseCode() >= 400 ? connection.getErrorStream() : connection.getInputStream();
                a7 = d(inputStream, connection, requests);
                O1.P.j(inputStream);
                return a7;
            } catch (Throwable th) {
                O1.P.j(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(F request, HttpURLConnection httpURLConnection, String rawResponse, JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    public final r b() {
        return this.f20941f;
    }

    public final JSONObject c() {
        return this.f20939d;
    }

    public final JSONObject d() {
        return this.f20942g;
    }

    public String toString() {
        String str;
        try {
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f20937b;
            objArr[0] = Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.f20939d + ", error: " + this.f20941f + "}";
        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(F request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    public K(F request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, r rVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f20936a = request;
        this.f20937b = httpURLConnection;
        this.f20938c = str;
        this.f20939d = jSONObject;
        this.f20940e = jSONArray;
        this.f20941f = rVar;
        this.f20942g = jSONObject;
        this.f20943h = jSONArray;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(F request, HttpURLConnection httpURLConnection, r error) {
        this(request, httpURLConnection, null, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
