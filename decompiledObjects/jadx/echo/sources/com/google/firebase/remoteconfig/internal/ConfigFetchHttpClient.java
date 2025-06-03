package com.google.firebase.remoteconfig.internal;

import E2.j;
import P4.n;
import P4.o;
import P4.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y.AbstractC2221a;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f11875h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f11876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11877b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11878c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11879d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11880e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11881f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11882g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j7, long j8) {
        this.f11876a = context;
        this.f11877b = str;
        this.f11878c = str2;
        this.f11879d = f(str);
        this.f11880e = str3;
        this.f11881f = j7;
        this.f11882g = j8;
    }

    public static b e(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            b.C0178b e7 = b.j().e(date);
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e7 = e7.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e7 = e7.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                e7 = e7.f(jSONObject3);
            }
            String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                e7.g(Long.parseLong(string));
            }
            return e7.a();
        } catch (JSONException e8) {
            throw new n("Fetch failed: fetch response could not be parsed.", e8);
        }
    }

    public static String f(String str) {
        Matcher matcher = f11875h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public final boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    public final String b(long j7) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j7));
    }

    public final JSONObject c(String str, String str2, Map map, Long l7) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new n("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put("appInstanceId", str);
        hashMap.put("appInstanceIdToken", str2);
        hashMap.put("appId", this.f11877b);
        Locale locale = this.f11876a.getResources().getConfiguration().locale;
        hashMap.put("countryCode", locale.getCountry());
        int i7 = Build.VERSION.SDK_INT;
        hashMap.put("languageCode", locale.toLanguageTag());
        hashMap.put("platformVersion", Integer.toString(i7));
        hashMap.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f11876a.getPackageManager().getPackageInfo(this.f11876a.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put("appVersion", packageInfo.versionName);
                hashMap.put("appBuild", Long.toString(AbstractC2221a.a(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("packageName", this.f11876a.getPackageName());
        hashMap.put("sdkVersion", "21.5.0");
        hashMap.put("analyticsUserProperties", new JSONObject(map));
        if (l7 != null) {
            hashMap.put("firstOpenTime", b(l7.longValue()));
        }
        return new JSONObject(hashMap);
    }

    public HttpURLConnection d() {
        try {
            return (HttpURLConnection) new URL(h(this.f11879d, this.f11880e)).openConnection();
        } catch (IOException e7) {
            throw new o(e7.getMessage());
        }
    }

    @Keep
    public c.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l7, Date date) {
        m(httpURLConnection, str3, str2, map2);
        try {
            try {
                l(httpURLConnection, c(str, str2, map, l7).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new r(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject g7 = g(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                b e7 = e(g7, date);
                return !a(g7) ? c.a.a(date, e7) : c.a.b(e7, headerField);
            } catch (IOException | JSONException e8) {
                throw new n("The client had an error while calling the backend!", e8);
            }
        } finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
        }
    }

    public final JSONObject g(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    public final String h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    public final String i() {
        try {
            Context context = this.f11876a;
            byte[] a7 = E2.a.a(context, context.getPackageName());
            if (a7 != null) {
                return j.b(a7, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f11876a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f11876a.getPackageName(), e7);
            return null;
        }
    }

    public final void j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f11878c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f11876a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final void k(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void l(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final void m(HttpURLConnection httpURLConnection, String str, String str2, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f11881f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f11882g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }
}
