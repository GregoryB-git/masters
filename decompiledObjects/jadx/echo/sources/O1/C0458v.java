package O1;

import O1.C0447j;
import O1.C0458v;
import O1.r;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.AbstractC1977f;
import x1.C2146B;

/* renamed from: O1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458v {

    /* renamed from: a, reason: collision with root package name */
    public static final C0458v f3949a = new C0458v();

    /* renamed from: b, reason: collision with root package name */
    public static final String f3950b = C0458v.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static final List f3951c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f3952d;

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f3953e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f3954f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3955g;

    /* renamed from: h, reason: collision with root package name */
    public static JSONArray f3956h;

    /* renamed from: O1.v$a */
    public enum a {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: O1.v$b */
    public interface b {
        void a();

        void b(r rVar);
    }

    static {
        List i7;
        i7 = W5.o.i("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled");
        f3951c = i7;
        f3952d = new ConcurrentHashMap();
        f3953e = new AtomicReference(a.NOT_LOADED);
        f3954f = new ConcurrentLinkedQueue();
    }

    public static final void d(b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f3954f.add(callback);
        h();
    }

    public static final r f(String str) {
        if (str != null) {
            return (r) f3952d.get(str);
        }
        return null;
    }

    public static final Map g() {
        JSONObject jSONObject;
        Context l7 = C2146B.l();
        String m7 = C2146B.m();
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m7}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        String string = l7.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(format, null);
        if (!P.c0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e7) {
                P.i0("FacebookSDK", e7);
                jSONObject = null;
            }
            if (jSONObject != null) {
                return f3949a.l(jSONObject);
            }
        }
        return null;
    }

    public static final void h() {
        final Context l7 = C2146B.l();
        final String m7 = C2146B.m();
        if (P.c0(m7)) {
            f3953e.set(a.ERROR);
            f3949a.n();
            return;
        }
        if (f3952d.containsKey(m7)) {
            f3953e.set(a.SUCCESS);
            f3949a.n();
            return;
        }
        AtomicReference atomicReference = f3953e;
        a aVar = a.NOT_LOADED;
        a aVar2 = a.LOADING;
        if (!AbstractC1977f.a(atomicReference, aVar, aVar2) && !AbstractC1977f.a(atomicReference, a.ERROR, aVar2)) {
            f3949a.n();
            return;
        }
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m7}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        C2146B.t().execute(new Runnable() { // from class: O1.s
            @Override // java.lang.Runnable
            public final void run() {
                C0458v.i(l7, format, m7);
            }
        });
    }

    public static final void i(Context context, String settingsKey, String applicationId) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(settingsKey, "$settingsKey");
        Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        r rVar = null;
        String string = sharedPreferences.getString(settingsKey, null);
        if (!P.c0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e7) {
                P.i0("FacebookSDK", e7);
                jSONObject = null;
            }
            if (jSONObject != null) {
                rVar = f3949a.j(applicationId, jSONObject);
            }
        }
        C0458v c0458v = f3949a;
        JSONObject e8 = c0458v.e(applicationId);
        if (e8 != null) {
            c0458v.j(applicationId, e8);
            sharedPreferences.edit().putString(settingsKey, e8.toString()).apply();
        }
        if (rVar != null) {
            String j7 = rVar.j();
            if (!f3955g && j7 != null && j7.length() > 0) {
                f3955g = true;
                Log.w(f3950b, j7);
            }
        }
        C0454q.m(applicationId, true);
        G1.i.d();
        f3953e.set(f3952d.containsKey(applicationId) ? a.SUCCESS : a.ERROR);
        c0458v.n();
    }

    public static final void o(b bVar) {
        bVar.a();
    }

    public static final void p(b bVar, r rVar) {
        bVar.b(rVar);
    }

    public static final r q(String applicationId, boolean z7) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        if (!z7) {
            Map map = f3952d;
            if (map.containsKey(applicationId)) {
                return (r) map.get(applicationId);
            }
        }
        C0458v c0458v = f3949a;
        JSONObject e7 = c0458v.e(applicationId);
        if (e7 == null) {
            return null;
        }
        r j7 = c0458v.j(applicationId, e7);
        if (Intrinsics.a(applicationId, C2146B.m())) {
            f3953e.set(a.SUCCESS);
            c0458v.n();
        }
        return j7;
    }

    public final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f3951c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        x1.F x7 = x1.F.f20890n.x(null, "app", null);
        x7.D(true);
        x7.G(bundle);
        JSONObject d7 = x7.k().d();
        return d7 == null ? new JSONObject() : d7;
    }

    public final r j(String applicationId, JSONObject settingsJSON) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(settingsJSON, "settingsJSON");
        JSONArray optJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        C0447j.a aVar = C0447j.f3847g;
        C0447j a7 = aVar.a(optJSONArray);
        if (a7 == null) {
            a7 = aVar.b();
        }
        C0447j c0447j = a7;
        int optInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z7 = (optInt & 8) != 0;
        boolean z8 = (optInt & 16) != 0;
        boolean z9 = (optInt & 32) != 0;
        boolean z10 = (optInt & 256) != 0;
        boolean z11 = (optInt & 16384) != 0;
        JSONArray optJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        f3956h = optJSONArray2;
        if (optJSONArray2 != null && z.b()) {
            C1.e eVar = C1.e.f910a;
            C1.e.c(optJSONArray2 == null ? null : optJSONArray2.toString());
        }
        boolean optBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String optString = settingsJSON.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = settingsJSON.optInt("app_events_session_timeout", G1.j.a());
        EnumSet a8 = I.f3747p.a(settingsJSON.optLong("seamless_login"));
        Map k7 = k(settingsJSON.optJSONObject("android_dialog_configs"));
        String optString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = settingsJSON.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = settingsJSON.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        r rVar = new r(optBoolean, optString, optBoolean2, optInt2, a8, k7, z7, c0447j, optString2, optString3, z8, z9, optJSONArray2, optString4, z10, z11, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), m(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), m(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), l(settingsJSON));
        f3952d.put(applicationId, rVar);
        return rVar;
    }

    public final Map k(JSONObject jSONObject) {
        JSONArray optJSONArray;
        int length;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                r.b.a aVar = r.b.f3938e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                Intrinsics.checkNotNullExpressionValue(optJSONObject, "dialogConfigData.optJSONObject(i)");
                r.b a7 = aVar.a(optJSONObject);
                if (a7 != null) {
                    String a8 = a7.a();
                    Map map = (Map) hashMap.get(a8);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a8, map);
                    }
                    map.put(a7.b(), a7);
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
        }
        return hashMap;
    }

    public final Map l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e7) {
                P.i0("FacebookSDK", e7);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e8) {
                P.i0("FacebookSDK", e8);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public final JSONArray m(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public final synchronized void n() {
        a aVar = (a) f3953e.get();
        if (a.NOT_LOADED != aVar && a.LOADING != aVar) {
            final r rVar = (r) f3952d.get(C2146B.m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (a.ERROR == aVar) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f3954f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final b bVar = (b) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: O1.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0458v.o(C0458v.b.this);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f3954f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final b bVar2 = (b) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: O1.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0458v.p(C0458v.b.this, rVar);
                        }
                    });
                }
            }
        }
    }
}
