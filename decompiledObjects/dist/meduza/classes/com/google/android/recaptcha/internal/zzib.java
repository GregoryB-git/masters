package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.gms.internal.base.a;

public final class zzib
  implements zzih
{
  private final Context zza;
  
  public zzib(Context paramContext)
  {
    zza = paramContext;
  }
  
  public final Object zza(Object... paramVarArgs)
  {
    paramVarArgs = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    if (Build.VERSION.SDK_INT >= 33) {
      paramVarArgs = a.j(zza, paramVarArgs);
    } else {
      paramVarArgs = zza.registerReceiver(null, paramVarArgs);
    }
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.getIntExtra("health", -1);
      int j = paramVarArgs.getIntExtra("level", -1);
      int k = paramVarArgs.getIntExtra("plugged", -1);
      boolean bool = paramVarArgs.getBooleanExtra("present", false);
      int m = paramVarArgs.getIntExtra("scale", -1);
      int n = paramVarArgs.getIntExtra("status", -1);
      String str1 = paramVarArgs.getStringExtra("technology");
      String str2 = str1;
      if (str1 == null) {
        str2 = "";
      }
      return new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Boolean.valueOf(bool), Integer.valueOf(m), Integer.valueOf(n), str2, Integer.valueOf(paramVarArgs.getIntExtra("temperature", -1)), Integer.valueOf(paramVarArgs.getIntExtra("voltage", -1)) };
    }
    throw new zzce(7, 19, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzib
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */