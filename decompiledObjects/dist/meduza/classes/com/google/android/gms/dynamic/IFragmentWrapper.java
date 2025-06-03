package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract interface IFragmentWrapper
  extends IInterface
{
  public abstract void B(boolean paramBoolean);
  
  public abstract void G0(Intent paramIntent);
  
  public abstract void I2(boolean paramBoolean);
  
  public abstract void P1(IObjectWrapper paramIObjectWrapper);
  
  public abstract void U(boolean paramBoolean);
  
  public abstract boolean Y2();
  
  public abstract void Z1(IObjectWrapper paramIObjectWrapper);
  
  public abstract void q2(int paramInt, Intent paramIntent);
  
  public abstract void w0(boolean paramBoolean);
  
  public abstract int zzb();
  
  public abstract int zzc();
  
  public abstract Bundle zzd();
  
  public abstract IFragmentWrapper zze();
  
  public abstract IFragmentWrapper zzf();
  
  public abstract IObjectWrapper zzg();
  
  public abstract IObjectWrapper zzh();
  
  public abstract IObjectWrapper zzi();
  
  public abstract String zzj();
  
  public abstract boolean zzs();
  
  public abstract boolean zzt();
  
  public abstract boolean zzu();
  
  public abstract boolean zzv();
  
  public abstract boolean zzw();
  
  public abstract boolean zzx();
  
  public abstract boolean zzy();
  
  public abstract boolean zzz();
  
  public static abstract class Stub
    extends zzb
    implements IFragmentWrapper
  {
    public Stub()
    {
      super();
    }
    
    public static IFragmentWrapper asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
      if ((localIInterface instanceof IFragmentWrapper)) {
        return (IFragmentWrapper)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject;
      boolean bool;
      switch (paramInt1)
      {
      default: 
        return false;
      case 27: 
        localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
        zzc.zzb(paramParcel1);
        Z1((IObjectWrapper)localObject);
        break;
      case 26: 
        localObject = (Intent)zzc.zza(paramParcel1, Intent.CREATOR);
        paramInt1 = paramParcel1.readInt();
        zzc.zzb(paramParcel1);
        q2(paramInt1, (Intent)localObject);
        break;
      case 25: 
        localObject = (Intent)zzc.zza(paramParcel1, Intent.CREATOR);
        zzc.zzb(paramParcel1);
        G0((Intent)localObject);
        break;
      case 24: 
        bool = zzc.zzf(paramParcel1);
        zzc.zzb(paramParcel1);
        I2(bool);
        break;
      case 23: 
        bool = zzc.zzf(paramParcel1);
        zzc.zzb(paramParcel1);
        w0(bool);
        break;
      case 22: 
        bool = zzc.zzf(paramParcel1);
        zzc.zzb(paramParcel1);
        U(bool);
        break;
      case 21: 
        bool = zzc.zzf(paramParcel1);
        zzc.zzb(paramParcel1);
        B(bool);
        break;
      case 20: 
        localObject = IObjectWrapper.Stub.asInterface(paramParcel1.readStrongBinder());
        zzc.zzb(paramParcel1);
        P1((IObjectWrapper)localObject);
        paramParcel2.writeNoException();
        break;
      case 19: 
        paramInt1 = Y2();
        break;
      case 18: 
        paramInt1 = zzz();
        break;
      case 17: 
        paramInt1 = zzy();
        break;
      case 16: 
        paramInt1 = zzx();
        break;
      case 15: 
        paramInt1 = zzw();
        break;
      case 14: 
        paramInt1 = zzv();
        break;
      case 13: 
        paramInt1 = zzu();
        break;
      case 12: 
        paramParcel1 = zzi();
        break;
      case 11: 
        paramInt1 = zzt();
        break;
      case 10: 
        paramInt1 = zzc();
        break;
      case 9: 
        paramParcel1 = zzf();
        break;
      case 8: 
        paramParcel1 = zzj();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        break;
      case 7: 
        paramInt1 = zzs();
        paramParcel2.writeNoException();
        paramInt2 = zzc.zza;
        break;
      case 6: 
        paramParcel1 = zzh();
        break;
      case 5: 
        paramParcel1 = zze();
        break;
      case 4: 
        paramInt1 = zzb();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        break;
      case 3: 
        paramParcel1 = zzd();
        paramParcel2.writeNoException();
        zzc.zzd(paramParcel2, paramParcel1);
        break;
      }
      paramParcel1 = zzg();
      paramParcel2.writeNoException();
      zzc.zze(paramParcel2, paramParcel1);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.dynamic.IFragmentWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */