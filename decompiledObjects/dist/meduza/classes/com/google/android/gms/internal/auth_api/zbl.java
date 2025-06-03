package com.google.android.gms.internal.auth_api;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import d6.c;

public abstract class zbl
  extends zbb
  implements com.google.android.gms.internal.auth-api.zbm
{
  public zbl()
  {
    super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
  }
  
  public final boolean zba(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (Status)zbc.zba(paramParcel1, Status.CREATOR);
      c localc = (c)zbc.zba(paramParcel1, c.CREATOR);
      zbc.zbb(paramParcel1);
      zbb(paramParcel2, localc);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api.zbl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */