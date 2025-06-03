package y6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class e
  extends zza
{
  public e(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
  }
  
  public final IObjectWrapper d3(IObjectWrapper paramIObjectWrapper, String paramString, int paramInt)
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramIObjectWrapper = zzB(4, localParcel);
    paramString = IObjectWrapper.Stub.asInterface(paramIObjectWrapper.readStrongBinder());
    paramIObjectWrapper.recycle();
    return paramString;
  }
  
  public final IObjectWrapper e3(IObjectWrapper paramIObjectWrapper, String paramString, boolean paramBoolean, long paramLong)
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramBoolean);
    localParcel.writeLong(paramLong);
    paramString = zzB(7, localParcel);
    paramIObjectWrapper = IObjectWrapper.Stub.asInterface(paramString.readStrongBinder());
    paramString.recycle();
    return paramIObjectWrapper;
  }
  
  public final IObjectWrapper g(IObjectWrapper paramIObjectWrapper, String paramString, int paramInt)
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    paramString = zzB(2, localParcel);
    paramIObjectWrapper = IObjectWrapper.Stub.asInterface(paramString.readStrongBinder());
    paramString.recycle();
    return paramIObjectWrapper;
  }
  
  public final IObjectWrapper r(IObjectWrapper paramIObjectWrapper1, String paramString, int paramInt, IObjectWrapper paramIObjectWrapper2)
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    zzc.zze(localParcel, paramIObjectWrapper2);
    paramString = zzB(8, localParcel);
    paramIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramString.readStrongBinder());
    paramString.recycle();
    return paramIObjectWrapper1;
  }
}

/* Location:
 * Qualified Name:     y6.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */