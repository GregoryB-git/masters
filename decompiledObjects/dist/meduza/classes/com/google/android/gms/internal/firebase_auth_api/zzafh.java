package com.google.android.gms.internal.firebase_auth_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import p6.a;

final class zzafh
  extends BroadcastReceiver
{
  private final String zza;
  
  public zzafh(com.google.android.gms.internal.firebase-auth-api.zzafd paramzzafd, String paramString)
  {
    zza = paramString;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(paramIntent.getAction()))
    {
      paramIntent = paramIntent.getExtras();
      if (get"com.google.android.gms.auth.api.phone.EXTRA_STATUS"a == 0)
      {
        String str = (String)paramIntent.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
        paramIntent = (zzafk)zzafd.zza(zzb).get(zza);
        if (paramIntent == null)
        {
          zzafd.zza().c("Verification code received with no active retrieval session.", new Object[0]);
        }
        else
        {
          str = zzafd.zza(str);
          zze = str;
          if (str == null) {
            zzafd.zza().c("Unable to extract verification code.", new Object[0]);
          } else if (!zzae.zzc(zzd)) {
            zzafd.zzb(zzb, zza);
          }
        }
      }
      paramContext.getApplicationContext().unregisterReceiver(this);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */