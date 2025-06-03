package O1;

import O1.C0451n;
import O1.P;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import x1.C2146B;
import x1.C2148a;
import x1.C2162o;
import x1.F;
import y1.C2243L;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: b, reason: collision with root package name */
    public static int f3757b;

    /* renamed from: j, reason: collision with root package name */
    public static Locale f3765j;

    /* renamed from: a, reason: collision with root package name */
    public static final P f3756a = new P();

    /* renamed from: c, reason: collision with root package name */
    public static long f3758c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static long f3759d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static long f3760e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static String f3761f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f3762g = "";

    /* renamed from: h, reason: collision with root package name */
    public static String f3763h = "NoCarrier";

    /* renamed from: i, reason: collision with root package name */
    public static String f3764i = "";

    public interface a {
        void a(JSONObject jSONObject);

        void b(C2162o c2162o);
    }

    public static final Locale A() {
        Locale N6 = N();
        if (N6 != null) {
            return N6;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        return locale;
    }

    public static final void B0(Runnable runnable) {
        try {
            C2146B.t().execute(runnable);
        } catch (Exception unused) {
        }
    }

    public static final JSONObject C() {
        if (T1.a.d(P.class)) {
            return null;
        }
        try {
            String string = C2146B.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, P.class);
            return null;
        }
    }

    public static final void C0(JSONObject params, C0438a c0438a, String str, boolean z7, Context context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        C0451n c0451n = C0451n.f3862a;
        C0451n.b bVar = C0451n.b.ServiceUpdateCompliance;
        if (!C0451n.g(bVar)) {
            params.put("anon_id", str);
        }
        params.put("application_tracking_enabled", !z7);
        params.put("advertiser_id_collection_enabled", C2146B.k());
        if (c0438a != null) {
            if (C0451n.g(bVar)) {
                f3756a.c(params, c0438a, str, context);
            }
            if (c0438a.j() != null) {
                if (C0451n.g(bVar)) {
                    f3756a.d(params, c0438a, context);
                } else {
                    params.put("attribution", c0438a.j());
                }
            }
            if (c0438a.h() != null) {
                params.put("advertiser_id", c0438a.h());
                params.put("advertiser_tracking_enabled", !c0438a.k());
            }
            if (!c0438a.k()) {
                String f7 = C2243L.f();
                if (f7.length() != 0) {
                    params.put("ud", f7);
                }
            }
            if (c0438a.i() != null) {
                params.put("installer_package", c0438a.i());
            }
        }
    }

    public static final void D0(JSONObject params, Context appContext) {
        Locale locale;
        String language;
        int i7;
        int i8;
        Display display;
        String country;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f3756a.y0(appContext);
        String packageName = appContext.getPackageName();
        int i9 = 0;
        int i10 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return;
        }
        i10 = packageInfo.versionCode;
        f3764i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i10);
        jSONArray.put(f3764i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        f3765j = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = f3765j;
        String str = "";
        if (locale2 == null || (language = locale2.getLanguage()) == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = f3765j;
        if (locale3 != null && (country = locale3.getCountry()) != null) {
            str = country;
        }
        sb.append(str);
        jSONArray.put(sb.toString());
        jSONArray.put(f3761f);
        jSONArray.put(f3763h);
        double d7 = 0.0d;
        try {
            Object systemService = appContext.getSystemService("display");
            display = null;
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            }
        } catch (Exception unused3) {
            i7 = 0;
        }
        if (display == null) {
            i8 = 0;
            jSONArray.put(i9);
            jSONArray.put(i8);
            jSONArray.put(new DecimalFormat("#.##").format(d7));
            jSONArray.put(f3756a.v0());
            jSONArray.put(f3759d);
            jSONArray.put(f3760e);
            jSONArray.put(f3762g);
            params.put("extinfo", jSONArray.toString());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        i7 = displayMetrics.widthPixels;
        try {
            i9 = displayMetrics.heightPixels;
            d7 = displayMetrics.density;
        } catch (Exception unused4) {
        }
        i8 = i9;
        i9 = i7;
        jSONArray.put(i9);
        jSONArray.put(i8);
        jSONArray.put(new DecimalFormat("#.##").format(d7));
        jSONArray.put(f3756a.v0());
        jSONArray.put(f3759d);
        jSONArray.put(f3760e);
        jSONArray.put(f3762g);
        params.put("extinfo", jSONArray.toString());
    }

    public static final String E(String str) {
        int i7;
        Object obj;
        String str2;
        String str3;
        String q7;
        String u7 = C2146B.u();
        if (str == null) {
            return u7;
        }
        if (Intrinsics.a(str, "gaming")) {
            i7 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "fb.gg";
        } else {
            if (!Intrinsics.a(str, "instagram")) {
                return u7;
            }
            i7 = 4;
            obj = null;
            str2 = "facebook.com";
            str3 = "instagram.com";
        }
        q7 = kotlin.text.r.q(u7, str2, str3, false, i7, obj);
        return q7;
    }

    public static final String E0(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return f3756a.S("SHA-1", bytes);
    }

    public static final String F0(String str) {
        if (str == null) {
            return null;
        }
        return f3756a.R("SHA-256", str);
    }

    public static final void G(final String accessToken, final a callback) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        JSONObject a7 = G.a(accessToken);
        if (a7 != null) {
            callback.a(a7);
            return;
        }
        F.b bVar = new F.b() { // from class: O1.N
            @Override // x1.F.b
            public final void a(x1.K k7) {
                P.H(P.a.this, accessToken, k7);
            }
        };
        x1.F F6 = f3756a.F(accessToken);
        F6.C(bVar);
        F6.l();
    }

    public static final void G0(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final void H(a callback, String accessToken, x1.K response) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(accessToken, "$accessToken");
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.b() != null) {
            callback.b(response.b().e());
            return;
        }
        G g7 = G.f3743a;
        JSONObject d7 = response.d();
        if (d7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        G.b(accessToken, d7);
        callback.a(response.d());
    }

    public static final void H0(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final String J(Context context) {
        Q.j(context, "context");
        return C2146B.m();
    }

    public static final Method K(Class clazz, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method L(String className, String methodName, Class... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return K(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Locale N() {
        try {
            return C2146B.l().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object O(JSONObject jsonObject, String str, String str2) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new C2162o("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, opt);
        return jSONObject;
    }

    public static final Object T(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean U() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{C2146B.m()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context l7 = C2146B.l();
            PackageManager packageManager = l7.getPackageManager();
            String packageName = l7.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean V(Context context) {
        AutofillManager a7;
        boolean isAutofillSupported;
        boolean isEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 26 || (a7 = K.a(context.getSystemService(J.a()))) == null) {
            return false;
        }
        isAutofillSupported = a7.isAutofillSupported();
        if (!isAutofillSupported) {
            return false;
        }
        isEnabled = a7.isEnabled();
        return isEnabled;
    }

    public static final boolean W(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").b(DEVICE)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean X(Uri uri) {
        boolean l7;
        if (uri != null) {
            l7 = kotlin.text.r.l("content", uri.getScheme(), true);
            if (l7) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Y(C2148a c2148a) {
        return c2148a != null && Intrinsics.a(c2148a, C2148a.f21014z.e());
    }

    public static final boolean Z() {
        if (T1.a.d(P.class)) {
            return false;
        }
        try {
            JSONObject C7 = C();
            if (C7 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = C7.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                if (length > 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        String string = jSONArray.getString(i7);
                        Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                        String lowerCase = string.toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        if (Intrinsics.a(lowerCase, "ldu")) {
                            return true;
                        }
                        if (i8 >= length) {
                            break;
                        }
                        i7 = i8;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, P.class);
            return false;
        }
    }

    public static final boolean a0(Uri uri) {
        boolean l7;
        if (uri != null) {
            l7 = kotlin.text.r.l("file", uri.getScheme(), true);
            if (l7) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c0(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean d0(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static final boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : Intrinsics.a(obj, obj2);
    }

    public static final boolean e0(Uri uri) {
        boolean l7;
        boolean l8;
        boolean l9;
        if (uri != null) {
            l7 = kotlin.text.r.l("http", uri.getScheme(), true);
            if (l7) {
                return true;
            }
            l8 = kotlin.text.r.l("https", uri.getScheme(), true);
            if (l8) {
                return true;
            }
            l9 = kotlin.text.r.l("fbstaging", uri.getScheme(), true);
            if (l9) {
                return true;
            }
        }
        return false;
    }

    public static final JSONObject f(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject a7 = G.a(accessToken);
        if (a7 != null) {
            return a7;
        }
        x1.K k7 = f3756a.F(accessToken).k();
        if (k7.b() != null) {
            return null;
        }
        return k7.d();
    }

    public static final Set f0(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jsonArray.length();
        if (length > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                String string = jsonArray.getString(i7);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                hashSet.add(string);
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
        }
        return hashSet;
    }

    public static final Uri g(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static final List g0(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        if (length > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                arrayList.add(jsonArray.getString(i7));
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
        }
        return arrayList;
    }

    public static final Map h0(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final void i(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            P p7 = f3756a;
            p7.h(context, "facebook.com");
            p7.h(context, ".facebook.com");
            p7.h(context, "https://facebook.com");
            p7.h(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void i0(String str, Exception exc) {
        if (!C2146B.D() || str == null || exc == null) {
            return;
        }
        Log.d(str, exc.getClass().getSimpleName() + ": " + ((Object) exc.getMessage()));
    }

    public static final void j(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static final void j0(String str, String str2) {
        if (!C2146B.D() || str == null || str2 == null) {
            return;
        }
        Log.d(str, str2);
    }

    public static final String k(String str, String str2) {
        return c0(str) ? str2 : str;
    }

    public static final void k0(String str, String str2, Throwable th) {
        if (!C2146B.D() || c0(str)) {
            return;
        }
        Log.d(str, str2, th);
    }

    public static final String l0(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final List m(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            if (length <= 0) {
                return arrayList;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                String string = jsonArray.getString(i7);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
                if (i8 >= length) {
                    return arrayList;
                }
                i7 = i8;
            }
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final String m0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return f3756a.R("MD5", key);
    }

    public static final Map n(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        if (length > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                try {
                    String string = names.getString(i7);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = n((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
        }
        return hashMap;
    }

    public static final boolean n0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return V(context);
    }

    public static final Map o(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final Bundle o0(String str) {
        List V6;
        List V7;
        Bundle bundle = new Bundle();
        if (!c0(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            V6 = kotlin.text.s.V(str, new String[]{"&"}, false, 0, 6, null);
            Object[] array = V6.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i7 = 0;
            while (i7 < length) {
                String str2 = strArr[i7];
                i7++;
                V7 = kotlin.text.s.V(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = V7.toArray(new String[0]);
                if (array2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr2 = (String[]) array2;
                try {
                    if (strArr2.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"));
                    } else if (strArr2.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e7) {
                    i0("FacebookSDK", e7);
                }
            }
        }
        return bundle;
    }

    public static final int p(InputStream inputStream, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[8192];
                int i7 = 0;
                while (true) {
                    int read = bufferedInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    i7 += read;
                }
                bufferedInputStream2.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return i7;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final boolean p0(Bundle bundle, String str, Object obj) {
        String jSONObject;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        }
        if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        }
        if (obj instanceof String) {
            jSONObject = (String) obj;
        } else if (obj instanceof JSONArray) {
            jSONObject = ((JSONArray) obj).toString();
        } else {
            if (!(obj instanceof JSONObject)) {
                return false;
            }
            jSONObject = ((JSONObject) obj).toString();
        }
        bundle.putString(str, jSONObject);
        return true;
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection == null || !(uRLConnection instanceof HttpURLConnection)) {
            return;
        }
        ((HttpURLConnection) uRLConnection).disconnect();
    }

    public static final void q0(Bundle b7, String str, String str2) {
        Intrinsics.checkNotNullParameter(b7, "b");
        if (c0(str2)) {
            return;
        }
        b7.putString(str, str2);
    }

    public static final Map r0(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i7 = 0;
            do {
                i7++;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    hashMap.put(readString, readString2);
                }
            } while (i7 < readInt);
        }
        return hashMap;
    }

    public static final String s(int i7) {
        String bigInteger = new BigInteger(i7 * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    public static final String s0(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader = null;
            }
        } catch (Throwable th3) {
            bufferedInputStream = null;
            th = th3;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
                    j(bufferedInputStream);
                    j(inputStreamReader);
                    return sb2;
                }
                sb.append(cArr, 0, read);
            }
        } catch (Throwable th4) {
            th = th4;
            j(bufferedInputStream);
            j(inputStreamReader);
            throw th;
        }
    }

    public static final String t(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    public static final Map t0(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (readInt > 0) {
            int i7 = 0;
            do {
                i7++;
                hashMap.put(parcel.readString(), parcel.readString());
            } while (i7 < readInt);
        }
        return hashMap;
    }

    public static final String u(Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            String n7 = C2146B.n();
            if (n7 != null) {
                return n7;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i7 = applicationInfo.labelRes;
            if (i7 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i7);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String v() {
        Context l7 = C2146B.l();
        if (l7 == null) {
            return null;
        }
        try {
            PackageInfo packageInfo = l7.getPackageManager().getPackageInfo(l7.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final boolean w0(File file, String str) {
        return Pattern.matches("cpu[0-9]+", str);
    }

    public static final Date x(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (!(obj instanceof Long)) {
            if (obj instanceof String) {
                try {
                    parseLong = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        parseLong = ((Number) obj).longValue();
        return parseLong == 0 ? new Date(Long.MAX_VALUE) : new Date(dateBase.getTime() + (parseLong * 1000));
    }

    public static final long z(Uri contentUri) {
        Intrinsics.checkNotNullParameter(contentUri, "contentUri");
        Cursor cursor = null;
        try {
            cursor = C2146B.l().getContentResolver().query(contentUri, null, null, null, null);
            if (cursor == null) {
                return 0L;
            }
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            long j7 = cursor.getLong(columnIndex);
            cursor.close();
            return j7;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void A0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f3759d = statFs.getBlockCount() * statFs.getBlockSize();
            }
            f3759d = l(f3759d);
        } catch (Exception unused) {
        }
    }

    public final String B() {
        C2148a e7 = C2148a.f21014z.e();
        return (e7 == null || e7.h() == null) ? "facebook" : e7.h();
    }

    public final String D() {
        return f3762g;
    }

    public final x1.F F(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", M(B()));
        bundle.putString("access_token", str);
        x1.F y7 = x1.F.f20890n.y(null, null);
        y7.G(bundle);
        y7.F(x1.L.GET);
        return y7;
    }

    public final Locale I() {
        return f3765j;
    }

    public final String M(String str) {
        return Intrinsics.a(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name";
    }

    public final String P() {
        return f3764i;
    }

    public final String Q(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(digest, "digest");
        int length = digest.length;
        int i7 = 0;
        while (i7 < length) {
            byte b7 = digest[i7];
            i7++;
            sb.append(Integer.toHexString((b7 >> 4) & 15));
            sb.append(Integer.toHexString(b7 & 15));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
        return sb2;
    }

    public final String R(String str, String str2) {
        Charset charset = kotlin.text.b.f16240b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return S(str, bytes);
    }

    public final String S(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            return Q(hash, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final boolean b0(Context context) {
        Method L6 = L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (L6 == null) {
            return false;
        }
        Object T6 = T(null, L6, context);
        return (T6 instanceof Integer) && Intrinsics.a(T6, 0);
    }

    public final void c(JSONObject jSONObject, C0438a c0438a, String str, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && b0(context) && c0438a.k()) {
            return;
        }
        jSONObject.put("anon_id", str);
    }

    public final void d(JSONObject jSONObject, C0438a c0438a, Context context) {
        if (Build.VERSION.SDK_INT >= 31 && b0(context) && c0438a.k()) {
            return;
        }
        jSONObject.put("attribution", c0438a.j());
    }

    public final void h(Context context, String str) {
        List V6;
        List V7;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        V6 = kotlin.text.s.V(cookie, new String[]{";"}, false, 0, 6, null);
        Object[] array = V6.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i7 = 0;
        while (i7 < length) {
            String str2 = strArr[i7];
            i7++;
            V7 = kotlin.text.s.V(str2, new String[]{"="}, false, 0, 6, null);
            Object[] array2 = V7.toArray(new String[0]);
            if (array2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr2 = (String[]) array2;
            if (strArr2.length > 0) {
                String str3 = strArr2[0];
                int length2 = str3.length() - 1;
                int i8 = 0;
                boolean z7 = false;
                while (i8 <= length2) {
                    boolean z8 = Intrinsics.d(str3.charAt(!z7 ? i8 : length2), 32) <= 0;
                    if (z7) {
                        if (!z8) {
                            break;
                        } else {
                            length2--;
                        }
                    } else if (z8) {
                        i8++;
                    } else {
                        z7 = true;
                    }
                }
                cookieManager.setCookie(str, Intrinsics.i(str3.subSequence(i8, length2 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public final long l(double d7) {
        return Math.round(d7 / 1.073741824E9d);
    }

    public final boolean r() {
        return Intrinsics.a("mounted", Environment.getExternalStorageState());
    }

    public final void u0() {
        try {
            if (r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f3760e = statFs.getAvailableBlocks() * statFs.getBlockSize();
            }
            f3760e = l(f3760e);
        } catch (Exception unused) {
        }
    }

    public final int v0() {
        int i7 = f3757b;
        if (i7 > 0) {
            return i7;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FilenameFilter() { // from class: O1.O
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean w02;
                    w02 = P.w0(file, str);
                    return w02;
                }
            });
            if (listFiles != null) {
                f3757b = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f3757b <= 0) {
            f3757b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f3757b;
    }

    public final long w() {
        return f3760e;
    }

    public final void x0(Context context) {
        if (Intrinsics.a(f3763h, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService("phone");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                }
                String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                f3763h = networkOperatorName;
            } catch (Exception unused) {
            }
        }
    }

    public final String y() {
        return f3763h;
    }

    public final void y0(Context context) {
        if (f3758c == -1 || System.currentTimeMillis() - f3758c >= 1800000) {
            f3758c = System.currentTimeMillis();
            z0();
            x0(context);
            A0();
            u0();
        }
    }

    public final void z0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f3761f = displayName;
            String id = timeZone.getID();
            Intrinsics.checkNotNullExpressionValue(id, "tz.id");
            f3762g = id;
        } catch (AssertionError | Exception unused) {
        }
    }
}
