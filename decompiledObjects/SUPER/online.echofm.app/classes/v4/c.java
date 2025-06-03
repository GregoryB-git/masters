package v4;

import A2.n;
import E2.a;
import V2.m;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
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
import o4.i;
import org.json.JSONException;
import org.json.JSONObject;
import r4.b;
import s4.j.a;

public class c
{
  public static final Pattern d = Pattern.compile("[0-9]+s");
  public static final Charset e = Charset.forName("UTF-8");
  public final Context a;
  public final b b;
  public final e c;
  
  public c(Context paramContext, b paramb)
  {
    a = paramContext;
    b = paramb;
    c = new e();
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      paramString1 = "";
    }
    else
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(", ");
      localStringBuilder.append(paramString1);
      paramString1 = localStringBuilder.toString();
    }
    return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", new Object[] { paramString2, paramString3, paramString1 });
  }
  
  public static JSONObject b(String paramString1, String paramString2)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("fid", paramString1);
      localJSONObject.put("appId", paramString2);
      localJSONObject.put("authVersion", "FIS_v2");
      localJSONObject.put("sdkVersion", "a:17.2.0");
      return localJSONObject;
    }
    catch (JSONException paramString1)
    {
      throw new IllegalStateException(paramString1);
    }
  }
  
  public static JSONObject c()
  {
    try
    {
      JSONObject localJSONObject1 = new org/json/JSONObject;
      localJSONObject1.<init>();
      localJSONObject1.put("sdkVersion", "a:17.2.0");
      JSONObject localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>();
      localJSONObject2.put("installation", localJSONObject1);
      return localJSONObject2;
    }
    catch (JSONException localJSONException)
    {
      throw new IllegalStateException(localJSONException);
    }
  }
  
  public static byte[] i(JSONObject paramJSONObject)
  {
    return paramJSONObject.toString().getBytes("UTF-8");
  }
  
  public static boolean j(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 200) && (paramInt < 300)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static void k()
  {
    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
  }
  
  public static void l(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2, String paramString3)
  {
    paramHttpURLConnection = p(paramHttpURLConnection);
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      Log.w("Firebase-Installations", paramHttpURLConnection);
      Log.w("Firebase-Installations", a(paramString1, paramString2, paramString3));
    }
  }
  
  public static long n(String paramString)
  {
    n.b(d.matcher(paramString).matches(), "Invalid Expiration Timestamp.");
    long l;
    if ((paramString != null) && (paramString.length() != 0)) {
      l = Long.parseLong(paramString.substring(0, paramString.length() - 1));
    } else {
      l = 0L;
    }
    return l;
  }
  
  /* Error */
  public static String p(HttpURLConnection paramHttpURLConnection)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 180	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull +5 -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: new 182	java/io/BufferedReader
    //   14: dup
    //   15: new 184	java/io/InputStreamReader
    //   18: dup
    //   19: aload_1
    //   20: getstatic 36	v4/c:e	Ljava/nio/charset/Charset;
    //   23: invokespecial 187	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   26: invokespecial 190	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   29: astore_1
    //   30: new 61	java/lang/StringBuilder
    //   33: astore_2
    //   34: aload_2
    //   35: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   38: aload_1
    //   39: invokevirtual 193	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: astore_3
    //   43: aload_3
    //   44: ifnull +23 -> 67
    //   47: aload_2
    //   48: aload_3
    //   49: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: aload_2
    //   54: bipush 10
    //   56: invokevirtual 196	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: goto -22 -> 38
    //   63: astore_0
    //   64: goto +40 -> 104
    //   67: ldc -58
    //   69: iconst_3
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_0
    //   76: invokevirtual 201	java/net/HttpURLConnection:getResponseCode	()I
    //   79: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   82: aastore
    //   83: dup
    //   84: iconst_1
    //   85: aload_0
    //   86: invokevirtual 210	java/net/HttpURLConnection:getResponseMessage	()Ljava/lang/String;
    //   89: aastore
    //   90: dup
    //   91: iconst_2
    //   92: aload_2
    //   93: aastore
    //   94: invokestatic 80	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   97: astore_0
    //   98: aload_1
    //   99: invokevirtual 213	java/io/BufferedReader:close	()V
    //   102: aload_0
    //   103: areturn
    //   104: aload_1
    //   105: invokevirtual 213	java/io/BufferedReader:close	()V
    //   108: aload_0
    //   109: athrow
    //   110: astore_0
    //   111: aload_1
    //   112: invokevirtual 213	java/io/BufferedReader:close	()V
    //   115: aconst_null
    //   116: areturn
    //   117: astore_1
    //   118: goto -16 -> 102
    //   121: astore_1
    //   122: goto -14 -> 108
    //   125: astore_0
    //   126: goto -11 -> 115
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	paramHttpURLConnection	HttpURLConnection
    //   4	108	1	localObject	Object
    //   117	1	1	localIOException1	IOException
    //   121	1	1	localIOException2	IOException
    //   33	60	2	localStringBuilder	StringBuilder
    //   42	7	3	str	String
    // Exception table:
    //   from	to	target	type
    //   30	38	63	finally
    //   38	43	63	finally
    //   47	60	63	finally
    //   67	98	63	finally
    //   30	38	110	java/io/IOException
    //   38	43	110	java/io/IOException
    //   47	60	110	java/io/IOException
    //   67	98	110	java/io/IOException
    //   98	102	117	java/io/IOException
    //   104	108	121	java/io/IOException
    //   111	115	125	java/io/IOException
  }
  
  /* Error */
  public static void t(URLConnection paramURLConnection, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 221	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   4: astore_2
    //   5: aload_2
    //   6: ifnull +37 -> 43
    //   9: new 223	java/util/zip/GZIPOutputStream
    //   12: dup
    //   13: aload_2
    //   14: invokespecial 226	java/util/zip/GZIPOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   17: astore_0
    //   18: aload_0
    //   19: aload_1
    //   20: invokevirtual 232	java/io/OutputStream:write	([B)V
    //   23: aload_0
    //   24: invokevirtual 233	java/io/OutputStream:close	()V
    //   27: aload_2
    //   28: invokevirtual 233	java/io/OutputStream:close	()V
    //   31: return
    //   32: astore_1
    //   33: aload_0
    //   34: invokevirtual 233	java/io/OutputStream:close	()V
    //   37: aload_2
    //   38: invokevirtual 233	java/io/OutputStream:close	()V
    //   41: aload_1
    //   42: athrow
    //   43: new 174	java/io/IOException
    //   46: dup
    //   47: ldc -21
    //   49: invokespecial 238	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   52: athrow
    //   53: astore_0
    //   54: goto -23 -> 31
    //   57: astore_0
    //   58: goto -17 -> 41
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	paramURLConnection	URLConnection
    //   0	61	1	paramArrayOfByte	byte[]
    //   4	34	2	localOutputStream	java.io.OutputStream
    // Exception table:
    //   from	to	target	type
    //   18	23	32	finally
    //   23	31	53	java/io/IOException
    //   33	41	57	java/io/IOException
  }
  
  public d d(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    int i = 0;
    if (c.b())
    {
      URL localURL = h(String.format("projects/%s/installations", new Object[] { paramString3 }));
      while (i <= 1)
      {
        TrafficStats.setThreadStatsTag(32769);
        HttpURLConnection localHttpURLConnection = m(localURL, paramString1);
        for (;;)
        {
          try
          {
            try
            {
              localHttpURLConnection.setRequestMethod("POST");
              localHttpURLConnection.setDoOutput(true);
              if (paramString5 != null) {
                localHttpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", paramString5);
              }
            }
            finally
            {
              continue;
            }
            r(localHttpURLConnection, paramString2, paramString4);
            int j = localHttpURLConnection.getResponseCode();
            c.f(j);
            if (j(j))
            {
              localObject = o(localHttpURLConnection);
              paramString1 = (String)localObject;
              localHttpURLConnection.disconnect();
              TrafficStats.clearThreadStatsTag();
              return paramString1;
            }
            l(localHttpURLConnection, paramString4, paramString1, paramString3);
            if (j == 429) {
              continue;
            }
            if ((j < 500) || (j >= 600)) {
              continue;
            }
          }
          catch (AssertionError|IOException localAssertionError)
          {
            Object localObject;
            continue;
          }
          localHttpURLConnection.disconnect();
          TrafficStats.clearThreadStatsTag();
          continue;
          k();
          localObject = d.a().e(d.b.p).a();
          paramString1 = (String)localObject;
        }
        localObject = new s4/j;
        ((s4.j)localObject).<init>("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", j.a.q);
        throw ((Throwable)localObject);
        localHttpURLConnection.disconnect();
        TrafficStats.clearThreadStatsTag();
        throw paramString1;
        i++;
      }
      throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
    }
    throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
  }
  
  /* Error */
  public void e(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_0
    //   4: ldc_w 336
    //   7: iconst_2
    //   8: anewarray 4	java/lang/Object
    //   11: dup
    //   12: iconst_0
    //   13: aload_3
    //   14: aastore
    //   15: dup
    //   16: iconst_1
    //   17: aload_2
    //   18: aastore
    //   19: invokestatic 80	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   22: invokevirtual 249	v4/c:h	(Ljava/lang/String;)Ljava/net/URL;
    //   25: astore 6
    //   27: iload 5
    //   29: iconst_1
    //   30: if_icmpgt +186 -> 216
    //   33: ldc_w 337
    //   36: invokestatic 256	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   39: aload_0
    //   40: aload 6
    //   42: aload_1
    //   43: invokevirtual 260	v4/c:m	(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //   46: astore_2
    //   47: aload_2
    //   48: ldc_w 339
    //   51: invokevirtual 265	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   54: new 61	java/lang/StringBuilder
    //   57: astore 7
    //   59: aload 7
    //   61: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   64: aload 7
    //   66: ldc_w 341
    //   69: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 7
    //   75: aload 4
    //   77: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload_2
    //   82: ldc_w 343
    //   85: aload 7
    //   87: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: invokevirtual 275	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   93: aload_2
    //   94: invokevirtual 201	java/net/HttpURLConnection:getResponseCode	()I
    //   97: istore 8
    //   99: iload 8
    //   101: sipush 200
    //   104: if_icmpeq +95 -> 199
    //   107: iload 8
    //   109: sipush 401
    //   112: if_icmpeq +87 -> 199
    //   115: iload 8
    //   117: sipush 404
    //   120: if_icmpne +6 -> 126
    //   123: goto +76 -> 199
    //   126: aload_2
    //   127: aconst_null
    //   128: aload_1
    //   129: aload_3
    //   130: invokestatic 296	v4/c:l	(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   133: iload 8
    //   135: sipush 429
    //   138: if_icmpeq +48 -> 186
    //   141: iload 8
    //   143: sipush 500
    //   146: if_icmplt +14 -> 160
    //   149: iload 8
    //   151: sipush 600
    //   154: if_icmpge +6 -> 160
    //   157: goto +29 -> 186
    //   160: invokestatic 298	v4/c:k	()V
    //   163: new 318	s4/j
    //   166: astore 7
    //   168: aload 7
    //   170: ldc_w 345
    //   173: getstatic 347	s4/j$a:o	Ls4/j$a;
    //   176: invokespecial 329	s4/j:<init>	(Ljava/lang/String;Ls4/j$a;)V
    //   179: aload 7
    //   181: athrow
    //   182: astore_1
    //   183: goto +24 -> 207
    //   186: iinc 5 1
    //   189: aload_2
    //   190: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   193: invokestatic 294	android/net/TrafficStats:clearThreadStatsTag	()V
    //   196: goto -169 -> 27
    //   199: aload_2
    //   200: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   203: invokestatic 294	android/net/TrafficStats:clearThreadStatsTag	()V
    //   206: return
    //   207: aload_2
    //   208: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   211: invokestatic 294	android/net/TrafficStats:clearThreadStatsTag	()V
    //   214: aload_1
    //   215: athrow
    //   216: new 318	s4/j
    //   219: dup
    //   220: ldc_w 331
    //   223: getstatic 333	s4/j$a:p	Ls4/j$a;
    //   226: invokespecial 329	s4/j:<init>	(Ljava/lang/String;Ls4/j$a;)V
    //   229: athrow
    //   230: astore 7
    //   232: goto -46 -> 186
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	c
    //   0	235	1	paramString1	String
    //   0	235	2	paramString2	String
    //   0	235	3	paramString3	String
    //   0	235	4	paramString4	String
    //   1	186	5	i	int
    //   25	16	6	localURL	URL
    //   57	123	7	localObject	Object
    //   230	1	7	localIOException	IOException
    //   97	58	8	j	int
    // Exception table:
    //   from	to	target	type
    //   47	99	182	finally
    //   126	133	182	finally
    //   160	182	182	finally
    //   47	99	230	java/io/IOException
    //   126	133	230	java/io/IOException
    //   160	182	230	java/io/IOException
  }
  
  /* Error */
  public f f(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aload_0
    //   4: getfield 50	v4/c:c	Lv4/e;
    //   7: invokevirtual 243	v4/e:b	()Z
    //   10: ifeq +294 -> 304
    //   13: aload_0
    //   14: ldc_w 350
    //   17: iconst_2
    //   18: anewarray 4	java/lang/Object
    //   21: dup
    //   22: iconst_0
    //   23: aload_3
    //   24: aastore
    //   25: dup
    //   26: iconst_1
    //   27: aload_2
    //   28: aastore
    //   29: invokestatic 80	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   32: invokevirtual 249	v4/c:h	(Ljava/lang/String;)Ljava/net/URL;
    //   35: astore 6
    //   37: iload 5
    //   39: iconst_1
    //   40: if_icmpgt +250 -> 290
    //   43: ldc_w 351
    //   46: invokestatic 256	android/net/TrafficStats:setThreadStatsTag	(I)V
    //   49: aload_0
    //   50: aload 6
    //   52: aload_1
    //   53: invokevirtual 260	v4/c:m	(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    //   56: astore 7
    //   58: aload 7
    //   60: ldc_w 262
    //   63: invokevirtual 265	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   66: new 61	java/lang/StringBuilder
    //   69: astore_2
    //   70: aload_2
    //   71: invokespecial 62	java/lang/StringBuilder:<init>	()V
    //   74: aload_2
    //   75: ldc_w 341
    //   78: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload_2
    //   83: aload 4
    //   85: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload 7
    //   91: ldc_w 343
    //   94: aload_2
    //   95: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: invokevirtual 275	java/net/URLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   101: aload 7
    //   103: iconst_1
    //   104: invokevirtual 269	java/net/URLConnection:setDoOutput	(Z)V
    //   107: aload_0
    //   108: aload 7
    //   110: invokevirtual 355	v4/c:s	(Ljava/net/HttpURLConnection;)V
    //   113: aload 7
    //   115: invokevirtual 201	java/net/HttpURLConnection:getResponseCode	()I
    //   118: istore 8
    //   120: aload_0
    //   121: getfield 50	v4/c:c	Lv4/e;
    //   124: iload 8
    //   126: invokevirtual 282	v4/e:f	(I)V
    //   129: iload 8
    //   131: invokestatic 284	v4/c:j	(I)Z
    //   134: ifeq +26 -> 160
    //   137: aload_0
    //   138: aload 7
    //   140: invokevirtual 358	v4/c:q	(Ljava/net/HttpURLConnection;)Lv4/f;
    //   143: astore_2
    //   144: aload_2
    //   145: astore_1
    //   146: aload 7
    //   148: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   151: invokestatic 294	android/net/TrafficStats:clearThreadStatsTag	()V
    //   154: aload_1
    //   155: areturn
    //   156: astore_1
    //   157: goto +117 -> 274
    //   160: aload 7
    //   162: aconst_null
    //   163: aload_1
    //   164: aload_3
    //   165: invokestatic 296	v4/c:l	(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   168: iload 8
    //   170: sipush 401
    //   173: if_icmpeq +88 -> 261
    //   176: iload 8
    //   178: sipush 404
    //   181: if_icmpne +6 -> 187
    //   184: goto +77 -> 261
    //   187: iload 8
    //   189: sipush 429
    //   192: if_icmpeq +53 -> 245
    //   195: iload 8
    //   197: sipush 500
    //   200: if_icmplt +22 -> 222
    //   203: iload 8
    //   205: sipush 600
    //   208: if_icmpge +14 -> 222
    //   211: aload 7
    //   213: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   216: invokestatic 294	android/net/TrafficStats:clearThreadStatsTag	()V
    //   219: goto +65 -> 284
    //   222: invokestatic 298	v4/c:k	()V
    //   225: invokestatic 363	v4/f:a	()Lv4/f$a;
    //   228: getstatic 368	v4/f$b:p	Lv4/f$b;
    //   231: invokevirtual 373	v4/f$a:b	(Lv4/f$b;)Lv4/f$a;
    //   234: astore_2
    //   235: aload_2
    //   236: invokevirtual 376	v4/f$a:a	()Lv4/f;
    //   239: astore_2
    //   240: aload_2
    //   241: astore_1
    //   242: goto -96 -> 146
    //   245: new 318	s4/j
    //   248: astore_2
    //   249: aload_2
    //   250: ldc_w 320
    //   253: getstatic 326	s4/j$a:q	Ls4/j$a;
    //   256: invokespecial 329	s4/j:<init>	(Ljava/lang/String;Ls4/j$a;)V
    //   259: aload_2
    //   260: athrow
    //   261: invokestatic 363	v4/f:a	()Lv4/f$a;
    //   264: getstatic 378	v4/f$b:q	Lv4/f$b;
    //   267: invokevirtual 373	v4/f$a:b	(Lv4/f$b;)Lv4/f$a;
    //   270: astore_2
    //   271: goto -36 -> 235
    //   274: aload 7
    //   276: invokevirtual 291	java/net/HttpURLConnection:disconnect	()V
    //   279: invokestatic 294	android/net/TrafficStats:clearThreadStatsTag	()V
    //   282: aload_1
    //   283: athrow
    //   284: iinc 5 1
    //   287: goto -250 -> 37
    //   290: new 318	s4/j
    //   293: dup
    //   294: ldc_w 331
    //   297: getstatic 333	s4/j$a:p	Ls4/j$a;
    //   300: invokespecial 329	s4/j:<init>	(Ljava/lang/String;Ls4/j$a;)V
    //   303: athrow
    //   304: new 318	s4/j
    //   307: dup
    //   308: ldc_w 331
    //   311: getstatic 333	s4/j$a:p	Ls4/j$a;
    //   314: invokespecial 329	s4/j:<init>	(Ljava/lang/String;Ls4/j$a;)V
    //   317: athrow
    //   318: astore_2
    //   319: goto -108 -> 211
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	322	0	this	c
    //   0	322	1	paramString1	String
    //   0	322	2	paramString2	String
    //   0	322	3	paramString3	String
    //   0	322	4	paramString4	String
    //   1	284	5	i	int
    //   35	16	6	localURL	URL
    //   56	219	7	localHttpURLConnection	HttpURLConnection
    //   118	91	8	j	int
    // Exception table:
    //   from	to	target	type
    //   58	144	156	finally
    //   160	168	156	finally
    //   222	235	156	finally
    //   235	240	156	finally
    //   245	261	156	finally
    //   261	271	156	finally
    //   58	144	318	java/lang/AssertionError
    //   58	144	318	java/io/IOException
    //   160	168	318	java/lang/AssertionError
    //   160	168	318	java/io/IOException
    //   222	235	318	java/lang/AssertionError
    //   222	235	318	java/io/IOException
    //   235	240	318	java/lang/AssertionError
    //   235	240	318	java/io/IOException
    //   245	261	318	java/lang/AssertionError
    //   245	261	318	java/io/IOException
    //   261	271	318	java/lang/AssertionError
    //   261	271	318	java/io/IOException
  }
  
  public final String g()
  {
    try
    {
      Object localObject = a;
      localObject = a.a((Context)localObject, ((Context)localObject).getPackageName());
      if (localObject == null)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Could not get fingerprint hash for package: ");
        ((StringBuilder)localObject).append(a.getPackageName());
        Log.e("ContentValues", ((StringBuilder)localObject).toString());
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label71;
      String str = E2.j.b(localNameNotFoundException, false);
      return str;
      label71:
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("No such package: ");
      localStringBuilder.append(a.getPackageName());
      Log.e("ContentValues", localStringBuilder.toString(), str);
    }
    return null;
  }
  
  public final URL h(String paramString)
  {
    try
    {
      paramString = new URL(String.format("https://%s/%s/%s", new Object[] { "firebaseinstallations.googleapis.com", "v1", paramString }));
      return paramString;
    }
    catch (MalformedURLException paramString)
    {
      throw new s4.j(paramString.getMessage(), j.a.p);
    }
  }
  
  public final HttpURLConnection m(URL paramURL, String paramString)
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
      paramURL = (i)b.get();
      if (paramURL != null)
      {
        try
        {
          localHttpURLConnection.addRequestProperty("x-firebase-client", (String)m.a(paramURL.a()));
        }
        catch (InterruptedException paramURL) {}catch (ExecutionException paramURL)
        {
          break label134;
        }
        Thread.currentThread().interrupt();
        label134:
        Log.w("ContentValues", "Failed to get heartbeats header", paramURL);
      }
      localHttpURLConnection.addRequestProperty("X-Android-Cert", g());
      localHttpURLConnection.addRequestProperty("x-goog-api-key", paramString);
      return localHttpURLConnection;
    }
    catch (IOException paramURL)
    {
      throw new s4.j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
    }
  }
  
  public final d o(HttpURLConnection paramHttpURLConnection)
  {
    InputStream localInputStream = paramHttpURLConnection.getInputStream();
    paramHttpURLConnection = new JsonReader(new InputStreamReader(localInputStream, e));
    f.a locala = f.a();
    d.a locala1 = d.a();
    paramHttpURLConnection.beginObject();
    while (paramHttpURLConnection.hasNext())
    {
      String str = paramHttpURLConnection.nextName();
      if (str.equals("name"))
      {
        locala1.f(paramHttpURLConnection.nextString());
      }
      else if (str.equals("fid"))
      {
        locala1.c(paramHttpURLConnection.nextString());
      }
      else if (str.equals("refreshToken"))
      {
        locala1.d(paramHttpURLConnection.nextString());
      }
      else if (str.equals("authToken"))
      {
        paramHttpURLConnection.beginObject();
        while (paramHttpURLConnection.hasNext())
        {
          str = paramHttpURLConnection.nextName();
          if (str.equals("token")) {
            locala.c(paramHttpURLConnection.nextString());
          } else if (str.equals("expiresIn")) {
            locala.d(n(paramHttpURLConnection.nextString()));
          } else {
            paramHttpURLConnection.skipValue();
          }
        }
        locala1.b(locala.a());
        paramHttpURLConnection.endObject();
      }
      else
      {
        paramHttpURLConnection.skipValue();
      }
    }
    paramHttpURLConnection.endObject();
    paramHttpURLConnection.close();
    localInputStream.close();
    return locala1.e(d.b.o).a();
  }
  
  public final f q(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getInputStream();
    JsonReader localJsonReader = new JsonReader(new InputStreamReader(paramHttpURLConnection, e));
    f.a locala = f.a();
    localJsonReader.beginObject();
    while (localJsonReader.hasNext())
    {
      String str = localJsonReader.nextName();
      if (str.equals("token")) {
        locala.c(localJsonReader.nextString());
      } else if (str.equals("expiresIn")) {
        locala.d(n(localJsonReader.nextString()));
      } else {
        localJsonReader.skipValue();
      }
    }
    localJsonReader.endObject();
    localJsonReader.close();
    paramHttpURLConnection.close();
    return locala.b(f.b.o).a();
  }
  
  public final void r(HttpURLConnection paramHttpURLConnection, String paramString1, String paramString2)
  {
    t(paramHttpURLConnection, i(b(paramString1, paramString2)));
  }
  
  public final void s(HttpURLConnection paramHttpURLConnection)
  {
    t(paramHttpURLConnection, i(c()));
  }
}

/* Location:
 * Qualified Name:     v4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */