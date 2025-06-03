package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import m6.e;
import m6.j;
import m6.l0;

public abstract class zzac
  extends zzb
  implements e
{
  public zzac()
  {
    super("com.google.android.gms.common.internal.IGmsCallbacks");
  }
  
  public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1;
    Object localObject2;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        paramInt1 = paramParcel1.readInt();
        localObject1 = paramParcel1.readStrongBinder();
        localObject2 = (l0)zzc.zza(paramParcel1, l0.CREATOR);
        zzc.zzb(paramParcel1);
        paramParcel1 = (zzd)this;
        a locala = a;
        j.j(locala, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        j.i(localObject2);
        a.zzj(locala, (l0)localObject2);
        localObject2 = a;
        j.j(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.onPostInitHandler(paramInt1, (IBinder)localObject1, (Bundle)localObject2, b);
        a = null;
      }
      else
      {
        paramParcel1.readInt();
        localObject1 = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
        zzc.zzb(paramParcel1);
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
      }
    }
    else
    {
      paramInt1 = paramParcel1.readInt();
      localObject2 = paramParcel1.readStrongBinder();
      localObject1 = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
      zzc.zzb(paramParcel1);
      paramParcel1 = (zzd)this;
      j.j(a, "onPostInitComplete can be called only once per call to getRemoteService");
      a.onPostInitHandler(paramInt1, (IBinder)localObject2, (Bundle)localObject1, b);
      a = null;
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.common.internal.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */