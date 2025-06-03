package d2;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.ComponentInfoFlags;
import android.content.pm.ServiceInfo;

public final class n
{
  public static ServiceInfo a(PackageManager paramPackageManager, ComponentName paramComponentName, PackageManager.ComponentInfoFlags paramComponentInfoFlags)
  {
    return paramPackageManager.getServiceInfo(paramComponentName, paramComponentInfoFlags);
  }
  
  public static PackageManager.ComponentInfoFlags b(long paramLong)
  {
    return PackageManager.ComponentInfoFlags.of(paramLong);
  }
}

/* Location:
 * Qualified Name:     d2.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */