// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v4;

import java.io.InputStream;
import java.io.Reader;
import android.util.JsonReader;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import V2.m;
import o4.i;
import java.net.MalformedURLException;
import android.content.pm.PackageManager$NameNotFoundException;
import E2.a;
import java.net.URL;
import java.io.IOException;
import s4.j;
import android.net.TrafficStats;
import java.net.URLConnection;
import A2.n;
import java.net.HttpURLConnection;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import r4.b;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public class c
{
    public static final Pattern d;
    public static final Charset e;
    public final Context a;
    public final b b;
    public final e c;
    
    static {
        d = Pattern.compile("[0-9]+s");
        e = Charset.forName("UTF-8");
    }
    
    public c(final Context a, final b b) {
        this.a = a;
        this.b = b;
        this.c = new e();
    }
    
    public static String a(String string, final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(string);
            string = sb.toString();
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", s, s2, string);
    }
    
    public static JSONObject b(final String s, final String s2) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("fid", (Object)s);
            jsonObject.put("appId", (Object)s2);
            jsonObject.put("authVersion", (Object)"FIS_v2");
            jsonObject.put("sdkVersion", (Object)"a:17.2.0");
            return jsonObject;
        }
        catch (JSONException cause) {
            throw new IllegalStateException((Throwable)cause);
        }
    }
    
    public static JSONObject c() {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("sdkVersion", (Object)"a:17.2.0");
            final JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("installation", (Object)jsonObject);
            return jsonObject2;
        }
        catch (JSONException cause) {
            throw new IllegalStateException((Throwable)cause);
        }
    }
    
    public static byte[] i(final JSONObject jsonObject) {
        return jsonObject.toString().getBytes("UTF-8");
    }
    
    public static boolean j(final int n) {
        return n >= 200 && n < 300;
    }
    
    public static void k() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }
    
    public static void l(final HttpURLConnection httpURLConnection, final String s, final String s2, final String s3) {
        final String p4 = p(httpURLConnection);
        if (!TextUtils.isEmpty((CharSequence)p4)) {
            Log.w("Firebase-Installations", p4);
            Log.w("Firebase-Installations", a(s, s2, s3));
        }
    }
    
    public static long n(final String input) {
        n.b(c.d.matcher(input).matches(), "Invalid Expiration Timestamp.");
        if (input != null && input.length() != 0) {
            return Long.parseLong(input.substring(0, input.length() - 1));
        }
        return 0L;
    }
    
    public static String p(final HttpURLConnection p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/HttpURLConnection.getErrorStream:()Ljava/io/InputStream;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnonnull       11
        //     9: aconst_null    
        //    10: areturn        
        //    11: new             Ljava/io/BufferedReader;
        //    14: dup            
        //    15: new             Ljava/io/InputStreamReader;
        //    18: dup            
        //    19: aload_1        
        //    20: getstatic       v4/c.e:Ljava/nio/charset/Charset;
        //    23: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
        //    26: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    29: astore_1       
        //    30: new             Ljava/lang/StringBuilder;
        //    33: dup            
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: astore_2       
        //    38: aload_1        
        //    39: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    42: astore_3       
        //    43: aload_3        
        //    44: ifnull          63
        //    47: aload_2        
        //    48: aload_3        
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_2        
        //    54: bipush          10
        //    56: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: goto            38
        //    63: ldc             "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
        //    65: iconst_3       
        //    66: anewarray       Ljava/lang/Object;
        //    69: dup            
        //    70: iconst_0       
        //    71: aload_0        
        //    72: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    75: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    78: aastore        
        //    79: dup            
        //    80: iconst_1       
        //    81: aload_0        
        //    82: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //    85: aastore        
        //    86: dup            
        //    87: iconst_2       
        //    88: aload_2        
        //    89: aastore        
        //    90: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    93: astore_0       
        //    94: aload_1        
        //    95: invokevirtual   java/io/BufferedReader.close:()V
        //    98: aload_0        
        //    99: areturn        
        //   100: aload_1        
        //   101: invokevirtual   java/io/BufferedReader.close:()V
        //   104: aload_0        
        //   105: athrow         
        //   106: aload_1        
        //   107: invokevirtual   java/io/BufferedReader.close:()V
        //   110: aconst_null    
        //   111: areturn        
        //   112: astore_0       
        //   113: goto            106
        //   116: astore_1       
        //   117: aload_0        
        //   118: areturn        
        //   119: astore_1       
        //   120: goto            104
        //   123: astore_0       
        //   124: aconst_null    
        //   125: areturn        
        //   126: astore_0       
        //   127: goto            100
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  30     38     112    116    Ljava/io/IOException;
        //  30     38     126    130    Any
        //  38     43     112    116    Ljava/io/IOException;
        //  38     43     126    130    Any
        //  47     60     112    116    Ljava/io/IOException;
        //  47     60     126    130    Any
        //  63     94     112    116    Ljava/io/IOException;
        //  63     94     126    130    Any
        //  94     98     116    119    Ljava/io/IOException;
        //  100    104    119    123    Ljava/io/IOException;
        //  106    110    123    126    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 78 out of bounds for length 78
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void t(final URLConnection p0, final byte[] p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/net/URLConnection.getOutputStream:()Ljava/io/OutputStream;
        //     4: astore_0       
        //     5: aload_0        
        //     6: ifnull          43
        //     9: new             Ljava/util/zip/GZIPOutputStream;
        //    12: dup            
        //    13: aload_0        
        //    14: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    17: astore_2       
        //    18: aload_2        
        //    19: aload_1        
        //    20: invokevirtual   java/io/OutputStream.write:([B)V
        //    23: aload_2        
        //    24: invokevirtual   java/io/OutputStream.close:()V
        //    27: aload_0        
        //    28: invokevirtual   java/io/OutputStream.close:()V
        //    31: return         
        //    32: astore_1       
        //    33: aload_2        
        //    34: invokevirtual   java/io/OutputStream.close:()V
        //    37: aload_0        
        //    38: invokevirtual   java/io/OutputStream.close:()V
        //    41: aload_1        
        //    42: athrow         
        //    43: new             Ljava/io/IOException;
        //    46: dup            
        //    47: ldc             "Cannot send request to FIS servers. No OutputStream available."
        //    49: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    52: athrow         
        //    53: astore_0       
        //    54: return         
        //    55: astore_0       
        //    56: goto            41
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  18     23     32     43     Any
        //  23     31     53     55     Ljava/io/IOException;
        //  33     41     55     59     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 34 out of bounds for length 34
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public d d(String s, final String s2, final String s3, final String s4, final String value) {
        int n = 0;
        while (true) {
            Label_0252: {
                if (!this.c.b()) {
                    break Label_0252;
                }
                final URL h = this.h(String.format("projects/%s/installations", s3));
            Label_0171_Outer:
                while (true) {
                    Label_0238: {
                        if (n > 1) {
                            break Label_0238;
                        }
                        TrafficStats.setThreadStatsTag(32769);
                        final HttpURLConnection m = this.m(h, s);
                        while (true) {
                            try {
                                m.setRequestMethod("POST");
                                m.setDoOutput(true);
                                if (value != null) {
                                    m.addRequestProperty("x-goog-fis-android-iid-migration-auth", value);
                                }
                                this.r(m, s2, s4);
                                final int responseCode = m.getResponseCode();
                                this.c.f(responseCode);
                                d d;
                                if (j(responseCode)) {
                                    d = this.o(m);
                                }
                                else {
                                    l(m, s4, s, s3);
                                    if (responseCode == 429) {
                                        throw new j("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", j.a.q);
                                    }
                                    if (responseCode >= 500 && responseCode < 600) {
                                        m.disconnect();
                                        TrafficStats.clearThreadStatsTag();
                                        ++n;
                                        continue Label_0171_Outer;
                                    }
                                    k();
                                    d = v4.d.a().e(v4.d.b.p).a();
                                }
                                m.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                return d;
                                m.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
                                throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
                            }
                            catch (AssertionError assertionError) {}
                            catch (IOException ex) {
                                continue;
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            final String s5;
            s = s5;
            continue;
        }
    }
    
    public void e(final String s, String m, final String s2, final String str) {
        final int n = 0;
        final URL h = this.h(String.format("projects/%s/installations/%s", s2, m));
        if (n > 1) {
            goto Label_0213;
        }
        TrafficStats.setThreadStatsTag(32770);
        m = (String)this.m(h, s);
        try {
            ((HttpURLConnection)m).setRequestMethod("DELETE");
            final StringBuilder sb = new StringBuilder();
            sb.append("FIS_v2 ");
            sb.append(str);
            ((URLConnection)m).addRequestProperty("Authorization", sb.toString());
            final int responseCode = ((HttpURLConnection)m).getResponseCode();
            if (responseCode == 200 || responseCode == 401 || responseCode == 404) {
                goto Label_0196;
            }
            l((HttpURLConnection)m, null, s, s2);
            if (responseCode == 429) {
                goto Label_0180;
            }
            if (responseCode >= 500 && responseCode < 600) {
                goto Label_0180;
            }
            k();
            throw new j("Bad config while trying to delete FID", j.a.o);
        }
        catch (IOException ex) {
            goto Label_0180;
        }
        finally {
            goto Label_0204;
        }
    }
    
    public f f(String q, final String s, final String s2, final String str) {
        final int n = 0;
        if (!this.c.b()) {
            goto Label_0305;
        }
        final URL h = this.h(String.format("projects/%s/installations/%s/authTokens:generate", s2, s));
        if (n > 1) {
            goto Label_0291;
        }
        TrafficStats.setThreadStatsTag(32771);
        final HttpURLConnection m = this.m(h, q);
        try {
            try {
                m.setRequestMethod("POST");
                final StringBuilder sb = new StringBuilder();
                sb.append("FIS_v2 ");
                sb.append(str);
                m.addRequestProperty("Authorization", sb.toString());
                m.setDoOutput(true);
                this.s(m);
                final int responseCode = m.getResponseCode();
                this.c.f(responseCode);
                if (j(responseCode)) {
                    q = (String)this.q(m);
                    m.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return (f)q;
                }
                goto Label_0160;
            }
            catch (IOException ex) {}
        }
        catch (AssertionError assertionError) {}
    }
    
    public final String g() {
        while (true) {
            try {
                final Context a = this.a;
                final byte[] a2 = E2.a.a(a, a.getPackageName());
                if (a2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not get fingerprint hash for package: ");
                    sb.append(this.a.getPackageName());
                    Log.e("ContentValues", sb.toString());
                    return null;
                }
                return E2.j.b(a2, false);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("No such package: ");
                sb2.append(this.a.getPackageName());
                final PackageManager$NameNotFoundException ex;
                Log.e("ContentValues", sb2.toString(), (Throwable)ex);
                return null;
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public final URL h(final String s) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", s));
        }
        catch (MalformedURLException ex) {
            throw new j(ex.getMessage(), j.a.p);
        }
    }
    
    public final HttpURLConnection m(final URL url, final String value) {
        try {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            final i i = (i)this.b.get();
            Label_0145: {
                if (i != null) {
                    Label_0134: {
                        try {
                            httpURLConnection.addRequestProperty("x-firebase-client", (String)m.a(i.a()));
                            break Label_0145;
                        }
                        catch (InterruptedException ex) {}
                        catch (ExecutionException ex) {
                            break Label_0134;
                        }
                        Thread.currentThread().interrupt();
                    }
                    final InterruptedException ex;
                    Log.w("ContentValues", "Failed to get heartbeats header", (Throwable)ex);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", this.g());
            httpURLConnection.addRequestProperty("x-goog-api-key", value);
            return httpURLConnection;
        }
        catch (IOException ex2) {
            throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
        }
    }
    
    public final d o(final HttpURLConnection httpURLConnection) {
        final InputStream inputStream = httpURLConnection.getInputStream();
        final JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, v4.c.e));
        final f.a a = f.a();
        final d.a a2 = v4.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.f(jsonReader.nextString());
            }
            else if (nextName.equals("fid")) {
                a2.c(jsonReader.nextString());
            }
            else if (nextName.equals("refreshToken")) {
                a2.d(jsonReader.nextString());
            }
            else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    final String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.c(jsonReader.nextString());
                    }
                    else if (nextName2.equals("expiresIn")) {
                        a.d(n(jsonReader.nextString()));
                    }
                    else {
                        jsonReader.skipValue();
                    }
                }
                a2.b(a.a());
                jsonReader.endObject();
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.e(v4.d.b.o).a();
    }
    
    public final f q(final HttpURLConnection httpURLConnection) {
        final InputStream inputStream = httpURLConnection.getInputStream();
        final JsonReader jsonReader = new JsonReader((Reader)new InputStreamReader(inputStream, v4.c.e));
        final f.a a = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.c(jsonReader.nextString());
            }
            else if (nextName.equals("expiresIn")) {
                a.d(n(jsonReader.nextString()));
            }
            else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.b(f.b.o).a();
    }
    
    public final void r(final HttpURLConnection httpURLConnection, final String s, final String s2) {
        t(httpURLConnection, i(b(s, s2)));
    }
    
    public final void s(final HttpURLConnection httpURLConnection) {
        t(httpURLConnection, i(c()));
    }
}
