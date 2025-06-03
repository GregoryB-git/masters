package com.google.android.gms.internal.auth_api_phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import e6.a;
import l6.q.a;

public final class zzab
  extends a
{
  public zzab(Activity paramActivity)
  {
    super(paramActivity);
  }
  
  public zzab(Context paramContext)
  {
    super(paramContext);
  }
  
  public final Task<Void> startSmsRetriever()
  {
    q.a locala = new q.a();
    a = new zzx(this);
    c = new j6.d[] { zzac.zzc };
    d = 1567;
    return doWrite(locala.a());
  }
  
  public final Task<Void> startSmsUserConsent(String paramString)
  {
    q.a locala = new q.a();
    a = new zzy(this, paramString);
    c = new j6.d[] { zzac.zzd };
    d = 1568;
    return doWrite(locala.a());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */