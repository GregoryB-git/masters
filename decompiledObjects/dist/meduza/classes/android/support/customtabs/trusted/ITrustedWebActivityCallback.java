package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface ITrustedWebActivityCallback
  extends IInterface
{
  public static final String k = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');
  
  public abstract void I();
  
  public static abstract class Stub
    extends Binder
    implements ITrustedWebActivityCallback
  {
    public Stub()
    {
      attachInterface(this, ITrustedWebActivityCallback.k);
    }
    
    public static ITrustedWebActivityCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(ITrustedWebActivityCallback.k);
      if ((localIInterface != null) && ((localIInterface instanceof ITrustedWebActivityCallback))) {
        return (ITrustedWebActivityCallback)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      Object localObject = ITrustedWebActivityCallback.k;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface((String)localObject);
      }
      if (paramInt1 == 1598968902)
      {
        paramParcel2.writeString((String)localObject);
        return true;
      }
      if (paramInt1 != 2) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel1.readString();
      localObject = Bundle.CREATOR;
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = ((Parcelable.Creator)localObject).createFromParcel(paramParcel1);
      } else {
        paramParcel1 = null;
      }
      paramParcel1 = (Bundle)paramParcel1;
      I();
      paramParcel2.writeNoException();
      return true;
    }
    
    public static final class a
      implements ITrustedWebActivityCallback
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
 * Qualified Name:     android.support.customtabs.trusted.ITrustedWebActivityCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */