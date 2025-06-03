package m6;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.common.zza;

public final class w0
  extends zza
  implements b0
{
  public w0(IBinder paramIBinder)
  {
    super(paramIBinder, "com.google.android.gms.common.internal.ICertData");
  }
  
  public final int zzc()
  {
    Parcel localParcel = zzB(2, zza());
    int i = localParcel.readInt();
    localParcel.recycle();
    return i;
  }
  
  public final IObjectWrapper zzd()
  {
    Parcel localParcel = zzB(1, zza());
    IObjectWrapper localIObjectWrapper = IObjectWrapper.Stub.asInterface(localParcel.readStrongBinder());
    localParcel.recycle();
    return localIObjectWrapper;
  }
}

/* Location:
 * Qualified Name:     m6.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */