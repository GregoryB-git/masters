package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface IListenableWorkerImpl
  extends IInterface
{
  public static final String r = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', '.');
  
  public abstract void N2();
  
  public abstract void j1();
  
  public static abstract class Stub
    extends Binder
    implements IListenableWorkerImpl
  {
    public Stub()
    {
      attachInterface(this, IListenableWorkerImpl.r);
    }
    
    public static IListenableWorkerImpl asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(IListenableWorkerImpl.r);
      if ((localIInterface != null) && ((localIInterface instanceof IListenableWorkerImpl))) {
        return (IListenableWorkerImpl)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str = IListenableWorkerImpl.r;
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
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        N2();
      }
      else
      {
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        j1();
      }
      return true;
    }
    
    public static final class a
      implements IListenableWorkerImpl
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
 * Qualified Name:     androidx.work.multiprocess.IListenableWorkerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */