package com.google.firebase.iid;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import g;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import r.b;

public final class a
{
  public final SharedPreferences a;
  public final b b;
  
  /* Error */
  public a(android.content.Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 17	java/lang/Object:<init>	()V
    //   4: new 19	r/b
    //   7: dup
    //   8: invokespecial 20	r/b:<init>	()V
    //   11: astore_2
    //   12: aload_0
    //   13: aload_2
    //   14: putfield 22	com/google/firebase/iid/a:b	Lr/b;
    //   17: aload_1
    //   18: ldc 24
    //   20: iconst_0
    //   21: invokevirtual 30	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   24: astore_3
    //   25: aload_0
    //   26: aload_3
    //   27: putfield 32	com/google/firebase/iid/a:a	Landroid/content/SharedPreferences;
    //   30: new 34	java/io/File
    //   33: dup
    //   34: aload_1
    //   35: invokestatic 40	v/a:getNoBackupFilesDir	(Landroid/content/Context;)Ljava/io/File;
    //   38: ldc 42
    //   40: invokespecial 45	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   43: astore_1
    //   44: aload_1
    //   45: invokevirtual 49	java/io/File:exists	()Z
    //   48: ifeq +6 -> 54
    //   51: goto +130 -> 181
    //   54: aload_1
    //   55: invokevirtual 52	java/io/File:createNewFile	()Z
    //   58: ifeq +123 -> 181
    //   61: aload_0
    //   62: monitorenter
    //   63: aload_3
    //   64: invokeinterface 58 1 0
    //   69: invokeinterface 63 1 0
    //   74: istore 4
    //   76: aload_0
    //   77: monitorexit
    //   78: iload 4
    //   80: ifne +101 -> 181
    //   83: ldc 65
    //   85: ldc 67
    //   87: invokestatic 73	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;)I
    //   90: pop
    //   91: aload_0
    //   92: monitorenter
    //   93: aload_2
    //   94: invokevirtual 78	r/h:clear	()V
    //   97: aload_3
    //   98: invokeinterface 82 1 0
    //   103: invokeinterface 86 1 0
    //   108: invokeinterface 89 1 0
    //   113: pop
    //   114: aload_0
    //   115: monitorexit
    //   116: goto +65 -> 181
    //   119: astore_1
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_1
    //   123: athrow
    //   124: astore_1
    //   125: aload_0
    //   126: monitorexit
    //   127: aload_1
    //   128: athrow
    //   129: astore_1
    //   130: ldc 65
    //   132: iconst_3
    //   133: invokestatic 93	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   136: ifeq +45 -> 181
    //   139: aload_1
    //   140: invokevirtual 99	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   143: invokestatic 105	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   146: astore_1
    //   147: aload_1
    //   148: invokevirtual 109	java/lang/String:length	()I
    //   151: ifeq +13 -> 164
    //   154: ldc 111
    //   156: aload_1
    //   157: invokevirtual 115	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   160: astore_1
    //   161: goto +13 -> 174
    //   164: new 101	java/lang/String
    //   167: dup
    //   168: ldc 111
    //   170: invokespecial 118	java/lang/String:<init>	(Ljava/lang/String;)V
    //   173: astore_1
    //   174: ldc 65
    //   176: aload_1
    //   177: invokestatic 121	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   180: pop
    //   181: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	a
    //   0	182	1	paramContext	android.content.Context
    //   11	83	2	localb	b
    //   24	74	3	localSharedPreferences	SharedPreferences
    //   74	5	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   93	114	119	finally
    //   63	76	124	finally
    //   54	63	129	java/io/IOException
    //   76	78	129	java/io/IOException
    //   83	93	129	java/io/IOException
    //   114	116	129	java/io/IOException
    //   120	124	129	java/io/IOException
    //   125	129	129	java/io/IOException
  }
  
  public static String a(String paramString)
  {
    return g.f(new StringBuilder(String.valueOf(paramString).length() + 6), paramString, "|S|cre");
  }
  
  public static String b(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 4 + String.valueOf(paramString2).length() + String.valueOf(paramString3).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|T|");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("|");
    localStringBuilder.append(paramString3);
    return localStringBuilder.toString();
  }
  
  public final long c(String paramString)
  {
    long l = System.currentTimeMillis();
    Object localObject = a(paramString);
    if (!a.contains((String)localObject))
    {
      localObject = a.edit();
      ((SharedPreferences.Editor)localObject).putString(a(paramString), String.valueOf(l));
      ((SharedPreferences.Editor)localObject).commit();
      return l;
    }
    paramString = a.getString(a(paramString), null);
    if (paramString != null) {}
    try
    {
      l = Long.parseLong(paramString);
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    l = 0L;
    return l;
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
      catch (JSONException paramString1)
      {
        paramString2 = String.valueOf(paramString1);
        paramString1 = new StringBuilder(paramString2.length() + 24);
        paramString1.append("Failed to encode token: ");
        paramString1.append(paramString2);
        Log.w("FirebaseInstanceId", paramString1.toString());
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
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(paramString);
          paramString = ((JSONObject)localObject).getString("token");
          String str = ((JSONObject)localObject).getString("appVersion");
          paramString = new a(((JSONObject)localObject).getLong("timestamp"), paramString, str);
          return paramString;
        }
        catch (JSONException paramString)
        {
          paramString = String.valueOf(paramString);
          Object localObject = new StringBuilder(paramString.length() + 23);
          ((StringBuilder)localObject).append("Failed to parse token: ");
          ((StringBuilder)localObject).append(paramString);
          Log.w("FirebaseInstanceId", ((StringBuilder)localObject).toString());
          return null;
        }
      }
      return new a(0L, paramString, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */