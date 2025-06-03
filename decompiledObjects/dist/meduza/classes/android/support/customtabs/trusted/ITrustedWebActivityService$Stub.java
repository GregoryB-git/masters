package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ITrustedWebActivityService$Stub
  extends Binder
  implements ITrustedWebActivityService
{
  public ITrustedWebActivityService$Stub()
  {
    attachInterface(this, ITrustedWebActivityService.l);
  }
  
  public static ITrustedWebActivityService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface(ITrustedWebActivityService.l);
    if ((localIInterface != null) && ((localIInterface instanceof ITrustedWebActivityService))) {
      return (ITrustedWebActivityService)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject = ITrustedWebActivityService.l;
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface((String)localObject);
    }
    if (paramInt1 == 1598968902)
    {
      paramParcel2.writeString((String)localObject);
      return true;
    }
    switch (paramInt1)
    {
    case 8: 
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 9: 
      paramParcel1.readString();
      localObject = (Bundle)ITrustedWebActivityService.a.a(paramParcel1, Bundle.CREATOR);
      paramParcel1.readStrongBinder();
      paramParcel1 = t();
      break;
    case 7: 
      paramParcel1 = D1();
      break;
    case 6: 
      paramParcel1 = (Bundle)ITrustedWebActivityService.a.a(paramParcel1, Bundle.CREATOR);
      paramParcel1 = B1();
      break;
    case 5: 
      paramParcel1 = c0();
      break;
    case 4: 
      paramInt1 = A1();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      break;
    case 3: 
      paramParcel1 = (Bundle)ITrustedWebActivityService.a.a(paramParcel1, Bundle.CREATOR);
      X0();
      paramParcel2.writeNoException();
      break;
    case 2: 
      paramParcel1 = (Bundle)ITrustedWebActivityService.a.a(paramParcel1, Bundle.CREATOR);
      paramParcel1 = J2();
    }
    paramParcel2.writeNoException();
    ITrustedWebActivityService.a.b(paramParcel2, paramParcel1);
    return true;
  }
  
  public static final class a
    implements ITrustedWebActivityService
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
 * Qualified Name:     android.support.customtabs.trusted.ITrustedWebActivityService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */