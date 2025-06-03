package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class t0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    String str1 = null;
    String str2 = str1;
    Object localObject1 = str2;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\b': 
        localObject6 = b.f(j, paramParcel);
        break;
      case '\007': 
        localObject5 = (e)b.e(paramParcel, j, e.CREATOR);
        break;
      case '\006': 
        localObject4 = (i)b.e(paramParcel, j, i.CREATOR);
        break;
      case '\005': 
        localObject3 = (g)b.e(paramParcel, j, g.CREATOR);
        break;
      case '\004': 
        localObject2 = (h)b.e(paramParcel, j, h.CREATOR);
        break;
      case '\003': 
        localObject1 = b.c(j, paramParcel);
        break;
      case '\002': 
        str2 = b.f(j, paramParcel);
        break;
      case '\001': 
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new t(str1, str2, (byte[])localObject1, (h)localObject2, (g)localObject3, (i)localObject4, (e)localObject5, (String)localObject6);
  }
}

/* Location:
 * Qualified Name:     b7.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */