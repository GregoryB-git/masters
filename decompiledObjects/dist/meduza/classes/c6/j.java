package c6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import f;
import java.util.HashSet;
import n6.b;
import n6.b.a;

public final class j
  implements Parcelable.Creator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    String str = null;
    Object localObject1 = str;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    int k = j;
    while (paramParcel.dataPosition() < i)
    {
      int m = paramParcel.readInt();
      switch ((char)m)
      {
      default: 
        b.t(m, paramParcel);
        break;
      case '\006': 
        localObject3 = (a)b.e(paramParcel, m, a.CREATOR);
        m = 6;
        break;
      case '\005': 
        localObject2 = (PendingIntent)b.e(paramParcel, m, PendingIntent.CREATOR);
        m = 5;
        break;
      case '\004': 
        localObject1 = b.c(m, paramParcel);
        m = 4;
        break;
      case '\003': 
        j = b.o(m, paramParcel);
        m = 3;
        break;
      case '\002': 
        str = b.f(m, paramParcel);
        m = 2;
        break;
      case '\001': 
        k = b.o(m, paramParcel);
        m = 1;
        localHashSet.add(Integer.valueOf(m));
      }
    }
    if (paramParcel.dataPosition() == i) {
      return new i(localHashSet, k, str, j, (byte[])localObject1, (PendingIntent)localObject2, (a)localObject3);
    }
    throw new b.a(f.h("Overread allowed size end=", i), paramParcel);
  }
}

/* Location:
 * Qualified Name:     c6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */