package x9;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import defpackage.g;
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
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import m6.j;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f17220d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f17221e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f17222a;

    /* renamed from: b, reason: collision with root package name */
    public final t9.b<q9.e> f17223b;

    /* renamed from: c, reason: collision with root package name */
    public final e f17224c = new e();

    public c(Context context, t9.b<q9.e> bVar) {
        this.f17222a = context;
        this.f17223b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new u9.e(e10.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f17221e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : g.d(", ", str);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
    }

    public static long d(String str) {
        j.a("Invalid Expiration Timestamp.", f17220d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f17221e));
        Long l10 = 0L;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        l10 = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                String str5 = l10 == null ? " tokenExpirationTimestamp" : "";
                if (!str5.isEmpty()) {
                    throw new IllegalStateException(g.d("Missing required properties:", str5));
                }
                bVar = new b(str, l10.longValue(), 0);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str2, str3, str4, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f17221e));
        String str = null;
        Long l10 = 0L;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                l10 = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        String str2 = l10 == null ? " tokenExpirationTimestamp" : "";
        if (str2.isEmpty()) {
            return new b(str, l10.longValue(), 1);
        }
        throw new IllegalStateException(g.d("Missing required properties:", str2));
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[Catch: NameNotFoundException -> 0x008f, TRY_LEAVE, TryCatch #3 {NameNotFoundException -> 0x008f, blocks: (B:7:0x0063, B:9:0x006f, B:15:0x008a), top: B:6:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006f A[Catch: NameNotFoundException -> 0x008f, TryCatch #3 {NameNotFoundException -> 0x008f, blocks: (B:7:0x0063, B:9:0x006f, B:15:0x008a), top: B:6:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection c(java.net.URL r6, java.lang.String r7) {
        /*
            r5 = this;
            java.net.URLConnection r6 = r6.openConnection()     // Catch: java.io.IOException -> Lb1
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.io.IOException -> Lb1
            r0 = 10000(0x2710, float:1.4013E-41)
            r6.setConnectTimeout(r0)
            r1 = 0
            r6.setUseCaches(r1)
            r6.setReadTimeout(r0)
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "Content-Type"
            r6.addRequestProperty(r1, r0)
            java.lang.String r1 = "Accept"
            r6.addRequestProperty(r1, r0)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = "gzip"
            r6.addRequestProperty(r0, r1)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r1 = "no-cache"
            r6.addRequestProperty(r0, r1)
            android.content.Context r0 = r5.f17222a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r6.addRequestProperty(r1, r0)
            t9.b<q9.e> r0 = r5.f17223b
            java.lang.Object r0 = r0.get()
            q9.e r0 = (q9.e) r0
            java.lang.String r1 = "ContentValues"
            if (r0 == 0) goto L62
            java.lang.String r2 = "x-firebase-client"
            com.google.android.gms.tasks.Task r0 = r0.a()     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5c
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5c
            r6.addRequestProperty(r2, r0)     // Catch: java.lang.InterruptedException -> L53 java.util.concurrent.ExecutionException -> L5c
            goto L62
        L53:
            r0 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            java.lang.String r2 = "Failed to get heartbeats header"
            android.util.Log.w(r1, r2, r0)
        L62:
            r0 = 0
            android.content.Context r2 = r5.f17222a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r3 = r2.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            byte[] r2 = v6.a.a(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            if (r2 != 0) goto L8a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            r2.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r2.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            android.content.Context r3 = r5.f17222a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            r2.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            java.lang.String r2 = r2.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            android.util.Log.e(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            goto La6
        L8a:
            java.lang.String r0 = b.a0.o(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8f
            goto La6
        L8f:
            r2 = move-exception
            java.lang.String r3 = "No such package: "
            java.lang.StringBuilder r3 = defpackage.f.l(r3)
            android.content.Context r4 = r5.f17222a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r1, r3, r2)
        La6:
            java.lang.String r1 = "X-Android-Cert"
            r6.addRequestProperty(r1, r0)
            java.lang.String r0 = "x-goog-api-key"
            r6.addRequestProperty(r0, r7)
            return r6
        Lb1:
            u9.e r6 = new u9.e
            java.lang.String r7 = "Firebase Installations Service is unavailable. Please try again later."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
