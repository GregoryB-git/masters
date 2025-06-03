package D1;

import O1.C0458v;
import O1.P;
import O1.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.C2146B;
import y1.C2248e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1242b;

    /* renamed from: a, reason: collision with root package name */
    public static final a f1241a = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final List f1243c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final Set f1244d = new HashSet();

    /* renamed from: D1.a$a, reason: collision with other inner class name */
    public static final class C0016a {

        /* renamed from: a, reason: collision with root package name */
        public String f1245a;

        /* renamed from: b, reason: collision with root package name */
        public List f1246b;

        public C0016a(String eventName, List deprecateParams) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(deprecateParams, "deprecateParams");
            this.f1245a = eventName;
            this.f1246b = deprecateParams;
        }

        public final List a() {
            return this.f1246b;
        }

        public final String b() {
            return this.f1245a;
        }

        public final void c(List list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f1246b = list;
        }
    }

    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            f1242b = true;
            f1241a.b();
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public static final void c(Map parameters, String eventName) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f1242b) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (C0016a c0016a : new ArrayList(f1243c)) {
                    if (Intrinsics.a(c0016a.b(), eventName)) {
                        for (String str : arrayList) {
                            if (c0016a.a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public static final void d(List events) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(events, "events");
            if (f1242b) {
                Iterator it = events.iterator();
                while (it.hasNext()) {
                    if (f1244d.contains(((C2248e) it.next()).f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public final synchronized void b() {
        r q7;
        if (T1.a.d(this)) {
            return;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            q7 = C0458v.q(C2146B.m(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            T1.a.b(th, this);
            return;
        }
        if (q7 == null) {
            return;
        }
        String i7 = q7.i();
        if (i7 != null && i7.length() > 0) {
            JSONObject jSONObject = new JSONObject(i7);
            f1243c.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                        Set set = f1244d;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        set.add(key);
                    } else {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        C0016a c0016a = new C0016a(key, new ArrayList());
                        if (optJSONArray != null) {
                            c0016a.c(P.m(optJSONArray));
                        }
                        f1243c.add(c0016a);
                    }
                }
            }
        }
    }
}
