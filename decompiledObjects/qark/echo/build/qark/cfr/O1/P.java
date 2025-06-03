/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.hardware.display.DisplayManager
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Environment
 *  android.os.Parcel
 *  android.os.StatFs
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.Display
 *  android.view.autofill.AutofillManager
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  java.io.BufferedInputStream
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.math.BigInteger
 *  java.net.HttpURLConnection
 *  java.net.URLConnection
 *  java.net.URLDecoder
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.text.DecimalFormat
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Random
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
package O1;

import O1.G;
import O1.J;
import O1.K;
import O1.L;
import O1.M;
import O1.N;
import O1.O;
import O1.Q;
import O1.n;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
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
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import kotlin.text.b;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import x1.B;
import x1.F;
import x1.I;
import x1.a;
import x1.o;
import x1.r;

public final class P {
    public static final P a = new P();
    public static int b;
    public static long c;
    public static long d;
    public static long e;
    public static String f;
    public static String g;
    public static String h;
    public static String i;
    public static Locale j;

    static {
        c = -1L;
        d = -1L;
        e = -1L;
        f = "";
        g = "";
        h = "NoCarrier";
        i = "";
    }

    public static final Locale A() {
        Locale locale;
        Locale locale2 = locale = P.N();
        if (locale == null) {
            locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue((Object)locale2, "getDefault()");
        }
        return locale2;
    }

    public static final void B0(Runnable runnable) {
        try {
            B.t().execute(runnable);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final JSONObject C() {
        String string2;
        if (T1.a.d(P.class)) {
            return null;
        }
        try {
            string2 = B.l().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string2 == null) return null;
        }
        catch (Throwable throwable) {}
        try {
            return new JSONObject(string2);
        }
        catch (JSONException jSONException) {
            return null;
        }
        T1.a.b(throwable, P.class);
        return null;
    }

    public static final void C0(JSONObject jSONObject, O1.a a8, String string2, boolean bl, Context context) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, "params");
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Object object = n.a;
        object = n.b.P;
        if (!n.g((n.b)((Object)object))) {
            jSONObject.put("anon_id", (Object)string2);
        }
        jSONObject.put("application_tracking_enabled", bl ^ true);
        jSONObject.put("advertiser_id_collection_enabled", B.k());
        if (a8 != null) {
            if (n.g((n.b)((Object)object))) {
                a.c(jSONObject, a8, string2, context);
            }
            if (a8.j() != null) {
                if (n.g((n.b)((Object)object))) {
                    a.d(jSONObject, a8, context);
                } else {
                    jSONObject.put("attribution", (Object)a8.j());
                }
            }
            if (a8.h() != null) {
                jSONObject.put("advertiser_id", (Object)a8.h());
                jSONObject.put("advertiser_tracking_enabled", a8.k() ^ true);
            }
            if (!a8.k() && (string2 = y1.L.f()).length() != 0) {
                jSONObject.put("ud", (Object)string2);
            }
            if (a8.i() != null) {
                jSONObject.put("installer_package", (Object)a8.i());
            }
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void D0(JSONObject jSONObject, Context object) {
        double d8;
        int n8;
        JSONArray jSONArray;
        int n9;
        block21 : {
            Object object2;
            int n11;
            int n10;
            int n12;
            StringBuilder stringBuilder;
            Object object3;
            block20 : {
                block19 : {
                    block18 : {
                        Intrinsics.checkNotNullParameter((Object)jSONObject, "params");
                        Intrinsics.checkNotNullParameter(object, "appContext");
                        jSONArray = new JSONArray();
                        jSONArray.put((Object)"a2");
                        a.y0((Context)object);
                        object2 = object.getPackageName();
                        n11 = 0;
                        n10 = 0;
                        n12 = 0;
                        n9 = n8 = -1;
                        try {
                            object3 = object.getPackageManager().getPackageInfo((String)object2, 0);
                            if (object3 == null) {
                                return;
                            }
                            n9 = n8;
                            n9 = n8 = object3.versionCode;
                            i = object3.versionName;
                            n9 = n8;
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                        jSONArray.put(object2);
                        jSONArray.put(n9);
                        jSONArray.put((Object)i);
                        jSONArray.put((Object)Build.VERSION.RELEASE);
                        jSONArray.put((Object)Build.MODEL);
                        try {
                            object2 = object.getResources().getConfiguration().locale;
                            break block18;
                        }
                        catch (Exception exception) {}
                        object2 = Locale.getDefault();
                    }
                    j = object2;
                    stringBuilder = new StringBuilder();
                    object2 = j;
                    object3 = "";
                    if (object2 == null) break block19;
                    String string2 = object2.getLanguage();
                    object2 = string2;
                    if (string2 != null) break block20;
                }
                object2 = "";
            }
            stringBuilder.append((String)object2);
            stringBuilder.append('_');
            object2 = j;
            if (object2 == null) {
                object2 = object3;
            } else if ((object2 = object2.getCountry()) == null) {
                object2 = object3;
            }
            stringBuilder.append((String)object2);
            jSONArray.put((Object)stringBuilder.toString());
            jSONArray.put((Object)f);
            jSONArray.put((Object)h);
            d8 = 0.0;
            try {
                object = object.getSystemService("display");
                boolean bl = object instanceof DisplayManager;
                object2 = null;
                object = bl ? (DisplayManager)object : null;
            }
            catch (Exception exception) {}
            n8 = 0;
            n9 = n12;
            break block21;
            object = object == null ? object2 : object.getDisplay(0);
            if (object != null) {
                object2 = new DisplayMetrics();
                object.getMetrics((DisplayMetrics)object2);
                n11 = object2.widthPixels;
                n9 = n10;
                n9 = n8 = object2.heightPixels;
                float f8 = object2.density;
                d8 = f8;
                n9 = n8;
                n8 = n11;
            } else {
                n9 = 0;
                n8 = n11;
            }
            break block21;
            catch (Exception exception) {
                n8 = n11;
            }
        }
        jSONArray.put(n8);
        jSONArray.put(n9);
        jSONArray.put((Object)new DecimalFormat("#.##").format(d8));
        jSONArray.put(a.v0());
        jSONArray.put(d);
        jSONArray.put(e);
        jSONArray.put((Object)g);
        jSONObject.put("extinfo", (Object)jSONArray.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final String E(String string2) {
        String string3 = B.u();
        if (string2 == null) {
            return string3;
        }
        if (Intrinsics.a(string2, "gaming")) {
            string2 = "fb.gg";
            do {
                return i.q(string3, "facebook.com", string2, false, 4, null);
                break;
            } while (true);
        }
        if (!Intrinsics.a(string2, "instagram")) return string3;
        string2 = "instagram.com";
        return i.q(string3, "facebook.com", string2, false, 4, null);
    }

    public static final String E0(byte[] arrby) {
        Intrinsics.checkNotNullParameter(arrby, "bytes");
        return a.S("SHA-1", arrby);
    }

    public static final String F0(String string2) {
        if (string2 == null) {
            return null;
        }
        return a.R("SHA-256", string2);
    }

    public static final void G(String object, a object2) {
        Intrinsics.checkNotNullParameter(object, "accessToken");
        Intrinsics.checkNotNullParameter(object2, "callback");
        JSONObject jSONObject = G.a((String)object);
        if (jSONObject != null) {
            object2.a(jSONObject);
            return;
        }
        object2 = new N((a)object2, (String)object);
        object = a.F((String)object);
        object.C((F.b)object2);
        object.l();
    }

    public static final void G0(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Object object = (Map.Entry)map.next();
            String string2 = (String)object.getKey();
            object = (String)object.getValue();
            parcel.writeString(string2);
            parcel.writeString((String)object);
        }
    }

    public static final void H(a a8, String string2, x1.K k8) {
        Intrinsics.checkNotNullParameter(a8, "$callback");
        Intrinsics.checkNotNullParameter(string2, "$accessToken");
        Intrinsics.checkNotNullParameter(k8, "response");
        if (k8.b() != null) {
            a8.b(k8.b().e());
            return;
        }
        G g8 = G.a;
        g8 = k8.d();
        if (g8 != null) {
            G.b(string2, (JSONObject)g8);
            a8.a(k8.d());
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final void H0(Parcel parcel, Map map) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Object object = (Map.Entry)map.next();
            String string2 = (String)object.getKey();
            object = (String)object.getValue();
            parcel.writeString(string2);
            parcel.writeString((String)object);
        }
    }

    public static final String J(Context context) {
        Q.j((Object)context, "context");
        return B.m();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final /* varargs */ Method K(Class class_, String string2, Class ... arrclass) {
        Intrinsics.checkNotNullParameter((Object)class_, "clazz");
        Intrinsics.checkNotNullParameter(string2, "methodName");
        Intrinsics.checkNotNullParameter(arrclass, "parameterTypes");
        try {
            return class_.getMethod(string2, (Class[])Arrays.copyOf((Object[])arrclass, (int)arrclass.length));
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final /* varargs */ Method L(String string2, String string3, Class ... arrclass) {
        Intrinsics.checkNotNullParameter(string2, "className");
        Intrinsics.checkNotNullParameter(string3, "methodName");
        Intrinsics.checkNotNullParameter(arrclass, "parameterTypes");
        try {
            string2 = Class.forName((String)string2);
            Intrinsics.checkNotNullExpressionValue(string2, "clazz");
            return P.K((Class)string2, string3, (Class[])Arrays.copyOf((Object[])arrclass, (int)arrclass.length));
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Locale N() {
        try {
            return B.l().getResources().getConfiguration().locale;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static final Object O(JSONObject object, String object2, String string2) {
        Intrinsics.checkNotNullParameter(object, "jsonObject");
        object = object2 = object.opt((String)object2);
        if (object2 != null) {
            object = object2;
            if (object2 instanceof String) {
                object = new JSONTokener((String)object2).nextValue();
            }
        }
        if (object != null && !(object instanceof JSONObject) && !(object instanceof JSONArray)) {
            if (string2 != null) {
                object2 = new JSONObject();
                object2.putOpt(string2, object);
                return object2;
            }
            throw new o("Got an unexpected non-JSON object.");
        }
        return object;
    }

    public static final /* varargs */ Object T(Object object, Method method, Object ... arrobject) {
        Intrinsics.checkNotNullParameter((Object)method, "method");
        Intrinsics.checkNotNullParameter(arrobject, "args");
        try {
            object = method.invoke(object, Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException invocationTargetException) {
            return null;
        }
    }

    public static final boolean U() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Object object = x.a;
            object = String.format((String)"fb%s://applinks", (Object[])Arrays.copyOf((Object[])new Object[]{B.m()}, (int)1));
            Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse((String)object));
            object = B.l();
            PackageManager packageManager = object.getPackageManager();
            object = object.getPackageName();
            intent = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue((Object)intent, "packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)");
            intent = intent.iterator();
            while (intent.hasNext()) {
                boolean bl = Intrinsics.a(object, ((ResolveInfo)intent.next()).activityInfo.packageName);
                if (!bl) continue;
                return true;
            }
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static final boolean V(Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        int n8 = Build.VERSION.SDK_INT;
        boolean bl = false;
        if (n8 < 26) {
            return false;
        }
        context = K.a(context.getSystemService(J.a()));
        boolean bl2 = bl;
        if (context != null) {
            bl2 = bl;
            if (L.a((AutofillManager)context)) {
                bl2 = bl;
                if (M.a((AutofillManager)context)) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public static final boolean W(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return object.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        object = Build.DEVICE;
        if (object != null) {
            Intrinsics.checkNotNullExpressionValue(object, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").b((CharSequence)object)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean X(Uri uri) {
        if (uri != null && i.l("content", uri.getScheme(), true)) {
            return true;
        }
        return false;
    }

    public static final boolean Y(x1.a a8) {
        if (a8 != null && Intrinsics.a(a8, x1.a.z.e())) {
            return true;
        }
        return false;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final boolean Z() {
        int n8;
        JSONObject jSONObject;
        int n9;
        if (T1.a.d(P.class)) {
            return false;
        }
        try {
            jSONObject = P.C();
            if (jSONObject == null) {
                return false;
            }
            jSONObject = jSONObject.getJSONArray("data_processing_options");
            n8 = jSONObject.length();
            if (n8 <= 0) return false;
            n9 = 0;
        }
        catch (Throwable throwable22) {}
        do {
            int n10 = n9 + 1;
            String string2 = jSONObject.getString(n9);
            Intrinsics.checkNotNullExpressionValue(string2, "options.getString(i)");
            string2 = string2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(string2, "(this as java.lang.String).toLowerCase()");
            boolean bl = Intrinsics.a(string2, "ldu");
            if (bl) {
                return true;
            }
            if (n10 >= n8) {
                return false;
            }
            n9 = n10;
            continue;
            break;
        } while (true);
        T1.a.b(throwable22, P.class);
        return false;
        catch (Exception exception) {
            return false;
        }
    }

    public static /* synthetic */ void a(a a8, String string2, x1.K k8) {
        P.H(a8, string2, k8);
    }

    public static final boolean a0(Uri uri) {
        if (uri != null && i.l("file", uri.getScheme(), true)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean b(File file, String string2) {
        return P.w0(file, string2);
    }

    public static final boolean c0(String string2) {
        if (string2 != null && string2.length() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean d0(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean e(Object object, Object object2) {
        if (object == null) {
            if (object2 == null) {
                return true;
            }
            return false;
        }
        return Intrinsics.a(object, object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean e0(Uri uri) {
        boolean bl;
        if (uri == null) return false;
        String string2 = uri.getScheme();
        boolean bl2 = bl = true;
        if (i.l("http", string2, true)) return bl2;
        bl2 = bl;
        if (i.l("https", uri.getScheme(), true)) return bl2;
        if (!i.l("fbstaging", uri.getScheme(), true)) return false;
        return true;
    }

    public static final JSONObject f(String object) {
        Intrinsics.checkNotNullParameter(object, "accessToken");
        JSONObject jSONObject = G.a((String)object);
        if (jSONObject != null) {
            return jSONObject;
        }
        if ((object = a.F((String)object).k()).b() != null) {
            return null;
        }
        return object.d();
    }

    public static final Set f0(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter((Object)jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int n8 = jSONArray.length();
        if (n8 > 0) {
            int n9 = 0;
            do {
                int n10 = n9 + 1;
                String string2 = jSONArray.getString(n9);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonArray.getString(i)");
                hashSet.add((Object)string2);
                if (n10 >= n8) {
                    return hashSet;
                }
                n9 = n10;
            } while (true);
        }
        return hashSet;
    }

    public static final Uri g(String string2, String string32, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(string2);
        builder.path(string32);
        if (bundle != null) {
            for (String string32 : bundle.keySet()) {
                Object object = bundle.get(string32);
                if (!(object instanceof String)) continue;
                builder.appendQueryParameter(string32, (String)object);
            }
        }
        string2 = builder.build();
        Intrinsics.checkNotNullExpressionValue(string2, "builder.build()");
        return string2;
    }

    public static final List g0(JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter((Object)jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int n8 = jSONArray.length();
        if (n8 > 0) {
            int n9 = 0;
            do {
                int n10 = n9 + 1;
                arrayList.add((Object)jSONArray.getString(n9));
                if (n10 >= n8) {
                    return arrayList;
                }
                n9 = n10;
            } while (true);
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Map h0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "str");
        if (string2.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            string2 = new JSONObject(string2);
            Iterator iterator = string2.keys();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                Intrinsics.checkNotNullExpressionValue(string3, "key");
                String string4 = string2.getString(string3);
                Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.getString(key)");
                hashMap.put((Object)string3, (Object)string4);
            }
            return hashMap;
        }
        catch (JSONException jSONException) {
            return new HashMap();
        }
    }

    public static final void i(Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        try {
            P p8 = a;
            p8.h(context, "facebook.com");
            p8.h(context, ".facebook.com");
            p8.h(context, "https://facebook.com");
            p8.h(context, "https://.facebook.com");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void i0(String string2, Exception exception) {
        if (B.D() && string2 != null && exception != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append((Object)exception.getMessage());
            Log.d((String)string2, (String)stringBuilder.toString());
        }
    }

    public static final void j(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public static final void j0(String string2, String string3) {
        if (B.D() && string2 != null && string3 != null) {
            Log.d((String)string2, (String)string3);
        }
    }

    public static final String k(String string2, String string3) {
        String string4 = string2;
        if (P.c0(string2)) {
            string4 = string3;
        }
        return string4;
    }

    public static final void k0(String string2, String string3, Throwable throwable) {
        if (B.D() && !P.c0(string2)) {
            Log.d((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String l0(Map object) {
        Intrinsics.checkNotNullParameter(object, "map");
        boolean bl = object.isEmpty();
        String string2 = "";
        if (bl) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : object.entrySet()) {
                jSONObject.put((String)entry.getKey(), (Object)((String)entry.getValue()));
            }
            object = jSONObject.toString();
        }
        catch (JSONException jSONException) {
            object = string2;
        }
        Intrinsics.checkNotNullExpressionValue(object, "{\n      try {\n        val jsonObject = JSONObject()\n        for ((key, value) in map) {\n          jsonObject.put(key, value)\n        }\n        jsonObject.toString()\n      } catch (_e: JSONException) {\n        \"\"\n      }\n    }");
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final List m(JSONArray jSONArray) {
        Object object;
        int n8;
        int n9;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter((Object)jSONArray, "jsonArray");
        try {
            arrayList = new ArrayList();
            n9 = jSONArray.length();
            object = arrayList;
            if (n9 <= 0) return object;
            n8 = 0;
        }
        catch (JSONException jSONException) {
            return new ArrayList();
        }
        do {
            int n10 = n8 + 1;
            object = jSONArray.getString(n8);
            Intrinsics.checkNotNullExpressionValue(object, "jsonArray.getString(i)");
            arrayList.add(object);
            if (n10 >= n9) {
                return arrayList;
            }
            n8 = n10;
            continue;
            break;
        } while (true);
    }

    public static final String m0(String string2) {
        Intrinsics.checkNotNullParameter(string2, "key");
        return a.R("MD5", string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Map n(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = jSONObject.names();
        if (jSONArray == null) {
            return hashMap;
        }
        int n8 = jSONArray.length();
        if (n8 <= 0) {
            return hashMap;
        }
        int n9 = 0;
        do {
            int n10;
            n10 = n9 + 1;
            try {
                Object object;
                String string2 = jSONArray.getString(n9);
                Intrinsics.checkNotNullExpressionValue(string2, "keys.getString(i)");
                Object object2 = object = jSONObject.get(string2);
                if (object instanceof JSONObject) {
                    object2 = P.n((JSONObject)object);
                }
                Intrinsics.checkNotNullExpressionValue(object2, "value");
                hashMap.put((Object)string2, object2);
            }
            catch (JSONException jSONException) {}
            if (n10 >= n8) {
                return hashMap;
            }
            n9 = n10;
        } while (true);
    }

    public static final boolean n0(Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        return P.V(context);
    }

    public static final Map o(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter((Object)jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            String string3 = jSONObject.optString(string2);
            if (string3 == null) continue;
            Intrinsics.checkNotNullExpressionValue(string2, "key");
            hashMap.put((Object)string2, (Object)string3);
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Bundle o0(String arrobject) {
        Bundle bundle = new Bundle();
        if (P.c0((String)arrobject)) {
            return bundle;
        }
        if (arrobject == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        if ((arrobject = ((Collection)i.V((CharSequence)arrobject, new String[]{"&"}, false, 0, 6, null)).toArray((Object[])new String[0])) == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        arrobject = (String[])arrobject;
        int n8 = arrobject.length;
        int n9 = 0;
        while (n9 < n8) {
            Object[] arrobject2 = arrobject[n9];
            int n10 = n9 + 1;
            if ((arrobject2 = ((Collection)i.V((CharSequence)arrobject2, new String[]{"="}, false, 0, 6, null)).toArray((Object[])new String[0])) == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            arrobject2 = (String[])arrobject2;
            try {
                n9 = arrobject2.length;
                if (n9 == 2) {
                    bundle.putString(URLDecoder.decode((String)arrobject2[0], (String)"UTF-8"), URLDecoder.decode((String)arrobject2[1], (String)"UTF-8"));
                    n9 = n10;
                    continue;
                }
                n9 = n10;
                if (arrobject2.length != 1) continue;
                bundle.putString(URLDecoder.decode((String)arrobject2[0], (String)"UTF-8"), "");
                n9 = n10;
                continue;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {}
            P.i0("FacebookSDK", (Exception)unsupportedEncodingException);
            n9 = n10;
        }
        return bundle;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final int p(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        int n8;
        int n9;
        byte[] arrby;
        block8 : {
            block9 : {
                Intrinsics.checkNotNullParameter((Object)outputStream, "outputStream");
                arrby = null;
                bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    arrby = new byte[8192];
                    n9 = 0;
                    break block8;
                }
                catch (Throwable throwable) {
                    outputStream = bufferedInputStream;
                    bufferedInputStream = throwable;
                    break block9;
                }
                catch (Throwable throwable) {
                    outputStream = arrby;
                }
            }
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream == null) {
                throw bufferedInputStream;
            }
            inputStream.close();
            throw bufferedInputStream;
        }
        while ((n8 = bufferedInputStream.read(arrby)) != -1) {
            outputStream.write(arrby, 0, n8);
            n9 += n8;
        }
        bufferedInputStream.close();
        if (inputStream == null) {
            return n9;
        }
        inputStream.close();
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final boolean p0(Bundle bundle, String string2, Object object) {
        Intrinsics.checkNotNullParameter((Object)bundle, "bundle");
        if (object == null) {
            bundle.remove(string2);
            return true;
        }
        if (object instanceof Boolean) {
            bundle.putBoolean(string2, ((Boolean)object).booleanValue());
            return true;
        }
        if (object instanceof boolean[]) {
            bundle.putBooleanArray(string2, (boolean[])object);
            return true;
        }
        if (object instanceof Double) {
            bundle.putDouble(string2, ((Number)object).doubleValue());
            return true;
        }
        if (object instanceof double[]) {
            bundle.putDoubleArray(string2, (double[])object);
            return true;
        }
        if (object instanceof Integer) {
            bundle.putInt(string2, ((Number)object).intValue());
            return true;
        }
        if (object instanceof int[]) {
            bundle.putIntArray(string2, (int[])object);
            return true;
        }
        if (object instanceof Long) {
            bundle.putLong(string2, ((Number)object).longValue());
            return true;
        }
        if (object instanceof long[]) {
            bundle.putLongArray(string2, (long[])object);
            return true;
        }
        if (object instanceof String) {
            object = (String)object;
        } else if (object instanceof JSONArray) {
            object = ((JSONArray)object).toString();
        } else {
            if (!(object instanceof JSONObject)) return false;
            object = ((JSONObject)object).toString();
        }
        bundle.putString(string2, (String)object);
        return true;
    }

    public static final void q(URLConnection uRLConnection) {
        if (uRLConnection != null && uRLConnection instanceof HttpURLConnection) {
            ((HttpURLConnection)uRLConnection).disconnect();
        }
    }

    public static final void q0(Bundle bundle, String string2, String string3) {
        Intrinsics.checkNotNullParameter((Object)bundle, "b");
        if (!P.c0(string3)) {
            bundle.putString(string2, string3);
        }
    }

    public static final Map r0(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        int n8 = parcel.readInt();
        if (n8 < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (n8 > 0) {
            int n9;
            int n10 = 0;
            do {
                n9 = n10 + 1;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string2 != null && string3 != null) {
                    hashMap.put((Object)string2, (Object)string3);
                }
                n10 = n9;
            } while (n9 < n8);
        }
        return hashMap;
    }

    public static final String s(int n8) {
        String string2 = new BigInteger(n8 * 5, new Random()).toString(32);
        Intrinsics.checkNotNullExpressionValue(string2, "BigInteger(length * 5, r).toString(32)");
        return string2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final String s0(InputStream object) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        void var0_3;
        block7 : {
            bufferedInputStream2 = new BufferedInputStream((InputStream)object);
            bufferedInputStream = new InputStreamReader((InputStream)bufferedInputStream2);
            try {
                int n8;
                object = new StringBuilder();
                char[] arrc = new char[2048];
                while ((n8 = bufferedInputStream.read(arrc)) != -1) {
                    object.append(arrc, 0, n8);
                }
                object = object.toString();
                Intrinsics.checkNotNullExpressionValue(object, "{\n      bufferedInputStream = BufferedInputStream(inputStream)\n      reader = InputStreamReader(bufferedInputStream)\n      val stringBuilder = StringBuilder()\n      val bufferSize = 1024 * 2\n      val buffer = CharArray(bufferSize)\n      var n = 0\n      while (reader.read(buffer).also { n = it } != -1) {\n        stringBuilder.append(buffer, 0, n)\n      }\n      stringBuilder.toString()\n    }");
            }
            catch (Throwable throwable) {}
            P.j((Closeable)bufferedInputStream2);
            P.j((Closeable)bufferedInputStream);
            return object;
            catch (Throwable throwable) {
                bufferedInputStream = null;
                break block7;
            }
            catch (Throwable throwable) {
                bufferedInputStream = bufferedInputStream2 = null;
            }
        }
        P.j((Closeable)bufferedInputStream2);
        P.j((Closeable)bufferedInputStream);
        throw var0_3;
    }

    public static final String t(Context object) {
        if (object == null) {
            return "null";
        }
        if (object == object.getApplicationContext()) {
            return "unknown";
        }
        object = object.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(object, "{\n      context.javaClass.simpleName\n    }");
        return object;
    }

    public static final Map t0(Parcel parcel) {
        Intrinsics.checkNotNullParameter((Object)parcel, "parcel");
        int n8 = parcel.readInt();
        if (n8 < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (n8 > 0) {
            int n9;
            int n10 = 0;
            do {
                n9 = n10 + 1;
                hashMap.put((Object)parcel.readString(), (Object)parcel.readString());
                n10 = n9;
            } while (n9 < n8);
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String u(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        try {
            String string2 = B.n();
            if (string2 != null) {
                return string2;
            }
            string2 = object.getApplicationInfo();
            int n8 = string2.labelRes;
            if (n8 == 0) {
                return string2.nonLocalizedLabel.toString();
            }
            object = object.getString(n8);
            Intrinsics.checkNotNullExpressionValue(object, "context.getString(stringId)");
            return object;
        }
        catch (Exception exception) {
            return "";
        }
    }

    public static final String v() {
        Object object;
        block4 : {
            object = B.l();
            if (object == null) {
                return null;
            }
            String string2 = object.getPackageName();
            try {
                object = object.getPackageManager().getPackageInfo(string2, 0);
                if (object != null) break block4;
                return null;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return null;
            }
        }
        object = object.versionName;
        return object;
    }

    public static final boolean w0(File file, String string2) {
        return Pattern.matches((String)"cpu[0-9]+", (CharSequence)string2);
    }

    public static final Date x(Bundle object, String string2, Date date) {
        block9 : {
            long l8;
            block8 : {
                block7 : {
                    Intrinsics.checkNotNullParameter((Object)date, "dateBase");
                    if (object == null) {
                        return null;
                    }
                    if (!((object = object.get(string2)) instanceof Long)) break block7;
                    l8 = ((Number)object).longValue();
                    break block8;
                }
                if (!(object instanceof String)) break block9;
                try {
                    l8 = Long.parseLong((String)((String)object));
                }
                catch (NumberFormatException numberFormatException) {
                    return null;
                }
            }
            if (l8 == 0L) {
                return new Date(Long.MAX_VALUE);
            }
            return new Date(date.getTime() + l8 * 1000L);
        }
        return null;
    }

    public static final long z(Uri uri) {
        Intrinsics.checkNotNullParameter((Object)uri, "contentUri");
        Uri uri2 = null;
        try {
            uri = B.l().getContentResolver().query(uri, null, null, null, null);
            if (uri == null) {
                return 0L;
            }
            uri2 = uri;
        }
        catch (Throwable throwable) {
            if (uri2 != null) {
                uri2.close();
            }
            throw throwable;
        }
        int n8 = uri.getColumnIndex("_size");
        uri2 = uri;
        uri.moveToFirst();
        uri2 = uri;
        long l8 = uri.getLong(n8);
        uri.close();
        return l8;
    }

    public final void A0() {
        try {
            if (this.r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                d = (long)statFs.getBlockCount() * (long)statFs.getBlockSize();
            }
            d = this.l(d);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final String B() {
        x1.a a8 = x1.a.z.e();
        if (a8 != null && a8.h() != null) {
            return a8.h();
        }
        return "facebook";
    }

    public final String D() {
        return g;
    }

    public final F F(String object) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", this.M(this.B()));
        bundle.putString("access_token", (String)object);
        object = F.n.y(null, null);
        object.G(bundle);
        object.F(x1.L.o);
        return object;
    }

    public final Locale I() {
        return j;
    }

    public final String M(String string2) {
        if (Intrinsics.a(string2, "instagram")) {
            return "id,name,profile_picture";
        }
        return "id,name,first_name,middle_name,last_name";
    }

    public final String P() {
        return i;
    }

    public final String Q(MessageDigest object, byte[] stringBuilder) {
        object.update((byte[])stringBuilder);
        object = object.digest();
        stringBuilder = new StringBuilder();
        Intrinsics.checkNotNullExpressionValue(object, "digest");
        for (byte by : object) {
            stringBuilder.append(Integer.toHexString((int)(by >> 4 & 15)));
            stringBuilder.append(Integer.toHexString((int)(by & 15)));
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "builder.toString()");
        return object;
    }

    public final String R(String string2, String arrby) {
        Charset charset = b.b;
        if (arrby != null) {
            arrby = arrby.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
            return this.S(string2, arrby);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String S(String string2, byte[] arrby) {
        try {
            string2 = MessageDigest.getInstance((String)string2);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(string2, "hash");
        return this.Q((MessageDigest)string2, arrby);
    }

    public final boolean b0(Context object) {
        Method method = P.L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (method == null) {
            return false;
        }
        Object[] arrobject = new Object[]{object};
        object = P.T(null, method, arrobject);
        if (object instanceof Integer && Intrinsics.a(object, 0)) {
            return true;
        }
        return false;
    }

    public final void c(JSONObject jSONObject, O1.a a8, String string2, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !this.b0(context) || !a8.k()) {
            jSONObject.put("anon_id", (Object)string2);
        }
    }

    public final void d(JSONObject jSONObject, O1.a a8, Context context) {
        if (Build.VERSION.SDK_INT < 31 || !this.b0(context) || !a8.k()) {
            jSONObject.put("attribution", (Object)a8.j());
        }
    }

    public final void h(Context context, String string2) {
        CookieSyncManager.createInstance((Context)context).sync();
        context = CookieManager.getInstance();
        Object[] arrobject = context.getCookie(string2);
        if (arrobject == null) {
            return;
        }
        if ((arrobject = ((Collection)i.V((CharSequence)arrobject, new String[]{";"}, false, 0, 6, null)).toArray((Object[])new String[0])) != null) {
            arrobject = (String[])arrobject;
            int n8 = arrobject.length;
            int n9 = 0;
            while (n9 < n8) {
                Object object = arrobject[n9];
                int n10 = n9 + 1;
                if ((object = ((Collection)i.V((CharSequence)object, new String[]{"="}, false, 0, 6, null)).toArray((Object[])new String[0])) != null) {
                    object = (String[])object;
                    n9 = n10;
                    if (object.length <= 0) continue;
                    object = object[0];
                    int n11 = object.length() - 1;
                    int n12 = n9 = 0;
                    while (n9 <= n11) {
                        int n13 = n12 == 0 ? n9 : n11;
                        n13 = Intrinsics.d(object.charAt(n13), 32) <= 0 ? 1 : 0;
                        if (n12 == 0) {
                            if (n13 == 0) {
                                n12 = 1;
                                continue;
                            }
                            ++n9;
                            continue;
                        }
                        if (n13 == 0) break;
                        --n11;
                    }
                    context.setCookie(string2, Intrinsics.i(object.subSequence(n9, n11 + 1).toString(), "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;"));
                    n9 = n10;
                    continue;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            context.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final long l(double d8) {
        return Math.round((double)(d8 / 1.073741824E9));
    }

    public final boolean r() {
        return Intrinsics.a("mounted", Environment.getExternalStorageState());
    }

    public final void u0() {
        try {
            if (this.r()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                e = (long)statFs.getAvailableBlocks() * (long)statFs.getBlockSize();
            }
            e = this.l(e);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int v0() {
        int n8 = b;
        if (n8 > 0) {
            return n8;
        }
        try {
            File[] arrfile = new File("/sys/devices/system/cpu/").listFiles((FilenameFilter)new O());
            if (arrfile != null) {
                b = arrfile.length;
            }
        }
        catch (Exception exception) {}
        if (b <= 0) {
            b = Math.max((int)Runtime.getRuntime().availableProcessors(), (int)1);
        }
        return b;
    }

    public final long w() {
        return e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void x0(Context object) {
        if (!Intrinsics.a(h, "NoCarrier")) return;
        try {
            object = object.getSystemService("phone");
            if (object == null) throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
        catch (Exception exception) {
            return;
        }
        object = ((TelephonyManager)object).getNetworkOperatorName();
        Intrinsics.checkNotNullExpressionValue(object, "telephonyManager.networkOperatorName");
        h = object;
    }

    public final String y() {
        return h;
    }

    public final void y0(Context context) {
        if (c == -1L || System.currentTimeMillis() - c >= 1800000L) {
            c = System.currentTimeMillis();
            this.z0();
            this.x0(context);
            this.A0();
            this.u0();
        }
    }

    public final void z0() {
        try {
            Object object = TimeZone.getDefault();
            String string2 = object.getDisplayName(object.inDaylightTime(new Date()), 0);
            Intrinsics.checkNotNullExpressionValue(string2, "tz.getDisplayName(tz.inDaylightTime(Date()), TimeZone.SHORT)");
            f = string2;
            object = object.getID();
            Intrinsics.checkNotNullExpressionValue(object, "tz.id");
            g = object;
            return;
        }
        catch (AssertionError | Exception object) {
            return;
        }
    }

    public static interface a {
        public void a(JSONObject var1);

        public void b(o var1);
    }

}

