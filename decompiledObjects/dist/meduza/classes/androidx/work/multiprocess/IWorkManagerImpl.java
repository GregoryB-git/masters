package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface IWorkManagerImpl
  extends IInterface
{
  public static final String s = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', '.');
  
  public abstract void K();
  
  public abstract void O1();
  
  public abstract void Q();
  
  public abstract void T0();
  
  public abstract void W();
  
  public abstract void b1();
  
  public abstract void f2();
  
  public abstract void m0();
  
  public abstract void n1();
  
  public abstract void w1();
  
  public static abstract class Stub
    extends Binder
    implements IWorkManagerImpl
  {
    public Stub()
    {
      attachInterface(this, IWorkManagerImpl.s);
    }
    
    public static IWorkManagerImpl asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(IWorkManagerImpl.s);
      if ((localIInterface != null) && ((localIInterface instanceof IWorkManagerImpl))) {
        return (IWorkManagerImpl)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str = IWorkManagerImpl.s;
      if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
        paramParcel1.enforceInterface(str);
      }
      if (paramInt1 == 1598968902)
      {
        paramParcel2.writeString(str);
        return true;
      }
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 10: 
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        w1();
        break;
      case 9: 
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        W();
        break;
      case 8: 
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        T0();
        break;
      case 7: 
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        n1();
        break;
      case 6: 
        paramParcel1.readString();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        K();
        break;
      case 5: 
        paramParcel1.readString();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        Q();
        break;
      case 4: 
        paramParcel1.readString();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        f2();
        break;
      case 3: 
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        O1();
        break;
      case 2: 
        paramParcel1.readString();
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        b1();
        break;
      case 1: 
        paramParcel1.createByteArray();
        IWorkManagerImplCallback.Stub.asInterface(paramParcel1.readStrongBinder());
        m0();
      }
      return true;
    }
    
    public static final class a
      implements IWorkManagerImpl
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
 * Qualified Name:     androidx.work.multiprocess.IWorkManagerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */