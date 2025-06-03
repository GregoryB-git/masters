package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.security.SecureRandom;
import java.util.Random;

public final class AFb1zSDK
{
  private static String values;
  
  /* Error */
  private static String AFInAppEventType(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: aload_1
    //   7: astore 4
    //   9: new 18	java/io/RandomAccessFile
    //   12: astore 5
    //   14: aload_1
    //   15: astore 4
    //   17: aload 5
    //   19: aload_0
    //   20: ldc 20
    //   22: invokespecial 23	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   25: aload_3
    //   26: astore_0
    //   27: aload 5
    //   29: invokevirtual 27	java/io/RandomAccessFile:length	()J
    //   32: l2i
    //   33: newarray <illegal type>
    //   35: astore 4
    //   37: aload 4
    //   39: astore_0
    //   40: aload 5
    //   42: aload 4
    //   44: invokevirtual 31	java/io/RandomAccessFile:readFully	([B)V
    //   47: aload 4
    //   49: astore_0
    //   50: aload 5
    //   52: invokevirtual 34	java/io/RandomAccessFile:close	()V
    //   55: aload 5
    //   57: invokevirtual 34	java/io/RandomAccessFile:close	()V
    //   60: aload 4
    //   62: astore_0
    //   63: goto +74 -> 137
    //   66: astore_0
    //   67: ldc 36
    //   69: aload_0
    //   70: invokestatic 42	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   73: aload 4
    //   75: astore_0
    //   76: goto +61 -> 137
    //   79: astore_0
    //   80: aload 5
    //   82: astore 4
    //   84: goto +76 -> 160
    //   87: astore 4
    //   89: aload 4
    //   91: astore_3
    //   92: goto +13 -> 105
    //   95: astore_0
    //   96: goto +64 -> 160
    //   99: astore_3
    //   100: aconst_null
    //   101: astore_0
    //   102: aload_2
    //   103: astore 5
    //   105: aload 5
    //   107: astore 4
    //   109: ldc 44
    //   111: aload_3
    //   112: invokestatic 42	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: aload 5
    //   117: ifnull +20 -> 137
    //   120: aload 5
    //   122: invokevirtual 34	java/io/RandomAccessFile:close	()V
    //   125: goto +12 -> 137
    //   128: astore 4
    //   130: ldc 36
    //   132: aload 4
    //   134: invokestatic 42	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: aload_0
    //   138: ifnull +6 -> 144
    //   141: goto +7 -> 148
    //   144: iconst_0
    //   145: newarray <illegal type>
    //   147: astore_0
    //   148: new 46	java/lang/String
    //   151: dup
    //   152: aload_0
    //   153: invokestatic 52	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   156: invokespecial 55	java/lang/String:<init>	([BLjava/nio/charset/Charset;)V
    //   159: areturn
    //   160: aload 4
    //   162: ifnull +20 -> 182
    //   165: aload 4
    //   167: invokevirtual 34	java/io/RandomAccessFile:close	()V
    //   170: goto +12 -> 182
    //   173: astore 4
    //   175: ldc 36
    //   177: aload 4
    //   179: invokestatic 42	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   182: aload_0
    //   183: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	184	0	paramFile	File
    //   1	14	1	localObject1	Object
    //   3	100	2	localObject2	Object
    //   5	87	3	localObject3	Object
    //   99	13	3	localIOException1	java.io.IOException
    //   7	76	4	localObject4	Object
    //   87	3	4	localIOException2	java.io.IOException
    //   107	1	4	localObject5	Object
    //   128	38	4	localIOException3	java.io.IOException
    //   173	5	4	localIOException4	java.io.IOException
    //   12	109	5	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   55	60	66	java/io/IOException
    //   27	37	79	finally
    //   40	47	79	finally
    //   50	55	79	finally
    //   27	37	87	java/io/IOException
    //   40	47	87	java/io/IOException
    //   50	55	87	java/io/IOException
    //   9	14	95	finally
    //   17	25	95	finally
    //   109	115	95	finally
    //   9	14	99	java/io/IOException
    //   17	25	99	java/io/IOException
    //   120	125	128	java/io/IOException
    //   165	170	173	java/io/IOException
  }
  
  public static String valueOf(AFb1bSDK paramAFb1bSDK, AFb1dSDK paramAFb1dSDK)
  {
    label159:
    label165:
    label191:
    try
    {
      if (AFInAppEventType == null)
      {
        paramAFb1bSDK = values;
        return paramAFb1bSDK;
      }
    }
    finally
    {
      break label191;
      if (values == null)
      {
        Object localObject = paramAFb1dSDK.values("AF_INSTALLATION", null);
        if (localObject != null)
        {
          values = (String)localObject;
        }
        else
        {
          try
          {
            localObject = new java/io/File;
            ((File)localObject).<init>(AFInAppEventType.getFilesDir(), "AF_INSTALLATION");
            if (!((File)localObject).exists())
            {
              long l = System.currentTimeMillis();
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>();
              ((StringBuilder)localObject).append(l);
              ((StringBuilder)localObject).append("-");
              paramAFb1bSDK = new java/security/SecureRandom;
              paramAFb1bSDK.<init>();
              ((StringBuilder)localObject).append(Math.abs(paramAFb1bSDK.nextLong()));
              values = localObject.toString();
            }
          }
          catch (Exception paramAFb1bSDK)
          {
            break label159;
          }
          values = AFInAppEventType((File)localObject);
          ((File)localObject).delete();
          paramAFb1dSDK.AFInAppEventParameterName("AF_INSTALLATION", values);
          break label165;
          AFLogger.afErrorLog("Error getting AF unique ID", paramAFb1bSDK);
        }
        if (values != null) {
          AppsFlyerProperties.getInstance().set("uid", values);
        }
      }
      paramAFb1bSDK = values;
      return paramAFb1bSDK;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFb1zSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */