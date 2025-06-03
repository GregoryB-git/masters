package f6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.a;

public final class b
  extends a
{
  public static final Parcelable.Creator<b> CREATOR = new d();
  public final int a;
  public final PendingIntent b;
  public final int c;
  public final byte[] d;
  public final int e;
  public final Bundle f;
  
  public b(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    e = paramInt1;
    a = paramInt2;
    c = paramInt3;
    f = paramBundle;
    d = paramArrayOfByte;
    b = paramPendingIntent;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.z(paramParcel, 1, a);
    z.E(paramParcel, 2, b, paramInt, false);
    z.z(paramParcel, 3, c);
    z.v(paramParcel, 4, f, false);
    z.w(paramParcel, 5, d, false);
    z.z(paramParcel, 1000, e);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     f6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */