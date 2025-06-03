package z5;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class g
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    int j = 0;
    String str = null;
    Object localObject = str;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      int n = (char)m;
      if (n != 1)
      {
        if (n != 2)
        {
          if (n != 3)
          {
            if (n != 4) {
              n6.b.t(m, paramParcel);
            } else {
              localObject = (Account)n6.b.e(paramParcel, m, Account.CREATOR);
            }
          }
          else {
            str = n6.b.f(m, paramParcel);
          }
        }
        else {
          k = n6.b.o(m, paramParcel);
        }
      }
      else {
        j = n6.b.o(m, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new b(j, k, str, (Account)localObject);
  }
}

/* Location:
 * Qualified Name:     z5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */