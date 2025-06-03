package T5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.File;

public abstract class c
{
  public static String a(Context paramContext)
  {
    Object localObject1 = paramContext.getCodeCacheDir();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = paramContext.getCacheDir();
    }
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new File(b(paramContext), "cache");
    }
    return ((File)localObject1).getPath();
  }
  
  public static String b(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return b.a(paramContext).getPath();
    }
    return getApplicationInfodataDir;
  }
  
  public static String c(Context paramContext)
  {
    File localFile1 = paramContext.getDir("flutter", 0);
    File localFile2 = localFile1;
    if (localFile1 == null) {
      localFile2 = new File(b(paramContext), "app_flutter");
    }
    return localFile2.getPath();
  }
  
  public static String d(Context paramContext)
  {
    File localFile1 = paramContext.getFilesDir();
    File localFile2 = localFile1;
    if (localFile1 == null) {
      localFile2 = new File(b(paramContext), "files");
    }
    return localFile2.getPath();
  }
}

/* Location:
 * Qualified Name:     T5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */