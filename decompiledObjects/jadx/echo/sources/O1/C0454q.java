package O1;

import O1.C0454q;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.F;

/* renamed from: O1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0454q f3908a = new C0454q();

    /* renamed from: b, reason: collision with root package name */
    public static final String f3909b = kotlin.jvm.internal.v.b(C0454q.class).a();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f3910c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f3911d = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    public static final Map f3912e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static Long f3913f;

    /* renamed from: g, reason: collision with root package name */
    public static P1.b f3914g;

    /* renamed from: O1.q$a */
    public interface a {
        void a();
    }

    public static final boolean d(String name, String str, boolean z7) {
        Intrinsics.checkNotNullParameter(name, "name");
        Map e7 = f3908a.e(str);
        if (!e7.containsKey(name)) {
            return z7;
        }
        Boolean bool = (Boolean) e7.get(name);
        return bool == null ? z7 : bool.booleanValue();
    }

    public static final synchronized void h(a aVar) {
        synchronized (C0454q.class) {
            if (aVar != null) {
                try {
                    f3911d.add(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            final String m7 = C2146B.m();
            C0454q c0454q = f3908a;
            if (c0454q.f(f3913f) && f3912e.containsKey(m7)) {
                c0454q.k();
                return;
            }
            final Context l7 = C2146B.l();
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m7}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            if (l7 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = l7.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            if (!P.c0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e7) {
                    P.i0("FacebookSDK", e7);
                }
                if (jSONObject != null) {
                    j(m7, jSONObject);
                }
            }
            Executor t7 = C2146B.t();
            if (t7 == null) {
                return;
            }
            if (f3910c.compareAndSet(false, true)) {
                t7.execute(new Runnable() { // from class: O1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0454q.i(m7, l7, format);
                    }
                });
            }
        }
    }

    public static final void i(String applicationId, Context context, String gateKeepersKey) {
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(gateKeepersKey, "$gateKeepersKey");
        C0454q c0454q = f3908a;
        JSONObject c7 = c0454q.c(applicationId);
        if (c7.length() != 0) {
            j(applicationId, c7);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, c7.toString()).apply();
            f3913f = Long.valueOf(System.currentTimeMillis());
        }
        c0454q.k();
        f3910c.set(false);
    }

    public static final synchronized JSONObject j(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (C0454q.class) {
            try {
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                jSONObject2 = (JSONObject) f3912e.get(applicationId);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                int i7 = 0;
                JSONObject jSONObject3 = null;
                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                    jSONObject3 = optJSONArray.optJSONObject(0);
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                if (optJSONArray2 == null) {
                    optJSONArray2 = new JSONArray();
                }
                int length = optJSONArray2.length();
                if (length > 0) {
                    while (true) {
                        int i8 = i7 + 1;
                        try {
                            JSONObject jSONObject4 = optJSONArray2.getJSONObject(i7);
                            jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                        } catch (JSONException e7) {
                            P.i0("FacebookSDK", e7);
                        }
                        if (i8 >= length) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                f3912e.put(applicationId, jSONObject2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject2;
    }

    public static final void l(a aVar) {
        aVar.a();
    }

    public static final JSONObject m(String applicationId, boolean z7) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z7) {
            Map map = f3912e;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = (JSONObject) map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject c7 = f3908a.c(applicationId);
        Context l7 = C2146B.l();
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        l7.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c7.toString()).apply();
        return j(applicationId, c7);
    }

    public final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", C2146B.B());
        bundle.putString("fields", "gatekeepers");
        F.c cVar = x1.F.f20890n;
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        x1.F x7 = cVar.x(null, format, null);
        x7.G(bundle);
        JSONObject d7 = x7.k().d();
        return d7 == null ? new JSONObject() : d7;
    }

    public final Map e(String str) {
        g();
        if (str != null) {
            Map map = f3912e;
            if (map.containsKey(str)) {
                P1.b bVar = f3914g;
                List<P1.a> a7 = bVar == null ? null : bVar.a(str);
                if (a7 != null) {
                    HashMap hashMap = new HashMap();
                    for (P1.a aVar : a7) {
                        hashMap.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                P1.b bVar2 = f3914g;
                if (bVar2 == null) {
                    bVar2 = new P1.b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new P1.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                f3914g = bVar2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final boolean f(Long l7) {
        return l7 != null && System.currentTimeMillis() - l7.longValue() < 3600000;
    }

    public final void g() {
        h(null);
    }

    public final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f3911d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVar = (a) concurrentLinkedQueue.poll();
            if (aVar != null) {
                handler.post(new Runnable() { // from class: O1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0454q.l(C0454q.a.this);
                    }
                });
            }
        }
    }
}
