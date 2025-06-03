// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig.internal;

import java.util.concurrent.TimeUnit;
import java.io.BufferedOutputStream;
import java.util.Iterator;
import E2.j;
import android.util.Log;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;
import androidx.annotation.Keep;
import java.io.IOException;
import P4.o;
import java.net.URL;
import java.net.HttpURLConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import P4.n;
import y.a;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONException;
import java.util.regex.Matcher;
import java.util.Date;
import org.json.JSONObject;
import android.content.Context;
import java.util.regex.Pattern;

public class ConfigFetchHttpClient
{
    public static final Pattern h;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    
    static {
        h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    }
    
    public ConfigFetchHttpClient(final Context a, final String b, final String c, final String e, final long f, final long g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = f(b);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static b e(final JSONObject p0, final Date p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_1        
        //     4: invokevirtual   com/google/firebase/remoteconfig/internal/b$b.e:(Ljava/util/Date;)Lcom/google/firebase/remoteconfig/internal/b$b;
        //     7: astore_3       
        //     8: aconst_null    
        //     9: astore          4
        //    11: aload_0        
        //    12: ldc             "entries"
        //    14: invokevirtual   org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    17: astore_2       
        //    18: goto            23
        //    21: aconst_null    
        //    22: astore_2       
        //    23: aload_3        
        //    24: astore_1       
        //    25: aload_2        
        //    26: ifnull          42
        //    29: aload_3        
        //    30: aload_2        
        //    31: invokevirtual   com/google/firebase/remoteconfig/internal/b$b.c:(Lorg/json/JSONObject;)Lcom/google/firebase/remoteconfig/internal/b$b;
        //    34: astore_1       
        //    35: goto            42
        //    38: astore_0       
        //    39: goto            129
        //    42: aload_0        
        //    43: ldc             "experimentDescriptions"
        //    45: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //    48: astore_3       
        //    49: goto            54
        //    52: aconst_null    
        //    53: astore_3       
        //    54: aload_1        
        //    55: astore_2       
        //    56: aload_3        
        //    57: ifnull          66
        //    60: aload_1        
        //    61: aload_3        
        //    62: invokevirtual   com/google/firebase/remoteconfig/internal/b$b.d:(Lorg/json/JSONArray;)Lcom/google/firebase/remoteconfig/internal/b$b;
        //    65: astore_2       
        //    66: aload_0        
        //    67: ldc             "personalizationMetadata"
        //    69: invokevirtual   org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    72: astore_3       
        //    73: goto            78
        //    76: aconst_null    
        //    77: astore_3       
        //    78: aload_2        
        //    79: astore_1       
        //    80: aload_3        
        //    81: ifnull          90
        //    84: aload_2        
        //    85: aload_3        
        //    86: invokevirtual   com/google/firebase/remoteconfig/internal/b$b.f:(Lorg/json/JSONObject;)Lcom/google/firebase/remoteconfig/internal/b$b;
        //    89: astore_1       
        //    90: aload           4
        //    92: astore_2       
        //    93: aload_0        
        //    94: ldc             "templateVersion"
        //    96: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //    99: ifeq            109
        //   102: aload_0        
        //   103: ldc             "templateVersion"
        //   105: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   108: astore_2       
        //   109: aload_2        
        //   110: ifnull          122
        //   113: aload_1        
        //   114: aload_2        
        //   115: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   118: invokevirtual   com/google/firebase/remoteconfig/internal/b$b.g:(J)Lcom/google/firebase/remoteconfig/internal/b$b;
        //   121: pop            
        //   122: aload_1        
        //   123: invokevirtual   com/google/firebase/remoteconfig/internal/b$b.a:()Lcom/google/firebase/remoteconfig/internal/b;
        //   126: astore_0       
        //   127: aload_0        
        //   128: areturn        
        //   129: new             LP4/n;
        //   132: dup            
        //   133: ldc             "Fetch failed: fetch response could not be parsed."
        //   135: aload_0        
        //   136: invokespecial   P4/n.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   139: athrow         
        //   140: astore_1       
        //   141: goto            21
        //   144: astore_2       
        //   145: goto            52
        //   148: astore_1       
        //   149: goto            76
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  0      8      38     42     Lorg/json/JSONException;
        //  11     18     140    23     Lorg/json/JSONException;
        //  29     35     38     42     Lorg/json/JSONException;
        //  42     49     144    54     Lorg/json/JSONException;
        //  60     66     38     42     Lorg/json/JSONException;
        //  66     73     148    78     Lorg/json/JSONException;
        //  84     90     38     42     Lorg/json/JSONException;
        //  93     109    38     42     Lorg/json/JSONException;
        //  113    122    38     42     Lorg/json/JSONException;
        //  122    127    38     42     Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 88 out of bounds for length 88
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
    
    public static String f(final String input) {
        final Matcher matcher = ConfigFetchHttpClient.h.matcher(input);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }
    
    public final boolean a(final JSONObject jsonObject) {
        try {
            return jsonObject.get("state").equals("NO_CHANGE") ^ true;
        }
        catch (JSONException ex) {
            return true;
        }
    }
    
    public final String b(final long l) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(l);
    }
    
    public final JSONObject c(final String s, final String s2, final Map map, final Long n) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        Label_0269: {
            if (s == null) {
                break Label_0269;
            }
            hashMap.put("appInstanceId", s);
            hashMap.put("appInstanceIdToken", s2);
            hashMap.put("appId", this.b);
            final Locale locale = this.a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            final int sdk_INT = Build$VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(sdk_INT));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            while (true) {
                try {
                    final PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                    if (packageInfo != null) {
                        hashMap.put("appVersion", packageInfo.versionName);
                        hashMap.put("appBuild", Long.toString(y.a.a(packageInfo)));
                    }
                    hashMap.put("packageName", this.a.getPackageName());
                    hashMap.put("sdkVersion", "21.5.0");
                    hashMap.put("analyticsUserProperties", (String)new JSONObject(map));
                    if (n != null) {
                        hashMap.put("firstOpenTime", this.b(n));
                    }
                    return new JSONObject((Map)hashMap);
                    throw new n("Fetch failed: Firebase installation id is null.");
                }
                catch (PackageManager$NameNotFoundException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public HttpURLConnection d() {
        try {
            return (HttpURLConnection)new URL(this.h(this.d, this.e)).openConnection();
        }
        catch (IOException ex) {
            throw new o(ex.getMessage());
        }
    }
    
    @Keep
    public c.a fetch(final HttpURLConnection p0, final String p1, final String p2, final Map<String, String> p3, final String p4, final Map<String, String> p5, final Long p6, final Date p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload           5
        //     4: aload_3        
        //     5: aload           6
        //     7: invokevirtual   com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient.m:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
        //    10: aload_0        
        //    11: aload_1        
        //    12: aload_0        
        //    13: aload_2        
        //    14: aload_3        
        //    15: aload           4
        //    17: aload           7
        //    19: invokevirtual   com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient.c:(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)Lorg/json/JSONObject;
        //    22: invokevirtual   org/json/JSONObject.toString:()Ljava/lang/String;
        //    25: ldc_w           "utf-8"
        //    28: invokevirtual   java/lang/String.getBytes:(Ljava/lang/String;)[B
        //    31: invokevirtual   com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient.l:(Ljava/net/HttpURLConnection;[B)V
        //    34: aload_1        
        //    35: invokevirtual   java/net/URLConnection.connect:()V
        //    38: aload_1        
        //    39: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    42: istore          9
        //    44: iload           9
        //    46: sipush          200
        //    49: if_icmpne       117
        //    52: aload_1        
        //    53: ldc_w           "ETag"
        //    56: invokevirtual   java/net/URLConnection.getHeaderField:(Ljava/lang/String;)Ljava/lang/String;
        //    59: astore_2       
        //    60: aload_0        
        //    61: aload_1        
        //    62: invokevirtual   com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient.g:(Ljava/net/URLConnection;)Lorg/json/JSONObject;
        //    65: astore_3       
        //    66: aload_1        
        //    67: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    70: aload_1        
        //    71: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //    74: invokevirtual   java/io/InputStream.close:()V
        //    77: aload_3        
        //    78: aload           8
        //    80: invokestatic    com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient.e:(Lorg/json/JSONObject;Ljava/util/Date;)Lcom/google/firebase/remoteconfig/internal/b;
        //    83: astore_1       
        //    84: aload_0        
        //    85: aload_3        
        //    86: invokevirtual   com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient.a:(Lorg/json/JSONObject;)Z
        //    89: ifne            99
        //    92: aload           8
        //    94: aload_1        
        //    95: invokestatic    com/google/firebase/remoteconfig/internal/c$a.a:(Ljava/util/Date;Lcom/google/firebase/remoteconfig/internal/b;)Lcom/google/firebase/remoteconfig/internal/c$a;
        //    98: areturn        
        //    99: aload_1        
        //   100: aload_2        
        //   101: invokestatic    com/google/firebase/remoteconfig/internal/c$a.b:(Lcom/google/firebase/remoteconfig/internal/b;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/internal/c$a;
        //   104: areturn        
        //   105: astore_2       
        //   106: goto            143
        //   109: astore_2       
        //   110: goto            131
        //   113: astore_2       
        //   114: goto            131
        //   117: new             LP4/r;
        //   120: dup            
        //   121: iload           9
        //   123: aload_1        
        //   124: invokevirtual   java/net/HttpURLConnection.getResponseMessage:()Ljava/lang/String;
        //   127: invokespecial   P4/r.<init>:(ILjava/lang/String;)V
        //   130: athrow         
        //   131: new             LP4/n;
        //   134: dup            
        //   135: ldc_w           "The client had an error while calling the backend!"
        //   138: aload_2        
        //   139: invokespecial   P4/n.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   142: athrow         
        //   143: aload_1        
        //   144: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   147: aload_1        
        //   148: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   151: invokevirtual   java/io/InputStream.close:()V
        //   154: aload_2        
        //   155: athrow         
        //   156: astore_1       
        //   157: goto            77
        //   160: astore_1       
        //   161: goto            154
        //    Signature:
        //  (Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Long;Ljava/util/Date;)Lcom/google/firebase/remoteconfig/internal/c$a;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  10     44     113    117    Ljava/io/IOException;
        //  10     44     109    113    Lorg/json/JSONException;
        //  10     44     105    156    Any
        //  52     66     113    117    Ljava/io/IOException;
        //  52     66     109    113    Lorg/json/JSONException;
        //  52     66     105    156    Any
        //  70     77     156    160    Ljava/io/IOException;
        //  117    131    113    117    Ljava/io/IOException;
        //  117    131    109    113    Lorg/json/JSONException;
        //  117    131    105    156    Any
        //  131    143    105    156    Any
        //  147    154    160    164    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 85 out of bounds for length 85
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
    
    public final JSONObject g(final URLConnection urlConnection) {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "utf-8"));
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final int read = bufferedReader.read();
            if (read == -1) {
                break;
            }
            sb.append((char)read);
        }
        return new JSONObject(sb.toString());
    }
    
    public final String h(final String s, final String s2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", s, s2);
    }
    
    public final String i() {
        while (true) {
            try {
                final Context a = this.a;
                final byte[] a2 = E2.a.a(a, a.getPackageName());
                if (a2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not get fingerprint hash for package: ");
                    sb.append(this.a.getPackageName());
                    Log.e("FirebaseRemoteConfig", sb.toString());
                    return null;
                }
                return j.b(a2, false);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("No such package: ");
                sb2.append(this.a.getPackageName());
                final PackageManager$NameNotFoundException ex;
                Log.e("FirebaseRemoteConfig", sb2.toString(), (Throwable)ex);
                return null;
            }
            catch (PackageManager$NameNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void j(final HttpURLConnection httpURLConnection, final String value) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", this.i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", value);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }
    
    public final void k(final HttpURLConnection httpURLConnection, final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), (String)entry.getValue());
        }
    }
    
    public final void l(final HttpURLConnection httpURLConnection, final byte[] b) {
        httpURLConnection.setFixedLengthStreamingMode(b.length);
        final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
    
    public final void m(final HttpURLConnection httpURLConnection, final String value, final String s, final Map map) {
        httpURLConnection.setDoOutput(true);
        final TimeUnit seconds = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int)seconds.toMillis(this.f));
        httpURLConnection.setReadTimeout((int)seconds.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", value);
        this.j(httpURLConnection, s);
        this.k(httpURLConnection, map);
    }
}
