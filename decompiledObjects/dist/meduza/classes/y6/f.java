package y6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class f
  extends zza
{
  public f(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
  }
  
  public final IObjectWrapper g(IObjectWrapper paramIObjectWrapper1, String paramString, int paramInt, IObjectWrapper paramIObjectWrapper2)
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    zzc.zze(localParcel, paramIObjectWrapper2);
    paramString = zzB(2, localParcel);
    paramIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramString.readStrongBinder());
    paramString.recycle();
    return paramIObjectWrapper1;
  }
  
  public final IObjectWrapper r(IObjectWrapper paramIObjectWrapper1, String paramString, int paramInt, IObjectWrapper paramIObjectWrapper2)
  {
    Parcel localParcel = zza();
    zzc.zze(localParcel, paramIObjectWrapper1);
    localParcel.writeString(paramString);
    localParcel.writeInt(paramInt);
    zzc.zze(localParcel, paramIObjectWrapper2);
    paramString = zzB(3, localParcel);
    paramIObjectWrapper1 = IObjectWrapper.Stub.asInterface(paramString.readStrongBinder());
    paramString.recycle();
    return paramIObjectWrapper1;
  }
}

/* Location:
 * Qualified Name:     y6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */