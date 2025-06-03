package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public final SharedPreferences a;
  
  /* Error */
  public a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 15	java/lang/Object:<init>	()V
    //   4: aload_1
    //   5: ldc 17
    //   7: iconst_0
    //   8: invokevirtual 23	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   11: astore_2
    //   12: aload_0
    //   13: aload_2
    //   14: putfield 25	com/google/firebase/messaging/a:a	Landroid/content/SharedPreferences;
    //   17: new 27	java/io/File
    //   20: dup
    //   21: aload_1
    //   22: invokestatic 33	v/a:getNoBackupFilesDir	(Landroid/content/Context;)Ljava/io/File;
    //   25: ldc 35
    //   27: invokespecial 38	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   30: astore_1
    //   31: aload_1
    //   32: invokevirtual 42	java/io/File:exists	()Z
    //   35: ifeq +6 -> 41
    //   38: goto +107 -> 145
    //   41: aload_1
    //   42: invokevirtual 45	java/io/File:createNewFile	()Z
    //   45: ifeq +100 -> 145
    //   48: aload_0
    //   49: monitorenter
    //   50: aload_2
    //   51: invokeinterface 51 1 0
    //   56: invokeinterface 56 1 0
    //   61: istore_3
    //   62: aload_0
    //   63: monitorexit
    //   64: iload_3
    //   65: ifne +80 -> 145
    //   68: ldc 58
    //   70: ldc 60
    //   72: invokestatic 66	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   75: pop
    //   76: aload_0
    //   77: monitorenter
    //   78: aload_2
    //   79: invokeinterface 70 1 0
    //   84: invokeinterface 75 1 0
    //   89: invokeinterface 78 1 0
    //   94: pop
    //   95: aload_0
    //   96: monitorexit
    //   97: goto +48 -> 145
    //   100: astore_1
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_1
    //   104: athrow
    //   105: astore_1
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_1
    //   109: athrow
    //   110: astore_2
    //   111: ldc 58
    //   113: iconst_3
    //   114: invokestatic 82	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   117: ifeq +28 -> 145
    //   120: ldc 84
    //   122: invokestatic 90	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: astore_1
    //   126: aload_1
    //   127: aload_2
    //   128: invokevirtual 96	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   131: invokevirtual 101	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: ldc 58
    //   137: aload_1
    //   138: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokestatic 107	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   144: pop
    //   145: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	this	a
    //   0	146	1	paramContext	android.content.Context
    //   11	68	2	localSharedPreferences	SharedPreferences
    //   110	18	2	localIOException	java.io.IOException
    //   61	4	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   78	95	100	finally
    //   50	62	105	finally
    //   41	50	110	java/io/IOException
    //   62	64	110	java/io/IOException
    //   68	78	110	java/io/IOException
    //   95	97	110	java/io/IOException
    //   101	105	110	java/io/IOException
    //   106	110	110	java/io/IOException
  }
  
  public static String a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|T|");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("|");
    localStringBuilder.append("*");
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public static final long d = TimeUnit.DAYS.toMillis(7L);
    public final String a;
    public final String b;
    public final long c;
    
    public a(long paramLong, String paramString1, String paramString2)
    {
      a = paramString1;
      b = paramString2;
      c = paramLong;
    }
    
    public static String a(long paramLong, String paramString1, String paramString2)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("token", paramString1);
        localJSONObject.put("appVersion", paramString2);
        localJSONObject.put("timestamp", paramLong);
        paramString1 = localJSONObject.toString();
        return paramString1;
      }
      catch (JSONException paramString2)
      {
        paramString1 = new StringBuilder();
        paramString1.append("Failed to encode token: ");
        paramString1.append(paramString2);
        Log.w("FirebaseMessaging", paramString1.toString());
      }
      return null;
    }
    
    public static a b(String paramString)
    {
      if (TextUtils.isEmpty(paramString)) {
        return null;
      }
      if (paramString.startsWith("{")) {
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(paramString);
          paramString = localJSONObject.getString("token");
          String str = localJSONObject.getString("appVersion");
          paramString = new a(localJSONObject.getLong("timestamp"), paramString, str);
          return paramString;
        }
        catch (JSONException localJSONException)
        {
          paramString = new StringBuilder();
          paramString.append("Failed to parse token: ");
          paramString.append(localJSONException);
          Log.w("FirebaseMessaging", paramString.toString());
          return null;
        }
      }
      return new a(0L, paramString, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */