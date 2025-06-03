package c7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

public final class h
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    String str = null;
    byte[] arrayOfByte = null;
    int j = 0;
    Object localObject = arrayOfByte;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      int m = (char)k;
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m != 4) {
              n6.b.t(k, paramParcel);
            } else {
              localObject = n6.b.i(paramParcel, k, Transport.CREATOR);
            }
          }
          else {
            str = n6.b.f(k, paramParcel);
          }
        }
        else {
          arrayOfByte = n6.b.c(k, paramParcel);
        }
      }
      else {
        j = n6.b.o(k, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(j, str, (ArrayList)localObject, arrayOfByte);
  }
}

/* Location:
 * Qualified Name:     c7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */