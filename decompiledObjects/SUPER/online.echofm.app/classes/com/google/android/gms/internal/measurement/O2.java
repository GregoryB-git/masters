package com.google.android.gms.internal.measurement;

import W2.l;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.File;

public final class O2
{
  public static l a(Context paramContext)
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskReads();
    try
    {
      StrictMode.allowThreadDiskWrites();
      l locall = d(paramContext);
      if (locall.c()) {
        paramContext = l.d(b(paramContext, (File)locall.b()));
      }
    }
    finally
    {
      break label52;
    }
    paramContext = l.a();
    StrictMode.setThreadPolicy(localThreadPolicy);
    return paramContext;
    label52:
    StrictMode.setThreadPolicy(localThreadPolicy);
    throw paramContext;
  }
  
  /* Error */
  public static K2 b(Context paramContext, File paramFile)
  {
    // Byte code:
    //   0: new 56	java/io/BufferedReader
    //   3: astore_2
    //   4: new 58	java/io/InputStreamReader
    //   7: astore_3
    //   8: new 60	java/io/FileInputStream
    //   11: astore 4
    //   13: aload 4
    //   15: aload_1
    //   16: invokespecial 63	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   19: aload_3
    //   20: aload 4
    //   22: invokespecial 66	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   25: aload_2
    //   26: aload_3
    //   27: invokespecial 69	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   30: new 71	t/h
    //   33: astore 5
    //   35: aload 5
    //   37: invokespecial 72	t/h:<init>	()V
    //   40: new 74	java/util/HashMap
    //   43: astore 6
    //   45: aload 6
    //   47: invokespecial 75	java/util/HashMap:<init>	()V
    //   50: aload_2
    //   51: invokevirtual 79	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   54: astore_3
    //   55: aload_3
    //   56: ifnull +203 -> 259
    //   59: aload_3
    //   60: ldc 81
    //   62: iconst_3
    //   63: invokevirtual 87	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   66: astore 7
    //   68: aload 7
    //   70: arraylength
    //   71: iconst_3
    //   72: if_icmpeq +40 -> 112
    //   75: new 89	java/lang/StringBuilder
    //   78: astore 4
    //   80: aload 4
    //   82: ldc 91
    //   84: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   87: aload 4
    //   89: aload_3
    //   90: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: ldc 100
    //   96: aload 4
    //   98: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokestatic 109	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   104: pop
    //   105: goto -55 -> 50
    //   108: astore_0
    //   109: goto +219 -> 328
    //   112: aload 7
    //   114: iconst_0
    //   115: aaload
    //   116: invokestatic 112	com/google/android/gms/internal/measurement/O2:c	(Ljava/lang/String;)Ljava/lang/String;
    //   119: astore 8
    //   121: aload 7
    //   123: iconst_1
    //   124: aaload
    //   125: invokestatic 112	com/google/android/gms/internal/measurement/O2:c	(Ljava/lang/String;)Ljava/lang/String;
    //   128: invokestatic 117	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   131: astore 9
    //   133: aload 6
    //   135: aload 7
    //   137: iconst_2
    //   138: aaload
    //   139: invokeinterface 123 2 0
    //   144: checkcast 83	java/lang/String
    //   147: astore 4
    //   149: aload 4
    //   151: astore_3
    //   152: aload 4
    //   154: ifnonnull +55 -> 209
    //   157: aload 7
    //   159: iconst_2
    //   160: aaload
    //   161: invokestatic 112	com/google/android/gms/internal/measurement/O2:c	(Ljava/lang/String;)Ljava/lang/String;
    //   164: astore 7
    //   166: aload 7
    //   168: invokestatic 117	android/net/Uri:decode	(Ljava/lang/String;)Ljava/lang/String;
    //   171: astore 4
    //   173: aload 4
    //   175: invokevirtual 127	java/lang/String:length	()I
    //   178: sipush 1024
    //   181: if_icmplt +13 -> 194
    //   184: aload 4
    //   186: astore_3
    //   187: aload 4
    //   189: aload 7
    //   191: if_acmpne +18 -> 209
    //   194: aload 6
    //   196: aload 7
    //   198: aload 4
    //   200: invokeinterface 131 3 0
    //   205: pop
    //   206: aload 4
    //   208: astore_3
    //   209: aload 5
    //   211: aload 8
    //   213: invokevirtual 135	t/h:containsKey	(Ljava/lang/Object;)Z
    //   216: ifne +23 -> 239
    //   219: new 71	t/h
    //   222: astore 4
    //   224: aload 4
    //   226: invokespecial 72	t/h:<init>	()V
    //   229: aload 5
    //   231: aload 8
    //   233: aload 4
    //   235: invokevirtual 136	t/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   238: pop
    //   239: aload 5
    //   241: aload 8
    //   243: invokevirtual 137	t/h:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   246: checkcast 71	t/h
    //   249: aload 9
    //   251: aload_3
    //   252: invokevirtual 136	t/h:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   255: pop
    //   256: goto -206 -> 50
    //   259: aload_1
    //   260: invokestatic 141	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   263: astore_1
    //   264: aload_0
    //   265: invokevirtual 146	android/content/Context:getPackageName	()Ljava/lang/String;
    //   268: astore_3
    //   269: new 89	java/lang/StringBuilder
    //   272: astore_0
    //   273: aload_0
    //   274: ldc -108
    //   276: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   279: aload_0
    //   280: aload_1
    //   281: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   284: pop
    //   285: aload_0
    //   286: ldc -106
    //   288: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_0
    //   293: aload_3
    //   294: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: pop
    //   298: ldc 100
    //   300: aload_0
    //   301: invokevirtual 103	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   304: invokestatic 153	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   307: pop
    //   308: new 155	com/google/android/gms/internal/measurement/F2
    //   311: dup
    //   312: aload 5
    //   314: invokespecial 158	com/google/android/gms/internal/measurement/F2:<init>	(Lt/h;)V
    //   317: astore_0
    //   318: aload_2
    //   319: invokevirtual 161	java/io/BufferedReader:close	()V
    //   322: aload_0
    //   323: areturn
    //   324: astore_0
    //   325: goto +42 -> 367
    //   328: aload_2
    //   329: invokevirtual 161	java/io/BufferedReader:close	()V
    //   332: goto +33 -> 365
    //   335: astore_1
    //   336: ldc -93
    //   338: ldc -91
    //   340: iconst_1
    //   341: anewarray 167	java/lang/Class
    //   344: dup
    //   345: iconst_0
    //   346: ldc -93
    //   348: aastore
    //   349: invokevirtual 171	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   352: aload_0
    //   353: iconst_1
    //   354: anewarray 4	java/lang/Object
    //   357: dup
    //   358: iconst_0
    //   359: aload_1
    //   360: aastore
    //   361: invokevirtual 177	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   364: pop
    //   365: aload_0
    //   366: athrow
    //   367: new 179	java/lang/RuntimeException
    //   370: dup
    //   371: aload_0
    //   372: invokespecial 182	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   375: athrow
    //   376: astore_1
    //   377: goto -12 -> 365
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	380	0	paramContext	Context
    //   0	380	1	paramFile	File
    //   3	326	2	localBufferedReader	java.io.BufferedReader
    //   7	287	3	localObject1	Object
    //   11	223	4	localObject2	Object
    //   33	280	5	localh	t.h
    //   43	152	6	localHashMap	java.util.HashMap
    //   66	131	7	localObject3	Object
    //   119	123	8	str1	String
    //   131	119	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   30	50	108	finally
    //   50	55	108	finally
    //   59	105	108	finally
    //   112	149	108	finally
    //   157	184	108	finally
    //   194	206	108	finally
    //   209	239	108	finally
    //   239	256	108	finally
    //   259	318	108	finally
    //   0	30	324	java/io/IOException
    //   318	322	324	java/io/IOException
    //   365	367	324	java/io/IOException
    //   328	332	335	finally
    //   336	365	376	java/lang/Exception
  }
  
  public static final String c(String paramString)
  {
    return new String(paramString);
  }
  
  public static l d(Context paramContext)
  {
    try
    {
      paramContext = new File(paramContext.getDir("phenotype_hermetic", 0), "overrides.txt");
      if (paramContext.exists()) {
        return l.d(paramContext);
      }
      return l.a();
    }
    catch (RuntimeException paramContext)
    {
      Log.e("HermeticFileOverrides", "no data dir", paramContext);
    }
    return l.a();
  }
  
  public static abstract class a
  {
    public static volatile l a;
    
    public static l a(Context paramContext)
    {
      try
      {
        Object localObject1 = a;
        localObject2 = localObject1;
        if (localObject1 != null) {
          break label119;
        }
        new O2();
        localObject1 = Build.TYPE;
        localObject2 = Build.TAGS;
        if (!((String)localObject1).equals("eng")) {
          if (!((String)localObject1).equals("userdebug")) {
            break label73;
          }
        }
      }
      finally
      {
        break label124;
      }
      if ((!((String)localObject2).contains("dev-keys")) && (!((String)localObject2).contains("test-keys"))) {}
      label73:
      for (paramContext = l.a();; paramContext = O2.a((Context)localObject2))
      {
        break;
        localObject2 = paramContext;
        if (z2.a()) {
          if (M2.a(paramContext)) {
            localObject2 = paramContext;
          } else {
            localObject2 = N2.a(paramContext);
          }
        }
      }
      a = paramContext;
      Object localObject2 = paramContext;
      label119:
      return (l)localObject2;
      label124:
      throw paramContext;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.O2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */