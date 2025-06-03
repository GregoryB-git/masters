package K2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b
  extends Binder
  implements IInterface
{
  public b(String paramString)
  {
    attachInterface(this, paramString);
  }
  
  public abstract boolean Z0(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2);
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 > 16777215)
    {
      if (super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2)) {
        return true;
      }
    }
    else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
    }
    return Z0(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}

/* Location:
 * Qualified Name:     K2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */