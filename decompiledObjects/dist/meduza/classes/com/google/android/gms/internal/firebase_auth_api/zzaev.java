package com.google.android.gms.internal.firebase_auth_api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public final class zzaev
{
  /* Error */
  public static void zza(String paramString, zzaeb paramzzaeb, zzaew<?> paramzzaew, Type paramType, zzaef paramzzaef)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 22	m6/j:i	(Ljava/lang/Object;)V
    //   4: new 24	java/net/URL
    //   7: astore 5
    //   9: aload 5
    //   11: aload_0
    //   12: invokespecial 28	java/net/URL:<init>	(Ljava/lang/String;)V
    //   15: aload 5
    //   17: invokevirtual 32	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   20: checkcast 34	java/net/HttpURLConnection
    //   23: astore_0
    //   24: aload_0
    //   25: iconst_1
    //   26: invokevirtual 40	java/net/URLConnection:setDoOutput	(Z)V
    //   29: aload_1
    //   30: invokeinterface 45 1 0
    //   35: invokestatic 51	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   38: invokevirtual 57	java/lang/String:getBytes	(Ljava/nio/charset/Charset;)[B
    //   41: astore 5
    //   43: aload_0
    //   44: aload 5
    //   46: arraylength
    //   47: invokevirtual 61	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   50: aload_0
    //   51: ldc 63
    //   53: ldc 65
    //   55: invokevirtual 69	java/net/URLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: aload_0
    //   59: ldc 70
    //   61: invokevirtual 73	java/net/URLConnection:setConnectTimeout	(I)V
    //   64: aload 4
    //   66: aload_0
    //   67: invokevirtual 78	com/google/android/gms/internal/firebase_auth_api/zzaef:zza	(Ljava/net/URLConnection;)V
    //   70: new 80	java/io/BufferedOutputStream
    //   73: astore_1
    //   74: aload_1
    //   75: aload_0
    //   76: invokevirtual 84	java/net/URLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   79: aload 5
    //   81: arraylength
    //   82: invokespecial 87	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   85: aload_1
    //   86: aload 5
    //   88: iconst_0
    //   89: aload 5
    //   91: arraylength
    //   92: invokevirtual 93	java/io/OutputStream:write	([BII)V
    //   95: aload_1
    //   96: invokevirtual 97	java/io/OutputStream:close	()V
    //   99: aload_0
    //   100: aload_2
    //   101: aload_3
    //   102: invokestatic 100	com/google/android/gms/internal/firebase_auth_api/zzaev:zza	(Ljava/net/HttpURLConnection;Lcom/google/android/gms/internal/firebase-auth-api/zzaew;Ljava/lang/reflect/Type;)V
    //   105: return
    //   106: astore_0
    //   107: aload_1
    //   108: invokevirtual 97	java/io/OutputStream:close	()V
    //   111: goto +9 -> 120
    //   114: astore_1
    //   115: aload_0
    //   116: aload_1
    //   117: invokevirtual 106	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   120: aload_0
    //   121: athrow
    //   122: astore_0
    //   123: goto +8 -> 131
    //   126: astore_0
    //   127: goto +4 -> 131
    //   130: astore_0
    //   131: aload_0
    //   132: invokevirtual 109	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   135: astore_0
    //   136: goto +14 -> 150
    //   139: astore_0
    //   140: ldc 111
    //   142: astore_0
    //   143: goto +7 -> 150
    //   146: astore_0
    //   147: ldc 113
    //   149: astore_0
    //   150: aload_2
    //   151: aload_0
    //   152: invokeinterface 117 2 0
    //   157: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	paramString	String
    //   0	158	1	paramzzaeb	zzaeb
    //   0	158	2	paramzzaew	zzaew<?>
    //   0	158	3	paramType	Type
    //   0	158	4	paramzzaef	zzaef
    //   7	83	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   85	95	106	finally
    //   107	111	114	finally
    //   0	85	122	java/lang/NullPointerException
    //   95	105	122	java/lang/NullPointerException
    //   115	120	122	java/lang/NullPointerException
    //   120	122	122	java/lang/NullPointerException
    //   0	85	126	org/json/JSONException
    //   95	105	126	org/json/JSONException
    //   115	120	126	org/json/JSONException
    //   120	122	126	org/json/JSONException
    //   0	85	130	java/io/IOException
    //   95	105	130	java/io/IOException
    //   115	120	130	java/io/IOException
    //   120	122	130	java/io/IOException
    //   0	85	139	java/net/UnknownHostException
    //   95	105	139	java/net/UnknownHostException
    //   115	120	139	java/net/UnknownHostException
    //   120	122	139	java/net/UnknownHostException
    //   0	85	146	java/net/SocketTimeoutException
    //   95	105	146	java/net/SocketTimeoutException
    //   115	120	146	java/net/SocketTimeoutException
    //   120	122	146	java/net/SocketTimeoutException
  }
  
  public static void zza(String paramString, zzaew<?> paramzzaew, Type paramType, zzaef paramzzaef)
  {
    try
    {
      URL localURL = new java/net/URL;
      localURL.<init>(paramString);
      paramString = (HttpURLConnection)localURL.openConnection();
      paramString.setConnectTimeout(60000);
      paramzzaef.zza(paramString);
      zza(paramString, paramzzaew, paramType);
      return;
    }
    catch (IOException paramString)
    {
      paramString = paramString.getMessage();
      paramzzaew.zza(paramString);
      return;
    }
    catch (UnknownHostException paramString)
    {
      for (;;)
      {
        paramString = "<<Network Error>>";
      }
    }
    catch (SocketTimeoutException paramString)
    {
      for (;;)
      {
        paramString = "TIMEOUT";
      }
    }
  }
  
  /* Error */
  private static void zza(HttpURLConnection paramHttpURLConnection, zzaew<?> paramzzaew, Type paramType)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 128	java/net/HttpURLConnection:getResponseCode	()I
    //   4: istore_3
    //   5: iload_3
    //   6: invokestatic 131	com/google/android/gms/internal/firebase_auth_api/zzaev:zza	(I)Z
    //   9: ifeq +12 -> 21
    //   12: aload_0
    //   13: invokevirtual 135	java/net/URLConnection:getInputStream	()Ljava/io/InputStream;
    //   16: astore 4
    //   18: goto +9 -> 27
    //   21: aload_0
    //   22: invokevirtual 138	java/net/HttpURLConnection:getErrorStream	()Ljava/io/InputStream;
    //   25: astore 4
    //   27: new 140	java/lang/StringBuilder
    //   30: astore 5
    //   32: aload 5
    //   34: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   37: new 144	java/io/BufferedReader
    //   40: astore 6
    //   42: new 146	java/io/InputStreamReader
    //   45: astore 7
    //   47: aload 7
    //   49: aload 4
    //   51: ldc -108
    //   53: invokespecial 151	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   56: aload 6
    //   58: aload 7
    //   60: invokespecial 154	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   63: aload 6
    //   65: invokevirtual 157	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   68: astore 4
    //   70: aload 4
    //   72: ifnull +14 -> 86
    //   75: aload 5
    //   77: aload 4
    //   79: invokevirtual 161	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: goto -20 -> 63
    //   86: aload 6
    //   88: invokevirtual 162	java/io/BufferedReader:close	()V
    //   91: aload 5
    //   93: invokevirtual 165	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   96: astore 4
    //   98: iload_3
    //   99: invokestatic 131	com/google/android/gms/internal/firebase_auth_api/zzaev:zza	(I)Z
    //   102: ifne +22 -> 124
    //   105: aload_1
    //   106: aload 4
    //   108: ldc 53
    //   110: invokestatic 170	com/google/android/gms/internal/firebase_auth_api/zzady:zza	(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   113: checkcast 53	java/lang/String
    //   116: invokeinterface 117 2 0
    //   121: goto +18 -> 139
    //   124: aload_1
    //   125: aload 4
    //   127: aload_2
    //   128: invokestatic 170	com/google/android/gms/internal/firebase_auth_api/zzady:zza	(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    //   131: checkcast 172	com/google/android/gms/internal/firebase_auth_api/zzaea
    //   134: invokeinterface 176 2 0
    //   139: aload_0
    //   140: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
    //   143: return
    //   144: astore_2
    //   145: aload 6
    //   147: invokevirtual 162	java/io/BufferedReader:close	()V
    //   150: goto +11 -> 161
    //   153: astore 4
    //   155: aload_2
    //   156: aload 4
    //   158: invokevirtual 106	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   161: aload_2
    //   162: athrow
    //   163: astore_1
    //   164: goto +37 -> 201
    //   167: astore_2
    //   168: goto +4 -> 172
    //   171: astore_2
    //   172: aload_1
    //   173: aload_2
    //   174: invokevirtual 109	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   177: invokeinterface 117 2 0
    //   182: aload_0
    //   183: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
    //   186: return
    //   187: astore_2
    //   188: aload_1
    //   189: ldc 113
    //   191: invokeinterface 117 2 0
    //   196: aload_0
    //   197: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
    //   200: return
    //   201: aload_0
    //   202: invokevirtual 179	java/net/HttpURLConnection:disconnect	()V
    //   205: aload_1
    //   206: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	paramHttpURLConnection	HttpURLConnection
    //   0	207	1	paramzzaew	zzaew<?>
    //   0	207	2	paramType	Type
    //   4	95	3	i	int
    //   16	110	4	localObject	Object
    //   153	4	4	localThrowable	Throwable
    //   30	62	5	localStringBuilder	StringBuilder
    //   40	106	6	localBufferedReader	java.io.BufferedReader
    //   45	14	7	localInputStreamReader	java.io.InputStreamReader
    // Exception table:
    //   from	to	target	type
    //   63	70	144	finally
    //   75	83	144	finally
    //   145	150	153	finally
    //   0	18	163	finally
    //   21	27	163	finally
    //   27	63	163	finally
    //   86	121	163	finally
    //   124	139	163	finally
    //   155	161	163	finally
    //   161	163	163	finally
    //   172	182	163	finally
    //   188	196	163	finally
    //   0	18	167	com/google/android/gms/internal/firebase_auth_api/zzabr
    //   21	27	167	com/google/android/gms/internal/firebase_auth_api/zzabr
    //   27	63	167	com/google/android/gms/internal/firebase_auth_api/zzabr
    //   86	121	167	com/google/android/gms/internal/firebase_auth_api/zzabr
    //   124	139	167	com/google/android/gms/internal/firebase_auth_api/zzabr
    //   155	161	167	com/google/android/gms/internal/firebase_auth_api/zzabr
    //   161	163	167	com/google/android/gms/internal/firebase_auth_api/zzabr
    //   0	18	171	java/io/IOException
    //   21	27	171	java/io/IOException
    //   27	63	171	java/io/IOException
    //   86	121	171	java/io/IOException
    //   124	139	171	java/io/IOException
    //   155	161	171	java/io/IOException
    //   161	163	171	java/io/IOException
    //   0	18	187	java/net/SocketTimeoutException
    //   21	27	187	java/net/SocketTimeoutException
    //   27	63	187	java/net/SocketTimeoutException
    //   86	121	187	java/net/SocketTimeoutException
    //   124	139	187	java/net/SocketTimeoutException
    //   155	161	187	java/net/SocketTimeoutException
    //   161	163	187	java/net/SocketTimeoutException
  }
  
  private static final boolean zza(int paramInt)
  {
    return (paramInt >= 200) && (paramInt < 300);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaev
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */