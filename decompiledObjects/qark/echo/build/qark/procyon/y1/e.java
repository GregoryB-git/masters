// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import android.os.BaseBundle;
import java.util.Locale;
import kotlin.text.Regex;
import V5.t;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import O1.P;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import x1.o;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import x1.N;
import O1.C;
import J1.a;
import kotlin.jvm.internal.Intrinsics;
import java.util.UUID;
import android.os.Bundle;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import java.util.HashSet;
import java.io.Serializable;

public final class e implements Serializable
{
    private static final long serialVersionUID = 1L;
    public static final a t;
    public static final HashSet u;
    public final JSONObject o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final String s;
    
    static {
        t = new a(null);
        u = new HashSet();
    }
    
    public e(final String s, final String r, final Double n, final Bundle bundle, final boolean p7, final boolean q, final UUID uuid) {
        Intrinsics.checkNotNullParameter(s, "contextName");
        Intrinsics.checkNotNullParameter(r, "eventName");
        this.p = p7;
        this.q = q;
        this.r = r;
        this.o = this.d(s, r, n, bundle, uuid);
        this.s = this.b();
    }
    
    public e(String optString, final boolean p4, final boolean q, final String s) {
        final JSONObject o = new JSONObject(optString);
        this.o = o;
        this.p = p4;
        optString = o.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.r = optString;
        this.s = s;
        this.q = q;
    }
    
    public static final /* synthetic */ HashSet a() {
        return e.u;
    }
    
    private final Object writeReplace() {
        final String string = this.o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return new b(string, this.p, this.q, this.s);
    }
    
    public final String b() {
        final a t = e.t;
        final String string = this.o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        return t.c(string);
    }
    
    public final boolean c() {
        return this.p;
    }
    
    public final JSONObject d(final String s, String e, final Double n, final Bundle bundle, final UUID uuid) {
        final a t = e.t;
        t.d(e);
        final JSONObject jsonObject = new JSONObject();
        e = J1.a.e(e);
        jsonObject.put("_eventName", (Object)e);
        jsonObject.put("_eventName_md5", (Object)t.c(e));
        jsonObject.put("_logTime", System.currentTimeMillis() / 1000);
        jsonObject.put("_ui", (Object)s);
        if (uuid != null) {
            jsonObject.put("_session_id", (Object)uuid);
        }
        if (bundle != null) {
            final Map i = this.i(bundle);
            for (final String s2 : i.keySet()) {
                jsonObject.put(s2, (Object)i.get(s2));
            }
        }
        if (n != null) {
            jsonObject.put("_valueToSum", (double)n);
        }
        if (this.q) {
            jsonObject.put("_inBackground", (Object)"1");
        }
        if (this.p) {
            jsonObject.put("_implicitlyLogged", (Object)"1");
            return jsonObject;
        }
        final C.a e2 = C.e;
        final N s3 = N.s;
        final String string = jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "eventObject.toString()");
        e2.c(s3, "AppEvents", "Created app event '%s'", string);
        return jsonObject;
    }
    
    public final JSONObject e() {
        return this.o;
    }
    
    public final String f() {
        return this.r;
    }
    
    public final boolean g() {
        return this.s == null || Intrinsics.a(this.b(), this.s);
    }
    
    public final boolean h() {
        return this.p;
    }
    
    public final Map i(final Bundle bundle) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String s : ((BaseBundle)bundle).keySet()) {
            final a t = e.t;
            Intrinsics.checkNotNullExpressionValue(s, "key");
            t.d(s);
            final Object value = ((BaseBundle)bundle).get(s);
            if (!(value instanceof String) && !(value instanceof Number)) {
                final x a = x.a;
                final String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[] { value, s }, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new o(format);
            }
            hashMap.put(s, value.toString());
        }
        F1.a.c(hashMap);
        final J1.a a2 = J1.a.a;
        J1.a.f(hashMap, this.r);
        final D1.a a3 = D1.a.a;
        D1.a.c(hashMap, this.r);
        return hashMap;
    }
    
    @Override
    public String toString() {
        final x a = x.a;
        final String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[] { this.o.optString("_eventName"), this.p, this.o.toString() }, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
    
    public static final class a
    {
        public final String c(final String s) {
            while (true) {
                try {
                    final MessageDigest instance = MessageDigest.getInstance("MD5");
                    final Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
                    if (s != null) {
                        final byte[] bytes = s.getBytes(forName);
                        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                        instance.update(bytes, 0, bytes.length);
                        final byte[] digest = instance.digest();
                        Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                        return G1.g.c(digest);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    final NoSuchAlgorithmException ex;
                    P.i0("Failed to generate checksum: ", ex);
                    return "0";
                }
                catch (UnsupportedEncodingException ex3) {}
                catch (NoSuchAlgorithmException ex2) {}
                final NoSuchAlgorithmException ex2;
                final NoSuchAlgorithmException ex = ex2;
                continue;
            }
        }
        
        public final void d(String s) {
            if (s != null) {
                if (s.length() != 0) {
                    if (s.length() <= 40) {
                        synchronized (e.a()) {
                            final boolean contains = e.a().contains(s);
                            final t a = V5.t.a;
                            // monitorexit(e.a())
                            if (!contains) {
                                if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").b(s)) {
                                    e.a();
                                    synchronized (e.a()) {
                                        e.a().add(s);
                                        return;
                                    }
                                }
                                final x a2 = x.a;
                                s = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[] { s }, 1));
                                Intrinsics.checkNotNullExpressionValue(s, "java.lang.String.format(format, *args)");
                                throw new o(s);
                            }
                            return;
                        }
                    }
                }
            }
            String s2;
            if ((s2 = s) == null) {
                s2 = "<None Provided>";
            }
            final x a3 = x.a;
            s = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[] { s2, 40 }, 2));
            Intrinsics.checkNotNullExpressionValue(s, "java.lang.String.format(locale, format, *args)");
            throw new o(s);
        }
    }
    
    public static final class b implements Serializable
    {
        public static final a s;
        private static final long serialVersionUID = 20160803001L;
        public final String o;
        public final boolean p;
        public final boolean q;
        public final String r;
        
        static {
            s = new a(null);
        }
        
        public b(final String o, final boolean p4, final boolean q, final String r) {
            Intrinsics.checkNotNullParameter(o, "jsonString");
            this.o = o;
            this.p = p4;
            this.q = q;
            this.r = r;
        }
        
        private final Object readResolve() {
            return new e(this.o, this.p, this.q, this.r, null);
        }
        
        public static final class a
        {
        }
    }
}
