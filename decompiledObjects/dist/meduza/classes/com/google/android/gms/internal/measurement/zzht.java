package com.google.android.gms.internal.measurement;

import a0.d;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import b0.f;
import java.io.File;
import n7.a;
import n7.h;
import n7.l;

public final class zzht
{
  /* Error */
  private static zzhr zza(Context paramContext, File paramFile)
  {
    // Byte code:
    //   0: new 17	java/io/BufferedReader
    //   3: astore_2
    //   4: new 19	java/io/InputStreamReader
    //   7: astore_3
    //   8: new 21	java/io/FileInputStream
    //   11: astore 4
    //   13: aload 4
    //   15: aload_1
    //   16: invokespecial 24	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: aload_3
    //   20: aload 4
    //   22: invokespecial 27	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   25: aload_2
    //   26: aload_3
    //   27: invokespecial 30	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   30: new 32	r/h
    //   33: astore 5
    //   35: aload 5
    //   37: invokespecial 33	r/h:<init>	()V
    //   40: new 35	java/util/HashMap
    //   43: astore 6
    //   45: aload 6
    //   47: invokespecial 36	java/util/HashMap:<init>	()V
    //   50: aload_2
    //   51: invokevirtual 40	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   54: astore 4
    //   56: aload 4
    //   58: ifnull +191 -> 249
    //   61: aload 4
    //   63: ldc 42
    //   65: iconst_3
    //   66: invokevirtual 48	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   69: astore 7
    //   71: aload 7
    //   73: arraylength
    //   74: iconst_3
    //   75: if_icmpeq +33 -> 108
    //   78: new 50	java/lang/StringBuilder
    //   81: astore_3
    //   82: aload_3
    //   83: ldc 52
    //   85: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload_3
    //   89: aload 4
    //   91: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: ldc 61
    //   97: aload_3
    //   98: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokestatic 70	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   104: pop
    //   105: goto -55 -> 50
    //   108: aload 7
    //   110: iconst_0
    //   111: aaload
    //   112: invokestatic 73	com/google/android/gms/internal/measurement/zzht:zza	(Ljava/lang/String;)Ljava/lang/String;
    //   115: astore 8
    //   117: aload 7
    //   119: iconst_1
    //   120: aaload
    //   121: invokestatic 73	com/google/android/gms/internal/measurement/zzht:zza	(Ljava/lang/String;)Ljava/lang/String;
    //   124: invokestatic 78	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   127: astore 9
    //   129: aload 6
    //   131: aload 7
    //   133: iconst_2
    //   134: aaload
    //   135: invokevirtual 82	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   138: checkcast 44	java/lang/String
    //   141: astore_3
    //   142: aload_3
    //   143: astore 4
    //   145: aload_3
    //   146: ifnonnull +49 -> 195
    //   149: aload 7
    //   151: iconst_2
    //   152: aaload
    //   153: invokestatic 73	com/google/android/gms/internal/measurement/zzht:zza	(Ljava/lang/String;)Ljava/lang/String;
    //   156: astore 7
    //   158: aload 7
    //   160: invokestatic 78	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   163: astore_3
    //   164: aload_3
    //   165: invokevirtual 86	java/lang/String:length	()I
    //   168: sipush 1024
    //   171: if_icmplt +12 -> 183
    //   174: aload_3
    //   175: astore 4
    //   177: aload_3
    //   178: aload 7
    //   180: if_acmpne +15 -> 195
    //   183: aload 6
    //   185: aload 7
    //   187: aload_3
    //   188: invokevirtual 90	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   191: pop
    //   192: aload_3
    //   193: astore 4
    //   195: aload 5
    //   197: aload 8
    //   199: aconst_null
    //   200: invokevirtual 93	r/h:getOrDefault	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   203: checkcast 32	r/h
    //   206: astore 7
    //   208: aload 7
    //   210: astore_3
    //   211: aload 7
    //   213: ifnonnull +20 -> 233
    //   216: new 32	r/h
    //   219: astore_3
    //   220: aload_3
    //   221: invokespecial 33	r/h:<init>	()V
    //   224: aload 5
    //   226: aload 8
    //   228: aload_3
    //   229: invokevirtual 94	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   232: pop
    //   233: aload_3
    //   234: aload 9
    //   236: aload 4
    //   238: invokevirtual 94	r/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   241: pop
    //   242: goto -192 -> 50
    //   245: astore_0
    //   246: goto +74 -> 320
    //   249: aload_1
    //   250: invokestatic 98	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   253: astore_1
    //   254: aload_0
    //   255: invokevirtual 103	android/content/Context:getPackageName	()Ljava/lang/String;
    //   258: astore_0
    //   259: new 50	java/lang/StringBuilder
    //   262: astore 4
    //   264: aload 4
    //   266: ldc 105
    //   268: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   271: aload 4
    //   273: aload_1
    //   274: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: pop
    //   278: aload 4
    //   280: ldc 107
    //   282: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload 4
    //   288: aload_0
    //   289: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: ldc 61
    //   295: aload 4
    //   297: invokevirtual 64	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   300: invokestatic 110	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   303: pop
    //   304: new 112	com/google/android/gms/internal/measurement/zzhm
    //   307: dup
    //   308: aload 5
    //   310: invokespecial 115	com/google/android/gms/internal/measurement/zzhm:<init>	(Lr/h;)V
    //   313: astore_0
    //   314: aload_2
    //   315: invokevirtual 118	java/io/BufferedReader:close	()V
    //   318: aload_0
    //   319: areturn
    //   320: aload_2
    //   321: invokevirtual 118	java/io/BufferedReader:close	()V
    //   324: goto +9 -> 333
    //   327: astore_1
    //   328: aload_0
    //   329: aload_1
    //   330: invokevirtual 124	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   333: aload_0
    //   334: athrow
    //   335: astore_0
    //   336: new 126	java/lang/RuntimeException
    //   339: dup
    //   340: aload_0
    //   341: invokespecial 128	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   344: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	paramContext	Context
    //   0	345	1	paramFile	File
    //   3	318	2	localBufferedReader	java.io.BufferedReader
    //   7	227	3	localObject1	Object
    //   11	285	4	localObject2	Object
    //   33	276	5	localh	r.h
    //   43	141	6	localHashMap	java.util.HashMap
    //   69	143	7	localObject3	Object
    //   115	112	8	str1	String
    //   127	108	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	50	245	finally
    //   50	56	245	finally
    //   61	105	245	finally
    //   108	142	245	finally
    //   149	174	245	finally
    //   183	192	245	finally
    //   195	208	245	finally
    //   216	233	245	finally
    //   233	242	245	finally
    //   249	314	245	finally
    //   320	324	327	finally
    //   0	30	335	java/io/IOException
    //   314	318	335	java/io/IOException
    //   328	333	335	java/io/IOException
    //   333	335	335	java/io/IOException
  }
  
  private static final String zza(String paramString)
  {
    return new String(paramString);
  }
  
  public static h<zzhr> zza(Context paramContext)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      StrictMode.allowThreadDiskWrites();
      h localh = zzb(paramContext);
      if (localh.b())
      {
        paramContext = zza(paramContext, (File)localh.a());
        paramContext.getClass();
        paramContext = new l(paramContext);
      }
      else
      {
        paramContext = a.a;
      }
      return paramContext;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  private static h<File> zzb(Context paramContext)
  {
    try
    {
      paramContext = new File(paramContext.getDir("phenotype_hermetic", 0), "overrides.txt");
      if (paramContext.exists()) {
        return new l(paramContext);
      }
      return a.a;
    }
    catch (RuntimeException paramContext)
    {
      Log.e("HermeticFileOverrides", "no data dir", paramContext);
    }
    return a.a;
  }
  
  public static class zza
  {
    private static volatile h<zzhr> zza;
    
    public static h<zzhr> zza(Context paramContext)
    {
      h localh = zza;
      Object localObject = localh;
      if (localh == null) {
        try
        {
          localh = zza;
          localObject = localh;
          if (localh == null)
          {
            new zzht();
            if (!zzhu.zza(Build.TYPE, Build.TAGS))
            {
              paramContext = a.a;
            }
            else
            {
              localObject = paramContext;
              if (zzhg.zza()) {
                if (f.q(paramContext)) {
                  localObject = paramContext;
                } else {
                  localObject = d.f(paramContext);
                }
              }
              paramContext = zzht.zza((Context)localObject);
            }
            zza = paramContext;
            localObject = paramContext;
          }
        }
        finally {}
      }
      return (h<zzhr>)localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */