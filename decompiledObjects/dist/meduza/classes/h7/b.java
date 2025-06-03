package h7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.common.api.Status;
import k6.j;
import n6.a;

public final class b
  extends a
  implements j
{
  public static final Parcelable.Creator<b> CREATOR = new c();
  public final int a;
  public int b;
  public Intent c;
  
  public b()
  {
    this(2, 0, null);
  }
  
  public b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramIntent;
  }
  
  public final Status getStatus()
  {
    if (b == 0) {
      return Status.e;
    }
    return Status.q;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = a;
    int j = z.J(20293, paramParcel);
    z.z(paramParcel, 1, i);
    z.z(paramParcel, 2, b);
    z.E(paramParcel, 3, c, paramInt, false);
    z.L(j, paramParcel);
  }
}

/* Location:
 * Qualified Name:     h7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */