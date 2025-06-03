package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import p.q;
import p.r;
import p.s;
import p.t;

public abstract class IEngagementSignalsCallback$Stub
  extends Binder
  implements IEngagementSignalsCallback
{
  public IEngagementSignalsCallback$Stub()
  {
    attachInterface(this, IEngagementSignalsCallback.i);
  }
  
  public static IEngagementSignalsCallback asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface(IEngagementSignalsCallback.i);
    if ((localIInterface != null) && ((localIInterface instanceof IEngagementSignalsCallback))) {
      return (IEngagementSignalsCallback)localIInterface;
    }
    return new a(paramIBinder);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = IEngagementSignalsCallback.i;
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface((String)localObject1);
    }
    if (paramInt1 == 1598968902)
    {
      paramParcel2.writeString((String)localObject1);
      return true;
    }
    boolean bool1 = false;
    boolean bool2 = false;
    Parcelable.Creator localCreator = null;
    Object localObject2 = null;
    localObject1 = null;
    if (paramInt1 != 2)
    {
      if (paramInt1 != 3)
      {
        if (paramInt1 != 4) {
          return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
        }
        if (paramParcel1.readInt() != 0) {
          bool2 = true;
        }
        localCreator = Bundle.CREATOR;
        paramParcel2 = (Parcel)localObject1;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = localCreator.createFromParcel(paramParcel1);
        }
        paramParcel1 = (Bundle)paramParcel2;
        paramParcel2 = (t)this;
        a.post(new r(b, bool2, paramParcel1));
      }
      else
      {
        paramInt1 = paramParcel1.readInt();
        localObject1 = Bundle.CREATOR;
        paramParcel2 = localCreator;
        if (paramParcel1.readInt() != 0) {
          paramParcel2 = ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
        }
        paramParcel1 = (Bundle)paramParcel2;
        paramParcel2 = (t)this;
        a.post(new s(b, paramInt1, paramParcel1, 0));
      }
    }
    else
    {
      bool2 = bool1;
      if (paramParcel1.readInt() != 0) {
        bool2 = true;
      }
      localObject1 = Bundle.CREATOR;
      paramParcel2 = (Parcel)localObject2;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = ((Parcelable.Creator)localObject1).createFromParcel(paramParcel1);
      }
      paramParcel1 = (Bundle)paramParcel2;
      paramParcel2 = (t)this;
      a.post(new q(b, bool2, paramParcel1));
    }
    return true;
  }
  
  public static final class a
    implements IEngagementSignalsCallback
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
 * Qualified Name:     android.support.customtabs.IEngagementSignalsCallback.Stub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */