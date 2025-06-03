package e7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class i
  implements Parcelable.Creator<f>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    long l1 = 0L;
    long l2 = l1;
    long l3 = l2;
    String str1 = null;
    String str2 = str1;
    Object localObject1 = str2;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    boolean bool = false;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\f': 
        localObject5 = (f0)b.e(paramParcel, j, f0.CREATOR);
        break;
      case '\013': 
        l3 = b.q(j, paramParcel);
        break;
      case '\n': 
        localObject4 = (f0)b.e(paramParcel, j, f0.CREATOR);
        break;
      case '\t': 
        l2 = b.q(j, paramParcel);
        break;
      case '\b': 
        localObject3 = (f0)b.e(paramParcel, j, f0.CREATOR);
        break;
      case '\007': 
        localObject2 = b.f(j, paramParcel);
        break;
      case '\006': 
        bool = b.k(j, paramParcel);
        break;
      case '\005': 
        l1 = b.q(j, paramParcel);
        break;
      case '\004': 
        localObject1 = (q6)b.e(paramParcel, j, q6.CREATOR);
        break;
      case '\003': 
        str2 = b.f(j, paramParcel);
        break;
      case '\002': 
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new f(str1, str2, (q6)localObject1, l1, bool, (String)localObject2, (f0)localObject3, l2, (f0)localObject4, l3, (f0)localObject5);
  }
}

/* Location:
 * Qualified Name:     e7.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */