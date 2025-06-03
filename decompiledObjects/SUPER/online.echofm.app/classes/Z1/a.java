package Z1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface a
  extends IInterface
{
  public abstract int O(Bundle paramBundle);
  
  public static abstract class a
    extends Binder
    implements a
  {
    public static a n(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
      if ((localIInterface != null) && ((localIInterface instanceof a))) {
        return (a)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public static a o()
    {
      return a.c;
    }
    
    public static class a
      implements a
    {
      public static a c;
      public IBinder b;
      
      public a(IBinder paramIBinder)
      {
        b = paramIBinder;
      }
      
      public int O(Bundle paramBundle)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
        }
        finally
        {
          break label106;
        }
        localParcel1.writeInt(0);
        if ((!b.transact(1, localParcel1, localParcel2, 0)) && (a.a.o() != null))
        {
          i = a.a.o().O(paramBundle);
          localParcel2.recycle();
          localParcel1.recycle();
          return i;
        }
        localParcel2.readException();
        int i = localParcel2.readInt();
        localParcel2.recycle();
        localParcel1.recycle();
        return i;
        label106:
        localParcel2.recycle();
        localParcel1.recycle();
        throw paramBundle;
      }
      
      public IBinder asBinder()
      {
        return b;
      }
    }
  }
}

/* Location:
 * Qualified Name:     Z1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */