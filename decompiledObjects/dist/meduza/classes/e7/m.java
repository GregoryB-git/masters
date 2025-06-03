package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class m
  implements Parcelable.Creator<n>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    Bundle localBundle = null;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      if ((char)j != '\001') {
        b.t(j, paramParcel);
      } else {
        localBundle = b.b(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new n(localBundle);
  }
}

/* Location:
 * Qualified Name:     e7.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */