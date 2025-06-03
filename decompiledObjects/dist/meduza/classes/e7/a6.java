package e7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class a6
  implements Parcelable.Creator<b6>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l1 = 0L;
    long l2 = l1;
    byte[] arrayOfByte = null;
    Object localObject1 = arrayOfByte;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        b.t(k, paramParcel);
        break;
      case '\007': 
        localObject3 = b.f(k, paramParcel);
        break;
      case '\006': 
        l2 = b.q(k, paramParcel);
        break;
      case '\005': 
        j = b.o(k, paramParcel);
        break;
      case '\004': 
        localObject2 = b.b(k, paramParcel);
        break;
      case '\003': 
        localObject1 = b.f(k, paramParcel);
        break;
      case '\002': 
        arrayOfByte = b.c(k, paramParcel);
        break;
      case '\001': 
        l1 = b.q(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new b6(l1, arrayOfByte, (String)localObject1, (Bundle)localObject2, j, l2, (String)localObject3);
  }
}

/* Location:
 * Qualified Name:     e7.a6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */