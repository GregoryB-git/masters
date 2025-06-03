/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
package x1;

import O1.C;
import O1.P;
import W5.m;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import x1.B;
import x1.F;
import x1.J;
import x1.N;
import x1.a;
import x1.o;
import x1.r;

public final class K {
    public static final a i = new a(null);
    public static final String j = K.class.getCanonicalName();
    public final F a;
    public final HttpURLConnection b;
    public final String c;
    public final JSONObject d;
    public final JSONArray e;
    public final r f;
    public final JSONObject g;
    public final JSONArray h;

    public K(F f8, HttpURLConnection httpURLConnection, String string2, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(f8, "request");
        Intrinsics.checkNotNullParameter(string2, "rawResponse");
        Intrinsics.checkNotNullParameter((Object)jSONArray, "graphObjects");
        this(f8, httpURLConnection, string2, null, jSONArray, null);
    }

    public K(F f8, HttpURLConnection httpURLConnection, String string2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(f8, "request");
        Intrinsics.checkNotNullParameter(string2, "rawResponse");
        this(f8, httpURLConnection, string2, jSONObject, null, null);
    }

    public K(F f8, HttpURLConnection httpURLConnection, String string2, JSONObject jSONObject, JSONArray jSONArray, r r8) {
        Intrinsics.checkNotNullParameter(f8, "request");
        this.a = f8;
        this.b = httpURLConnection;
        this.c = string2;
        this.d = jSONObject;
        this.e = jSONArray;
        this.f = r8;
        this.g = jSONObject;
        this.h = jSONArray;
    }

    public K(F f8, HttpURLConnection httpURLConnection, r r8) {
        Intrinsics.checkNotNullParameter(f8, "request");
        Intrinsics.checkNotNullParameter(r8, "error");
        this(f8, httpURLConnection, null, null, null, r8);
    }

    public final r b() {
        return this.f;
    }

    public final JSONObject c() {
        return this.d;
    }

    public final JSONObject d() {
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        HttpURLConnection httpURLConnection;
        Object object;
        block3 : {
            try {
                object = x.a;
                object = Locale.US;
                httpURLConnection = this.b;
                int n8 = httpURLConnection == null ? 200 : httpURLConnection.getResponseCode();
                object = String.format((Locale)object, (String)"%d", (Object[])Arrays.copyOf((Object[])new Object[]{n8}, (int)1));
                Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
                break block3;
            }
            catch (IOException iOException) {}
            object = "unknown";
        }
        httpURLConnection = new StringBuilder();
        httpURLConnection.append("{Response: ");
        httpURLConnection.append(" responseCode: ");
        httpURLConnection.append((String)object);
        httpURLConnection.append(", graphObject: ");
        httpURLConnection.append((Object)this.d);
        httpURLConnection.append(", error: ");
        httpURLConnection.append((Object)this.f);
        httpURLConnection.append("}");
        object = httpURLConnection.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return object;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final List a(List list, HttpURLConnection httpURLConnection, o o8) {
            Intrinsics.checkNotNullParameter((Object)list, "requests");
            Iterable iterable = (Iterable)list;
            list = new ArrayList(m.l(iterable, 10));
            iterable = iterable.iterator();
            while (iterable.hasNext()) {
                list.add((Object)new K((F)iterable.next(), httpURLConnection, new r(httpURLConnection, (Exception)o8)));
            }
            return list;
        }

        public final K b(F f8, HttpURLConnection httpURLConnection, Object object, Object object2) {
            boolean bl = object instanceof JSONObject;
            Object var7_6 = null;
            Object object3 = object;
            if (bl) {
                object3 = r.C;
                if ((object2 = object3.a((JSONObject)(object = (JSONObject)object), object2, httpURLConnection)) != null) {
                    Log.e((String)j, (String)object2.toString());
                    if (object2.b() == 190) {
                        object = P.a;
                        if (P.Y(f8.m())) {
                            if (object2.g() != 493) {
                                x1.a.z.h(null);
                            } else {
                                object3 = x1.a.z;
                                object = object3.e();
                                object = object == null ? var7_6 : Boolean.valueOf((boolean)object.n());
                                if (Intrinsics.a(object, (Object)Boolean.FALSE)) {
                                    object3.d();
                                }
                            }
                        }
                    }
                    return new K(f8, httpURLConnection, (r)object2);
                }
                if ((object = P.O((JSONObject)object, "body", "FACEBOOK_NON_JSON_RESULT")) instanceof JSONObject) {
                    object = (JSONObject)object;
                    return new K(f8, httpURLConnection, object.toString(), (JSONObject)object);
                }
                if (object instanceof JSONArray) {
                    object = (JSONArray)object;
                    return new K(f8, httpURLConnection, object.toString(), (JSONArray)object);
                }
                object3 = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(object3, "NULL");
            }
            if (object3 == JSONObject.NULL) {
                return new K(f8, httpURLConnection, object3.toString(), null);
            }
            throw new o(Intrinsics.i("Got unexpected object type in response, class: ", object3.getClass().getSimpleName()));
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final List c(HttpURLConnection httpURLConnection, List list, Object object) {
            Object object2;
            ArrayList arrayList;
            int n8;
            Object object3;
            int n9;
            Object object4;
            int n10;
            block12 : {
                block16 : {
                    block17 : {
                        JSONException jSONException2;
                        block13 : {
                            n10 = list.size();
                            arrayList = new ArrayList(n10);
                            n9 = 0;
                            if (n10 != 1) break block16;
                            object3 = (F)list.get(0);
                            try {
                                object2 = new JSONObject();
                                object2.put("body", object);
                                n8 = httpURLConnection == null ? 200 : httpURLConnection.getResponseCode();
                                object2.put("code", n8);
                                object4 = new JSONArray();
                                object4.put(object2);
                                break block12;
                            }
                            catch (IOException iOException) {
                            }
                            catch (JSONException jSONException2) {
                                break block13;
                            }
                            object4 = new K((F)object3, httpURLConnection, new r(httpURLConnection, (Exception)iOException));
                            break block17;
                        }
                        object4 = new K((F)object3, httpURLConnection, new r(httpURLConnection, (Exception)jSONException2));
                    }
                    arrayList.add(object4);
                }
                object4 = object;
            }
            if (object4 instanceof JSONArray && (object3 = (JSONArray)object4).length() == n10) {
                n10 = object3.length();
                if (n10 <= 0) {
                    return arrayList;
                }
            } else {
                throw new o("Unexpected number of results");
            }
            n8 = n9;
            do {
                block14 : {
                    block18 : {
                        JSONException jSONException3;
                        block15 : {
                            n9 = n8 + 1;
                            object3 = (F)list.get(n8);
                            try {
                                object2 = ((JSONArray)object4).get(n8);
                                Intrinsics.checkNotNullExpressionValue(object2, "obj");
                                arrayList.add((Object)this.b((F)object3, httpURLConnection, object2, object));
                                break block14;
                            }
                            catch (o o8) {
                            }
                            catch (JSONException jSONException3) {
                                break block15;
                            }
                            object3 = new K((F)object3, httpURLConnection, new r(httpURLConnection, (Exception)o8));
                            break block18;
                        }
                        object3 = new K((F)object3, httpURLConnection, new r(httpURLConnection, (Exception)jSONException3));
                    }
                    arrayList.add(object3);
                }
                if (n9 >= n10) {
                    return arrayList;
                }
                n8 = n9;
            } while (true);
        }

        public final List d(InputStream object, HttpURLConnection httpURLConnection, J j8) {
            Intrinsics.checkNotNullParameter((Object)j8, "requests");
            object = P.s0((InputStream)object);
            C.e.c(N.q, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", object.length(), object);
            return this.e((String)object, httpURLConnection, j8);
        }

        public final List e(String string2, HttpURLConnection httpURLConnection, J j8) {
            Intrinsics.checkNotNullParameter(string2, "responseString");
            Intrinsics.checkNotNullParameter((Object)j8, "requests");
            Object object = new JSONTokener(string2).nextValue();
            Intrinsics.checkNotNullExpressionValue(object, "resultObject");
            httpURLConnection = this.c(httpURLConnection, (List)j8, object);
            C.e.c(N.o, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", new Object[]{j8.U(), string2.length(), httpURLConnection});
            return httpURLConnection;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final List f(HttpURLConnection httpURLConnection, J j8) {
            InputStream inputStream;
            block9 : {
                Intrinsics.checkNotNullParameter((Object)httpURLConnection, "connection");
                Intrinsics.checkNotNullParameter((Object)j8, "requests");
                InputStream inputStream2 = null;
                InputStream inputStream3 = null;
                InputStream inputStream4 = inputStream = null;
                InputStream inputStream5 = inputStream2;
                InputStream inputStream6 = inputStream3;
                try {
                    if (B.E()) {
                        inputStream4 = inputStream;
                        inputStream5 = inputStream2;
                        inputStream6 = inputStream3;
                        if (httpURLConnection.getResponseCode() >= 400) {
                            inputStream4 = inputStream;
                            inputStream5 = inputStream2;
                            inputStream6 = inputStream3;
                            inputStream = httpURLConnection.getErrorStream();
                        } else {
                            inputStream4 = inputStream;
                            inputStream5 = inputStream2;
                            inputStream6 = inputStream3;
                            inputStream = httpURLConnection.getInputStream();
                        }
                        inputStream4 = inputStream;
                        inputStream5 = inputStream;
                        inputStream6 = inputStream;
                        inputStream2 = this.d(inputStream, httpURLConnection, j8);
                        httpURLConnection = inputStream2;
                        break block9;
                    }
                    inputStream4 = inputStream;
                    inputStream5 = inputStream2;
                    inputStream6 = inputStream3;
                    Log.e((String)j, (String)"GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    inputStream4 = inputStream;
                    inputStream5 = inputStream2;
                    inputStream6 = inputStream3;
                    throw new o("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                catch (Throwable throwable) {}
                P.j((Closeable)inputStream4);
                throw throwable;
                catch (Exception exception) {}
                inputStream4 = inputStream5;
                C.e.c(N.o, "Response", "Response <Error>: %s", new Object[]{exception});
                inputStream4 = inputStream5;
                httpURLConnection = this.a((List)j8, httpURLConnection, new o((Throwable)exception));
                inputStream = inputStream5;
                break block9;
                catch (o o8) {}
                inputStream4 = inputStream6;
                C.e.c(N.o, "Response", "Response <Error>: %s", new Object[]{o8});
                inputStream4 = inputStream6;
                httpURLConnection = this.a((List)j8, httpURLConnection, o8);
                inputStream = inputStream6;
            }
            P.j((Closeable)inputStream);
            return httpURLConnection;
        }
    }

}

