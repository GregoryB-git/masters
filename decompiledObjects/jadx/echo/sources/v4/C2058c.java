package v4;

import A2.AbstractC0328n;
import V2.m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o4.InterfaceC1764i;
import org.json.JSONException;
import org.json.JSONObject;
import r4.InterfaceC1922b;
import s4.j;
import v4.AbstractC2059d;
import v4.AbstractC2061f;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2058c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f20156d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f20157e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f20158a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1922b f20159b;

    /* renamed from: c, reason: collision with root package name */
    public final C2060e f20160c = new C2060e();

    public C2058c(Context context, InterfaceC1922b interfaceC1922b) {
        this.f20158a = context;
        this.f20159b = interfaceC1922b;
    }

    public static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    public static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            return jSONObject;
        } catch (JSONException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e7) {
            throw new IllegalStateException(e7);
        }
    }

    public static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean j(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    public static void k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    public static void l(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String p7 = p(httpURLConnection);
        if (TextUtils.isEmpty(p7)) {
            return;
        }
        Log.w("Firebase-Installations", p7);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    public static long n(String str) {
        AbstractC0328n.b(f20156d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static String p(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f20157e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    public static void t(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC2059d d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        AbstractC2059d o7;
        if (!this.f20160c.b()) {
            throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
        }
        URL h7 = h(String.format("projects/%s/installations", str3));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection m7 = m(h7, str);
            try {
                try {
                    m7.setRequestMethod("POST");
                    m7.setDoOutput(true);
                    if (str5 != null) {
                        m7.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    r(m7, str2, str4);
                    responseCode = m7.getResponseCode();
                    this.f20160c.f(responseCode);
                } catch (Throwable th) {
                    m7.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (j(responseCode)) {
                o7 = o(m7);
            } else {
                l(m7, str4, str, str3);
                if (responseCode == 429) {
                    throw new j("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", j.a.TOO_MANY_REQUESTS);
                }
                if (responseCode < 500 || responseCode >= 600) {
                    k();
                    o7 = AbstractC2059d.a().e(AbstractC2059d.b.BAD_CONFIG).a();
                }
                m7.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m7.disconnect();
            TrafficStats.clearThreadStatsTag();
            return o7;
        }
        throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
    }

    public void e(String str, String str2, String str3, String str4) {
        int responseCode;
        int i7 = 0;
        URL h7 = h(String.format("projects/%s/installations/%s", str3, str2));
        while (i7 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection m7 = m(h7, str);
            try {
                m7.setRequestMethod("DELETE");
                m7.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = m7.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m7.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                l(m7, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    k();
                    throw new j("Bad config while trying to delete FID", j.a.BAD_CONFIG);
                }
                i7++;
                m7.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            m7.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
    }

    public AbstractC2061f f(String str, String str2, String str3, String str4) {
        int responseCode;
        AbstractC2061f q7;
        AbstractC2061f.a b7;
        if (!this.f20160c.b()) {
            throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
        }
        URL h7 = h(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i7 = 0; i7 <= 1; i7++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection m7 = m(h7, str);
            try {
                try {
                    m7.setRequestMethod("POST");
                    m7.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    m7.setDoOutput(true);
                    s(m7);
                    responseCode = m7.getResponseCode();
                    this.f20160c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (j(responseCode)) {
                    q7 = q(m7);
                } else {
                    l(m7, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        b7 = AbstractC2061f.a().b(AbstractC2061f.b.AUTH_ERROR);
                    } else {
                        if (responseCode == 429) {
                            throw new j("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", j.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            k();
                            b7 = AbstractC2061f.a().b(AbstractC2061f.b.BAD_CONFIG);
                        }
                    }
                    q7 = b7.a();
                }
                return q7;
            } finally {
                m7.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
    }

    public final String g() {
        try {
            Context context = this.f20158a;
            byte[] a7 = E2.a.a(context, context.getPackageName());
            if (a7 != null) {
                return E2.j.b(a7, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f20158a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("ContentValues", "No such package: " + this.f20158a.getPackageName(), e7);
            return null;
        }
    }

    public final URL h(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e7) {
            throw new j(e7.getMessage(), j.a.UNAVAILABLE);
        }
    }

    public final HttpURLConnection m(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f20158a.getPackageName());
            InterfaceC1764i interfaceC1764i = (InterfaceC1764i) this.f20159b.get();
            if (interfaceC1764i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) m.a(interfaceC1764i.a()));
                } catch (InterruptedException e7) {
                    e = e7;
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", g());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                } catch (ExecutionException e8) {
                    e = e8;
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", g());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", g());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.UNAVAILABLE);
        }
    }

    public final AbstractC2059d o(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20157e));
        AbstractC2061f.a a7 = AbstractC2061f.a();
        AbstractC2059d.a a8 = AbstractC2059d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a8.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a8.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a8.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a7.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a7.d(n(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a8.b(a7.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a8.e(AbstractC2059d.b.OK).a();
    }

    public final AbstractC2061f q(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f20157e));
        AbstractC2061f.a a7 = AbstractC2061f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a7.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a7.d(n(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a7.b(AbstractC2061f.b.OK).a();
    }

    public final void r(HttpURLConnection httpURLConnection, String str, String str2) {
        t(httpURLConnection, i(b(str, str2)));
    }

    public final void s(HttpURLConnection httpURLConnection) {
        t(httpURLConnection, i(c()));
    }
}
