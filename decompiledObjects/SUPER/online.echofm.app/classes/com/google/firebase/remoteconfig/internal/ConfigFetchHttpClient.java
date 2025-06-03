package com.google.firebase.remoteconfig.internal;

import E2.j;
import P4.n;
import P4.o;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient
{
  public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
  public final Context a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final long f;
  public final long g;
  
  public ConfigFetchHttpClient(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2)
  {
    a = paramContext;
    b = paramString1;
    c = paramString2;
    d = f(paramString1);
    e = paramString3;
    f = paramLong1;
    g = paramLong2;
  }
  
  public static b e(JSONObject paramJSONObject, Date paramDate)
  {
    Object localObject1;
    Object localObject2;
    try
    {
      localObject1 = b.j().e(paramDate);
      localObject2 = null;
      JSONObject localJSONObject;
      try
      {
        localJSONObject = paramJSONObject.getJSONObject("entries");
      }
      catch (JSONException paramDate)
      {
        localJSONObject = null;
      }
      paramDate = (Date)localObject1;
      if (localJSONObject != null) {
        paramDate = ((b.b)localObject1).c(localJSONObject);
      }
    }
    catch (JSONException paramJSONObject)
    {
      break label143;
    }
    try
    {
      localObject1 = paramJSONObject.getJSONArray("experimentDescriptions");
    }
    catch (JSONException localJSONException)
    {
      localObject1 = null;
    }
    Object localObject3 = paramDate;
    if (localObject1 != null) {
      localObject3 = paramDate.d((JSONArray)localObject1);
    }
    try
    {
      localObject1 = paramJSONObject.getJSONObject("personalizationMetadata");
    }
    catch (JSONException paramDate)
    {
      localObject1 = null;
    }
    paramDate = (Date)localObject3;
    if (localObject1 != null) {
      paramDate = ((b.b)localObject3).f((JSONObject)localObject1);
    }
    localObject3 = localObject2;
    if (paramJSONObject.has("templateVersion")) {
      localObject3 = paramJSONObject.getString("templateVersion");
    }
    if (localObject3 != null) {
      paramDate.g(Long.parseLong((String)localObject3));
    }
    paramJSONObject = paramDate.a();
    return paramJSONObject;
    label143:
    throw new n("Fetch failed: fetch response could not be parsed.", paramJSONObject);
  }
  
  public static String f(String paramString)
  {
    paramString = h.matcher(paramString);
    if (paramString.matches()) {
      paramString = paramString.group(1);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  public final boolean a(JSONObject paramJSONObject)
  {
    try
    {
      boolean bool = paramJSONObject.get("state").equals("NO_CHANGE");
      return bool ^ true;
    }
    catch (JSONException paramJSONObject) {}
    return true;
  }
  
  public final String b(long paramLong)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    localSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    return localSimpleDateFormat.format(Long.valueOf(paramLong));
  }
  
  public final JSONObject c(String paramString1, String paramString2, Map paramMap, Long paramLong)
  {
    HashMap localHashMap = new HashMap();
    if (paramString1 != null)
    {
      localHashMap.put("appInstanceId", paramString1);
      localHashMap.put("appInstanceIdToken", paramString2);
      localHashMap.put("appId", b);
      paramString1 = a.getResources().getConfiguration().locale;
      localHashMap.put("countryCode", paramString1.getCountry());
      int i = Build.VERSION.SDK_INT;
      localHashMap.put("languageCode", paramString1.toLanguageTag());
      localHashMap.put("platformVersion", Integer.toString(i));
      localHashMap.put("timeZone", TimeZone.getDefault().getID());
    }
    try
    {
      paramString1 = a.getPackageManager().getPackageInfo(a.getPackageName(), 0);
      if (paramString1 != null)
      {
        localHashMap.put("appVersion", versionName);
        localHashMap.put("appBuild", Long.toString(y.a.a(paramString1)));
      }
    }
    catch (PackageManager.NameNotFoundException paramString1)
    {
      for (;;) {}
    }
    localHashMap.put("packageName", a.getPackageName());
    localHashMap.put("sdkVersion", "21.5.0");
    localHashMap.put("analyticsUserProperties", new JSONObject(paramMap));
    if (paramLong != null) {
      localHashMap.put("firstOpenTime", b(paramLong.longValue()));
    }
    return new JSONObject(localHashMap);
    throw new n("Fetch failed: Firebase installation id is null.");
  }
  
  public HttpURLConnection d()
  {
    try
    {
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(h(d, e));
      localObject = (HttpURLConnection)((URL)localObject).openConnection();
      return (HttpURLConnection)localObject;
    }
    catch (IOException localIOException)
    {
      throw new o(localIOException.getMessage());
    }
  }
  
  /* Error */
  @androidx.annotation.Keep
  public c.a fetch(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2, Map<String, String> paramMap1, String paramString3, Map<String, String> paramMap2, Long paramLong, Date paramDate)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload 5
    //   4: aload_3
    //   5: aload 6
    //   7: invokevirtual 332	com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient:m	(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    //   10: aload_0
    //   11: aload_1
    //   12: aload_0
    //   13: aload_2
    //   14: aload_3
    //   15: aload 4
    //   17: aload 7
    //   19: invokevirtual 334	com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient:c	(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)Lorg/json/JSONObject;
    //   22: invokevirtual 336	org/json/JSONObject:toString	()Ljava/lang/String;
    //   25: ldc_w 338
    //   28: invokevirtual 344	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   31: invokevirtual 348	com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient:l	(Ljava/net/HttpURLConnection;[B)V
    //   34: aload_1
    //   35: invokevirtual 353	java/net/URLConnection:connect	()V
    //   38: aload_1
    //   39: invokevirtual 357	java/net/HttpURLConnection:getResponseCode	()I
    //   42: istore 9
    //   44: iload 9
    //   46: sipush 200
    //   49: if_icmpne +68 -> 117
    //   52: aload_1
    //   53: ldc_w 359
    //   56: invokevirtual 362	java/net/URLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   59: astore_3
    //   60: aload_0
    //   61: aload_1
    //   62: invokevirtual 365	com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient:g	(Ljava/net/URLConnection;)Lorg/json/JSONObject;
    //   65: astore_2
    //   66: aload_1
    //   67: invokevirtual 368	java/net/HttpURLConnection:disconnect	()V
    //   70: aload_1
    //   71: invokevirtual 372	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   74: invokevirtual 377	java/io/InputStream:close	()V
    //   77: aload_2
    //   78: aload 8
    //   80: invokestatic 379	com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient:e	(Lorg/json/JSONObject;Ljava/util/Date;)Lcom/google/firebase/remoteconfig/internal/b;
    //   83: astore_1
    //   84: aload_0
    //   85: aload_2
    //   86: invokevirtual 381	com/google/firebase/remoteconfig/internal/ConfigFetchHttpClient:a	(Lorg/json/JSONObject;)Z
    //   89: ifne +10 -> 99
    //   92: aload 8
    //   94: aload_1
    //   95: invokestatic 386	com/google/firebase/remoteconfig/internal/c$a:a	(Ljava/util/Date;Lcom/google/firebase/remoteconfig/internal/b;)Lcom/google/firebase/remoteconfig/internal/c$a;
    //   98: areturn
    //   99: aload_1
    //   100: aload_3
    //   101: invokestatic 389	com/google/firebase/remoteconfig/internal/c$a:b	(Lcom/google/firebase/remoteconfig/internal/b;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/internal/c$a;
    //   104: areturn
    //   105: astore_2
    //   106: goto +41 -> 147
    //   109: astore_2
    //   110: goto +23 -> 133
    //   113: astore_2
    //   114: goto +19 -> 133
    //   117: new 391	P4/r
    //   120: astore_2
    //   121: aload_2
    //   122: iload 9
    //   124: aload_1
    //   125: invokevirtual 394	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
    //   128: invokespecial 397	P4/r:<init>	(ILjava/lang/String;)V
    //   131: aload_2
    //   132: athrow
    //   133: new 111	P4/n
    //   136: astore_3
    //   137: aload_3
    //   138: ldc_w 399
    //   141: aload_2
    //   142: invokespecial 116	P4/n:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   145: aload_3
    //   146: athrow
    //   147: aload_1
    //   148: invokevirtual 368	java/net/HttpURLConnection:disconnect	()V
    //   151: aload_1
    //   152: invokevirtual 372	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   155: invokevirtual 377	java/io/InputStream:close	()V
    //   158: aload_2
    //   159: athrow
    //   160: astore_1
    //   161: goto -84 -> 77
    //   164: astore_1
    //   165: goto -7 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	this	ConfigFetchHttpClient
    //   0	168	1	paramHttpURLConnection	HttpURLConnection
    //   0	168	2	paramString1	String
    //   0	168	3	paramString2	String
    //   0	168	4	paramMap1	Map<String, String>
    //   0	168	5	paramString3	String
    //   0	168	6	paramMap2	Map<String, String>
    //   0	168	7	paramLong	Long
    //   0	168	8	paramDate	Date
    //   42	81	9	i	int
    // Exception table:
    //   from	to	target	type
    //   10	44	105	finally
    //   52	66	105	finally
    //   117	133	105	finally
    //   133	147	105	finally
    //   10	44	109	org/json/JSONException
    //   52	66	109	org/json/JSONException
    //   117	133	109	org/json/JSONException
    //   10	44	113	java/io/IOException
    //   52	66	113	java/io/IOException
    //   117	133	113	java/io/IOException
    //   70	77	160	java/io/IOException
    //   151	158	164	java/io/IOException
  }
  
  public final JSONObject g(URLConnection paramURLConnection)
  {
    paramURLConnection = new BufferedReader(new InputStreamReader(paramURLConnection.getInputStream(), "utf-8"));
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      int i = paramURLConnection.read();
      if (i == -1) {
        break;
      }
      localStringBuilder.append((char)i);
    }
    return new JSONObject(localStringBuilder.toString());
  }
  
  public final String h(String paramString1, String paramString2)
  {
    return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[] { paramString1, paramString2 });
  }
  
  public final String i()
  {
    try
    {
      localObject = a;
      localObject = E2.a.a((Context)localObject, ((Context)localObject).getPackageName());
      if (localObject == null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Could not get fingerprint hash for package: ");
        ((StringBuilder)localObject).append(a.getPackageName());
        Log.e("FirebaseRemoteConfig", ((StringBuilder)localObject).toString());
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label71;
      Object localObject = j.b((byte[])localObject, false);
      return (String)localObject;
      label71:
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No such package: ");
      ((StringBuilder)localObject).append(a.getPackageName());
      Log.e("FirebaseRemoteConfig", ((StringBuilder)localObject).toString(), localNameNotFoundException);
    }
    return null;
  }
  
  public final void j(HttpURLConnection paramHttpURLConnection, String paramString)
  {
    paramHttpURLConnection.setRequestProperty("X-Goog-Api-Key", c);
    paramHttpURLConnection.setRequestProperty("X-Android-Package", a.getPackageName());
    paramHttpURLConnection.setRequestProperty("X-Android-Cert", i());
    paramHttpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
    paramHttpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", paramString);
    paramHttpURLConnection.setRequestProperty("Content-Type", "application/json");
    paramHttpURLConnection.setRequestProperty("Accept", "application/json");
  }
  
  public final void k(HttpURLConnection paramHttpURLConnection, Map paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      paramHttpURLConnection.setRequestProperty((String)localEntry.getKey(), (String)localEntry.getValue());
    }
  }
  
  public final void l(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte)
  {
    paramHttpURLConnection.setFixedLengthStreamingMode(paramArrayOfByte.length);
    paramHttpURLConnection = new BufferedOutputStream(paramHttpURLConnection.getOutputStream());
    paramHttpURLConnection.write(paramArrayOfByte);
    paramHttpURLConnection.flush();
    paramHttpURLConnection.close();
  }
  
  public final void m(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2, Map paramMap)
  {
    paramHttpURLConnection.setDoOutput(true);
    TimeUnit localTimeUnit = TimeUnit.SECONDS;
    paramHttpURLConnection.setConnectTimeout((int)localTimeUnit.toMillis(f));
    paramHttpURLConnection.setReadTimeout((int)localTimeUnit.toMillis(g));
    paramHttpURLConnection.setRequestProperty("If-None-Match", paramString1);
    j(paramHttpURLConnection, paramString2);
    k(paramHttpURLConnection, paramMap);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */