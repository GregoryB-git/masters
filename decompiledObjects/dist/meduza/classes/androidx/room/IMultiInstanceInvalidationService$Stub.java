package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import ec.i;
import java.util.Map;

public abstract class IMultiInstanceInvalidationService$Stub
  extends Binder
  implements IMultiInstanceInvalidationService
{
  public IMultiInstanceInvalidationService$Stub()
  {
    attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
  }
  
  public static IMultiInstanceInvalidationService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
    if ((localIInterface != null) && ((localIInterface instanceof IMultiInstanceInvalidationService))) {
      return (IMultiInstanceInvalidationService)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel arg2, Parcel paramParcel2, int paramInt2)
  {
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      ???.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
    }
    if (paramInt1 != 1598968902)
    {
      Object localObject;
      MultiInstanceInvalidationService localMultiInstanceInvalidationService;
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2)
        {
          if (paramInt1 != 3) {
            return super.onTransact(paramInt1, ???, paramParcel2, paramInt2);
          }
          paramInt1 = ???.readInt();
          ??? = ???.createStringArray();
          ((MultiInstanceInvalidationService.binder.1)this).K2(paramInt1, ???);
        }
        else
        {
          localObject = IMultiInstanceInvalidationCallback.Stub.asInterface(???.readStrongBinder());
          paramInt1 = ???.readInt();
          ??? = (MultiInstanceInvalidationService.binder.1)this;
          i.e(localObject, "callback");
          localMultiInstanceInvalidationService = a;
        }
      }
      else
      {
        synchronized (c)
        {
          c.unregister((IInterface)localObject);
          localObject = (String)b.remove(Integer.valueOf(paramInt1));
          paramParcel2.writeNoException();
        }
        ??? = ???.readString();
        paramInt1 = ((MultiInstanceInvalidationService.binder.1)this).B0((IMultiInstanceInvalidationCallback)localObject, ???);
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
      }
      return true;
    }
    paramParcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
    return true;
  }
  
  public static final class a
    implements IMultiInstanceInvalidationService
  {
    public IBinder a;
    
    public a(IBinder paramIBinder)
    {
      a = paramIBinder;
    }
    
    public final int B0(IMultiInstanceInvalidationCallback paramIMultiInstanceInvalidationCallback, String paramString)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
        localParcel1.writeStrongInterface(paramIMultiInstanceInvalidationCallback);
        localParcel1.writeString(paramString);
        a.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public final void K2(int paramInt, String[] paramArrayOfString)
    {
      Parcel localParcel = Parcel.obtain();
      try
      {
        localParcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
        localParcel.writeInt(paramInt);
        localParcel.writeStringArray(paramArrayOfString);
        a.transact(3, localParcel, null, 1);
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
 * Qualified Name:     androidx.room.IMultiInstanceInvalidationService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */