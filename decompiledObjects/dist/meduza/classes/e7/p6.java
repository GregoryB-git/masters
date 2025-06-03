package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class p6
  implements Parcelable.Creator<q6>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str = null;
    Object localObject1 = str;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    int j = 0;
    long l = 0L;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        b.t(k, paramParcel);
        break;
      case '\b': 
        localObject5 = b.m(k, paramParcel);
        break;
      case '\007': 
        localObject4 = b.f(k, paramParcel);
        break;
      case '\006': 
        localObject3 = b.f(k, paramParcel);
        break;
      case '\005': 
        k = b.s(k, paramParcel);
        if (k == 0)
        {
          localObject2 = null;
        }
        else
        {
          b.v(paramParcel, k, 4);
          localObject2 = Float.valueOf(paramParcel.readFloat());
        }
        break;
      case '\004': 
        localObject1 = b.r(k, paramParcel);
        break;
      case '\003': 
        l = b.q(k, paramParcel);
        break;
      case '\002': 
        str = b.f(k, paramParcel);
        break;
      case '\001': 
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new q6(j, str, l, (Long)localObject1, (Float)localObject2, (String)localObject3, (String)localObject4, (Double)localObject5);
  }
}

/* Location:
 * Qualified Name:     e7.p6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */