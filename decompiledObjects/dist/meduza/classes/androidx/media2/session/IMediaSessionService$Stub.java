package androidx.media2.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.versionedparcelable.ParcelImpl;

public abstract class IMediaSessionService$Stub
  extends Binder
  implements IMediaSessionService
{
  public IMediaSessionService$Stub()
  {
    attachInterface(this, "androidx.media2.session.IMediaSessionService");
  }
  
  public static IMediaSessionService asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("androidx.media2.session.IMediaSessionService");
    if ((localIInterface != null) && ((localIInterface instanceof IMediaSessionService))) {
      return (IMediaSessionService)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public static IMediaSessionService getDefaultImpl()
  {
    return a.b;
  }
  
  public static boolean setDefaultImpl(IMediaSessionService paramIMediaSessionService)
  {
    if (a.b == null)
    {
      if (paramIMediaSessionService != null)
      {
        a.b = paramIMediaSessionService;
        return true;
      }
      return false;
    }
    throw new IllegalStateException("setDefaultImpl() called twice");
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    if (paramInt1 != 1)
    {
      if (paramInt1 != 1598968902) {
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      }
      paramParcel2.writeString("androidx.media2.session.IMediaSessionService");
      return true;
    }
    paramParcel1.enforceInterface("androidx.media2.session.IMediaSessionService");
    IMediaController.Stub.asInterface(paramParcel1.readStrongBinder());
    if (paramParcel1.readInt() != 0) {
      paramParcel1 = (ParcelImpl)ParcelImpl.CREATOR.createFromParcel(paramParcel1);
    }
    n();
    return true;
  }
  
  public static final class a
    implements IMediaSessionService
  {
    public static IMediaSessionService b;
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
 * Qualified Name:     androidx.media2.session.IMediaSessionService.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */