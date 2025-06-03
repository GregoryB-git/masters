package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
public final class AFa1hSDK
  implements AFa1bSDK
{
  private final AFb1bSDK values;
  
  public AFa1hSDK() {}
  
  public AFa1hSDK(AFb1bSDK paramAFb1bSDK)
  {
    values = paramAFb1bSDK;
  }
  
  public static AFa1ySDK AFInAppEventType(Context paramContext)
  {
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
      AFa1wSDK localAFa1wSDK = new AFa1wSDK((byte)0);
      Object localObject1 = new Intent("com.google.android.gms.ads.identifier.service.START");
      ((Intent)localObject1).setPackage("com.google.android.gms");
      Object localObject3;
      try
      {
        if (paramContext.bindService((Intent)localObject1, localAFa1wSDK, 1))
        {
          AFa1xSDK localAFa1xSDK = new com/appsflyer/internal/AFa1hSDK$AFa1xSDK;
          if (!AFKeystoreWrapper)
          {
            AFKeystoreWrapper = true;
            localObject1 = (IBinder)AFInAppEventType.poll(10L, TimeUnit.SECONDS);
            if (localObject1 != null)
            {
              localAFa1xSDK.<init>((IBinder)localObject1);
              localObject1 = new AFa1ySDK(localAFa1xSDK.AFInAppEventParameterName(), localAFa1xSDK.values());
              paramContext.unbindService(localAFa1wSDK);
              return (AFa1ySDK)localObject1;
            }
          }
        }
      }
      finally
      {
        break label164;
        localObject3 = new java/util/concurrent/TimeoutException;
        ((TimeoutException)localObject3).<init>("Timed out waiting for the service connection");
        throw ((Throwable)localObject3);
        localObject3 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject3).<init>("Cannot call get on this connection more than once");
        throw ((Throwable)localObject3);
        paramContext.unbindService(localAFa1wSDK);
        throw new IOException("Google Play connection failed");
        label164:
        paramContext.unbindService(localAFa1wSDK);
      }
    }
    throw new IllegalStateException("Cannot be called from the main thread");
  }
  
  /* Error */
  private static AFa1rSDK valueOf(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 134	java/io/InputStreamReader
    //   5: astore_2
    //   6: new 136	java/io/FileInputStream
    //   9: astore_3
    //   10: aload_3
    //   11: aload_0
    //   12: invokespecial 139	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: aload_2
    //   16: aload_3
    //   17: invokestatic 145	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   20: invokespecial 148	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   23: aload_2
    //   24: astore_1
    //   25: aload_0
    //   26: invokevirtual 154	java/io/File:length	()J
    //   29: l2i
    //   30: newarray <illegal type>
    //   32: astore 4
    //   34: aload_2
    //   35: astore_1
    //   36: aload_2
    //   37: aload 4
    //   39: invokevirtual 160	java/io/Reader:read	([C)I
    //   42: pop
    //   43: aload_2
    //   44: astore_1
    //   45: new 162	com/appsflyer/internal/AFa1rSDK
    //   48: astore_3
    //   49: aload_2
    //   50: astore_1
    //   51: aload_3
    //   52: aload 4
    //   54: invokespecial 165	com/appsflyer/internal/AFa1rSDK:<init>	([C)V
    //   57: aload_2
    //   58: astore_1
    //   59: aload_3
    //   60: aload_0
    //   61: invokevirtual 168	java/io/File:getName	()Ljava/lang/String;
    //   64: putfield 171	com/appsflyer/internal/AFa1rSDK:AFInAppEventParameterName	Ljava/lang/String;
    //   67: aload_2
    //   68: invokevirtual 174	java/io/Reader:close	()V
    //   71: goto +10 -> 81
    //   74: astore_0
    //   75: ldc -80
    //   77: aload_0
    //   78: invokestatic 182	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   81: aload_3
    //   82: areturn
    //   83: astore_0
    //   84: goto +46 -> 130
    //   87: astore_1
    //   88: aload_2
    //   89: astore_0
    //   90: aload_1
    //   91: astore_2
    //   92: goto +10 -> 102
    //   95: astore_0
    //   96: goto +34 -> 130
    //   99: astore_2
    //   100: aconst_null
    //   101: astore_0
    //   102: aload_0
    //   103: astore_1
    //   104: ldc -72
    //   106: aload_2
    //   107: invokestatic 182	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   110: aload_0
    //   111: ifnull +17 -> 128
    //   114: aload_0
    //   115: invokevirtual 174	java/io/Reader:close	()V
    //   118: goto +10 -> 128
    //   121: astore_0
    //   122: ldc -80
    //   124: aload_0
    //   125: invokestatic 182	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   128: aconst_null
    //   129: areturn
    //   130: aload_1
    //   131: ifnull +17 -> 148
    //   134: aload_1
    //   135: invokevirtual 174	java/io/Reader:close	()V
    //   138: goto +10 -> 148
    //   141: astore_1
    //   142: ldc -80
    //   144: aload_1
    //   145: invokestatic 182	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   148: aload_0
    //   149: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	150	0	paramFile	File
    //   1	58	1	localObject1	Object
    //   87	4	1	localException1	Exception
    //   103	32	1	localFile	File
    //   141	4	1	localIOException	IOException
    //   5	87	2	localObject2	Object
    //   99	8	2	localException2	Exception
    //   9	73	3	localObject3	Object
    //   32	21	4	arrayOfChar	char[]
    // Exception table:
    //   from	to	target	type
    //   67	71	74	java/io/IOException
    //   25	34	83	finally
    //   36	43	83	finally
    //   45	49	83	finally
    //   51	57	83	finally
    //   59	67	83	finally
    //   104	110	83	finally
    //   25	34	87	java/lang/Exception
    //   36	43	87	java/lang/Exception
    //   45	49	87	java/lang/Exception
    //   51	57	87	java/lang/Exception
    //   59	67	87	java/lang/Exception
    //   2	23	95	finally
    //   2	23	99	java/lang/Exception
    //   114	118	121	java/io/IOException
    //   134	138	141	java/io/IOException
  }
  
  public final void AFInAppEventType()
  {
    try
    {
      File localFile1 = new java/io/File;
      localFile1.<init>(values.AFInAppEventType.getFilesDir(), "AFRequestCache");
      if (!localFile1.exists())
      {
        localFile1.mkdir();
        return;
      }
    }
    catch (Exception localException)
    {
      break label145;
      File[] arrayOfFile = localException.listFiles();
      if (arrayOfFile == null) {
        return;
      }
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        File localFile2 = arrayOfFile[j];
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("CACHE: Found cached request");
        localStringBuilder.append(localFile2.getName());
        AFLogger.afInfoLog(localStringBuilder.toString());
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("CACHE: Deleting ");
        localStringBuilder.append(localFile2.getName());
        localStringBuilder.append(" from cache");
        AFLogger.afInfoLog(localStringBuilder.toString());
        localFile2.delete();
      }
      return;
      label145:
      AFLogger.afErrorLog("CACHE: Could not cache request", arrayOfFile);
    }
  }
  
  /* Error */
  public final String valueOf(AFa1rSDK paramAFa1rSDK)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 150	java/io/File
    //   5: astore_3
    //   6: aload_3
    //   7: aload_0
    //   8: getfield 26	com/appsflyer/internal/AFa1hSDK:values	Lcom/appsflyer/internal/AFb1bSDK;
    //   11: getfield 189	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   14: invokevirtual 193	android/content/Context:getFilesDir	()Ljava/io/File;
    //   17: ldc -61
    //   19: invokespecial 198	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   22: aload_3
    //   23: invokevirtual 201	java/io/File:exists	()Z
    //   26: ifne +20 -> 46
    //   29: aload_3
    //   30: invokevirtual 204	java/io/File:mkdir	()Z
    //   33: pop
    //   34: aconst_null
    //   35: areturn
    //   36: astore_1
    //   37: goto +340 -> 377
    //   40: astore_3
    //   41: aconst_null
    //   42: astore_1
    //   43: goto +305 -> 348
    //   46: aload_3
    //   47: invokevirtual 208	java/io/File:listFiles	()[Ljava/io/File;
    //   50: astore_3
    //   51: aload_3
    //   52: ifnull +17 -> 69
    //   55: aload_3
    //   56: arraylength
    //   57: bipush 40
    //   59: if_icmple +10 -> 69
    //   62: ldc -18
    //   64: invokestatic 223	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   67: aconst_null
    //   68: areturn
    //   69: new 210	java/lang/StringBuilder
    //   72: astore_3
    //   73: aload_3
    //   74: ldc -16
    //   76: invokespecial 213	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   79: aload_3
    //   80: aload_1
    //   81: getfield 242	com/appsflyer/internal/AFa1rSDK:valueOf	Ljava/lang/String;
    //   84: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: aload_3
    //   89: invokevirtual 220	java/lang/Object:toString	()Ljava/lang/String;
    //   92: invokestatic 223	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   95: invokestatic 247	java/lang/System:currentTimeMillis	()J
    //   98: invokestatic 252	java/lang/Long:toString	(J)Ljava/lang/String;
    //   101: astore 4
    //   103: new 150	java/io/File
    //   106: astore_3
    //   107: new 150	java/io/File
    //   110: astore 5
    //   112: aload 5
    //   114: aload_0
    //   115: getfield 26	com/appsflyer/internal/AFa1hSDK:values	Lcom/appsflyer/internal/AFb1bSDK;
    //   118: getfield 189	com/appsflyer/internal/AFb1bSDK:AFInAppEventType	Landroid/content/Context;
    //   121: invokevirtual 193	android/content/Context:getFilesDir	()Ljava/io/File;
    //   124: ldc -61
    //   126: invokespecial 198	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   129: aload_3
    //   130: aload 5
    //   132: aload 4
    //   134: invokespecial 198	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   137: aload_3
    //   138: invokevirtual 255	java/io/File:createNewFile	()Z
    //   141: pop
    //   142: new 257	java/io/FileOutputStream
    //   145: astore 5
    //   147: aload 5
    //   149: aload_3
    //   150: invokevirtual 260	java/io/File:getPath	()Ljava/lang/String;
    //   153: iconst_1
    //   154: invokespecial 261	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   157: new 263	java/io/OutputStreamWriter
    //   160: dup
    //   161: aload 5
    //   163: invokestatic 145	java/nio/charset/Charset:defaultCharset	()Ljava/nio/charset/Charset;
    //   166: invokespecial 266	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   169: astore_3
    //   170: aload_3
    //   171: astore_2
    //   172: aload_3
    //   173: ldc_w 268
    //   176: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   179: aload_3
    //   180: astore_2
    //   181: aload_3
    //   182: aload_1
    //   183: getfield 275	com/appsflyer/internal/AFa1rSDK:AFKeystoreWrapper	Ljava/lang/String;
    //   186: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   189: aload_3
    //   190: astore_2
    //   191: aload_3
    //   192: bipush 10
    //   194: invokevirtual 278	java/io/Writer:write	(I)V
    //   197: aload_3
    //   198: astore_2
    //   199: aload_3
    //   200: ldc_w 280
    //   203: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   206: aload_3
    //   207: astore_2
    //   208: aload_3
    //   209: aload_1
    //   210: getfield 242	com/appsflyer/internal/AFa1rSDK:valueOf	Ljava/lang/String;
    //   213: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   216: aload_3
    //   217: astore_2
    //   218: aload_3
    //   219: bipush 10
    //   221: invokevirtual 278	java/io/Writer:write	(I)V
    //   224: aload_3
    //   225: astore_2
    //   226: aload_3
    //   227: ldc_w 282
    //   230: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   233: aload_3
    //   234: astore_2
    //   235: aload_3
    //   236: aload_1
    //   237: invokevirtual 285	com/appsflyer/internal/AFa1rSDK:AFInAppEventType	()[B
    //   240: iconst_2
    //   241: invokestatic 291	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   244: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   247: aload_3
    //   248: astore_2
    //   249: aload_3
    //   250: bipush 10
    //   252: invokevirtual 278	java/io/Writer:write	(I)V
    //   255: aload_3
    //   256: astore_2
    //   257: aload_1
    //   258: getfield 294	com/appsflyer/internal/AFa1rSDK:AFInAppEventType	Lcom/appsflyer/internal/AFd1vSDK;
    //   261: astore_1
    //   262: aload_1
    //   263: ifnull +45 -> 308
    //   266: aload_3
    //   267: astore_2
    //   268: aload_3
    //   269: ldc_w 296
    //   272: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   275: aload_3
    //   276: astore_2
    //   277: aload_3
    //   278: aload_1
    //   279: invokevirtual 301	java/lang/Enum:name	()Ljava/lang/String;
    //   282: invokevirtual 273	java/io/Writer:write	(Ljava/lang/String;)V
    //   285: aload_3
    //   286: astore_2
    //   287: aload_3
    //   288: bipush 10
    //   290: invokevirtual 278	java/io/Writer:write	(I)V
    //   293: goto +15 -> 308
    //   296: astore_1
    //   297: goto +80 -> 377
    //   300: astore_2
    //   301: aload_3
    //   302: astore_1
    //   303: aload_2
    //   304: astore_3
    //   305: goto +43 -> 348
    //   308: aload_3
    //   309: astore_2
    //   310: aload_3
    //   311: invokevirtual 304	java/io/Writer:flush	()V
    //   314: aload_3
    //   315: astore_2
    //   316: ldc_w 306
    //   319: aload 4
    //   321: invokestatic 311	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   324: invokevirtual 315	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   327: invokestatic 223	com/appsflyer/AFLogger:afInfoLog	(Ljava/lang/String;)V
    //   330: aload_3
    //   331: invokevirtual 316	java/io/Writer:close	()V
    //   334: goto +11 -> 345
    //   337: astore_1
    //   338: ldc_w 318
    //   341: aload_1
    //   342: invokestatic 182	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   345: aload 4
    //   347: areturn
    //   348: aload_1
    //   349: astore_2
    //   350: ldc -24
    //   352: aload_3
    //   353: invokestatic 235	com/appsflyer/AFLogger:afErrorLog	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   356: aload_1
    //   357: ifnull +18 -> 375
    //   360: aload_1
    //   361: invokevirtual 316	java/io/Writer:close	()V
    //   364: goto +11 -> 375
    //   367: astore_1
    //   368: ldc_w 318
    //   371: aload_1
    //   372: invokestatic 182	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   375: aconst_null
    //   376: areturn
    //   377: aload_2
    //   378: ifnull +18 -> 396
    //   381: aload_2
    //   382: invokevirtual 316	java/io/Writer:close	()V
    //   385: goto +11 -> 396
    //   388: astore_2
    //   389: ldc_w 318
    //   392: aload_2
    //   393: invokestatic 182	com/appsflyer/AFLogger:afErrorLogForExcManagerOnly	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   396: aload_1
    //   397: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	398	0	this	AFa1hSDK
    //   0	398	1	paramAFa1rSDK	AFa1rSDK
    //   1	286	2	localObject1	Object
    //   300	4	2	localException1	Exception
    //   309	73	2	localObject2	Object
    //   388	5	2	localIOException	IOException
    //   5	25	3	localFile	File
    //   40	7	3	localException2	Exception
    //   50	303	3	localObject3	Object
    //   101	245	4	str	String
    //   110	52	5	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	34	36	finally
    //   46	51	36	finally
    //   55	67	36	finally
    //   69	170	36	finally
    //   2	34	40	java/lang/Exception
    //   46	51	40	java/lang/Exception
    //   55	67	40	java/lang/Exception
    //   69	170	40	java/lang/Exception
    //   172	179	296	finally
    //   181	189	296	finally
    //   191	197	296	finally
    //   199	206	296	finally
    //   208	216	296	finally
    //   218	224	296	finally
    //   226	233	296	finally
    //   235	247	296	finally
    //   249	255	296	finally
    //   257	262	296	finally
    //   268	275	296	finally
    //   277	285	296	finally
    //   287	293	296	finally
    //   310	314	296	finally
    //   316	330	296	finally
    //   350	356	296	finally
    //   172	179	300	java/lang/Exception
    //   181	189	300	java/lang/Exception
    //   191	197	300	java/lang/Exception
    //   199	206	300	java/lang/Exception
    //   208	216	300	java/lang/Exception
    //   218	224	300	java/lang/Exception
    //   226	233	300	java/lang/Exception
    //   235	247	300	java/lang/Exception
    //   249	255	300	java/lang/Exception
    //   257	262	300	java/lang/Exception
    //   268	275	300	java/lang/Exception
    //   277	285	300	java/lang/Exception
    //   287	293	300	java/lang/Exception
    //   310	314	300	java/lang/Exception
    //   316	330	300	java/lang/Exception
    //   330	334	337	java/io/IOException
    //   360	364	367	java/io/IOException
    //   381	385	388	java/io/IOException
  }
  
  public final void valueOf()
  {
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(values.AFInAppEventType.getFilesDir(), "AFRequestCache");
      if (!localFile.exists())
      {
        localFile = new java/io/File;
        localFile.<init>(values.AFInAppEventType.getFilesDir(), "AFRequestCache");
        localFile.mkdir();
      }
    }
    catch (Exception localException)
    {
      break label60;
    }
    return;
    label60:
    AFLogger.afErrorLog("CACHE: Could not create cache directory", localException);
  }
  
  @NonNull
  public final List<AFa1rSDK> values()
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      File localFile1 = new java/io/File;
      localFile1.<init>(values.AFInAppEventType.getFilesDir(), "AFRequestCache");
      if (!localFile1.exists()) {
        localFile1.mkdir();
      }
    }
    catch (Exception localException)
    {
      break label124;
    }
    File[] arrayOfFile = localException.listFiles();
    if (arrayOfFile == null) {
      return localArrayList;
    }
    int i = arrayOfFile.length;
    int j = 0;
    while (j < i)
    {
      File localFile2 = arrayOfFile[j];
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("CACHE: Found cached request");
      localStringBuilder.append(localFile2.getName());
      AFLogger.afInfoLog(localStringBuilder.toString());
      localArrayList.add(valueOf(localFile2));
      j++;
      continue;
      label124:
      AFLogger.afErrorLog("CACHE: Could not get cached requests", localFile2);
    }
    return localArrayList;
  }
  
  public final boolean values(String paramString)
  {
    File localFile = new File(new File(values.AFInAppEventType.getFilesDir(), "AFRequestCache"), paramString);
    StringBuilder localStringBuilder = new StringBuilder("CACHE: Deleting ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" from cache");
    AFLogger.afInfoLog(localStringBuilder.toString());
    if (localFile.exists()) {
      try
      {
        boolean bool = localFile.delete();
        return bool;
      }
      catch (Exception localException)
      {
        localStringBuilder = new StringBuilder("CACHE: Could not delete ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(" from cache");
        AFLogger.afErrorLog(localStringBuilder.toString(), localException);
        return false;
      }
    }
    return true;
  }
  
  public static final class AFa1wSDK
    implements ServiceConnection
  {
    final LinkedBlockingQueue<IBinder> AFInAppEventType = new LinkedBlockingQueue(1);
    boolean AFKeystoreWrapper = false;
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      try
      {
        AFInAppEventType.put(paramIBinder);
        return;
      }
      catch (InterruptedException paramComponentName)
      {
        AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", paramComponentName);
      }
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName) {}
  }
  
  public static final class AFa1xSDK
    implements IInterface
  {
    private final IBinder valueOf;
    
    public AFa1xSDK(IBinder paramIBinder)
    {
      valueOf = paramIBinder;
    }
    
    public final String AFInAppEventParameterName()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        valueOf.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        String str = localParcel2.readString();
        return str;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public final IBinder asBinder()
    {
      return valueOf;
    }
    
    public final boolean values()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        boolean bool = true;
        localParcel1.writeInt(1);
        valueOf.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i == 0) {
          bool = false;
        }
        return bool;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public static final class AFa1ySDK
  {
    final String valueOf;
    private final boolean values;
    
    public AFa1ySDK(String paramString, boolean paramBoolean)
    {
      valueOf = paramString;
      values = paramBoolean;
    }
    
    public final boolean AFInAppEventType()
    {
      return values;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1hSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */