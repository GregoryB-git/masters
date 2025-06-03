package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.PackageInfoFlags;

public final class d$a
{
  public static PackageInfo a(PackageManager paramPackageManager, Context paramContext)
  {
    return paramPackageManager.getPackageInfo(paramContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */