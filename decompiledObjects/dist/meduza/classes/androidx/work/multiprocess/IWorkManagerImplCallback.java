package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface IWorkManagerImplCallback
  extends IInterface
{
  public static final String t = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', '.');
  
  public abstract void i();
  
  public abstract void k();
  
  public static abstract class Stub
    extends Binder
    implements IWorkManagerImplCallback
  {
    public Stub()
    {
      attachInterface(this, IWorkManagerImplCallback.t);
    }
    
    public static IWorkManagerImplCallback asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(IWorkManagerImplCallback.t);
      if ((localIInterface != null) && ((localIInterface instanceof IWorkManagerImplCallback))) {
        return (IWorkManagerImplCallback)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str = IWorkManagerImplCallback.t;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface(str);
      }
      if (paramInt1 == 1598968902)
      {
        paramParcel2.writeString(str);
        return true;
      }
      if (paramInt1 != 1)
      {
        if (paramInt1 != 2) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        paramParcel1.readString();
        i();
      }
      else
      {
        paramParcel1.createByteArray();
        k();
      }
      return true;
    }
    
    public static final class a
      implements IWorkManagerImplCallback
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
 * Qualified Name:     androidx.work.multiprocess.IWorkManagerImplCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */