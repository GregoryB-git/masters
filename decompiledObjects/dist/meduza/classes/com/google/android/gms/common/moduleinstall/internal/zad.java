package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import q6.a;
import q6.b;
import q6.c;

public abstract class zad
  extends zab
{
  public zad()
  {
    super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
  }
  
  public final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3)
        {
          if (paramInt1 != 4) {
            return false;
          }
          paramParcel2 = (Status)zac.zaa(paramParcel1, Status.CREATOR);
          zac.zab(paramParcel1);
          throw new UnsupportedOperationException();
        }
        paramParcel2 = (Status)zac.zaa(paramParcel1, Status.CREATOR);
        paramParcel2 = (b)zac.zaa(paramParcel1, b.CREATOR);
        zac.zab(paramParcel1);
        throw new UnsupportedOperationException();
      }
      paramParcel2 = (Status)zac.zaa(paramParcel1, Status.CREATOR);
      paramParcel2 = (c)zac.zaa(paramParcel1, c.CREATOR);
      zac.zab(paramParcel1);
      throw new UnsupportedOperationException();
    }
    paramParcel2 = (Status)zac.zaa(paramParcel1, Status.CREATOR);
    paramParcel2 = (a)zac.zaa(paramParcel1, a.CREATOR);
    zac.zab(paramParcel1);
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.moduleinstall.internal.zad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */