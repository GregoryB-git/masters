/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.net.TrafficStats
 *  android.text.TextUtils
 *  android.util.JsonReader
 *  android.util.Log
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.MalformedURLException
 *  java.net.URL
 *  java.net.URLConnection
 *  java.nio.charset.Charset
 *  java.util.concurrent.ExecutionException
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  java.util.zip.GZIPOutputStream
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package v4;

import A2.n;
import E2.a;
import V2.j;
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
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o4.i;
import org.json.JSONException;
import org.json.JSONObject;
import r4.b;
import s4.j;
import v4.d;
import v4.e;
import v4.f;

public class c {
    public static final Pattern d = Pattern.compile((String)"[0-9]+s");
    public static final Charset e = Charset.forName((String)"UTF-8");
    public final Context a;
    public final b b;
    public final e c;

    public c(Context context, b b8) {
        this.a = context;
        this.b = b8;
        this.c = new e();
    }

    public static String a(String string2, String string3, String string4) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string2 = "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(", ");
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        }
        return String.format((String)"Firebase options used while communicating with Firebase server APIs: %s, %s%s", (Object[])new Object[]{string3, string4, string2});
    }

    public static JSONObject b(String string2, String string3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", (Object)string2);
            jSONObject.put("appId", (Object)string3);
            jSONObject.put("authVersion", (Object)"FIS_v2");
            jSONObject.put("sdkVersion", (Object)"a:17.2.0");
            return jSONObject;
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException((Throwable)jSONException);
        }
    }

    public static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", (Object)"a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", (Object)jSONObject);
            return jSONObject2;
        }
        catch (JSONException jSONException) {
            throw new IllegalStateException((Throwable)jSONException);
        }
    }

    public static byte[] i(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean j(int n8) {
        if (n8 >= 200 && n8 < 300) {
            return true;
        }
        return false;
    }

    public static void k() {
        Log.e((String)"Firebase-Installations", (String)"Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    public static void l(HttpURLConnection object, String string2, String string3, String string4) {
        if (!TextUtils.isEmpty((CharSequence)(object = c.p((HttpURLConnection)object)))) {
            Log.w((String)"Firebase-Installations", (String)object);
            Log.w((String)"Firebase-Installations", (String)c.a(string2, string3, string4));
        }
    }

    public static long n(String string2) {
        n.b(d.matcher((CharSequence)string2).matches(), "Invalid Expiration Timestamp.");
        if (string2 != null && string2.length() != 0) {
            return Long.parseLong((String)string2.substring(0, string2.length() - 1));
        }
        return 0L;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String p(HttpURLConnection object) {
        String string2;
        InputStream inputStream = object.getErrorStream();
        if (inputStream == null) {
            return null;
        }
        inputStream = new BufferedReader((Reader)new InputStreamReader(inputStream, e));
        StringBuilder stringBuilder = new StringBuilder();
        while ((string2 = inputStream.readLine()) != null) {
            stringBuilder.append(string2);
            stringBuilder.append('\n');
        }
        object = String.format((String)"Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", (Object[])new Object[]{object.getResponseCode(), object.getResponseMessage(), stringBuilder});
        try {
            inputStream.close();
            return object;
        }
        catch (IOException iOException) {
            return object;
        }
        catch (IOException iOException) {}
        try {
            inputStream.close();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
        catch (Throwable throwable) {}
        try {
            inputStream.close();
        }
        catch (IOException iOException) {
            throw throwable;
        }
        throw throwable;
    }

    public static void t(URLConnection uRLConnection, byte[] arrby) {
        GZIPOutputStream gZIPOutputStream;
        if ((uRLConnection = uRLConnection.getOutputStream()) != null) {
            gZIPOutputStream = new GZIPOutputStream((OutputStream)uRLConnection);
            gZIPOutputStream.write(arrby);
            return;
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        finally {
            gZIPOutputStream.close();
            uRLConnection.close();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public d d(String object, String string2, String string3, String string4, String string5) {
        HttpURLConnection httpURLConnection;
        int n8 = 0;
        if (!this.c.b()) throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
        URL uRL = this.h(String.format((String)"projects/%s/installations", (Object[])new Object[]{string3}));
        while (n8 <= 1) {
            block10 : {
                block9 : {
                    TrafficStats.setThreadStatsTag((int)32769);
                    httpURLConnection = this.m(uRL, (String)object);
                    try {
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setDoOutput(true);
                        if (string5 != null) {
                            httpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", string5);
                        }
                        this.r(httpURLConnection, string2, string4);
                        int n9 = httpURLConnection.getResponseCode();
                        this.c.f(n9);
                        if (c.j(n9)) {
                            d d8 = this.o(httpURLConnection);
                            object = d8;
                            break block9;
                        }
                        c.l(httpURLConnection, string4, (String)object, string3);
                        if (n9 == 429) throw new s4.j("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", j.a.q);
                        if (n9 >= 500 && n9 < 600) break block10;
                        c.k();
                        d d9 = d.a().e(d.b.p).a();
                        object = d9;
                    }
                    catch (IOException | AssertionError assertionError) {}
                }
                httpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                return object;
            }
            httpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++n8;
        }
        throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
        catch (Throwable throwable) {}
        httpURLConnection.disconnect();
        TrafficStats.clearThreadStatsTag();
        throw throwable;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void e(String string2, String string3, String string4, String string5) {
        block8 : {
            int n8 = 0;
            URL uRL = this.h(String.format((String)"projects/%s/installations/%s", (Object[])new Object[]{string4, string3}));
            while (n8 <= 1) {
                TrafficStats.setThreadStatsTag((int)32770);
                string3 = this.m(uRL, string2);
                try {
                    string3.setRequestMethod("DELETE");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("FIS_v2 ");
                    stringBuilder.append(string5);
                    string3.addRequestProperty("Authorization", stringBuilder.toString());
                    int n9 = string3.getResponseCode();
                    if (n9 == 200 || n9 == 401 || n9 == 404) break block8;
                    c.l((HttpURLConnection)string3, null, string2, string4);
                    if (n9 != 429 && (n9 < 500 || n9 >= 600)) {
                        c.k();
                        throw new s4.j("Bad config while trying to delete FID", j.a.o);
                    }
                }
                catch (Throwable throwable) {}
                ++n8;
                string3.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
        }
        string3.disconnect();
        TrafficStats.clearThreadStatsTag();
        return;
        catch (IOException iOException) {}
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public f f(String var1_1, String var2_3, String var3_5, String var4_6) {
        var5_7 = 0;
        if (this.c.b() == false) throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
        var8_8 = this.h(String.format((String)"projects/%s/installations/%s/authTokens:generate", (Object[])new Object[]{var3_5, var2_3}));
        while (var5_7 <= 1) {
            block8 : {
                block9 : {
                    block7 : {
                        TrafficStats.setThreadStatsTag((int)32771);
                        var7_10 = this.m(var8_8, (String)var1_1);
                        try {
                            block10 : {
                                var7_10.setRequestMethod("POST");
                                var2_3 = new StringBuilder();
                                var2_3.append("FIS_v2 ");
                                var2_3.append(var4_6);
                                var7_10.addRequestProperty("Authorization", var2_3.toString());
                                var7_10.setDoOutput(true);
                                this.s(var7_10);
                                var6_9 = var7_10.getResponseCode();
                                this.c.f(var6_9);
                                if (!c.j(var6_9)) break block10;
                                var1_1 = var2_3 = this.q(var7_10);
                                ** GOTO lbl32
                            }
                            c.l(var7_10, null, (String)var1_1, var3_5);
                            if (var6_9 == 401 || var6_9 == 404) break block7;
                            if (var6_9 == 429) throw new s4.j("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", j.a.q);
                            if (var6_9 >= 500 && var6_9 < 600) break block8;
                            c.k();
                            var2_3 = f.a().b(f.b.p);
                        }
                        catch (Throwable var1_2) {
                            break block9;
                        }
lbl30: // 2 sources:
                        do {
                            var1_1 = var2_3 = var2_3.a();
lbl32: // 2 sources:
                            var7_10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            return var1_1;
                            break;
                        } while (true);
                    }
                    var2_3 = f.a().b(f.b.q);
                    ** continue;
                }
                var7_10.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw var1_2;
                catch (IOException | AssertionError var2_4) {}
            }
            var7_10.disconnect();
            TrafficStats.clearThreadStatsTag();
            ++var5_7;
        }
        throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String g() {
        try {
            Object object = this.a;
            object = a.a((Context)object, object.getPackageName());
            if (object != null) return E2.j.b((byte[])object, false);
            object = new StringBuilder();
            object.append("Could not get fingerprint hash for package: ");
            object.append(this.a.getPackageName());
            Log.e((String)"ContentValues", (String)object.toString());
            return null;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No such package: ");
        stringBuilder.append(this.a.getPackageName());
        Log.e((String)"ContentValues", (String)stringBuilder.toString(), (Throwable)nameNotFoundException);
        return null;
    }

    public final URL h(String string2) {
        try {
            string2 = new URL(String.format((String)"https://%s/%s/%s", (Object[])new Object[]{"firebaseinstallations.googleapis.com", "v1", string2}));
            return string2;
        }
        catch (MalformedURLException malformedURLException) {
            throw new s4.j(malformedURLException.getMessage(), j.a.p);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final HttpURLConnection m(URL object, String string2) {
        HttpURLConnection httpURLConnection;
        block7 : {
            try {
                httpURLConnection = (HttpURLConnection)object.openConnection();
            }
            catch (IOException iOException) {
                throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
            }
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            object = (i)this.b.get();
            if (object != null) {
                void var1_4;
                block8 : {
                    try {
                        httpURLConnection.addRequestProperty("x-firebase-client", (String)m.a(object.a()));
                        break block7;
                    }
                    catch (InterruptedException interruptedException) {
                    }
                    catch (ExecutionException executionException) {
                        break block8;
                    }
                    Thread.currentThread().interrupt();
                }
                Log.w((String)"ContentValues", (String)"Failed to get heartbeats header", (Throwable)var1_4);
            }
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", this.g());
        httpURLConnection.addRequestProperty("x-goog-api-key", string2);
        return httpURLConnection;
    }

    public final d o(HttpURLConnection httpURLConnection) {
        httpURLConnection = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader((InputStream)httpURLConnection, e));
        f.a a8 = f.a();
        d.a a9 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            if (string2.equals((Object)"name")) {
                a9.f(jsonReader.nextString());
                continue;
            }
            if (string2.equals((Object)"fid")) {
                a9.c(jsonReader.nextString());
                continue;
            }
            if (string2.equals((Object)"refreshToken")) {
                a9.d(jsonReader.nextString());
                continue;
            }
            if (string2.equals((Object)"authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    string2 = jsonReader.nextName();
                    if (string2.equals((Object)"token")) {
                        a8.c(jsonReader.nextString());
                        continue;
                    }
                    if (string2.equals((Object)"expiresIn")) {
                        a8.d(c.n(jsonReader.nextString()));
                        continue;
                    }
                    jsonReader.skipValue();
                }
                a9.b(a8.a());
                jsonReader.endObject();
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        httpURLConnection.close();
        return a9.e(d.b.o).a();
    }

    public final f q(HttpURLConnection httpURLConnection) {
        httpURLConnection = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader((InputStream)httpURLConnection, e));
        f.a a8 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            if (string2.equals((Object)"token")) {
                a8.c(jsonReader.nextString());
                continue;
            }
            if (string2.equals((Object)"expiresIn")) {
                a8.d(c.n(jsonReader.nextString()));
                continue;
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        jsonReader.close();
        httpURLConnection.close();
        return a8.b(f.b.o).a();
    }

    public final void r(HttpURLConnection httpURLConnection, String string2, String string3) {
        c.t((URLConnection)httpURLConnection, c.i(c.b(string2, string3)));
    }

    public final void s(HttpURLConnection httpURLConnection) {
        c.t((URLConnection)httpURLConnection, c.i(c.c()));
    }
}

