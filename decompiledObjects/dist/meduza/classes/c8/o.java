package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b8.c1;
import b8.h0;
import b8.l0;
import java.util.ArrayList;
import n6.b;

public final class o
  implements Parcelable.Creator<m>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    ArrayList localArrayList = null;
    Object localObject1 = localArrayList;
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
      case '\006': 
        localObject5 = b.i(paramParcel, j, l0.CREATOR);
        break;
      case '\005': 
        localObject4 = (i)b.e(paramParcel, j, i.CREATOR);
        break;
      case '\004': 
        localObject3 = (c1)b.e(paramParcel, j, c1.CREATOR);
        break;
      case '\003': 
        localObject2 = b.f(j, paramParcel);
        break;
      case '\002': 
        localObject1 = (n)b.e(paramParcel, j, n.CREATOR);
        break;
      case '\001': 
        localArrayList = b.i(paramParcel, j, h0.CREATOR);
      }
    }
    b.j(i, paramParcel);
    return new m(localArrayList, (n)localObject1, (String)localObject2, (c1)localObject3, (i)localObject4, (ArrayList)localObject5);
  }
}

/* Location:
 * Qualified Name:     c8.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */