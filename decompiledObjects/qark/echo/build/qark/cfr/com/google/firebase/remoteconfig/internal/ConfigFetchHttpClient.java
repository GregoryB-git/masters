/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.io.BufferedOutputStream
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TimeZone
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.remoteconfig.internal;

import E2.j;
import P4.n;
import P4.o;
import P4.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y.a;

public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile((String)"^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String string2, String string3, String string4, long l8, long l9) {
        this.a = context;
        this.b = string2;
        this.c = string3;
        this.d = ConfigFetchHttpClient.f(string2);
        this.e = string4;
        this.f = l8;
        this.g = l9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b e(JSONObject object, Date object2) {
        Object object3;
        Object var4_6;
        b.b b8;
        block17 : {
            block16 : {
                block15 : {
                    try {
                        b8 = b.j().e((Date)object2);
                        var4_6 = null;
                    }
                    catch (JSONException jSONException) {
                        throw new n("Fetch failed: fetch response could not be parsed.", (Throwable)jSONException);
                    }
                    try {
                        object3 = object.getJSONObject("entries");
                        break block15;
                    }
                    catch (JSONException jSONException) {}
                    object3 = null;
                }
                object2 = b8;
                if (object3 != null) {
                    object2 = b8.c((JSONObject)object3);
                }
                try {
                    b8 = object.getJSONArray("experimentDescriptions");
                    break block16;
                }
                catch (JSONException jSONException) {}
                b8 = null;
            }
            object3 = object2;
            if (b8 != null) {
                object3 = object2.d((JSONArray)b8);
            }
            try {
                b8 = object.getJSONObject("personalizationMetadata");
                break block17;
            }
            catch (JSONException jSONException) {}
            b8 = null;
        }
        object2 = object3;
        if (b8 != null) {
            object2 = object3.f((JSONObject)b8);
        }
        object3 = var4_6;
        if (object.has("templateVersion")) {
            object3 = object.getString("templateVersion");
        }
        if (object3 == null) return object2.a();
        object2.g(Long.parseLong((String)object3));
        return object2.a();
    }

    public static String f(String string2) {
        if ((string2 = h.matcher((CharSequence)string2)).matches()) {
            return string2.group(1);
        }
        return null;
    }

    public final boolean a(JSONObject jSONObject) {
        boolean bl;
        try {
            bl = jSONObject.get("state").equals((Object)"NO_CHANGE");
        }
        catch (JSONException jSONException) {
            return true;
        }
        return bl ^ true;
    }

    public final String b(long l8) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        return simpleDateFormat.format((Object)l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject c(String string2, String string3, Map map, Long l8) {
        HashMap hashMap;
        hashMap = new HashMap();
        if (string2 == null) {
            throw new n("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put((Object)"appInstanceId", (Object)string2);
        hashMap.put((Object)"appInstanceIdToken", (Object)string3);
        hashMap.put((Object)"appId", (Object)this.b);
        string2 = this.a.getResources().getConfiguration().locale;
        hashMap.put((Object)"countryCode", (Object)string2.getCountry());
        int n8 = Build.VERSION.SDK_INT;
        hashMap.put((Object)"languageCode", (Object)string2.toLanguageTag());
        hashMap.put((Object)"platformVersion", (Object)Integer.toString((int)n8));
        hashMap.put((Object)"timeZone", (Object)TimeZone.getDefault().getID());
        try {
            string2 = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            if (string2 != null) {
                hashMap.put((Object)"appVersion", (Object)string2.versionName);
                hashMap.put((Object)"appBuild", (Object)Long.toString((long)a.a((PackageInfo)string2)));
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        hashMap.put((Object)"packageName", (Object)this.a.getPackageName());
        hashMap.put((Object)"sdkVersion", (Object)"21.5.0");
        hashMap.put((Object)"analyticsUserProperties", (Object)new JSONObject(map));
        if (l8 != null) {
            hashMap.put((Object)"firstOpenTime", (Object)this.b(l8));
        }
        return new JSONObject((Map)hashMap);
    }

    public HttpURLConnection d() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(this.h(this.d, this.e)).openConnection();
            return httpURLConnection;
        }
        catch (IOException iOException) {
            throw new o(iOException.getMessage());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Keep
    public c.a fetch(HttpURLConnection var1_1, String var2_4, String var3_9, Map<String, String> var4_10, String var5_11, Map<String, String> var6_12, Long var7_13, Date var8_14) {
        block12 : {
            block13 : {
                block11 : {
                    this.m((HttpURLConnection)var1_1, var5_11, var3_9, var6_12);
                    this.l((HttpURLConnection)var1_1, this.c(var2_4, var3_9, var4_10, var7_13).toString().getBytes("utf-8"));
                    var1_1.connect();
                    var9_15 = var1_1.getResponseCode();
                    if (var9_15 != 200) break block11;
                    var2_4 = var1_1.getHeaderField("ETag");
                    var3_9 = this.g((URLConnection)var1_1);
                    var1_1.disconnect();
                    try {
                        var1_1.getInputStream().close();
                        break block12;
                    }
                    catch (IOException var1_2) {}
                }
                try {
                    ** try [egrp 4[TRYBLOCK] [8, 7 : 117->131)] { 
lbl17: // 1 sources:
                    throw new r(var9_15, var1_1.getResponseMessage());
                }
                catch (Throwable var2_5) {
                    break block13;
                }
lbl20: // 2 sources:
                catch (JSONException var2_6) {
                    throw new n("The client had an error while calling the backend!", (Throwable)var2_8);
                }
lbl22: // 2 sources:
                catch (IOException var2_7) {
                    throw new n("The client had an error while calling the backend!", (Throwable)var2_8);
                }
            }
            var1_1.disconnect();
            try {
                var1_1.getInputStream().close();
            }
            catch (IOException var1_3) {
                throw var2_5;
            }
            throw var2_5;
        }
        var1_1 = ConfigFetchHttpClient.e((JSONObject)var3_9, var8_14);
        if (this.a((JSONObject)var3_9) != false) return c.a.b((b)var1_1, var2_4);
        return c.a.a(var8_14, (b)var1_1);
    }

    public final JSONObject g(URLConnection uRLConnection) {
        int n8;
        uRLConnection = new BufferedReader((Reader)new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder stringBuilder = new StringBuilder();
        while ((n8 = uRLConnection.read()) != -1) {
            stringBuilder.append((char)n8);
        }
        return new JSONObject(stringBuilder.toString());
    }

    public final String h(String string2, String string3) {
        return String.format((String)"https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", (Object[])new Object[]{string2, string3});
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String i() {
        try {
            Object object = this.a;
            object = E2.a.a((Context)object, object.getPackageName());
            if (object != null) return j.b((byte[])object, false);
            object = new StringBuilder();
            object.append("Could not get fingerprint hash for package: ");
            object.append(this.a.getPackageName());
            Log.e((String)"FirebaseRemoteConfig", (String)object.toString());
            return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No such package: ");
        stringBuilder.append(this.a.getPackageName());
        Log.e((String)"FirebaseRemoteConfig", (String)stringBuilder.toString(), (Throwable)nameNotFoundException);
        return null;
    }

    public final void j(HttpURLConnection httpURLConnection, String string2) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", this.i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", string2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final void k(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
    }

    public final void l(HttpURLConnection httpURLConnection, byte[] arrby) {
        httpURLConnection.setFixedLengthStreamingMode(arrby.length);
        httpURLConnection = new BufferedOutputStream(httpURLConnection.getOutputStream());
        httpURLConnection.write(arrby);
        httpURLConnection.flush();
        httpURLConnection.close();
    }

    public final void m(HttpURLConnection httpURLConnection, String string2, String string3, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int)timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int)timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", string2);
        this.j(httpURLConnection, string3);
        this.k(httpURLConnection, map);
    }
}

