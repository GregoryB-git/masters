package J1;

import O1.C0458v;
import O1.P;
import O1.r;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2676b;

    /* renamed from: a, reason: collision with root package name */
    public static final a f2675a = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final String f2677c = a.class.getCanonicalName();

    /* renamed from: d, reason: collision with root package name */
    public static final List f2678d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final Set f2679e = new CopyOnWriteArraySet();

    /* renamed from: J1.a$a, reason: collision with other inner class name */
    public static final class C0041a {

        /* renamed from: a, reason: collision with root package name */
        public String f2680a;

        /* renamed from: b, reason: collision with root package name */
        public Map f2681b;

        public C0041a(String eventName, Map restrictiveParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(restrictiveParams, "restrictiveParams");
            this.f2680a = eventName;
            this.f2681b = restrictiveParams;
        }

        public final String a() {
            return this.f2680a;
        }

        public final Map b() {
            return this.f2681b;
        }

        public final void c(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f2681b = map;
        }
    }

    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            f2676b = true;
            f2675a.c();
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public static final String e(String eventName) {
        if (T1.a.d(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return f2676b ? f2675a.d(eventName) ? "_removed_" : eventName : eventName;
        } catch (Throwable th) {
            T1.a.b(th, a.class);
            return null;
        }
    }

    public static final void f(Map parameters, String eventName) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f2676b) {
                HashMap hashMap = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String b7 = f2675a.b(eventName, str);
                    if (b7 != null) {
                        hashMap.put(str, b7);
                        parameters.remove(str);
                    }
                }
                if (!hashMap.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        parameters.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public final String b(String str, String str2) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            try {
                for (C0041a c0041a : new ArrayList(f2678d)) {
                    if (c0041a != null && Intrinsics.a(str, c0041a.a())) {
                        for (String str3 : c0041a.b().keySet()) {
                            if (Intrinsics.a(str2, str3)) {
                                return (String) c0041a.b().get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e7) {
                Log.w(f2677c, "getMatchedRuleType failed", e7);
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void c() {
        String i7;
        if (T1.a.d(this)) {
            return;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            r q7 = C0458v.q(C2146B.m(), false);
            if (q7 != null && (i7 = q7.i()) != null && i7.length() != 0) {
                JSONObject jSONObject = new JSONObject(i7);
                f2678d.clear();
                f2679e.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        C0041a c0041a = new C0041a(key, new HashMap());
                        if (optJSONObject != null) {
                            c0041a.c(P.o(optJSONObject));
                            f2678d.add(c0041a);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            f2679e.add(c0041a.a());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final boolean d(String str) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return f2679e.contains(str);
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
