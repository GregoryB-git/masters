package androidx.core.content.pm;

import a3;
import android.content.pm.PermissionInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
class PermissionInfoCompat$Api28Impl
{
  @DoNotInline
  public static int getProtection(PermissionInfo paramPermissionInfo)
  {
    return a3.c(paramPermissionInfo);
  }
  
  @DoNotInline
  public static int getProtectionFlags(PermissionInfo paramPermissionInfo)
  {
    return a3.D(paramPermissionInfo);
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.pm.PermissionInfoCompat.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */