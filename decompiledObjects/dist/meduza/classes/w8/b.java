package w8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b
  implements Parcelable.Creator<a>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = n6.b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    Object localObject1 = str2;
    Object localObject2 = localObject1;
    int j = 0;
    long l = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        n6.b.t(k, paramParcel);
        break;
      case '\006': 
        localObject2 = (Uri)n6.b.e(paramParcel, k, Uri.CREATOR);
        break;
      case '\005': 
        localObject1 = n6.b.b(k, paramParcel);
        break;
      case '\004': 
        l = n6.b.q(k, paramParcel);
        break;
      case '\003': 
        j = n6.b.o(k, paramParcel);
        break;
      case '\002': 
        str2 = n6.b.f(k, paramParcel);
        break;
      case '\001': 
        str1 = n6.b.f(k, paramParcel);
      }
    }
    n6.b.j(i, paramParcel);
    return new a(str1, str2, j, l, (Bundle)localObject1, (Uri)localObject2);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new a[paramInt];
  }
}

/* Location:
 * Qualified Name:     w8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */