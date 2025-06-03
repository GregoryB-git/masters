package O1;

import Y1.B;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class V$b
{
  public final int a()
  {
    Q.l();
    return V.i();
  }
  
  public final void b(Context paramContext)
  {
    if (paramContext == null) {
      return;
    }
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if (localApplicationInfo == null) {
        paramContext = null;
      } else {
        paramContext = metaData;
      }
      if (paramContext == null) {
        return;
      }
      if (V.i() == 0) {
        e(metaData.getInt("com.facebook.sdk.WebDialogTheme"));
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final V c(Context paramContext, String paramString, Bundle paramBundle, int paramInt, V.d paramd)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    V.s(paramContext);
    return new V(paramContext, paramString, paramBundle, paramInt, B.q, paramd, null);
  }
  
  public final V d(Context paramContext, String paramString, Bundle paramBundle, int paramInt, B paramB, V.d paramd)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramB, "targetApp");
    V.s(paramContext);
    return new V(paramContext, paramString, paramBundle, paramInt, paramB, paramd, null);
  }
  
  public final void e(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = V.f();
    }
    V.n(paramInt);
  }
}

/* Location:
 * Qualified Name:     O1.V.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */