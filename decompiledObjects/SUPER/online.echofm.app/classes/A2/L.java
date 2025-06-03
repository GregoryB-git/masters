package A2;

import M2.b;
import M2.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public abstract class L
  extends b
  implements j
{
  public L()
  {
    super("com.google.android.gms.common.internal.IGmsCallbacks");
  }
  
  public final boolean n(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1;
    Object localObject2;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 2)
      {
        if (paramInt1 != 3) {
          return false;
        }
        paramInt1 = paramParcel1.readInt();
        localObject1 = paramParcel1.readStrongBinder();
        localObject2 = (a0)c.a(paramParcel1, a0.CREATOR);
        c.b(paramParcel1);
        F0(paramInt1, (IBinder)localObject1, (a0)localObject2);
      }
      else
      {
        paramInt1 = paramParcel1.readInt();
        localObject2 = (Bundle)c.a(paramParcel1, Bundle.CREATOR);
        c.b(paramParcel1);
        q0(paramInt1, (Bundle)localObject2);
      }
    }
    else
    {
      paramInt1 = paramParcel1.readInt();
      localObject2 = paramParcel1.readStrongBinder();
      localObject1 = (Bundle)c.a(paramParcel1, Bundle.CREATOR);
      c.b(paramParcel1);
      W0(paramInt1, (IBinder)localObject2, (Bundle)localObject1);
    }
    paramParcel2.writeNoException();
    return true;
  }
}

/* Location:
 * Qualified Name:     A2.L
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */