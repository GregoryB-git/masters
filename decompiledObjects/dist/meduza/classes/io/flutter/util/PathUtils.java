package io.flutter.util;

import a0.e;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.File;

public final class PathUtils
{
  public static String getCacheDirectory(Context paramContext)
  {
    Object localObject1 = paramContext.getCodeCacheDir();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = paramContext.getCacheDir();
    }
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new File(getDataDirPath(paramContext), "cache");
    }
    return ((File)localObject1).getPath();
  }
  
  private static String getDataDirPath(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return e.d(paramContext).getPath();
    }
    return getApplicationInfodataDir;
  }
  
  public static String getDataDirectory(Context paramContext)
  {
    File localFile1 = paramContext.getDir("flutter", 0);
    File localFile2 = localFile1;
    if (localFile1 == null) {
      localFile2 = new File(getDataDirPath(paramContext), "app_flutter");
    }
    return localFile2.getPath();
  }
  
  public static String getFilesDir(Context paramContext)
  {
    File localFile1 = paramContext.getFilesDir();
    File localFile2 = localFile1;
    if (localFile1 == null) {
      localFile2 = new File(getDataDirPath(paramContext), "files");
    }
    return localFile2.getPath();
  }
}

/* Location:
 * Qualified Name:     io.flutter.util.PathUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */