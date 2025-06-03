package O3;

import M3.g;
import java.io.File;

public class a
{
  public final File a;
  
  public a(g paramg)
  {
    a = paramg.e("com.crashlytics.settings.json");
  }
  
  public final File a()
  {
    return a;
  }
  
  /* Error */
  public org.json.JSONObject b()
  {
    // Byte code:
    //   0: invokestatic 33	E3/f:f	()LE3/f;
    //   3: ldc 35
    //   5: invokevirtual 38	E3/f:b	(Ljava/lang/String;)V
    //   8: aconst_null
    //   9: astore_1
    //   10: aconst_null
    //   11: astore_2
    //   12: aload_0
    //   13: invokevirtual 40	O3/a:a	()Ljava/io/File;
    //   16: astore_3
    //   17: aload_3
    //   18: invokevirtual 46	java/io/File:exists	()Z
    //   21: ifeq +64 -> 85
    //   24: new 48	java/io/FileInputStream
    //   27: astore_2
    //   28: aload_2
    //   29: aload_3
    //   30: invokespecial 51	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   33: aload_2
    //   34: astore_3
    //   35: aload_2
    //   36: invokestatic 57	H3/i:B	(Ljava/io/InputStream;)Ljava/lang/String;
    //   39: astore 4
    //   41: aload_2
    //   42: astore_3
    //   43: new 59	org/json/JSONObject
    //   46: astore 5
    //   48: aload_2
    //   49: astore_3
    //   50: aload 5
    //   52: aload 4
    //   54: invokespecial 61	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   57: aload 5
    //   59: astore_3
    //   60: goto +35 -> 95
    //   63: astore_2
    //   64: goto +62 -> 126
    //   67: astore 5
    //   69: goto +35 -> 104
    //   72: astore_2
    //   73: aconst_null
    //   74: astore_3
    //   75: goto +51 -> 126
    //   78: astore 5
    //   80: aconst_null
    //   81: astore_2
    //   82: goto +22 -> 104
    //   85: invokestatic 33	E3/f:f	()LE3/f;
    //   88: ldc 63
    //   90: invokevirtual 66	E3/f:i	(Ljava/lang/String;)V
    //   93: aconst_null
    //   94: astore_3
    //   95: aload_2
    //   96: ldc 68
    //   98: invokestatic 71	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   101: goto +23 -> 124
    //   104: aload_2
    //   105: astore_3
    //   106: invokestatic 33	E3/f:f	()LE3/f;
    //   109: ldc 73
    //   111: aload 5
    //   113: invokevirtual 76	E3/f:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   116: aload_2
    //   117: ldc 68
    //   119: invokestatic 71	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   122: aload_1
    //   123: astore_3
    //   124: aload_3
    //   125: areturn
    //   126: aload_3
    //   127: ldc 68
    //   129: invokestatic 71	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   132: aload_2
    //   133: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	134	0	this	a
    //   9	114	1	localObject1	Object
    //   11	38	2	localFileInputStream	java.io.FileInputStream
    //   63	1	2	localObject2	Object
    //   72	1	2	localObject3	Object
    //   81	52	2	localCloseable	java.io.Closeable
    //   16	111	3	localObject4	Object
    //   39	14	4	str	String
    //   46	12	5	localJSONObject	org.json.JSONObject
    //   67	1	5	localException1	Exception
    //   78	34	5	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   35	41	63	finally
    //   43	48	63	finally
    //   50	57	63	finally
    //   106	116	63	finally
    //   35	41	67	java/lang/Exception
    //   43	48	67	java/lang/Exception
    //   50	57	67	java/lang/Exception
    //   12	33	72	finally
    //   85	93	72	finally
    //   12	33	78	java/lang/Exception
    //   85	93	78	java/lang/Exception
  }
  
  /* Error */
  public void c(long paramLong, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: invokestatic 33	E3/f:f	()LE3/f;
    //   3: ldc 80
    //   5: invokevirtual 66	E3/f:i	(Ljava/lang/String;)V
    //   8: aload_3
    //   9: ifnull +127 -> 136
    //   12: aconst_null
    //   13: astore 4
    //   15: aconst_null
    //   16: astore 5
    //   18: aload 5
    //   20: astore 6
    //   22: aload_3
    //   23: ldc 82
    //   25: lload_1
    //   26: invokevirtual 86	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   29: pop
    //   30: aload 5
    //   32: astore 6
    //   34: new 88	java/io/FileWriter
    //   37: astore 7
    //   39: aload 5
    //   41: astore 6
    //   43: aload 7
    //   45: aload_0
    //   46: invokevirtual 40	O3/a:a	()Ljava/io/File;
    //   49: invokespecial 89	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   52: aload 7
    //   54: aload_3
    //   55: invokevirtual 93	org/json/JSONObject:toString	()Ljava/lang/String;
    //   58: invokevirtual 98	java/io/Writer:write	(Ljava/lang/String;)V
    //   61: aload 7
    //   63: invokevirtual 101	java/io/Writer:flush	()V
    //   66: aload 7
    //   68: ldc 103
    //   70: invokestatic 71	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   73: goto +63 -> 136
    //   76: astore_3
    //   77: aload 7
    //   79: astore 6
    //   81: goto +46 -> 127
    //   84: astore 6
    //   86: aload 7
    //   88: astore_3
    //   89: aload 6
    //   91: astore 7
    //   93: goto +12 -> 105
    //   96: astore_3
    //   97: goto +30 -> 127
    //   100: astore 7
    //   102: aload 4
    //   104: astore_3
    //   105: aload_3
    //   106: astore 6
    //   108: invokestatic 33	E3/f:f	()LE3/f;
    //   111: ldc 105
    //   113: aload 7
    //   115: invokevirtual 76	E3/f:e	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   118: aload_3
    //   119: ldc 103
    //   121: invokestatic 71	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   124: goto +12 -> 136
    //   127: aload 6
    //   129: ldc 103
    //   131: invokestatic 71	H3/i:f	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   134: aload_3
    //   135: athrow
    //   136: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	a
    //   0	137	1	paramLong	long
    //   0	137	3	paramJSONObject	org.json.JSONObject
    //   13	90	4	localObject1	Object
    //   16	24	5	localObject2	Object
    //   20	60	6	localObject3	Object
    //   84	6	6	localException1	Exception
    //   106	22	6	localJSONObject	org.json.JSONObject
    //   37	55	7	localObject4	Object
    //   100	14	7	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   52	66	76	finally
    //   52	66	84	java/lang/Exception
    //   22	30	96	finally
    //   34	39	96	finally
    //   43	52	96	finally
    //   108	118	96	finally
    //   22	30	100	java/lang/Exception
    //   34	39	100	java/lang/Exception
    //   43	52	100	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     O3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */