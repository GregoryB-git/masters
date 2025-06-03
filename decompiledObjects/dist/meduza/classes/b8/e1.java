package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class e1
  implements Parcelable.Creator<c1>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    Object localObject1 = str3;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\007': 
        localObject4 = b.f(j, paramParcel);
        break;
      case '\006': 
        localObject3 = b.f(j, paramParcel);
        break;
      case '\005': 
        localObject2 = b.f(j, paramParcel);
        break;
      case '\004': 
        localObject1 = (com.google.android.gms.internal.firebase_auth_api.zzaic)b.e(paramParcel, j, com.google.android.gms.internal.firebase_auth_api.zzaic.CREATOR);
        break;
      case '\003': 
        str3 = b.f(j, paramParcel);
        break;
      case '\002': 
        str2 = b.f(j, paramParcel);
        break;
      case '\001': 
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new c1(str1, str2, str3, (com.google.android.gms.internal.firebase-auth-api.zzaic)localObject1, (String)localObject2, (String)localObject3, (String)localObject4);
  }
}

/* Location:
 * Qualified Name:     b8.e1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */