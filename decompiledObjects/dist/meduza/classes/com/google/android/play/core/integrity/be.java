package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m7.g;
import m7.w;

final class be
  extends w
{
  public be(bn parambn, TaskCompletionSource paramTaskCompletionSource, Context paramContext)
  {
    super(paramTaskCompletionSource);
  }
  
  public final void b()
  {
    Object localObject1 = a;
    TaskCompletionSource localTaskCompletionSource = bn.f(b);
    Object localObject2 = g.a;
    try
    {
      localObject1 = ((Context)localObject1).getPackageManager().getPackageInfo("com.android.vending", 64);
      localObject2 = applicationInfo;
      if ((localObject2 != null) && (enabled) && (g.a(signatures))) {
        i = versionCode;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      int i;
      for (;;) {}
    }
    i = 0;
    localTaskCompletionSource.trySetResult(Integer.valueOf(i));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.be
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */