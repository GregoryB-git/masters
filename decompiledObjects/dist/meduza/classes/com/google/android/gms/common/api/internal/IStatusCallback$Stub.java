package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class IStatusCallback$Stub
  extends zab
  implements IStatusCallback
{
  public IStatusCallback$Stub()
  {
    super("com.google.android.gms.common.api.internal.IStatusCallback");
  }
  
  public static IStatusCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
    if ((localIInterface instanceof IStatusCallback)) {
      return (IStatusCallback)localIInterface;
    }
    return new b(paramIBinder);
  }
  
  public final boolean zaa(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 == 1)
    {
      paramParcel2 = (Status)zac.zaa(paramParcel1, Status.CREATOR);
      zac.zab(paramParcel1);
      onResult(paramParcel2);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.api.internal.IStatusCallback.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */