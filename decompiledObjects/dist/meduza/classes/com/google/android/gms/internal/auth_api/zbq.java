package com.google.android.gms.internal.auth_api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zbq
  extends zbb
  implements com.google.android.gms.internal.auth-api.zbr
{
  public zbq()
  {
    super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
  }
  
  public final boolean zba(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      Status localStatus = (Status)zbc.zba(paramParcel1, Status.CREATOR);
      paramParcel2 = (PendingIntent)zbc.zba(paramParcel1, PendingIntent.CREATOR);
      zbc.zbb(paramParcel1);
      zbb(localStatus, paramParcel2);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */