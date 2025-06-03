// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import android.os.BaseBundle;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import java.io.InputStream;
import android.graphics.Bitmap$CompressFormat;
import java.nio.charset.Charset;
import kotlin.text.b;
import android.os.Parcel;
import org.jetbrains.annotations.NotNull;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.ParcelFileDescriptor;
import android.graphics.Bitmap;
import java.util.regex.Matcher;
import O1.z;
import O1.Q;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import org.json.JSONException;
import java.util.zip.GZIPOutputStream;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import android.os.Handler;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.io.OutputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.util.Pair;
import O1.H;
import android.net.Uri$Builder;
import android.net.Uri;
import android.util.Log;
import kotlin.text.i;
import java.util.Iterator;
import java.net.URLEncoder;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.x;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import O1.C;
import O1.P;
import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import android.os.Bundle;
import org.json.JSONObject;
import java.util.regex.Pattern;

public final class F
{
    public static final c n;
    public static final String o;
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
        n = new c(null);
        o = F.class.getSimpleName();
        final char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        final StringBuilder sb = new StringBuilder();
        final SecureRandom secureRandom = new SecureRandom();
        final int n2 = secureRandom.nextInt(11) + 30;
        if (n2 > 0) {
            int n3 = 0;
            int n4;
            do {
                n4 = n3 + 1;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while ((n3 = n4) < n2);
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        p = string;
        r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }
    
    public F(final x1.a a, final String b, final Bundle bundle, final L l, final b b2, final String i) {
        this.f = true;
        this.a = a;
        this.b = b;
        this.i = i;
        this.C(b2);
        this.F(l);
        Bundle g;
        if (bundle != null) {
            g = new Bundle(bundle);
        }
        else {
            g = new Bundle();
        }
        this.g = g;
        if (this.i == null) {
            this.i = B.w();
        }
    }
    
    public static final void b(final b b, final K k) {
        Intrinsics.checkNotNullParameter(k, "response");
        final JSONObject c = k.c();
        JSONObject optJSONObject;
        if (c == null) {
            optJSONObject = null;
        }
        else {
            optJSONObject = c.optJSONObject("__debug__");
        }
        JSONArray optJSONArray;
        if (optJSONObject == null) {
            optJSONArray = null;
        }
        else {
            optJSONArray = optJSONObject.optJSONArray("messages");
        }
        if (optJSONArray != null) {
            final int length = optJSONArray.length();
            if (length > 0) {
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    final JSONObject optJSONObject2 = optJSONArray.optJSONObject(n);
                    String optString;
                    if (optJSONObject2 == null) {
                        optString = null;
                    }
                    else {
                        optString = optJSONObject2.optString("message");
                    }
                    Object optString2;
                    if (optJSONObject2 == null) {
                        optString2 = null;
                    }
                    else {
                        optString2 = optJSONObject2.optString("type");
                    }
                    String optString3;
                    if (optJSONObject2 == null) {
                        optString3 = null;
                    }
                    else {
                        optString3 = optJSONObject2.optString("link");
                    }
                    if (optString != null && optString2 != null) {
                        N n3 = N.v;
                        if (Intrinsics.a(optString2, "warning")) {
                            n3 = N.u;
                        }
                        String string = optString;
                        if (!P.c0(optString3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append((Object)optString);
                            sb.append(" Link: ");
                            sb.append((Object)optString3);
                            string = sb.toString();
                        }
                        final C.a e = C.e;
                        final String o = F.o;
                        Intrinsics.checkNotNullExpressionValue(o, "TAG");
                        e.b(n3, o, string);
                    }
                    if (n2 >= length) {
                        break;
                    }
                    n = n2;
                }
            }
        }
        if (b == null) {
            return;
        }
        b.a(k);
    }
    
    public static final /* synthetic */ String c() {
        return F.q;
    }
    
    public static final /* synthetic */ String d() {
        return F.p;
    }
    
    public static final /* synthetic */ String e() {
        return F.s;
    }
    
    public static final /* synthetic */ Pattern f() {
        return F.r;
    }
    
    public static final /* synthetic */ void h(final String s) {
        F.s = s;
    }
    
    public final boolean A() {
        return !Intrinsics.a(B.x(), "instagram.com") || (this.z() ^ true);
    }
    
    public final void B(final JSONArray jsonArray, final Map map) {
        final JSONObject jsonObject = new JSONObject();
        final String d = this.d;
        if (d != null) {
            jsonObject.put("name", (Object)d);
            jsonObject.put("omit_response_on_success", this.f);
        }
        final String e = this.e;
        if (e != null) {
            jsonObject.put("depends_on", (Object)e);
        }
        final String v = this.v();
        jsonObject.put("relative_url", (Object)v);
        jsonObject.put("method", (Object)this.k);
        final x1.a a = this.a;
        if (a != null) {
            C.e.d(a.l());
        }
        final ArrayList<String> list = new ArrayList<String>();
        final Iterator<String> iterator = ((BaseBundle)this.g).keySet().iterator();
        while (iterator.hasNext()) {
            final Object value = ((BaseBundle)this.g).get((String)iterator.next());
            if (F.n.v(value)) {
                final x a2 = x.a;
                final String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[] { "file", map.size() }, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                list.add(format);
                map.put(format, new a(this, value));
            }
        }
        if (!list.isEmpty()) {
            jsonObject.put("attached_files", (Object)TextUtils.join((CharSequence)",", (Iterable)list));
        }
        final JSONObject c = this.c;
        if (c != null) {
            final ArrayList list2 = new ArrayList();
            F.n.D(c, v, new e() {
                @Override
                public void a(String format, final String s) {
                    Intrinsics.checkNotNullParameter(format, "key");
                    Intrinsics.checkNotNullParameter(s, "value");
                    final ArrayList a = list2;
                    final x a2 = x.a;
                    format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[] { format, URLEncoder.encode(s, "UTF-8") }, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    a.add(format);
                }
            });
            jsonObject.put("body", (Object)TextUtils.join((CharSequence)"&", (Iterable)list2));
        }
        jsonArray.put((Object)jsonObject);
    }
    
    public final void C(final b j) {
        final B a = B.a;
        if (!B.H(N.v) && !B.H(N.u)) {
            this.j = j;
            return;
        }
        this.j = (b)new E(j);
    }
    
    public final void D(final boolean l) {
        this.l = l;
    }
    
    public final void E(final JSONObject c) {
        this.c = c;
    }
    
    public final void F(final L l) {
        if (this.m != null && l != L.o) {
            throw new o("Can't change HTTP method on request with overridden URL.");
        }
        L o;
        if ((o = l) == null) {
            o = L.o;
        }
        this.k = o;
    }
    
    public final void G(final Bundle g) {
        Intrinsics.checkNotNullParameter(g, "<set-?>");
        this.g = g;
    }
    
    public final void H(final Object h) {
        this.h = h;
    }
    
    public final boolean I() {
        final String n = this.n();
        final boolean b = n != null && kotlin.text.i.v(n, "|", false, 2, null);
        return (n != null && kotlin.text.i.s(n, "IG", false, 2, null) && !b && this.z()) || (!this.A() && !b);
    }
    
    public final void i() {
        final Bundle g = this.g;
        Label_0040: {
            String s;
            if (this.I()) {
                s = this.p();
            }
            else {
                s = this.n();
                if (s == null) {
                    break Label_0040;
                }
            }
            ((BaseBundle)g).putString("access_token", s);
        }
        if (!((BaseBundle)g).containsKey("access_token")) {
            final P a = P.a;
            if (P.c0(B.r())) {
                Log.w(F.o, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        ((BaseBundle)g).putString("sdk", "android");
        ((BaseBundle)g).putString("format", "json");
        final B a2 = B.a;
        String s2;
        if (B.H(N.v)) {
            s2 = "info";
        }
        else {
            if (!B.H(N.u)) {
                return;
            }
            s2 = "warning";
        }
        ((BaseBundle)g).putString("debug", s2);
    }
    
    public final String j(String s, final boolean b) {
        if (!b && this.k == L.p) {
            return s;
        }
        final Uri$Builder buildUpon = Uri.parse(s).buildUpon();
        for (final String s2 : ((BaseBundle)this.g).keySet()) {
            if ((s = (String)((BaseBundle)this.g).get(s2)) == null) {
                s = "";
            }
            final c n = F.n;
            if (n.w(s)) {
                buildUpon.appendQueryParameter(s2, n.C(s).toString());
            }
            else {
                if (this.k == L.o) {
                    continue;
                }
                final x a = x.a;
                s = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[] { s.getClass().getSimpleName() }, 1));
                Intrinsics.checkNotNullExpressionValue(s, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(s);
            }
        }
        s = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(s, "uriBuilder.toString()");
        return s;
    }
    
    public final K k() {
        return F.n.h(this);
    }
    
    public final I l() {
        return F.n.n(this);
    }
    
    public final x1.a m() {
        return this.a;
    }
    
    public final String n() {
        final x1.a a = this.a;
        if (a != null) {
            if (!((BaseBundle)this.g).containsKey("access_token")) {
                final String l = a.l();
                C.e.d(l);
                return l;
            }
        }
        else if (!((BaseBundle)this.g).containsKey("access_token")) {
            return this.p();
        }
        return ((BaseBundle)this.g).getString("access_token");
    }
    
    public final b o() {
        return this.j;
    }
    
    public final String p() {
        final String m = B.m();
        final String r = B.r();
        if (m.length() > 0 && r.length() > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append(m);
            sb.append('|');
            sb.append(r);
            return sb.toString();
        }
        final P a = P.a;
        P.j0(F.o, "Warning: Request without access token missing application ID or client token.");
        return null;
    }
    
    public final JSONObject q() {
        return this.c;
    }
    
    public final String r() {
        return this.b;
    }
    
    public final String s() {
        if (F.r.matcher(this.b).matches()) {
            return this.b;
        }
        final x a = x.a;
        final String format = String.format("%s/%s", Arrays.copyOf(new Object[] { this.i, this.b }, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public final L t() {
        return this.k;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object a;
        if ((a = this.a) == null) {
            a = "null";
        }
        sb.append(a);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.k);
        sb.append(", parameters: ");
        sb.append(this.g);
        sb.append("}");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return string;
    }
    
    public final Bundle u() {
        return this.g;
    }
    
    public final String v() {
        if (this.m == null) {
            final String y = this.y(H.h());
            this.i();
            final Uri parse = Uri.parse(this.j(y, true));
            final x a = x.a;
            final String format = String.format("%s?%s", Arrays.copyOf(new Object[] { parse.getPath(), parse.getQuery() }, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }
        throw new o("Can't override URL for a batch request");
    }
    
    public final Object w() {
        return this.h;
    }
    
    public final String x() {
        final String m = this.m;
        if (m != null) {
            return String.valueOf(m);
        }
        final String b = this.b;
        String s;
        if (this.k == L.p && b != null && kotlin.text.i.k(b, "/videos", false, 2, null)) {
            s = H.j();
        }
        else {
            final H a = H.a;
            s = H.i(B.x());
        }
        final String y = this.y(s);
        this.i();
        return this.j(y, false);
    }
    
    public final String y(String s) {
        if (!this.A()) {
            s = H.f();
        }
        final x a = x.a;
        s = String.format("%s/%s", Arrays.copyOf(new Object[] { s, this.s() }, 2));
        Intrinsics.checkNotNullExpressionValue(s, "java.lang.String.format(format, *args)");
        return s;
    }
    
    public final boolean z() {
        final String b = this.b;
        boolean b2 = false;
        if (b == null) {
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(B.m());
        sb.append("/?.*");
        final String string = sb.toString();
        if (this.l || Pattern.matches(string, this.b) || Pattern.matches("^/?app/?.*", this.b)) {
            b2 = true;
        }
        return b2;
    }
    
    public static final class a
    {
        public final F a;
        public final Object b;
        
        public a(final F a, final Object b) {
            Intrinsics.checkNotNullParameter(a, "request");
            this.a = a;
            this.b = b;
        }
        
        public final F a() {
            return this.a;
        }
        
        public final Object b() {
            return this.b;
        }
    }
    
    public interface b
    {
        void a(final K p0);
    }
    
    public static final class c
    {
        public static final void H(final ArrayList list, final J j) {
            Intrinsics.checkNotNullParameter(list, "$callbacks");
            Intrinsics.checkNotNullParameter(j, "$requests");
            for (final Pair pair : list) {
                final F.b b = (F.b)pair.first;
                final Object second = pair.second;
                Intrinsics.checkNotNullExpressionValue(second, "pair.second");
                b.a((K)second);
            }
            final Iterator<J.a> iterator2 = (Iterator<J.a>)j.T().iterator();
            while (iterator2.hasNext()) {
                iterator2.next().a(j);
            }
        }
        
        public static final void z(final d d, final K k) {
            Intrinsics.checkNotNullParameter(k, "response");
            if (d == null) {
                return;
            }
            d.a(k.c(), k);
        }
        
        public final F A(final x1.a a, final String s, final JSONObject jsonObject, final F.b b) {
            final F f = new F(a, s, null, L.p, b, null, 32, null);
            f.E(jsonObject);
            return f;
        }
        
        public final F B(final x1.a a, final String s, final Bundle bundle, final F.b b) {
            return new F(a, s, bundle, L.p, b, null, 32, null);
        }
        
        public final String C(final Object o) {
            if (o instanceof String) {
                return (String)o;
            }
            if (o instanceof Boolean || o instanceof Number) {
                return o.toString();
            }
            if (o instanceof Date) {
                final String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)o);
                Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        
        public final void D(final JSONObject jsonObject, final String s, final e e) {
            boolean b = false;
            Label_0062: {
                if (this.u(s)) {
                    final int d = kotlin.text.i.D(s, ":", 0, false, 6, null);
                    final int d2 = kotlin.text.i.D(s, "?", 0, false, 6, null);
                    if (d > 3 && (d2 == -1 || d < d2)) {
                        b = true;
                        break Label_0062;
                    }
                }
                b = false;
            }
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s2 = keys.next();
                final Object opt = jsonObject.opt(s2);
                final boolean b2 = b && kotlin.text.i.l(s2, "image", true);
                Intrinsics.checkNotNullExpressionValue(s2, "key");
                Intrinsics.checkNotNullExpressionValue(opt, "value");
                this.E(s2, opt, e, b2);
            }
        }
        
        public final void E(final String str, Object o, final e e, final boolean b) {
            final Class<?> class1 = o.getClass();
            if (!JSONObject.class.isAssignableFrom(class1)) {
                if (JSONArray.class.isAssignableFrom(class1)) {
                    o = o;
                    final int length = ((JSONArray)o).length();
                    if (length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        final int n = i + 1;
                        final x a = x.a;
                        final String format = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[] { str, i }, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                        final Object opt = ((JSONArray)o).opt(i);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonArray.opt(i)");
                        try {
                            this.E(format, opt, e, b);
                            if (n >= length) {
                                return;
                            }
                            i = n;
                            continue;
                        }
                        finally {}
                        break;
                    }
                }
                String s;
                if (!String.class.isAssignableFrom(class1) && !Number.class.isAssignableFrom(class1) && !Boolean.class.isAssignableFrom(class1)) {
                    if (!Date.class.isAssignableFrom(class1)) {
                        final P a2 = P.a;
                        final String o2 = F.o;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("The type of property ");
                        sb.append(str);
                        sb.append(" in the graph object is unknown. It won't be sent in the request.");
                        P.j0(o2, sb.toString());
                        return;
                    }
                    s = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date)o);
                    Intrinsics.checkNotNullExpressionValue(s, "iso8601DateFormat.format(date)");
                }
                else {
                    s = o.toString();
                }
                e.a(str, s);
                return;
            }
            final JSONObject jsonObject = (JSONObject)o;
            if (!b) {
                String s2;
                String s3;
                if (jsonObject.has("id")) {
                    s2 = jsonObject.optString("id");
                    s3 = "jsonObject.optString(\"id\")";
                }
                else if (jsonObject.has("url")) {
                    s2 = jsonObject.optString("url");
                    s3 = "jsonObject.optString(\"url\")";
                }
                else {
                    if (!jsonObject.has("fbsdk:create_object")) {
                        return;
                    }
                    s2 = jsonObject.toString();
                    s3 = "jsonObject.toString()";
                }
                Intrinsics.checkNotNullExpressionValue(s2, s3);
                this.E(str, s2, e, b);
                return;
            }
            final Iterator keys = jsonObject.keys();
            while (keys.hasNext()) {
                final String s4 = keys.next();
                final x a3 = x.a;
                final String format2 = String.format("%s[%s]", Arrays.copyOf(new Object[] { str, s4 }, 2));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                final Object opt2 = jsonObject.opt(s4);
                Intrinsics.checkNotNullExpressionValue(opt2, "jsonObject.opt(propertyName)");
                this.E(format2, opt2, e, b);
            }
        }
        
        public final void F(final J j, final C c, final int n, final URL url, final OutputStream outputStream, final boolean b) {
            final g g = new g(outputStream, c, b);
            if (n == 1) {
                final F d = j.D(0);
                final HashMap<String, a> hashMap = new HashMap<String, a>();
                for (final String s : ((BaseBundle)d.u()).keySet()) {
                    final Object value = ((BaseBundle)d.u()).get(s);
                    if (this.v(value)) {
                        Intrinsics.checkNotNullExpressionValue(s, "key");
                        hashMap.put(s, new a(d, value));
                    }
                }
                if (c != null) {
                    c.b("  Parameters:\n");
                }
                this.J(d.u(), g, d);
                if (c != null) {
                    c.b("  Attachments:\n");
                }
                this.I(hashMap, g);
                final JSONObject q = d.q();
                if (q != null) {
                    final String path = url.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    this.D(q, path, g);
                }
            }
            else {
                final String p6 = this.p(j);
                if (p6.length() == 0) {
                    throw new o("App ID was not specified at the request or Settings.");
                }
                g.a("batch_app_id", p6);
                final HashMap hashMap2 = new HashMap();
                this.K(g, j, hashMap2);
                if (c != null) {
                    c.b("  Attachments:\n");
                }
                this.I(hashMap2, g);
            }
        }
        
        public final void G(final J j, final List list) {
            Intrinsics.checkNotNullParameter(j, "requests");
            Intrinsics.checkNotNullParameter(list, "responses");
            final int size = j.size();
            final ArrayList<Pair> list2 = new ArrayList<Pair>();
            if (size > 0) {
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    final F d = j.D(n);
                    if (d.o() != null) {
                        list2.add(new Pair((Object)d.o(), list.get(n)));
                    }
                    if (n2 >= size) {
                        break;
                    }
                    n = n2;
                }
            }
            if (list2.size() > 0) {
                final x1.H h = new x1.H(list2, j);
                final Handler s = j.S();
                Boolean value;
                if (s == null) {
                    value = null;
                }
                else {
                    value = s.post((Runnable)h);
                }
                if (value == null) {
                    h.run();
                }
            }
        }
        
        public final void I(final Map map, final g g) {
            for (final Map.Entry<K, a> entry : map.entrySet()) {
                if (F.n.v(entry.getValue().b())) {
                    g.j((String)entry.getKey(), entry.getValue().b(), entry.getValue().a());
                }
            }
        }
        
        public final void J(final Bundle bundle, final g g, final F f) {
            for (final String s : ((BaseBundle)bundle).keySet()) {
                final Object value = ((BaseBundle)bundle).get(s);
                if (this.w(value)) {
                    Intrinsics.checkNotNullExpressionValue(s, "key");
                    g.j(s, value, f);
                }
            }
        }
        
        public final void K(final g g, final Collection collection, final Map map) {
            final JSONArray jsonArray = new JSONArray();
            final Iterator<F> iterator = collection.iterator();
            while (iterator.hasNext()) {
                iterator.next().B(jsonArray, map);
            }
            g.l("batch", jsonArray, collection);
        }
        
        public final void L(final J j, HttpURLConnection out) {
            Intrinsics.checkNotNullParameter(j, "requests");
            Intrinsics.checkNotNullParameter(out, "connection");
            final C c = new C(N.o, "Request");
            final int size = j.size();
            final boolean t = this.t(j);
            final OutputStream outputStream = null;
            L t2;
            if (size == 1) {
                t2 = j.D(0).t();
            }
            else {
                t2 = null;
            }
            L p = t2;
            if (t2 == null) {
                p = L.p;
            }
            out.setRequestMethod(p.name());
            this.M(out, t);
            final URL url = out.getURL();
            c.b("Request:\n");
            c.d("Id", j.U());
            Intrinsics.checkNotNullExpressionValue(url, "url");
            c.d("URL", url);
            final String requestMethod = out.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            c.d("Method", requestMethod);
            final String requestProperty = out.getRequestProperty("User-Agent");
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            c.d("User-Agent", requestProperty);
            final String requestProperty2 = out.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            c.d("Content-Type", requestProperty2);
            out.setConnectTimeout(j.X());
            out.setReadTimeout(j.X());
            if (p != L.p) {
                c.e();
                return;
            }
            out.setDoOutput(true);
            Object o = outputStream;
            Label_0397: {
                try {
                    out = (HttpURLConnection)new BufferedOutputStream(out.getOutputStream());
                    if (t) {
                        try {
                            o = new GZIPOutputStream((OutputStream)out);
                        }
                        finally {
                            o = out;
                        }
                    }
                    o = out;
                    if (this.s(j)) {
                        o = out;
                        final S s = new S(j.S());
                        o = out;
                        this.F(j, null, size, url, s, t);
                        o = out;
                        final int c2 = s.c();
                        o = out;
                        out = (HttpURLConnection)new T((OutputStream)out, j, s.e(), c2);
                    }
                }
                finally {
                    break Label_0397;
                }
                try {
                    final J i;
                    this.F(i, c, size, url, (OutputStream)out, t);
                    ((OutputStream)out).close();
                    c.e();
                    return;
                }
                finally {
                    o = out;
                }
            }
            if (o != null) {
                ((OutputStream)o).close();
            }
        }
        
        public final void M(final HttpURLConnection httpURLConnection, final boolean b) {
            if (b) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", this.q());
        }
        
        public final HttpURLConnection N(final J j) {
            Intrinsics.checkNotNullParameter(j, "requests");
            this.O(j);
            try {
                URL url;
                if (j.size() == 1) {
                    url = new URL(j.D(0).x());
                }
                else {
                    url = new URL(H.h());
                }
                URLConnection urlConnection = null;
                URLConnection g = null;
                Label_0098: {
                    try {
                        final URLConnection urlConnection2 = urlConnection = (g = this.g(url));
                        this.L(j, (HttpURLConnection)urlConnection2);
                        return (HttpURLConnection)urlConnection2;
                    }
                    catch (JSONException ex) {}
                    catch (IOException ex2) {
                        break Label_0098;
                    }
                    P.q(g);
                    final JSONException ex;
                    throw new o("could not construct request body", (Throwable)ex);
                }
                P.q(urlConnection);
                final IOException ex2;
                throw new o("could not construct request body", ex2);
            }
            catch (MalformedURLException ex3) {
                throw new o("could not construct URL for request", ex3);
            }
        }
        
        public final void O(final J j) {
            Intrinsics.checkNotNullParameter(j, "requests");
            for (final F f : j) {
                if (L.o == f.t()) {
                    final P a = P.a;
                    if (!P.c0(((BaseBundle)f.u()).getString("fields"))) {
                        continue;
                    }
                    final C.a e = C.e;
                    final N t = N.t;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("GET requests for /");
                    String r;
                    if ((r = f.r()) == null) {
                        r = "";
                    }
                    sb.append(r);
                    sb.append(" should contain an explicit \"fields\" parameter.");
                    e.a(t, 5, "Request", sb.toString());
                }
            }
        }
        
        public final HttpURLConnection g(final URL url) {
            final URLConnection urlConnection = (URLConnection)FirebasePerfUrlConnection.instrument(url.openConnection());
            if (urlConnection != null) {
                final HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection;
                httpURLConnection.setRequestProperty("User-Agent", this.r());
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        
        public final K h(final F f) {
            Intrinsics.checkNotNullParameter(f, "request");
            final List k = this.k(f);
            if (k.size() == 1) {
                return k.get(0);
            }
            throw new o("invalid state: expected a single response");
        }
        
        public final List i(final Collection collection) {
            Intrinsics.checkNotNullParameter(collection, "requests");
            return this.j(new J(collection));
        }
        
        public final List j(J j) {
            Intrinsics.checkNotNullParameter(j, "requests");
            Q.i(j, "requests");
            Object o = null;
            while (true) {
                try {
                    this.N(j);
                }
                catch (Exception ex) {
                    o = null;
                }
                finally {
                    j = (J)o;
                    final Exception ex;
                    o = ex;
                    break Label_0092;
                }
                Label_0058: {
                    if (o == null) {
                        break Label_0058;
                    }
                    try {
                        List o2 = this.o((HttpURLConnection)o, j);
                        while (true) {
                            P.q((URLConnection)o);
                            return o2;
                            P.q((URLConnection)j);
                            throw o;
                            final Exception ex;
                            final List a = K.i.a(j.V(), null, new o(ex));
                            this.G(j, a);
                            o2 = a;
                            continue;
                        }
                    }
                    finally {
                        j = (J)o;
                        final HttpURLConnection httpURLConnection;
                        o = httpURLConnection;
                        continue;
                    }
                }
                break;
            }
        }
        
        public final List k(final F... array) {
            Intrinsics.checkNotNullParameter(array, "requests");
            return this.i(W5.g.u(array));
        }
        
        public final I l(final Collection collection) {
            Intrinsics.checkNotNullParameter(collection, "requests");
            return this.m(new J(collection));
        }
        
        public final I m(final J j) {
            Intrinsics.checkNotNullParameter(j, "requests");
            Q.i(j, "requests");
            final I i = new I(j);
            i.executeOnExecutor(B.t(), (Object[])new Void[0]);
            return i;
        }
        
        public final I n(final F... array) {
            Intrinsics.checkNotNullParameter(array, "requests");
            return this.l(W5.g.u(array));
        }
        
        public final List o(final HttpURLConnection httpURLConnection, final J j) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "connection");
            Intrinsics.checkNotNullParameter(j, "requests");
            final List f = K.i.f(httpURLConnection, j);
            P.q(httpURLConnection);
            final int size = j.size();
            if (size == f.size()) {
                this.G(j, f);
                x1.g.f.e().h();
                return f;
            }
            final x a = x.a;
            final String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[] { f.size(), size }, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new o(format);
        }
        
        public final String p(final J j) {
            final String m = j.M();
            if (m != null && (j.isEmpty() ^ true)) {
                return m;
            }
            final Iterator<F> iterator = j.iterator();
            while (iterator.hasNext()) {
                final x1.a i = iterator.next().m();
                if (i != null) {
                    return i.c();
                }
            }
            final String c = F.c();
            if (c != null && c.length() > 0) {
                return c;
            }
            return B.m();
        }
        
        public final String q() {
            final x a = x.a;
            final String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[] { F.d() }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }
        
        public final String r() {
            if (F.e() == null) {
                final x a = x.a;
                final String format = String.format("%s.%s", Arrays.copyOf(new Object[] { "FBAndroidSDK", "16.3.0" }, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                F.h(format);
                final String a2 = z.a();
                if (!P.c0(a2)) {
                    final String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[] { F.e(), a2 }, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    F.h(format2);
                }
            }
            return F.e();
        }
        
        public final boolean s(final J j) {
            for (J.a a : j.T()) {}
            final Iterator<F> iterator2 = j.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().o();
            }
            return false;
        }
        
        public final boolean t(final J j) {
            for (final F f : j) {
                final Iterator iterator2 = ((BaseBundle)f.u()).keySet().iterator();
                while (iterator2.hasNext()) {
                    if (this.v(((BaseBundle)f.u()).get((String)iterator2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }
        
        public final boolean u(String group) {
            final Matcher matcher = F.f().matcher(group);
            final boolean matches = matcher.matches();
            boolean b = true;
            if (matches) {
                group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
            }
            if (!kotlin.text.i.s(group, "me/", false, 2, null)) {
                if (kotlin.text.i.s(group, "/me/", false, 2, null)) {
                    return true;
                }
                b = false;
            }
            return b;
        }
        
        public final boolean v(final Object o) {
            return o instanceof Bitmap || o instanceof byte[] || o instanceof Uri || o instanceof ParcelFileDescriptor || o instanceof f;
        }
        
        public final boolean w(final Object o) {
            return o instanceof String || o instanceof Boolean || o instanceof Number || o instanceof Date;
        }
        
        public final F x(final x1.a a, final String s, final F.b b) {
            return new F(a, s, null, null, b, null, 32, null);
        }
        
        public final F y(final x1.a a, final d d) {
            return new F(a, "me", null, null, (F.b)new G(d), null, 32, null);
        }
    }
    
    public interface d
    {
        void a(final JSONObject p0, final K p1);
    }
    
    public interface e
    {
        void a(final String p0, final String p1);
    }
    
    public static final class f implements Parcelable
    {
        @NotNull
        public static final Parcelable$Creator<f> CREATOR;
        public static final b q;
        public final String o;
        public final Parcelable p;
        
        static {
            q = new b(null);
            CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
                public f a(final Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "source");
                    return new f(parcel, null);
                }
                
                public f[] b(final int n) {
                    return new f[n];
                }
            };
        }
        
        public f(final Parcel parcel) {
            this.o = parcel.readString();
            this.p = parcel.readParcelable(B.l().getClassLoader());
        }
        
        public f(final Parcelable p2, final String o) {
            this.o = o;
            this.p = p2;
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
        
        public void writeToParcel(final Parcel parcel, final int n) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.o);
            parcel.writeParcelable(this.p, n);
        }
        
        public static final class b
        {
        }
    }
    
    public static final class g implements e
    {
        public final OutputStream a;
        public final C b;
        public boolean c;
        public final boolean d;
        
        public g(final OutputStream a, final C b, final boolean d) {
            Intrinsics.checkNotNullParameter(a, "outputStream");
            this.a = a;
            this.b = b;
            this.c = true;
            this.d = d;
        }
        
        @Override
        public void a(final String s, final String s2) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(s2, "value");
            this.f(s, null, null);
            this.i("%s", s2);
            this.k();
            final C b = this.b;
            if (b == null) {
                return;
            }
            b.d(Intrinsics.i("    ", s), s2);
        }
        
        public final RuntimeException b() {
            return new IllegalArgumentException("value is not a supported type.");
        }
        
        public final void c(String s, Object... array) {
            Intrinsics.checkNotNullParameter(s, "format");
            Intrinsics.checkNotNullParameter(array, "args");
            if (!this.d) {
                if (this.c) {
                    final OutputStream a = this.a;
                    final Charset b = kotlin.text.b.b;
                    final byte[] bytes = "--".getBytes(b);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    a.write(bytes);
                    final OutputStream a2 = this.a;
                    final String d = F.d();
                    if (d == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    final byte[] bytes2 = d.getBytes(b);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    a2.write(bytes2);
                    final OutputStream a3 = this.a;
                    final byte[] bytes3 = "\r\n".getBytes(b);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                    a3.write(bytes3);
                    this.c = false;
                }
                final OutputStream a4 = this.a;
                final x a5 = x.a;
                array = Arrays.copyOf(array, array.length);
                s = String.format(s, Arrays.copyOf(array, array.length));
                Intrinsics.checkNotNullExpressionValue(s, "java.lang.String.format(format, *args)");
                final byte[] bytes4 = s.getBytes(kotlin.text.b.b);
                Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                a4.write(bytes4);
                return;
            }
            final OutputStream a6 = this.a;
            final x a7 = x.a;
            final Locale us = Locale.US;
            array = Arrays.copyOf(array, array.length);
            s = String.format(us, s, Arrays.copyOf(array, array.length));
            Intrinsics.checkNotNullExpressionValue(s, "java.lang.String.format(locale, format, *args)");
            s = URLEncoder.encode(s, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(s, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            final byte[] bytes5 = s.getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            a6.write(bytes5);
        }
        
        public final void d(final String s, final Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(s, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f(s, s, "image/png");
            bitmap.compress(Bitmap$CompressFormat.PNG, 100, this.a);
            this.i("", new Object[0]);
            this.k();
            final C b = this.b;
            if (b == null) {
                return;
            }
            b.d(Intrinsics.i("    ", s), "<Image>");
        }
        
        public final void e(String i, final byte[] b) {
            Intrinsics.checkNotNullParameter(i, "key");
            Intrinsics.checkNotNullParameter(b, "bytes");
            this.f(i, i, "content/unknown");
            this.a.write(b);
            this.i("", new Object[0]);
            this.k();
            final C b2 = this.b;
            if (b2 == null) {
                return;
            }
            i = Intrinsics.i("    ", i);
            final x a = x.a;
            final String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[] { b.length }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            b2.d(i, format);
        }
        
        public final void f(String format, final String s, final String s2) {
            if (!this.d) {
                this.c("Content-Disposition: form-data; name=\"%s\"", format);
                if (s != null) {
                    this.c("; filename=\"%s\"", s);
                }
                this.i("", new Object[0]);
                if (s2 != null) {
                    this.i("%s: %s", "Content-Type", s2);
                }
                this.i("", new Object[0]);
                return;
            }
            final OutputStream a = this.a;
            final x a2 = x.a;
            format = String.format("%s=", Arrays.copyOf(new Object[] { format }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            final byte[] bytes = format.getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            a.write(bytes);
        }
        
        public final void g(String i, final Uri uri, String format) {
            Intrinsics.checkNotNullParameter(i, "key");
            Intrinsics.checkNotNullParameter(uri, "contentUri");
            String s = format;
            if (format == null) {
                s = "content/unknown";
            }
            this.f(i, i, s);
            int p3;
            if (this.a instanceof S) {
                ((S)this.a).b(P.z(uri));
                p3 = 0;
            }
            else {
                final InputStream openInputStream = B.l().getContentResolver().openInputStream(uri);
                final P a = P.a;
                p3 = P.p(openInputStream, this.a);
            }
            this.i("", new Object[0]);
            this.k();
            final C b = this.b;
            if (b == null) {
                return;
            }
            i = Intrinsics.i("    ", i);
            final x a2 = x.a;
            format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[] { p3 }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            b.d(i, format);
        }
        
        public final void h(String i, final ParcelFileDescriptor parcelFileDescriptor, String format) {
            Intrinsics.checkNotNullParameter(i, "key");
            Intrinsics.checkNotNullParameter(parcelFileDescriptor, "descriptor");
            String s = format;
            if (format == null) {
                s = "content/unknown";
            }
            this.f(i, i, s);
            final OutputStream a = this.a;
            int p3;
            if (a instanceof S) {
                ((S)a).b(parcelFileDescriptor.getStatSize());
                p3 = 0;
            }
            else {
                final ParcelFileDescriptor$AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream = new ParcelFileDescriptor$AutoCloseInputStream(parcelFileDescriptor);
                final P a2 = P.a;
                p3 = P.p((InputStream)parcelFileDescriptor$AutoCloseInputStream, this.a);
            }
            this.i("", new Object[0]);
            this.k();
            final C b = this.b;
            if (b == null) {
                return;
            }
            i = Intrinsics.i("    ", i);
            final x a3 = x.a;
            format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[] { p3 }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            b.d(i, format);
        }
        
        public final void i(final String s, final Object... original) {
            Intrinsics.checkNotNullParameter(s, "format");
            Intrinsics.checkNotNullParameter(original, "args");
            this.c(s, Arrays.copyOf(original, original.length));
            if (!this.d) {
                this.c("\r\n", new Object[0]);
            }
        }
        
        public final void j(final String s, final Object o, final F f) {
            Intrinsics.checkNotNullParameter(s, "key");
            final OutputStream a = this.a;
            if (a instanceof U) {
                ((U)a).a(f);
            }
            final c n = F.n;
            if (n.w(o)) {
                this.a(s, n.C(o));
                return;
            }
            if (o instanceof Bitmap) {
                this.d(s, (Bitmap)o);
                return;
            }
            if (o instanceof byte[]) {
                this.e(s, (byte[])o);
                return;
            }
            if (o instanceof Uri) {
                this.g(s, (Uri)o, null);
                return;
            }
            if (o instanceof ParcelFileDescriptor) {
                this.h(s, (ParcelFileDescriptor)o, null);
                return;
            }
            if (!(o instanceof f)) {
                throw this.b();
            }
            final f f2 = (f)o;
            final Parcelable b = f2.b();
            final String a2 = f2.a();
            if (b instanceof ParcelFileDescriptor) {
                this.h(s, (ParcelFileDescriptor)b, a2);
                return;
            }
            if (b instanceof Uri) {
                this.g(s, (Uri)b, a2);
                return;
            }
            throw this.b();
        }
        
        public final void k() {
            if (!this.d) {
                this.i("--%s", F.d());
                return;
            }
            final OutputStream a = this.a;
            final byte[] bytes = "&".getBytes(kotlin.text.b.b);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            a.write(bytes);
        }
        
        public final void l(String i, final JSONArray jsonArray, final Collection collection) {
            Intrinsics.checkNotNullParameter(i, "key");
            Intrinsics.checkNotNullParameter(jsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(collection, "requests");
            final OutputStream a = this.a;
            if (!(a instanceof U)) {
                final String string = jsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "requestJsonArray.toString()");
                this.a(i, string);
                return;
            }
            final U u = (U)a;
            this.f(i, null, null);
            this.c("[", new Object[0]);
            final Iterator<F> iterator = collection.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final F f = iterator.next();
                final JSONObject jsonObject = jsonArray.getJSONObject(n);
                u.a(f);
                if (n > 0) {
                    this.c(",%s", jsonObject.toString());
                }
                else {
                    this.c("%s", jsonObject.toString());
                }
                ++n;
            }
            this.c("]", new Object[0]);
            final C b = this.b;
            if (b == null) {
                return;
            }
            i = Intrinsics.i("    ", i);
            final String string2 = jsonArray.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "requestJsonArray.toString()");
            b.d(i, string2);
        }
    }
}
