package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class IResultReceiver$Stub
  extends Binder
  implements IResultReceiver
{
  public IResultReceiver$Stub()
  {
    attachInterface(this, IResultReceiver.o);
  }
  
  public static IResultReceiver asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface(IResultReceiver.o);
    if ((localIInterface != null) && ((localIInterface instanceof IResultReceiver))) {
      return (IResultReceiver)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = IResultReceiver.o;
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface(str);
    }
    if (paramInt1 == 1598968902)
    {
      paramParcel2.writeString(str);
      return true;
    }
    if (paramInt1 != 1) {
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    paramInt1 = paramParcel1.readInt();
    paramParcel2 = Bundle.CREATOR;
    if (paramParcel1.readInt() != 0) {
      paramParcel1 = paramParcel2.createFromParcel(paramParcel1);
    } else {
      paramParcel1 = null;
    }
    paramParcel1 = (Bundle)paramParcel1;
    ((a.b)this).a3(paramInt1, paramParcel1);
    return true;
  }
  
  public static final class a
    implements IResultReceiver
  {
    public IBinder a;
    
    public a(IBinder paramIBinder)
    {
      a = paramIBinder;
    }
    
    public final void a3(int paramInt, Bundle paramBundle)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken(IResultReceiver.o);
        localParcel.writeInt(paramInt);
        if (paramBundle != null)
        {
          localParcel.writeInt(1);
          paramBundle.writeToParcel(localParcel, 0);
        }
        else
        {
          localParcel.writeInt(0);
        }
        a.transact(1, localParcel, null, 1);
        return;
      }
      finally
      {
        localParcel.recycle();
      }
    }
    
    public final IBinder asBinder()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.os.IResultReceiver.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */