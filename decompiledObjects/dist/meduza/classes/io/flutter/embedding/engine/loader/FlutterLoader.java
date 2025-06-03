package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f;
import g;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterJNI.Factory;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class FlutterLoader
{
  public static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
  public static final String AOT_VMSERVICE_SHARED_LIBRARY_NAME = "aot-vmservice-shared-library-name";
  public static final String AUTOMATICALLY_REGISTER_PLUGINS_KEY = "automatically-register-plugins";
  private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
  private static final String DEFAULT_LIBRARY = "libflutter.so";
  private static final String DISABLE_MERGED_PLATFORM_UI_THREAD_KEY = "io.flutter.embedding.android.DisableMergedPlatformUIThread";
  private static final String ENABLE_IMPELLER_META_DATA_KEY = "io.flutter.embedding.android.EnableImpeller";
  private static final String ENABLE_SURFACE_CONTROL = "io.flutter.embedding.android.EnableSurfaceControl";
  private static final String ENABLE_VULKAN_VALIDATION_META_DATA_KEY = "io.flutter.embedding.android.EnableVulkanValidation";
  public static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
  private static final String IMPELLER_BACKEND_META_DATA_KEY = "io.flutter.embedding.android.ImpellerBackend";
  private static final String IMPELLER_OPENGL_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableOpenGLGPUTracing";
  private static final String IMPELLER_VULKAN_GPU_TRACING_DATA_KEY = "io.flutter.embedding.android.EnableVulkanGPUTracing";
  public static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
  private static final String LEAK_VM_META_DATA_KEY = "io.flutter.embedding.android.LeakVM";
  private static final String OLD_GEN_HEAP_SIZE_META_DATA_KEY = "io.flutter.embedding.android.OldGenHeapSize";
  public static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
  private static final String TAG = "FlutterLoader";
  private static final String VMSERVICE_SNAPSHOT_LIBRARY = "libvmservice_snapshot.so";
  public static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
  private static FlutterLoader instance;
  private ExecutorService executorService;
  private FlutterApplicationInfo flutterApplicationInfo;
  private FlutterJNI flutterJNI;
  public Future<InitResult> initResultFuture;
  private long initStartTimestampMillis;
  private boolean initialized = false;
  private Settings settings;
  
  public FlutterLoader()
  {
    this(FlutterInjector.instance().getFlutterJNIFactory().provideFlutterJNI());
  }
  
  public FlutterLoader(FlutterJNI paramFlutterJNI)
  {
    this(paramFlutterJNI, FlutterInjector.instance().executorService());
  }
  
  public FlutterLoader(FlutterJNI paramFlutterJNI, ExecutorService paramExecutorService)
  {
    flutterJNI = paramFlutterJNI;
    executorService = paramExecutorService;
  }
  
  private String fullAssetPathFrom(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(flutterApplicationInfo.flutterAssetsDir);
    return g.f(localStringBuilder, File.separator, paramString);
  }
  
  private ResourceExtractor initResources(Context paramContext)
  {
    return null;
  }
  
  private static boolean isLeakVM(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return true;
    }
    return paramBundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
  }
  
  public boolean automaticallyRegisterPlugins()
  {
    return flutterApplicationInfo.automaticallyRegisterPlugins;
  }
  
  /* Error */
  public void ensureInitializationComplete(Context paramContext, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 121	io/flutter/embedding/engine/loader/FlutterLoader:initialized	Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: invokestatic 244	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   11: invokestatic 214	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   14: if_acmpne +912 -> 926
    //   17: aload_0
    //   18: getfield 246	io/flutter/embedding/engine/loader/FlutterLoader:settings	Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;
    //   21: ifnull +894 -> 915
    //   24: ldc -8
    //   26: invokestatic 254	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   29: astore_3
    //   30: aload_0
    //   31: getfield 202	io/flutter/embedding/engine/loader/FlutterLoader:initResultFuture	Ljava/util/concurrent/Future;
    //   34: invokeinterface 208 1 0
    //   39: checkcast 8	io/flutter/embedding/engine/loader/FlutterLoader$InitResult
    //   42: astore 4
    //   44: new 256	java/util/ArrayList
    //   47: astore 5
    //   49: aload 5
    //   51: invokespecial 257	java/util/ArrayList:<init>	()V
    //   54: aload 5
    //   56: ldc_w 259
    //   59: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   62: pop
    //   63: new 153	java/lang/StringBuilder
    //   66: astore 6
    //   68: aload 6
    //   70: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   73: aload 6
    //   75: ldc_w 265
    //   78: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload 6
    //   84: aload_0
    //   85: getfield 143	io/flutter/embedding/engine/loader/FlutterLoader:flutterApplicationInfo	Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   88: getfield 268	io/flutter/embedding/engine/loader/FlutterApplicationInfo:nativeLibraryDir	Ljava/lang/String;
    //   91: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: pop
    //   95: getstatic 168	java/io/File:separator	Ljava/lang/String;
    //   98: astore 7
    //   100: aload 6
    //   102: aload 7
    //   104: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload 6
    //   110: ldc 28
    //   112: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload 5
    //   118: aload 6
    //   120: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   126: pop
    //   127: aload_2
    //   128: ifnull +10 -> 138
    //   131: aload 5
    //   133: aload_2
    //   134: invokestatic 278	java/util/Collections:addAll	(Ljava/util/Collection;[Ljava/lang/Object;)Z
    //   137: pop
    //   138: new 153	java/lang/StringBuilder
    //   141: astore_2
    //   142: aload_2
    //   143: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   146: aload_2
    //   147: ldc_w 280
    //   150: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: pop
    //   154: aload_2
    //   155: aload_0
    //   156: getfield 143	io/flutter/embedding/engine/loader/FlutterLoader:flutterApplicationInfo	Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   159: getfield 283	io/flutter/embedding/engine/loader/FlutterApplicationInfo:aotSharedLibraryName	Ljava/lang/String;
    //   162: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload 5
    //   168: aload_2
    //   169: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   175: pop
    //   176: new 153	java/lang/StringBuilder
    //   179: astore_2
    //   180: aload_2
    //   181: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   184: aload_2
    //   185: ldc_w 280
    //   188: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload_2
    //   193: aload_0
    //   194: getfield 143	io/flutter/embedding/engine/loader/FlutterLoader:flutterApplicationInfo	Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   197: getfield 268	io/flutter/embedding/engine/loader/FlutterApplicationInfo:nativeLibraryDir	Ljava/lang/String;
    //   200: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   203: pop
    //   204: aload_2
    //   205: aload 7
    //   207: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload_2
    //   212: aload_0
    //   213: getfield 143	io/flutter/embedding/engine/loader/FlutterLoader:flutterApplicationInfo	Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   216: getfield 283	io/flutter/embedding/engine/loader/FlutterApplicationInfo:aotSharedLibraryName	Ljava/lang/String;
    //   219: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   222: pop
    //   223: aload 5
    //   225: aload_2
    //   226: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   229: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   232: pop
    //   233: new 153	java/lang/StringBuilder
    //   236: astore_2
    //   237: aload_2
    //   238: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   241: aload_2
    //   242: ldc_w 285
    //   245: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: pop
    //   249: aload_2
    //   250: aload 4
    //   252: getfield 288	io/flutter/embedding/engine/loader/FlutterLoader$InitResult:engineCachesPath	Ljava/lang/String;
    //   255: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload 5
    //   261: aload_2
    //   262: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   268: pop
    //   269: aload_0
    //   270: getfield 143	io/flutter/embedding/engine/loader/FlutterLoader:flutterApplicationInfo	Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   273: getfield 291	io/flutter/embedding/engine/loader/FlutterApplicationInfo:domainNetworkPolicy	Ljava/lang/String;
    //   276: ifnull +41 -> 317
    //   279: new 153	java/lang/StringBuilder
    //   282: astore_2
    //   283: aload_2
    //   284: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   287: aload_2
    //   288: ldc_w 293
    //   291: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   294: pop
    //   295: aload_2
    //   296: aload_0
    //   297: getfield 143	io/flutter/embedding/engine/loader/FlutterLoader:flutterApplicationInfo	Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   300: getfield 291	io/flutter/embedding/engine/loader/FlutterApplicationInfo:domainNetworkPolicy	Ljava/lang/String;
    //   303: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload 5
    //   309: aload_2
    //   310: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   316: pop
    //   317: aload_0
    //   318: getfield 246	io/flutter/embedding/engine/loader/FlutterLoader:settings	Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;
    //   321: invokevirtual 296	io/flutter/embedding/engine/loader/FlutterLoader$Settings:getLogTag	()Ljava/lang/String;
    //   324: ifnull +41 -> 365
    //   327: new 153	java/lang/StringBuilder
    //   330: astore_2
    //   331: aload_2
    //   332: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   335: aload_2
    //   336: ldc_w 298
    //   339: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   342: pop
    //   343: aload_2
    //   344: aload_0
    //   345: getfield 246	io/flutter/embedding/engine/loader/FlutterLoader:settings	Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;
    //   348: invokevirtual 296	io/flutter/embedding/engine/loader/FlutterLoader$Settings:getLogTag	()Ljava/lang/String;
    //   351: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload 5
    //   357: aload_2
    //   358: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   361: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   364: pop
    //   365: aload_1
    //   366: invokevirtual 302	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   369: aload_1
    //   370: invokevirtual 305	android/content/Context:getPackageName	()Ljava/lang/String;
    //   373: sipush 128
    //   376: invokevirtual 311	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   379: getfield 317	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   382: astore 7
    //   384: aload 7
    //   386: ifnull +15 -> 401
    //   389: aload 7
    //   391: ldc 61
    //   393: invokevirtual 321	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   396: istore 8
    //   398: goto +6 -> 404
    //   401: iconst_0
    //   402: istore 8
    //   404: iload 8
    //   406: istore 9
    //   408: iload 8
    //   410: ifne +45 -> 455
    //   413: aload_1
    //   414: ldc_w 323
    //   417: invokevirtual 327	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   420: checkcast 329	android/app/ActivityManager
    //   423: astore 6
    //   425: new 331	android/app/ActivityManager$MemoryInfo
    //   428: astore_2
    //   429: aload_2
    //   430: invokespecial 332	android/app/ActivityManager$MemoryInfo:<init>	()V
    //   433: aload 6
    //   435: aload_2
    //   436: invokevirtual 336	android/app/ActivityManager:getMemoryInfo	(Landroid/app/ActivityManager$MemoryInfo;)V
    //   439: aload_2
    //   440: getfield 339	android/app/ActivityManager$MemoryInfo:totalMem	J
    //   443: l2d
    //   444: ldc2_w 340
    //   447: ddiv
    //   448: ldc2_w 342
    //   451: ddiv
    //   452: d2i
    //   453: istore 9
    //   455: new 153	java/lang/StringBuilder
    //   458: astore_2
    //   459: aload_2
    //   460: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   463: aload_2
    //   464: ldc_w 345
    //   467: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   470: pop
    //   471: aload_2
    //   472: iload 9
    //   474: invokevirtual 348	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   477: pop
    //   478: aload 5
    //   480: aload_2
    //   481: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   484: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   487: pop
    //   488: aload_1
    //   489: invokevirtual 352	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   492: invokevirtual 358	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   495: astore_2
    //   496: aload_2
    //   497: getfield 364	android/util/DisplayMetrics:widthPixels	I
    //   500: istore 9
    //   502: aload_2
    //   503: getfield 367	android/util/DisplayMetrics:heightPixels	I
    //   506: istore 8
    //   508: new 153	java/lang/StringBuilder
    //   511: astore_2
    //   512: aload_2
    //   513: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   516: aload_2
    //   517: ldc_w 369
    //   520: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: pop
    //   524: aload_2
    //   525: iload 9
    //   527: iload 8
    //   529: imul
    //   530: bipush 12
    //   532: imul
    //   533: iconst_4
    //   534: imul
    //   535: invokevirtual 348	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   538: pop
    //   539: aload 5
    //   541: aload_2
    //   542: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   545: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   548: pop
    //   549: aload 5
    //   551: ldc_w 371
    //   554: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   557: pop
    //   558: aload 7
    //   560: ifnull +200 -> 760
    //   563: aload 7
    //   565: ldc 34
    //   567: invokevirtual 375	android/os/BaseBundle:containsKey	(Ljava/lang/String;)Z
    //   570: ifeq +34 -> 604
    //   573: aload 7
    //   575: ldc 34
    //   577: invokevirtual 377	android/os/BaseBundle:getBoolean	(Ljava/lang/String;)Z
    //   580: ifeq +17 -> 597
    //   583: ldc_w 379
    //   586: astore_2
    //   587: aload 5
    //   589: aload_2
    //   590: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   593: pop
    //   594: goto +10 -> 604
    //   597: ldc_w 381
    //   600: astore_2
    //   601: goto -14 -> 587
    //   604: aload 7
    //   606: ldc 40
    //   608: iconst_0
    //   609: invokevirtual 182	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   612: ifeq +12 -> 624
    //   615: aload 5
    //   617: ldc_w 383
    //   620: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   623: pop
    //   624: aload 7
    //   626: ldc 49
    //   628: iconst_0
    //   629: invokevirtual 182	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   632: ifeq +12 -> 644
    //   635: aload 5
    //   637: ldc_w 385
    //   640: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   643: pop
    //   644: aload 7
    //   646: ldc 52
    //   648: iconst_0
    //   649: invokevirtual 182	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   652: ifeq +12 -> 664
    //   655: aload 5
    //   657: ldc_w 387
    //   660: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   663: pop
    //   664: aload 7
    //   666: ldc 31
    //   668: invokevirtual 375	android/os/BaseBundle:containsKey	(Ljava/lang/String;)Z
    //   671: ifeq +22 -> 693
    //   674: aload 7
    //   676: ldc 31
    //   678: invokevirtual 377	android/os/BaseBundle:getBoolean	(Ljava/lang/String;)Z
    //   681: ifeq +12 -> 693
    //   684: aload 5
    //   686: ldc_w 389
    //   689: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   692: pop
    //   693: aload 7
    //   695: ldc 37
    //   697: iconst_0
    //   698: invokevirtual 182	android/os/BaseBundle:getBoolean	(Ljava/lang/String;Z)Z
    //   701: ifeq +12 -> 713
    //   704: aload 5
    //   706: ldc_w 391
    //   709: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   712: pop
    //   713: aload 7
    //   715: ldc 46
    //   717: invokevirtual 394	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   720: astore 6
    //   722: aload 6
    //   724: ifnull +36 -> 760
    //   727: new 153	java/lang/StringBuilder
    //   730: astore_2
    //   731: aload_2
    //   732: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   735: aload_2
    //   736: ldc_w 396
    //   739: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   742: pop
    //   743: aload_2
    //   744: aload 6
    //   746: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   749: pop
    //   750: aload 5
    //   752: aload_2
    //   753: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   756: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   759: pop
    //   760: aload 7
    //   762: invokestatic 398	io/flutter/embedding/engine/loader/FlutterLoader:isLeakVM	(Landroid/os/Bundle;)Z
    //   765: ifeq +10 -> 775
    //   768: ldc_w 400
    //   771: astore_2
    //   772: goto +7 -> 779
    //   775: ldc_w 402
    //   778: astore_2
    //   779: new 153	java/lang/StringBuilder
    //   782: astore 7
    //   784: aload 7
    //   786: invokespecial 154	java/lang/StringBuilder:<init>	()V
    //   789: aload 7
    //   791: ldc_w 404
    //   794: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   797: pop
    //   798: aload 7
    //   800: aload_2
    //   801: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   804: pop
    //   805: aload 5
    //   807: aload 7
    //   809: invokevirtual 272	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   812: invokevirtual 263	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   815: pop
    //   816: invokestatic 410	android/os/SystemClock:uptimeMillis	()J
    //   819: lstore 10
    //   821: aload_0
    //   822: getfield 412	io/flutter/embedding/engine/loader/FlutterLoader:initStartTimestampMillis	J
    //   825: lstore 12
    //   827: aload_0
    //   828: getfield 123	io/flutter/embedding/engine/loader/FlutterLoader:flutterJNI	Lio/flutter/embedding/engine/FlutterJNI;
    //   831: aload_1
    //   832: aload 5
    //   834: iconst_0
    //   835: anewarray 414	java/lang/String
    //   838: invokevirtual 418	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   841: checkcast 420	[Ljava/lang/String;
    //   844: aconst_null
    //   845: aload 4
    //   847: getfield 423	io/flutter/embedding/engine/loader/FlutterLoader$InitResult:appStoragePath	Ljava/lang/String;
    //   850: aload 4
    //   852: getfield 288	io/flutter/embedding/engine/loader/FlutterLoader$InitResult:engineCachesPath	Ljava/lang/String;
    //   855: lload 10
    //   857: lload 12
    //   859: lsub
    //   860: invokevirtual 429	io/flutter/embedding/engine/FlutterJNI:init	(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //   863: aload_0
    //   864: iconst_1
    //   865: putfield 121	io/flutter/embedding/engine/loader/FlutterLoader:initialized	Z
    //   868: aload_3
    //   869: ifnull +7 -> 876
    //   872: aload_3
    //   873: invokevirtual 432	io/flutter/util/TraceSection:close	()V
    //   876: return
    //   877: astore_1
    //   878: aload_3
    //   879: ifnull +16 -> 895
    //   882: aload_3
    //   883: invokevirtual 432	io/flutter/util/TraceSection:close	()V
    //   886: goto +9 -> 895
    //   889: astore_2
    //   890: aload_1
    //   891: aload_2
    //   892: invokevirtual 437	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   895: aload_1
    //   896: athrow
    //   897: astore_1
    //   898: ldc 67
    //   900: ldc -30
    //   902: aload_1
    //   903: invokestatic 232	io/flutter/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   906: new 234	java/lang/RuntimeException
    //   909: dup
    //   910: aload_1
    //   911: invokespecial 237	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   914: athrow
    //   915: new 439	java/lang/IllegalStateException
    //   918: dup
    //   919: ldc_w 441
    //   922: invokespecial 444	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   925: athrow
    //   926: new 439	java/lang/IllegalStateException
    //   929: dup
    //   930: ldc_w 446
    //   933: invokespecial 444	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   936: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	937	0	this	FlutterLoader
    //   0	937	1	paramContext	Context
    //   0	937	2	paramArrayOfString	String[]
    //   29	854	3	localTraceSection	io.flutter.util.TraceSection
    //   42	809	4	localInitResult	InitResult
    //   47	786	5	localArrayList	java.util.ArrayList
    //   66	679	6	localObject1	Object
    //   98	710	7	localObject2	Object
    //   396	134	8	i	int
    //   406	124	9	j	int
    //   819	37	10	l1	long
    //   825	33	12	l2	long
    // Exception table:
    //   from	to	target	type
    //   30	127	877	finally
    //   131	138	877	finally
    //   138	317	877	finally
    //   317	365	877	finally
    //   365	384	877	finally
    //   389	398	877	finally
    //   413	455	877	finally
    //   455	558	877	finally
    //   563	583	877	finally
    //   587	594	877	finally
    //   604	624	877	finally
    //   624	644	877	finally
    //   644	664	877	finally
    //   664	693	877	finally
    //   693	713	877	finally
    //   713	722	877	finally
    //   727	760	877	finally
    //   760	768	877	finally
    //   779	868	877	finally
    //   882	886	889	finally
    //   24	30	897	java/lang/Exception
    //   872	876	897	java/lang/Exception
    //   890	895	897	java/lang/Exception
    //   895	897	897	java/lang/Exception
  }
  
  public void ensureInitializationCompleteAsync(Context paramContext, String[] paramArrayOfString, Handler paramHandler, Runnable paramRunnable)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      if (settings != null)
      {
        if (initialized)
        {
          paramHandler.post(paramRunnable);
          return;
        }
        executorService.execute(new a(this, paramContext, paramArrayOfString, paramHandler, paramRunnable, 0));
        return;
      }
      throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
    }
    throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
  }
  
  public String findAppBundlePath()
  {
    return flutterApplicationInfo.flutterAssetsDir;
  }
  
  public String getLookupKeyForAsset(String paramString)
  {
    return fullAssetPathFrom(paramString);
  }
  
  public String getLookupKeyForAsset(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = f.l("packages");
    String str = File.separator;
    localStringBuilder.append(str);
    localStringBuilder.append(paramString2);
    localStringBuilder.append(str);
    localStringBuilder.append(paramString1);
    return getLookupKeyForAsset(localStringBuilder.toString());
  }
  
  public boolean initialized()
  {
    return initialized;
  }
  
  public void startInitialization(Context paramContext)
  {
    startInitialization(paramContext, new Settings());
  }
  
  /* Error */
  public void startInitialization(Context paramContext, Settings paramSettings)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 246	io/flutter/embedding/engine/loader/FlutterLoader:settings	Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;
    //   4: ifnull +4 -> 8
    //   7: return
    //   8: invokestatic 244	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   11: invokestatic 214	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   14: if_acmpne +108 -> 122
    //   17: ldc_w 479
    //   20: invokestatic 254	io/flutter/util/TraceSection:scoped	(Ljava/lang/String;)Lio/flutter/util/TraceSection;
    //   23: astore_3
    //   24: aload_1
    //   25: invokevirtual 188	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   28: astore_1
    //   29: aload_0
    //   30: aload_2
    //   31: putfield 246	io/flutter/embedding/engine/loader/FlutterLoader:settings	Lio/flutter/embedding/engine/loader/FlutterLoader$Settings;
    //   34: aload_0
    //   35: invokestatic 410	android/os/SystemClock:uptimeMillis	()J
    //   38: putfield 412	io/flutter/embedding/engine/loader/FlutterLoader:initStartTimestampMillis	J
    //   41: aload_0
    //   42: aload_1
    //   43: invokestatic 485	io/flutter/embedding/engine/loader/ApplicationInfoLoader:load	(Landroid/content/Context;)Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   46: putfield 143	io/flutter/embedding/engine/loader/FlutterLoader:flutterApplicationInfo	Lio/flutter/embedding/engine/loader/FlutterApplicationInfo;
    //   49: aload_1
    //   50: ldc_w 487
    //   53: invokevirtual 327	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   56: checkcast 489	android/hardware/display/DisplayManager
    //   59: aload_0
    //   60: getfield 123	io/flutter/embedding/engine/loader/FlutterLoader:flutterJNI	Lio/flutter/embedding/engine/FlutterJNI;
    //   63: invokestatic 495	io/flutter/view/VsyncWaiter:getInstance	(Landroid/hardware/display/DisplayManager;Lio/flutter/embedding/engine/FlutterJNI;)Lio/flutter/view/VsyncWaiter;
    //   66: invokevirtual 497	io/flutter/view/VsyncWaiter:init	()V
    //   69: new 6	io/flutter/embedding/engine/loader/FlutterLoader$1
    //   72: astore_2
    //   73: aload_2
    //   74: aload_0
    //   75: aload_1
    //   76: invokespecial 500	io/flutter/embedding/engine/loader/FlutterLoader$1:<init>	(Lio/flutter/embedding/engine/loader/FlutterLoader;Landroid/content/Context;)V
    //   79: aload_0
    //   80: aload_0
    //   81: getfield 125	io/flutter/embedding/engine/loader/FlutterLoader:executorService	Ljava/util/concurrent/ExecutorService;
    //   84: aload_2
    //   85: invokeinterface 506 2 0
    //   90: putfield 202	io/flutter/embedding/engine/loader/FlutterLoader:initResultFuture	Ljava/util/concurrent/Future;
    //   93: aload_3
    //   94: ifnull +7 -> 101
    //   97: aload_3
    //   98: invokevirtual 432	io/flutter/util/TraceSection:close	()V
    //   101: return
    //   102: astore_1
    //   103: aload_3
    //   104: ifnull +16 -> 120
    //   107: aload_3
    //   108: invokevirtual 432	io/flutter/util/TraceSection:close	()V
    //   111: goto +9 -> 120
    //   114: astore_2
    //   115: aload_1
    //   116: aload_2
    //   117: invokevirtual 437	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   120: aload_1
    //   121: athrow
    //   122: new 439	java/lang/IllegalStateException
    //   125: dup
    //   126: ldc_w 508
    //   129: invokespecial 444	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	FlutterLoader
    //   0	133	1	paramContext	Context
    //   0	133	2	paramSettings	Settings
    //   23	85	3	localTraceSection	io.flutter.util.TraceSection
    // Exception table:
    //   from	to	target	type
    //   24	93	102	finally
    //   107	111	114	finally
  }
  
  public static class InitResult
  {
    public final String appStoragePath;
    public final String dataDirPath;
    public final String engineCachesPath;
    
    private InitResult(String paramString1, String paramString2, String paramString3)
    {
      appStoragePath = paramString1;
      engineCachesPath = paramString2;
      dataDirPath = paramString3;
    }
  }
  
  public static class Settings
  {
    private String logTag;
    
    public String getLogTag()
    {
      return logTag;
    }
    
    public void setLogTag(String paramString)
    {
      logTag = paramString;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.loader.FlutterLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */