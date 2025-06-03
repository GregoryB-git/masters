package m7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a
  implements IInterface
{
  public final IBinder a;
  public final String b;
  
  public a(IBinder paramIBinder, String paramString)
  {
    a = paramIBinder;
    b = paramString;
  }
  
  public final IBinder asBinder()
  {
    return a;
  }
  
  public final void g(int paramInt, Parcel paramParcel)
  {
    try
    {
      a.transact(paramInt, paramParcel, null, 1);
      return;
    }
    finally
    {
      paramParcel.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     m7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */