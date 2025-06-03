package androidx.core.content;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import d;

@RequiresApi(30)
class PackageManagerCompat$Api30Impl
{
  public static boolean areUnusedAppRestrictionsEnabled(@NonNull Context paramContext)
  {
    return d.x(paramContext.getPackageManager()) ^ true;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.PackageManagerCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */