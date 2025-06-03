package com.facebook.internal.logging.monitor;

import androidx.annotation.RestrictTo;
import com.facebook.internal.logging.LoggingStore;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class MonitorLoggingStore
  implements LoggingStore
{
  public static final String PERSISTED_LOGS_FILENAME = "facebooksdk.monitoring.persistedlogs";
  private static MonitorLoggingStore monitorLoggingStore;
  
  public static MonitorLoggingStore getInstance()
  {
    try
    {
      if (monitorLoggingStore == null)
      {
        localMonitorLoggingStore = new com/facebook/internal/logging/monitor/MonitorLoggingStore;
        localMonitorLoggingStore.<init>();
        monitorLoggingStore = localMonitorLoggingStore;
      }
      MonitorLoggingStore localMonitorLoggingStore = monitorLoggingStore;
      return localMonitorLoggingStore;
    }
    finally {}
  }
  
  /* Error */
  public java.util.Collection<com.facebook.internal.logging.ExternalLog> readAndClearStore()
  {
    // Byte code:
    //   0: new 32	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 33	java/util/ArrayList:<init>	()V
    //   7: astore_1
    //   8: invokestatic 39	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   11: astore_2
    //   12: aconst_null
    //   13: astore_3
    //   14: aconst_null
    //   15: astore 4
    //   17: aload_2
    //   18: ldc 14
    //   20: invokevirtual 45	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   23: astore 5
    //   25: new 47	java/io/ObjectInputStream
    //   28: astore 6
    //   30: new 49	java/io/BufferedInputStream
    //   33: astore 7
    //   35: aload 7
    //   37: aload 5
    //   39: invokespecial 52	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   42: aload 6
    //   44: aload 7
    //   46: invokespecial 53	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   49: aload 6
    //   51: invokevirtual 57	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   54: checkcast 59	java/util/Collection
    //   57: astore 4
    //   59: aload 6
    //   61: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   64: aload_2
    //   65: ldc 14
    //   67: invokevirtual 69	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   70: invokevirtual 75	java/io/File:delete	()Z
    //   73: pop
    //   74: aload 4
    //   76: astore 6
    //   78: goto +62 -> 140
    //   81: astore_1
    //   82: aload 6
    //   84: astore 4
    //   86: aload_1
    //   87: astore 6
    //   89: aload 4
    //   91: astore_1
    //   92: goto +13 -> 105
    //   95: astore 4
    //   97: goto +25 -> 122
    //   100: astore 6
    //   102: aload 4
    //   104: astore_1
    //   105: aload_1
    //   106: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   109: aload_2
    //   110: ldc 14
    //   112: invokevirtual 69	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   115: invokevirtual 75	java/io/File:delete	()Z
    //   118: pop
    //   119: aload 6
    //   121: athrow
    //   122: aload 6
    //   124: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   127: aload_2
    //   128: ldc 14
    //   130: invokevirtual 69	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   133: invokevirtual 75	java/io/File:delete	()Z
    //   136: pop
    //   137: aload_1
    //   138: astore 6
    //   140: aload 6
    //   142: areturn
    //   143: astore 6
    //   145: aload_3
    //   146: astore 6
    //   148: goto -26 -> 122
    //   151: astore 6
    //   153: goto -79 -> 74
    //   156: astore_1
    //   157: goto -38 -> 119
    //   160: astore 6
    //   162: aload_1
    //   163: astore 6
    //   165: goto -25 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	this	MonitorLoggingStore
    //   7	1	1	localArrayList	java.util.ArrayList
    //   81	6	1	localObject1	Object
    //   91	47	1	localObject2	Object
    //   156	7	1	localException1	Exception
    //   11	117	2	localContext	android.content.Context
    //   13	133	3	localObject3	Object
    //   15	75	4	localObject4	Object
    //   95	8	4	localException2	Exception
    //   23	15	5	localFileInputStream	java.io.FileInputStream
    //   28	60	6	localObject5	Object
    //   100	23	6	localCloseable	java.io.Closeable
    //   138	3	6	localObject6	Object
    //   143	1	6	localException3	Exception
    //   146	1	6	localObject7	Object
    //   151	1	6	localException4	Exception
    //   160	1	6	localException5	Exception
    //   163	1	6	localException6	Exception
    //   33	12	7	localBufferedInputStream	java.io.BufferedInputStream
    // Exception table:
    //   from	to	target	type
    //   49	59	81	finally
    //   49	59	95	java/lang/Exception
    //   17	49	100	finally
    //   17	49	143	java/lang/Exception
    //   64	74	151	java/lang/Exception
    //   109	119	156	java/lang/Exception
    //   127	137	160	java/lang/Exception
  }
  
  /* Error */
  public void saveLogsToDisk(java.util.Collection<com.facebook.internal.logging.ExternalLog> paramCollection)
  {
    // Byte code:
    //   0: invokestatic 39	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload 4
    //   11: astore 5
    //   13: new 81	java/io/ObjectOutputStream
    //   16: astore 6
    //   18: aload 4
    //   20: astore 5
    //   22: new 83	java/io/BufferedOutputStream
    //   25: astore 7
    //   27: aload 4
    //   29: astore 5
    //   31: aload 7
    //   33: aload_2
    //   34: ldc 14
    //   36: iconst_0
    //   37: invokevirtual 87	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   40: invokespecial 90	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   43: aload 4
    //   45: astore 5
    //   47: aload 6
    //   49: aload 7
    //   51: invokespecial 91	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: aload 6
    //   56: aload_1
    //   57: invokevirtual 95	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   60: aload 6
    //   62: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   65: goto +49 -> 114
    //   68: astore_1
    //   69: aload 6
    //   71: astore 5
    //   73: goto +30 -> 103
    //   76: astore_1
    //   77: aload 6
    //   79: astore_1
    //   80: goto +7 -> 87
    //   83: astore_1
    //   84: goto +19 -> 103
    //   87: aload_1
    //   88: astore 5
    //   90: aload_2
    //   91: ldc 14
    //   93: invokevirtual 69	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   96: invokevirtual 75	java/io/File:delete	()Z
    //   99: pop
    //   100: goto +10 -> 110
    //   103: aload 5
    //   105: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   108: aload_1
    //   109: athrow
    //   110: aload_1
    //   111: invokestatic 65	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   114: return
    //   115: astore_1
    //   116: aload_3
    //   117: astore_1
    //   118: goto -31 -> 87
    //   121: astore 5
    //   123: goto -13 -> 110
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	MonitorLoggingStore
    //   0	126	1	paramCollection	java.util.Collection<com.facebook.internal.logging.ExternalLog>
    //   3	88	2	localContext	android.content.Context
    //   5	112	3	localObject1	Object
    //   7	37	4	localObject2	Object
    //   11	93	5	localObject3	Object
    //   121	1	5	localException	Exception
    //   16	62	6	localObjectOutputStream	java.io.ObjectOutputStream
    //   25	25	7	localBufferedOutputStream	java.io.BufferedOutputStream
    // Exception table:
    //   from	to	target	type
    //   54	60	68	finally
    //   54	60	76	java/lang/Exception
    //   13	18	83	finally
    //   22	27	83	finally
    //   31	43	83	finally
    //   47	54	83	finally
    //   90	100	83	finally
    //   13	18	115	java/lang/Exception
    //   22	27	115	java/lang/Exception
    //   31	43	115	java/lang/Exception
    //   47	54	115	java/lang/Exception
    //   90	100	121	java/lang/Exception
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.monitor.MonitorLoggingStore
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */