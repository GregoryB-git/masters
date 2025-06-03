package io.flutter.embedding.engine.loader;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import io.flutter.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

class ResourceExtractor$ExtractTask
  extends AsyncTask<Void, Void, Void>
{
  private final AssetManager mAssetManager;
  private final String mDataDirPath;
  private final PackageManager mPackageManager;
  private final String mPackageName;
  private final HashSet<String> mResources;
  
  public ResourceExtractor$ExtractTask(String paramString1, HashSet<String> paramHashSet, String paramString2, PackageManager paramPackageManager, AssetManager paramAssetManager)
  {
    mDataDirPath = paramString1;
    mResources = paramHashSet;
    mAssetManager = paramAssetManager;
    mPackageName = paramString2;
    mPackageManager = paramPackageManager;
  }
  
  /* Error */
  private boolean extractAPK(File paramFile)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	io/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask:mResources	Ljava/util/HashSet;
    //   4: invokevirtual 48	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   7: astore_2
    //   8: aload_2
    //   9: invokeinterface 54 1 0
    //   14: ifeq +179 -> 193
    //   17: aload_2
    //   18: invokeinterface 58 1 0
    //   23: checkcast 60	java/lang/String
    //   26: astore_3
    //   27: new 62	java/io/File
    //   30: astore 4
    //   32: aload 4
    //   34: aload_1
    //   35: aload_3
    //   36: invokespecial 65	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   39: aload 4
    //   41: invokevirtual 68	java/io/File:exists	()Z
    //   44: ifeq +6 -> 50
    //   47: goto -39 -> 8
    //   50: aload 4
    //   52: invokevirtual 72	java/io/File:getParentFile	()Ljava/io/File;
    //   55: ifnull +12 -> 67
    //   58: aload 4
    //   60: invokevirtual 72	java/io/File:getParentFile	()Ljava/io/File;
    //   63: invokevirtual 75	java/io/File:mkdirs	()Z
    //   66: pop
    //   67: aload_0
    //   68: getfield 29	io/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask:mAssetManager	Landroid/content/res/AssetManager;
    //   71: aload_3
    //   72: invokevirtual 81	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   75: astore_3
    //   76: new 83	java/io/FileOutputStream
    //   79: astore 5
    //   81: aload 5
    //   83: aload 4
    //   85: invokespecial 86	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   88: aload_3
    //   89: aload 5
    //   91: invokestatic 90	io/flutter/embedding/engine/loader/ResourceExtractor:access$200	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   94: aload 5
    //   96: invokevirtual 95	java/io/OutputStream:close	()V
    //   99: aload_3
    //   100: ifnull -92 -> 8
    //   103: aload_3
    //   104: invokevirtual 98	java/io/InputStream:close	()V
    //   107: goto -99 -> 8
    //   110: astore 4
    //   112: aload 5
    //   114: invokevirtual 95	java/io/OutputStream:close	()V
    //   117: goto +12 -> 129
    //   120: astore 5
    //   122: aload 4
    //   124: aload 5
    //   126: invokevirtual 104	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   129: aload 4
    //   131: athrow
    //   132: astore 4
    //   134: aload_3
    //   135: ifnull +17 -> 152
    //   138: aload_3
    //   139: invokevirtual 98	java/io/InputStream:close	()V
    //   142: goto +10 -> 152
    //   145: astore_3
    //   146: aload 4
    //   148: aload_3
    //   149: invokevirtual 104	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   152: aload 4
    //   154: athrow
    //   155: astore_1
    //   156: ldc 106
    //   158: invokestatic 112	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: astore_2
    //   162: aload_2
    //   163: aload_1
    //   164: invokevirtual 116	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   167: invokevirtual 121	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: ldc 123
    //   173: aload_2
    //   174: invokevirtual 126	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: invokestatic 132	io/flutter/Log:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   180: aload_0
    //   181: getfield 25	io/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask:mDataDirPath	Ljava/lang/String;
    //   184: aload_0
    //   185: getfield 27	io/flutter/embedding/engine/loader/ResourceExtractor$ExtractTask:mResources	Ljava/util/HashSet;
    //   188: invokestatic 136	io/flutter/embedding/engine/loader/ResourceExtractor:access$100	(Ljava/lang/String;Ljava/util/HashSet;)V
    //   191: iconst_0
    //   192: ireturn
    //   193: iconst_1
    //   194: ireturn
    //   195: astore_3
    //   196: goto -188 -> 8
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	this	ExtractTask
    //   0	199	1	paramFile	File
    //   7	167	2	localObject1	Object
    //   26	113	3	localObject2	Object
    //   145	4	3	localThrowable1	Throwable
    //   195	1	3	localFileNotFoundException	java.io.FileNotFoundException
    //   30	54	4	localFile	File
    //   110	20	4	localObject3	Object
    //   132	21	4	localObject4	Object
    //   79	34	5	localFileOutputStream	java.io.FileOutputStream
    //   120	5	5	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   88	94	110	finally
    //   112	117	120	finally
    //   76	88	132	finally
    //   94	99	132	finally
    //   122	129	132	finally
    //   129	132	132	finally
    //   138	142	145	finally
    //   27	47	155	java/io/IOException
    //   50	67	155	java/io/IOException
    //   67	76	155	java/io/IOException
    //   103	107	155	java/io/IOException
    //   146	152	155	java/io/IOException
    //   152	155	155	java/io/IOException
    //   27	47	195	java/io/FileNotFoundException
    //   50	67	195	java/io/FileNotFoundException
    //   67	76	195	java/io/FileNotFoundException
    //   103	107	195	java/io/FileNotFoundException
    //   146	152	195	java/io/FileNotFoundException
    //   152	155	195	java/io/FileNotFoundException
  }
  
  public Void doInBackground(Void... paramVarArgs)
  {
    paramVarArgs = new File(mDataDirPath);
    String str = ResourceExtractor.access$000(paramVarArgs, mPackageManager, mPackageName);
    if (str == null) {
      return null;
    }
    ResourceExtractor.access$100(mDataDirPath, mResources);
    if (!extractAPK(paramVarArgs)) {
      return null;
    }
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramVarArgs, str);
      localFile.createNewFile();
    }
    catch (IOException paramVarArgs)
    {
      Log.w("ResourceExtractor", "Failed to write resource timestamp");
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.loader.ResourceExtractor.ExtractTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */