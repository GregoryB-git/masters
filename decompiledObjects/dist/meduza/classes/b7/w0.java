package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class w0
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    byte[] arrayOfByte = null;
    Object localObject1 = arrayOfByte;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    Object localObject4 = localObject3;
    Object localObject5 = localObject4;
    Object localObject6 = localObject5;
    Object localObject7 = localObject6;
    Object localObject8 = localObject7;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\n': 
        localObject8 = b.r(j, paramParcel);
        break;
      case '\t': 
        localObject7 = (d)b.e(paramParcel, j, d.CREATOR);
        break;
      case '\b': 
        localObject6 = b.f(j, paramParcel);
        break;
      case '\007': 
        localObject5 = (d0)b.e(paramParcel, j, d0.CREATOR);
        break;
      case '\006': 
        localObject4 = b.p(j, paramParcel);
        break;
      case '\005': 
        localObject3 = b.i(paramParcel, j, v.CREATOR);
        break;
      case '\004': 
        localObject2 = b.f(j, paramParcel);
        break;
      case '\003': 
        localObject1 = b.m(j, paramParcel);
        break;
      case '\002': 
        arrayOfByte = b.c(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new x(arrayOfByte, (Double)localObject1, (String)localObject2, (ArrayList)localObject3, (Integer)localObject4, (d0)localObject5, (String)localObject6, (d)localObject7, (Long)localObject8);
  }
}

/* Location:
 * Qualified Name:     b7.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */