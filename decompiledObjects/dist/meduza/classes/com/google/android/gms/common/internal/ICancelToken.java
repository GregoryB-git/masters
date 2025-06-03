package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

public abstract interface ICancelToken
  extends IInterface
{
  public abstract void cancel();
  
  public static abstract class Stub
    extends zzb
    implements ICancelToken
  {
    public Stub()
    {
      super();
    }
    
    public static ICancelToken asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
      if ((localIInterface instanceof ICancelToken)) {
        return (ICancelToken)localIInterface;
      }
      return new m(paramIBinder);
    }
    
    public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 == 2)
      {
        cancel();
        return true;
      }
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.ICancelToken
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */