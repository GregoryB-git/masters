package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zaj
  extends zab
{
  public zaj()
  {
    super("com.google.android.gms.common.internal.service.ICommonCallbacks");
  }
  
  public final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      paramParcel1.readInt();
      zac.zab(paramParcel1);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.service.zaj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */