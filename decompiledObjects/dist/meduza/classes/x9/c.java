package x9;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.JsonReader;
import android.util.Log;
import b.a0;
import com.google.android.gms.tasks.Tasks;
import g;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m6.j;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static final Pattern d = Pattern.compile("[0-9]+s");
  public static final Charset e = Charset.forName("UTF-8");
  public final Context a;
  public final t9.b<q9.e> b;
  public final e c;
  
  public c(Context paramContext, t9.b<q9.e> paramb)
  {
    a = paramContext;
    b = paramb;
    c = new e();
  }
  
  public static URL a(String paramString)
  {
    try
    {
      paramString = new URL(String.format("https://%s/%s/%s", new Object[] { "firebaseinstallations.googleapis.com", "v1", paramString }));
      return paramString;
    }
    catch (MalformedURLException paramString)
    {
      throw new u9.e(paramString.getMessage());
    }
  }
  
  /* Error */
  public static void b(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 91	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   4: astore 4
    //   6: aconst_null
    //   7: astore 5
    //   9: aconst_null
    //   10: astore 6
    //   12: aload 4
    //   14: ifnonnull +9 -> 23
    //   17: aload 5
    //   19: astore_0
    //   20: goto +113 -> 133
    //   23: new 93	java/io/BufferedReader
    //   26: dup
    //   27: new 95	java/io/InputStreamReader
    //   30: dup
    //   31: aload 4
    //   33: getstatic 37	x9/c:e	Ljava/nio/charset/Charset;
    //   36: invokespecial 98	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   39: invokespecial 101	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   42: astore 5
    //   44: new 103	java/lang/StringBuilder
    //   47: astore 7
    //   49: aload 7
    //   51: invokespecial 104	java/lang/StringBuilder:<init>	()V
    //   54: aload 5
    //   56: invokevirtual 107	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   59: astore 4
    //   61: aload 4
    //   63: ifnull +22 -> 85
    //   66: aload 7
    //   68: aload 4
    //   70: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: aload 7
    //   76: bipush 10
    //   78: invokevirtual 114	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: goto -28 -> 54
    //   85: ldc 116
    //   87: iconst_3
    //   88: anewarray 4	java/lang/Object
    //   91: dup
    //   92: iconst_0
    //   93: aload_0
    //   94: invokevirtual 120	java/net/HttpURLConnection:getResponseCode	()I
    //   97: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   100: aastore
    //   101: dup
    //   102: iconst_1
    //   103: aload_0
    //   104: invokevirtual 129	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
    //   107: aastore
    //   108: dup
    //   109: iconst_2
    //   110: aload 7
    //   112: aastore
    //   113: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   116: astore_0
    //   117: goto +11 -> 128
    //   120: astore_0
    //   121: aload 5
    //   123: invokevirtual 132	java/io/BufferedReader:close	()V
    //   126: aload_0
    //   127: athrow
    //   128: aload 5
    //   130: invokevirtual 132	java/io/BufferedReader:close	()V
    //   133: aload_0
    //   134: invokestatic 138	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   137: ifne +57 -> 194
    //   140: ldc -116
    //   142: aload_0
    //   143: invokestatic 146	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   146: pop
    //   147: aload_1
    //   148: invokestatic 138	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   151: ifeq +9 -> 160
    //   154: ldc -108
    //   156: astore_0
    //   157: goto +10 -> 167
    //   160: ldc -106
    //   162: aload_1
    //   163: invokestatic 155	g:d	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   166: astore_0
    //   167: ldc -116
    //   169: ldc -99
    //   171: iconst_3
    //   172: anewarray 4	java/lang/Object
    //   175: dup
    //   176: iconst_0
    //   177: aload_2
    //   178: aastore
    //   179: dup
    //   180: iconst_1
    //   181: aload_3
    //   182: aastore
    //   183: dup
    //   184: iconst_2
    //   185: aload_0
    //   186: aastore
    //   187: invokestatic 70	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   190: invokestatic 146	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   193: pop
    //   194: return
    //   195: astore_0
    //   196: aload 6
    //   198: astore_0
    //   199: goto -71 -> 128
    //   202: astore_1
    //   203: goto -77 -> 126
    //   206: astore 6
    //   208: goto -75 -> 133
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	paramHttpURLConnection	HttpURLConnection
    //   0	211	1	paramString1	String
    //   0	211	2	paramString2	String
    //   0	211	3	paramString3	String
    //   4	65	4	localObject1	Object
    //   7	122	5	localBufferedReader	java.io.BufferedReader
    //   10	187	6	localObject2	Object
    //   206	1	6	localIOException	IOException
    //   47	64	7	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   44	54	120	finally
    //   54	61	120	finally
    //   66	82	120	finally
    //   85	117	120	finally
    //   44	54	195	java/io/IOException
    //   54	61	195	java/io/IOException
    //   66	82	195	java/io/IOException
    //   85	117	195	java/io/IOException
    //   121	126	202	java/io/IOException
    //   128	133	206	java/io/IOException
  }
  
  public static long d(String paramString)
  {
    j.a("Invalid Expiration Timestamp.", d.matcher(paramString).matches());
    long l;
    if ((paramString != null) && (paramString.length() != 0)) {
      l = Long.parseLong(paramString.substring(0, paramString.length() - 1));
    } else {
      l = 0L;
    }
    return l;
  }
  
  public static a e(HttpURLConnection paramHttpURLConnection)
  {
    InputStream localInputStream = paramHttpURLConnection.getInputStream();
    JsonReader localJsonReader = new JsonReader(new InputStreamReader(localInputStream, e));
    Long localLong = Long.valueOf(0L);
    localJsonReader.beginObject();
    Object localObject1 = null;
    String str = null;
    paramHttpURLConnection = str;
    Object localObject2 = paramHttpURLConnection;
    Object localObject3 = localObject2;
    while (localJsonReader.hasNext())
    {
      Object localObject4 = localJsonReader.nextName();
      if (((String)localObject4).equals("name"))
      {
        str = localJsonReader.nextString();
      }
      else if (((String)localObject4).equals("fid"))
      {
        paramHttpURLConnection = localJsonReader.nextString();
      }
      else if (((String)localObject4).equals("refreshToken"))
      {
        localObject2 = localJsonReader.nextString();
      }
      else if (((String)localObject4).equals("authToken"))
      {
        localJsonReader.beginObject();
        localObject3 = localObject1;
        while (localJsonReader.hasNext())
        {
          localObject1 = localJsonReader.nextName();
          if (((String)localObject1).equals("token")) {
            localObject3 = localJsonReader.nextString();
          } else if (((String)localObject1).equals("expiresIn")) {
            localLong = Long.valueOf(d(localJsonReader.nextString()));
          } else {
            localJsonReader.skipValue();
          }
        }
        if (localLong == null) {
          localObject1 = " tokenExpirationTimestamp";
        } else {
          localObject1 = "";
        }
        if (((String)localObject1).isEmpty())
        {
          localObject4 = new b((String)localObject3, localLong.longValue(), 0);
          localJsonReader.endObject();
          localObject1 = localObject3;
          localObject3 = localObject4;
        }
        else
        {
          throw new IllegalStateException(g.d("Missing required properties:", (String)localObject1));
        }
      }
      else
      {
        localJsonReader.skipValue();
      }
    }
    localJsonReader.endObject();
    localJsonReader.close();
    localInputStream.close();
    return new a(str, paramHttpURLConnection, (String)localObject2, (f)localObject3, 1);
  }
  
  public static b f(HttpURLConnection paramHttpURLConnection)
  {
    Object localObject = paramHttpURLConnection.getInputStream();
    JsonReader localJsonReader = new JsonReader(new InputStreamReader((InputStream)localObject, e));
    String str1 = null;
    paramHttpURLConnection = Long.valueOf(0L);
    localJsonReader.beginObject();
    while (localJsonReader.hasNext())
    {
      String str2 = localJsonReader.nextName();
      if (str2.equals("token")) {
        str1 = localJsonReader.nextString();
      } else if (str2.equals("expiresIn")) {
        paramHttpURLConnection = Long.valueOf(d(localJsonReader.nextString()));
      } else {
        localJsonReader.skipValue();
      }
    }
    localJsonReader.endObject();
    localJsonReader.close();
    ((InputStream)localObject).close();
    if (paramHttpURLConnection == null) {
      localObject = " tokenExpirationTimestamp";
    } else {
      localObject = "";
    }
    if (((String)localObject).isEmpty()) {
      return new b(str1, paramHttpURLConnection.longValue(), 1);
    }
    throw new IllegalStateException(g.d("Missing required properties:", (String)localObject));
  }
  
  public static void g(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("fid", paramString1);
      localJSONObject.put("appId", paramString2);
      localJSONObject.put("authVersion", "FIS_v2");
      localJSONObject.put("sdkVersion", "a:18.0.0");
      i(paramHttpURLConnection, localJSONObject.toString().getBytes("UTF-8"));
      return;
    }
    catch (JSONException paramHttpURLConnection)
    {
      throw new IllegalStateException(paramHttpURLConnection);
    }
  }
  
  public static void h(HttpURLConnection paramHttpURLConnection)
  {
    try
    {
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>();
      localJSONObject1.put("sdkVersion", "a:18.0.0");
      JSONObject localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>();
      localJSONObject2.put("installation", localJSONObject1);
      i(paramHttpURLConnection, localJSONObject2.toString().getBytes("UTF-8"));
      return;
    }
    catch (JSONException paramHttpURLConnection)
    {
      throw new IllegalStateException(paramHttpURLConnection);
    }
  }
  
  /* Error */
  public static void i(URLConnection paramURLConnection, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 306	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +37 -> 43
    //   9: new 308	java/util/zip/GZIPOutputStream
    //   12: dup
    //   13: aload_2
    //   14: invokespecial 311	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   17: astore_3
    //   18: aload_3
    //   19: aload_1
    //   20: invokevirtual 317	java/io/OutputStream:write	([B)V
    //   23: aload_3
    //   24: invokevirtual 318	java/io/OutputStream:close	()V
    //   27: aload_2
    //   28: invokevirtual 318	java/io/OutputStream:close	()V
    //   31: return
    //   32: astore_0
    //   33: aload_3
    //   34: invokevirtual 318	java/io/OutputStream:close	()V
    //   37: aload_2
    //   38: invokevirtual 318	java/io/OutputStream:close	()V
    //   41: aload_0
    //   42: athrow
    //   43: new 85	java/io/IOException
    //   46: dup
    //   47: ldc_w 320
    //   50: invokespecial 321	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   53: athrow
    //   54: astore_0
    //   55: goto -24 -> 31
    //   58: astore_1
    //   59: goto -18 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	paramURLConnection	URLConnection
    //   0	62	1	paramArrayOfByte	byte[]
    //   4	34	2	localOutputStream	java.io.OutputStream
    //   17	17	3	localGZIPOutputStream	java.util.zip.GZIPOutputStream
    // Exception table:
    //   from	to	target	type
    //   18	23	32	finally
    //   23	31	54	java/io/IOException
    //   33	41	58	java/io/IOException
  }
  
  public final HttpURLConnection c(URL paramURL, String paramString)
  {
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)paramURL.openConnection();
      localHttpURLConnection.setConnectTimeout(10000);
      localHttpURLConnection.setUseCaches(false);
      localHttpURLConnection.setReadTimeout(10000);
      localHttpURLConnection.addRequestProperty("Content-Type", "application/json");
      localHttpURLConnection.addRequestProperty("Accept", "application/json");
      localHttpURLConnection.addRequestProperty("Content-Encoding", "gzip");
      localHttpURLConnection.addRequestProperty("Cache-Control", "no-cache");
      localHttpURLConnection.addRequestProperty("X-Android-Package", a.getPackageName());
      paramURL = (q9.e)b.get();
      if (paramURL != null)
      {
        try
        {
          localHttpURLConnection.addRequestProperty("x-firebase-client", (String)Tasks.await(paramURL.a()));
        }
        catch (InterruptedException paramURL)
        {
          Thread.currentThread().interrupt();
        }
        catch (ExecutionException paramURL) {}
        Log.w("ContentValues", "Failed to get heartbeats header", paramURL);
      }
      paramURL = null;
      try
      {
        Object localObject = a;
        localObject = v6.a.a((Context)localObject, ((Context)localObject).getPackageName());
        if (localObject == null)
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          ((StringBuilder)localObject).append("Could not get fingerprint hash for package: ");
          ((StringBuilder)localObject).append(a.getPackageName());
          Log.e("ContentValues", ((StringBuilder)localObject).toString());
        }
        else
        {
          localObject = a0.o((byte[])localObject);
          paramURL = (URL)localObject;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        StringBuilder localStringBuilder = f.l("No such package: ");
        localStringBuilder.append(a.getPackageName());
        Log.e("ContentValues", localStringBuilder.toString(), localNameNotFoundException);
      }
      localHttpURLConnection.addRequestProperty("X-Android-Cert", paramURL);
      localHttpURLConnection.addRequestProperty("x-goog-api-key", paramString);
      return localHttpURLConnection;
    }
    catch (IOException paramURL)
    {
      throw new u9.e("Firebase Installations Service is unavailable. Please try again later.");
    }
  }
}

/* Location:
 * Qualified Name:     x9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */