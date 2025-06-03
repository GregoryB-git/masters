package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IUnusedAppRestrictionsBackportCallback$Stub
  extends Binder
  implements IUnusedAppRestrictionsBackportCallback
{
  public IUnusedAppRestrictionsBackportCallback$Stub()
  {
    attachInterface(this, IUnusedAppRestrictionsBackportCallback.p);
  }
  
  public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.p);
    if ((localIInterface != null) && ((localIInterface instanceof IUnusedAppRestrictionsBackportCallback))) {
      return (IUnusedAppRestrictionsBackportCallback)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = IUnusedAppRestrictionsBackportCallback.p;
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
    paramParcel1.readInt();
    o0();
    return true;
  }
  
  public static final class a
    implements IUnusedAppRestrictionsBackportCallback
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

/* Location:
 * Qualified Name:     androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */