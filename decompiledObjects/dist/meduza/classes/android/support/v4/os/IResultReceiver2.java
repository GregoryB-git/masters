package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract interface IResultReceiver2
  extends IInterface
{
  public static final String n = "android$support$v4$os$IResultReceiver2".replace('$', '.');
  
  public abstract void Q1();
  
  public static abstract class Stub
    extends Binder
    implements IResultReceiver2
  {
    public Stub()
    {
      attachInterface(this, IResultReceiver2.n);
    }
    
    public static IResultReceiver2 asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(IResultReceiver2.n);
      if ((localIInterface != null) && ((localIInterface instanceof IResultReceiver2))) {
        return (IResultReceiver2)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str = IResultReceiver2.n;
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
      paramParcel1.readInt();
      paramParcel2 = Bundle.CREATOR;
      if (paramParcel1.readInt() != 0) {
        paramParcel1 = paramParcel2.createFromParcel(paramParcel1);
      } else {
        paramParcel1 = null;
      }
      paramParcel1 = (Bundle)paramParcel1;
      Q1();
      return true;
    }
    
    public static final class a
      implements IResultReceiver2
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
 * Qualified Name:     android.support.v4.os.IResultReceiver2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */