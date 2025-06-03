package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import m7.e;
import m7.g;
import m7.m;
import m7.v;
import p2.m0;

final class aj
{
  public final e a;
  private final v b;
  private final String c;
  private final at d;
  private final k e;
  
  public aj(Context paramContext, v paramv, at paramat, k paramk)
  {
    c = paramContext.getPackageName();
    b = paramv;
    d = paramat;
    e = paramk;
    paramat = g.a;
    try
    {
      if (getPackageManagergetApplicationInfo"com.android.vending"0enabled)
      {
        paramat = getPackageManagergetPackageInfo"com.android.vending"64signatures;
        if (g.a(paramat)) {
          i = 1;
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramat)
    {
      int i;
      for (;;) {}
    }
    i = 0;
    if (i == 0)
    {
      paramv.getClass();
      if (Log.isLoggable("PlayCore", 6)) {
        Log.e("PlayCore", v.c(a, "Phonesky is not installed.", new Object[0]));
      }
      a = null;
      return;
    }
    a = new e(paramContext, paramv, "IntegrityService", ak.a, ae.a);
  }
  
  public static Bundle a(aj paramaj, byte[] paramArrayOfByte, Long paramLong, Parcelable paramParcelable)
  {
    paramParcelable = new Bundle();
    paramParcelable.putString("package.name", c);
    paramParcelable.putByteArray("nonce", paramArrayOfByte);
    paramParcelable.putInt("playcore.integrity.version.major", 1);
    paramParcelable.putInt("playcore.integrity.version.minor", 3);
    paramParcelable.putInt("playcore.integrity.version.patch", 0);
    if (paramLong != null) {
      paramParcelable.putLong("cloud.prj", paramLong.longValue());
    }
    paramaj = new ArrayList();
    paramaj.add(new m(3, System.currentTimeMillis()));
    paramParcelable.putParcelableArrayList("event_timestamps", new ArrayList(m0.f(paramaj)));
    return paramParcelable;
  }
  
  public final Task b(Activity paramActivity, Bundle paramBundle)
  {
    if (a == null) {
      return Tasks.forException(new IntegrityServiceException(-2, null));
    }
    int i = paramBundle.getInt("dialog.intent.type");
    b.b("requestAndShowDialog(%s, %s)", new Object[] { c, Integer.valueOf(i) });
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    a.c(new ag(this, localTaskCompletionSource, paramBundle, paramActivity, localTaskCompletionSource, i), localTaskCompletionSource);
    return localTaskCompletionSource.getTask();
  }
  
  public final Task c(IntegrityTokenRequest paramIntegrityTokenRequest)
  {
    if (a == null) {
      return Tasks.forException(new IntegrityServiceException(-2, null));
    }
    try
    {
      byte[] arrayOfByte = Base64.decode(paramIntegrityTokenRequest.nonce(), 10);
      Long localLong = paramIntegrityTokenRequest.cloudProjectNumber();
      if ((paramIntegrityTokenRequest instanceof ao)) {
        localObject = (ao)paramIntegrityTokenRequest;
      }
      b.b("requestIntegrityToken(%s)", new Object[] { paramIntegrityTokenRequest });
      Object localObject = new TaskCompletionSource();
      a.c(new af(this, (TaskCompletionSource)localObject, arrayOfByte, localLong, null, (TaskCompletionSource)localObject, paramIntegrityTokenRequest), (TaskCompletionSource)localObject);
      return ((TaskCompletionSource)localObject).getTask();
    }
    catch (IllegalArgumentException paramIntegrityTokenRequest) {}
    return Tasks.forException(new IntegrityServiceException(-13, paramIntegrityTokenRequest));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */