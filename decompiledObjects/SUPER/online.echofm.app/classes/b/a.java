package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract interface a
  extends IInterface
{
  public static final String a = "android$support$v4$os$IResultReceiver".replace('$', '.');
  
  public abstract void T0(int paramInt, Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements a
  {
    public a()
    {
      attachInterface(this, a.a);
    }
    
    public static a n(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(a.a);
      if ((localIInterface != null) && ((localIInterface instanceof a))) {
        return (a)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str = a.a;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface(str);
      }
      if (paramInt1 != 1598968902)
      {
        if (paramInt1 != 1) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        T0(paramParcel1.readInt(), (Bundle)a.b.a(paramParcel1, Bundle.CREATOR));
        return true;
      }
      paramParcel2.writeString(str);
      return true;
    }
    
    public static class a
      implements a
    {
      public IBinder b;
      
      public a(IBinder paramIBinder)
      {
        b = paramIBinder;
      }
      
      public void T0(int paramInt, Bundle paramBundle)
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken(a.a);
          localParcel.writeInt(paramInt);
          a.b.b(localParcel, paramBundle, 0);
          b.transact(1, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
      }
      
      public IBinder asBinder()
      {
        return b;
      }
    }
  }
  
  public static abstract class b
  {
    public static Object c(Parcel paramParcel, Parcelable.Creator paramCreator)
    {
      if (paramParcel.readInt() != 0) {
        return paramCreator.createFromParcel(paramParcel);
      }
      return null;
    }
    
    public static void d(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
    {
      if (paramParcelable != null)
      {
        paramParcel.writeInt(1);
        paramParcelable.writeToParcel(paramParcel, paramInt);
      }
      else
      {
        paramParcel.writeInt(0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */