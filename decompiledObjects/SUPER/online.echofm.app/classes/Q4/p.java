package Q4;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class p
{
  public static final Map c = new HashMap();
  public final Context a;
  public final String b;
  
  public p(Context paramContext, String paramString)
  {
    a = paramContext;
    b = paramString;
  }
  
  public static p c(Context paramContext, String paramString)
  {
    Map localMap;
    try
    {
      localMap = c;
      if (!localMap.containsKey(paramString))
      {
        p localp = new Q4/p;
        localp.<init>(paramContext, paramString);
        localMap.put(paramString, localp);
      }
    }
    finally
    {
      break label59;
    }
    paramContext = (p)localMap.get(paramString);
    return paramContext;
    label59:
    throw paramContext;
  }
  
  public Void a()
  {
    try
    {
      a.deleteFile(b);
      return null;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String b()
  {
    return b;
  }
  
  /* Error */
  public com.google.firebase.remoteconfig.internal.b d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 24	Q4/p:a	Landroid/content/Context;
    //   6: aload_0
    //   7: getfield 26	Q4/p:b	Ljava/lang/String;
    //   10: invokevirtual 61	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 67	java/io/FileInputStream:available	()I
    //   18: istore_2
    //   19: iload_2
    //   20: newarray <illegal type>
    //   22: astore_3
    //   23: aload_1
    //   24: aload_3
    //   25: iconst_0
    //   26: iload_2
    //   27: invokevirtual 71	java/io/FileInputStream:read	([BII)I
    //   30: pop
    //   31: new 73	java/lang/String
    //   34: astore 4
    //   36: aload 4
    //   38: aload_3
    //   39: ldc 75
    //   41: invokespecial 78	java/lang/String:<init>	([BLjava/lang/String;)V
    //   44: new 80	org/json/JSONObject
    //   47: astore_3
    //   48: aload_3
    //   49: aload 4
    //   51: invokespecial 83	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   54: aload_3
    //   55: invokestatic 88	com/google/firebase/remoteconfig/internal/b:b	(Lorg/json/JSONObject;)Lcom/google/firebase/remoteconfig/internal/b;
    //   58: astore 4
    //   60: aload_1
    //   61: invokevirtual 91	java/io/FileInputStream:close	()V
    //   64: aload_0
    //   65: monitorexit
    //   66: aload 4
    //   68: areturn
    //   69: astore_1
    //   70: goto +43 -> 113
    //   73: astore 4
    //   75: goto +16 -> 91
    //   78: astore 4
    //   80: aconst_null
    //   81: astore_1
    //   82: goto +9 -> 91
    //   85: astore_1
    //   86: aconst_null
    //   87: astore_1
    //   88: goto +14 -> 102
    //   91: aload_1
    //   92: ifnull +7 -> 99
    //   95: aload_1
    //   96: invokevirtual 91	java/io/FileInputStream:close	()V
    //   99: aload 4
    //   101: athrow
    //   102: aload_1
    //   103: ifnull +14 -> 117
    //   106: aload_1
    //   107: invokevirtual 91	java/io/FileInputStream:close	()V
    //   110: goto +7 -> 117
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: athrow
    //   117: aload_0
    //   118: monitorexit
    //   119: aconst_null
    //   120: areturn
    //   121: astore 4
    //   123: goto -21 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	p
    //   13	48	1	localFileInputStream	java.io.FileInputStream
    //   69	1	1	localObject1	Object
    //   81	1	1	localObject2	Object
    //   85	1	1	localJSONException1	org.json.JSONException
    //   87	29	1	localObject3	Object
    //   18	9	2	i	int
    //   22	33	3	localObject4	Object
    //   34	33	4	localObject5	Object
    //   73	1	4	localObject6	Object
    //   78	22	4	localObject7	Object
    //   121	1	4	localJSONException2	org.json.JSONException
    // Exception table:
    //   from	to	target	type
    //   60	64	69	finally
    //   95	99	69	finally
    //   99	102	69	finally
    //   106	110	69	finally
    //   14	60	73	finally
    //   2	14	78	finally
    //   2	14	85	org/json/JSONException
    //   2	14	85	java/io/FileNotFoundException
    //   14	60	121	org/json/JSONException
    //   14	60	121	java/io/FileNotFoundException
  }
  
  /* Error */
  public Void e(com.google.firebase.remoteconfig.internal.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 24	Q4/p:a	Landroid/content/Context;
    //   6: aload_0
    //   7: getfield 26	Q4/p:b	Ljava/lang/String;
    //   10: iconst_0
    //   11: invokevirtual 97	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   14: astore_2
    //   15: aload_2
    //   16: aload_1
    //   17: invokevirtual 100	com/google/firebase/remoteconfig/internal/b:toString	()Ljava/lang/String;
    //   20: ldc 75
    //   22: invokevirtual 104	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   25: invokevirtual 110	java/io/FileOutputStream:write	([B)V
    //   28: aload_2
    //   29: invokevirtual 111	java/io/FileOutputStream:close	()V
    //   32: aload_0
    //   33: monitorexit
    //   34: aconst_null
    //   35: areturn
    //   36: astore_1
    //   37: goto +10 -> 47
    //   40: astore_1
    //   41: aload_2
    //   42: invokevirtual 111	java/io/FileOutputStream:close	()V
    //   45: aload_1
    //   46: athrow
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	p
    //   0	51	1	paramb	com.google.firebase.remoteconfig.internal.b
    //   14	28	2	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   2	15	36	finally
    //   28	32	36	finally
    //   41	47	36	finally
    //   15	28	40	finally
  }
}

/* Location:
 * Qualified Name:     Q4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */