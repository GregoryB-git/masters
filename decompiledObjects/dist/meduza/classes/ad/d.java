package ad;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import java.io.File;
import v.b;

public final class d
{
  public static final d a = new d();
  
  public static Intent a(Context paramContext, String paramString, File paramFile)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    if (Build.VERSION.SDK_INT >= 24)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramContext.getPackageName());
      localStringBuilder.append(".flutter_downloader.provider");
      paramContext = b.getUriForFile(paramContext, localStringBuilder.toString(), paramFile);
    }
    else
    {
      paramContext = Uri.fromFile(paramFile);
    }
    localIntent.setDataAndType(paramContext, paramString);
    localIntent.setFlags(268435456);
    localIntent.addFlags(1);
    return localIntent;
  }
  
  /* Error */
  public final Intent b(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_2
    //   3: ldc 79
    //   5: invokestatic 85	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   8: new 87	java/io/File
    //   11: astore 4
    //   13: aload 4
    //   15: aload_2
    //   16: invokespecial 88	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: aload_3
    //   21: aload 4
    //   23: invokestatic 90	ad/d:a	(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/content/Intent;
    //   26: astore_3
    //   27: aload_1
    //   28: invokevirtual 94	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   31: astore 5
    //   33: iconst_0
    //   34: istore 6
    //   36: aload 5
    //   38: aload_3
    //   39: iconst_0
    //   40: invokevirtual 100	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
    //   43: astore 5
    //   45: aload 5
    //   47: ldc 102
    //   49: invokestatic 105	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   52: aload 5
    //   54: invokeinterface 111 1 0
    //   59: istore 7
    //   61: iload 7
    //   63: ifle +9 -> 72
    //   66: iconst_1
    //   67: istore 7
    //   69: goto +6 -> 75
    //   72: iconst_0
    //   73: istore 7
    //   75: iload 7
    //   77: ifeq +7 -> 84
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_3
    //   83: areturn
    //   84: aconst_null
    //   85: astore_3
    //   86: new 113	java/io/FileInputStream
    //   89: astore 5
    //   91: aload 5
    //   93: aload_2
    //   94: invokespecial 114	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   97: aload 5
    //   99: astore_3
    //   100: aload 5
    //   102: invokestatic 120	java/net/URLConnection:guessContentTypeFromStream	(Ljava/io/InputStream;)Ljava/lang/String;
    //   105: astore 8
    //   107: aload 5
    //   109: invokevirtual 123	java/io/FileInputStream:close	()V
    //   112: aload 8
    //   114: astore_3
    //   115: goto +60 -> 175
    //   118: astore_3
    //   119: aload_3
    //   120: invokevirtual 128	java/lang/Throwable:printStackTrace	()V
    //   123: aload 8
    //   125: astore_3
    //   126: goto +49 -> 175
    //   129: astore_1
    //   130: goto +121 -> 251
    //   133: astore 8
    //   135: goto +12 -> 147
    //   138: astore_1
    //   139: goto +112 -> 251
    //   142: astore 8
    //   144: aconst_null
    //   145: astore 5
    //   147: aload 5
    //   149: astore_3
    //   150: aload 8
    //   152: invokevirtual 128	java/lang/Throwable:printStackTrace	()V
    //   155: aload 5
    //   157: ifnull +16 -> 173
    //   160: aload 5
    //   162: invokevirtual 123	java/io/FileInputStream:close	()V
    //   165: goto +8 -> 173
    //   168: astore_3
    //   169: aload_3
    //   170: invokevirtual 128	java/lang/Throwable:printStackTrace	()V
    //   173: aconst_null
    //   174: astore_3
    //   175: aload_3
    //   176: astore 5
    //   178: aload_3
    //   179: ifnonnull +9 -> 188
    //   182: aload_2
    //   183: invokestatic 132	java/net/URLConnection:guessContentTypeFromName	(Ljava/lang/String;)Ljava/lang/String;
    //   186: astore 5
    //   188: aload 5
    //   190: ifnull +57 -> 247
    //   193: aload_1
    //   194: aload 5
    //   196: aload 4
    //   198: invokestatic 90	ad/d:a	(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/content/Intent;
    //   201: astore_2
    //   202: aload_1
    //   203: invokevirtual 94	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   206: aload_2
    //   207: iconst_0
    //   208: invokevirtual 100	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
    //   211: astore_1
    //   212: aload_1
    //   213: ldc 102
    //   215: invokestatic 105	ec/i:d	(Ljava/lang/Object;Ljava/lang/String;)V
    //   218: aload_1
    //   219: invokeinterface 111 1 0
    //   224: istore 9
    //   226: iload 6
    //   228: istore 7
    //   230: iload 9
    //   232: ifle +6 -> 238
    //   235: iconst_1
    //   236: istore 7
    //   238: iload 7
    //   240: ifeq +7 -> 247
    //   243: aload_0
    //   244: monitorexit
    //   245: aload_2
    //   246: areturn
    //   247: aload_0
    //   248: monitorexit
    //   249: aconst_null
    //   250: areturn
    //   251: aload_3
    //   252: ifnull +15 -> 267
    //   255: aload_3
    //   256: invokevirtual 123	java/io/FileInputStream:close	()V
    //   259: goto +8 -> 267
    //   262: astore_2
    //   263: aload_2
    //   264: invokevirtual 128	java/lang/Throwable:printStackTrace	()V
    //   267: aload_1
    //   268: athrow
    //   269: astore_1
    //   270: aload_0
    //   271: monitorexit
    //   272: aload_1
    //   273: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	this	d
    //   0	274	1	paramContext	Context
    //   0	274	2	paramString1	String
    //   0	274	3	paramString2	String
    //   11	186	4	localFile	File
    //   31	164	5	localObject	Object
    //   34	193	6	i	int
    //   59	180	7	j	int
    //   105	19	8	str	String
    //   133	1	8	localException1	Exception
    //   142	9	8	localException2	Exception
    //   224	7	9	k	int
    // Exception table:
    //   from	to	target	type
    //   107	112	118	java/io/IOException
    //   100	107	129	finally
    //   150	155	129	finally
    //   100	107	133	java/lang/Exception
    //   86	97	138	finally
    //   86	97	142	java/lang/Exception
    //   160	165	168	java/io/IOException
    //   255	259	262	java/io/IOException
    //   2	33	269	finally
    //   36	61	269	finally
    //   107	112	269	finally
    //   119	123	269	finally
    //   160	165	269	finally
    //   169	173	269	finally
    //   182	188	269	finally
    //   193	226	269	finally
    //   255	259	269	finally
    //   263	267	269	finally
    //   267	269	269	finally
  }
}

/* Location:
 * Qualified Name:     ad.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */