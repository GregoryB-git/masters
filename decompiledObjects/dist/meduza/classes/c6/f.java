package c6;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import n6.b;

public final class f
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = localArrayList1;
    ArrayList localArrayList3 = localArrayList2;
    ArrayList localArrayList4 = localArrayList3;
    ArrayList localArrayList5 = localArrayList4;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch ((char)k)
      {
      default: 
        b.t(k, paramParcel);
        break;
      case '\006': 
        localArrayList5 = b.g(k, paramParcel);
        break;
      case '\005': 
        localArrayList4 = b.g(k, paramParcel);
        break;
      case '\004': 
        localArrayList3 = b.g(k, paramParcel);
        break;
      case '\003': 
        localArrayList2 = b.g(k, paramParcel);
        break;
      case '\002': 
        localArrayList1 = b.g(k, paramParcel);
        break;
      case '\001': 
        j = b.o(k, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new e(j, localArrayList1, localArrayList2, localArrayList3, localArrayList4, localArrayList5);
  }
}

/* Location:
 * Qualified Name:     c6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */