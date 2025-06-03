package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;

public abstract interface IAccountAccessor
  extends IInterface
{
  public abstract Account zzb();
  
  public static abstract class Stub
    extends zzb
    implements IAccountAccessor
  {
    public Stub()
    {
      super();
    }
    
    public static IAccountAccessor asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      if ((localIInterface instanceof IAccountAccessor)) {
        return (IAccountAccessor)localIInterface;
      }
      return new l(paramIBinder);
    }
    
    public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      if (paramInt1 != 2) {
        return false;
      }
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.IAccountAccessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */