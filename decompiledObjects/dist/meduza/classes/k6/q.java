package k6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import n6.b;

public final class q
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2) {
          b.t(k, paramParcel);
        } else {
          str = b.f(k, paramParcel);
        }
      }
      else {
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new Scope(j, str);
  }
}

/* Location:
 * Qualified Name:     k6.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */