/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.Pair
 *  java.io.BufferedOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.net.HttpURLConnection
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.net.URLEncoder
 *  java.nio.charset.Charset
 *  java.security.SecureRandom
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.zip.GZIPOutputStream
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package x1;

import O1.C;
import O1.P;
import O1.Q;
import O1.z;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
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
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.E;
import x1.G;
import x1.H;
import x1.I;
import x1.J;
import x1.K;
import x1.L;
import x1.N;
import x1.S;
import x1.T;
import x1.U;
import x1.g;
import x1.o;

public final class F {
    public static final c n = new c(null);
    public static final String o = F.class.getSimpleName();
    public static final String p;
    public static String q;
    public static final Pattern r;
    public static volatile String s;
    public x1.a a;
    public String b;
    public JSONObject c;
    public String d;
    public String e;
    public boolean f;
    public Bundle g;
    public Object h;
    public String i;
    public b j;
    public L k;
    public boolean l;
    public String m;

    static {
        Object object = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(object, "(this as java.lang.String).toCharArray()");
        StringBuilder stringBuilder = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int n8 = secureRandom.nextInt(11) + 30;
        if (n8 > 0) {
            int n9;
            int n10 = 0;
            do {
                n9 = n10 + 1;
                stringBuilder.append((char)object[secureRandom.nextInt(object.length)]);
                n10 = n9;
            } while (n9 < n8);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "buffer.toString()");
        p = object;
        r = Pattern.compile((String)"^/?v\\d+\\.\\d+/(.*)");
    }

    /*
     * Enabled aggressive block sorting
     */
    public F(x1.a a8, String string2, Bundle bundle, L l8, b b8, String string3) {
        this.f = true;
        this.a = a8;
        this.b = string2;
        this.i = string3;
        this.C(b8);
        this.F(l8);
        a8 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.g = a8;
        if (this.i == null) {
            this.i = B.w();
        }
    }

    public /* synthetic */ F(x1.a a8, String string2, Bundle bundle, L l8, b b8, String string3, int n8, kotlin.jvm.internal.g g8) {
        if ((n8 & 1) != 0) {
            a8 = null;
        }
        if ((n8 & 2) != 0) {
            string2 = null;
        }
        if ((n8 & 4) != 0) {
            bundle = null;
        }
        if ((n8 & 8) != 0) {
            l8 = null;
        }
        if ((n8 & 16) != 0) {
            b8 = null;
        }
        if ((n8 & 32) != 0) {
            string3 = null;
        }
        this(a8, string2, bundle, l8, b8, string3);
    }

    public static /* synthetic */ void a(b b8, K k8) {
        F.b(b8, k8);
    }

    public static final void b(b b8, K k8) {
        int n8;
        Intrinsics.checkNotNullParameter(k8, "response");
        Object object = k8.c();
        object = object == null ? null : object.optJSONObject("__debug__");
        JSONArray jSONArray = object == null ? null : object.optJSONArray("messages");
        if (jSONArray != null && (n8 = jSONArray.length()) > 0) {
            int n9 = 0;
            do {
                int n10 = n9 + 1;
                Object object2 = jSONArray.optJSONObject(n9);
                object = object2 == null ? null : object2.optString("message");
                Object object3 = object2 == null ? null : object2.optString("type");
                String string2 = object2 == null ? null : object2.optString("link");
                if (object != null && object3 != null) {
                    object2 = N.v;
                    if (Intrinsics.a(object3, "warning")) {
                        object2 = N.u;
                    }
                    object3 = object;
                    if (!P.c0(string2)) {
                        object3 = new StringBuilder();
                        object3.append(object);
                        object3.append(" Link: ");
                        object3.append((Object)string2);
                        object3 = object3.toString();
                    }
                    object = C.e;
                    string2 = o;
                    Intrinsics.checkNotNullExpressionValue(string2, "TAG");
                    object.b((N)((Object)object2), string2, (String)object3);
                }
                if (n10 >= n8) break;
                n9 = n10;
            } while (true);
        }
        if (b8 == null) {
            return;
        }
        b8.a(k8);
    }

    public static final /* synthetic */ void h(String string2) {
        s = string2;
    }

    public final boolean A() {
        if (!Intrinsics.a(B.x(), "instagram.com")) {
            return true;
        }
        return this.z() ^ true;
    }

    public final void B(JSONArray jSONArray, Map map) {
        JSONObject jSONObject = new JSONObject();
        String string2 = this.d;
        if (string2 != null) {
            jSONObject.put("name", (Object)string2);
            jSONObject.put("omit_response_on_success", this.f);
        }
        if ((string2 = this.e) != null) {
            jSONObject.put("depends_on", (Object)string2);
        }
        string2 = this.v();
        jSONObject.put("relative_url", (Object)string2);
        jSONObject.put("method", (Object)this.k);
        Object object = this.a;
        if (object != null) {
            object = object.l();
            C.e.d((String)object);
        }
        object = new ArrayList();
        for (Object object2 : this.g.keySet()) {
            if (!n.v(object2 = this.g.get((String)object2))) continue;
            Object object3 = x.a;
            object3 = String.format((Locale)Locale.ROOT, (String)"%s%d", (Object[])Arrays.copyOf((Object[])new Object[]{"file", map.size()}, (int)2));
            Intrinsics.checkNotNullExpressionValue(object3, "java.lang.String.format(locale, format, *args)");
            object.add(object3);
            map.put(object3, (Object)new a(this, object2));
        }
        if (!object.isEmpty()) {
            jSONObject.put("attached_files", (Object)TextUtils.join((CharSequence)",", (Iterable)object));
        }
        if ((map = this.c) != null) {
            object = new ArrayList();
            n.D((JSONObject)map, string2, new e((ArrayList)object){
                public final /* synthetic */ ArrayList a;
                {
                    this.a = arrayList;
                }

                @Override
                public void a(String string2, String string3) {
                    Intrinsics.checkNotNullParameter(string2, "key");
                    Intrinsics.checkNotNullParameter(string3, "value");
                    ArrayList arrayList = this.a;
                    x x8 = x.a;
                    string2 = String.format((Locale)Locale.US, (String)"%s=%s", (Object[])Arrays.copyOf((Object[])new Object[]{string2, URLEncoder.encode((String)string3, (String)"UTF-8")}, (int)2));
                    Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(locale, format, *args)");
                    arrayList.add((Object)string2);
                }
            });
            jSONObject.put("body", (Object)TextUtils.join((CharSequence)"&", (Iterable)object));
        }
        jSONArray.put((Object)jSONObject);
    }

    public final void C(b b8) {
        B b9 = B.a;
        if (!B.H(N.v) && !B.H(N.u)) {
            this.j = b8;
            return;
        }
        this.j = new E(b8);
    }

    public final void D(boolean bl) {
        this.l = bl;
    }

    public final void E(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public final void F(L l8) {
        if (this.m != null && l8 != L.o) {
            throw new o("Can't change HTTP method on request with overridden URL.");
        }
        L l9 = l8;
        if (l8 == null) {
            l9 = L.o;
        }
        this.k = l9;
    }

    public final void G(Bundle bundle) {
        Intrinsics.checkNotNullParameter((Object)bundle, "<set-?>");
        this.g = bundle;
    }

    public final void H(Object object) {
        this.h = object;
    }

    public final boolean I() {
        String string2 = this.n();
        boolean bl = string2 == null ? false : i.v(string2, "|", false, 2, null);
        if (string2 != null && i.s(string2, "IG", false, 2, null) && !bl && this.z()) {
            return true;
        }
        if (!this.A() && !bl) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i() {
        Object object;
        Bundle bundle;
        block10 : {
            block9 : {
                block8 : {
                    bundle = this.g;
                    if (!this.I()) break block8;
                    object = this.p();
                    break block9;
                }
                object = this.n();
                if (object == null) break block10;
            }
            bundle.putString("access_token", (String)object);
        }
        if (!bundle.containsKey("access_token")) {
            object = P.a;
            if (P.c0(B.r())) {
                Log.w((String)o, (String)"Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        object = B.a;
        if (B.H(N.v)) {
            object = "info";
        } else {
            if (!B.H(N.u)) {
                return;
            }
            object = "warning";
        }
        bundle.putString("debug", (String)object);
    }

    public final String j(String object, boolean bl) {
        if (!bl && this.k == L.p) {
            return object;
        }
        Uri.Builder builder = Uri.parse((String)object).buildUpon();
        for (String string2 : this.g.keySet()) {
            Object object2;
            object = object2 = this.g.get(string2);
            if (object2 == null) {
                object = "";
            }
            if (((c)(object2 = n)).w(object)) {
                builder.appendQueryParameter(string2, ((c)object2).C(object).toString());
                continue;
            }
            if (this.k == L.o) continue;
            object2 = x.a;
            object = String.format((Locale)Locale.US, (String)"Unsupported parameter type for GET request: %s", (Object[])Arrays.copyOf((Object[])new Object[]{object.getClass().getSimpleName()}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
            throw new IllegalArgumentException((String)object);
        }
        object = builder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "uriBuilder.toString()");
        return object;
    }

    public final K k() {
        return n.h(this);
    }

    public final I l() {
        return n.n(this);
    }

    public final x1.a m() {
        return this.a;
    }

    public final String n() {
        Object object = this.a;
        if (object != null) {
            if (!this.g.containsKey("access_token")) {
                object = object.l();
                C.e.d((String)object);
                return object;
            }
        } else if (!this.g.containsKey("access_token")) {
            return this.p();
        }
        return this.g.getString("access_token");
    }

    public final b o() {
        return this.j;
    }

    public final String p() {
        Object object = B.m();
        String string2 = B.r();
        if (object.length() > 0 && string2.length() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append('|');
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
        object = P.a;
        P.j0(o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    public final JSONObject q() {
        return this.c;
    }

    public final String r() {
        return this.b;
    }

    public final String s() {
        if (r.matcher((CharSequence)this.b).matches()) {
            return this.b;
        }
        Object object = x.a;
        object = String.format((String)"%s/%s", (Object[])Arrays.copyOf((Object[])new Object[]{this.i, this.b}, (int)2));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }

    public final L t() {
        return this.k;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{Request: ");
        stringBuilder.append(" accessToken: ");
        x1.a a8 = this.a;
        Object object = a8;
        if (a8 == null) {
            object = "null";
        }
        stringBuilder.append(object);
        stringBuilder.append(", graphPath: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", graphObject: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", httpMethod: ");
        stringBuilder.append((Object)this.k);
        stringBuilder.append(", parameters: ");
        stringBuilder.append((Object)this.g);
        stringBuilder.append("}");
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return object;
    }

    public final Bundle u() {
        return this.g;
    }

    public final String v() {
        if (this.m == null) {
            String string2 = this.y(O1.H.h());
            this.i();
            string2 = Uri.parse((String)this.j(string2, true));
            x x8 = x.a;
            string2 = String.format((String)"%s?%s", (Object[])Arrays.copyOf((Object[])new Object[]{string2.getPath(), string2.getQuery()}, (int)2));
            Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(format, *args)");
            return string2;
        }
        throw new o("Can't override URL for a batch request");
    }

    public final Object w() {
        return this.h;
    }

    public final String x() {
        Object object = this.m;
        if (object != null) {
            return String.valueOf((Object)object);
        }
        object = this.b;
        if (this.k == L.p && object != null && i.k((String)object, "/videos", false, 2, null)) {
            object = O1.H.j();
        } else {
            object = O1.H.a;
            object = O1.H.i(B.x());
        }
        object = this.y((String)object);
        this.i();
        return this.j((String)object, false);
    }

    public final String y(String string2) {
        if (!this.A()) {
            string2 = O1.H.f();
        }
        x x8 = x.a;
        string2 = String.format((String)"%s/%s", (Object[])Arrays.copyOf((Object[])new Object[]{string2, this.s()}, (int)2));
        Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(format, *args)");
        return string2;
    }

    public final boolean z() {
        String string2 = this.b;
        boolean bl = false;
        if (string2 == null) {
            return false;
        }
        string2 = new StringBuilder();
        string2.append("^/?");
        string2.append(B.m());
        string2.append("/?.*");
        string2 = string2.toString();
        if (this.l || Pattern.matches((String)string2, (CharSequence)this.b) || Pattern.matches((String)"^/?app/?.*", (CharSequence)this.b)) {
            bl = true;
        }
        return bl;
    }

    public static final class a {
        public final F a;
        public final Object b;

        public a(F f8, Object object) {
            Intrinsics.checkNotNullParameter(f8, "request");
            this.a = f8;
            this.b = object;
        }

        public final F a() {
            return this.a;
        }

        public final Object b() {
            return this.b;
        }
    }

    public static interface b {
        public void a(K var1);
    }

    public static final class c {
        public c() {
        }

        public /* synthetic */ c(kotlin.jvm.internal.g g8) {
            this();
        }

        public static final void H(ArrayList arrayList, J j8) {
            Intrinsics.checkNotNullParameter((Object)arrayList, "$callbacks");
            Intrinsics.checkNotNullParameter((Object)j8, "$requests");
            arrayList = arrayList.iterator();
            while (arrayList.hasNext()) {
                Object object = (Pair)arrayList.next();
                b b8 = (b)object.first;
                object = object.second;
                Intrinsics.checkNotNullExpressionValue(object, "pair.second");
                b8.a((K)object);
            }
            arrayList = j8.T().iterator();
            while (arrayList.hasNext()) {
                ((J.a)arrayList.next()).a(j8);
            }
        }

        public static /* synthetic */ void a(ArrayList arrayList, J j8) {
            c.H(arrayList, j8);
        }

        public static /* synthetic */ void b(d d8, K k8) {
            c.z(d8, k8);
        }

        public static final void z(d d8, K k8) {
            Intrinsics.checkNotNullParameter(k8, "response");
            if (d8 == null) {
                return;
            }
            d8.a(k8.c(), k8);
        }

        public final F A(x1.a object, String string2, JSONObject jSONObject, b b8) {
            object = new F((x1.a)object, string2, null, L.p, b8, null, 32, null);
            object.E(jSONObject);
            return object;
        }

        public final F B(x1.a a8, String string2, Bundle bundle, b b8) {
            return new F(a8, string2, bundle, L.p, b8, null, 32, null);
        }

        public final String C(Object object) {
            if (object instanceof String) {
                return (String)object;
            }
            if (!(object instanceof Boolean) && !(object instanceof Number)) {
                if (object instanceof Date) {
                    object = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)object);
                    Intrinsics.checkNotNullExpressionValue(object, "iso8601DateFormat.format(value)");
                    return object;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return object.toString();
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public final void D(JSONObject var1_1, String var2_2, e var3_3) {
            if (!this.u(var2_2)) ** GOTO lbl-1000
            var4_4 = i.D(var2_2, ":", 0, false, 6, null);
            var5_5 = i.D(var2_2, "?", 0, false, 6, null);
            if (var4_4 > 3 && (var5_5 == -1 || var4_4 < var5_5)) {
                var4_4 = 1;
            } else lbl-1000: // 2 sources:
            {
                var4_4 = 0;
            }
            var2_2 = var1_1.keys();
            while (var2_2.hasNext() != false) {
                var7_7 = (String)var2_2.next();
                var8_8 = var1_1.opt(var7_7);
                var6_6 = var4_4 != 0 && i.l(var7_7, "image", true) != false;
                Intrinsics.checkNotNullExpressionValue(var7_7, "key");
                Intrinsics.checkNotNullExpressionValue(var8_8, "value");
                this.E(var7_7, var8_8, var3_3, var6_6);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final void E(String string2, Object object, e e8, boolean bl) {
            Object object2 = object.getClass();
            if (JSONObject.class.isAssignableFrom((Class)object2)) {
                object = (JSONObject)object;
                if (bl) {
                    object2 = object.keys();
                    while (object2.hasNext()) {
                        Object object3 = (String)object2.next();
                        Object object4 = x.a;
                        object4 = String.format((String)"%s[%s]", (Object[])Arrays.copyOf((Object[])new Object[]{string2, object3}, (int)2));
                        Intrinsics.checkNotNullExpressionValue(object4, "java.lang.String.format(format, *args)");
                        object3 = object.opt((String)object3);
                        Intrinsics.checkNotNullExpressionValue(object3, "jsonObject.opt(propertyName)");
                        this.E((String)object4, object3, e8, bl);
                    }
                    return;
                }
                if (object.has("id")) {
                    object2 = object.optString("id");
                    object = "jsonObject.optString(\"id\")";
                } else if (object.has("url")) {
                    object2 = object.optString("url");
                    object = "jsonObject.optString(\"url\")";
                } else {
                    if (!object.has("fbsdk:create_object")) return;
                    object2 = object.toString();
                    object = "jsonObject.toString()";
                }
                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                this.E(string2, object2, e8, bl);
                return;
            }
            if (!JSONArray.class.isAssignableFrom((Class)object2)) {
                if (!(String.class.isAssignableFrom((Class)object2) || Number.class.isAssignableFrom((Class)object2) || Boolean.class.isAssignableFrom((Class)object2))) {
                    if (!Date.class.isAssignableFrom((Class)object2)) {
                        object = P.a;
                        object = F.o;
                        e8 = new StringBuilder();
                        e8.append("The type of property ");
                        e8.append(string2);
                        e8.append(" in the graph object is unknown. It won't be sent in the request.");
                        P.j0((String)object, e8.toString());
                        return;
                    }
                    object = (Date)object;
                    object = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)object);
                    Intrinsics.checkNotNullExpressionValue(object, "iso8601DateFormat.format(date)");
                } else {
                    object = object.toString();
                }
                e8.a(string2, (String)object);
                return;
            }
            int n8 = (object = (JSONArray)object).length();
            if (n8 <= 0) return;
            int n9 = 0;
            do {
                int n10 = n9 + 1;
                object2 = x.a;
                object2 = String.format((Locale)Locale.ROOT, (String)"%s[%d]", (Object[])Arrays.copyOf((Object[])new Object[]{string2, n9}, (int)2));
                Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(locale, format, *args)");
                Object object5 = object.opt(n9);
                Intrinsics.checkNotNullExpressionValue(object5, "jsonArray.opt(i)");
                try {
                    this.E((String)object2, object5, e8, bl);
                    if (n10 >= n8) {
                        return;
                    }
                    n9 = n10;
                    continue;
                }
                catch (Throwable throwable) {}
                throw throwable;
            } while (true);
        }

        public final void F(J object, C object2, int n8, URL object3, OutputStream object4, boolean bl) {
            block11 : {
                block10 : {
                    block9 : {
                        object4 = new g((OutputStream)object4, (C)object2, bl);
                        if (n8 != 1) break block9;
                        object = object.D(0);
                        HashMap hashMap = new HashMap();
                        for (String string2 : object.u().keySet()) {
                            Object object5 = object.u().get(string2);
                            if (!this.v(object5)) continue;
                            Intrinsics.checkNotNullExpressionValue(string2, "key");
                            hashMap.put((Object)string2, (Object)new a((F)object, object5));
                        }
                        if (object2 != null) {
                            object2.b("  Parameters:\n");
                        }
                        this.J(object.u(), (g)object4, (F)object);
                        if (object2 != null) {
                            object2.b("  Attachments:\n");
                        }
                        this.I((Map)hashMap, (g)object4);
                        object = object.q();
                        if (object != null) {
                            object2 = object3.getPath();
                            Intrinsics.checkNotNullExpressionValue(object2, "url.path");
                            this.D((JSONObject)object, (String)object2, (e)object4);
                            return;
                        }
                        break block10;
                    }
                    object3 = this.p((J)((Object)object));
                    if (object3.length() == 0) break block11;
                    object4.a("batch_app_id", (String)object3);
                    object3 = new HashMap();
                    this.K((g)object4, (Collection)object, (Map)object3);
                    if (object2 != null) {
                        object2.b("  Attachments:\n");
                    }
                    this.I((Map)object3, (g)object4);
                }
                return;
            }
            throw new o("App ID was not specified at the request or Settings.");
        }

        public final void G(J j8, List object) {
            Intrinsics.checkNotNullParameter((Object)j8, "requests");
            Intrinsics.checkNotNullParameter(object, "responses");
            int n8 = j8.size();
            ArrayList arrayList = new ArrayList();
            if (n8 > 0) {
                int n9 = 0;
                do {
                    int n10 = n9 + 1;
                    F f8 = j8.D(n9);
                    if (f8.o() != null) {
                        arrayList.add((Object)new Pair((Object)f8.o(), object.get(n9)));
                    }
                    if (n10 >= n8) break;
                    n9 = n10;
                } while (true);
            }
            if (arrayList.size() > 0) {
                object = new H(arrayList, j8);
                j8 = (j8 = j8.S()) == null ? null : Boolean.valueOf((boolean)j8.post((Runnable)object));
                if (j8 == null) {
                    object.run();
                }
            }
        }

        public final void I(Map map, g g8) {
            for (Map.Entry entry : map.entrySet()) {
                if (!F.n.v(((a)entry.getValue()).b())) continue;
                g8.j((String)entry.getKey(), ((a)entry.getValue()).b(), ((a)entry.getValue()).a());
            }
        }

        public final void J(Bundle bundle, g g8, F f8) {
            for (String string2 : bundle.keySet()) {
                Object object = bundle.get(string2);
                if (!this.w(object)) continue;
                Intrinsics.checkNotNullExpressionValue(string2, "key");
                g8.j(string2, object, f8);
            }
        }

        public final void K(g g8, Collection collection, Map map) {
            JSONArray jSONArray = new JSONArray();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                ((F)iterator.next()).B(jSONArray, map);
            }
            g8.l("batch", jSONArray, collection);
        }

        public final void L(J j8, HttpURLConnection object) {
            C c8;
            block16 : {
                Object object2;
                void var1_5;
                block14 : {
                    int n8;
                    URL uRL;
                    boolean bl;
                    block15 : {
                        Object object3;
                        block13 : {
                            Intrinsics.checkNotNullParameter((Object)j8, "requests");
                            Intrinsics.checkNotNullParameter(object, "connection");
                            c8 = new C(N.o, "Request");
                            n8 = j8.size();
                            bl = this.t(j8);
                            Object var8_10 = null;
                            object2 = n8 == 1 ? j8.D(0).t() : null;
                            object3 = object2;
                            if (object2 == null) {
                                object3 = L.p;
                            }
                            object.setRequestMethod(object3.name());
                            this.M((HttpURLConnection)object, bl);
                            uRL = object.getURL();
                            c8.b("Request:\n");
                            c8.d("Id", j8.U());
                            Intrinsics.checkNotNullExpressionValue((Object)uRL, "url");
                            c8.d("URL", (Object)uRL);
                            object2 = object.getRequestMethod();
                            Intrinsics.checkNotNullExpressionValue(object2, "connection.requestMethod");
                            c8.d("Method", object2);
                            object2 = object.getRequestProperty("User-Agent");
                            Intrinsics.checkNotNullExpressionValue(object2, "connection.getRequestProperty(\"User-Agent\")");
                            c8.d("User-Agent", object2);
                            object2 = object.getRequestProperty("Content-Type");
                            Intrinsics.checkNotNullExpressionValue(object2, "connection.getRequestProperty(\"Content-Type\")");
                            c8.d("Content-Type", object2);
                            object.setConnectTimeout(j8.X());
                            object.setReadTimeout(j8.X());
                            if (object3 != L.p) break block16;
                            object.setDoOutput(true);
                            object2 = var8_10;
                            try {
                                object = new BufferedOutputStream(object.getOutputStream());
                                if (!bl) break block13;
                            }
                            catch (Throwable throwable) {}
                            try {
                                object = object2 = new GZIPOutputStream((OutputStream)object);
                            }
                            catch (Throwable throwable) {
                                object2 = object;
                                break block14;
                            }
                        }
                        object2 = object;
                        if (!this.s(j8)) break block15;
                        object2 = object;
                        object3 = new S(j8.S());
                        object2 = object;
                        this.F(j8, null, n8, uRL, (OutputStream)object3, bl);
                        object2 = object;
                        int n9 = object3.c();
                        object2 = object;
                        object = new T((OutputStream)object, j8, object3.e(), n9);
                        break block15;
                        break block14;
                    }
                    try {
                        this.F(j8, c8, n8, uRL, (OutputStream)object, bl);
                    }
                    catch (Throwable throwable) {
                        object2 = object;
                    }
                    object.close();
                    c8.e();
                    return;
                }
                if (object2 != null) {
                    object2.close();
                }
                throw var1_5;
            }
            c8.e();
        }

        public final void M(HttpURLConnection httpURLConnection, boolean bl) {
            if (bl) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", this.q());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final HttpURLConnection N(J j8) {
            URL uRL;
            IOException iOException2;
            block8 : {
                URL uRL2;
                JSONException jSONException2;
                URL uRL3;
                Intrinsics.checkNotNullParameter((Object)j8, "requests");
                this.O(j8);
                try {
                    uRL3 = j8.size() == 1 ? new URL(j8.D(0).x()) : new URL(O1.H.h());
                    uRL = null;
                    uRL2 = null;
                }
                catch (MalformedURLException malformedURLException) {
                    throw new o("could not construct URL for request", (Throwable)malformedURLException);
                }
                uRL2 = uRL3 = this.g(uRL3);
                uRL = uRL3;
                try {
                    this.L(j8, (HttpURLConnection)uRL3);
                    return uRL3;
                }
                catch (JSONException jSONException2) {
                }
                catch (IOException iOException2) {
                    break block8;
                }
                P.q((URLConnection)uRL2);
                throw new o("could not construct request body", (Throwable)jSONException2);
            }
            P.q((URLConnection)uRL);
            throw new o("could not construct request body", (Throwable)iOException2);
        }

        public final void O(J object) {
            Intrinsics.checkNotNullParameter(object, "requests");
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (F)iterator.next();
                if (L.o != object.t()) continue;
                Object object2 = P.a;
                if (!P.c0(object.u().getString("fields"))) continue;
                C.a a8 = C.e;
                N n8 = N.t;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("GET requests for /");
                object = object2 = object.r();
                if (object2 == null) {
                    object = "";
                }
                stringBuilder.append((String)object);
                stringBuilder.append(" should contain an explicit \"fields\" parameter.");
                a8.a(n8, 5, "Request", stringBuilder.toString());
            }
        }

        public final HttpURLConnection g(URL uRL) {
            if ((uRL = (URLConnection)FirebasePerfUrlConnection.instrument((Object)uRL.openConnection())) != null) {
                uRL = (HttpURLConnection)uRL;
                uRL.setRequestProperty("User-Agent", this.r());
                uRL.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                uRL.setChunkedStreamingMode(0);
                return uRL;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        public final K h(F f8) {
            Intrinsics.checkNotNullParameter(f8, "request");
            f8 = this.k(f8);
            if (f8.size() == 1) {
                return (K)f8.get(0);
            }
            throw new o("invalid state: expected a single response");
        }

        public final List i(Collection collection) {
            Intrinsics.checkNotNullParameter((Object)collection, "requests");
            return this.j(new J(collection));
        }

        /*
         * Exception decompiling
         */
        public final List j(J var1_1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[SIMPLE_IF_TAKEN]], but top level block is 1[TRYBLOCK]
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        public final /* varargs */ List k(F ... arrf) {
            Intrinsics.checkNotNullParameter(arrf, "requests");
            return this.i((Collection)W5.g.u(arrf));
        }

        public final I l(Collection collection) {
            Intrinsics.checkNotNullParameter((Object)collection, "requests");
            return this.m(new J(collection));
        }

        public final I m(J object) {
            Intrinsics.checkNotNullParameter(object, "requests");
            Q.i((Collection)object, "requests");
            object = new I((J)((Object)object));
            object.executeOnExecutor(B.t(), (Object[])new Void[0]);
            return object;
        }

        public final /* varargs */ I n(F ... arrf) {
            Intrinsics.checkNotNullParameter(arrf, "requests");
            return this.l((Collection)W5.g.u(arrf));
        }

        public final List o(HttpURLConnection object, J j8) {
            Intrinsics.checkNotNullParameter(object, "connection");
            Intrinsics.checkNotNullParameter((Object)j8, "requests");
            List list = K.i.f((HttpURLConnection)object, j8);
            P.q((URLConnection)object);
            int n8 = j8.size();
            if (n8 == list.size()) {
                this.G(j8, list);
                x1.g.f.e().h();
                return list;
            }
            object = x.a;
            object = String.format((Locale)Locale.US, (String)"Received %d responses while expecting %d", (Object[])Arrays.copyOf((Object[])new Object[]{list.size(), n8}, (int)2));
            Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
            throw new o((String)object);
        }

        public final String p(J object) {
            Object object2 = object.M();
            if (object2 != null && object.isEmpty() ^ true) {
                return object2;
            }
            object = object.iterator();
            while (object.hasNext()) {
                object2 = ((F)object.next()).m();
                if (object2 == null) continue;
                return object2.c();
            }
            object = q;
            if (object != null && object.length() > 0) {
                return object;
            }
            return B.m();
        }

        public final String q() {
            Object object = x.a;
            object = String.format((String)"multipart/form-data; boundary=%s", (Object[])Arrays.copyOf((Object[])new Object[]{p}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
            return object;
        }

        public final String r() {
            if (s == null) {
                Object object = x.a;
                object = String.format((String)"%s.%s", (Object[])Arrays.copyOf((Object[])new Object[]{"FBAndroidSDK", "16.3.0"}, (int)2));
                Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
                F.h((String)object);
                object = z.a();
                if (!P.c0((String)object)) {
                    object = String.format((Locale)Locale.ROOT, (String)"%s/%s", (Object[])Arrays.copyOf((Object[])new Object[]{s, object}, (int)2));
                    Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
                    F.h((String)object);
                }
            }
            return s;
        }

        public final boolean s(J j8) {
            for (J.a a8 : j8.T()) {
            }
            j8 = j8.iterator();
            while (j8.hasNext()) {
                ((F)j8.next()).o();
            }
            return false;
        }

        public final boolean t(J j8) {
            j8 = j8.iterator();
            while (j8.hasNext()) {
                F f8 = (F)j8.next();
                for (String string2 : f8.u().keySet()) {
                    if (!this.v(f8.u().get(string2))) continue;
                    return false;
                }
            }
            return true;
        }

        public final boolean u(String string2) {
            Matcher matcher = r.matcher((CharSequence)string2);
            boolean bl = matcher.matches();
            boolean bl2 = true;
            if (bl) {
                string2 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(string2, "matcher.group(1)");
            }
            if (!i.s(string2, "me/", false, 2, null)) {
                if (i.s(string2, "/me/", false, 2, null)) {
                    return true;
                }
                bl2 = false;
            }
            return bl2;
        }

        public final boolean v(Object object) {
            if (!(object instanceof Bitmap || object instanceof byte[] || object instanceof Uri || object instanceof ParcelFileDescriptor || object instanceof f)) {
                return false;
            }
            return true;
        }

        public final boolean w(Object object) {
            if (!(object instanceof String || object instanceof Boolean || object instanceof Number || object instanceof Date)) {
                return false;
            }
            return true;
        }

        public final F x(x1.a a8, String string2, b b8) {
            return new F(a8, string2, null, null, b8, null, 32, null);
        }

        public final F y(x1.a a8, d d8) {
            return new F(a8, "me", null, null, new G(d8), null, 32, null);
        }
    }

    public static interface d {
        public void a(JSONObject var1, K var2);
    }

    public static interface e {
        public void a(String var1, String var2);
    }

    public static final class f
    implements Parcelable {
        @NotNull
        public static final Parcelable.Creator<f> CREATOR;
        public static final b q;
        public final String o;
        public final Parcelable p;

        static {
            q = new b(null);
            CREATOR = new Parcelable.Creator(){

                public f a(Parcel parcel) {
                    Intrinsics.checkNotNullParameter((Object)parcel, "source");
                    return new f(parcel, null);
                }

                public f[] b(int n8) {
                    return new f[n8];
                }
            };
        }

        public f(Parcel parcel) {
            this.o = parcel.readString();
            this.p = parcel.readParcelable(B.l().getClassLoader());
        }

        public /* synthetic */ f(Parcel parcel, kotlin.jvm.internal.g g8) {
            this(parcel);
        }

        public f(Parcelable parcelable, String string2) {
            this.o = string2;
            this.p = parcelable;
        }

        public final String a() {
            return this.o;
        }

        public final Parcelable b() {
            return this.p;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            Intrinsics.checkNotNullParameter((Object)parcel, "out");
            parcel.writeString(this.o);
            parcel.writeParcelable(this.p, n8);
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g g8) {
                this();
            }
        }

    }

    public static final class g
    implements e {
        public final OutputStream a;
        public final C b;
        public boolean c;
        public final boolean d;

        public g(OutputStream outputStream, C c8, boolean bl) {
            Intrinsics.checkNotNullParameter((Object)outputStream, "outputStream");
            this.a = outputStream;
            this.b = c8;
            this.c = true;
            this.d = bl;
        }

        @Override
        public void a(String string2, String string3) {
            Intrinsics.checkNotNullParameter(string2, "key");
            Intrinsics.checkNotNullParameter(string3, "value");
            this.f(string2, null, null);
            this.i("%s", string3);
            this.k();
            C c8 = this.b;
            if (c8 == null) {
                return;
            }
            c8.d(Intrinsics.i("    ", string2), string3);
        }

        public final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final /* varargs */ void c(String arrby, Object ... arrobject) {
            Intrinsics.checkNotNullParameter(arrby, "format");
            Intrinsics.checkNotNullParameter(arrobject, "args");
            if (!this.d) {
                Object object;
                byte[] arrby2;
                if (this.c) {
                    object = this.a;
                    arrby2 = kotlin.text.b.b;
                    byte[] arrby3 = "--".getBytes((Charset)arrby2);
                    Intrinsics.checkNotNullExpressionValue(arrby3, "(this as java.lang.String).getBytes(charset)");
                    object.write(arrby3);
                    object = this.a;
                    arrby3 = p;
                    if (arrby3 != null) {
                        arrby3 = arrby3.getBytes((Charset)arrby2);
                        Intrinsics.checkNotNullExpressionValue(arrby3, "(this as java.lang.String).getBytes(charset)");
                        object.write(arrby3);
                        object = this.a;
                        arrby2 = "\r\n".getBytes((Charset)arrby2);
                        Intrinsics.checkNotNullExpressionValue(arrby2, "(this as java.lang.String).getBytes(charset)");
                        object.write(arrby2);
                        this.c = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                arrby2 = this.a;
                object = x.a;
                arrobject = Arrays.copyOf((Object[])arrobject, (int)arrobject.length);
                arrby = String.format((String)arrby, (Object[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
                Intrinsics.checkNotNullExpressionValue(arrby, "java.lang.String.format(format, *args)");
                arrby = arrby.getBytes(kotlin.text.b.b);
                Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
                arrby2.write(arrby);
                return;
            }
            OutputStream outputStream = this.a;
            x x8 = x.a;
            x8 = Locale.US;
            arrobject = Arrays.copyOf((Object[])arrobject, (int)arrobject.length);
            arrby = String.format((Locale)x8, (String)arrby, (Object[])Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
            Intrinsics.checkNotNullExpressionValue(arrby, "java.lang.String.format(locale, format, *args)");
            arrby = URLEncoder.encode((String)arrby, (String)"UTF-8");
            Intrinsics.checkNotNullExpressionValue(arrby, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            arrby = arrby.getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(arrby);
        }

        public final void d(String string2, Bitmap object) {
            Intrinsics.checkNotNullParameter(string2, "key");
            Intrinsics.checkNotNullParameter(object, "bitmap");
            this.f(string2, string2, "image/png");
            object.compress(Bitmap.CompressFormat.PNG, 100, this.a);
            this.i("", new Object[0]);
            this.k();
            object = this.b;
            if (object == null) {
                return;
            }
            object.d(Intrinsics.i("    ", string2), "<Image>");
        }

        public final void e(String string2, byte[] object) {
            Intrinsics.checkNotNullParameter(string2, "key");
            Intrinsics.checkNotNullParameter(object, "bytes");
            this.f(string2, string2, "content/unknown");
            this.a.write((byte[])object);
            this.i("", new Object[0]);
            this.k();
            C c8 = this.b;
            if (c8 == null) {
                return;
            }
            string2 = Intrinsics.i("    ", string2);
            x x8 = x.a;
            object = String.format((Locale)Locale.ROOT, (String)"<Data: %d>", (Object[])Arrays.copyOf((Object[])new Object[]{object.length}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
            c8.d(string2, object);
        }

        public final void f(String arrby, String string2, String object) {
            if (!this.d) {
                this.c("Content-Disposition: form-data; name=\"%s\"", arrby);
                if (string2 != null) {
                    this.c("; filename=\"%s\"", string2);
                }
                this.i("", new Object[0]);
                if (object != null) {
                    this.i("%s: %s", "Content-Type", object);
                }
                this.i("", new Object[0]);
                return;
            }
            string2 = this.a;
            object = x.a;
            arrby = String.format((String)"%s=", (Object[])Arrays.copyOf((Object[])new Object[]{arrby}, (int)1));
            Intrinsics.checkNotNullExpressionValue(arrby, "java.lang.String.format(format, *args)");
            arrby = arrby.getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
            string2.write(arrby);
        }

        public final void g(String string2, Uri object, String object2) {
            int n8;
            Intrinsics.checkNotNullParameter(string2, "key");
            Intrinsics.checkNotNullParameter(object, "contentUri");
            String string3 = object2;
            if (object2 == null) {
                string3 = "content/unknown";
            }
            this.f(string2, string2, string3);
            if (this.a instanceof S) {
                long l8 = P.z((Uri)object);
                ((S)this.a).b(l8);
                n8 = 0;
            } else {
                object = B.l().getContentResolver().openInputStream((Uri)object);
                object2 = P.a;
                n8 = P.p((InputStream)object, this.a);
            }
            this.i("", new Object[0]);
            this.k();
            object = this.b;
            if (object == null) {
                return;
            }
            string2 = Intrinsics.i("    ", string2);
            object2 = x.a;
            object2 = String.format((Locale)Locale.ROOT, (String)"<Data: %d>", (Object[])Arrays.copyOf((Object[])new Object[]{n8}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(locale, format, *args)");
            object.d(string2, object2);
        }

        public final void h(String string2, ParcelFileDescriptor object, String object2) {
            int n8;
            Intrinsics.checkNotNullParameter(string2, "key");
            Intrinsics.checkNotNullParameter(object, "descriptor");
            String string3 = object2;
            if (object2 == null) {
                string3 = "content/unknown";
            }
            this.f(string2, string2, string3);
            object2 = this.a;
            if (object2 instanceof S) {
                ((S)object2).b(object.getStatSize());
                n8 = 0;
            } else {
                object = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor)object);
                object2 = P.a;
                n8 = P.p((InputStream)object, this.a);
            }
            this.i("", new Object[0]);
            this.k();
            object = this.b;
            if (object == null) {
                return;
            }
            string2 = Intrinsics.i("    ", string2);
            object2 = x.a;
            object2 = String.format((Locale)Locale.ROOT, (String)"<Data: %d>", (Object[])Arrays.copyOf((Object[])new Object[]{n8}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(locale, format, *args)");
            object.d(string2, object2);
        }

        public final /* varargs */ void i(String string2, Object ... arrobject) {
            Intrinsics.checkNotNullParameter(string2, "format");
            Intrinsics.checkNotNullParameter(arrobject, "args");
            this.c(string2, Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
            if (!this.d) {
                this.c("\r\n", new Object[0]);
            }
        }

        public final void j(String string2, Object object, F object2) {
            Intrinsics.checkNotNullParameter(string2, "key");
            OutputStream outputStream = this.a;
            if (outputStream instanceof U) {
                ((U)outputStream).a((F)object2);
            }
            if (((c)(object2 = F.n)).w(object)) {
                this.a(string2, ((c)object2).C(object));
                return;
            }
            if (object instanceof Bitmap) {
                this.d(string2, (Bitmap)object);
                return;
            }
            if (object instanceof byte[]) {
                this.e(string2, (byte[])object);
                return;
            }
            if (object instanceof Uri) {
                this.g(string2, (Uri)object, null);
                return;
            }
            if (object instanceof ParcelFileDescriptor) {
                this.h(string2, (ParcelFileDescriptor)object, null);
                return;
            }
            if (object instanceof f) {
                object2 = (f)object;
                object = object2.b();
                object2 = object2.a();
                if (object instanceof ParcelFileDescriptor) {
                    this.h(string2, (ParcelFileDescriptor)object, (String)object2);
                    return;
                }
                if (object instanceof Uri) {
                    this.g(string2, (Uri)object, (String)object2);
                    return;
                }
                throw this.b();
            }
            throw this.b();
        }

        public final void k() {
            if (!this.d) {
                this.i("--%s", p);
                return;
            }
            OutputStream outputStream = this.a;
            byte[] arrby = "&".getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(arrby);
        }

        public final void l(String string2, JSONArray object, Collection object2) {
            Intrinsics.checkNotNullParameter(string2, "key");
            Intrinsics.checkNotNullParameter(object, "requestJsonArray");
            Intrinsics.checkNotNullParameter(object2, "requests");
            Object object3 = this.a;
            if (!(object3 instanceof U)) {
                object = object.toString();
                Intrinsics.checkNotNullExpressionValue(object, "requestJsonArray.toString()");
                this.a(string2, (String)object);
                return;
            }
            object3 = (U)object3;
            this.f(string2, null, null);
            this.c("[", new Object[0]);
            object2 = object2.iterator();
            int n8 = 0;
            while (object2.hasNext()) {
                F f8 = (F)object2.next();
                JSONObject jSONObject = object.getJSONObject(n8);
                object3.a(f8);
                if (n8 > 0) {
                    this.c(",%s", jSONObject.toString());
                } else {
                    this.c("%s", jSONObject.toString());
                }
                ++n8;
            }
            this.c("]", new Object[0]);
            object2 = this.b;
            if (object2 == null) {
                return;
            }
            string2 = Intrinsics.i("    ", string2);
            object = object.toString();
            Intrinsics.checkNotNullExpressionValue(object, "requestJsonArray.toString()");
            object2.d(string2, object);
        }
    }

}

