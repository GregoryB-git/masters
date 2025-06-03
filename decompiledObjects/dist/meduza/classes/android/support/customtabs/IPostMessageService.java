package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface IPostMessageService
  extends IInterface
{
  public static final String j = "android$support$customtabs$IPostMessageService".replace('$', '.');
  
  public abstract void D2();
  
  public abstract void P0();
  
  public static abstract class Stub
    extends Binder
    implements IPostMessageService
  {
    public Stub()
    {
      attachInterface(this, IPostMessageService.j);
    }
    
    public static IPostMessageService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(IPostMessageService.j);
      if ((localIInterface != null) && ((localIInterface instanceof IPostMessageService))) {
        return (IPostMessageService)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject = IPostMessageService.j;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface((String)localObject);
      }
      if (paramInt1 == 1598968902)
      {
        paramParcel2.writeString((String)localObject);
        return true;
      }
      Parcelable.Creator localCreator1 = null;
      localObject = null;
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        paramParcel1.readString();
        localCreator1 = Bundle.CREATOR;
        if (paramParcel1.readInt() != 0) {
          localObject = localCreator1.createFromParcel(paramParcel1);
        }
        paramParcel1 = (Bundle)localObject;
        D2();
      }
      else
      {
        ICustomTabsCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        Parcelable.Creator localCreator2 = Bundle.CREATOR;
        localObject = localCreator1;
        if (paramParcel1.readInt() != 0) {
          localObject = localCreator2.createFromParcel(paramParcel1);
        }
        paramParcel1 = (Bundle)localObject;
        P0();
      }
      paramParcel2.writeNoException();
      return true;
    }
    
    public static final class a
      implements IPostMessageService
    {
      public IBinder a;
      
      public a(IBinder paramIBinder)
      {
        a = paramIBinder;
      }
      
      public final IBinder asBinder()
      {
        return a;
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.customtabs.IPostMessageService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */