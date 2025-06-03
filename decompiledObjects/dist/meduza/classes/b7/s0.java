package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class s0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    y localy = null;
    Object localObject1 = localy;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    Object localObject7 = localObject6;
    Object localObject8 = localObject7;
    Object localObject9 = localObject8;
    Object localObject10 = localObject9;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\f': 
        localObject10 = (d)b.e(paramParcel, j, d.CREATOR);
        break;
      case '\013': 
        localObject9 = b.f(j, paramParcel);
        break;
      case '\n': 
        localObject8 = (d0)b.e(paramParcel, j, d0.CREATOR);
        break;
      case '\t': 
        localObject7 = b.p(j, paramParcel);
        break;
      case '\b': 
        localObject6 = (k)b.e(paramParcel, j, k.CREATOR);
        break;
      case '\007': 
        localObject5 = b.i(paramParcel, j, v.CREATOR);
        break;
      case '\006': 
        localObject4 = b.m(j, paramParcel);
        break;
      case '\005': 
        localObject3 = b.i(paramParcel, j, w.CREATOR);
        break;
      case '\004': 
        localObject2 = b.c(j, paramParcel);
        break;
      case '\003': 
        localObject1 = (a0)b.e(paramParcel, j, a0.CREATOR);
        break;
      case '\002': 
        localy = (y)b.e(paramParcel, j, y.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new u(localy, (a0)localObject1, (byte[])localObject2, (ArrayList)localObject3, (Double)localObject4, (ArrayList)localObject5, (k)localObject6, (Integer)localObject7, (d0)localObject8, (String)localObject9, (d)localObject10);
  }
}

/* Location:
 * Qualified Name:     b7.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */