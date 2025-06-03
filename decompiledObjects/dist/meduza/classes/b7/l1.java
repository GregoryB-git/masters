package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class l1
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    r localr = null;
    Object localObject1 = localr;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    Object localObject7 = localObject6;
    Object localObject8 = localObject7;
    Object localObject9 = localObject8;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\013': 
        localObject9 = (q0)b.e(paramParcel, j, q0.CREATOR);
        break;
      case '\n': 
        localObject8 = (s)b.e(paramParcel, j, s.CREATOR);
        break;
      case '\t': 
        localObject7 = (o0)b.e(paramParcel, j, o0.CREATOR);
        break;
      case '\b': 
        localObject6 = (c2)b.e(paramParcel, j, c2.CREATOR);
        break;
      case '\007': 
        localObject5 = (l0)b.e(paramParcel, j, l0.CREATOR);
        break;
      case '\006': 
        localObject4 = (j0)b.e(paramParcel, j, j0.CREATOR);
        break;
      case '\005': 
        localObject3 = (g2)b.e(paramParcel, j, g2.CREATOR);
        break;
      case '\004': 
        localObject2 = (e0)b.e(paramParcel, j, e0.CREATOR);
        break;
      case '\003': 
        localObject1 = (a2)b.e(paramParcel, j, a2.CREATOR);
        break;
      case '\002': 
        localr = (r)b.e(paramParcel, j, r.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new d(localr, (a2)localObject1, (e0)localObject2, (g2)localObject3, (j0)localObject4, (l0)localObject5, (c2)localObject6, (o0)localObject7, (s)localObject8, (q0)localObject9);
  }
}

/* Location:
 * Qualified Name:     b7.l1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */