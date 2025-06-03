package y1;

import O1.C;
import O1.P;
import android.os.Bundle;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;
import x1.C2162o;
import x1.N;

/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2248e implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final a f21359t = new a(null);

    /* renamed from: u, reason: collision with root package name */
    public static final HashSet f21360u = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f21361o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21362p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f21363q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21364r;

    /* renamed from: s, reason: collision with root package name */
    public final String f21365s;

    /* renamed from: y1.e$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String c(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                return G1.g.c(digest);
            } catch (UnsupportedEncodingException e7) {
                P.i0("Failed to generate checksum: ", e7);
                return "1";
            } catch (NoSuchAlgorithmException e8) {
                P.i0("Failed to generate checksum: ", e8);
                return "0";
            }
        }

        public final void d(String str) {
            boolean contains;
            if (str == null || str.length() == 0 || str.length() > 40) {
                if (str == null) {
                    str = "<None Provided>";
                }
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new C2162o(format);
            }
            synchronized (C2248e.f21360u) {
                contains = C2248e.f21360u.contains(str);
                V5.t tVar = V5.t.f6803a;
            }
            if (contains) {
                return;
            }
            if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").b(str)) {
                synchronized (C2248e.f21360u) {
                    C2248e.f21360u.add(str);
                }
            } else {
                kotlin.jvm.internal.x xVar2 = kotlin.jvm.internal.x.f16233a;
                String format2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                throw new C2162o(format2);
            }
        }
    }

    /* renamed from: y1.e$b */
    public static final class b implements Serializable {

        /* renamed from: s, reason: collision with root package name */
        public static final a f21366s = new a(null);
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: o, reason: collision with root package name */
        public final String f21367o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f21368p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f21369q;

        /* renamed from: r, reason: collision with root package name */
        public final String f21370r;

        /* renamed from: y1.e$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(String jsonString, boolean z7, boolean z8, String str) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            this.f21367o = jsonString;
            this.f21368p = z7;
            this.f21369q = z8;
            this.f21370r = str;
        }

        private final Object readResolve() {
            return new C2248e(this.f21367o, this.f21368p, this.f21369q, this.f21370r, null);
        }
    }

    public C2248e(String contextName, String eventName, Double d7, Bundle bundle, boolean z7, boolean z8, UUID uuid) {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f21362p = z7;
        this.f21363q = z8;
        this.f21364r = eventName;
        this.f21361o = d(contextName, eventName, d7, bundle, uuid);
        this.f21365s = b();
    }

    private final Object writeReplace() {
        String jSONObject = this.f21361o.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new b(jSONObject, this.f21362p, this.f21363q, this.f21365s);
    }

    public final String b() {
        a aVar = f21359t;
        String jSONObject = this.f21361o.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return aVar.c(jSONObject);
    }

    public final boolean c() {
        return this.f21362p;
    }

    public final JSONObject d(String str, String str2, Double d7, Bundle bundle, UUID uuid) {
        a aVar = f21359t;
        aVar.d(str2);
        JSONObject jSONObject = new JSONObject();
        String e7 = J1.a.e(str2);
        jSONObject.put("_eventName", e7);
        jSONObject.put("_eventName_md5", aVar.c(e7));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map i7 = i(bundle);
            for (String str3 : i7.keySet()) {
                jSONObject.put(str3, i7.get(str3));
            }
        }
        if (d7 != null) {
            jSONObject.put("_valueToSum", d7.doubleValue());
        }
        if (this.f21363q) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f21362p) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C.a aVar2 = O1.C.f3715e;
            N n7 = N.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "eventObject.toString()");
            aVar2.c(n7, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    public final JSONObject e() {
        return this.f21361o;
    }

    public final String f() {
        return this.f21364r;
    }

    public final boolean g() {
        if (this.f21365s == null) {
            return true;
        }
        return Intrinsics.a(b(), this.f21365s);
    }

    public final boolean h() {
        return this.f21362p;
    }

    public final Map i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = f21359t;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            aVar.d(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new C2162o(format);
            }
            hashMap.put(key, obj.toString());
        }
        F1.a.c(hashMap);
        J1.a aVar2 = J1.a.f2675a;
        J1.a.f(hashMap, this.f21364r);
        D1.a aVar3 = D1.a.f1241a;
        D1.a.c(hashMap, this.f21364r);
        return hashMap;
    }

    public String toString() {
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f21361o.optString("_eventName"), Boolean.valueOf(this.f21362p), this.f21361o.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public C2248e(String str, boolean z7, boolean z8, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f21361o = jSONObject;
        this.f21362p = z7;
        String optString = jSONObject.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.f21364r = optString;
        this.f21365s = str2;
        this.f21363q = z8;
    }

    public /* synthetic */ C2248e(String str, boolean z7, boolean z8, String str2, kotlin.jvm.internal.g gVar) {
        this(str, z7, z8, str2);
    }
}
