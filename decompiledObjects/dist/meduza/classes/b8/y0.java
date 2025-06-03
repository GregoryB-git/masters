package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class y0
  implements Parcelable.Creator<l0>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    Object localObject = str2;
    long l = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      int k = (char)j;
      if (k != 1)
      {
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4) {
              b.t(j, paramParcel);
            } else {
              localObject = (com.google.android.gms.internal.firebase_auth_api.zzaia)b.e(paramParcel, j, com.google.android.gms.internal.firebase_auth_api.zzaia.CREATOR);
            }
          }
          else {
            l = b.q(j, paramParcel);
          }
        }
        else {
          str2 = b.f(j, paramParcel);
        }
      }
      else {
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new l0(str1, str2, l, (com.google.android.gms.internal.firebase-auth-api.zzaia)localObject);
  }
}

/* Location:
 * Qualified Name:     b8.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */