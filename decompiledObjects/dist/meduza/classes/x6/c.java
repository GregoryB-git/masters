package x6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import v6.e;

public final class c
{
  public final Context a;
  
  public c(Context paramContext)
  {
    a = paramContext;
  }
  
  public final ApplicationInfo a(int paramInt, String paramString)
  {
    return a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  public final PackageInfo b(int paramInt, String paramString)
  {
    return a.getPackageManager().getPackageInfo(paramString, paramInt);
  }
  
  public final boolean c()
  {
    if (Binder.getCallingUid() == Process.myUid()) {
      return b.d0(a);
    }
    if (e.a())
    {
      String str = a.getPackageManager().getNameForUid(Binder.getCallingUid());
      if (str != null) {
        return c0.b.A(a.getPackageManager(), str);
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     x6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */