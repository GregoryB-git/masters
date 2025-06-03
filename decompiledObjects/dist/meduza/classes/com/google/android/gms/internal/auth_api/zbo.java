package com.google.android.gms.internal.auth_api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zbo
  extends zbb
  implements com.google.android.gms.internal.auth-api.zbp
{
  public zbo()
  {
    super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
  }
  
  public final boolean zba(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (Status)zbc.zba(paramParcel1, Status.CREATOR);
      PendingIntent localPendingIntent = (PendingIntent)zbc.zba(paramParcel1, PendingIntent.CREATOR);
      zbc.zbb(paramParcel1);
      zbb(paramParcel2, localPendingIntent);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */