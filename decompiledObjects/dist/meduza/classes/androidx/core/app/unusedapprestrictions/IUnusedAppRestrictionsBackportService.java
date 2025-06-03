package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface IUnusedAppRestrictionsBackportService
  extends IInterface
{
  public static final String q = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');
  
  public abstract void W0();
  
  public static abstract class Stub
    extends Binder
    implements IUnusedAppRestrictionsBackportService
  {
    public Stub()
    {
      attachInterface(this, IUnusedAppRestrictionsBackportService.q);
    }
    
    public static IUnusedAppRestrictionsBackportService asInterface(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.q);
      if ((localIInterface != null) && ((localIInterface instanceof IUnusedAppRestrictionsBackportService))) {
        return (IUnusedAppRestrictionsBackportService)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public final IBinder asBinder()
    {
      return this;
    }
    
    public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      String str = IUnusedAppRestrictionsBackportService.q;
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
      IUnusedAppRestrictionsBackportCallback.Stub.asInterface(paramParcel1.readStrongBinder());
      W0();
      return true;
    }
    
    public static final class a
      implements IUnusedAppRestrictionsBackportService
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
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */