package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import n6.b;

public final class u0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    byte[] arrayOfByte = null;
    Object localObject = arrayOfByte;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4) {
            b.t(j, paramParcel);
          } else {
            localObject = b.i(paramParcel, j, Transport.CREATOR);
          }
        }
        else {
          arrayOfByte = b.c(j, paramParcel);
        }
      }
      else {
        str = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new v(str, arrayOfByte, (ArrayList)localObject);
  }
}

/* Location:
 * Qualified Name:     b7.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */