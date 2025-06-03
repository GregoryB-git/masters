// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import java.io.Closeable;
import org.json.JSONTokener;
import O1.C;
import java.io.InputStream;
import org.json.JSONException;
import O1.P;
import android.util.Log;
import java.util.Iterator;
import java.util.ArrayList;
import W5.m;
import java.util.List;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;
import java.net.HttpURLConnection;

public final class K
{
    public static final a i;
    public static final String j;
    public final F a;
    public final HttpURLConnection b;
    public final String c;
    public final JSONObject d;
    public final JSONArray e;
    public final r f;
    public final JSONObject g;
    public final JSONArray h;
    
    static {
        i = new a(null);
        j = K.class.getCanonicalName();
    }
    
    public K(final F f, final HttpURLConnection httpURLConnection, final String s, final JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(f, "request");
        Intrinsics.checkNotNullParameter(s, "rawResponse");
        Intrinsics.checkNotNullParameter(jsonArray, "graphObjects");
        this(f, httpURLConnection, s, null, jsonArray, null);
    }
    
    public K(final F f, final HttpURLConnection httpURLConnection, final String s, final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(f, "request");
        Intrinsics.checkNotNullParameter(s, "rawResponse");
        this(f, httpURLConnection, s, jsonObject, null, null);
    }
    
    public K(final F a, final HttpURLConnection b, final String c, final JSONObject jsonObject, final JSONArray jsonArray, final r f) {
        Intrinsics.checkNotNullParameter(a, "request");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = jsonObject;
        this.e = jsonArray;
        this.f = f;
        this.g = jsonObject;
        this.h = jsonArray;
    }
    
    public K(final F f, final HttpURLConnection httpURLConnection, final r r) {
        Intrinsics.checkNotNullParameter(f, "request");
        Intrinsics.checkNotNullParameter(r, "error");
        this(f, httpURLConnection, null, null, null, r);
    }
    
    public static final /* synthetic */ String a() {
        return K.j;
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
    
    @Override
    public String toString() {
    Label_0060_Outer:
        while (true) {
            while (true) {
                try {
                    final x a = x.a;
                    final Locale us = Locale.US;
                    final HttpURLConnection b = this.b;
                    int responseCode;
                    if (b == null) {
                        responseCode = 200;
                    }
                    else {
                        responseCode = b.getResponseCode();
                    }
                    String format = String.format(us, "%d", Arrays.copyOf(new Object[] { responseCode }, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    while (true) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("{Response: ");
                        sb.append(" responseCode: ");
                        sb.append(format);
                        sb.append(", graphObject: ");
                        sb.append(this.d);
                        sb.append(", error: ");
                        sb.append(this.f);
                        sb.append("}");
                        final String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
                        return string;
                        format = "unknown";
                        continue Label_0060_Outer;
                    }
                }
                catch (IOException ex) {}
                continue;
            }
        }
    }
    
    public static final class a
    {
        public final List a(final List list, final HttpURLConnection httpURLConnection, final o o) {
            Intrinsics.checkNotNullParameter(list, "requests");
            final List<F> list2 = (List<F>)list;
            final ArrayList list3 = new ArrayList<K>(m.l(list2, 10));
            final Iterator<Object> iterator = list2.iterator();
            while (iterator.hasNext()) {
                list3.add(new K(iterator.next(), httpURLConnection, new r(httpURLConnection, o)));
            }
            return list3;
        }
        
        public final K b(final F f, final HttpURLConnection httpURLConnection, Object o, final Object o2) {
            final boolean b = o instanceof JSONObject;
            final Object o3 = null;
            Object null = o;
            if (b) {
                final r.c c = r.C;
                final JSONObject jsonObject = (JSONObject)o;
                final r a = c.a(jsonObject, o2, httpURLConnection);
                if (a != null) {
                    Log.e(K.a(), a.toString());
                    if (a.b() == 190) {
                        final P a2 = P.a;
                        if (P.Y(f.m())) {
                            if (a.g() != 493) {
                                x1.a.z.h(null);
                            }
                            else {
                                final x1.a.c z = x1.a.z;
                                final x1.a e = z.e();
                                Object value;
                                if (e == null) {
                                    value = o3;
                                }
                                else {
                                    value = e.n();
                                }
                                if (Intrinsics.a(value, Boolean.FALSE)) {
                                    z.d();
                                }
                            }
                        }
                    }
                    return new K(f, httpURLConnection, a);
                }
                o = P.O(jsonObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (o instanceof JSONObject) {
                    final JSONObject jsonObject2 = (JSONObject)o;
                    return new K(f, httpURLConnection, jsonObject2.toString(), jsonObject2);
                }
                if (o instanceof JSONArray) {
                    final JSONArray jsonArray = (JSONArray)o;
                    return new K(f, httpURLConnection, jsonArray.toString(), jsonArray);
                }
                null = JSONObject.NULL;
                Intrinsics.checkNotNullExpressionValue(null, "NULL");
            }
            if (null == JSONObject.NULL) {
                return new K(f, httpURLConnection, null.toString(), (JSONObject)null);
            }
            throw new o(Intrinsics.i("Got unexpected object type in response, class: ", null.getClass().getSimpleName()));
        }
        
        public final List c(final HttpURLConnection httpURLConnection, final List list, final Object o) {
            final int size = list.size();
            final ArrayList list2 = new ArrayList<K>(size);
            final int n = 0;
            Object o2 = null;
            Label_0179: {
                Label_0176: {
                    if (size == 1) {
                        final F f = list.get(0);
                        while (true) {
                            Label_0151: {
                                try {
                                    final JSONObject jsonObject = new JSONObject();
                                    jsonObject.put("body", o);
                                    int responseCode;
                                    if (httpURLConnection == null) {
                                        responseCode = 200;
                                    }
                                    else {
                                        responseCode = httpURLConnection.getResponseCode();
                                    }
                                    jsonObject.put("code", responseCode);
                                    o2 = new JSONArray();
                                    ((JSONArray)o2).put((Object)jsonObject);
                                    break Label_0179;
                                }
                                catch (IOException ex) {}
                                catch (JSONException ex2) {
                                    break Label_0151;
                                }
                                final IOException ex;
                                final K k = new K(f, httpURLConnection, new r(httpURLConnection, ex));
                                list2.add(k);
                                break Label_0176;
                            }
                            final JSONException ex2;
                            final K k = new K(f, httpURLConnection, new r(httpURLConnection, (Exception)ex2));
                            continue;
                        }
                    }
                }
                o2 = o;
            }
            if (o2 instanceof JSONArray) {
                final JSONArray jsonArray = (JSONArray)o2;
                if (jsonArray.length() == size) {
                    final int length = jsonArray.length();
                    if (length > 0) {
                        int n2 = n;
                        while (true) {
                            final int n3 = n2 + 1;
                            final F f2 = list.get(n2);
                            Label_0349: {
                                while (true) {
                                    Label_0324: {
                                        try {
                                            final Object value = ((JSONArray)o2).get(n2);
                                            Intrinsics.checkNotNullExpressionValue(value, "obj");
                                            list2.add(this.b(f2, httpURLConnection, value, o));
                                            break Label_0349;
                                        }
                                        catch (o o3) {}
                                        catch (JSONException ex3) {
                                            break Label_0324;
                                        }
                                        final o o3;
                                        final K i = new K(f2, httpURLConnection, new r(httpURLConnection, o3));
                                        list2.add(i);
                                        break Label_0349;
                                    }
                                    final JSONException ex3;
                                    final K i = new K(f2, httpURLConnection, new r(httpURLConnection, (Exception)ex3));
                                    continue;
                                }
                            }
                            if (n3 >= length) {
                                break;
                            }
                            n2 = n3;
                        }
                        return list2;
                    }
                    return list2;
                }
            }
            throw new o("Unexpected number of results");
        }
        
        public final List d(final InputStream inputStream, final HttpURLConnection httpURLConnection, final J j) {
            Intrinsics.checkNotNullParameter(j, "requests");
            final String s0 = P.s0(inputStream);
            C.e.c(N.q, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", s0.length(), s0);
            return this.e(s0, httpURLConnection, j);
        }
        
        public final List e(final String s, final HttpURLConnection httpURLConnection, final J j) {
            Intrinsics.checkNotNullParameter(s, "responseString");
            Intrinsics.checkNotNullParameter(j, "requests");
            final Object nextValue = new JSONTokener(s).nextValue();
            Intrinsics.checkNotNullExpressionValue(nextValue, "resultObject");
            final List c = this.c(httpURLConnection, j, nextValue);
            C.e.c(N.o, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", j.U(), s.length(), c);
            return c;
        }
        
        public final List f(final HttpURLConnection httpURLConnection, final J j) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "connection");
            Intrinsics.checkNotNullParameter(j, "requests");
            final InputStream inputStream = null;
            Closeable closeable2;
            final Closeable closeable = closeable2 = null;
            InputStream inputStream2 = inputStream;
            while (true) {
                try {
                    try {
                        while (true) {
                            if (B.E()) {
                                closeable2 = closeable;
                                inputStream2 = inputStream;
                                InputStream inputStream3;
                                if (httpURLConnection.getResponseCode() >= 400) {
                                    closeable2 = closeable;
                                    inputStream2 = inputStream;
                                    inputStream3 = httpURLConnection.getErrorStream();
                                }
                                else {
                                    closeable2 = closeable;
                                    inputStream2 = inputStream;
                                    inputStream3 = httpURLConnection.getInputStream();
                                }
                                closeable2 = inputStream3;
                                inputStream2 = inputStream3;
                                final List list = this.d(inputStream3, httpURLConnection, j);
                                P.j(inputStream3);
                                return list;
                            }
                            closeable2 = closeable;
                            inputStream2 = inputStream;
                            Log.e(K.a(), "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            closeable2 = closeable;
                            inputStream2 = inputStream;
                            throw new o("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                            closeable2 = inputStream2;
                            final o o;
                            C.e.c(N.o, "Response", "Response <Error>: %s", o);
                            closeable2 = inputStream2;
                            final List list = this.a(j, httpURLConnection, o);
                            InputStream inputStream3 = inputStream2;
                            continue;
                        }
                        P.j(closeable2);
                        throw httpURLConnection;
                    }
                    finally {}
                }
                catch (Exception ex) {}
                catch (o o2) {}
                final o o2;
                final o o = o2;
                continue;
            }
        }
    }
}
