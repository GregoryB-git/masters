package d6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b7.t;
import n6.b;

public final class c0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    Object localObject1 = str4;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\t': 
        localObject5 = (t)b.e(paramParcel, j, t.CREATOR);
        break;
      case '\b': 
        localObject4 = b.f(j, paramParcel);
        break;
      case '\007': 
        localObject3 = b.f(j, paramParcel);
        break;
      case '\006': 
        localObject2 = b.f(j, paramParcel);
        break;
      case '\005': 
        localObject1 = (Uri)b.e(paramParcel, j, Uri.CREATOR);
        break;
      case '\004': 
        str4 = b.f(j, paramParcel);
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
    return new k(str1, str2, str3, str4, (Uri)localObject1, (String)localObject2, (String)localObject3, (String)localObject4, (t)localObject5);
  }
}

/* Location:
 * Qualified Name:     d6.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */