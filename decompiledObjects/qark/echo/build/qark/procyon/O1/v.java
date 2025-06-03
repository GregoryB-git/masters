// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.EnumSet;
import C1.e;
import x1.a;
import x1.F;
import android.text.TextUtils;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Bundle;
import android.content.SharedPreferences;
import G1.i;
import android.util.Log;
import t0.f;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import W5.m;
import org.json.JSONArray;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.List;

public final class v
{
    public static final v a;
    public static final String b;
    public static final List c;
    public static final Map d;
    public static final AtomicReference e;
    public static final ConcurrentLinkedQueue f;
    public static boolean g;
    public static JSONArray h;
    
    static {
        a = new v();
        b = v.class.getSimpleName();
        c = m.i("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled");
        d = new ConcurrentHashMap();
        e = new AtomicReference((V)v.a.o);
        f = new ConcurrentLinkedQueue();
    }
    
    public static final void d(final b e) {
        Intrinsics.checkNotNullParameter(e, "callback");
        v.f.add(e);
        h();
    }
    
    public static final r f(final String s) {
        if (s != null) {
            return v.d.get(s);
        }
        return null;
    }
    
    public static final Map g() {
        final Context l = B.l();
        final String m = B.m();
        final x a = x.a;
        final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[] { m }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        final String string = l.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(format, (String)null);
        if (P.c0(string)) {
            return null;
        }
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jsonObject;
        try {
            jsonObject = new JSONObject(string);
        }
        catch (JSONException ex) {
            P.i0("FacebookSDK", (Exception)ex);
            jsonObject = null;
        }
        if (jsonObject == null) {
            return null;
        }
        return v.a.l(jsonObject);
    }
    
    public static final void h() {
        final Context l = B.l();
        final String m = B.m();
        if (P.c0(m)) {
            v.e.set(v.a.r);
            v.a.n();
            return;
        }
        if (v.d.containsKey(m)) {
            v.e.set(v.a.q);
            v.a.n();
            return;
        }
        final AtomicReference e = v.e;
        final a o = v.a.o;
        final a p = v.a.p;
        if (!t0.f.a(e, o, p) && !t0.f.a(e, v.a.r, p)) {
            v.a.n();
            return;
        }
        final x a = x.a;
        final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[] { m }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        B.t().execute(new s(l, format, m));
    }
    
    public static final void i(final Context context, final String s, final String s2) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(s, "$settingsKey");
        Intrinsics.checkNotNullParameter(s2, "$applicationId");
        final SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        final r r = null;
        final String string = sharedPreferences.getString(s, (String)null);
        r j = r;
        if (!P.c0(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            JSONObject jsonObject;
            try {
                jsonObject = new JSONObject(string);
            }
            catch (JSONException ex) {
                P.i0("FacebookSDK", (Exception)ex);
                jsonObject = null;
            }
            j = r;
            if (jsonObject != null) {
                j = v.a.j(s2, jsonObject);
            }
        }
        final v a = v.a;
        final JSONObject e = a.e(s2);
        if (e != null) {
            a.j(s2, e);
            sharedPreferences.edit().putString(s, e.toString()).apply();
        }
        if (j != null) {
            final String i = j.j();
            if (!v.g && i != null && i.length() > 0) {
                v.g = true;
                Log.w(v.b, i);
            }
        }
        q.m(s2, true);
        i.d();
        final AtomicReference e2 = v.e;
        a newValue;
        if (v.d.containsKey(s2)) {
            newValue = v.a.q;
        }
        else {
            newValue = v.a.r;
        }
        e2.set(newValue);
        a.n();
    }
    
    public static final void o(final b b) {
        b.a();
    }
    
    public static final void p(final b b, final r r) {
        b.b(r);
    }
    
    public static final r q(final String s, final boolean b) {
        Intrinsics.checkNotNullParameter(s, "applicationId");
        if (!b) {
            final Map d = v.d;
            if (d.containsKey(s)) {
                return d.get(s);
            }
        }
        final v a = v.a;
        final JSONObject e = a.e(s);
        if (e == null) {
            return null;
        }
        final r j = a.j(s, e);
        if (Intrinsics.a(s, B.m())) {
            v.e.set(v.a.q);
            a.n();
        }
        return j;
    }
    
    public final JSONObject e(final String s) {
        final Bundle bundle = new Bundle();
        final ArrayList list = new ArrayList();
        list.addAll(v.c);
        ((BaseBundle)bundle).putString("fields", TextUtils.join((CharSequence)",", (Iterable)list));
        final F x = F.n.x(null, "app", null);
        x.D(true);
        x.G(bundle);
        JSONObject d;
        if ((d = x.k().d()) == null) {
            d = new JSONObject();
        }
        return d;
    }
    
    public final r j(final String s, final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(s, "applicationId");
        Intrinsics.checkNotNullParameter(jsonObject, "settingsJSON");
        final JSONArray optJSONArray = jsonObject.optJSONArray("android_sdk_error_categories");
        final j.a g = j.g;
        j j;
        if ((j = g.a(optJSONArray)) == null) {
            j = g.b();
        }
        final int optInt = jsonObject.optInt("app_events_feature_bitmask", 0);
        final boolean b = (optInt & 0x8) != 0x0;
        final boolean b2 = (optInt & 0x10) != 0x0;
        final boolean b3 = (optInt & 0x20) != 0x0;
        final boolean b4 = (optInt & 0x100) != 0x0;
        final boolean b5 = (optInt & 0x4000) != 0x0;
        final JSONArray jsonArray = v.h = jsonObject.optJSONArray("auto_event_mapping_android");
        if (jsonArray != null && z.b()) {
            final e a = C1.e.a;
            String string;
            if (jsonArray == null) {
                string = null;
            }
            else {
                string = jsonArray.toString();
            }
            C1.e.c(string);
        }
        final boolean optBoolean = jsonObject.optBoolean("supports_implicit_sdk_logging", false);
        final String optString = jsonObject.optString("gdpv4_nux_content", "");
        Intrinsics.checkNotNullExpressionValue(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        final boolean optBoolean2 = jsonObject.optBoolean("gdpv4_nux_enabled", false);
        final int optInt2 = jsonObject.optInt("app_events_session_timeout", G1.j.a());
        final EnumSet a2 = I.p.a(jsonObject.optLong("seamless_login"));
        final Map k = this.k(jsonObject.optJSONObject("android_dialog_configs"));
        final String optString2 = jsonObject.optString("smart_login_bookmark_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        final String optString3 = jsonObject.optString("smart_login_menu_icon_url");
        Intrinsics.checkNotNullExpressionValue(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        final String optString4 = jsonObject.optString("sdk_update_message");
        Intrinsics.checkNotNullExpressionValue(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        final r r = new r(optBoolean, optString, optBoolean2, optInt2, a2, k, b, j, optString2, optString3, b2, b3, jsonArray, optString4, b4, b5, jsonObject.optString("aam_rules"), jsonObject.optString("suggested_events_setting"), jsonObject.optString("restrictive_data_filter_params"), this.m(jsonObject.optJSONObject("protected_mode_rules"), "standard_params"), this.m(jsonObject.optJSONObject("protected_mode_rules"), "maca_rules"), this.l(jsonObject));
        v.d.put(s, r);
        return r;
    }
    
    public final Map k(final JSONObject jsonObject) {
        final HashMap<Object, Map<String, r.b>> hashMap = (HashMap<Object, Map<String, r.b>>)new HashMap<String, Map<String, r.b>>();
        if (jsonObject != null) {
            final JSONArray optJSONArray = jsonObject.optJSONArray("data");
            if (optJSONArray != null) {
                final int length = optJSONArray.length();
                if (length > 0) {
                    int n = 0;
                    while (true) {
                        final int n2 = n + 1;
                        final r.b.a e = r.b.e;
                        final JSONObject optJSONObject = optJSONArray.optJSONObject(n);
                        Intrinsics.checkNotNullExpressionValue(optJSONObject, "dialogConfigData.optJSONObject(i)");
                        final r.b a = e.a(optJSONObject);
                        if (a != null) {
                            final String a2 = a.a();
                            Map<String, r.b> map;
                            if ((map = hashMap.get(a2)) == null) {
                                map = new HashMap<String, r.b>();
                                hashMap.put(a2, map);
                            }
                            map.put(a.b(), a);
                        }
                        if (n2 >= length) {
                            break;
                        }
                        n = n2;
                    }
                    return hashMap;
                }
            }
        }
        return hashMap;
    }
    
    public final Map l(final JSONObject jsonObject) {
        if (jsonObject == null) {
            return null;
        }
        final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
        if (!jsonObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", jsonObject.getBoolean("auto_log_app_events_default"));
            }
            catch (JSONException ex) {
                P.i0("FacebookSDK", (Exception)ex);
            }
        }
        if (!jsonObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", jsonObject.getBoolean("auto_log_app_events_enabled"));
            }
            catch (JSONException ex2) {
                P.i0("FacebookSDK", (Exception)ex2);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }
    
    public final JSONArray m(final JSONObject jsonObject, final String s) {
        if (jsonObject != null) {
            return jsonObject.optJSONArray(s);
        }
        return null;
    }
    
    public final void n() {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0144: {
            Label_0141: {
                Label_0101: {
                    r r = null;
                    Label_0104: {
                        try {
                            final a a = v.e.get();
                            if (v.a.o == a || v.a.p == a) {
                                break Label_0141;
                            }
                            r = v.d.get(B.m());
                            final Handler handler = new Handler(Looper.getMainLooper());
                            if (v.a.r != a) {
                                break Label_0104;
                            }
                            while (true) {
                                final ConcurrentLinkedQueue f = v.f;
                                if (f.isEmpty()) {
                                    break;
                                }
                                handler.post((Runnable)new t((b)f.poll()));
                            }
                        }
                        finally {
                            break Label_0144;
                        }
                        break Label_0101;
                    }
                    while (true) {
                        final ConcurrentLinkedQueue f2 = v.f;
                        if (f2.isEmpty()) {
                            break;
                        }
                        final Handler handler2;
                        handler2.post((Runnable)new u((b)f2.poll(), r));
                    }
                    return;
                }
                return;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public enum a
    {
        o("NOT_LOADED", 0), 
        p("LOADING", 1), 
        q("SUCCESS", 2), 
        r("ERROR", 3);
        
        static {
            s = c();
        }
        
        public a(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ a[] c() {
            return new a[] { a.o, a.p, a.q, a.r };
        }
    }
    
    public interface b
    {
        void a();
        
        void b(final r p0);
    }
}
