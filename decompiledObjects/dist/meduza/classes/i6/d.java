package i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class d
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    Intent localIntent = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\001') {
        b.t(j, paramParcel);
      } else {
        localIntent = (Intent)b.e(paramParcel, j, Intent.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new a(localIntent);
  }
}

/* Location:
 * Qualified Name:     i6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */