package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import q6.d;
import r6.a;

public abstract class zag
  extends zab
  implements a
{
  public zag()
  {
    super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
  }
  
  public final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (d)zac.zaa(paramParcel1, d.CREATOR);
      zac.zab(paramParcel1);
      K1();
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.moduleinstall.internal.zag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */