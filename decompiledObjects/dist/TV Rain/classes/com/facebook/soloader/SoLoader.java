package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import z2;

public class SoLoader
{
  public static final boolean DEBUG = false;
  public static final int SOLOADER_ALLOW_ASYNC_INIT = 2;
  public static final int SOLOADER_ENABLE_EXOPACKAGE = 1;
  public static final int SOLOADER_LOOK_IN_ZIP = 4;
  private static String SO_STORE_NAME_MAIN = "lib-main";
  public static final boolean SYSTRACE_LIBRARY_LOADING = true;
  public static final String TAG = "SoLoader";
  private static int sFlags;
  private static final Set<String> sLoadedLibraries = new HashSet();
  private static final Map<String, Object> sLoadingLibraries = new HashMap();
  @Nullable
  public static SoFileLoader sSoFileLoader;
  @Nullable
  private static SoSource[] sSoSources;
  @Nullable
  private static SystemLoadLibraryWrapper sSystemLoadLibraryWrapper = null;
  
  public static boolean areSoSourcesAbisSupported()
  {
    SoSource[] arrayOfSoSource = sSoSources;
    if (arrayOfSoSource == null) {
      return false;
    }
    String[] arrayOfString1 = SysUtil.getSupportedAbis();
    for (int i = 0; i < arrayOfSoSource.length; i++)
    {
      String[] arrayOfString2 = arrayOfSoSource[i].getSoSourceAbis();
      for (int j = 0; j < arrayOfString2.length; j++)
      {
        int k = 0;
        int m = k;
        boolean bool;
        while ((k < arrayOfString1.length) && (m == 0))
        {
          bool = arrayOfString2[j].equals(arrayOfString1[k]);
          k++;
        }
        if (!bool) {
          return false;
        }
      }
    }
    return true;
  }
  
  private static void assertInitialized()
  {
    if (sSoSources != null) {
      return;
    }
    throw new RuntimeException("SoLoader.init() not yet called");
  }
  
  public static void deinitForTest()
  {
    setSoSources(null);
  }
  
  private static void doLoadLibraryBySoName(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy)
    throws IOException
  {
    try
    {
      Object localObject1 = sSoSources;
      if (localObject1 != null)
      {
        int i = localObject1.length;
        SoSource[] arrayOfSoSource = new SoSource[i];
        int j = localObject1.length;
        int k = 0;
        System.arraycopy(localObject1, 0, arrayOfSoSource, 0, j);
        if (paramThreadPolicy == null)
        {
          paramThreadPolicy = StrictMode.allowThreadDiskReads();
          j = 1;
        }
        else
        {
          j = 0;
        }
        if (SYSTRACE_LIBRARY_LOADING) {
          Api18TraceUtils.beginTraceSection(z2.p("SoLoader.loadLibrary[", paramString, "]"));
        }
        int m = 0;
        while ((k == 0) && (m < i))
        {
          int n = k;
          try
          {
            k = arrayOfSoSource[m].loadLibrary(paramString, paramInt, paramThreadPolicy);
            if (k == 0)
            {
              n = k;
              localObject1 = new java/lang/StringBuilder;
              n = k;
              ((StringBuilder)localObject1).<init>();
              n = k;
              ((StringBuilder)localObject1).append("Result ");
              n = k;
              ((StringBuilder)localObject1).append(k);
              n = k;
              ((StringBuilder)localObject1).append(" for ");
              n = k;
              ((StringBuilder)localObject1).append(paramString);
              n = k;
              ((StringBuilder)localObject1).append(" in source ");
              n = k;
              ((StringBuilder)localObject1).append(arrayOfSoSource[m]);
              n = k;
              Log.d("SoLoader", ((StringBuilder)localObject1).toString());
            }
            localObject1 = arrayOfSoSource[m];
            n = k;
            if ((localObject1 instanceof ExtractFromZipSoSource))
            {
              n = k;
              localObject1 = (ExtractFromZipSoSource)localObject1;
              n = k;
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              n = k;
              localStringBuilder.<init>();
              n = k;
              localStringBuilder.append("Extraction logs: ");
              n = k;
              localStringBuilder.append(((ExtractFromZipSoSource)localObject1).getExtractLogs(paramString));
              n = k;
              Log.d("SoLoader", localStringBuilder.toString());
            }
            m++;
          }
          finally
          {
            if (SYSTRACE_LIBRARY_LOADING) {
              Api18TraceUtils.endSection();
            }
            if (j != 0) {
              StrictMode.setThreadPolicy(paramThreadPolicy);
            }
            if (n == 0)
            {
              paramThreadPolicy = new StringBuilder();
              paramThreadPolicy.append("Could not load: ");
              paramThreadPolicy.append(paramString);
              Log.e("SoLoader", paramThreadPolicy.toString());
              throw new UnsatisfiedLinkError(z2.o("couldn't find DSO to load: ", paramString));
            }
          }
        }
        if (SYSTRACE_LIBRARY_LOADING) {
          Api18TraceUtils.endSection();
        }
        if (j != 0) {
          StrictMode.setThreadPolicy(paramThreadPolicy);
        }
        if (k != 0) {
          return;
        }
        paramThreadPolicy = new StringBuilder();
        paramThreadPolicy.append("Could not load: ");
        paramThreadPolicy.append(paramString);
        Log.e("SoLoader", paramThreadPolicy.toString());
        throw new UnsatisfiedLinkError(z2.o("couldn't find DSO to load: ", paramString));
      }
      paramThreadPolicy = new java/lang/StringBuilder;
      paramThreadPolicy.<init>();
      paramThreadPolicy.append("Could not load: ");
      paramThreadPolicy.append(paramString);
      paramThreadPolicy.append(" because no SO source exists");
      Log.e("SoLoader", paramThreadPolicy.toString());
      UnsatisfiedLinkError localUnsatisfiedLinkError = new java/lang/UnsatisfiedLinkError;
      paramThreadPolicy = new java/lang/StringBuilder;
      paramThreadPolicy.<init>();
      paramThreadPolicy.append("couldn't find DSO to load: ");
      paramThreadPolicy.append(paramString);
      localUnsatisfiedLinkError.<init>(paramThreadPolicy.toString());
      throw localUnsatisfiedLinkError;
    }
    finally {}
  }
  
  public static Set<String> getLoadedLibrariesNames()
  {
    return sLoadedLibraries;
  }
  
  @Nullable
  private static Method getNativeLoadRuntimeMethod()
  {
    try
    {
      Method localMethod = Runtime.class.getDeclaredMethod("nativeLoad", new Class[] { String.class, ClassLoader.class, String.class });
      localMethod.setAccessible(true);
      return localMethod;
    }
    catch (SecurityException localSecurityException) {}catch (NoSuchMethodException localNoSuchMethodException) {}
    Log.w("SoLoader", "Cannot get nativeLoad method", localNoSuchMethodException);
    return null;
  }
  
  public static void init(Context paramContext, int paramInt)
    throws IOException
  {
    init(paramContext, paramInt, null);
  }
  
  public static void init(Context paramContext, int paramInt, @Nullable SoFileLoader paramSoFileLoader)
    throws IOException
  {
    StrictMode.ThreadPolicy localThreadPolicy = StrictMode.allowThreadDiskWrites();
    try
    {
      initImpl(paramContext, paramInt, paramSoFileLoader);
      return;
    }
    finally
    {
      StrictMode.setThreadPolicy(localThreadPolicy);
    }
  }
  
  public static void init(Context paramContext, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = 0;
    }
    try
    {
      init(paramContext, i);
      return;
    }
    catch (IOException paramContext)
    {
      throw new RuntimeException(paramContext);
    }
  }
  
  private static void initImpl(Context paramContext, int paramInt, @Nullable SoFileLoader paramSoFileLoader)
    throws IOException
  {
    try
    {
      if (sSoSources == null)
      {
        Log.d("SoLoader", "init start");
        sFlags = paramInt;
        initSoLoader(paramSoFileLoader);
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject = System.getenv("LD_LIBRARY_PATH");
        paramSoFileLoader = (SoFileLoader)localObject;
        if (localObject == null) {
          paramSoFileLoader = "/vendor/lib:/system/lib";
        }
        paramSoFileLoader = paramSoFileLoader.split(":");
        DirectorySoSource localDirectorySoSource;
        for (int i = 0; i < paramSoFileLoader.length; i++)
        {
          localObject = new java/io/File;
          ((File)localObject).<init>(paramSoFileLoader[i]);
          localDirectorySoSource = new com/facebook/soloader/DirectorySoSource;
          localDirectorySoSource.<init>((File)localObject, 2);
          localArrayList.add(localDirectorySoSource);
        }
        if (paramContext != null)
        {
          i = 1;
          if ((paramInt & 0x1) != 0)
          {
            paramSoFileLoader = new com/facebook/soloader/ExoSoSource;
            paramSoFileLoader.<init>(paramContext, SO_STORE_NAME_MAIN);
            localArrayList.add(0, paramSoFileLoader);
          }
          else
          {
            localObject = paramContext.getApplicationInfo();
            paramInt = flags;
            if (((paramInt & 0x1) != 0) && ((paramInt & 0x80) == 0)) {
              paramInt = 1;
            } else {
              paramInt = 0;
            }
            if (paramInt != 0)
            {
              paramInt = 0;
            }
            else
            {
              localDirectorySoSource = new com/facebook/soloader/DirectorySoSource;
              paramSoFileLoader = new java/io/File;
              paramSoFileLoader.<init>(nativeLibraryDir);
              localDirectorySoSource.<init>(paramSoFileLoader, 0);
              localArrayList.add(0, localDirectorySoSource);
              paramInt = i;
            }
            paramSoFileLoader = new com/facebook/soloader/ApkSoSource;
            paramSoFileLoader.<init>(paramContext, SO_STORE_NAME_MAIN, paramInt);
            localArrayList.add(0, paramSoFileLoader);
          }
        }
        paramContext = (SoSource[])localArrayList.toArray(new SoSource[localArrayList.size()]);
        int j = makePrepareFlags();
        for (paramInt = paramContext.length;; paramInt = i)
        {
          i = paramInt - 1;
          if (paramInt <= 0) {
            break;
          }
          paramSoFileLoader = new java/lang/StringBuilder;
          paramSoFileLoader.<init>();
          paramSoFileLoader.append("Preparing SO source: ");
          paramSoFileLoader.append(paramContext[i]);
          Log.d("SoLoader", paramSoFileLoader.toString());
          paramContext[i].prepare(j);
        }
        sSoSources = paramContext;
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext.append("init finish: ");
        paramContext.append(sSoSources.length);
        paramContext.append(" SO sources prepared");
        Log.d("SoLoader", paramContext.toString());
      }
      return;
    }
    finally {}
  }
  
  private static void initSoLoader(@Nullable SoFileLoader paramSoFileLoader)
  {
    if (paramSoFileLoader != null) {}
    try
    {
      sSoFileLoader = paramSoFileLoader;
      return;
    }
    finally {}
    Runtime localRuntime = Runtime.getRuntime();
    Method localMethod = getNativeLoadRuntimeMethod();
    boolean bool;
    if (localMethod != null) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool) {
      paramSoFileLoader = Api14Utils.getClassLoaderLdLoadLibrary();
    } else {
      paramSoFileLoader = null;
    }
    String str = makeNonZipPath(paramSoFileLoader);
    SoFileLoader local1 = new com/facebook/soloader/SoLoader$1;
    local1.<init>(bool, paramSoFileLoader, str, localRuntime, localMethod);
    sSoFileLoader = local1;
  }
  
  public static void loadLibrary(String paramString)
  {
    loadLibrary(paramString, 0);
  }
  
  public static void loadLibrary(String paramString, int paramInt)
    throws UnsatisfiedLinkError
  {
    try
    {
      Object localObject;
      if (sSoSources == null) {
        if ("http://www.android.com/".equals(System.getProperty("java.vendor.url")))
        {
          assertInitialized();
        }
        else
        {
          localObject = sSystemLoadLibraryWrapper;
          if (localObject != null) {
            ((SystemLoadLibraryWrapper)localObject).loadLibrary(paramString);
          } else {
            System.loadLibrary(paramString);
          }
          return;
        }
      }
      String str = MergedSoMapping.mapLibName(paramString);
      if (str != null) {
        localObject = str;
      } else {
        localObject = paramString;
      }
      loadLibraryBySoName(System.mapLibraryName((String)localObject), paramString, str, paramInt, null);
      return;
    }
    finally {}
  }
  
  public static void loadLibraryBySoName(String paramString, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy)
  {
    loadLibraryBySoName(paramString, null, null, paramInt, paramThreadPolicy);
  }
  
  /* Error */
  private static void loadLibraryBySoName(String paramString1, String paramString2, String paramString3, int paramInt, StrictMode.ThreadPolicy paramThreadPolicy)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 51	com/facebook/soloader/SoLoader:sLoadedLibraries	Ljava/util/Set;
    //   6: astore 5
    //   8: aload 5
    //   10: aload_0
    //   11: invokeinterface 384 2 0
    //   16: istore 6
    //   18: iconst_1
    //   19: istore 7
    //   21: iload 6
    //   23: ifeq +17 -> 40
    //   26: aload_2
    //   27: ifnonnull +7 -> 34
    //   30: ldc 2
    //   32: monitorexit
    //   33: return
    //   34: iconst_1
    //   35: istore 8
    //   37: goto +6 -> 43
    //   40: iconst_0
    //   41: istore 8
    //   43: getstatic 56	com/facebook/soloader/SoLoader:sLoadingLibraries	Ljava/util/Map;
    //   46: astore 9
    //   48: aload 9
    //   50: aload_0
    //   51: invokeinterface 389 2 0
    //   56: ifeq +16 -> 72
    //   59: aload 9
    //   61: aload_0
    //   62: invokeinterface 393 2 0
    //   67: astore 10
    //   69: goto +24 -> 93
    //   72: new 4	java/lang/Object
    //   75: astore 10
    //   77: aload 10
    //   79: invokespecial 66	java/lang/Object:<init>	()V
    //   82: aload 9
    //   84: aload_0
    //   85: aload 10
    //   87: invokeinterface 397 3 0
    //   92: pop
    //   93: ldc 2
    //   95: monitorexit
    //   96: aload 10
    //   98: monitorenter
    //   99: iload 8
    //   101: ifne +196 -> 297
    //   104: ldc 2
    //   106: monitorenter
    //   107: aload 5
    //   109: aload_0
    //   110: invokeinterface 384 2 0
    //   115: ifeq +18 -> 133
    //   118: iload 7
    //   120: istore 8
    //   122: aload_2
    //   123: ifnonnull +10 -> 133
    //   126: ldc 2
    //   128: monitorexit
    //   129: aload 10
    //   131: monitorexit
    //   132: return
    //   133: ldc 2
    //   135: monitorexit
    //   136: iload 8
    //   138: ifne +159 -> 297
    //   141: new 137	java/lang/StringBuilder
    //   144: astore 9
    //   146: aload 9
    //   148: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   151: aload 9
    //   153: ldc_w 399
    //   156: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: aload 9
    //   162: aload_0
    //   163: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: pop
    //   167: ldc 28
    //   169: aload 9
    //   171: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: invokestatic 164	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   177: pop
    //   178: aload_0
    //   179: iload_3
    //   180: aload 4
    //   182: invokestatic 401	com/facebook/soloader/SoLoader:doLoadLibraryBySoName	(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)V
    //   185: ldc 2
    //   187: monitorenter
    //   188: new 137	java/lang/StringBuilder
    //   191: astore 4
    //   193: aload 4
    //   195: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   198: aload 4
    //   200: ldc_w 403
    //   203: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload 4
    //   209: aload_0
    //   210: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: ldc 28
    //   216: aload 4
    //   218: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: invokestatic 164	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   224: pop
    //   225: aload 5
    //   227: aload_0
    //   228: invokeinterface 404 2 0
    //   233: pop
    //   234: ldc 2
    //   236: monitorexit
    //   237: goto +60 -> 297
    //   240: astore_0
    //   241: ldc 2
    //   243: monitorexit
    //   244: aload_0
    //   245: athrow
    //   246: astore_0
    //   247: aload_0
    //   248: invokevirtual 409	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   251: astore_1
    //   252: aload_1
    //   253: ifnull +24 -> 277
    //   256: aload_1
    //   257: ldc_w 411
    //   260: invokevirtual 414	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   263: ifeq +14 -> 277
    //   266: new 11	com/facebook/soloader/SoLoader$WrongAbiError
    //   269: astore_1
    //   270: aload_1
    //   271: aload_0
    //   272: invokespecial 415	com/facebook/soloader/SoLoader$WrongAbiError:<init>	(Ljava/lang/Throwable;)V
    //   275: aload_1
    //   276: athrow
    //   277: aload_0
    //   278: athrow
    //   279: astore_0
    //   280: new 90	java/lang/RuntimeException
    //   283: astore_1
    //   284: aload_1
    //   285: aload_0
    //   286: invokespecial 249	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   289: aload_1
    //   290: athrow
    //   291: astore_0
    //   292: ldc 2
    //   294: monitorexit
    //   295: aload_0
    //   296: athrow
    //   297: aload_2
    //   298: ifnull +122 -> 420
    //   301: getstatic 64	com/facebook/soloader/SoLoader:SYSTRACE_LIBRARY_LOADING	Z
    //   304: istore 6
    //   306: iload 6
    //   308: ifeq +39 -> 347
    //   311: new 137	java/lang/StringBuilder
    //   314: astore_2
    //   315: aload_2
    //   316: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   319: aload_2
    //   320: ldc_w 417
    //   323: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: pop
    //   327: aload_2
    //   328: aload_1
    //   329: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: pop
    //   333: aload_2
    //   334: ldc 120
    //   336: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: pop
    //   340: aload_2
    //   341: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   344: invokestatic 131	com/facebook/soloader/Api18TraceUtils:beginTraceSection	(Ljava/lang/String;)V
    //   347: new 137	java/lang/StringBuilder
    //   350: astore_2
    //   351: aload_2
    //   352: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   355: aload_2
    //   356: ldc_w 419
    //   359: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: aload_2
    //   364: aload_1
    //   365: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: pop
    //   369: aload_2
    //   370: ldc_w 421
    //   373: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: pop
    //   377: aload_2
    //   378: aload_0
    //   379: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   382: pop
    //   383: ldc 28
    //   385: aload_2
    //   386: invokevirtual 158	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   389: invokestatic 164	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   392: pop
    //   393: aload_1
    //   394: invokestatic 424	com/facebook/soloader/MergedSoMapping:invokeJniOnload	(Ljava/lang/String;)V
    //   397: iload 6
    //   399: ifeq +21 -> 420
    //   402: invokestatic 175	com/facebook/soloader/Api18TraceUtils:endSection	()V
    //   405: goto +15 -> 420
    //   408: astore_0
    //   409: getstatic 64	com/facebook/soloader/SoLoader:SYSTRACE_LIBRARY_LOADING	Z
    //   412: ifeq +6 -> 418
    //   415: invokestatic 175	com/facebook/soloader/Api18TraceUtils:endSection	()V
    //   418: aload_0
    //   419: athrow
    //   420: aload 10
    //   422: monitorexit
    //   423: return
    //   424: astore_0
    //   425: aload 10
    //   427: monitorexit
    //   428: aload_0
    //   429: athrow
    //   430: astore_0
    //   431: ldc 2
    //   433: monitorexit
    //   434: aload_0
    //   435: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	436	0	paramString1	String
    //   0	436	1	paramString2	String
    //   0	436	2	paramString3	String
    //   0	436	3	paramInt	int
    //   0	436	4	paramThreadPolicy	StrictMode.ThreadPolicy
    //   6	220	5	localSet	Set
    //   16	382	6	bool	boolean
    //   19	100	7	i	int
    //   35	102	8	j	int
    //   46	124	9	localObject1	Object
    //   67	359	10	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   188	237	240	finally
    //   241	244	240	finally
    //   141	185	246	java/lang/UnsatisfiedLinkError
    //   141	185	279	java/io/IOException
    //   107	118	291	finally
    //   126	129	291	finally
    //   133	136	291	finally
    //   292	295	291	finally
    //   347	397	408	finally
    //   104	107	424	finally
    //   129	132	424	finally
    //   141	185	424	finally
    //   185	188	424	finally
    //   244	246	424	finally
    //   247	252	424	finally
    //   256	277	424	finally
    //   277	279	424	finally
    //   280	291	424	finally
    //   295	297	424	finally
    //   301	306	424	finally
    //   311	347	424	finally
    //   402	405	424	finally
    //   409	418	424	finally
    //   418	420	424	finally
    //   420	423	424	finally
    //   425	428	424	finally
    //   3	18	430	finally
    //   30	33	430	finally
    //   43	69	430	finally
    //   72	93	430	finally
    //   93	96	430	finally
    //   431	434	430	finally
  }
  
  public static String makeLdLibraryPath()
  {
    try
    {
      assertInitialized();
      Log.d("SoLoader", "makeLdLibraryPath");
      Object localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      Object localObject3 = sSoSources;
      for (int i = 0; i < localObject3.length; i++) {
        localObject3[i].addToLdLibraryPath((Collection)localObject1);
      }
      localObject1 = TextUtils.join(":", (Iterable)localObject1);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("makeLdLibraryPath final path: ");
      ((StringBuilder)localObject3).append((String)localObject1);
      Log.d("SoLoader", ((StringBuilder)localObject3).toString());
      return (String)localObject1;
    }
    finally {}
  }
  
  @Nullable
  public static String makeNonZipPath(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String[] arrayOfString = paramString.split(":");
    ArrayList localArrayList = new ArrayList(arrayOfString.length);
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      paramString = arrayOfString[j];
      if (!paramString.contains("!")) {
        localArrayList.add(paramString);
      }
    }
    return TextUtils.join(":", localArrayList);
  }
  
  private static int makePrepareFlags()
  {
    int i;
    if ((sFlags & 0x2) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public static void prependSoSource(SoSource paramSoSource)
    throws IOException
  {
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Prepending to SO sources: ");
      ((StringBuilder)localObject).append(paramSoSource);
      Log.d("SoLoader", ((StringBuilder)localObject).toString());
      assertInitialized();
      paramSoSource.prepare(makePrepareFlags());
      localObject = sSoSources;
      SoSource[] arrayOfSoSource = new SoSource[localObject.length + 1];
      arrayOfSoSource[0] = paramSoSource;
      System.arraycopy(localObject, 0, arrayOfSoSource, 1, localObject.length);
      sSoSources = arrayOfSoSource;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Prepended to SO sources: ");
      ((StringBuilder)localObject).append(paramSoSource);
      Log.d("SoLoader", ((StringBuilder)localObject).toString());
      return;
    }
    finally {}
  }
  
  public static void resetStatus()
  {
    try
    {
      sLoadedLibraries.clear();
      sLoadingLibraries.clear();
      sSoFileLoader = null;
      sSoSources = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static void setInTestMode()
  {
    setSoSources(new SoSource[] { new NoopSoSource() });
  }
  
  public static void setSoFileLoader(SoFileLoader paramSoFileLoader)
  {
    sSoFileLoader = paramSoFileLoader;
  }
  
  public static void setSoSources(SoSource[] paramArrayOfSoSource)
  {
    try
    {
      sSoSources = paramArrayOfSoSource;
      return;
    }
    finally
    {
      paramArrayOfSoSource = finally;
      throw paramArrayOfSoSource;
    }
  }
  
  public static void setSystemLoadLibraryWrapper(SystemLoadLibraryWrapper paramSystemLoadLibraryWrapper)
  {
    sSystemLoadLibraryWrapper = paramSystemLoadLibraryWrapper;
  }
  
  public static File unpackLibraryAndDependencies(String paramString)
    throws UnsatisfiedLinkError
  {
    
    try
    {
      paramString = unpackLibraryBySoName(System.mapLibraryName(paramString));
      return paramString;
    }
    catch (IOException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public static File unpackLibraryBySoName(String paramString)
    throws IOException
  {
    for (int i = 0;; i++)
    {
      Object localObject = sSoSources;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i].unpackLibrary(paramString);
      if (localObject != null) {
        return (File)localObject;
      }
    }
    throw new FileNotFoundException(paramString);
  }
  
  @TargetApi(14)
  @DoNotOptimize
  public static class Api14Utils
  {
    public static String getClassLoaderLdLoadLibrary()
    {
      ClassLoader localClassLoader = SoLoader.class.getClassLoader();
      if ((localClassLoader instanceof BaseDexClassLoader)) {
        try
        {
          Object localObject = (BaseDexClassLoader)localClassLoader;
          localObject = (String)BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke(localObject, new Object[0]);
          return (String)localObject;
        }
        catch (Exception localException)
        {
          throw new RuntimeException("Cannot call getLdLibraryPath", localException);
        }
      }
      StringBuilder localStringBuilder = z2.t("ClassLoader ");
      localStringBuilder.append(localClassLoader.getClass().getName());
      localStringBuilder.append(" should be of type BaseDexClassLoader");
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  public static final class WrongAbiError
    extends UnsatisfiedLinkError
  {
    public WrongAbiError(Throwable paramThrowable)
    {
      super();
      initCause(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.SoLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */