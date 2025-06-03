package b7;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class w1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    x localx = null;
    Uri localUri = null;
    Object localObject = localUri;
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
            localObject = b.c(j, paramParcel);
          }
        }
        else {
          localUri = (Uri)b.e(paramParcel, j, Uri.CREATOR);
        }
      }
      else {
        localx = (x)b.e(paramParcel, j, x.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new m(localx, localUri, (byte[])localObject);
  }
}

/* Location:
 * Qualified Name:     b7.w1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */