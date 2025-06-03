/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.EnumSet
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.atomic.AtomicReference
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package O1;

import C1.e;
import G1.i;
import O1.I;
import O1.P;
import O1.j;
import O1.q;
import O1.r;
import O1.s;
import O1.t;
import O1.u;
import O1.z;
import W5.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t0.f;
import x1.B;
import x1.F;
import x1.K;

public final class v {
    public static final v a = new v();
    public static final String b = v.class.getSimpleName();
    public static final List c = m.i("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled");
    public static final Map d = new ConcurrentHashMap();
    public static final AtomicReference e = new AtomicReference((Object)a.o);
    public static final ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    public static boolean g;
    public static JSONArray h;

    public static /* synthetic */ void a(b b8, r r8) {
        v.p(b8, r8);
    }

    public static /* synthetic */ void b(Context context, String string2, String string3) {
        v.i(context, string2, string3);
    }

    public static /* synthetic */ void c(b b8) {
        v.o(b8);
    }

    public static final void d(b b8) {
        Intrinsics.checkNotNullParameter(b8, "callback");
        f.add((Object)b8);
        v.h();
    }

    public static final r f(String string2) {
        if (string2 != null) {
            return (r)d.get((Object)string2);
        }
        return null;
    }

    public static final Map g() {
        Object object = B.l();
        String string2 = B.m();
        x x8 = x.a;
        string2 = String.format((String)"com.facebook.internal.APP_SETTINGS.%s", (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
        Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(format, *args)");
        object = object.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(string2, null);
        if (!P.c0((String)object)) {
            if (object != null) {
                try {
                    object = new JSONObject((String)object);
                }
                catch (JSONException jSONException) {
                    P.i0("FacebookSDK", (Exception)jSONException);
                    object = null;
                }
                if (object == null) {
                    return null;
                }
                return a.l((JSONObject)object);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        return null;
    }

    public static final void h() {
        Context context = B.l();
        String string2 = B.m();
        if (P.c0(string2)) {
            e.set((Object)a.r);
            a.n();
            return;
        }
        if (d.containsKey((Object)string2)) {
            e.set((Object)a.q);
            a.n();
            return;
        }
        Object object = e;
        a a8 = a.o;
        a a9 = a.p;
        if (!f.a((AtomicReference)object, (Object)a8, (Object)a9) && !f.a((AtomicReference)object, (Object)a.r, (Object)a9)) {
            a.n();
            return;
        }
        object = x.a;
        object = String.format((String)"com.facebook.internal.APP_SETTINGS.%s", (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        B.t().execute((Runnable)new s(context, (String)object, string2));
    }

    public static final void i(Context object, String string2, String string3) {
        Intrinsics.checkNotNullParameter(object, "$context");
        Intrinsics.checkNotNullParameter(string2, "$settingsKey");
        Intrinsics.checkNotNullParameter(string3, "$applicationId");
        SharedPreferences sharedPreferences = object.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        JSONObject jSONObject = null;
        Object object2 = sharedPreferences.getString(string2, null);
        object = jSONObject;
        if (!P.c0((String)object2)) {
            if (object2 != null) {
                try {
                    object2 = new JSONObject((String)object2);
                }
                catch (JSONException jSONException) {
                    P.i0("FacebookSDK", (Exception)jSONException);
                    object2 = null;
                }
                object = jSONObject;
                if (object2 != null) {
                    object = a.j(string3, (JSONObject)object2);
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        if ((jSONObject = (object2 = a).e(string3)) != null) {
            object2.j(string3, jSONObject);
            sharedPreferences.edit().putString(string2, jSONObject.toString()).apply();
        }
        if (object != null) {
            object = object.j();
            if (!g && object != null && object.length() > 0) {
                g = true;
                Log.w((String)b, (String)object);
            }
        }
        q.m(string3, true);
        i.d();
        string2 = e;
        object = d.containsKey((Object)string3) ? a.q : a.r;
        string2.set(object);
        object2.n();
    }

    public static final void o(b b8) {
        b8.a();
    }

    public static final void p(b b8, r r8) {
        b8.b(r8);
    }

    public static final r q(String string2, boolean bl) {
        Object object;
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        if (!bl && (object = d).containsKey((Object)string2)) {
            return (r)object.get((Object)string2);
        }
        object = a;
        Object object2 = object.e(string2);
        if (object2 == null) {
            return null;
        }
        object2 = object.j(string2, (JSONObject)object2);
        if (Intrinsics.a(string2, B.m())) {
            e.set((Object)a.q);
            object.n();
        }
        return object2;
    }

    public final JSONObject e(String object) {
        object = new Bundle();
        Object object2 = new ArrayList();
        object2.addAll((Collection)c);
        object.putString("fields", TextUtils.join((CharSequence)",", (Iterable)object2));
        object2 = F.n.x(null, "app", null);
        object2.D(true);
        object2.G((Bundle)object);
        object = object2 = object2.k().d();
        if (object2 == null) {
            object = new JSONObject();
        }
        return object;
    }

    public final r j(String string2, JSONObject object) {
        int n8;
        Object object2;
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        Intrinsics.checkNotNullParameter(object, "settingsJSON");
        Object object3 = object.optJSONArray("android_sdk_error_categories");
        j.a a8 = j.g;
        object3 = object2 = a8.a((JSONArray)object3);
        if (object2 == null) {
            object3 = a8.b();
        }
        boolean bl = ((n8 = object.optInt("app_events_feature_bitmask", 0)) & 8) != 0;
        boolean bl2 = (n8 & 16) != 0;
        boolean bl3 = (n8 & 32) != 0;
        boolean bl4 = (n8 & 256) != 0;
        boolean bl5 = (n8 & 16384) != 0;
        a8 = object.optJSONArray("auto_event_mapping_android");
        h = a8;
        if (a8 != null && z.b()) {
            object2 = e.a;
            object2 = a8 == null ? null : a8.toString();
            e.c((String)object2);
        }
        boolean bl6 = object.optBoolean("supports_implicit_sdk_logging", false);
        object2 = object.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(object2, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean bl7 = object.optBoolean("gdpv4_nux_enabled", false);
        n8 = object.optInt("app_events_session_timeout", G1.j.a());
        EnumSet enumSet = I.p.a(object.optLong("seamless_login"));
        Map map = this.k(object.optJSONObject("android_dialog_configs"));
        String string3 = object.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(string3, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String string4 = object.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(string4, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String string5 = object.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(string5, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        object = new r(bl6, (String)object2, bl7, n8, enumSet, map, bl, (j)object3, string3, string4, bl2, bl3, (JSONArray)a8, string5, bl4, bl5, object.optString("aam_rules"), object.optString("suggested_events_setting"), object.optString("restrictive_data_filter_params"), this.m(object.optJSONObject("protected_mode_rules"), "standard_params"), this.m(object.optJSONObject("protected_mode_rules"), "maca_rules"), this.l((JSONObject)object));
        d.put((Object)string2, object);
        return object;
    }

    public final Map k(JSONObject object) {
        int n8;
        JSONArray jSONArray;
        HashMap hashMap = new HashMap();
        if (object != null && (jSONArray = object.optJSONArray("data")) != null && (n8 = jSONArray.length()) > 0) {
            int n9 = 0;
            do {
                int n10 = n9 + 1;
                object = r.b.e;
                JSONObject jSONObject = jSONArray.optJSONObject(n9);
                Intrinsics.checkNotNullExpressionValue((Object)jSONObject, "dialogConfigData.optJSONObject(i)");
                r.b b8 = object.a(jSONObject);
                if (b8 != null) {
                    String string2 = b8.a();
                    jSONObject = (Map)hashMap.get((Object)string2);
                    object = jSONObject;
                    if (jSONObject == null) {
                        object = new HashMap();
                        hashMap.put((Object)string2, object);
                    }
                    object.put((Object)b8.b(), (Object)b8);
                }
                if (n10 >= n8) {
                    return hashMap;
                }
                n9 = n10;
            } while (true);
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
                hashMap.put((Object)"auto_log_app_events_default", (Object)jSONObject.getBoolean("auto_log_app_events_default"));
            }
            catch (JSONException jSONException) {
                P.i0("FacebookSDK", (Exception)jSONException);
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put((Object)"auto_log_app_events_enabled", (Object)jSONObject.getBoolean("auto_log_app_events_enabled"));
            }
            catch (JSONException jSONException) {
                P.i0("FacebookSDK", (Exception)jSONException);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public final JSONArray m(JSONObject jSONObject, String string2) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(string2);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n() {
        synchronized (this) {
            Throwable throwable2;
            block9 : {
                block7 : {
                    r r8;
                    String string2;
                    a a8;
                    block8 : {
                        a8 = (a)((Object)e.get());
                        if (a.o == a8 || a.p == a8) break block7;
                        string2 = B.m();
                        r8 = (r)d.get((Object)string2);
                        string2 = new Handler(Looper.getMainLooper());
                        if (a.r != a8) break block8;
                        while (!(a8 = f).isEmpty()) {
                            string2.post((Runnable)new t((b)a8.poll()));
                        }
                        return;
                    }
                    try {
                        do {
                            if ((a8 = f).isEmpty()) {
                                return;
                            }
                            string2.post((Runnable)new u((b)a8.poll(), r8));
                        } while (true);
                    }
                    catch (Throwable throwable2) {}
                    break block9;
                }
                return;
            }
            throw throwable2;
        }
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o = new a();
        public static final /* enum */ a p = new a();
        public static final /* enum */ a q = new a();
        public static final /* enum */ a r = new a();
        public static final /* synthetic */ a[] s;

        static {
            s = a.c();
        }

        public static final /* synthetic */ a[] c() {
            return new a[]{o, p, q, r};
        }

        public static a valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            a[] arra = s;
            return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
        }
    }

    public static interface b {
        public void a();

        public void b(r var1);
    }

}

